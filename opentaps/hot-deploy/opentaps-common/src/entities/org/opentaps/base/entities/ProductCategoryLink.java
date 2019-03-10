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
 * Auto generated base entity ProductCategoryLink.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CATEGORY_LINK")
public class ProductCategoryLink extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productCategoryId", "PRODUCT_CATEGORY_ID");
        fields.put("linkSeqId", "LINK_SEQ_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("comments", "COMMENTS");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("titleText", "TITLE_TEXT");
        fields.put("detailText", "DETAIL_TEXT");
        fields.put("imageUrl", "IMAGE_URL");
        fields.put("imageTwoUrl", "IMAGE_TWO_URL");
        fields.put("linkTypeEnumId", "LINK_TYPE_ENUM_ID");
        fields.put("linkInfo", "LINK_INFO");
        fields.put("detailSubScreen", "DETAIL_SUB_SCREEN");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductCategoryLink", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductCategoryLink> {
    productCategoryId("productCategoryId"),
    linkSeqId("linkSeqId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    comments("comments"),
    sequenceNum("sequenceNum"),
    titleText("titleText"),
    detailText("detailText"),
    imageUrl("imageUrl"),
    imageTwoUrl("imageTwoUrl"),
    linkTypeEnumId("linkTypeEnumId"),
    linkInfo("linkInfo"),
    detailSubScreen("detailSubScreen"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductCategoryLinkPkBridge.class)
     private ProductCategoryLinkPk id = new ProductCategoryLinkPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductCategoryLinkPk</code>
     */
      public ProductCategoryLinkPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductCategoryLinkPk</code> value to set
    */   
      public void setId(ProductCategoryLinkPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="TITLE_TEXT")
   private String titleText;
   @Column(name="DETAIL_TEXT")
   private String detailText;
   @Column(name="IMAGE_URL")
   private String imageUrl;
   @Column(name="IMAGE_TWO_URL")
   private String imageTwoUrl;
   @Column(name="LINK_TYPE_ENUM_ID")
   private String linkTypeEnumId;
   @Column(name="LINK_INFO")
   private String linkInfo;
   @Column(name="DETAIL_SUB_SCREEN")
   private String detailSubScreen;
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
   
   private ProductCategory productCategory = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="LINK_TYPE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration linkTypeEnumeration = null;

  /**
   * Default constructor.
   */
  public ProductCategoryLink() {
      super();
      this.baseEntityName = "ProductCategoryLink";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productCategoryId");this.primaryKeyNames.add("linkSeqId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("linkSeqId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("comments");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("titleText");this.allFieldsNames.add("detailText");this.allFieldsNames.add("imageUrl");this.allFieldsNames.add("imageTwoUrl");this.allFieldsNames.add("linkTypeEnumId");this.allFieldsNames.add("linkInfo");this.allFieldsNames.add("detailSubScreen");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductCategoryLink(RepositoryInterface repository) {
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
     * @param linkSeqId the linkSeqId to set
     */
    public void setLinkSeqId(String linkSeqId) {
        id.setLinkSeqId(linkSeqId);
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
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
     * @param titleText the titleText to set
     */
    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }
    /**
     * Auto generated value setter.
     * @param detailText the detailText to set
     */
    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }
    /**
     * Auto generated value setter.
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    /**
     * Auto generated value setter.
     * @param imageTwoUrl the imageTwoUrl to set
     */
    public void setImageTwoUrl(String imageTwoUrl) {
        this.imageTwoUrl = imageTwoUrl;
    }
    /**
     * Auto generated value setter.
     * @param linkTypeEnumId the linkTypeEnumId to set
     */
    public void setLinkTypeEnumId(String linkTypeEnumId) {
        this.linkTypeEnumId = linkTypeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param linkInfo the linkInfo to set
     */
    public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo;
    }
    /**
     * Auto generated value setter.
     * @param detailSubScreen the detailSubScreen to set
     */
    public void setDetailSubScreen(String detailSubScreen) {
        this.detailSubScreen = detailSubScreen;
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
    public String getLinkSeqId() {
        return this.id.getLinkSeqId();
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
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
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
     * @return <code>String</code>
     */
    public String getTitleText() {
        return this.titleText;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDetailText() {
        return this.detailText;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getImageTwoUrl() {
        return this.imageTwoUrl;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLinkTypeEnumId() {
        return this.linkTypeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLinkInfo() {
        return this.linkInfo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDetailSubScreen() {
        return this.detailSubScreen;
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
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>ProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getProductCategory() throws RepositoryException {
        if (this.productCategory == null) {
            this.productCategory = getRelatedOne(ProductCategory.class, "ProductCategory");
        }
        return this.productCategory;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>LinkTypeEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getLinkTypeEnumeration() throws RepositoryException {
        if (this.linkTypeEnumeration == null) {
            this.linkTypeEnumeration = getRelatedOne(Enumeration.class, "LinkTypeEnumeration");
        }
        return this.linkTypeEnumeration;
    }

    /**
     * Auto generated value setter.
     * @param productCategory the productCategory to set
    */
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
    /**
     * Auto generated value setter.
     * @param linkTypeEnumeration the linkTypeEnumeration to set
    */
    public void setLinkTypeEnumeration(Enumeration linkTypeEnumeration) {
        this.linkTypeEnumeration = linkTypeEnumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setLinkSeqId((String) mapValue.get("linkSeqId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setComments((String) mapValue.get("comments"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setTitleText((String) mapValue.get("titleText"));
        setDetailText((String) mapValue.get("detailText"));
        setImageUrl((String) mapValue.get("imageUrl"));
        setImageTwoUrl((String) mapValue.get("imageTwoUrl"));
        setLinkTypeEnumId((String) mapValue.get("linkTypeEnumId"));
        setLinkInfo((String) mapValue.get("linkInfo"));
        setDetailSubScreen((String) mapValue.get("detailSubScreen"));
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
        mapValue.put("linkSeqId", getLinkSeqId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("comments", getComments());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("titleText", getTitleText());
        mapValue.put("detailText", getDetailText());
        mapValue.put("imageUrl", getImageUrl());
        mapValue.put("imageTwoUrl", getImageTwoUrl());
        mapValue.put("linkTypeEnumId", getLinkTypeEnumId());
        mapValue.put("linkInfo", getLinkInfo());
        mapValue.put("detailSubScreen", getDetailSubScreen());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}