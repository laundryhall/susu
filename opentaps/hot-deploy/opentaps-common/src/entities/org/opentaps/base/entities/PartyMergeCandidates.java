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
 * Auto generated base entity PartyMergeCandidates.
 */
@javax.persistence.Entity
@Table(name="PARTY_MERGE_CANDIDATES")
public class PartyMergeCandidates extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyIdFrom", "PARTY_ID_FROM");
        fields.put("partyIdTo", "PARTY_ID_TO");
        fields.put("processedTimestamp", "PROCESSED_TIMESTAMP");
        fields.put("doNotMerge", "DO_NOT_MERGE");
        fields.put("hasOrderRoles", "HAS_ORDER_ROLES");
        fields.put("mergeRationale", "MERGE_RATIONALE");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyMergeCandidates", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyMergeCandidates> {
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    processedTimestamp("processedTimestamp"),
    doNotMerge("doNotMerge"),
    hasOrderRoles("hasOrderRoles"),
    mergeRationale("mergeRationale"),
    comments("comments"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.PartyMergeCandidatesPkBridge.class)
     private PartyMergeCandidatesPk id = new PartyMergeCandidatesPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PartyMergeCandidatesPk</code>
     */
      public PartyMergeCandidatesPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PartyMergeCandidatesPk</code> value to set
    */   
      public void setId(PartyMergeCandidatesPk id) {
         this.id = id;
      }
   @Column(name="PROCESSED_TIMESTAMP")
   private Timestamp processedTimestamp;
   @Column(name="DO_NOT_MERGE")
   private String doNotMerge;
   @Column(name="HAS_ORDER_ROLES")
   private String hasOrderRoles;
   @Column(name="MERGE_RATIONALE")
   private String mergeRationale;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;

  /**
   * Default constructor.
   */
  public PartyMergeCandidates() {
      super();
      this.baseEntityName = "PartyMergeCandidates";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyIdFrom");this.primaryKeyNames.add("partyIdTo");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("processedTimestamp");this.allFieldsNames.add("doNotMerge");this.allFieldsNames.add("hasOrderRoles");this.allFieldsNames.add("mergeRationale");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyMergeCandidates(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    public void setPartyIdFrom(String partyIdFrom) {
        id.setPartyIdFrom(partyIdFrom);
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        id.setPartyIdTo(partyIdTo);
    }
    /**
     * Auto generated value setter.
     * @param processedTimestamp the processedTimestamp to set
     */
    public void setProcessedTimestamp(Timestamp processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param doNotMerge the doNotMerge to set
     */
    public void setDoNotMerge(String doNotMerge) {
        this.doNotMerge = doNotMerge;
    }
    /**
     * Auto generated value setter.
     * @param hasOrderRoles the hasOrderRoles to set
     */
    public void setHasOrderRoles(String hasOrderRoles) {
        this.hasOrderRoles = hasOrderRoles;
    }
    /**
     * Auto generated value setter.
     * @param mergeRationale the mergeRationale to set
     */
    public void setMergeRationale(String mergeRationale) {
        this.mergeRationale = mergeRationale;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
    public String getPartyIdFrom() {
        return this.id.getPartyIdFrom();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.id.getPartyIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getProcessedTimestamp() {
        return this.processedTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDoNotMerge() {
        return this.doNotMerge;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasOrderRoles() {
        return this.hasOrderRoles;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMergeRationale() {
        return this.mergeRationale;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
        setDoNotMerge((String) mapValue.get("doNotMerge"));
        setHasOrderRoles((String) mapValue.get("hasOrderRoles"));
        setMergeRationale((String) mapValue.get("mergeRationale"));
        setComments((String) mapValue.get("comments"));
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
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        mapValue.put("doNotMerge", getDoNotMerge());
        mapValue.put("hasOrderRoles", getHasOrderRoles());
        mapValue.put("mergeRationale", getMergeRationale());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
