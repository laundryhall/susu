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
import java.sql.Timestamp;

/**
 * Auto generated base entity PaymentType.
 */
@javax.persistence.Entity
@Table(name="PAYMENT_TYPE")
public class PaymentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentTypeId", "PAYMENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
        fields.put("systemUse", "SYSTEM_USE");
fieldMapColumns.put("PaymentType", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentType> {
    paymentTypeId("paymentTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp"),
    systemUse("systemUse");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="PaymentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PaymentType_GEN")
   @Id
   @Column(name="PAYMENT_TYPE_ID")
   private String paymentTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @Column(name="SYSTEM_USE")
   private String systemUse;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentType parentPaymentType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_TYPE_ID")
   
   private List<EmployeePaycheckType> employeePaycheckTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_TYPE_ID")
   
   private List<PaycheckTypeItemTypeAssoc> paycheckTypeItemTypeAssocs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_TYPE_ID")
   
   private List<Payment> payments = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_TYPE_ID")
   
   private List<PaymentGlAccountTypeMap> paymentGlAccountTypeMaps = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentPaymentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<PaymentType> childPaymentTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_TYPE_ID")
   
   private List<PaymentTypeAttr> paymentTypeAttrs = null;

  /**
   * Default constructor.
   */
  public PaymentType() {
      super();
      this.baseEntityName = "PaymentType";
      this.isView = false;
      this.resourceName = "AccountingEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");this.allFieldsNames.add("systemUse");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentTypeId the paymentTypeId to set
     */
    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
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
     * @param systemUse the systemUse to set
     */
    public void setSystemUse(String systemUse) {
        this.systemUse = systemUse;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaymentTypeId() {
        return this.paymentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
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
    public String getSystemUse() {
        return this.systemUse;
    }

    /**
     * Auto generated method that gets the related <code>PaymentType</code> by the relation named <code>ParentPaymentType</code>.
     * @return the <code>PaymentType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentType getParentPaymentType() throws RepositoryException {
        if (this.parentPaymentType == null) {
            this.parentPaymentType = getRelatedOne(PaymentType.class, "ParentPaymentType");
        }
        return this.parentPaymentType;
    }
    /**
     * Auto generated method that gets the related <code>EmployeePaycheckType</code> by the relation named <code>EmployeePaycheckType</code>.
     * @return the list of <code>EmployeePaycheckType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmployeePaycheckType> getEmployeePaycheckTypes() throws RepositoryException {
        if (this.employeePaycheckTypes == null) {
            this.employeePaycheckTypes = getRelated(EmployeePaycheckType.class, "EmployeePaycheckType");
        }
        return this.employeePaycheckTypes;
    }
    /**
     * Auto generated method that gets the related <code>PaycheckTypeItemTypeAssoc</code> by the relation named <code>PaycheckTypeItemTypeAssoc</code>.
     * @return the list of <code>PaycheckTypeItemTypeAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaycheckTypeItemTypeAssoc> getPaycheckTypeItemTypeAssocs() throws RepositoryException {
        if (this.paycheckTypeItemTypeAssocs == null) {
            this.paycheckTypeItemTypeAssocs = getRelated(PaycheckTypeItemTypeAssoc.class, "PaycheckTypeItemTypeAssoc");
        }
        return this.paycheckTypeItemTypeAssocs;
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
     * Auto generated method that gets the related <code>PaymentGlAccountTypeMap</code> by the relation named <code>PaymentGlAccountTypeMap</code>.
     * @return the list of <code>PaymentGlAccountTypeMap</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentGlAccountTypeMap> getPaymentGlAccountTypeMaps() throws RepositoryException {
        if (this.paymentGlAccountTypeMaps == null) {
            this.paymentGlAccountTypeMaps = getRelated(PaymentGlAccountTypeMap.class, "PaymentGlAccountTypeMap");
        }
        return this.paymentGlAccountTypeMaps;
    }
    /**
     * Auto generated method that gets the related <code>PaymentType</code> by the relation named <code>ChildPaymentType</code>.
     * @return the list of <code>PaymentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentType> getChildPaymentTypes() throws RepositoryException {
        if (this.childPaymentTypes == null) {
            this.childPaymentTypes = getRelated(PaymentType.class, "ChildPaymentType");
        }
        return this.childPaymentTypes;
    }
    /**
     * Auto generated method that gets the related <code>PaymentTypeAttr</code> by the relation named <code>PaymentTypeAttr</code>.
     * @return the list of <code>PaymentTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentTypeAttr> getPaymentTypeAttrs() throws RepositoryException {
        if (this.paymentTypeAttrs == null) {
            this.paymentTypeAttrs = getRelated(PaymentTypeAttr.class, "PaymentTypeAttr");
        }
        return this.paymentTypeAttrs;
    }

    /**
     * Auto generated value setter.
     * @param parentPaymentType the parentPaymentType to set
    */
    public void setParentPaymentType(PaymentType parentPaymentType) {
        this.parentPaymentType = parentPaymentType;
    }
    /**
     * Auto generated value setter.
     * @param employeePaycheckTypes the employeePaycheckTypes to set
    */
    public void setEmployeePaycheckTypes(List<EmployeePaycheckType> employeePaycheckTypes) {
        this.employeePaycheckTypes = employeePaycheckTypes;
    }
    /**
     * Auto generated value setter.
     * @param paycheckTypeItemTypeAssocs the paycheckTypeItemTypeAssocs to set
    */
    public void setPaycheckTypeItemTypeAssocs(List<PaycheckTypeItemTypeAssoc> paycheckTypeItemTypeAssocs) {
        this.paycheckTypeItemTypeAssocs = paycheckTypeItemTypeAssocs;
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
     * @param paymentGlAccountTypeMaps the paymentGlAccountTypeMaps to set
    */
    public void setPaymentGlAccountTypeMaps(List<PaymentGlAccountTypeMap> paymentGlAccountTypeMaps) {
        this.paymentGlAccountTypeMaps = paymentGlAccountTypeMaps;
    }
    /**
     * Auto generated value setter.
     * @param childPaymentTypes the childPaymentTypes to set
    */
    public void setChildPaymentTypes(List<PaymentType> childPaymentTypes) {
        this.childPaymentTypes = childPaymentTypes;
    }
    /**
     * Auto generated value setter.
     * @param paymentTypeAttrs the paymentTypeAttrs to set
    */
    public void setPaymentTypeAttrs(List<PaymentTypeAttr> paymentTypeAttrs) {
        this.paymentTypeAttrs = paymentTypeAttrs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addEmployeePaycheckType(EmployeePaycheckType employeePaycheckType) {
        if (this.employeePaycheckTypes == null) {
            this.employeePaycheckTypes = new ArrayList<EmployeePaycheckType>();
        }
        this.employeePaycheckTypes.add(employeePaycheckType);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEmployeePaycheckType(EmployeePaycheckType employeePaycheckType) {
        if (this.employeePaycheckTypes == null) {
            return;
        }
        this.employeePaycheckTypes.remove(employeePaycheckType);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEmployeePaycheckType() {
        if (this.employeePaycheckTypes == null) {
            return;
        }
        this.employeePaycheckTypes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addPaycheckTypeItemTypeAssoc(PaycheckTypeItemTypeAssoc paycheckTypeItemTypeAssoc) {
        if (this.paycheckTypeItemTypeAssocs == null) {
            this.paycheckTypeItemTypeAssocs = new ArrayList<PaycheckTypeItemTypeAssoc>();
        }
        this.paycheckTypeItemTypeAssocs.add(paycheckTypeItemTypeAssoc);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePaycheckTypeItemTypeAssoc(PaycheckTypeItemTypeAssoc paycheckTypeItemTypeAssoc) {
        if (this.paycheckTypeItemTypeAssocs == null) {
            return;
        }
        this.paycheckTypeItemTypeAssocs.remove(paycheckTypeItemTypeAssoc);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPaycheckTypeItemTypeAssoc() {
        if (this.paycheckTypeItemTypeAssocs == null) {
            return;
        }
        this.paycheckTypeItemTypeAssocs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addPaymentGlAccountTypeMap(PaymentGlAccountTypeMap paymentGlAccountTypeMap) {
        if (this.paymentGlAccountTypeMaps == null) {
            this.paymentGlAccountTypeMaps = new ArrayList<PaymentGlAccountTypeMap>();
        }
        this.paymentGlAccountTypeMaps.add(paymentGlAccountTypeMap);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePaymentGlAccountTypeMap(PaymentGlAccountTypeMap paymentGlAccountTypeMap) {
        if (this.paymentGlAccountTypeMaps == null) {
            return;
        }
        this.paymentGlAccountTypeMaps.remove(paymentGlAccountTypeMap);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPaymentGlAccountTypeMap() {
        if (this.paymentGlAccountTypeMaps == null) {
            return;
        }
        this.paymentGlAccountTypeMaps.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addPaymentTypeAttr(PaymentTypeAttr paymentTypeAttr) {
        if (this.paymentTypeAttrs == null) {
            this.paymentTypeAttrs = new ArrayList<PaymentTypeAttr>();
        }
        this.paymentTypeAttrs.add(paymentTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removePaymentTypeAttr(PaymentTypeAttr paymentTypeAttr) {
        if (this.paymentTypeAttrs == null) {
            return;
        }
        this.paymentTypeAttrs.remove(paymentTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearPaymentTypeAttr() {
        if (this.paymentTypeAttrs == null) {
            return;
        }
        this.paymentTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentTypeId((String) mapValue.get("paymentTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setDescription((String) mapValue.get("description"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        setSystemUse((String) mapValue.get("systemUse"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("paymentTypeId", getPaymentTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        mapValue.put("systemUse", getSystemUse());
        return mapValue;
    }


}
