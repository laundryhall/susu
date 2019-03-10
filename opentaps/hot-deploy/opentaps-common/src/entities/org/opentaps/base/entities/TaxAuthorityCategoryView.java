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

/**
 * Auto generated base entity TaxAuthorityCategoryView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectTaxAuthorityCategoryViews", query="SELECT TAC.TAX_AUTH_GEO_ID AS \"taxAuthGeoId\",TAC.TAX_AUTH_PARTY_ID AS \"taxAuthPartyId\",TAC.PRODUCT_CATEGORY_ID AS \"productCategoryId\",PC.PRODUCT_CATEGORY_TYPE_ID AS \"productCategoryTypeId\",PC.PRIMARY_PARENT_CATEGORY_ID AS \"primaryParentCategoryId\",PC.CATEGORY_NAME AS \"categoryName\",PC.DESCRIPTION AS \"description\",PC.LONG_DESCRIPTION AS \"longDescription\",PC.CATEGORY_IMAGE_URL AS \"categoryImageUrl\",PC.LINK_ONE_IMAGE_URL AS \"linkOneImageUrl\",PC.LINK_TWO_IMAGE_URL AS \"linkTwoImageUrl\",PC.DETAIL_SCREEN AS \"detailScreen\",PC.SHOW_IN_SELECT AS \"showInSelect\" FROM TAX_AUTHORITY_CATEGORY TAC INNER JOIN PRODUCT_CATEGORY PC ON TAC.PRODUCT_CATEGORY_ID = PC.PRODUCT_CATEGORY_ID", resultSetMapping="TaxAuthorityCategoryViewMapping")
@SqlResultSetMapping(name="TaxAuthorityCategoryViewMapping", entities={
@EntityResult(entityClass=TaxAuthorityCategoryView.class, fields = {
@FieldResult(name="taxAuthGeoId", column="taxAuthGeoId")
,@FieldResult(name="taxAuthPartyId", column="taxAuthPartyId")
,@FieldResult(name="productCategoryId", column="productCategoryId")
,@FieldResult(name="productCategoryTypeId", column="productCategoryTypeId")
,@FieldResult(name="primaryParentCategoryId", column="primaryParentCategoryId")
,@FieldResult(name="categoryName", column="categoryName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="longDescription", column="longDescription")
,@FieldResult(name="categoryImageUrl", column="categoryImageUrl")
,@FieldResult(name="linkOneImageUrl", column="linkOneImageUrl")
,@FieldResult(name="linkTwoImageUrl", column="linkTwoImageUrl")
,@FieldResult(name="detailScreen", column="detailScreen")
,@FieldResult(name="showInSelect", column="showInSelect")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class TaxAuthorityCategoryView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("taxAuthGeoId", "TAC.TAX_AUTH_GEO_ID");
        fields.put("taxAuthPartyId", "TAC.TAX_AUTH_PARTY_ID");
        fields.put("productCategoryId", "TAC.PRODUCT_CATEGORY_ID");
        fields.put("productCategoryTypeId", "PC.PRODUCT_CATEGORY_TYPE_ID");
        fields.put("primaryParentCategoryId", "PC.PRIMARY_PARENT_CATEGORY_ID");
        fields.put("categoryName", "PC.CATEGORY_NAME");
        fields.put("description", "PC.DESCRIPTION");
        fields.put("longDescription", "PC.LONG_DESCRIPTION");
        fields.put("categoryImageUrl", "PC.CATEGORY_IMAGE_URL");
        fields.put("linkOneImageUrl", "PC.LINK_ONE_IMAGE_URL");
        fields.put("linkTwoImageUrl", "PC.LINK_TWO_IMAGE_URL");
        fields.put("detailScreen", "PC.DETAIL_SCREEN");
        fields.put("showInSelect", "PC.SHOW_IN_SELECT");
fieldMapColumns.put("TaxAuthorityCategoryView", fields);
}
  public static enum Fields implements EntityFieldInterface<TaxAuthorityCategoryView> {
    taxAuthGeoId("taxAuthGeoId"),
    taxAuthPartyId("taxAuthPartyId"),
    productCategoryId("productCategoryId"),
    productCategoryTypeId("productCategoryTypeId"),
    primaryParentCategoryId("primaryParentCategoryId"),
    categoryName("categoryName"),
    description("description"),
    longDescription("longDescription"),
    categoryImageUrl("categoryImageUrl"),
    linkOneImageUrl("linkOneImageUrl"),
    linkTwoImageUrl("linkTwoImageUrl"),
    detailScreen("detailScreen"),
    showInSelect("showInSelect");
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
   private String taxAuthGeoId;
    
   private String taxAuthPartyId;
    
   private String productCategoryId;
    
   private String productCategoryTypeId;
    
   private String primaryParentCategoryId;
    
   private String categoryName;
    
   private String description;
    
   private String longDescription;
    
   private String categoryImageUrl;
    
   private String linkOneImageUrl;
    
   private String linkTwoImageUrl;
    
   private String detailScreen;
    
   private String showInSelect;

  /**
   * Default constructor.
   */
  public TaxAuthorityCategoryView() {
      super();
      this.baseEntityName = "TaxAuthorityCategoryView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("taxAuthGeoId");this.primaryKeyNames.add("taxAuthPartyId");this.primaryKeyNames.add("productCategoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("taxAuthGeoId");this.allFieldsNames.add("taxAuthPartyId");this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("productCategoryTypeId");this.allFieldsNames.add("primaryParentCategoryId");this.allFieldsNames.add("categoryName");this.allFieldsNames.add("description");this.allFieldsNames.add("longDescription");this.allFieldsNames.add("categoryImageUrl");this.allFieldsNames.add("linkOneImageUrl");this.allFieldsNames.add("linkTwoImageUrl");this.allFieldsNames.add("detailScreen");this.allFieldsNames.add("showInSelect");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TaxAuthorityCategoryView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param taxAuthGeoId the taxAuthGeoId to set
     */
    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthPartyId the taxAuthPartyId to set
     */
    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
    /**
     * Auto generated value setter.
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param productCategoryTypeId the productCategoryTypeId to set
     */
    public void setProductCategoryTypeId(String productCategoryTypeId) {
        this.productCategoryTypeId = productCategoryTypeId;
    }
    /**
     * Auto generated value setter.
     * @param primaryParentCategoryId the primaryParentCategoryId to set
     */
    public void setPrimaryParentCategoryId(String primaryParentCategoryId) {
        this.primaryParentCategoryId = primaryParentCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
     * @param longDescription the longDescription to set
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    /**
     * Auto generated value setter.
     * @param categoryImageUrl the categoryImageUrl to set
     */
    public void setCategoryImageUrl(String categoryImageUrl) {
        this.categoryImageUrl = categoryImageUrl;
    }
    /**
     * Auto generated value setter.
     * @param linkOneImageUrl the linkOneImageUrl to set
     */
    public void setLinkOneImageUrl(String linkOneImageUrl) {
        this.linkOneImageUrl = linkOneImageUrl;
    }
    /**
     * Auto generated value setter.
     * @param linkTwoImageUrl the linkTwoImageUrl to set
     */
    public void setLinkTwoImageUrl(String linkTwoImageUrl) {
        this.linkTwoImageUrl = linkTwoImageUrl;
    }
    /**
     * Auto generated value setter.
     * @param detailScreen the detailScreen to set
     */
    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }
    /**
     * Auto generated value setter.
     * @param showInSelect the showInSelect to set
     */
    public void setShowInSelect(String showInSelect) {
        this.showInSelect = showInSelect;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthGeoId() {
        return this.taxAuthGeoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthPartyId() {
        return this.taxAuthPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductCategoryId() {
        return this.productCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductCategoryTypeId() {
        return this.productCategoryTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrimaryParentCategoryId() {
        return this.primaryParentCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCategoryName() {
        return this.categoryName;
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
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCategoryImageUrl() {
        return this.categoryImageUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLinkOneImageUrl() {
        return this.linkOneImageUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLinkTwoImageUrl() {
        return this.linkTwoImageUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDetailScreen() {
        return this.detailScreen;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShowInSelect() {
        return this.showInSelect;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        setTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setProductCategoryTypeId((String) mapValue.get("productCategoryTypeId"));
        setPrimaryParentCategoryId((String) mapValue.get("primaryParentCategoryId"));
        setCategoryName((String) mapValue.get("categoryName"));
        setDescription((String) mapValue.get("description"));
        setLongDescription((String) mapValue.get("longDescription"));
        setCategoryImageUrl((String) mapValue.get("categoryImageUrl"));
        setLinkOneImageUrl((String) mapValue.get("linkOneImageUrl"));
        setLinkTwoImageUrl((String) mapValue.get("linkTwoImageUrl"));
        setDetailScreen((String) mapValue.get("detailScreen"));
        setShowInSelect((String) mapValue.get("showInSelect"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("taxAuthGeoId", getTaxAuthGeoId());
        mapValue.put("taxAuthPartyId", getTaxAuthPartyId());
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("productCategoryTypeId", getProductCategoryTypeId());
        mapValue.put("primaryParentCategoryId", getPrimaryParentCategoryId());
        mapValue.put("categoryName", getCategoryName());
        mapValue.put("description", getDescription());
        mapValue.put("longDescription", getLongDescription());
        mapValue.put("categoryImageUrl", getCategoryImageUrl());
        mapValue.put("linkOneImageUrl", getLinkOneImageUrl());
        mapValue.put("linkTwoImageUrl", getLinkTwoImageUrl());
        mapValue.put("detailScreen", getDetailScreen());
        mapValue.put("showInSelect", getShowInSelect());
        return mapValue;
    }


}