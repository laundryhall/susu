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
 * Auto generated base entity ProductCategoryRollup.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CATEGORY_ROLLUP")
public class ProductCategoryRollup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productCategoryId", "PRODUCT_CATEGORY_ID");
        fields.put("parentProductCategoryId", "PARENT_PRODUCT_CATEGORY_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductCategoryRollup", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductCategoryRollup> {
    productCategoryId("productCategoryId"),
    parentProductCategoryId("parentProductCategoryId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    sequenceNum("sequenceNum"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductCategoryRollupPkBridge.class)
     private ProductCategoryRollupPk id = new ProductCategoryRollupPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductCategoryRollupPk</code>
     */
      public ProductCategoryRollupPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductCategoryRollupPk</code> value to set
    */   
      public void setId(ProductCategoryRollupPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductCategory currentProductCategory = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_PRODUCT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductCategory parentProductCategory = null;
   private transient List<ProductCategoryRollup> childProductCategoryRollups = null;
   private transient List<ProductCategoryRollup> parentProductCategoryRollups = null;
   private transient List<ProductCategoryRollup> siblingProductCategoryRollups = null;

  /**
   * Default constructor.
   */
  public ProductCategoryRollup() {
      super();
      this.baseEntityName = "ProductCategoryRollup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productCategoryId");this.primaryKeyNames.add("parentProductCategoryId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("parentProductCategoryId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductCategoryRollup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        id.setProductCategoryId(productCategoryId);
    }
    /**
     * Auto generated value setter.
     * @param parentProductCategoryId the parentProductCategoryId to set
     */
    public void setParentProductCategoryId(String parentProductCategoryId) {
        id.setParentProductCategoryId(parentProductCategoryId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
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
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
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
    public String getProductCategoryId() {
        return this.id.getProductCategoryId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentProductCategoryId() {
        return this.id.getParentProductCategoryId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
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
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
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
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>CurrentProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getCurrentProductCategory() throws RepositoryException {
        if (this.currentProductCategory == null) {
            this.currentProductCategory = getRelatedOne(ProductCategory.class, "CurrentProductCategory");
        }
        return this.currentProductCategory;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>ParentProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getParentProductCategory() throws RepositoryException {
        if (this.parentProductCategory == null) {
            this.parentProductCategory = getRelatedOne(ProductCategory.class, "ParentProductCategory");
        }
        return this.parentProductCategory;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategoryRollup</code> by the relation named <code>ChildProductCategoryRollup</code>.
     * @return the list of <code>ProductCategoryRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductCategoryRollup> getChildProductCategoryRollups() throws RepositoryException {
        if (this.childProductCategoryRollups == null) {
            this.childProductCategoryRollups = getRelated(ProductCategoryRollup.class, "ChildProductCategoryRollup");
        }
        return this.childProductCategoryRollups;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategoryRollup</code> by the relation named <code>ParentProductCategoryRollup</code>.
     * @return the list of <code>ProductCategoryRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductCategoryRollup> getParentProductCategoryRollups() throws RepositoryException {
        if (this.parentProductCategoryRollups == null) {
            this.parentProductCategoryRollups = getRelated(ProductCategoryRollup.class, "ParentProductCategoryRollup");
        }
        return this.parentProductCategoryRollups;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategoryRollup</code> by the relation named <code>SiblingProductCategoryRollup</code>.
     * @return the list of <code>ProductCategoryRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductCategoryRollup> getSiblingProductCategoryRollups() throws RepositoryException {
        if (this.siblingProductCategoryRollups == null) {
            this.siblingProductCategoryRollups = getRelated(ProductCategoryRollup.class, "SiblingProductCategoryRollup");
        }
        return this.siblingProductCategoryRollups;
    }

    /**
     * Auto generated value setter.
     * @param currentProductCategory the currentProductCategory to set
    */
    public void setCurrentProductCategory(ProductCategory currentProductCategory) {
        this.currentProductCategory = currentProductCategory;
    }
    /**
     * Auto generated value setter.
     * @param parentProductCategory the parentProductCategory to set
    */
    public void setParentProductCategory(ProductCategory parentProductCategory) {
        this.parentProductCategory = parentProductCategory;
    }
    /**
     * Auto generated value setter.
     * @param childProductCategoryRollups the childProductCategoryRollups to set
    */
    public void setChildProductCategoryRollups(List<ProductCategoryRollup> childProductCategoryRollups) {
        this.childProductCategoryRollups = childProductCategoryRollups;
    }
    /**
     * Auto generated value setter.
     * @param parentProductCategoryRollups the parentProductCategoryRollups to set
    */
    public void setParentProductCategoryRollups(List<ProductCategoryRollup> parentProductCategoryRollups) {
        this.parentProductCategoryRollups = parentProductCategoryRollups;
    }
    /**
     * Auto generated value setter.
     * @param siblingProductCategoryRollups the siblingProductCategoryRollups to set
    */
    public void setSiblingProductCategoryRollups(List<ProductCategoryRollup> siblingProductCategoryRollups) {
        this.siblingProductCategoryRollups = siblingProductCategoryRollups;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setParentProductCategoryId((String) mapValue.get("parentProductCategoryId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
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
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("parentProductCategoryId", getParentProductCategoryId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
