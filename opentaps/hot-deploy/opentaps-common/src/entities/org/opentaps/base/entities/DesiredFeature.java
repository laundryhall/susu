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
 * Auto generated base entity DesiredFeature.
 */
@javax.persistence.Entity
@Table(name="DESIRED_FEATURE")
public class DesiredFeature extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("desiredFeatureId", "DESIRED_FEATURE_ID");
        fields.put("requirementId", "REQUIREMENT_ID");
        fields.put("productFeatureId", "PRODUCT_FEATURE_ID");
        fields.put("optionalInd", "OPTIONAL_IND");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DesiredFeature", fields);
}
  public static enum Fields implements EntityFieldInterface<DesiredFeature> {
    desiredFeatureId("desiredFeatureId"),
    requirementId("requirementId"),
    productFeatureId("productFeatureId"),
    optionalInd("optionalInd"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.DesiredFeaturePkBridge.class)
     private DesiredFeaturePk id = new DesiredFeaturePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>DesiredFeaturePk</code>
     */
      public DesiredFeaturePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>DesiredFeaturePk</code> value to set
    */   
      public void setId(DesiredFeaturePk id) {
         this.id = id;
      }
   @Column(name="PRODUCT_FEATURE_ID")
   private String productFeatureId;
   @Column(name="OPTIONAL_IND")
   private String optionalInd;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REQUIREMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Requirement requirement = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_FEATURE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductFeature productFeature = null;

  /**
   * Default constructor.
   */
  public DesiredFeature() {
      super();
      this.baseEntityName = "DesiredFeature";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("desiredFeatureId");this.primaryKeyNames.add("requirementId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("desiredFeatureId");this.allFieldsNames.add("requirementId");this.allFieldsNames.add("productFeatureId");this.allFieldsNames.add("optionalInd");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DesiredFeature(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param desiredFeatureId the desiredFeatureId to set
     */
    public void setDesiredFeatureId(String desiredFeatureId) {
        id.setDesiredFeatureId(desiredFeatureId);
    }
    /**
     * Auto generated value setter.
     * @param requirementId the requirementId to set
     */
    public void setRequirementId(String requirementId) {
        id.setRequirementId(requirementId);
    }
    /**
     * Auto generated value setter.
     * @param productFeatureId the productFeatureId to set
     */
    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
    /**
     * Auto generated value setter.
     * @param optionalInd the optionalInd to set
     */
    public void setOptionalInd(String optionalInd) {
        this.optionalInd = optionalInd;
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
    public String getDesiredFeatureId() {
        return this.id.getDesiredFeatureId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirementId() {
        return this.id.getRequirementId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureId() {
        return this.productFeatureId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOptionalInd() {
        return this.optionalInd;
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
     * Auto generated method that gets the related <code>Requirement</code> by the relation named <code>Requirement</code>.
     * @return the <code>Requirement</code>
     * @throws RepositoryException if an error occurs
     */
    public Requirement getRequirement() throws RepositoryException {
        if (this.requirement == null) {
            this.requirement = getRelatedOne(Requirement.class, "Requirement");
        }
        return this.requirement;
    }
    /**
     * Auto generated method that gets the related <code>ProductFeature</code> by the relation named <code>ProductFeature</code>.
     * @return the <code>ProductFeature</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductFeature getProductFeature() throws RepositoryException {
        if (this.productFeature == null) {
            this.productFeature = getRelatedOne(ProductFeature.class, "ProductFeature");
        }
        return this.productFeature;
    }

    /**
     * Auto generated value setter.
     * @param requirement the requirement to set
    */
    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
    /**
     * Auto generated value setter.
     * @param productFeature the productFeature to set
    */
    public void setProductFeature(ProductFeature productFeature) {
        this.productFeature = productFeature;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setDesiredFeatureId((String) mapValue.get("desiredFeatureId"));
        setRequirementId((String) mapValue.get("requirementId"));
        setProductFeatureId((String) mapValue.get("productFeatureId"));
        setOptionalInd((String) mapValue.get("optionalInd"));
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
        mapValue.put("desiredFeatureId", getDesiredFeatureId());
        mapValue.put("requirementId", getRequirementId());
        mapValue.put("productFeatureId", getProductFeatureId());
        mapValue.put("optionalInd", getOptionalInd());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
