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
 * Auto generated base entity PaymentGatewayResponse.
 */
@javax.persistence.Entity
@Table(name="PAYMENT_GATEWAY_RESPONSE")
public class PaymentGatewayResponse extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentGatewayResponseId", "PAYMENT_GATEWAY_RESPONSE_ID");
        fields.put("paymentServiceTypeEnumId", "PAYMENT_SERVICE_TYPE_ENUM_ID");
        fields.put("orderPaymentPreferenceId", "ORDER_PAYMENT_PREFERENCE_ID");
        fields.put("paymentMethodTypeId", "PAYMENT_METHOD_TYPE_ID");
        fields.put("paymentMethodId", "PAYMENT_METHOD_ID");
        fields.put("transCodeEnumId", "TRANS_CODE_ENUM_ID");
        fields.put("amount", "AMOUNT");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("referenceNum", "REFERENCE_NUM");
        fields.put("altReference", "ALT_REFERENCE");
        fields.put("subReference", "SUB_REFERENCE");
        fields.put("gatewayCode", "GATEWAY_CODE");
        fields.put("gatewayFlag", "GATEWAY_FLAG");
        fields.put("gatewayAvsResult", "GATEWAY_AVS_RESULT");
        fields.put("gatewayCvResult", "GATEWAY_CV_RESULT");
        fields.put("gatewayScoreResult", "GATEWAY_SCORE_RESULT");
        fields.put("gatewayMessage", "GATEWAY_MESSAGE");
        fields.put("transactionDate", "TRANSACTION_DATE");
        fields.put("resultDeclined", "RESULT_DECLINED");
        fields.put("resultNsf", "RESULT_NSF");
        fields.put("resultBadExpire", "RESULT_BAD_EXPIRE");
        fields.put("resultBadCardNumber", "RESULT_BAD_CARD_NUMBER");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PaymentGatewayResponse", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentGatewayResponse> {
    paymentGatewayResponseId("paymentGatewayResponseId"),
    paymentServiceTypeEnumId("paymentServiceTypeEnumId"),
    orderPaymentPreferenceId("orderPaymentPreferenceId"),
    paymentMethodTypeId("paymentMethodTypeId"),
    paymentMethodId("paymentMethodId"),
    transCodeEnumId("transCodeEnumId"),
    amount("amount"),
    currencyUomId("currencyUomId"),
    referenceNum("referenceNum"),
    altReference("altReference"),
    subReference("subReference"),
    gatewayCode("gatewayCode"),
    gatewayFlag("gatewayFlag"),
    gatewayAvsResult("gatewayAvsResult"),
    gatewayCvResult("gatewayCvResult"),
    gatewayScoreResult("gatewayScoreResult"),
    gatewayMessage("gatewayMessage"),
    transactionDate("transactionDate"),
    resultDeclined("resultDeclined"),
    resultNsf("resultNsf"),
    resultBadExpire("resultBadExpire"),
    resultBadCardNumber("resultBadCardNumber"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="PaymentGatewayResponse_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PaymentGatewayResponse_GEN")
   @Id
   @Column(name="PAYMENT_GATEWAY_RESPONSE_ID")
   private String paymentGatewayResponseId;
   @Column(name="PAYMENT_SERVICE_TYPE_ENUM_ID")
   private String paymentServiceTypeEnumId;
   @Column(name="ORDER_PAYMENT_PREFERENCE_ID")
   private String orderPaymentPreferenceId;
   @Column(name="PAYMENT_METHOD_TYPE_ID")
   private String paymentMethodTypeId;
   @Column(name="PAYMENT_METHOD_ID")
   private String paymentMethodId;
   @Column(name="TRANS_CODE_ENUM_ID")
   private String transCodeEnumId;
   @Column(name="AMOUNT")
   private BigDecimal amount;
   @Column(name="CURRENCY_UOM_ID")
   private String currencyUomId;
   @Column(name="REFERENCE_NUM")
   private String referenceNum;
   @Column(name="ALT_REFERENCE")
   private String altReference;
   @Column(name="SUB_REFERENCE")
   private String subReference;
   @Column(name="GATEWAY_CODE")
   private String gatewayCode;
   @Column(name="GATEWAY_FLAG")
   private String gatewayFlag;
   @Column(name="GATEWAY_AVS_RESULT")
   private String gatewayAvsResult;
   @Column(name="GATEWAY_CV_RESULT")
   private String gatewayCvResult;
   @Column(name="GATEWAY_SCORE_RESULT")
   private String gatewayScoreResult;
   @Column(name="GATEWAY_MESSAGE")
   private String gatewayMessage;
   @Column(name="TRANSACTION_DATE")
   private Timestamp transactionDate;
   @Column(name="RESULT_DECLINED")
   private String resultDeclined;
   @Column(name="RESULT_NSF")
   private String resultNsf;
   @Column(name="RESULT_BAD_EXPIRE")
   private String resultBadExpire;
   @Column(name="RESULT_BAD_CARD_NUMBER")
   private String resultBadCardNumber;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_SERVICE_TYPE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration serviceTypeEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TRANS_CODE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration tranCodeEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_PAYMENT_PREFERENCE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderPaymentPreference orderPaymentPreference = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentMethodType paymentMethodType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentMethod paymentMethod = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentGatewayResponse", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_GATEWAY_RESPONSE_ID")
   
   private List<Payment> payments = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentGatewayResponse", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_GATEWAY_RESPONSE_ID")
   
   private List<PaymentGatewayRespMsg> paymentGatewayRespMsgs = null;

  /**
   * Default constructor.
   */
  public PaymentGatewayResponse() {
      super();
      this.baseEntityName = "PaymentGatewayResponse";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentGatewayResponseId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentGatewayResponseId");this.allFieldsNames.add("paymentServiceTypeEnumId");this.allFieldsNames.add("orderPaymentPreferenceId");this.allFieldsNames.add("paymentMethodTypeId");this.allFieldsNames.add("paymentMethodId");this.allFieldsNames.add("transCodeEnumId");this.allFieldsNames.add("amount");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("referenceNum");this.allFieldsNames.add("altReference");this.allFieldsNames.add("subReference");this.allFieldsNames.add("gatewayCode");this.allFieldsNames.add("gatewayFlag");this.allFieldsNames.add("gatewayAvsResult");this.allFieldsNames.add("gatewayCvResult");this.allFieldsNames.add("gatewayScoreResult");this.allFieldsNames.add("gatewayMessage");this.allFieldsNames.add("transactionDate");this.allFieldsNames.add("resultDeclined");this.allFieldsNames.add("resultNsf");this.allFieldsNames.add("resultBadExpire");this.allFieldsNames.add("resultBadCardNumber");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentGatewayResponse(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentGatewayResponseId the paymentGatewayResponseId to set
     */
    public void setPaymentGatewayResponseId(String paymentGatewayResponseId) {
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }
    /**
     * Auto generated value setter.
     * @param paymentServiceTypeEnumId the paymentServiceTypeEnumId to set
     */
    public void setPaymentServiceTypeEnumId(String paymentServiceTypeEnumId) {
        this.paymentServiceTypeEnumId = paymentServiceTypeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param orderPaymentPreferenceId the orderPaymentPreferenceId to set
     */
    public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
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
     * @param paymentMethodId the paymentMethodId to set
     */
    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
    /**
     * Auto generated value setter.
     * @param transCodeEnumId the transCodeEnumId to set
     */
    public void setTransCodeEnumId(String transCodeEnumId) {
        this.transCodeEnumId = transCodeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param referenceNum the referenceNum to set
     */
    public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }
    /**
     * Auto generated value setter.
     * @param altReference the altReference to set
     */
    public void setAltReference(String altReference) {
        this.altReference = altReference;
    }
    /**
     * Auto generated value setter.
     * @param subReference the subReference to set
     */
    public void setSubReference(String subReference) {
        this.subReference = subReference;
    }
    /**
     * Auto generated value setter.
     * @param gatewayCode the gatewayCode to set
     */
    public void setGatewayCode(String gatewayCode) {
        this.gatewayCode = gatewayCode;
    }
    /**
     * Auto generated value setter.
     * @param gatewayFlag the gatewayFlag to set
     */
    public void setGatewayFlag(String gatewayFlag) {
        this.gatewayFlag = gatewayFlag;
    }
    /**
     * Auto generated value setter.
     * @param gatewayAvsResult the gatewayAvsResult to set
     */
    public void setGatewayAvsResult(String gatewayAvsResult) {
        this.gatewayAvsResult = gatewayAvsResult;
    }
    /**
     * Auto generated value setter.
     * @param gatewayCvResult the gatewayCvResult to set
     */
    public void setGatewayCvResult(String gatewayCvResult) {
        this.gatewayCvResult = gatewayCvResult;
    }
    /**
     * Auto generated value setter.
     * @param gatewayScoreResult the gatewayScoreResult to set
     */
    public void setGatewayScoreResult(String gatewayScoreResult) {
        this.gatewayScoreResult = gatewayScoreResult;
    }
    /**
     * Auto generated value setter.
     * @param gatewayMessage the gatewayMessage to set
     */
    public void setGatewayMessage(String gatewayMessage) {
        this.gatewayMessage = gatewayMessage;
    }
    /**
     * Auto generated value setter.
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }
    /**
     * Auto generated value setter.
     * @param resultDeclined the resultDeclined to set
     */
    public void setResultDeclined(String resultDeclined) {
        this.resultDeclined = resultDeclined;
    }
    /**
     * Auto generated value setter.
     * @param resultNsf the resultNsf to set
     */
    public void setResultNsf(String resultNsf) {
        this.resultNsf = resultNsf;
    }
    /**
     * Auto generated value setter.
     * @param resultBadExpire the resultBadExpire to set
     */
    public void setResultBadExpire(String resultBadExpire) {
        this.resultBadExpire = resultBadExpire;
    }
    /**
     * Auto generated value setter.
     * @param resultBadCardNumber the resultBadCardNumber to set
     */
    public void setResultBadCardNumber(String resultBadCardNumber) {
        this.resultBadCardNumber = resultBadCardNumber;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentGatewayResponseId() {
        return this.paymentGatewayResponseId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentServiceTypeEnumId() {
        return this.paymentServiceTypeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderPaymentPreferenceId() {
        return this.orderPaymentPreferenceId;
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
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTransCodeEnumId() {
        return this.transCodeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReferenceNum() {
        return this.referenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAltReference() {
        return this.altReference;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSubReference() {
        return this.subReference;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGatewayCode() {
        return this.gatewayCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGatewayFlag() {
        return this.gatewayFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGatewayAvsResult() {
        return this.gatewayAvsResult;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGatewayCvResult() {
        return this.gatewayCvResult;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGatewayScoreResult() {
        return this.gatewayScoreResult;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGatewayMessage() {
        return this.gatewayMessage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTransactionDate() {
        return this.transactionDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getResultDeclined() {
        return this.resultDeclined;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getResultNsf() {
        return this.resultNsf;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getResultBadExpire() {
        return this.resultBadExpire;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getResultBadCardNumber() {
        return this.resultBadCardNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>ServiceTypeEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getServiceTypeEnumeration() throws RepositoryException {
        if (this.serviceTypeEnumeration == null) {
            this.serviceTypeEnumeration = getRelatedOne(Enumeration.class, "ServiceTypeEnumeration");
        }
        return this.serviceTypeEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>TranCodeEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getTranCodeEnumeration() throws RepositoryException {
        if (this.tranCodeEnumeration == null) {
            this.tranCodeEnumeration = getRelatedOne(Enumeration.class, "TranCodeEnumeration");
        }
        return this.tranCodeEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUom() throws RepositoryException {
        if (this.uom == null) {
            this.uom = getRelatedOne(Uom.class, "Uom");
        }
        return this.uom;
    }
    /**
     * Auto generated method that gets the related <code>OrderPaymentPreference</code> by the relation named <code>OrderPaymentPreference</code>.
     * @return the <code>OrderPaymentPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderPaymentPreference getOrderPaymentPreference() throws RepositoryException {
        if (this.orderPaymentPreference == null) {
            this.orderPaymentPreference = getRelatedOne(OrderPaymentPreference.class, "OrderPaymentPreference");
        }
        return this.orderPaymentPreference;
    }
    /**
     * Auto generated method that gets the related <code>PaymentMethodType</code> by the relation named <code>PaymentMethodType</code>.
     * @return the <code>PaymentMethodType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentMethodType getPaymentMethodType() throws RepositoryException {
        if (this.paymentMethodType == null) {
            this.paymentMethodType = getRelatedOne(PaymentMethodType.class, "PaymentMethodType");
        }
        return this.paymentMethodType;
    }
    /**
     * Auto generated method that gets the related <code>PaymentMethod</code> by the relation named <code>PaymentMethod</code>.
     * @return the <code>PaymentMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentMethod getPaymentMethod() throws RepositoryException {
        if (this.paymentMethod == null) {
            this.paymentMethod = getRelatedOne(PaymentMethod.class, "PaymentMethod");
        }
        return this.paymentMethod;
    }
    /**
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>Payment</code>.
     * @return the list of <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Payment> getPayments() throws RepositoryException {
        if (this.payments == null) {
            this.payments = getRelated(Payment.class, "Payment");
        }
        return this.payments;
    }
    /**
     * Auto generated method that gets the related <code>PaymentGatewayRespMsg</code> by the relation named <code>PaymentGatewayRespMsg</code>.
     * @return the list of <code>PaymentGatewayRespMsg</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentGatewayRespMsg> getPaymentGatewayRespMsgs() throws RepositoryException {
        if (this.paymentGatewayRespMsgs == null) {
            this.paymentGatewayRespMsgs = getRelated(PaymentGatewayRespMsg.class, "PaymentGatewayRespMsg");
        }
        return this.paymentGatewayRespMsgs;
    }

    /**
     * Auto generated value setter.
     * @param serviceTypeEnumeration the serviceTypeEnumeration to set
    */
    public void setServiceTypeEnumeration(Enumeration serviceTypeEnumeration) {
        this.serviceTypeEnumeration = serviceTypeEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param tranCodeEnumeration the tranCodeEnumeration to set
    */
    public void setTranCodeEnumeration(Enumeration tranCodeEnumeration) {
        this.tranCodeEnumeration = tranCodeEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param uom the uom to set
    */
    public void setUom(Uom uom) {
        this.uom = uom;
    }
    /**
     * Auto generated value setter.
     * @param orderPaymentPreference the orderPaymentPreference to set
    */
    public void setOrderPaymentPreference(OrderPaymentPreference orderPaymentPreference) {
        this.orderPaymentPreference = orderPaymentPreference;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethodType the paymentMethodType to set
    */
    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }
    /**
     * Auto generated value setter.
     * @param paymentMethod the paymentMethod to set
    */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    /**
     * Auto generated value setter.
     * @param payments the payments to set
    */
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
    /**
     * Auto generated value setter.
     * @param paymentGatewayRespMsgs the paymentGatewayRespMsgs to set
    */
    public void setPaymentGatewayRespMsgs(List<PaymentGatewayRespMsg> paymentGatewayRespMsgs) {
        this.paymentGatewayRespMsgs = paymentGatewayRespMsgs;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentGatewayResponseId((String) mapValue.get("paymentGatewayResponseId"));
        setPaymentServiceTypeEnumId((String) mapValue.get("paymentServiceTypeEnumId"));
        setOrderPaymentPreferenceId((String) mapValue.get("orderPaymentPreferenceId"));
        setPaymentMethodTypeId((String) mapValue.get("paymentMethodTypeId"));
        setPaymentMethodId((String) mapValue.get("paymentMethodId"));
        setTransCodeEnumId((String) mapValue.get("transCodeEnumId"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setReferenceNum((String) mapValue.get("referenceNum"));
        setAltReference((String) mapValue.get("altReference"));
        setSubReference((String) mapValue.get("subReference"));
        setGatewayCode((String) mapValue.get("gatewayCode"));
        setGatewayFlag((String) mapValue.get("gatewayFlag"));
        setGatewayAvsResult((String) mapValue.get("gatewayAvsResult"));
        setGatewayCvResult((String) mapValue.get("gatewayCvResult"));
        setGatewayScoreResult((String) mapValue.get("gatewayScoreResult"));
        setGatewayMessage((String) mapValue.get("gatewayMessage"));
        setTransactionDate((Timestamp) mapValue.get("transactionDate"));
        setResultDeclined((String) mapValue.get("resultDeclined"));
        setResultNsf((String) mapValue.get("resultNsf"));
        setResultBadExpire((String) mapValue.get("resultBadExpire"));
        setResultBadCardNumber((String) mapValue.get("resultBadCardNumber"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("paymentGatewayResponseId", getPaymentGatewayResponseId());
        mapValue.put("paymentServiceTypeEnumId", getPaymentServiceTypeEnumId());
        mapValue.put("orderPaymentPreferenceId", getOrderPaymentPreferenceId());
        mapValue.put("paymentMethodTypeId", getPaymentMethodTypeId());
        mapValue.put("paymentMethodId", getPaymentMethodId());
        mapValue.put("transCodeEnumId", getTransCodeEnumId());
        mapValue.put("amount", getAmount());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("referenceNum", getReferenceNum());
        mapValue.put("altReference", getAltReference());
        mapValue.put("subReference", getSubReference());
        mapValue.put("gatewayCode", getGatewayCode());
        mapValue.put("gatewayFlag", getGatewayFlag());
        mapValue.put("gatewayAvsResult", getGatewayAvsResult());
        mapValue.put("gatewayCvResult", getGatewayCvResult());
        mapValue.put("gatewayScoreResult", getGatewayScoreResult());
        mapValue.put("gatewayMessage", getGatewayMessage());
        mapValue.put("transactionDate", getTransactionDate());
        mapValue.put("resultDeclined", getResultDeclined());
        mapValue.put("resultNsf", getResultNsf());
        mapValue.put("resultBadExpire", getResultBadExpire());
        mapValue.put("resultBadCardNumber", getResultBadCardNumber());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
