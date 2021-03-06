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
 * Auto generated base entity EntityGroup.
 */
@javax.persistence.Entity
@Table(name="ENTITY_GROUP")
public class EntityGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("entityGroupId", "ENTITY_GROUP_ID");
        fields.put("entityGroupName", "ENTITY_GROUP_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("EntityGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<EntityGroup> {
    entityGroupId("entityGroupId"),
    entityGroupName("entityGroupName"),
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

   @org.hibernate.annotations.GenericGenerator(name="EntityGroup_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="EntityGroup_GEN")
   @Id
   @Column(name="ENTITY_GROUP_ID")
   private String entityGroupId;
   @Column(name="ENTITY_GROUP_NAME")
   private String entityGroupName;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="entityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ENTITY_GROUP_ID")
   
   private List<EntityGroupEntry> entityGroupEntrys = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="entityGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ENTITY_GROUP_ID")
   
   private List<EntitySyncIncludeGroup> entitySyncIncludeGroups = null;

  /**
   * Default constructor.
   */
  public EntityGroup() {
      super();
      this.baseEntityName = "EntityGroup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("entityGroupId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("entityGroupId");this.allFieldsNames.add("entityGroupName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EntityGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param entityGroupId the entityGroupId to set
     */
    public void setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
    }
    /**
     * Auto generated value setter.
     * @param entityGroupName the entityGroupName to set
     */
    public void setEntityGroupName(String entityGroupName) {
        this.entityGroupName = entityGroupName;
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
    public String getEntityGroupId() {
        return this.entityGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEntityGroupName() {
        return this.entityGroupName;
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
     * Auto generated method that gets the related <code>EntityGroupEntry</code> by the relation named <code>EntityGroupEntry</code>.
     * @return the list of <code>EntityGroupEntry</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EntityGroupEntry> getEntityGroupEntrys() throws RepositoryException {
        if (this.entityGroupEntrys == null) {
            this.entityGroupEntrys = getRelated(EntityGroupEntry.class, "EntityGroupEntry");
        }
        return this.entityGroupEntrys;
    }
    /**
     * Auto generated method that gets the related <code>EntitySyncIncludeGroup</code> by the relation named <code>EntitySyncIncludeGroup</code>.
     * @return the list of <code>EntitySyncIncludeGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends EntitySyncIncludeGroup> getEntitySyncIncludeGroups() throws RepositoryException {
        if (this.entitySyncIncludeGroups == null) {
            this.entitySyncIncludeGroups = getRelated(EntitySyncIncludeGroup.class, "EntitySyncIncludeGroup");
        }
        return this.entitySyncIncludeGroups;
    }

    /**
     * Auto generated value setter.
     * @param entityGroupEntrys the entityGroupEntrys to set
    */
    public void setEntityGroupEntrys(List<EntityGroupEntry> entityGroupEntrys) {
        this.entityGroupEntrys = entityGroupEntrys;
    }
    /**
     * Auto generated value setter.
     * @param entitySyncIncludeGroups the entitySyncIncludeGroups to set
    */
    public void setEntitySyncIncludeGroups(List<EntitySyncIncludeGroup> entitySyncIncludeGroups) {
        this.entitySyncIncludeGroups = entitySyncIncludeGroups;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addEntityGroupEntry(EntityGroupEntry entityGroupEntry) {
        if (this.entityGroupEntrys == null) {
            this.entityGroupEntrys = new ArrayList<EntityGroupEntry>();
        }
        this.entityGroupEntrys.add(entityGroupEntry);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEntityGroupEntry(EntityGroupEntry entityGroupEntry) {
        if (this.entityGroupEntrys == null) {
            return;
        }
        this.entityGroupEntrys.remove(entityGroupEntry);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEntityGroupEntry() {
        if (this.entityGroupEntrys == null) {
            return;
        }
        this.entityGroupEntrys.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addEntitySyncIncludeGroup(EntitySyncIncludeGroup entitySyncIncludeGroup) {
        if (this.entitySyncIncludeGroups == null) {
            this.entitySyncIncludeGroups = new ArrayList<EntitySyncIncludeGroup>();
        }
        this.entitySyncIncludeGroups.add(entitySyncIncludeGroup);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeEntitySyncIncludeGroup(EntitySyncIncludeGroup entitySyncIncludeGroup) {
        if (this.entitySyncIncludeGroups == null) {
            return;
        }
        this.entitySyncIncludeGroups.remove(entitySyncIncludeGroup);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearEntitySyncIncludeGroup() {
        if (this.entitySyncIncludeGroups == null) {
            return;
        }
        this.entitySyncIncludeGroups.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEntityGroupId((String) mapValue.get("entityGroupId"));
        setEntityGroupName((String) mapValue.get("entityGroupName"));
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
        mapValue.put("entityGroupId", getEntityGroupId());
        mapValue.put("entityGroupName", getEntityGroupName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
