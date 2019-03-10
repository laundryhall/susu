package org.opentaps.base.services;

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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.service.ServiceWrapper;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Duplicate a Product using a new productId.
 * Auto generated base service entity duplicateProduct.
 *
 * Engine: simple
 * Location: component://product/script/org/ofbiz/product/product/ProductServices.xml
 * Invoke: duplicateProduct
 * Defined in: applications/product/servicedef/services.xml
 */
public class DuplicateProductService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "duplicateProduct";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        duplicateAssocs("duplicateAssocs"),
        duplicateAttributes("duplicateAttributes"),
        duplicateCategoryMembers("duplicateCategoryMembers"),
        duplicateContent("duplicateContent"),
        duplicateFeatureAppls("duplicateFeatureAppls"),
        duplicateIDs("duplicateIDs"),
        duplicateInventoryItems("duplicateInventoryItems"),
        duplicatePrices("duplicatePrices"),
        locale("locale"),
        newDescription("newDescription"),
        newInternalName("newInternalName"),
        newLongDescription("newLongDescription"),
        newProductName("newProductName"),
        oldProductId("oldProductId"),
        productId("productId"),
        removeAssocs("removeAssocs"),
        removeAttributes("removeAttributes"),
        removeCategoryMembers("removeCategoryMembers"),
        removeContent("removeContent"),
        removeFeatureAppls("removeFeatureAppls"),
        removeIDs("removeIDs"),
        removeInventoryItems("removeInventoryItems"),
        removePrices("removePrices"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>DuplicateProductService</code> instance.
     */
    public DuplicateProductService() {
        super();
    }

    /**
     * Creates a new <code>DuplicateProductService</code> instance.
     * @param user an <code>User</code> value
     */
    public DuplicateProductService(User user) {
        super(user);
    }

    private String inDuplicateAssocs;
    private String inDuplicateAttributes;
    private String inDuplicateCategoryMembers;
    private String inDuplicateContent;
    private String inDuplicateFeatureAppls;
    private String inDuplicateIDs;
    private String inDuplicateInventoryItems;
    private String inDuplicatePrices;
    private Locale inLocale;
    private String inNewDescription;
    private String inNewInternalName;
    private String inNewLongDescription;
    private String inNewProductName;
    private String inOldProductId;
    private String inProductId;
    private String inRemoveAssocs;
    private String inRemoveAttributes;
    private String inRemoveCategoryMembers;
    private String inRemoveContent;
    private String inRemoveFeatureAppls;
    private String inRemoveIDs;
    private String inRemoveInventoryItems;
    private String inRemovePrices;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateAssocs() {
        return this.inDuplicateAssocs;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateAttributes() {
        return this.inDuplicateAttributes;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateCategoryMembers() {
        return this.inDuplicateCategoryMembers;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateContent() {
        return this.inDuplicateContent;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateFeatureAppls() {
        return this.inDuplicateFeatureAppls;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateIDs() {
        return this.inDuplicateIDs;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicateInventoryItems() {
        return this.inDuplicateInventoryItems;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuplicatePrices() {
        return this.inDuplicatePrices;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInNewDescription() {
        return this.inNewDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInNewInternalName() {
        return this.inNewInternalName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInNewLongDescription() {
        return this.inNewLongDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInNewProductName() {
        return this.inNewProductName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInOldProductId() {
        return this.inOldProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductId() {
        return this.inProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveAssocs() {
        return this.inRemoveAssocs;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveAttributes() {
        return this.inRemoveAttributes;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveCategoryMembers() {
        return this.inRemoveCategoryMembers;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveContent() {
        return this.inRemoveContent;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveFeatureAppls() {
        return this.inRemoveFeatureAppls;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveIDs() {
        return this.inRemoveIDs;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveInventoryItems() {
        return this.inRemoveInventoryItems;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemovePrices() {
        return this.inRemovePrices;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateAssocs the inDuplicateAssocs to set
    */
    public void setInDuplicateAssocs(String inDuplicateAssocs) {
        this.inParameters.add("duplicateAssocs");
        this.inDuplicateAssocs = inDuplicateAssocs;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateAttributes the inDuplicateAttributes to set
    */
    public void setInDuplicateAttributes(String inDuplicateAttributes) {
        this.inParameters.add("duplicateAttributes");
        this.inDuplicateAttributes = inDuplicateAttributes;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateCategoryMembers the inDuplicateCategoryMembers to set
    */
    public void setInDuplicateCategoryMembers(String inDuplicateCategoryMembers) {
        this.inParameters.add("duplicateCategoryMembers");
        this.inDuplicateCategoryMembers = inDuplicateCategoryMembers;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateContent the inDuplicateContent to set
    */
    public void setInDuplicateContent(String inDuplicateContent) {
        this.inParameters.add("duplicateContent");
        this.inDuplicateContent = inDuplicateContent;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateFeatureAppls the inDuplicateFeatureAppls to set
    */
    public void setInDuplicateFeatureAppls(String inDuplicateFeatureAppls) {
        this.inParameters.add("duplicateFeatureAppls");
        this.inDuplicateFeatureAppls = inDuplicateFeatureAppls;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateIDs the inDuplicateIDs to set
    */
    public void setInDuplicateIDs(String inDuplicateIDs) {
        this.inParameters.add("duplicateIDs");
        this.inDuplicateIDs = inDuplicateIDs;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicateInventoryItems the inDuplicateInventoryItems to set
    */
    public void setInDuplicateInventoryItems(String inDuplicateInventoryItems) {
        this.inParameters.add("duplicateInventoryItems");
        this.inDuplicateInventoryItems = inDuplicateInventoryItems;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuplicatePrices the inDuplicatePrices to set
    */
    public void setInDuplicatePrices(String inDuplicatePrices) {
        this.inParameters.add("duplicatePrices");
        this.inDuplicatePrices = inDuplicatePrices;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNewDescription the inNewDescription to set
    */
    public void setInNewDescription(String inNewDescription) {
        this.inParameters.add("newDescription");
        this.inNewDescription = inNewDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNewInternalName the inNewInternalName to set
    */
    public void setInNewInternalName(String inNewInternalName) {
        this.inParameters.add("newInternalName");
        this.inNewInternalName = inNewInternalName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNewLongDescription the inNewLongDescription to set
    */
    public void setInNewLongDescription(String inNewLongDescription) {
        this.inParameters.add("newLongDescription");
        this.inNewLongDescription = inNewLongDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNewProductName the inNewProductName to set
    */
    public void setInNewProductName(String inNewProductName) {
        this.inParameters.add("newProductName");
        this.inNewProductName = inNewProductName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOldProductId the inOldProductId to set
    */
    public void setInOldProductId(String inOldProductId) {
        this.inParameters.add("oldProductId");
        this.inOldProductId = inOldProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveAssocs the inRemoveAssocs to set
    */
    public void setInRemoveAssocs(String inRemoveAssocs) {
        this.inParameters.add("removeAssocs");
        this.inRemoveAssocs = inRemoveAssocs;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveAttributes the inRemoveAttributes to set
    */
    public void setInRemoveAttributes(String inRemoveAttributes) {
        this.inParameters.add("removeAttributes");
        this.inRemoveAttributes = inRemoveAttributes;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveCategoryMembers the inRemoveCategoryMembers to set
    */
    public void setInRemoveCategoryMembers(String inRemoveCategoryMembers) {
        this.inParameters.add("removeCategoryMembers");
        this.inRemoveCategoryMembers = inRemoveCategoryMembers;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveContent the inRemoveContent to set
    */
    public void setInRemoveContent(String inRemoveContent) {
        this.inParameters.add("removeContent");
        this.inRemoveContent = inRemoveContent;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveFeatureAppls the inRemoveFeatureAppls to set
    */
    public void setInRemoveFeatureAppls(String inRemoveFeatureAppls) {
        this.inParameters.add("removeFeatureAppls");
        this.inRemoveFeatureAppls = inRemoveFeatureAppls;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveIDs the inRemoveIDs to set
    */
    public void setInRemoveIDs(String inRemoveIDs) {
        this.inParameters.add("removeIDs");
        this.inRemoveIDs = inRemoveIDs;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveInventoryItems the inRemoveInventoryItems to set
    */
    public void setInRemoveInventoryItems(String inRemoveInventoryItems) {
        this.inParameters.add("removeInventoryItems");
        this.inRemoveInventoryItems = inRemoveInventoryItems;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemovePrices the inRemovePrices to set
    */
    public void setInRemovePrices(String inRemovePrices) {
        this.inParameters.add("removePrices");
        this.inRemovePrices = inRemovePrices;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("duplicateAssocs")) mapValue.put("duplicateAssocs", getInDuplicateAssocs());
        if (inParameters.contains("duplicateAttributes")) mapValue.put("duplicateAttributes", getInDuplicateAttributes());
        if (inParameters.contains("duplicateCategoryMembers")) mapValue.put("duplicateCategoryMembers", getInDuplicateCategoryMembers());
        if (inParameters.contains("duplicateContent")) mapValue.put("duplicateContent", getInDuplicateContent());
        if (inParameters.contains("duplicateFeatureAppls")) mapValue.put("duplicateFeatureAppls", getInDuplicateFeatureAppls());
        if (inParameters.contains("duplicateIDs")) mapValue.put("duplicateIDs", getInDuplicateIDs());
        if (inParameters.contains("duplicateInventoryItems")) mapValue.put("duplicateInventoryItems", getInDuplicateInventoryItems());
        if (inParameters.contains("duplicatePrices")) mapValue.put("duplicatePrices", getInDuplicatePrices());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("newDescription")) mapValue.put("newDescription", getInNewDescription());
        if (inParameters.contains("newInternalName")) mapValue.put("newInternalName", getInNewInternalName());
        if (inParameters.contains("newLongDescription")) mapValue.put("newLongDescription", getInNewLongDescription());
        if (inParameters.contains("newProductName")) mapValue.put("newProductName", getInNewProductName());
        if (inParameters.contains("oldProductId")) mapValue.put("oldProductId", getInOldProductId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("removeAssocs")) mapValue.put("removeAssocs", getInRemoveAssocs());
        if (inParameters.contains("removeAttributes")) mapValue.put("removeAttributes", getInRemoveAttributes());
        if (inParameters.contains("removeCategoryMembers")) mapValue.put("removeCategoryMembers", getInRemoveCategoryMembers());
        if (inParameters.contains("removeContent")) mapValue.put("removeContent", getInRemoveContent());
        if (inParameters.contains("removeFeatureAppls")) mapValue.put("removeFeatureAppls", getInRemoveFeatureAppls());
        if (inParameters.contains("removeIDs")) mapValue.put("removeIDs", getInRemoveIDs());
        if (inParameters.contains("removeInventoryItems")) mapValue.put("removeInventoryItems", getInRemoveInventoryItems());
        if (inParameters.contains("removePrices")) mapValue.put("removePrices", getInRemovePrices());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("duplicateAssocs")) setInDuplicateAssocs((String) mapValue.get("duplicateAssocs"));
        if (mapValue.containsKey("duplicateAttributes")) setInDuplicateAttributes((String) mapValue.get("duplicateAttributes"));
        if (mapValue.containsKey("duplicateCategoryMembers")) setInDuplicateCategoryMembers((String) mapValue.get("duplicateCategoryMembers"));
        if (mapValue.containsKey("duplicateContent")) setInDuplicateContent((String) mapValue.get("duplicateContent"));
        if (mapValue.containsKey("duplicateFeatureAppls")) setInDuplicateFeatureAppls((String) mapValue.get("duplicateFeatureAppls"));
        if (mapValue.containsKey("duplicateIDs")) setInDuplicateIDs((String) mapValue.get("duplicateIDs"));
        if (mapValue.containsKey("duplicateInventoryItems")) setInDuplicateInventoryItems((String) mapValue.get("duplicateInventoryItems"));
        if (mapValue.containsKey("duplicatePrices")) setInDuplicatePrices((String) mapValue.get("duplicatePrices"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("newDescription")) setInNewDescription((String) mapValue.get("newDescription"));
        if (mapValue.containsKey("newInternalName")) setInNewInternalName((String) mapValue.get("newInternalName"));
        if (mapValue.containsKey("newLongDescription")) setInNewLongDescription((String) mapValue.get("newLongDescription"));
        if (mapValue.containsKey("newProductName")) setInNewProductName((String) mapValue.get("newProductName"));
        if (mapValue.containsKey("oldProductId")) setInOldProductId((String) mapValue.get("oldProductId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("removeAssocs")) setInRemoveAssocs((String) mapValue.get("removeAssocs"));
        if (mapValue.containsKey("removeAttributes")) setInRemoveAttributes((String) mapValue.get("removeAttributes"));
        if (mapValue.containsKey("removeCategoryMembers")) setInRemoveCategoryMembers((String) mapValue.get("removeCategoryMembers"));
        if (mapValue.containsKey("removeContent")) setInRemoveContent((String) mapValue.get("removeContent"));
        if (mapValue.containsKey("removeFeatureAppls")) setInRemoveFeatureAppls((String) mapValue.get("removeFeatureAppls"));
        if (mapValue.containsKey("removeIDs")) setInRemoveIDs((String) mapValue.get("removeIDs"));
        if (mapValue.containsKey("removeInventoryItems")) setInRemoveInventoryItems((String) mapValue.get("removeInventoryItems"));
        if (mapValue.containsKey("removePrices")) setInRemovePrices((String) mapValue.get("removePrices"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>DuplicateProductService</code> from the input values of the given <code>DuplicateProductService</code>.
     * @param input a <code>DuplicateProductService</code>
     */
    public static DuplicateProductService fromInput(DuplicateProductService input) {
        DuplicateProductService service = new DuplicateProductService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>DuplicateProductService</code> from the output values of the given <code>DuplicateProductService</code>.
     * @param output a <code>DuplicateProductService</code>
     */
    public static DuplicateProductService fromOutput(DuplicateProductService output) {
        DuplicateProductService service = new DuplicateProductService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>DuplicateProductService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static DuplicateProductService fromInput(Map<String, Object> mapValue) {
        DuplicateProductService service = new DuplicateProductService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>DuplicateProductService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static DuplicateProductService fromOutput(Map<String, Object> mapValue) {
        DuplicateProductService service = new DuplicateProductService();
        service.putAllOutput(mapValue);
        return service;
    }
}