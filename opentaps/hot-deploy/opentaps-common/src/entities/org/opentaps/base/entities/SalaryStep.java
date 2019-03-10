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
 * Auto generated base entity SalaryStep.
 */
@javax.persistence.Entity
@Table(name="SALARY_STEP")
public class SalaryStep extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("salaryStepSeqId", "SALARY_STEP_SEQ_ID");
        fields.put("payGradeId", "PAY_GRADE_ID");
        fields.put("dateModified", "DATE_MODIFIED");
        fields.put("amount", "AMOUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SalaryStep", fields);
}
  public static enum Fields implements EntityFieldInterface<SalaryStep> {
    salaryStepSeqId("salaryStepSeqId"),
    payGradeId("payGradeId"),
    dateModified("dateModified"),
    amount("amount"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.SalaryStepPkBridge.class)
     private SalaryStepPk id = new SalaryStepPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>SalaryStepPk</code>
     */
      public SalaryStepPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>SalaryStepPk</code> value to set
    */   
      public void setId(SalaryStepPk id) {
         this.id = id;
      }
   @Column(name="DATE_MODIFIED")
   private Timestamp dateModified;
   @Column(name="AMOUNT")
   private BigDecimal amount;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAY_GRADE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PayGrade payGrade = null;
   private transient List<EmplPositionTypeRate> emplPositionTypeRates = null;
   private transient List<OldEmplPositionTypeRate> oldEmplPositionTypeRates = null;
   private transient List<PayHistory> payHistorys = null;

  /**
   * Default constructor.
   */
  public SalaryStep() {
      super();
      this.baseEntityName = "SalaryStep";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("salaryStepSeqId");this.primaryKeyNames.add("payGradeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("salaryStepSeqId");this.allFieldsNames.add("payGradeId");this.allFieldsNames.add("dateModified");this.allFieldsNames.add("amount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SalaryStep(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param salaryStepSeqId the salaryStepSeqId to set
     */
    public void setSalaryStepSeqId(String salaryStepSeqId) {
        id.setSalaryStepSeqId(salaryStepSeqId);
    }
    /**
     * Auto generated value setter.
     * @param payGradeId the payGradeId to set
     */
    public void setPayGradeId(String payGradeId) {
        id.setPayGradeId(payGradeId);
    }
    /**
     * Auto generated value setter.
     * @param dateModified the dateModified to set
     */
    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
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
    public String getSalaryStepSeqId() {
        return this.id.getSalaryStepSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPayGradeId() {
        return this.id.getPayGradeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDateModified() {
        return this.dateModified;
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
     * Auto generated method that gets the related <code>PayGrade</code> by the relation named <code>PayGrade</code>.
     * @return the <code>PayGrade</code>
     * @throws RepositoryException if an error occurs
     */
    public PayGrade getPayGrade() throws RepositoryException {
        if (this.payGrade == null) {
            this.payGrade = getRelatedOne(PayGrade.class, "PayGrade");
        }
        return this.payGrade;
    }
    /**
     * Auto generated method that gets the related <code>EmplPositionTypeRate</code> by the relation named <code>EmplPositionTypeRate</code>.
     * @return the list of <code>EmplPositionTypeRate</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EmplPositionTypeRate> getEmplPositionTypeRates() throws RepositoryException {
        if (this.emplPositionTypeRates == null) {
            this.emplPositionTypeRates = getRelated(EmplPositionTypeRate.class, "EmplPositionTypeRate");
        }
        return this.emplPositionTypeRates;
    }
    /**
     * Auto generated method that gets the related <code>OldEmplPositionTypeRate</code> by the relation named <code>OldEmplPositionTypeRate</code>.
     * @return the list of <code>OldEmplPositionTypeRate</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OldEmplPositionTypeRate> getOldEmplPositionTypeRates() throws RepositoryException {
        if (this.oldEmplPositionTypeRates == null) {
            this.oldEmplPositionTypeRates = getRelated(OldEmplPositionTypeRate.class, "OldEmplPositionTypeRate");
        }
        return this.oldEmplPositionTypeRates;
    }
    /**
     * Auto generated method that gets the related <code>PayHistory</code> by the relation named <code>PayHistory</code>.
     * @return the list of <code>PayHistory</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PayHistory> getPayHistorys() throws RepositoryException {
        if (this.payHistorys == null) {
            this.payHistorys = getRelated(PayHistory.class, "PayHistory");
        }
        return this.payHistorys;
    }

    /**
     * Auto generated value setter.
     * @param payGrade the payGrade to set
    */
    public void setPayGrade(PayGrade payGrade) {
        this.payGrade = payGrade;
    }
    /**
     * Auto generated value setter.
     * @param emplPositionTypeRates the emplPositionTypeRates to set
    */
    public void setEmplPositionTypeRates(List<EmplPositionTypeRate> emplPositionTypeRates) {
        this.emplPositionTypeRates = emplPositionTypeRates;
    }
    /**
     * Auto generated value setter.
     * @param oldEmplPositionTypeRates the oldEmplPositionTypeRates to set
    */
    public void setOldEmplPositionTypeRates(List<OldEmplPositionTypeRate> oldEmplPositionTypeRates) {
        this.oldEmplPositionTypeRates = oldEmplPositionTypeRates;
    }
    /**
     * Auto generated value setter.
     * @param payHistorys the payHistorys to set
    */
    public void setPayHistorys(List<PayHistory> payHistorys) {
        this.payHistorys = payHistorys;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSalaryStepSeqId((String) mapValue.get("salaryStepSeqId"));
        setPayGradeId((String) mapValue.get("payGradeId"));
        setDateModified((Timestamp) mapValue.get("dateModified"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
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
        mapValue.put("salaryStepSeqId", getSalaryStepSeqId());
        mapValue.put("payGradeId", getPayGradeId());
        mapValue.put("dateModified", getDateModified());
        mapValue.put("amount", getAmount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}