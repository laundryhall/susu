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
 * Auto generated base entity InventoryItemType.
 */
@javax.persistence.Entity
@Table(name="INVENTORY_ITEM_TYPE")
public class InventoryItemType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("inventoryItemTypeId", "INVENTORY_ITEM_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("InventoryItemType", fields);
}
  public static enum Fields implements EntityFieldInterface<InventoryItemType> {
    inventoryItemTypeId("inventoryItemTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="InventoryItemType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="InventoryItemType_GEN")
   @Id
   @Column(name="INVENTORY_ITEM_TYPE_ID")
   private String inventoryItemTypeId;
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
   
   private InventoryItemType parentInventoryItemType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="defaultInventoryItemType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="DEFAULT_INVENTORY_ITEM_TYPE_ID")
   
   private List<Facility> defaultFacilitys = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="inventoryItemType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="INVENTORY_ITEM_TYPE_ID")
   
   private List<InventoryItem> inventoryItems = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentInventoryItemType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<InventoryItemType> childInventoryItemTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="inventoryItemType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="INVENTORY_ITEM_TYPE_ID")
   
   private List<InventoryItemTypeAttr> inventoryItemTypeAttrs = null;

  /**
   * Default constructor.
   */
  public InventoryItemType() {
      super();
      this.baseEntityName = "InventoryItemType";
      this.isView = false;
      this.resourceName = "ProductEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("inventoryItemTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("inventoryItemTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InventoryItemType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param inventoryItemTypeId the inventoryItemTypeId to set
     */
    public void setInventoryItemTypeId(String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
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
    public String getInventoryItemTypeId() {
        return this.inventoryItemTypeId;
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
     * Auto generated method that gets the related <code>InventoryItemType</code> by the relation named <code>ParentInventoryItemType</code>.
     * @return the <code>InventoryItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItemType getParentInventoryItemType() throws RepositoryException {
        if (this.parentInventoryItemType == null) {
            this.parentInventoryItemType = getRelatedOne(InventoryItemType.class, "ParentInventoryItemType");
        }
        return this.parentInventoryItemType;
    }
    /**
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>DefaultFacility</code>.
     * @return the list of <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Facility> getDefaultFacilitys() throws RepositoryException {
        if (this.defaultFacilitys == null) {
            this.defaultFacilitys = getRelated(Facility.class, "DefaultFacility");
        }
        return this.defaultFacilitys;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItem</code> by the relation named <code>InventoryItem</code>.
     * @return the list of <code>InventoryItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItem> getInventoryItems() throws RepositoryException {
        if (this.inventoryItems == null) {
            this.inventoryItems = getRelated(InventoryItem.class, "InventoryItem");
        }
        return this.inventoryItems;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemType</code> by the relation named <code>ChildInventoryItemType</code>.
     * @return the list of <code>InventoryItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItemType> getChildInventoryItemTypes() throws RepositoryException {
        if (this.childInventoryItemTypes == null) {
            this.childInventoryItemTypes = getRelated(InventoryItemType.class, "ChildInventoryItemType");
        }
        return this.childInventoryItemTypes;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemTypeAttr</code> by the relation named <code>InventoryItemTypeAttr</code>.
     * @return the list of <code>InventoryItemTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItemTypeAttr> getInventoryItemTypeAttrs() throws RepositoryException {
        if (this.inventoryItemTypeAttrs == null) {
            this.inventoryItemTypeAttrs = getRelated(InventoryItemTypeAttr.class, "InventoryItemTypeAttr");
        }
        return this.inventoryItemTypeAttrs;
    }

    /**
     * Auto generated value setter.
     * @param parentInventoryItemType the parentInventoryItemType to set
    */
    public void setParentInventoryItemType(InventoryItemType parentInventoryItemType) {
        this.parentInventoryItemType = parentInventoryItemType;
    }
    /**
     * Auto generated value setter.
     * @param defaultFacilitys the defaultFacilitys to set
    */
    public void setDefaultFacilitys(List<Facility> defaultFacilitys) {
        this.defaultFacilitys = defaultFacilitys;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItems the inventoryItems to set
    */
    public void setInventoryItems(List<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }
    /**
     * Auto generated value setter.
     * @param childInventoryItemTypes the childInventoryItemTypes to set
    */
    public void setChildInventoryItemTypes(List<InventoryItemType> childInventoryItemTypes) {
        this.childInventoryItemTypes = childInventoryItemTypes;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemTypeAttrs the inventoryItemTypeAttrs to set
    */
    public void setInventoryItemTypeAttrs(List<InventoryItemTypeAttr> inventoryItemTypeAttrs) {
        this.inventoryItemTypeAttrs = inventoryItemTypeAttrs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addInventoryItemTypeAttr(InventoryItemTypeAttr inventoryItemTypeAttr) {
        if (this.inventoryItemTypeAttrs == null) {
            this.inventoryItemTypeAttrs = new ArrayList<InventoryItemTypeAttr>();
        }
        this.inventoryItemTypeAttrs.add(inventoryItemTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeInventoryItemTypeAttr(InventoryItemTypeAttr inventoryItemTypeAttr) {
        if (this.inventoryItemTypeAttrs == null) {
            return;
        }
        this.inventoryItemTypeAttrs.remove(inventoryItemTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearInventoryItemTypeAttr() {
        if (this.inventoryItemTypeAttrs == null) {
            return;
        }
        this.inventoryItemTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInventoryItemTypeId((String) mapValue.get("inventoryItemTypeId"));
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
        mapValue.put("inventoryItemTypeId", getInventoryItemTypeId());
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
