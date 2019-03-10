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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity PartyAcctgPreference.
 */
@javax.persistence.Entity
@Table(name="PARTY_ACCTG_PREFERENCE")
public class PartyAcctgPreference extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PARTY_ID");
        fields.put("fiscalYearStartMonth", "FISCAL_YEAR_START_MONTH");
        fields.put("fiscalYearStartDay", "FISCAL_YEAR_START_DAY");
        fields.put("taxFormId", "TAX_FORM_ID");
        fields.put("cogsMethodId", "COGS_METHOD_ID");
        fields.put("baseCurrencyUomId", "BASE_CURRENCY_UOM_ID");
        fields.put("invoiceSequenceEnumId", "INVOICE_SEQUENCE_ENUM_ID");
        fields.put("invoiceIdPrefix", "INVOICE_ID_PREFIX");
        fields.put("lastInvoiceNumber", "LAST_INVOICE_NUMBER");
        fields.put("lastInvoiceRestartDate", "LAST_INVOICE_RESTART_DATE");
        fields.put("useInvoiceIdForReturns", "USE_INVOICE_ID_FOR_RETURNS");
        fields.put("quoteSequenceEnumId", "QUOTE_SEQUENCE_ENUM_ID");
        fields.put("quoteIdPrefix", "QUOTE_ID_PREFIX");
        fields.put("lastQuoteNumber", "LAST_QUOTE_NUMBER");
        fields.put("orderSequenceEnumId", "ORDER_SEQUENCE_ENUM_ID");
        fields.put("orderIdPrefix", "ORDER_ID_PREFIX");
        fields.put("lastOrderNumber", "LAST_ORDER_NUMBER");
        fields.put("refundPaymentMethodId", "REFUND_PAYMENT_METHOD_ID");
        fields.put("errorGlJournalId", "ERROR_GL_JOURNAL_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
        fields.put("costingMethodId", "COSTING_METHOD_ID");
        fields.put("salesInvoiceFooterText", "SALES_INVOICE_FOOTER_TEXT");
        fields.put("groupSalesTaxOnInvoicePdf", "GROUP_SALES_TAX_ON_INVOICE_PDF");
        fields.put("allocPaymentTagsToAppl", "ALLOC_PAYMENT_TAGS_TO_APPL");
fieldMapColumns.put("PartyAcctgPreference", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyAcctgPreference> {
    partyId("partyId"),
    fiscalYearStartMonth("fiscalYearStartMonth"),
    fiscalYearStartDay("fiscalYearStartDay"),
    taxFormId("taxFormId"),
    cogsMethodId("cogsMethodId"),
    baseCurrencyUomId("baseCurrencyUomId"),
    invoiceSequenceEnumId("invoiceSequenceEnumId"),
    invoiceIdPrefix("invoiceIdPrefix"),
    lastInvoiceNumber("lastInvoiceNumber"),
    lastInvoiceRestartDate("lastInvoiceRestartDate"),
    useInvoiceIdForReturns("useInvoiceIdForReturns"),
    quoteSequenceEnumId("quoteSequenceEnumId"),
    quoteIdPrefix("quoteIdPrefix"),
    lastQuoteNumber("lastQuoteNumber"),
    orderSequenceEnumId("orderSequenceEnumId"),
    orderIdPrefix("orderIdPrefix"),
    lastOrderNumber("lastOrderNumber"),
    refundPaymentMethodId("refundPaymentMethodId"),
    errorGlJournalId("errorGlJournalId"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp"),
    costingMethodId("costingMethodId"),
    salesInvoiceFooterText("salesInvoiceFooterText"),
    groupSalesTaxOnInvoicePdf("groupSalesTaxOnInvoicePdf"),
    allocPaymentTagsToAppl("allocPaymentTagsToAppl");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="PartyAcctgPreference_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PartyAcctgPreference_GEN")
   @Id
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="FISCAL_YEAR_START_MONTH")
   private Long fiscalYearStartMonth;
   @Column(name="FISCAL_YEAR_START_DAY")
   private Long fiscalYearStartDay;
   @Column(name="TAX_FORM_ID")
   private String taxFormId;
   @Column(name="COGS_METHOD_ID")
   private String cogsMethodId;
   @Column(name="BASE_CURRENCY_UOM_ID")
   private String baseCurrencyUomId;
   @Column(name="INVOICE_SEQUENCE_ENUM_ID")
   private String invoiceSequenceEnumId;
   @Column(name="INVOICE_ID_PREFIX")
   private String invoiceIdPrefix;
   @Column(name="LAST_INVOICE_NUMBER")
   private Long lastInvoiceNumber;
   @Column(name="LAST_INVOICE_RESTART_DATE")
   private Timestamp lastInvoiceRestartDate;
   @Column(name="USE_INVOICE_ID_FOR_RETURNS")
   private String useInvoiceIdForReturns;
   @Column(name="QUOTE_SEQUENCE_ENUM_ID")
   private String quoteSequenceEnumId;
   @Column(name="QUOTE_ID_PREFIX")
   private String quoteIdPrefix;
   @Column(name="LAST_QUOTE_NUMBER")
   private Long lastQuoteNumber;
   @Column(name="ORDER_SEQUENCE_ENUM_ID")
   private String orderSequenceEnumId;
   @Column(name="ORDER_ID_PREFIX")
   private String orderIdPrefix;
   @Column(name="LAST_ORDER_NUMBER")
   private Long lastOrderNumber;
   @Column(name="REFUND_PAYMENT_METHOD_ID")
   private String refundPaymentMethodId;
   @Column(name="ERROR_GL_JOURNAL_ID")
   private String errorGlJournalId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @Column(name="COSTING_METHOD_ID")
   private String costingMethodId;
   @Column(name="SALES_INVOICE_FOOTER_TEXT")
   private String salesInvoiceFooterText;
   @Column(name="GROUP_SALES_TAX_ON_INVOICE_PDF")
   private String groupSalesTaxOnInvoicePdf;
   @Column(name="ALLOC_PAYMENT_TAGS_TO_APPL")
   private String allocPaymentTagsToAppl;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TAX_FORM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration taxFormEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COGS_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration cogsEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BASE_CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_SEQUENCE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration invoiceSequenceEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="QUOTE_SEQUENCE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration quoteSequenceEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_SEQUENCE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration orderSequenceEnumeration = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REFUND_PAYMENT_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentMethod paymentMethod = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ERROR_GL_JOURNAL_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlJournal glJournal = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COSTING_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration costingMethodEnumeration = null;

  /**
   * Default constructor.
   */
  public PartyAcctgPreference() {
      super();
      this.baseEntityName = "PartyAcctgPreference";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("fiscalYearStartMonth");this.allFieldsNames.add("fiscalYearStartDay");this.allFieldsNames.add("taxFormId");this.allFieldsNames.add("cogsMethodId");this.allFieldsNames.add("baseCurrencyUomId");this.allFieldsNames.add("invoiceSequenceEnumId");this.allFieldsNames.add("invoiceIdPrefix");this.allFieldsNames.add("lastInvoiceNumber");this.allFieldsNames.add("lastInvoiceRestartDate");this.allFieldsNames.add("useInvoiceIdForReturns");this.allFieldsNames.add("quoteSequenceEnumId");this.allFieldsNames.add("quoteIdPrefix");this.allFieldsNames.add("lastQuoteNumber");this.allFieldsNames.add("orderSequenceEnumId");this.allFieldsNames.add("orderIdPrefix");this.allFieldsNames.add("lastOrderNumber");this.allFieldsNames.add("refundPaymentMethodId");this.allFieldsNames.add("errorGlJournalId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");this.allFieldsNames.add("costingMethodId");this.allFieldsNames.add("salesInvoiceFooterText");this.allFieldsNames.add("groupSalesTaxOnInvoicePdf");this.allFieldsNames.add("allocPaymentTagsToAppl");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyAcctgPreference(RepositoryInterface repository) {
      this();
      initRepository(repository);
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
     * @param fiscalYearStartMonth the fiscalYearStartMonth to set
     */
    public void setFiscalYearStartMonth(Long fiscalYearStartMonth) {
        this.fiscalYearStartMonth = fiscalYearStartMonth;
    }
    /**
     * Auto generated value setter.
     * @param fiscalYearStartDay the fiscalYearStartDay to set
     */
    public void setFiscalYearStartDay(Long fiscalYearStartDay) {
        this.fiscalYearStartDay = fiscalYearStartDay;
    }
    /**
     * Auto generated value setter.
     * @param taxFormId the taxFormId to set
     */
    public void setTaxFormId(String taxFormId) {
        this.taxFormId = taxFormId;
    }
    /**
     * Auto generated value setter.
     * @param cogsMethodId the cogsMethodId to set
     */
    public void setCogsMethodId(String cogsMethodId) {
        this.cogsMethodId = cogsMethodId;
    }
    /**
     * Auto generated value setter.
     * @param baseCurrencyUomId the baseCurrencyUomId to set
     */
    public void setBaseCurrencyUomId(String baseCurrencyUomId) {
        this.baseCurrencyUomId = baseCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceSequenceEnumId the invoiceSequenceEnumId to set
     */
    public void setInvoiceSequenceEnumId(String invoiceSequenceEnumId) {
        this.invoiceSequenceEnumId = invoiceSequenceEnumId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceIdPrefix the invoiceIdPrefix to set
     */
    public void setInvoiceIdPrefix(String invoiceIdPrefix) {
        this.invoiceIdPrefix = invoiceIdPrefix;
    }
    /**
     * Auto generated value setter.
     * @param lastInvoiceNumber the lastInvoiceNumber to set
     */
    public void setLastInvoiceNumber(Long lastInvoiceNumber) {
        this.lastInvoiceNumber = lastInvoiceNumber;
    }
    /**
     * Auto generated value setter.
     * @param lastInvoiceRestartDate the lastInvoiceRestartDate to set
     */
    public void setLastInvoiceRestartDate(Timestamp lastInvoiceRestartDate) {
        this.lastInvoiceRestartDate = lastInvoiceRestartDate;
    }
    /**
     * Auto generated value setter.
     * @param useInvoiceIdForReturns the useInvoiceIdForReturns to set
     */
    public void setUseInvoiceIdForReturns(String useInvoiceIdForReturns) {
        this.useInvoiceIdForReturns = useInvoiceIdForReturns;
    }
    /**
     * Auto generated value setter.
     * @param quoteSequenceEnumId the quoteSequenceEnumId to set
     */
    public void setQuoteSequenceEnumId(String quoteSequenceEnumId) {
        this.quoteSequenceEnumId = quoteSequenceEnumId;
    }
    /**
     * Auto generated value setter.
     * @param quoteIdPrefix the quoteIdPrefix to set
     */
    public void setQuoteIdPrefix(String quoteIdPrefix) {
        this.quoteIdPrefix = quoteIdPrefix;
    }
    /**
     * Auto generated value setter.
     * @param lastQuoteNumber the lastQuoteNumber to set
     */
    public void setLastQuoteNumber(Long lastQuoteNumber) {
        this.lastQuoteNumber = lastQuoteNumber;
    }
    /**
     * Auto generated value setter.
     * @param orderSequenceEnumId the orderSequenceEnumId to set
     */
    public void setOrderSequenceEnumId(String orderSequenceEnumId) {
        this.orderSequenceEnumId = orderSequenceEnumId;
    }
    /**
     * Auto generated value setter.
     * @param orderIdPrefix the orderIdPrefix to set
     */
    public void setOrderIdPrefix(String orderIdPrefix) {
        this.orderIdPrefix = orderIdPrefix;
    }
    /**
     * Auto generated value setter.
     * @param lastOrderNumber the lastOrderNumber to set
     */
    public void setLastOrderNumber(Long lastOrderNumber) {
        this.lastOrderNumber = lastOrderNumber;
    }
    /**
     * Auto generated value setter.
     * @param refundPaymentMethodId the refundPaymentMethodId to set
     */
    public void setRefundPaymentMethodId(String refundPaymentMethodId) {
        this.refundPaymentMethodId = refundPaymentMethodId;
    }
    /**
     * Auto generated value setter.
     * @param errorGlJournalId the errorGlJournalId to set
     */
    public void setErrorGlJournalId(String errorGlJournalId) {
        this.errorGlJournalId = errorGlJournalId;
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
     * Auto generated value setter.
     * @param costingMethodId the costingMethodId to set
     */
    public void setCostingMethodId(String costingMethodId) {
        this.costingMethodId = costingMethodId;
    }
    /**
     * Auto generated value setter.
     * @param salesInvoiceFooterText the salesInvoiceFooterText to set
     */
    public void setSalesInvoiceFooterText(String salesInvoiceFooterText) {
        this.salesInvoiceFooterText = salesInvoiceFooterText;
    }
    /**
     * Auto generated value setter.
     * @param groupSalesTaxOnInvoicePdf the groupSalesTaxOnInvoicePdf to set
     */
    public void setGroupSalesTaxOnInvoicePdf(String groupSalesTaxOnInvoicePdf) {
        this.groupSalesTaxOnInvoicePdf = groupSalesTaxOnInvoicePdf;
    }
    /**
     * Auto generated value setter.
     * @param allocPaymentTagsToAppl the allocPaymentTagsToAppl to set
     */
    public void setAllocPaymentTagsToAppl(String allocPaymentTagsToAppl) {
        this.allocPaymentTagsToAppl = allocPaymentTagsToAppl;
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
     * @return <code>Long</code>
     */
    public Long getFiscalYearStartMonth() {
        return this.fiscalYearStartMonth;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getFiscalYearStartDay() {
        return this.fiscalYearStartDay;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxFormId() {
        return this.taxFormId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCogsMethodId() {
        return this.cogsMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBaseCurrencyUomId() {
        return this.baseCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceSequenceEnumId() {
        return this.invoiceSequenceEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceIdPrefix() {
        return this.invoiceIdPrefix;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getLastInvoiceNumber() {
        return this.lastInvoiceNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastInvoiceRestartDate() {
        return this.lastInvoiceRestartDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUseInvoiceIdForReturns() {
        return this.useInvoiceIdForReturns;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuoteSequenceEnumId() {
        return this.quoteSequenceEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuoteIdPrefix() {
        return this.quoteIdPrefix;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getLastQuoteNumber() {
        return this.lastQuoteNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderSequenceEnumId() {
        return this.orderSequenceEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderIdPrefix() {
        return this.orderIdPrefix;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getLastOrderNumber() {
        return this.lastOrderNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRefundPaymentMethodId() {
        return this.refundPaymentMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getErrorGlJournalId() {
        return this.errorGlJournalId;
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
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCostingMethodId() {
        return this.costingMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalesInvoiceFooterText() {
        return this.salesInvoiceFooterText;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupSalesTaxOnInvoicePdf() {
        return this.groupSalesTaxOnInvoicePdf;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllocPaymentTagsToAppl() {
        return this.allocPaymentTagsToAppl;
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
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>TaxFormEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getTaxFormEnumeration() throws RepositoryException {
        if (this.taxFormEnumeration == null) {
            this.taxFormEnumeration = getRelatedOne(Enumeration.class, "TaxFormEnumeration");
        }
        return this.taxFormEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>CogsEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getCogsEnumeration() throws RepositoryException {
        if (this.cogsEnumeration == null) {
            this.cogsEnumeration = getRelatedOne(Enumeration.class, "CogsEnumeration");
        }
        return this.cogsEnumeration;
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
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>InvoiceSequenceEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getInvoiceSequenceEnumeration() throws RepositoryException {
        if (this.invoiceSequenceEnumeration == null) {
            this.invoiceSequenceEnumeration = getRelatedOne(Enumeration.class, "InvoiceSequenceEnumeration");
        }
        return this.invoiceSequenceEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>QuoteSequenceEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getQuoteSequenceEnumeration() throws RepositoryException {
        if (this.quoteSequenceEnumeration == null) {
            this.quoteSequenceEnumeration = getRelatedOne(Enumeration.class, "QuoteSequenceEnumeration");
        }
        return this.quoteSequenceEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>OrderSequenceEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getOrderSequenceEnumeration() throws RepositoryException {
        if (this.orderSequenceEnumeration == null) {
            this.orderSequenceEnumeration = getRelatedOne(Enumeration.class, "OrderSequenceEnumeration");
        }
        return this.orderSequenceEnumeration;
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
     * Auto generated method that gets the related <code>GlJournal</code> by the relation named <code>GlJournal</code>.
     * @return the <code>GlJournal</code>
     * @throws RepositoryException if an error occurs
     */
    public GlJournal getGlJournal() throws RepositoryException {
        if (this.glJournal == null) {
            this.glJournal = getRelatedOne(GlJournal.class, "GlJournal");
        }
        return this.glJournal;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>CostingMethodEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getCostingMethodEnumeration() throws RepositoryException {
        if (this.costingMethodEnumeration == null) {
            this.costingMethodEnumeration = getRelatedOne(Enumeration.class, "CostingMethodEnumeration");
        }
        return this.costingMethodEnumeration;
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
     * @param taxFormEnumeration the taxFormEnumeration to set
    */
    public void setTaxFormEnumeration(Enumeration taxFormEnumeration) {
        this.taxFormEnumeration = taxFormEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param cogsEnumeration the cogsEnumeration to set
    */
    public void setCogsEnumeration(Enumeration cogsEnumeration) {
        this.cogsEnumeration = cogsEnumeration;
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
     * @param invoiceSequenceEnumeration the invoiceSequenceEnumeration to set
    */
    public void setInvoiceSequenceEnumeration(Enumeration invoiceSequenceEnumeration) {
        this.invoiceSequenceEnumeration = invoiceSequenceEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param quoteSequenceEnumeration the quoteSequenceEnumeration to set
    */
    public void setQuoteSequenceEnumeration(Enumeration quoteSequenceEnumeration) {
        this.quoteSequenceEnumeration = quoteSequenceEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param orderSequenceEnumeration the orderSequenceEnumeration to set
    */
    public void setOrderSequenceEnumeration(Enumeration orderSequenceEnumeration) {
        this.orderSequenceEnumeration = orderSequenceEnumeration;
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
     * @param glJournal the glJournal to set
    */
    public void setGlJournal(GlJournal glJournal) {
        this.glJournal = glJournal;
    }
    /**
     * Auto generated value setter.
     * @param costingMethodEnumeration the costingMethodEnumeration to set
    */
    public void setCostingMethodEnumeration(Enumeration costingMethodEnumeration) {
        this.costingMethodEnumeration = costingMethodEnumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setFiscalYearStartMonth((Long) mapValue.get("fiscalYearStartMonth"));
        setFiscalYearStartDay((Long) mapValue.get("fiscalYearStartDay"));
        setTaxFormId((String) mapValue.get("taxFormId"));
        setCogsMethodId((String) mapValue.get("cogsMethodId"));
        setBaseCurrencyUomId((String) mapValue.get("baseCurrencyUomId"));
        setInvoiceSequenceEnumId((String) mapValue.get("invoiceSequenceEnumId"));
        setInvoiceIdPrefix((String) mapValue.get("invoiceIdPrefix"));
        setLastInvoiceNumber((Long) mapValue.get("lastInvoiceNumber"));
        setLastInvoiceRestartDate((Timestamp) mapValue.get("lastInvoiceRestartDate"));
        setUseInvoiceIdForReturns((String) mapValue.get("useInvoiceIdForReturns"));
        setQuoteSequenceEnumId((String) mapValue.get("quoteSequenceEnumId"));
        setQuoteIdPrefix((String) mapValue.get("quoteIdPrefix"));
        setLastQuoteNumber((Long) mapValue.get("lastQuoteNumber"));
        setOrderSequenceEnumId((String) mapValue.get("orderSequenceEnumId"));
        setOrderIdPrefix((String) mapValue.get("orderIdPrefix"));
        setLastOrderNumber((Long) mapValue.get("lastOrderNumber"));
        setRefundPaymentMethodId((String) mapValue.get("refundPaymentMethodId"));
        setErrorGlJournalId((String) mapValue.get("errorGlJournalId"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        setCostingMethodId((String) mapValue.get("costingMethodId"));
        setSalesInvoiceFooterText((String) mapValue.get("salesInvoiceFooterText"));
        setGroupSalesTaxOnInvoicePdf((String) mapValue.get("groupSalesTaxOnInvoicePdf"));
        setAllocPaymentTagsToAppl((String) mapValue.get("allocPaymentTagsToAppl"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("fiscalYearStartMonth", getFiscalYearStartMonth());
        mapValue.put("fiscalYearStartDay", getFiscalYearStartDay());
        mapValue.put("taxFormId", getTaxFormId());
        mapValue.put("cogsMethodId", getCogsMethodId());
        mapValue.put("baseCurrencyUomId", getBaseCurrencyUomId());
        mapValue.put("invoiceSequenceEnumId", getInvoiceSequenceEnumId());
        mapValue.put("invoiceIdPrefix", getInvoiceIdPrefix());
        mapValue.put("lastInvoiceNumber", getLastInvoiceNumber());
        mapValue.put("lastInvoiceRestartDate", getLastInvoiceRestartDate());
        mapValue.put("useInvoiceIdForReturns", getUseInvoiceIdForReturns());
        mapValue.put("quoteSequenceEnumId", getQuoteSequenceEnumId());
        mapValue.put("quoteIdPrefix", getQuoteIdPrefix());
        mapValue.put("lastQuoteNumber", getLastQuoteNumber());
        mapValue.put("orderSequenceEnumId", getOrderSequenceEnumId());
        mapValue.put("orderIdPrefix", getOrderIdPrefix());
        mapValue.put("lastOrderNumber", getLastOrderNumber());
        mapValue.put("refundPaymentMethodId", getRefundPaymentMethodId());
        mapValue.put("errorGlJournalId", getErrorGlJournalId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        mapValue.put("costingMethodId", getCostingMethodId());
        mapValue.put("salesInvoiceFooterText", getSalesInvoiceFooterText());
        mapValue.put("groupSalesTaxOnInvoicePdf", getGroupSalesTaxOnInvoicePdf());
        mapValue.put("allocPaymentTagsToAppl", getAllocPaymentTagsToAppl());
        return mapValue;
    }


}