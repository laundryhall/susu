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
 * Auto generated base entity TechDataCalendar.
 */
@javax.persistence.Entity
@Table(name="TECH_DATA_CALENDAR")
public class TechDataCalendar extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("calendarId", "CALENDAR_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("calendarWeekId", "CALENDAR_WEEK_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TechDataCalendar", fields);
}
  public static enum Fields implements EntityFieldInterface<TechDataCalendar> {
    calendarId("calendarId"),
    description("description"),
    calendarWeekId("calendarWeekId"),
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

   @org.hibernate.annotations.GenericGenerator(name="TechDataCalendar_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="TechDataCalendar_GEN")
   @Id
   @Column(name="CALENDAR_ID")
   private String calendarId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="CALENDAR_WEEK_ID")
   private String calendarWeekId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CALENDAR_WEEK_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TechDataCalendarWeek techDataCalendarWeek = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="techDataCalendar", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CALENDAR_ID")
   
   private List<FixedAsset> fixedAssets = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="techDataCalendar", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CALENDAR_ID")
   
   private List<TechDataCalendarExcDay> techDataCalendarExcDays = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="techDataCalendar", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CALENDAR_ID")
   
   private List<TechDataCalendarExcWeek> techDataCalendarExcWeeks = null;

  /**
   * Default constructor.
   */
  public TechDataCalendar() {
      super();
      this.baseEntityName = "TechDataCalendar";
      this.isView = false;
      this.resourceName = "ManufacturingEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("calendarId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("calendarId");this.allFieldsNames.add("description");this.allFieldsNames.add("calendarWeekId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TechDataCalendar(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param calendarId the calendarId to set
     */
    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
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
     * @param calendarWeekId the calendarWeekId to set
     */
    public void setCalendarWeekId(String calendarWeekId) {
        this.calendarWeekId = calendarWeekId;
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
    public String getCalendarId() {
        return this.calendarId;
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
    public String getCalendarWeekId() {
        return this.calendarWeekId;
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
     * Auto generated method that gets the related <code>TechDataCalendarWeek</code> by the relation named <code>TechDataCalendarWeek</code>.
     * @return the <code>TechDataCalendarWeek</code>
     * @throws RepositoryException if an error occurs
     */
    public TechDataCalendarWeek getTechDataCalendarWeek() throws RepositoryException {
        if (this.techDataCalendarWeek == null) {
            this.techDataCalendarWeek = getRelatedOne(TechDataCalendarWeek.class, "TechDataCalendarWeek");
        }
        return this.techDataCalendarWeek;
    }
    /**
     * Auto generated method that gets the related <code>FixedAsset</code> by the relation named <code>FixedAsset</code>.
     * @return the list of <code>FixedAsset</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FixedAsset> getFixedAssets() throws RepositoryException {
        if (this.fixedAssets == null) {
            this.fixedAssets = getRelated(FixedAsset.class, "FixedAsset");
        }
        return this.fixedAssets;
    }
    /**
     * Auto generated method that gets the related <code>TechDataCalendarExcDay</code> by the relation named <code>TechDataCalendarExcDay</code>.
     * @return the list of <code>TechDataCalendarExcDay</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TechDataCalendarExcDay> getTechDataCalendarExcDays() throws RepositoryException {
        if (this.techDataCalendarExcDays == null) {
            this.techDataCalendarExcDays = getRelated(TechDataCalendarExcDay.class, "TechDataCalendarExcDay");
        }
        return this.techDataCalendarExcDays;
    }
    /**
     * Auto generated method that gets the related <code>TechDataCalendarExcWeek</code> by the relation named <code>TechDataCalendarExcWeek</code>.
     * @return the list of <code>TechDataCalendarExcWeek</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TechDataCalendarExcWeek> getTechDataCalendarExcWeeks() throws RepositoryException {
        if (this.techDataCalendarExcWeeks == null) {
            this.techDataCalendarExcWeeks = getRelated(TechDataCalendarExcWeek.class, "TechDataCalendarExcWeek");
        }
        return this.techDataCalendarExcWeeks;
    }

    /**
     * Auto generated value setter.
     * @param techDataCalendarWeek the techDataCalendarWeek to set
    */
    public void setTechDataCalendarWeek(TechDataCalendarWeek techDataCalendarWeek) {
        this.techDataCalendarWeek = techDataCalendarWeek;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssets the fixedAssets to set
    */
    public void setFixedAssets(List<FixedAsset> fixedAssets) {
        this.fixedAssets = fixedAssets;
    }
    /**
     * Auto generated value setter.
     * @param techDataCalendarExcDays the techDataCalendarExcDays to set
    */
    public void setTechDataCalendarExcDays(List<TechDataCalendarExcDay> techDataCalendarExcDays) {
        this.techDataCalendarExcDays = techDataCalendarExcDays;
    }
    /**
     * Auto generated value setter.
     * @param techDataCalendarExcWeeks the techDataCalendarExcWeeks to set
    */
    public void setTechDataCalendarExcWeeks(List<TechDataCalendarExcWeek> techDataCalendarExcWeeks) {
        this.techDataCalendarExcWeeks = techDataCalendarExcWeeks;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addTechDataCalendarExcDay(TechDataCalendarExcDay techDataCalendarExcDay) {
        if (this.techDataCalendarExcDays == null) {
            this.techDataCalendarExcDays = new ArrayList<TechDataCalendarExcDay>();
        }
        this.techDataCalendarExcDays.add(techDataCalendarExcDay);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeTechDataCalendarExcDay(TechDataCalendarExcDay techDataCalendarExcDay) {
        if (this.techDataCalendarExcDays == null) {
            return;
        }
        this.techDataCalendarExcDays.remove(techDataCalendarExcDay);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearTechDataCalendarExcDay() {
        if (this.techDataCalendarExcDays == null) {
            return;
        }
        this.techDataCalendarExcDays.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addTechDataCalendarExcWeek(TechDataCalendarExcWeek techDataCalendarExcWeek) {
        if (this.techDataCalendarExcWeeks == null) {
            this.techDataCalendarExcWeeks = new ArrayList<TechDataCalendarExcWeek>();
        }
        this.techDataCalendarExcWeeks.add(techDataCalendarExcWeek);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeTechDataCalendarExcWeek(TechDataCalendarExcWeek techDataCalendarExcWeek) {
        if (this.techDataCalendarExcWeeks == null) {
            return;
        }
        this.techDataCalendarExcWeeks.remove(techDataCalendarExcWeek);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearTechDataCalendarExcWeek() {
        if (this.techDataCalendarExcWeeks == null) {
            return;
        }
        this.techDataCalendarExcWeeks.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCalendarId((String) mapValue.get("calendarId"));
        setDescription((String) mapValue.get("description"));
        setCalendarWeekId((String) mapValue.get("calendarWeekId"));
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
        mapValue.put("calendarId", getCalendarId());
        mapValue.put("description", getDescription());
        mapValue.put("calendarWeekId", getCalendarWeekId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
