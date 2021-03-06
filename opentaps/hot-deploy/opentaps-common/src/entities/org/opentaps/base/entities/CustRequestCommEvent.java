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
 * Auto generated base entity CustRequestCommEvent.
 */
@javax.persistence.Entity
@Table(name="CUST_REQUEST_COMM_EVENT")
public class CustRequestCommEvent extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("custRequestId", "CUST_REQUEST_ID");
        fields.put("communicationEventId", "COMMUNICATION_EVENT_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CustRequestCommEvent", fields);
}
  public static enum Fields implements EntityFieldInterface<CustRequestCommEvent> {
    custRequestId("custRequestId"),
    communicationEventId("communicationEventId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.CustRequestCommEventPkBridge.class)
     private CustRequestCommEventPk id = new CustRequestCommEventPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>CustRequestCommEventPk</code>
     */
      public CustRequestCommEventPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>CustRequestCommEventPk</code> value to set
    */   
      public void setId(CustRequestCommEventPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUST_REQUEST_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CustRequest custRequest = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="COMMUNICATION_EVENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CommunicationEvent communicationEvent = null;

  /**
   * Default constructor.
   */
  public CustRequestCommEvent() {
      super();
      this.baseEntityName = "CustRequestCommEvent";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("custRequestId");this.primaryKeyNames.add("communicationEventId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("custRequestId");this.allFieldsNames.add("communicationEventId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CustRequestCommEvent(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param custRequestId the custRequestId to set
     */
    public void setCustRequestId(String custRequestId) {
        id.setCustRequestId(custRequestId);
    }
    /**
     * Auto generated value setter.
     * @param communicationEventId the communicationEventId to set
     */
    public void setCommunicationEventId(String communicationEventId) {
        id.setCommunicationEventId(communicationEventId);
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
    public String getCustRequestId() {
        return this.id.getCustRequestId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCommunicationEventId() {
        return this.id.getCommunicationEventId();
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
     * Auto generated method that gets the related <code>CustRequest</code> by the relation named <code>CustRequest</code>.
     * @return the <code>CustRequest</code>
     * @throws RepositoryException if an error occurs
     */
    public CustRequest getCustRequest() throws RepositoryException {
        if (this.custRequest == null) {
            this.custRequest = getRelatedOne(CustRequest.class, "CustRequest");
        }
        return this.custRequest;
    }
    /**
     * Auto generated method that gets the related <code>CommunicationEvent</code> by the relation named <code>CommunicationEvent</code>.
     * @return the <code>CommunicationEvent</code>
     * @throws RepositoryException if an error occurs
     */
    public CommunicationEvent getCommunicationEvent() throws RepositoryException {
        if (this.communicationEvent == null) {
            this.communicationEvent = getRelatedOne(CommunicationEvent.class, "CommunicationEvent");
        }
        return this.communicationEvent;
    }

    /**
     * Auto generated value setter.
     * @param custRequest the custRequest to set
    */
    public void setCustRequest(CustRequest custRequest) {
        this.custRequest = custRequest;
    }
    /**
     * Auto generated value setter.
     * @param communicationEvent the communicationEvent to set
    */
    public void setCommunicationEvent(CommunicationEvent communicationEvent) {
        this.communicationEvent = communicationEvent;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustRequestId((String) mapValue.get("custRequestId"));
        setCommunicationEventId((String) mapValue.get("communicationEventId"));
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
        mapValue.put("custRequestId", getCustRequestId());
        mapValue.put("communicationEventId", getCommunicationEventId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
