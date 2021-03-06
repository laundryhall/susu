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
 * Auto generated base entity CostComponentType.
 */
@javax.persistence.Entity
@Table(name="COST_COMPONENT_TYPE")
public class CostComponentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("costComponentTypeId", "COST_COMPONENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CostComponentType", fields);
}
  public static enum Fields implements EntityFieldInterface<CostComponentType> {
    costComponentTypeId("costComponentTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="CostComponentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="CostComponentType_GEN")
   @Id
   @Column(name="COST_COMPONENT_TYPE_ID")
   private String costComponentTypeId;
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
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CostComponentType parentCostComponentType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="costComponentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="COST_COMPONENT_TYPE_ID")
   
   private List<CostComponent> costComponents = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentCostComponentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<CostComponentType> childCostComponentTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="costComponentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="COST_COMPONENT_TYPE_ID")
   
   private List<CostComponentTypeAttr> costComponentTypeAttrs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="costComponentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="COST_COMPONENT_TYPE_ID")
   
   private List<WorkEffortCostCalc> workEffortCostCalcs = null;

  /**
   * Default constructor.
   */
  public CostComponentType() {
      super();
      this.baseEntityName = "CostComponentType";
      this.isView = false;
      this.resourceName = "ProductEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("costComponentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("costComponentTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CostComponentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param costComponentTypeId the costComponentTypeId to set
     */
    public void setCostComponentTypeId(String costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId;
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
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCostComponentTypeId() {
        return this.costComponentTypeId;
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
     * Auto generated method that gets the related <code>CostComponentType</code> by the relation named <code>ParentCostComponentType</code>.
     * @return the <code>CostComponentType</code>
     * @throws RepositoryException if an error occurs
     */
    public CostComponentType getParentCostComponentType() throws RepositoryException {
        if (this.parentCostComponentType == null) {
            this.parentCostComponentType = getRelatedOne(CostComponentType.class, "ParentCostComponentType");
        }
        return this.parentCostComponentType;
    }
    /**
     * Auto generated method that gets the related <code>CostComponent</code> by the relation named <code>CostComponent</code>.
     * @return the list of <code>CostComponent</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CostComponent> getCostComponents() throws RepositoryException {
        if (this.costComponents == null) {
            this.costComponents = getRelated(CostComponent.class, "CostComponent");
        }
        return this.costComponents;
    }
    /**
     * Auto generated method that gets the related <code>CostComponentType</code> by the relation named <code>ChildCostComponentType</code>.
     * @return the list of <code>CostComponentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CostComponentType> getChildCostComponentTypes() throws RepositoryException {
        if (this.childCostComponentTypes == null) {
            this.childCostComponentTypes = getRelated(CostComponentType.class, "ChildCostComponentType");
        }
        return this.childCostComponentTypes;
    }
    /**
     * Auto generated method that gets the related <code>CostComponentTypeAttr</code> by the relation named <code>CostComponentTypeAttr</code>.
     * @return the list of <code>CostComponentTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CostComponentTypeAttr> getCostComponentTypeAttrs() throws RepositoryException {
        if (this.costComponentTypeAttrs == null) {
            this.costComponentTypeAttrs = getRelated(CostComponentTypeAttr.class, "CostComponentTypeAttr");
        }
        return this.costComponentTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortCostCalc</code> by the relation named <code>WorkEffortCostCalc</code>.
     * @return the list of <code>WorkEffortCostCalc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortCostCalc> getWorkEffortCostCalcs() throws RepositoryException {
        if (this.workEffortCostCalcs == null) {
            this.workEffortCostCalcs = getRelated(WorkEffortCostCalc.class, "WorkEffortCostCalc");
        }
        return this.workEffortCostCalcs;
    }

    /**
     * Auto generated value setter.
     * @param parentCostComponentType the parentCostComponentType to set
    */
    public void setParentCostComponentType(CostComponentType parentCostComponentType) {
        this.parentCostComponentType = parentCostComponentType;
    }
    /**
     * Auto generated value setter.
     * @param costComponents the costComponents to set
    */
    public void setCostComponents(List<CostComponent> costComponents) {
        this.costComponents = costComponents;
    }
    /**
     * Auto generated value setter.
     * @param childCostComponentTypes the childCostComponentTypes to set
    */
    public void setChildCostComponentTypes(List<CostComponentType> childCostComponentTypes) {
        this.childCostComponentTypes = childCostComponentTypes;
    }
    /**
     * Auto generated value setter.
     * @param costComponentTypeAttrs the costComponentTypeAttrs to set
    */
    public void setCostComponentTypeAttrs(List<CostComponentTypeAttr> costComponentTypeAttrs) {
        this.costComponentTypeAttrs = costComponentTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param workEffortCostCalcs the workEffortCostCalcs to set
    */
    public void setWorkEffortCostCalcs(List<WorkEffortCostCalc> workEffortCostCalcs) {
        this.workEffortCostCalcs = workEffortCostCalcs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addCostComponentTypeAttr(CostComponentTypeAttr costComponentTypeAttr) {
        if (this.costComponentTypeAttrs == null) {
            this.costComponentTypeAttrs = new ArrayList<CostComponentTypeAttr>();
        }
        this.costComponentTypeAttrs.add(costComponentTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeCostComponentTypeAttr(CostComponentTypeAttr costComponentTypeAttr) {
        if (this.costComponentTypeAttrs == null) {
            return;
        }
        this.costComponentTypeAttrs.remove(costComponentTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearCostComponentTypeAttr() {
        if (this.costComponentTypeAttrs == null) {
            return;
        }
        this.costComponentTypeAttrs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortCostCalc(WorkEffortCostCalc workEffortCostCalc) {
        if (this.workEffortCostCalcs == null) {
            this.workEffortCostCalcs = new ArrayList<WorkEffortCostCalc>();
        }
        this.workEffortCostCalcs.add(workEffortCostCalc);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortCostCalc(WorkEffortCostCalc workEffortCostCalc) {
        if (this.workEffortCostCalcs == null) {
            return;
        }
        this.workEffortCostCalcs.remove(workEffortCostCalc);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortCostCalc() {
        if (this.workEffortCostCalcs == null) {
            return;
        }
        this.workEffortCostCalcs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCostComponentTypeId((String) mapValue.get("costComponentTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("costComponentTypeId", getCostComponentTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
