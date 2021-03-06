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
 * Auto generated base entity PartyRelationshipType.
 */
@javax.persistence.Entity
@Table(name="PARTY_RELATIONSHIP_TYPE")
public class PartyRelationshipType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyRelationshipTypeId", "PARTY_RELATIONSHIP_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("partyRelationshipName", "PARTY_RELATIONSHIP_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("roleTypeIdValidFrom", "ROLE_TYPE_ID_VALID_FROM");
        fields.put("roleTypeIdValidTo", "ROLE_TYPE_ID_VALID_TO");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyRelationshipType", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyRelationshipType> {
    partyRelationshipTypeId("partyRelationshipTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    partyRelationshipName("partyRelationshipName"),
    description("description"),
    roleTypeIdValidFrom("roleTypeIdValidFrom"),
    roleTypeIdValidTo("roleTypeIdValidTo"),
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

   @org.hibernate.annotations.GenericGenerator(name="PartyRelationshipType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PartyRelationshipType_GEN")
   @Id
   @Column(name="PARTY_RELATIONSHIP_TYPE_ID")
   private String partyRelationshipTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
   @Column(name="PARTY_RELATIONSHIP_NAME")
   private String partyRelationshipName;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="ROLE_TYPE_ID_VALID_FROM")
   private String roleTypeIdValidFrom;
   @Column(name="ROLE_TYPE_ID_VALID_TO")
   private String roleTypeIdValidTo;
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
   
   private PartyRelationshipType parentPartyRelationshipType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID_VALID_FROM", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType validFromRoleType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID_VALID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType validToRoleType = null;
   private transient List<PartyRelationship> partyRelationships = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentPartyRelationshipType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<PartyRelationshipType> childPartyRelationshipTypes = null;

  /**
   * Default constructor.
   */
  public PartyRelationshipType() {
      super();
      this.baseEntityName = "PartyRelationshipType";
      this.isView = false;
      this.resourceName = "PartyEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyRelationshipTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyRelationshipTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("partyRelationshipName");this.allFieldsNames.add("description");this.allFieldsNames.add("roleTypeIdValidFrom");this.allFieldsNames.add("roleTypeIdValidTo");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyRelationshipType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyRelationshipTypeId the partyRelationshipTypeId to set
     */
    public void setPartyRelationshipTypeId(String partyRelationshipTypeId) {
        this.partyRelationshipTypeId = partyRelationshipTypeId;
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
     * @param partyRelationshipName the partyRelationshipName to set
     */
    public void setPartyRelationshipName(String partyRelationshipName) {
        this.partyRelationshipName = partyRelationshipName;
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
     * @param roleTypeIdValidFrom the roleTypeIdValidFrom to set
     */
    public void setRoleTypeIdValidFrom(String roleTypeIdValidFrom) {
        this.roleTypeIdValidFrom = roleTypeIdValidFrom;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdValidTo the roleTypeIdValidTo to set
     */
    public void setRoleTypeIdValidTo(String roleTypeIdValidTo) {
        this.roleTypeIdValidTo = roleTypeIdValidTo;
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
    public String getPartyRelationshipTypeId() {
        return this.partyRelationshipTypeId;
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
    public String getPartyRelationshipName() {
        return this.partyRelationshipName;
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
     * @return <code>String</code>
     */
    public String getRoleTypeIdValidFrom() {
        return this.roleTypeIdValidFrom;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdValidTo() {
        return this.roleTypeIdValidTo;
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
     * Auto generated method that gets the related <code>PartyRelationshipType</code> by the relation named <code>ParentPartyRelationshipType</code>.
     * @return the <code>PartyRelationshipType</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRelationshipType getParentPartyRelationshipType() throws RepositoryException {
        if (this.parentPartyRelationshipType == null) {
            this.parentPartyRelationshipType = getRelatedOne(PartyRelationshipType.class, "ParentPartyRelationshipType");
        }
        return this.parentPartyRelationshipType;
    }
    /**
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>ValidFromRoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getValidFromRoleType() throws RepositoryException {
        if (this.validFromRoleType == null) {
            this.validFromRoleType = getRelatedOne(RoleType.class, "ValidFromRoleType");
        }
        return this.validFromRoleType;
    }
    /**
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>ValidToRoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getValidToRoleType() throws RepositoryException {
        if (this.validToRoleType == null) {
            this.validToRoleType = getRelatedOne(RoleType.class, "ValidToRoleType");
        }
        return this.validToRoleType;
    }
    /**
     * Auto generated method that gets the related <code>PartyRelationship</code> by the relation named <code>PartyRelationship</code>.
     * @return the list of <code>PartyRelationship</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyRelationship> getPartyRelationships() throws RepositoryException {
        if (this.partyRelationships == null) {
            this.partyRelationships = getRelated(PartyRelationship.class, "PartyRelationship");
        }
        return this.partyRelationships;
    }
    /**
     * Auto generated method that gets the related <code>PartyRelationshipType</code> by the relation named <code>ChildPartyRelationshipType</code>.
     * @return the list of <code>PartyRelationshipType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyRelationshipType> getChildPartyRelationshipTypes() throws RepositoryException {
        if (this.childPartyRelationshipTypes == null) {
            this.childPartyRelationshipTypes = getRelated(PartyRelationshipType.class, "ChildPartyRelationshipType");
        }
        return this.childPartyRelationshipTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentPartyRelationshipType the parentPartyRelationshipType to set
    */
    public void setParentPartyRelationshipType(PartyRelationshipType parentPartyRelationshipType) {
        this.parentPartyRelationshipType = parentPartyRelationshipType;
    }
    /**
     * Auto generated value setter.
     * @param validFromRoleType the validFromRoleType to set
    */
    public void setValidFromRoleType(RoleType validFromRoleType) {
        this.validFromRoleType = validFromRoleType;
    }
    /**
     * Auto generated value setter.
     * @param validToRoleType the validToRoleType to set
    */
    public void setValidToRoleType(RoleType validToRoleType) {
        this.validToRoleType = validToRoleType;
    }
    /**
     * Auto generated value setter.
     * @param partyRelationships the partyRelationships to set
    */
    public void setPartyRelationships(List<PartyRelationship> partyRelationships) {
        this.partyRelationships = partyRelationships;
    }
    /**
     * Auto generated value setter.
     * @param childPartyRelationshipTypes the childPartyRelationshipTypes to set
    */
    public void setChildPartyRelationshipTypes(List<PartyRelationshipType> childPartyRelationshipTypes) {
        this.childPartyRelationshipTypes = childPartyRelationshipTypes;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyRelationshipTypeId((String) mapValue.get("partyRelationshipTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setPartyRelationshipName((String) mapValue.get("partyRelationshipName"));
        setDescription((String) mapValue.get("description"));
        setRoleTypeIdValidFrom((String) mapValue.get("roleTypeIdValidFrom"));
        setRoleTypeIdValidTo((String) mapValue.get("roleTypeIdValidTo"));
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
        mapValue.put("partyRelationshipTypeId", getPartyRelationshipTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("partyRelationshipName", getPartyRelationshipName());
        mapValue.put("description", getDescription());
        mapValue.put("roleTypeIdValidFrom", getRoleTypeIdValidFrom());
        mapValue.put("roleTypeIdValidTo", getRoleTypeIdValidTo());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
