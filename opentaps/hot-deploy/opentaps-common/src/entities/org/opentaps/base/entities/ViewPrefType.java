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
 * Auto generated base entity ViewPrefType.
 */
@javax.persistence.Entity
@Table(name="VIEW_PREF_TYPE")
public class ViewPrefType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("viewPrefTypeId", "VIEW_PREF_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("application", "APPLICATION");
        fields.put("applicationSection", "APPLICATION_SECTION");
        fields.put("screenName", "SCREEN_NAME");
        fields.put("formName", "FORM_NAME");
        fields.put("domId", "DOM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ViewPrefType", fields);
}
  public static enum Fields implements EntityFieldInterface<ViewPrefType> {
    viewPrefTypeId("viewPrefTypeId"),
    description("description"),
    application("application"),
    applicationSection("applicationSection"),
    screenName("screenName"),
    formName("formName"),
    domId("domId"),
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

   @org.hibernate.annotations.GenericGenerator(name="ViewPrefType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ViewPrefType_GEN")
   @Id
   @Column(name="VIEW_PREF_TYPE_ID")
   private String viewPrefTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="APPLICATION")
   private String application;
   @Column(name="APPLICATION_SECTION")
   private String applicationSection;
   @Column(name="SCREEN_NAME")
   private String screenName;
   @Column(name="FORM_NAME")
   private String formName;
   @Column(name="DOM_ID")
   private String domId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="viewPrefType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="VIEW_PREF_TYPE_ID")
   
   private List<ViewPreference> viewPreferences = null;

  /**
   * Default constructor.
   */
  public ViewPrefType() {
      super();
      this.baseEntityName = "ViewPrefType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("viewPrefTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("viewPrefTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("application");this.allFieldsNames.add("applicationSection");this.allFieldsNames.add("screenName");this.allFieldsNames.add("formName");this.allFieldsNames.add("domId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ViewPrefType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param viewPrefTypeId the viewPrefTypeId to set
     */
    public void setViewPrefTypeId(String viewPrefTypeId) {
        this.viewPrefTypeId = viewPrefTypeId;
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
     * @param application the application to set
     */
    public void setApplication(String application) {
        this.application = application;
    }
    /**
     * Auto generated value setter.
     * @param applicationSection the applicationSection to set
     */
    public void setApplicationSection(String applicationSection) {
        this.applicationSection = applicationSection;
    }
    /**
     * Auto generated value setter.
     * @param screenName the screenName to set
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    /**
     * Auto generated value setter.
     * @param formName the formName to set
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }
    /**
     * Auto generated value setter.
     * @param domId the domId to set
     */
    public void setDomId(String domId) {
        this.domId = domId;
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
    public String getViewPrefTypeId() {
        return this.viewPrefTypeId;
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
    public String getApplication() {
        return this.application;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getApplicationSection() {
        return this.applicationSection;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getScreenName() {
        return this.screenName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFormName() {
        return this.formName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDomId() {
        return this.domId;
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
     * Auto generated method that gets the related <code>ViewPreference</code> by the relation named <code>ViewPreference</code>.
     * @return the list of <code>ViewPreference</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ViewPreference> getViewPreferences() throws RepositoryException {
        if (this.viewPreferences == null) {
            this.viewPreferences = getRelated(ViewPreference.class, "ViewPreference");
        }
        return this.viewPreferences;
    }

    /**
     * Auto generated value setter.
     * @param viewPreferences the viewPreferences to set
    */
    public void setViewPreferences(List<ViewPreference> viewPreferences) {
        this.viewPreferences = viewPreferences;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addViewPreference(ViewPreference viewPreference) {
        if (this.viewPreferences == null) {
            this.viewPreferences = new ArrayList<ViewPreference>();
        }
        this.viewPreferences.add(viewPreference);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeViewPreference(ViewPreference viewPreference) {
        if (this.viewPreferences == null) {
            return;
        }
        this.viewPreferences.remove(viewPreference);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearViewPreference() {
        if (this.viewPreferences == null) {
            return;
        }
        this.viewPreferences.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setViewPrefTypeId((String) mapValue.get("viewPrefTypeId"));
        setDescription((String) mapValue.get("description"));
        setApplication((String) mapValue.get("application"));
        setApplicationSection((String) mapValue.get("applicationSection"));
        setScreenName((String) mapValue.get("screenName"));
        setFormName((String) mapValue.get("formName"));
        setDomId((String) mapValue.get("domId"));
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
        mapValue.put("viewPrefTypeId", getViewPrefTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("application", getApplication());
        mapValue.put("applicationSection", getApplicationSection());
        mapValue.put("screenName", getScreenName());
        mapValue.put("formName", getFormName());
        mapValue.put("domId", getDomId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
