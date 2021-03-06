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
 * Auto generated base entity PartySkill.
 */
@javax.persistence.Entity
@Table(name="PARTY_SKILL")
public class PartySkill extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PARTY_ID");
        fields.put("skillTypeId", "SKILL_TYPE_ID");
        fields.put("yearsExperience", "YEARS_EXPERIENCE");
        fields.put("rating", "RATING");
        fields.put("skillLevel", "SKILL_LEVEL");
        fields.put("startedUsingDate", "STARTED_USING_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartySkill", fields);
}
  public static enum Fields implements EntityFieldInterface<PartySkill> {
    partyId("partyId"),
    skillTypeId("skillTypeId"),
    yearsExperience("yearsExperience"),
    rating("rating"),
    skillLevel("skillLevel"),
    startedUsingDate("startedUsingDate"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.PartySkillPkBridge.class)
     private PartySkillPk id = new PartySkillPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PartySkillPk</code>
     */
      public PartySkillPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PartySkillPk</code> value to set
    */   
      public void setId(PartySkillPk id) {
         this.id = id;
      }
   @Column(name="YEARS_EXPERIENCE")
   private Long yearsExperience;
   @Column(name="RATING")
   private Long rating;
   @Column(name="SKILL_LEVEL")
   private Long skillLevel;
   @Column(name="STARTED_USING_DATE")
   private Timestamp startedUsingDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SKILL_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SkillType skillType = null;

  /**
   * Default constructor.
   */
  public PartySkill() {
      super();
      this.baseEntityName = "PartySkill";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("skillTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("skillTypeId");this.allFieldsNames.add("yearsExperience");this.allFieldsNames.add("rating");this.allFieldsNames.add("skillLevel");this.allFieldsNames.add("startedUsingDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartySkill(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        id.setPartyId(partyId);
    }
    /**
     * Auto generated value setter.
     * @param skillTypeId the skillTypeId to set
     */
    public void setSkillTypeId(String skillTypeId) {
        id.setSkillTypeId(skillTypeId);
    }
    /**
     * Auto generated value setter.
     * @param yearsExperience the yearsExperience to set
     */
    public void setYearsExperience(Long yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
    /**
     * Auto generated value setter.
     * @param rating the rating to set
     */
    public void setRating(Long rating) {
        this.rating = rating;
    }
    /**
     * Auto generated value setter.
     * @param skillLevel the skillLevel to set
     */
    public void setSkillLevel(Long skillLevel) {
        this.skillLevel = skillLevel;
    }
    /**
     * Auto generated value setter.
     * @param startedUsingDate the startedUsingDate to set
     */
    public void setStartedUsingDate(Timestamp startedUsingDate) {
        this.startedUsingDate = startedUsingDate;
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
    public String getPartyId() {
        return this.id.getPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSkillTypeId() {
        return this.id.getSkillTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getYearsExperience() {
        return this.yearsExperience;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getRating() {
        return this.rating;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSkillLevel() {
        return this.skillLevel;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStartedUsingDate() {
        return this.startedUsingDate;
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
     * Auto generated method that gets the related <code>SkillType</code> by the relation named <code>SkillType</code>.
     * @return the <code>SkillType</code>
     * @throws RepositoryException if an error occurs
     */
    public SkillType getSkillType() throws RepositoryException {
        if (this.skillType == null) {
            this.skillType = getRelatedOne(SkillType.class, "SkillType");
        }
        return this.skillType;
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
     * @param skillType the skillType to set
    */
    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setSkillTypeId((String) mapValue.get("skillTypeId"));
        setYearsExperience((Long) mapValue.get("yearsExperience"));
        setRating((Long) mapValue.get("rating"));
        setSkillLevel((Long) mapValue.get("skillLevel"));
        setStartedUsingDate((Timestamp) mapValue.get("startedUsingDate"));
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
        mapValue.put("partyId", getPartyId());
        mapValue.put("skillTypeId", getSkillTypeId());
        mapValue.put("yearsExperience", getYearsExperience());
        mapValue.put("rating", getRating());
        mapValue.put("skillLevel", getSkillLevel());
        mapValue.put("startedUsingDate", getStartedUsingDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
