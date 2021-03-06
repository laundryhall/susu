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
 * Auto generated base entity InventoryItemLabelAppl.
 */
@javax.persistence.Entity
@Table(name="INVENTORY_ITEM_LABEL_APPL")
public class InventoryItemLabelAppl extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("inventoryItemId", "INVENTORY_ITEM_ID");
        fields.put("inventoryItemLabelTypeId", "INVENTORY_ITEM_LABEL_TYPE_ID");
        fields.put("inventoryItemLabelId", "INVENTORY_ITEM_LABEL_ID");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("InventoryItemLabelAppl", fields);
}
  public static enum Fields implements EntityFieldInterface<InventoryItemLabelAppl> {
    inventoryItemId("inventoryItemId"),
    inventoryItemLabelTypeId("inventoryItemLabelTypeId"),
    inventoryItemLabelId("inventoryItemLabelId"),
    sequenceNum("sequenceNum"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.InventoryItemLabelApplPkBridge.class)
     private InventoryItemLabelApplPk id = new InventoryItemLabelApplPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>InventoryItemLabelApplPk</code>
     */
      public InventoryItemLabelApplPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>InventoryItemLabelApplPk</code> value to set
    */   
      public void setId(InventoryItemLabelApplPk id) {
         this.id = id;
      }
   @Column(name="INVENTORY_ITEM_LABEL_ID")
   private String inventoryItemLabelId;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryItem inventoryItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_ITEM_LABEL_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryItemLabelType inventoryItemLabelType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_ITEM_LABEL_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryItemLabel inventoryItemLabel = null;

  /**
   * Default constructor.
   */
  public InventoryItemLabelAppl() {
      super();
      this.baseEntityName = "InventoryItemLabelAppl";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("inventoryItemId");this.primaryKeyNames.add("inventoryItemLabelTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("inventoryItemLabelTypeId");this.allFieldsNames.add("inventoryItemLabelId");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InventoryItemLabelAppl(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        id.setInventoryItemId(inventoryItemId);
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemLabelTypeId the inventoryItemLabelTypeId to set
     */
    public void setInventoryItemLabelTypeId(String inventoryItemLabelTypeId) {
        id.setInventoryItemLabelTypeId(inventoryItemLabelTypeId);
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemLabelId the inventoryItemLabelId to set
     */
    public void setInventoryItemLabelId(String inventoryItemLabelId) {
        this.inventoryItemLabelId = inventoryItemLabelId;
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
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
    public String getInventoryItemId() {
        return this.id.getInventoryItemId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemLabelTypeId() {
        return this.id.getInventoryItemLabelTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemLabelId() {
        return this.inventoryItemLabelId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
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
     * Auto generated method that gets the related <code>InventoryItem</code> by the relation named <code>InventoryItem</code>.
     * @return the <code>InventoryItem</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItem getInventoryItem() throws RepositoryException {
        if (this.inventoryItem == null) {
            this.inventoryItem = getRelatedOne(InventoryItem.class, "InventoryItem");
        }
        return this.inventoryItem;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemLabelType</code> by the relation named <code>InventoryItemLabelType</code>.
     * @return the <code>InventoryItemLabelType</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItemLabelType getInventoryItemLabelType() throws RepositoryException {
        if (this.inventoryItemLabelType == null) {
            this.inventoryItemLabelType = getRelatedOne(InventoryItemLabelType.class, "InventoryItemLabelType");
        }
        return this.inventoryItemLabelType;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemLabel</code> by the relation named <code>InventoryItemLabel</code>.
     * @return the <code>InventoryItemLabel</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItemLabel getInventoryItemLabel() throws RepositoryException {
        if (this.inventoryItemLabel == null) {
            this.inventoryItemLabel = getRelatedOne(InventoryItemLabel.class, "InventoryItemLabel");
        }
        return this.inventoryItemLabel;
    }

    /**
     * Auto generated value setter.
     * @param inventoryItem the inventoryItem to set
    */
    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemLabelType the inventoryItemLabelType to set
    */
    public void setInventoryItemLabelType(InventoryItemLabelType inventoryItemLabelType) {
        this.inventoryItemLabelType = inventoryItemLabelType;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemLabel the inventoryItemLabel to set
    */
    public void setInventoryItemLabel(InventoryItemLabel inventoryItemLabel) {
        this.inventoryItemLabel = inventoryItemLabel;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setInventoryItemLabelTypeId((String) mapValue.get("inventoryItemLabelTypeId"));
        setInventoryItemLabelId((String) mapValue.get("inventoryItemLabelId"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
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
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("inventoryItemLabelTypeId", getInventoryItemLabelTypeId());
        mapValue.put("inventoryItemLabelId", getInventoryItemLabelId());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
