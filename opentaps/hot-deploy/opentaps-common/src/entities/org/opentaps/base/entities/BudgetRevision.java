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
 * Auto generated base entity BudgetRevision.
 */
@javax.persistence.Entity
@Table(name="BUDGET_REVISION")
public class BudgetRevision extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("budgetId", "BUDGET_ID");
        fields.put("revisionSeqId", "REVISION_SEQ_ID");
        fields.put("dateRevised", "DATE_REVISED");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("BudgetRevision", fields);
}
  public static enum Fields implements EntityFieldInterface<BudgetRevision> {
    budgetId("budgetId"),
    revisionSeqId("revisionSeqId"),
    dateRevised("dateRevised"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.BudgetRevisionPkBridge.class)
     private BudgetRevisionPk id = new BudgetRevisionPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>BudgetRevisionPk</code>
     */
      public BudgetRevisionPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>BudgetRevisionPk</code> value to set
    */   
      public void setId(BudgetRevisionPk id) {
         this.id = id;
      }
   @Column(name="DATE_REVISED")
   private Timestamp dateRevised;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BUDGET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Budget budget = null;
   private transient List<BudgetRevisionImpact> budgetRevisionImpacts = null;

  /**
   * Default constructor.
   */
  public BudgetRevision() {
      super();
      this.baseEntityName = "BudgetRevision";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("budgetId");this.primaryKeyNames.add("revisionSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("budgetId");this.allFieldsNames.add("revisionSeqId");this.allFieldsNames.add("dateRevised");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BudgetRevision(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param budgetId the budgetId to set
     */
    public void setBudgetId(String budgetId) {
        id.setBudgetId(budgetId);
    }
    /**
     * Auto generated value setter.
     * @param revisionSeqId the revisionSeqId to set
     */
    public void setRevisionSeqId(String revisionSeqId) {
        id.setRevisionSeqId(revisionSeqId);
    }
    /**
     * Auto generated value setter.
     * @param dateRevised the dateRevised to set
     */
    public void setDateRevised(Timestamp dateRevised) {
        this.dateRevised = dateRevised;
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
    public String getBudgetId() {
        return this.id.getBudgetId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRevisionSeqId() {
        return this.id.getRevisionSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDateRevised() {
        return this.dateRevised;
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
     * Auto generated method that gets the related <code>Budget</code> by the relation named <code>Budget</code>.
     * @return the <code>Budget</code>
     * @throws RepositoryException if an error occurs
     */
    public Budget getBudget() throws RepositoryException {
        if (this.budget == null) {
            this.budget = getRelatedOne(Budget.class, "Budget");
        }
        return this.budget;
    }
    /**
     * Auto generated method that gets the related <code>BudgetRevisionImpact</code> by the relation named <code>BudgetRevisionImpact</code>.
     * @return the list of <code>BudgetRevisionImpact</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BudgetRevisionImpact> getBudgetRevisionImpacts() throws RepositoryException {
        if (this.budgetRevisionImpacts == null) {
            this.budgetRevisionImpacts = getRelated(BudgetRevisionImpact.class, "BudgetRevisionImpact");
        }
        return this.budgetRevisionImpacts;
    }

    /**
     * Auto generated value setter.
     * @param budget the budget to set
    */
    public void setBudget(Budget budget) {
        this.budget = budget;
    }
    /**
     * Auto generated value setter.
     * @param budgetRevisionImpacts the budgetRevisionImpacts to set
    */
    public void setBudgetRevisionImpacts(List<BudgetRevisionImpact> budgetRevisionImpacts) {
        this.budgetRevisionImpacts = budgetRevisionImpacts;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBudgetId((String) mapValue.get("budgetId"));
        setRevisionSeqId((String) mapValue.get("revisionSeqId"));
        setDateRevised((Timestamp) mapValue.get("dateRevised"));
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
        mapValue.put("budgetId", getBudgetId());
        mapValue.put("revisionSeqId", getRevisionSeqId());
        mapValue.put("dateRevised", getDateRevised());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
