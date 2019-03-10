package org.opentaps.base.entities;

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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity OrderPurchasePaymentSummary.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectOrderPurchasePaymentSummarys", query="SELECT OH.WEB_SITE_ID AS \"webSiteId\",OH.PRODUCT_STORE_ID AS \"productStoreId\",OH.ORIGIN_FACILITY_ID AS \"originFacilityId\",OH.TERMINAL_ID AS \"terminalId\",OH.STATUS_ID AS \"statusId\",OPP.PAYMENT_METHOD_TYPE_ID AS \"paymentMethodTypeId\",PMT.DESCRIPTION AS \"description\",OPP.MAX_AMOUNT AS \"maxAmount\",OH.ORDER_ID AS \"orderId\",OH.ORDER_TYPE_ID AS \"orderTypeId\",OH.ORDER_DATE AS \"orderDate\",OH.BILLING_ACCOUNT_ID AS \"billingAccountId\",OPP.STATUS_ID AS \"statusId\" FROM ORDER_HEADER OH INNER JOIN ORDER_PAYMENT_PREFERENCE OPP ON OH.ORDER_ID = OPP.ORDER_ID INNER JOIN PAYMENT_METHOD_TYPE PMT ON OPP.PAYMENT_METHOD_TYPE_ID = PMT.PAYMENT_METHOD_TYPE_ID", resultSetMapping="OrderPurchasePaymentSummaryMapping")
@SqlResultSetMapping(name="OrderPurchasePaymentSummaryMapping", entities={
@EntityResult(entityClass=OrderPurchasePaymentSummary.class, fields = {
@FieldResult(name="webSiteId", column="webSiteId")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="originFacilityId", column="originFacilityId")
,@FieldResult(name="terminalId", column="terminalId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="paymentMethodTypeId", column="paymentMethodTypeId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="maxAmount", column="maxAmount")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="billingAccountId", column="billingAccountId")
,@FieldResult(name="preferenceStatusId", column="preferenceStatusId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class OrderPurchasePaymentSummary extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("webSiteId", "OH.WEB_SITE_ID");
        fields.put("productStoreId", "OH.PRODUCT_STORE_ID");
        fields.put("originFacilityId", "OH.ORIGIN_FACILITY_ID");
        fields.put("terminalId", "OH.TERMINAL_ID");
        fields.put("statusId", "OH.STATUS_ID");
        fields.put("paymentMethodTypeId", "OPP.PAYMENT_METHOD_TYPE_ID");
        fields.put("description", "PMT.DESCRIPTION");
        fields.put("maxAmount", "OPP.MAX_AMOUNT");
        fields.put("orderId", "OH.ORDER_ID");
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("billingAccountId", "OH.BILLING_ACCOUNT_ID");
        fields.put("preferenceStatusId", "OPP.STATUS_ID");
fieldMapColumns.put("OrderPurchasePaymentSummary", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderPurchasePaymentSummary> {
    webSiteId("webSiteId"),
    productStoreId("productStoreId"),
    originFacilityId("originFacilityId"),
    terminalId("terminalId"),
    statusId("statusId"),
    paymentMethodTypeId("paymentMethodTypeId"),
    description("description"),
    maxAmount("maxAmount"),
    orderId("orderId"),
    orderTypeId("orderTypeId"),
    orderDate("orderDate"),
    billingAccountId("billingAccountId"),
    preferenceStatusId("preferenceStatusId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String webSiteId;
    
   private String productStoreId;
    
   private String originFacilityId;
    
   private String terminalId;
    
   private String statusId;
    
   private String paymentMethodTypeId;
    
   private String description;
    
   private BigDecimal maxAmount;
    @Id
   private String orderId;
    
   private String orderTypeId;
    
   private Timestamp orderDate;
    
   private String billingAccountId;
    
   private String preferenceStatusId;

  /**
   * Default constructor.
   */
  public OrderPurchasePaymentSummary() {
      super();
      this.baseEntityName = "OrderPurchasePaymentSummary";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("webSiteId");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("originFacilityId");this.allFieldsNames.add("terminalId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("paymentMethodTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("maxAmount");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("billingAccountId");this.allFieldsNames.add("preferenceStatusId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderPurchasePaymentSummary(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param webSiteId the webSiteId to set
     */
    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
    /**
     * Auto generated value setter.
     * @param originFacilityId the originFacilityId to set
     */
    public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }
    /**
     * Auto generated value setter.
     * @param terminalId the terminalId to set
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethodTypeId the paymentMethodTypeId to set
     */
    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param maxAmount the maxAmount to set
     */
    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderTypeId the orderTypeId to set
     */
    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    /**
     * Auto generated value setter.
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    /**
     * Auto generated value setter.
     * @param billingAccountId the billingAccountId to set
     */
    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
    /**
     * Auto generated value setter.
     * @param preferenceStatusId the preferenceStatusId to set
     */
    public void setPreferenceStatusId(String preferenceStatusId) {
        this.preferenceStatusId = preferenceStatusId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWebSiteId() {
        return this.webSiteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.productStoreId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOriginFacilityId() {
        return this.originFacilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTerminalId() {
        return this.terminalId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentMethodTypeId() {
        return this.paymentMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaxAmount() {
        return this.maxAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBillingAccountId() {
        return this.billingAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPreferenceStatusId() {
        return this.preferenceStatusId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWebSiteId((String) mapValue.get("webSiteId"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setOriginFacilityId((String) mapValue.get("originFacilityId"));
        setTerminalId((String) mapValue.get("terminalId"));
        setStatusId((String) mapValue.get("statusId"));
        setPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        setDescription((String) mapValue.get("description"));
        setMaxAmount(convertToBigDecimal(mapValue.get("maxAmount")));
        setOrderId((String) mapValue.get("orderId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setBillingAccountId((String) mapValue.get("billingAccountId"));
        setPreferenceStatusId((String) mapValue.get("preferenceStatusId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("webSiteId", getWebSiteId());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("originFacilityId", getOriginFacilityId());
        mapValue.put("terminalId", getTerminalId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("paymentMethodTypeId", getPaymentMethodTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("maxAmount", getMaxAmount());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("billingAccountId", getBillingAccountId());
        mapValue.put("preferenceStatusId", getPreferenceStatusId());
        return mapValue;
    }


}