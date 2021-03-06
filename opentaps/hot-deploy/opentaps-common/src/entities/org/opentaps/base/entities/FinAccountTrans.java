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
 * Auto generated base entity FinAccountTrans.
 */
@javax.persistence.Entity
@Table(name="FIN_ACCOUNT_TRANS")
public class FinAccountTrans extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("finAccountTransId", "FIN_ACCOUNT_TRANS_ID");
        fields.put("finAccountTransTypeId", "FIN_ACCOUNT_TRANS_TYPE_ID");
        fields.put("finAccountId", "FIN_ACCOUNT_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("transactionDate", "TRANSACTION_DATE");
        fields.put("entryDate", "ENTRY_DATE");
        fields.put("amount", "AMOUNT");
        fields.put("paymentId", "PAYMENT_ID");
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("performedByPartyId", "PERFORMED_BY_PARTY_ID");
        fields.put("reasonEnumId", "REASON_ENUM_ID");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FinAccountTrans", fields);
}
  public static enum Fields implements EntityFieldInterface<FinAccountTrans> {
    finAccountTransId("finAccountTransId"),
    finAccountTransTypeId("finAccountTransTypeId"),
    finAccountId("finAccountId"),
    partyId("partyId"),
    transactionDate("transactionDate"),
    entryDate("entryDate"),
    amount("amount"),
    paymentId("paymentId"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    performedByPartyId("performedByPartyId"),
    reasonEnumId("reasonEnumId"),
    comments("comments"),
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

   @org.hibernate.annotations.GenericGenerator(name="FinAccountTrans_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="FinAccountTrans_GEN")
   @Id
   @Column(name="FIN_ACCOUNT_TRANS_ID")
   private String finAccountTransId;
   @Column(name="FIN_ACCOUNT_TRANS_TYPE_ID")
   private String finAccountTransTypeId;
   @Column(name="FIN_ACCOUNT_ID")
   private String finAccountId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="TRANSACTION_DATE")
   private Timestamp transactionDate;
   @Column(name="ENTRY_DATE")
   private Timestamp entryDate;
   @Column(name="AMOUNT")
   private BigDecimal amount;
   @Column(name="PAYMENT_ID")
   private String paymentId;
   @Column(name="ORDER_ID")
   private String orderId;
   @Column(name="ORDER_ITEM_SEQ_ID")
   private String orderItemSeqId;
   @Column(name="PERFORMED_BY_PARTY_ID")
   private String performedByPartyId;
   @Column(name="REASON_ENUM_ID")
   private String reasonEnumId;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FIN_ACCOUNT_TRANS_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FinAccountTransType finAccountTransType = null;
   private transient List<FinAccountTransTypeAttr> finAccountTransTypeAttrs = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FIN_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private FinAccount finAccount = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Payment payment = null;
   private transient OrderItem orderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PERFORMED_BY_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party performedByParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REASON_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration reasonEnumeration = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="finAccountTrans", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FIN_ACCOUNT_TRANS_ID")
   
   private List<AcctgTrans> acctgTranses = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="finAccountTrans", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="FIN_ACCOUNT_TRANS_ID")
   
   private List<FinAccountTransAttribute> finAccountTransAttributes = null;

  /**
   * Default constructor.
   */
  public FinAccountTrans() {
      super();
      this.baseEntityName = "FinAccountTrans";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("finAccountTransId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("finAccountTransId");this.allFieldsNames.add("finAccountTransTypeId");this.allFieldsNames.add("finAccountId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("transactionDate");this.allFieldsNames.add("entryDate");this.allFieldsNames.add("amount");this.allFieldsNames.add("paymentId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("performedByPartyId");this.allFieldsNames.add("reasonEnumId");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FinAccountTrans(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param finAccountTransId the finAccountTransId to set
     */
    public void setFinAccountTransId(String finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }
    /**
     * Auto generated value setter.
     * @param finAccountTransTypeId the finAccountTransTypeId to set
     */
    public void setFinAccountTransTypeId(String finAccountTransTypeId) {
        this.finAccountTransTypeId = finAccountTransTypeId;
    }
    /**
     * Auto generated value setter.
     * @param finAccountId the finAccountId to set
     */
    public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
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
     * @param entryDate the entryDate to set
     */
    public void setEntryDate(Timestamp entryDate) {
        this.entryDate = entryDate;
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
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param performedByPartyId the performedByPartyId to set
     */
    public void setPerformedByPartyId(String performedByPartyId) {
        this.performedByPartyId = performedByPartyId;
    }
    /**
     * Auto generated value setter.
     * @param reasonEnumId the reasonEnumId to set
     */
    public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
    public String getFinAccountTransId() {
        return this.finAccountTransId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFinAccountTransTypeId() {
        return this.finAccountTransTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFinAccountId() {
        return this.finAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getEntryDate() {
        return this.entryDate;
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
    public String getPaymentId() {
        return this.paymentId;
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
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPerformedByPartyId() {
        return this.performedByPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReasonEnumId() {
        return this.reasonEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
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
     * Auto generated method that gets the related <code>FinAccountTransType</code> by the relation named <code>FinAccountTransType</code>.
     * @return the <code>FinAccountTransType</code>
     * @throws RepositoryException if an error occurs
     */
    public FinAccountTransType getFinAccountTransType() throws RepositoryException {
        if (this.finAccountTransType == null) {
            this.finAccountTransType = getRelatedOne(FinAccountTransType.class, "FinAccountTransType");
        }
        return this.finAccountTransType;
    }
    /**
     * Auto generated method that gets the related <code>FinAccountTransTypeAttr</code> by the relation named <code>FinAccountTransTypeAttr</code>.
     * @return the list of <code>FinAccountTransTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FinAccountTransTypeAttr> getFinAccountTransTypeAttrs() throws RepositoryException {
        if (this.finAccountTransTypeAttrs == null) {
            this.finAccountTransTypeAttrs = getRelated(FinAccountTransTypeAttr.class, "FinAccountTransTypeAttr");
        }
        return this.finAccountTransTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>FinAccount</code> by the relation named <code>FinAccount</code>.
     * @return the <code>FinAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public FinAccount getFinAccount() throws RepositoryException {
        if (this.finAccount == null) {
            this.finAccount = getRelatedOne(FinAccount.class, "FinAccount");
        }
        return this.finAccount;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>Payment</code> by the relation named <code>Payment</code>.
     * @return the <code>Payment</code>
     * @throws RepositoryException if an error occurs
     */
    public Payment getPayment() throws RepositoryException {
        if (this.payment == null) {
            this.payment = getRelatedOne(Payment.class, "Payment");
        }
        return this.payment;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getOrderItem() throws RepositoryException {
        if (this.orderItem == null) {
            this.orderItem = getRelatedOne(OrderItem.class, "OrderItem");
        }
        return this.orderItem;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>PerformedByParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getPerformedByParty() throws RepositoryException {
        if (this.performedByParty == null) {
            this.performedByParty = getRelatedOne(Party.class, "PerformedByParty");
        }
        return this.performedByParty;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>ReasonEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getReasonEnumeration() throws RepositoryException {
        if (this.reasonEnumeration == null) {
            this.reasonEnumeration = getRelatedOne(Enumeration.class, "ReasonEnumeration");
        }
        return this.reasonEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>AcctgTrans</code> by the relation named <code>AcctgTrans</code>.
     * @return the list of <code>AcctgTrans</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AcctgTrans> getAcctgTranses() throws RepositoryException {
        if (this.acctgTranses == null) {
            this.acctgTranses = getRelated(AcctgTrans.class, "AcctgTrans");
        }
        return this.acctgTranses;
    }
    /**
     * Auto generated method that gets the related <code>FinAccountTransAttribute</code> by the relation named <code>FinAccountTransAttribute</code>.
     * @return the list of <code>FinAccountTransAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FinAccountTransAttribute> getFinAccountTransAttributes() throws RepositoryException {
        if (this.finAccountTransAttributes == null) {
            this.finAccountTransAttributes = getRelated(FinAccountTransAttribute.class, "FinAccountTransAttribute");
        }
        return this.finAccountTransAttributes;
    }

    /**
     * Auto generated value setter.
     * @param finAccountTransType the finAccountTransType to set
    */
    public void setFinAccountTransType(FinAccountTransType finAccountTransType) {
        this.finAccountTransType = finAccountTransType;
    }
    /**
     * Auto generated value setter.
     * @param finAccountTransTypeAttrs the finAccountTransTypeAttrs to set
    */
    public void setFinAccountTransTypeAttrs(List<FinAccountTransTypeAttr> finAccountTransTypeAttrs) {
        this.finAccountTransTypeAttrs = finAccountTransTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param finAccount the finAccount to set
    */
    public void setFinAccount(FinAccount finAccount) {
        this.finAccount = finAccount;
    }
    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param payment the payment to set
    */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    /**
     * Auto generated value setter.
     * @param orderItem the orderItem to set
    */
    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
    /**
     * Auto generated value setter.
     * @param performedByParty the performedByParty to set
    */
    public void setPerformedByParty(Party performedByParty) {
        this.performedByParty = performedByParty;
    }
    /**
     * Auto generated value setter.
     * @param reasonEnumeration the reasonEnumeration to set
    */
    public void setReasonEnumeration(Enumeration reasonEnumeration) {
        this.reasonEnumeration = reasonEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param acctgTranses the acctgTranses to set
    */
    public void setAcctgTranses(List<AcctgTrans> acctgTranses) {
        this.acctgTranses = acctgTranses;
    }
    /**
     * Auto generated value setter.
     * @param finAccountTransAttributes the finAccountTransAttributes to set
    */
    public void setFinAccountTransAttributes(List<FinAccountTransAttribute> finAccountTransAttributes) {
        this.finAccountTransAttributes = finAccountTransAttributes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addFinAccountTransAttribute(FinAccountTransAttribute finAccountTransAttribute) {
        if (this.finAccountTransAttributes == null) {
            this.finAccountTransAttributes = new ArrayList<FinAccountTransAttribute>();
        }
        this.finAccountTransAttributes.add(finAccountTransAttribute);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeFinAccountTransAttribute(FinAccountTransAttribute finAccountTransAttribute) {
        if (this.finAccountTransAttributes == null) {
            return;
        }
        this.finAccountTransAttributes.remove(finAccountTransAttribute);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearFinAccountTransAttribute() {
        if (this.finAccountTransAttributes == null) {
            return;
        }
        this.finAccountTransAttributes.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFinAccountTransId((String) mapValue.get("finAccountTransId"));
        setFinAccountTransTypeId((String) mapValue.get("finAccountTransTypeId"));
        setFinAccountId((String) mapValue.get("finAccountId"));
        setPartyId((String) mapValue.get("partyId"));
        setTransactionDate((Timestamp) mapValue.get("transactionDate"));
        setEntryDate((Timestamp) mapValue.get("entryDate"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
        setPaymentId((String) mapValue.get("paymentId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setPerformedByPartyId((String) mapValue.get("performedByPartyId"));
        setReasonEnumId((String) mapValue.get("reasonEnumId"));
        setComments((String) mapValue.get("comments"));
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
        mapValue.put("finAccountTransId", getFinAccountTransId());
        mapValue.put("finAccountTransTypeId", getFinAccountTransTypeId());
        mapValue.put("finAccountId", getFinAccountId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("transactionDate", getTransactionDate());
        mapValue.put("entryDate", getEntryDate());
        mapValue.put("amount", getAmount());
        mapValue.put("paymentId", getPaymentId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("performedByPartyId", getPerformedByPartyId());
        mapValue.put("reasonEnumId", getReasonEnumId());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
