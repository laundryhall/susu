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
 * Auto generated base entity PhysicalInventoryAndVariance.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPhysicalInventoryAndVariances", query="SELECT PHINV.PHYSICAL_INVENTORY_ID AS \"physicalInventoryId\",PHINV.PHYSICAL_INVENTORY_DATE AS \"physicalInventoryDate\",PHINV.PARTY_ID AS \"partyId\",PHINV.GENERAL_COMMENTS AS \"generalComments\",IIV.INVENTORY_ITEM_ID AS \"inventoryItemId\",IIV.VARIANCE_REASON_ID AS \"varianceReasonId\",IIV.AVAILABLE_TO_PROMISE_VAR AS \"availableToPromiseVar\",IIV.QUANTITY_ON_HAND_VAR AS \"quantityOnHandVar\",IIV.COMMENTS AS \"comments\" FROM PHYSICAL_INVENTORY PHINV INNER JOIN INVENTORY_ITEM_VARIANCE IIV ON PHINV.PHYSICAL_INVENTORY_ID = IIV.PHYSICAL_INVENTORY_ID", resultSetMapping="PhysicalInventoryAndVarianceMapping")
@SqlResultSetMapping(name="PhysicalInventoryAndVarianceMapping", entities={
@EntityResult(entityClass=PhysicalInventoryAndVariance.class, fields = {
@FieldResult(name="physicalInventoryId", column="physicalInventoryId")
,@FieldResult(name="physicalInventoryDate", column="physicalInventoryDate")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="generalComments", column="generalComments")
,@FieldResult(name="inventoryItemId", column="inventoryItemId")
,@FieldResult(name="varianceReasonId", column="varianceReasonId")
,@FieldResult(name="availableToPromiseVar", column="availableToPromiseVar")
,@FieldResult(name="quantityOnHandVar", column="quantityOnHandVar")
,@FieldResult(name="comments", column="comments")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PhysicalInventoryAndVariance extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("physicalInventoryId", "PHINV.PHYSICAL_INVENTORY_ID");
        fields.put("physicalInventoryDate", "PHINV.PHYSICAL_INVENTORY_DATE");
        fields.put("partyId", "PHINV.PARTY_ID");
        fields.put("generalComments", "PHINV.GENERAL_COMMENTS");
        fields.put("inventoryItemId", "IIV.INVENTORY_ITEM_ID");
        fields.put("varianceReasonId", "IIV.VARIANCE_REASON_ID");
        fields.put("availableToPromiseVar", "IIV.AVAILABLE_TO_PROMISE_VAR");
        fields.put("quantityOnHandVar", "IIV.QUANTITY_ON_HAND_VAR");
        fields.put("comments", "IIV.COMMENTS");
fieldMapColumns.put("PhysicalInventoryAndVariance", fields);
}
  public static enum Fields implements EntityFieldInterface<PhysicalInventoryAndVariance> {
    physicalInventoryId("physicalInventoryId"),
    physicalInventoryDate("physicalInventoryDate"),
    partyId("partyId"),
    generalComments("generalComments"),
    inventoryItemId("inventoryItemId"),
    varianceReasonId("varianceReasonId"),
    availableToPromiseVar("availableToPromiseVar"),
    quantityOnHandVar("quantityOnHandVar"),
    comments("comments");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String physicalInventoryId;
    
   private Timestamp physicalInventoryDate;
    
   private String partyId;
    
   private String generalComments;
    
   private String inventoryItemId;
    
   private String varianceReasonId;
    
   private BigDecimal availableToPromiseVar;
    
   private BigDecimal quantityOnHandVar;
    
   private String comments;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VARIANCE_REASON_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private VarianceReason varianceReason = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryItem inventoryItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   private transient Person person = null;
   private transient PartyGroup partyGroup = null;

  /**
   * Default constructor.
   */
  public PhysicalInventoryAndVariance() {
      super();
      this.baseEntityName = "PhysicalInventoryAndVariance";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("physicalInventoryId");this.primaryKeyNames.add("inventoryItemId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("physicalInventoryId");this.allFieldsNames.add("physicalInventoryDate");this.allFieldsNames.add("partyId");this.allFieldsNames.add("generalComments");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("varianceReasonId");this.allFieldsNames.add("availableToPromiseVar");this.allFieldsNames.add("quantityOnHandVar");this.allFieldsNames.add("comments");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PhysicalInventoryAndVariance(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param physicalInventoryId the physicalInventoryId to set
     */
    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
    /**
     * Auto generated value setter.
     * @param physicalInventoryDate the physicalInventoryDate to set
     */
    public void setPhysicalInventoryDate(Timestamp physicalInventoryDate) {
        this.physicalInventoryDate = physicalInventoryDate;
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
     * @param generalComments the generalComments to set
     */
    public void setGeneralComments(String generalComments) {
        this.generalComments = generalComments;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
    /**
     * Auto generated value setter.
     * @param varianceReasonId the varianceReasonId to set
     */
    public void setVarianceReasonId(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId;
    }
    /**
     * Auto generated value setter.
     * @param availableToPromiseVar the availableToPromiseVar to set
     */
    public void setAvailableToPromiseVar(BigDecimal availableToPromiseVar) {
        this.availableToPromiseVar = availableToPromiseVar;
    }
    /**
     * Auto generated value setter.
     * @param quantityOnHandVar the quantityOnHandVar to set
     */
    public void setQuantityOnHandVar(BigDecimal quantityOnHandVar) {
        this.quantityOnHandVar = quantityOnHandVar;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPhysicalInventoryId() {
        return this.physicalInventoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPhysicalInventoryDate() {
        return this.physicalInventoryDate;
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
     * @return <code>String</code>
     */
    public String getGeneralComments() {
        return this.generalComments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVarianceReasonId() {
        return this.varianceReasonId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAvailableToPromiseVar() {
        return this.availableToPromiseVar;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOnHandVar() {
        return this.quantityOnHandVar;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * Auto generated method that gets the related <code>VarianceReason</code> by the relation named <code>VarianceReason</code>.
     * @return the <code>VarianceReason</code>
     * @throws RepositoryException if an error occurs
     */
    public VarianceReason getVarianceReason() throws RepositoryException {
        if (this.varianceReason == null) {
            this.varianceReason = getRelatedOne(VarianceReason.class, "VarianceReason");
        }
        return this.varianceReason;
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
     * Auto generated method that gets the related <code>Person</code> by the relation named <code>Person</code>.
     * @return the <code>Person</code>
     * @throws RepositoryException if an error occurs
     */
    public Person getPerson() throws RepositoryException {
        if (this.person == null) {
            this.person = getRelatedOne(Person.class, "Person");
        }
        return this.person;
    }
    /**
     * Auto generated method that gets the related <code>PartyGroup</code> by the relation named <code>PartyGroup</code>.
     * @return the <code>PartyGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyGroup getPartyGroup() throws RepositoryException {
        if (this.partyGroup == null) {
            this.partyGroup = getRelatedOne(PartyGroup.class, "PartyGroup");
        }
        return this.partyGroup;
    }

    /**
     * Auto generated value setter.
     * @param varianceReason the varianceReason to set
    */
    public void setVarianceReason(VarianceReason varianceReason) {
        this.varianceReason = varianceReason;
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
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param person the person to set
    */
    public void setPerson(Person person) {
        this.person = person;
    }
    /**
     * Auto generated value setter.
     * @param partyGroup the partyGroup to set
    */
    public void setPartyGroup(PartyGroup partyGroup) {
        this.partyGroup = partyGroup;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPhysicalInventoryId((String) mapValue.get("physicalInventoryId"));
        setPhysicalInventoryDate((Timestamp) mapValue.get("physicalInventoryDate"));
        setPartyId((String) mapValue.get("partyId"));
        setGeneralComments((String) mapValue.get("generalComments"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setVarianceReasonId((String) mapValue.get("varianceReasonId"));
        setAvailableToPromiseVar(convertToBigDecimal(mapValue.get("availableToPromiseVar")));
        setQuantityOnHandVar(convertToBigDecimal(mapValue.get("quantityOnHandVar")));
        setComments((String) mapValue.get("comments"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("physicalInventoryId", getPhysicalInventoryId());
        mapValue.put("physicalInventoryDate", getPhysicalInventoryDate());
        mapValue.put("partyId", getPartyId());
        mapValue.put("generalComments", getGeneralComments());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("varianceReasonId", getVarianceReasonId());
        mapValue.put("availableToPromiseVar", getAvailableToPromiseVar());
        mapValue.put("quantityOnHandVar", getQuantityOnHandVar());
        mapValue.put("comments", getComments());
        return mapValue;
    }


}
