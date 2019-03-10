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
 * Auto generated base entity ContentRevisionItem.
 */
@javax.persistence.Entity
@Table(name="CONTENT_REVISION_ITEM")
public class ContentRevisionItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contentId", "CONTENT_ID");
        fields.put("contentRevisionSeqId", "CONTENT_REVISION_SEQ_ID");
        fields.put("itemContentId", "ITEM_CONTENT_ID");
        fields.put("oldDataResourceId", "OLD_DATA_RESOURCE_ID");
        fields.put("newDataResourceId", "NEW_DATA_RESOURCE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ContentRevisionItem", fields);
}
  public static enum Fields implements EntityFieldInterface<ContentRevisionItem> {
    contentId("contentId"),
    contentRevisionSeqId("contentRevisionSeqId"),
    itemContentId("itemContentId"),
    oldDataResourceId("oldDataResourceId"),
    newDataResourceId("newDataResourceId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ContentRevisionItemPkBridge.class)
     private ContentRevisionItemPk id = new ContentRevisionItemPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ContentRevisionItemPk</code>
     */
      public ContentRevisionItemPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ContentRevisionItemPk</code> value to set
    */   
      public void setId(ContentRevisionItemPk id) {
         this.id = id;
      }
   @Column(name="OLD_DATA_RESOURCE_ID")
   private String oldDataResourceId;
   @Column(name="NEW_DATA_RESOURCE_ID")
   private String newDataResourceId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient ContentRevision contentRevision = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="OLD_DATA_RESOURCE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DataResource oldDataResource = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="NEW_DATA_RESOURCE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DataResource newDataResource = null;

  /**
   * Default constructor.
   */
  public ContentRevisionItem() {
      super();
      this.baseEntityName = "ContentRevisionItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("contentId");this.primaryKeyNames.add("contentRevisionSeqId");this.primaryKeyNames.add("itemContentId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contentId");this.allFieldsNames.add("contentRevisionSeqId");this.allFieldsNames.add("itemContentId");this.allFieldsNames.add("oldDataResourceId");this.allFieldsNames.add("newDataResourceId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ContentRevisionItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        id.setContentId(contentId);
    }
    /**
     * Auto generated value setter.
     * @param contentRevisionSeqId the contentRevisionSeqId to set
     */
    public void setContentRevisionSeqId(String contentRevisionSeqId) {
        id.setContentRevisionSeqId(contentRevisionSeqId);
    }
    /**
     * Auto generated value setter.
     * @param itemContentId the itemContentId to set
     */
    public void setItemContentId(String itemContentId) {
        id.setItemContentId(itemContentId);
    }
    /**
     * Auto generated value setter.
     * @param oldDataResourceId the oldDataResourceId to set
     */
    public void setOldDataResourceId(String oldDataResourceId) {
        this.oldDataResourceId = oldDataResourceId;
    }
    /**
     * Auto generated value setter.
     * @param newDataResourceId the newDataResourceId to set
     */
    public void setNewDataResourceId(String newDataResourceId) {
        this.newDataResourceId = newDataResourceId;
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
    public String getContentId() {
        return this.id.getContentId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentRevisionSeqId() {
        return this.id.getContentRevisionSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemContentId() {
        return this.id.getItemContentId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOldDataResourceId() {
        return this.oldDataResourceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNewDataResourceId() {
        return this.newDataResourceId;
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
     * Auto generated method that gets the related <code>ContentRevision</code> by the relation named <code>ContentRevision</code>.
     * @return the <code>ContentRevision</code>
     * @throws RepositoryException if an error occurs
     */
    public ContentRevision getContentRevision() throws RepositoryException {
        if (this.contentRevision == null) {
            this.contentRevision = getRelatedOne(ContentRevision.class, "ContentRevision");
        }
        return this.contentRevision;
    }
    /**
     * Auto generated method that gets the related <code>DataResource</code> by the relation named <code>OldDataResource</code>.
     * @return the <code>DataResource</code>
     * @throws RepositoryException if an error occurs
     */
    public DataResource getOldDataResource() throws RepositoryException {
        if (this.oldDataResource == null) {
            this.oldDataResource = getRelatedOne(DataResource.class, "OldDataResource");
        }
        return this.oldDataResource;
    }
    /**
     * Auto generated method that gets the related <code>DataResource</code> by the relation named <code>NewDataResource</code>.
     * @return the <code>DataResource</code>
     * @throws RepositoryException if an error occurs
     */
    public DataResource getNewDataResource() throws RepositoryException {
        if (this.newDataResource == null) {
            this.newDataResource = getRelatedOne(DataResource.class, "NewDataResource");
        }
        return this.newDataResource;
    }

    /**
     * Auto generated value setter.
     * @param contentRevision the contentRevision to set
    */
    public void setContentRevision(ContentRevision contentRevision) {
        this.contentRevision = contentRevision;
    }
    /**
     * Auto generated value setter.
     * @param oldDataResource the oldDataResource to set
    */
    public void setOldDataResource(DataResource oldDataResource) {
        this.oldDataResource = oldDataResource;
    }
    /**
     * Auto generated value setter.
     * @param newDataResource the newDataResource to set
    */
    public void setNewDataResource(DataResource newDataResource) {
        this.newDataResource = newDataResource;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContentId((String) mapValue.get("contentId"));
        setContentRevisionSeqId((String) mapValue.get("contentRevisionSeqId"));
        setItemContentId((String) mapValue.get("itemContentId"));
        setOldDataResourceId((String) mapValue.get("oldDataResourceId"));
        setNewDataResourceId((String) mapValue.get("newDataResourceId"));
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
        mapValue.put("contentId", getContentId());
        mapValue.put("contentRevisionSeqId", getContentRevisionSeqId());
        mapValue.put("itemContentId", getItemContentId());
        mapValue.put("oldDataResourceId", getOldDataResourceId());
        mapValue.put("newDataResourceId", getNewDataResourceId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}