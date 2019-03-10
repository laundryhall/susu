/*
 * Copyright (c) Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.opentaps.tests.crmsfa.orders;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.ofbiz.base.util.GeneralException;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;
import org.opentaps.domain.product.Product;
import org.opentaps.domain.product.ProductRepositoryInterface;
import org.opentaps.tests.OpentapsTestCase;


public class PriceTests extends OpentapsTestCase {

    protected GenericValue DemoSalesManager = null;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        DemoSalesManager = delegator.findByPrimaryKeyCache("UserLogin", UtilMisc.toMap("userLoginId", "DemoSalesManager"));
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        DemoSalesManager = null;
    }

    /**
     * Calculates price adjusted to price rule for GZ-1000 and compare it with expected price.
     *
     * @throws GenericEntityException if an error occurs
     */
    public void testPartyClassPricing() throws GenericEntityException {
        String productId = "GZ-1000";
        GenericValue product = delegator.findByPrimaryKey("Product", UtilMisc.toMap("productId", productId));

        Map<String, Object> callCtxt = new HashMap<String, Object>();
        callCtxt.put("product", product);
        callCtxt.put("partyId", "DemoPrivilegedCust");
        callCtxt.put("productStoreId", "9000");
        callCtxt.put("currencyUomId", "USD");
        callCtxt.put("productPricePurposeId", "PURCHASE");
        callCtxt.put("userLogin", DemoSalesManager);
        Map<String, Object> privilegedCustResult = runAndAssertServiceSuccess("calculateProductPrice", callCtxt);

        BigDecimal price = (BigDecimal) privilegedCustResult.get("price");
        BigDecimal expectedPrice = ((BigDecimal) privilegedCustResult.get("listPrice")).multiply(BigDecimal.valueOf(0.75));
        assertEquals("", expectedPrice, price);
    }

    /**
     * Calculates price adjusted to price rule for GZ-1000 and compare it with expected price.
     * Same as <code>testPartyClassPricing</code> but tests the domain repository method.
     * @throws GeneralException if an error occurs
     */
    public void testPartyClassPricingDomain() throws GeneralException {
        String productId = "GZ-1000";
        ProductRepositoryInterface repository = domainsDirectory.getProductDomain().getProductRepository();
        Product product = repository.getProductById(productId);
        GenericValue product2 = delegator.findByPrimaryKey("Product", UtilMisc.toMap("productId", productId));

        Map<String, Object> callCtxt = new HashMap<String, Object>();
        callCtxt.put("product", product2);
        callCtxt.put("partyId", "DemoPrivilegedCust");
        callCtxt.put("productStoreId", "9000");
        callCtxt.put("currencyUomId", "USD");
        callCtxt.put("productPricePurposeId", "PURCHASE");
        callCtxt.put("userLogin", DemoSalesManager);
        Map<String, Object> privilegedCustResult = runAndAssertServiceSuccess("calculateProductPrice", callCtxt);

        BigDecimal price = repository.getUnitPrice(product, new BigDecimal("1.0"), "USD", "DemoPrivilegedCust");
        BigDecimal expectedPrice = ((BigDecimal) privilegedCustResult.get("listPrice")).multiply(new BigDecimal("0.75"));

        assertEquals("Domain method to get unit price for party returned unexpected price.", expectedPrice, price);
    }
}
