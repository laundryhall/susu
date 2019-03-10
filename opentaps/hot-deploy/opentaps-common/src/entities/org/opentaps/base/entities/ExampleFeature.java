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
 * Auto generated base entity ExampleFeature.
 */
@javax.persistence.Entity
@Table(name="EXAMPLE_FEATURE")
public class ExampleFeature extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("exampleFeatureId", "EXAMPLE_FEATURE_ID");
        fields.put("featureSourceEnumId", "FEATURE_SOURCE_ENUM_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ExampleFeature", fields);
}
  public static enum Fields implements EntityFieldInterface<ExampleFeature> {
    exampleFeatureId("exampleFeatureId"),
    featureSourceEnumId("featureSourceEnumId"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="ExampleFeature_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ExampleFeature_GEN")
   @Id
   @Column(name="EXAMPLE_FEATURE_ID")
   private String exampleFeatureId;
   @Column(name="FEATURE_SOURCE_ENUM_ID")
   private String featureSourceEnumId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FEATURE_SOURCE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration enumeration = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="exampleFeature", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="EXAMPLE_FEATURE_ID")
   
   private List<ExampleFeatureAppl> exampleFeatureAppls = null;

  /**
   * Default constructor.
   */
  public ExampleFeature() {
      super();
      this.baseEntityName = "ExampleFeature";
      this.isView = false;
      this.resourceName = "ExampleEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("exampleFeatureId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("exampleFeatureId");this.allFieldsNames.add("featureSourceEnumId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ExampleFeature(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param exampleFeatureId the exampleFeatureId to set
     */
    public void setExampleFeatureId(String exampleFeatureId) {
        this.exampleFeatureId = exampleFeatureId;
    }
    /**
     * Auto generated value setter.
     * @param featureSourceEnumId the featureSourceEnumId to set
     */
    public void setFeatureSourceEnumId(String featureSourceEnumId) {
        this.featureSourceEnumId = featureSourceEnumId;
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
    public String getExampleFeatureId() {
        return this.exampleFeatureId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFeatureSourceEnumId() {
        return this.featureSourceEnumId;
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
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>Enumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getEnumeration() throws RepositoryException {
        if (this.enumeration == null) {
            this.enumeration = getRelatedOne(Enumeration.class, "Enumeration");
        }
        return this.enumeration;
    }
    /**
     * Auto generated method that gets the related <code>ExampleFeatureAppl</code> by the relation named <code>ExampleFeatureAppl</code>.
     * @return the list of <code>ExampleFeatureAppl</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ExampleFeatureAppl> getExampleFeatureAppls() throws RepositoryException {
        if (this.exampleFeatureAppls == null) {
            this.exampleFeatureAppls = getRelated(ExampleFeatureAppl.class, "ExampleFeatureAppl");
        }
        return this.exampleFeatureAppls;
    }

    /**
     * Auto generated value setter.
     * @param enumeration the enumeration to set
    */
    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }
    /**
     * Auto generated value setter.
     * @param exampleFeatureAppls the exampleFeatureAppls to set
    */
    public void setExampleFeatureAppls(List<ExampleFeatureAppl> exampleFeatureAppls) {
        this.exampleFeatureAppls = exampleFeatureAppls;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addExampleFeatureAppl(ExampleFeatureAppl exampleFeatureAppl) {
        if (this.exampleFeatureAppls == null) {
            this.exampleFeatureAppls = new ArrayList<ExampleFeatureAppl>();
        }
        this.exampleFeatureAppls.add(exampleFeatureAppl);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeExampleFeatureAppl(ExampleFeatureAppl exampleFeatureAppl) {
        if (this.exampleFeatureAppls == null) {
            return;
        }
        this.exampleFeatureAppls.remove(exampleFeatureAppl);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearExampleFeatureAppl() {
        if (this.exampleFeatureAppls == null) {
            return;
        }
        this.exampleFeatureAppls.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setExampleFeatureId((String) mapValue.get("exampleFeatureId"));
        setFeatureSourceEnumId((String) mapValue.get("featureSourceEnumId"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("exampleFeatureId", getExampleFeatureId());
        mapValue.put("featureSourceEnumId", getFeatureSourceEnumId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}