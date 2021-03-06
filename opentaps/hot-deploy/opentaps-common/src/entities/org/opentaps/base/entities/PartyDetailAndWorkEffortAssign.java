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
 * Auto generated base entity PartyDetailAndWorkEffortAssign.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyDetailAndWorkEffortAssigns", query="SELECT PTY.PARTY_ID AS \"partyId\",PTY.PARTY_TYPE_ID AS \"partyTypeId\",PTY.STATUS_ID AS \"statusId\",WE.WORK_EFFORT_TYPE_ID AS \"workEffortTypeId\",WEF.WORK_EFFORT_ID AS \"workEffortId\",WEF.FROM_DATE AS \"fromDate\",WEF.THRU_DATE AS \"thruDate\",WEF.ROLE_TYPE_ID AS \"roleTypeId\",WEF.STATUS_ID AS \"statusId\",PER.FIRST_NAME AS \"firstName\",PER.MIDDLE_NAME AS \"middleName\",PER.LAST_NAME AS \"lastName\",PGR.GROUP_NAME AS \"groupName\" FROM PARTY PTY INNER JOIN WORK_EFFORT_PARTY_ASSIGNMENT WEF ON WEF.PARTY_ID = PTY.PARTY_ID LEFT JOIN PERSON PER ON PTY.PARTY_ID = PER.PARTY_ID LEFT JOIN PARTY_GROUP PGR ON PTY.PARTY_ID = PGR.PARTY_ID INNER JOIN WORK_EFFORT WE ON WEF.WORK_EFFORT_ID = WE.WORK_EFFORT_ID", resultSetMapping="PartyDetailAndWorkEffortAssignMapping")
@SqlResultSetMapping(name="PartyDetailAndWorkEffortAssignMapping", entities={
@EntityResult(entityClass=PartyDetailAndWorkEffortAssign.class, fields = {
@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="partyTypeId", column="partyTypeId")
,@FieldResult(name="partyStatusId", column="partyStatusId")
,@FieldResult(name="workEffortTypeId", column="workEffortTypeId")
,@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="firstName", column="firstName")
,@FieldResult(name="middleName", column="middleName")
,@FieldResult(name="lastName", column="lastName")
,@FieldResult(name="groupName", column="groupName")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyDetailAndWorkEffortAssign extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PTY.PARTY_ID");
        fields.put("partyTypeId", "PTY.PARTY_TYPE_ID");
        fields.put("partyStatusId", "PTY.STATUS_ID");
        fields.put("workEffortTypeId", "WE.WORK_EFFORT_TYPE_ID");
        fields.put("workEffortId", "WEF.WORK_EFFORT_ID");
        fields.put("fromDate", "WEF.FROM_DATE");
        fields.put("thruDate", "WEF.THRU_DATE");
        fields.put("roleTypeId", "WEF.ROLE_TYPE_ID");
        fields.put("statusId", "WEF.STATUS_ID");
        fields.put("firstName", "PER.FIRST_NAME");
        fields.put("middleName", "PER.MIDDLE_NAME");
        fields.put("lastName", "PER.LAST_NAME");
        fields.put("groupName", "PGR.GROUP_NAME");
fieldMapColumns.put("PartyDetailAndWorkEffortAssign", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyDetailAndWorkEffortAssign> {
    partyId("partyId"),
    partyTypeId("partyTypeId"),
    partyStatusId("partyStatusId"),
    workEffortTypeId("workEffortTypeId"),
    workEffortId("workEffortId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    roleTypeId("roleTypeId"),
    statusId("statusId"),
    firstName("firstName"),
    middleName("middleName"),
    lastName("lastName"),
    groupName("groupName");
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
   private String partyId;
    
   private String partyTypeId;
    
   private String partyStatusId;
    
   private String workEffortTypeId;
    
   private String workEffortId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String roleTypeId;
    
   private String statusId;
    
   private String firstName;
    
   private String middleName;
    
   private String lastName;
    
   private String groupName;

  /**
   * Default constructor.
   */
  public PartyDetailAndWorkEffortAssign() {
      super();
      this.baseEntityName = "PartyDetailAndWorkEffortAssign";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("roleTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("partyStatusId");this.allFieldsNames.add("workEffortTypeId");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("firstName");this.allFieldsNames.add("middleName");this.allFieldsNames.add("lastName");this.allFieldsNames.add("groupName");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyDetailAndWorkEffortAssign(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param partyTypeId the partyTypeId to set
     */
    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }
    /**
     * Auto generated value setter.
     * @param partyStatusId the partyStatusId to set
     */
    public void setPartyStatusId(String partyStatusId) {
        this.partyStatusId = partyStatusId;
    }
    /**
     * Auto generated value setter.
     * @param workEffortTypeId the workEffortTypeId to set
     */
    public void setWorkEffortTypeId(String workEffortTypeId) {
        this.workEffortTypeId = workEffortTypeId;
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Auto generated value setter.
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * Auto generated value setter.
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Auto generated value setter.
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
    public String getPartyTypeId() {
        return this.partyTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyStatusId() {
        return this.partyStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortTypeId() {
        return this.workEffortTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMiddleName() {
        return this.middleName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupName() {
        return this.groupName;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setPartyTypeId((String) mapValue.get("partyTypeId"));
        setPartyStatusId((String) mapValue.get("partyStatusId"));
        setWorkEffortTypeId((String) mapValue.get("workEffortTypeId"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setStatusId((String) mapValue.get("statusId"));
        setFirstName((String) mapValue.get("firstName"));
        setMiddleName((String) mapValue.get("middleName"));
        setLastName((String) mapValue.get("lastName"));
        setGroupName((String) mapValue.get("groupName"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("partyTypeId", getPartyTypeId());
        mapValue.put("partyStatusId", getPartyStatusId());
        mapValue.put("workEffortTypeId", getWorkEffortTypeId());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("firstName", getFirstName());
        mapValue.put("middleName", getMiddleName());
        mapValue.put("lastName", getLastName());
        mapValue.put("groupName", getGroupName());
        return mapValue;
    }


}
