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

import java.sql.Timestamp;
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
 * Create a new ship group for an order.
 * Auto generated base service entity crmsfa.createShipGroup.
 *
 * Engine: java
 * Location: com.opensourcestrategies.crmsfa.orders.CrmsfaOrderServices
 * Invoke: createShipGroup
 * Defined in: hot-deploy/crmsfa/servicedef/services_orders.xml
 */
public class CrmsfaCreateShipGroupService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "crmsfa.createShipGroup";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        rowSubmit("_rowSubmit"),
        contactMechId("contactMechId"),
        giftMessage("giftMessage"),
        isGift("isGift"),
        locale("locale"),
        maySplit("maySplit"),
        orderId("orderId"),
        orderIds("orderIds"),
        orderItemSeqIds("orderItemSeqIds"),
        qtiesToTransfer("qtiesToTransfer"),
        shipByDate("shipByDate"),
        shipGroupSeqIds("shipGroupSeqIds"),
        shippingInstructions("shippingInstructions"),
        shippingMethod("shippingMethod"),
        thirdPartyAccountNumber("thirdPartyAccountNumber"),
        thirdPartyCountryCode("thirdPartyCountryCode"),
        thirdPartyPostalCode("thirdPartyPostalCode"),
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
     * Creates a new <code>CrmsfaCreateShipGroupService</code> instance.
     */
    public CrmsfaCreateShipGroupService() {
        super();
    }

    /**
     * Creates a new <code>CrmsfaCreateShipGroupService</code> instance.
     * @param user an <code>User</code> value
     */
    public CrmsfaCreateShipGroupService(User user) {
        super(user);
    }

    private Map inRowSubmit;
    private String inContactMechId;
    private String inGiftMessage;
    private String inIsGift;
    private Locale inLocale;
    private String inMaySplit;
    private String inOrderId;
    private Map inOrderIds;
    private Map inOrderItemSeqIds;
    private Map inQtiesToTransfer;
    private Timestamp inShipByDate;
    private Map inShipGroupSeqIds;
    private String inShippingInstructions;
    private String inShippingMethod;
    private String inThirdPartyAccountNumber;
    private String inThirdPartyCountryCode;
    private String inThirdPartyPostalCode;
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
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInRowSubmit() {
        return this.inRowSubmit;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInContactMechId() {
        return this.inContactMechId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGiftMessage() {
        return this.inGiftMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInIsGift() {
        return this.inIsGift;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInMaySplit() {
        return this.inMaySplit;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInOrderId() {
        return this.inOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInOrderIds() {
        return this.inOrderIds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInOrderItemSeqIds() {
        return this.inOrderItemSeqIds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInQtiesToTransfer() {
        return this.inQtiesToTransfer;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInShipByDate() {
        return this.inShipByDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Map</code>
     */
    public Map getInShipGroupSeqIds() {
        return this.inShipGroupSeqIds;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShippingInstructions() {
        return this.inShippingInstructions;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShippingMethod() {
        return this.inShippingMethod;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInThirdPartyAccountNumber() {
        return this.inThirdPartyAccountNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInThirdPartyCountryCode() {
        return this.inThirdPartyCountryCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInThirdPartyPostalCode() {
        return this.inThirdPartyPostalCode;
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
     * This parameter is required.
     * @param inRowSubmit the inRowSubmit to set
    */
    public void setInRowSubmit(Map inRowSubmit) {
        this.inParameters.add("_rowSubmit");
        this.inRowSubmit = inRowSubmit;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inContactMechId the inContactMechId to set
    */
    public void setInContactMechId(String inContactMechId) {
        this.inParameters.add("contactMechId");
        this.inContactMechId = inContactMechId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGiftMessage the inGiftMessage to set
    */
    public void setInGiftMessage(String inGiftMessage) {
        this.inParameters.add("giftMessage");
        this.inGiftMessage = inGiftMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inIsGift the inIsGift to set
    */
    public void setInIsGift(String inIsGift) {
        this.inParameters.add("isGift");
        this.inIsGift = inIsGift;
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
     * This parameter is required.
     * @param inMaySplit the inMaySplit to set
    */
    public void setInMaySplit(String inMaySplit) {
        this.inParameters.add("maySplit");
        this.inMaySplit = inMaySplit;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOrderIds the inOrderIds to set
    */
    public void setInOrderIds(Map inOrderIds) {
        this.inParameters.add("orderIds");
        this.inOrderIds = inOrderIds;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inOrderItemSeqIds the inOrderItemSeqIds to set
    */
    public void setInOrderItemSeqIds(Map inOrderItemSeqIds) {
        this.inParameters.add("orderItemSeqIds");
        this.inOrderItemSeqIds = inOrderItemSeqIds;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inQtiesToTransfer the inQtiesToTransfer to set
    */
    public void setInQtiesToTransfer(Map inQtiesToTransfer) {
        this.inParameters.add("qtiesToTransfer");
        this.inQtiesToTransfer = inQtiesToTransfer;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipByDate the inShipByDate to set
    */
    public void setInShipByDate(Timestamp inShipByDate) {
        this.inParameters.add("shipByDate");
        this.inShipByDate = inShipByDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipGroupSeqIds the inShipGroupSeqIds to set
    */
    public void setInShipGroupSeqIds(Map inShipGroupSeqIds) {
        this.inParameters.add("shipGroupSeqIds");
        this.inShipGroupSeqIds = inShipGroupSeqIds;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShippingInstructions the inShippingInstructions to set
    */
    public void setInShippingInstructions(String inShippingInstructions) {
        this.inParameters.add("shippingInstructions");
        this.inShippingInstructions = inShippingInstructions;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShippingMethod the inShippingMethod to set
    */
    public void setInShippingMethod(String inShippingMethod) {
        this.inParameters.add("shippingMethod");
        this.inShippingMethod = inShippingMethod;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThirdPartyAccountNumber the inThirdPartyAccountNumber to set
    */
    public void setInThirdPartyAccountNumber(String inThirdPartyAccountNumber) {
        this.inParameters.add("thirdPartyAccountNumber");
        this.inThirdPartyAccountNumber = inThirdPartyAccountNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThirdPartyCountryCode the inThirdPartyCountryCode to set
    */
    public void setInThirdPartyCountryCode(String inThirdPartyCountryCode) {
        this.inParameters.add("thirdPartyCountryCode");
        this.inThirdPartyCountryCode = inThirdPartyCountryCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThirdPartyPostalCode the inThirdPartyPostalCode to set
    */
    public void setInThirdPartyPostalCode(String inThirdPartyPostalCode) {
        this.inParameters.add("thirdPartyPostalCode");
        this.inThirdPartyPostalCode = inThirdPartyPostalCode;
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
        if (inParameters.contains("_rowSubmit")) mapValue.put("_rowSubmit", getInRowSubmit());
        if (inParameters.contains("contactMechId")) mapValue.put("contactMechId", getInContactMechId());
        if (inParameters.contains("giftMessage")) mapValue.put("giftMessage", getInGiftMessage());
        if (inParameters.contains("isGift")) mapValue.put("isGift", getInIsGift());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maySplit")) mapValue.put("maySplit", getInMaySplit());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("orderIds")) mapValue.put("orderIds", getInOrderIds());
        if (inParameters.contains("orderItemSeqIds")) mapValue.put("orderItemSeqIds", getInOrderItemSeqIds());
        if (inParameters.contains("qtiesToTransfer")) mapValue.put("qtiesToTransfer", getInQtiesToTransfer());
        if (inParameters.contains("shipByDate")) mapValue.put("shipByDate", getInShipByDate());
        if (inParameters.contains("shipGroupSeqIds")) mapValue.put("shipGroupSeqIds", getInShipGroupSeqIds());
        if (inParameters.contains("shippingInstructions")) mapValue.put("shippingInstructions", getInShippingInstructions());
        if (inParameters.contains("shippingMethod")) mapValue.put("shippingMethod", getInShippingMethod());
        if (inParameters.contains("thirdPartyAccountNumber")) mapValue.put("thirdPartyAccountNumber", getInThirdPartyAccountNumber());
        if (inParameters.contains("thirdPartyCountryCode")) mapValue.put("thirdPartyCountryCode", getInThirdPartyCountryCode());
        if (inParameters.contains("thirdPartyPostalCode")) mapValue.put("thirdPartyPostalCode", getInThirdPartyPostalCode());
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
        if (mapValue.containsKey("_rowSubmit")) setInRowSubmit((Map) mapValue.get("_rowSubmit"));
        if (mapValue.containsKey("contactMechId")) setInContactMechId((String) mapValue.get("contactMechId"));
        if (mapValue.containsKey("giftMessage")) setInGiftMessage((String) mapValue.get("giftMessage"));
        if (mapValue.containsKey("isGift")) setInIsGift((String) mapValue.get("isGift"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maySplit")) setInMaySplit((String) mapValue.get("maySplit"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("orderIds")) setInOrderIds((Map) mapValue.get("orderIds"));
        if (mapValue.containsKey("orderItemSeqIds")) setInOrderItemSeqIds((Map) mapValue.get("orderItemSeqIds"));
        if (mapValue.containsKey("qtiesToTransfer")) setInQtiesToTransfer((Map) mapValue.get("qtiesToTransfer"));
        if (mapValue.containsKey("shipByDate")) setInShipByDate((Timestamp) mapValue.get("shipByDate"));
        if (mapValue.containsKey("shipGroupSeqIds")) setInShipGroupSeqIds((Map) mapValue.get("shipGroupSeqIds"));
        if (mapValue.containsKey("shippingInstructions")) setInShippingInstructions((String) mapValue.get("shippingInstructions"));
        if (mapValue.containsKey("shippingMethod")) setInShippingMethod((String) mapValue.get("shippingMethod"));
        if (mapValue.containsKey("thirdPartyAccountNumber")) setInThirdPartyAccountNumber((String) mapValue.get("thirdPartyAccountNumber"));
        if (mapValue.containsKey("thirdPartyCountryCode")) setInThirdPartyCountryCode((String) mapValue.get("thirdPartyCountryCode"));
        if (mapValue.containsKey("thirdPartyPostalCode")) setInThirdPartyPostalCode((String) mapValue.get("thirdPartyPostalCode"));
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
     * Construct a <code>CrmsfaCreateShipGroupService</code> from the input values of the given <code>CrmsfaCreateShipGroupService</code>.
     * @param input a <code>CrmsfaCreateShipGroupService</code>
     */
    public static CrmsfaCreateShipGroupService fromInput(CrmsfaCreateShipGroupService input) {
        CrmsfaCreateShipGroupService service = new CrmsfaCreateShipGroupService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CrmsfaCreateShipGroupService</code> from the output values of the given <code>CrmsfaCreateShipGroupService</code>.
     * @param output a <code>CrmsfaCreateShipGroupService</code>
     */
    public static CrmsfaCreateShipGroupService fromOutput(CrmsfaCreateShipGroupService output) {
        CrmsfaCreateShipGroupService service = new CrmsfaCreateShipGroupService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CrmsfaCreateShipGroupService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CrmsfaCreateShipGroupService fromInput(Map<String, Object> mapValue) {
        CrmsfaCreateShipGroupService service = new CrmsfaCreateShipGroupService();
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
     * Construct a <code>CrmsfaCreateShipGroupService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CrmsfaCreateShipGroupService fromOutput(Map<String, Object> mapValue) {
        CrmsfaCreateShipGroupService service = new CrmsfaCreateShipGroupService();
        service.putAllOutput(mapValue);
        return service;
    }
}
