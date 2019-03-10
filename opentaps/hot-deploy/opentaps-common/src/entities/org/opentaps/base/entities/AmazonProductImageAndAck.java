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
 * Auto generated base entity AmazonProductImageAndAck.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectAmazonProductImageAndAcks", query="SELECT API.PRODUCT_ID AS \"productId\",API.STATUS_ID AS \"statusId\",API.PROCESSING_DOCUMENT_ID AS \"processingDocumentId\",API.POST_TIMESTAMP AS \"postTimestamp\",API.POST_ERROR_MESSAGE AS \"postErrorMessage\",API.POST_FAILURES AS \"postFailures\",APIA.PRODUCT_CONTENT_TYPE_ID AS \"productContentTypeId\",APIA.ACKNOWLEDGE_MESSAGE_ID AS \"acknowledgeMessageId\",APIA.ACK_STATUS_ID AS \"ackStatusId\",APIA.ACKNOWLEDGE_TIMESTAMP AS \"acknowledgeTimestamp\",APIA.ACKNOWLEDGE_ERROR_MESSAGE AS \"acknowledgeErrorMessage\" FROM AMAZON_PRODUCT_IMAGE API LEFT JOIN AMAZON_PRODUCT_IMAGE_ACK APIA ON API.PRODUCT_ID = APIA.PRODUCT_ID", resultSetMapping="AmazonProductImageAndAckMapping")
@SqlResultSetMapping(name="AmazonProductImageAndAckMapping", entities={
@EntityResult(entityClass=AmazonProductImageAndAck.class, fields = {
@FieldResult(name="productId", column="productId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="processingDocumentId", column="processingDocumentId")
,@FieldResult(name="postTimestamp", column="postTimestamp")
,@FieldResult(name="postErrorMessage", column="postErrorMessage")
,@FieldResult(name="postFailures", column="postFailures")
,@FieldResult(name="productContentTypeId", column="productContentTypeId")
,@FieldResult(name="acknowledgeMessageId", column="acknowledgeMessageId")
,@FieldResult(name="ackStatusId", column="ackStatusId")
,@FieldResult(name="acknowledgeTimestamp", column="acknowledgeTimestamp")
,@FieldResult(name="acknowledgeErrorMessage", column="acknowledgeErrorMessage")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class AmazonProductImageAndAck extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "API.PRODUCT_ID");
        fields.put("statusId", "API.STATUS_ID");
        fields.put("processingDocumentId", "API.PROCESSING_DOCUMENT_ID");
        fields.put("postTimestamp", "API.POST_TIMESTAMP");
        fields.put("postErrorMessage", "API.POST_ERROR_MESSAGE");
        fields.put("postFailures", "API.POST_FAILURES");
        fields.put("productContentTypeId", "APIA.PRODUCT_CONTENT_TYPE_ID");
        fields.put("acknowledgeMessageId", "APIA.ACKNOWLEDGE_MESSAGE_ID");
        fields.put("ackStatusId", "APIA.ACK_STATUS_ID");
        fields.put("acknowledgeTimestamp", "APIA.ACKNOWLEDGE_TIMESTAMP");
        fields.put("acknowledgeErrorMessage", "APIA.ACKNOWLEDGE_ERROR_MESSAGE");
fieldMapColumns.put("AmazonProductImageAndAck", fields);
}
  public static enum Fields implements EntityFieldInterface<AmazonProductImageAndAck> {
    productId("productId"),
    statusId("statusId"),
    processingDocumentId("processingDocumentId"),
    postTimestamp("postTimestamp"),
    postErrorMessage("postErrorMessage"),
    postFailures("postFailures"),
    productContentTypeId("productContentTypeId"),
    acknowledgeMessageId("acknowledgeMessageId"),
    ackStatusId("ackStatusId"),
    acknowledgeTimestamp("acknowledgeTimestamp"),
    acknowledgeErrorMessage("acknowledgeErrorMessage");
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
   private String productId;
    
   private String statusId;
    
   private Long processingDocumentId;
    
   private Timestamp postTimestamp;
    
   private String postErrorMessage;
    
   private Long postFailures;
    
   private String productContentTypeId;
    
   private String acknowledgeMessageId;
    
   private String ackStatusId;
    
   private Timestamp acknowledgeTimestamp;
    
   private String acknowledgeErrorMessage;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private AmazonProductImage amazonProductImage = null;
   private transient AmazonProductImageAck amazonProductImageAck = null;

  /**
   * Default constructor.
   */
  public AmazonProductImageAndAck() {
      super();
      this.baseEntityName = "AmazonProductImageAndAck";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("productContentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("processingDocumentId");this.allFieldsNames.add("postTimestamp");this.allFieldsNames.add("postErrorMessage");this.allFieldsNames.add("postFailures");this.allFieldsNames.add("productContentTypeId");this.allFieldsNames.add("acknowledgeMessageId");this.allFieldsNames.add("ackStatusId");this.allFieldsNames.add("acknowledgeTimestamp");this.allFieldsNames.add("acknowledgeErrorMessage");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AmazonProductImageAndAck(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
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
     * @param processingDocumentId the processingDocumentId to set
     */
    public void setProcessingDocumentId(Long processingDocumentId) {
        this.processingDocumentId = processingDocumentId;
    }
    /**
     * Auto generated value setter.
     * @param postTimestamp the postTimestamp to set
     */
    public void setPostTimestamp(Timestamp postTimestamp) {
        this.postTimestamp = postTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param postErrorMessage the postErrorMessage to set
     */
    public void setPostErrorMessage(String postErrorMessage) {
        this.postErrorMessage = postErrorMessage;
    }
    /**
     * Auto generated value setter.
     * @param postFailures the postFailures to set
     */
    public void setPostFailures(Long postFailures) {
        this.postFailures = postFailures;
    }
    /**
     * Auto generated value setter.
     * @param productContentTypeId the productContentTypeId to set
     */
    public void setProductContentTypeId(String productContentTypeId) {
        this.productContentTypeId = productContentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param acknowledgeMessageId the acknowledgeMessageId to set
     */
    public void setAcknowledgeMessageId(String acknowledgeMessageId) {
        this.acknowledgeMessageId = acknowledgeMessageId;
    }
    /**
     * Auto generated value setter.
     * @param ackStatusId the ackStatusId to set
     */
    public void setAckStatusId(String ackStatusId) {
        this.ackStatusId = ackStatusId;
    }
    /**
     * Auto generated value setter.
     * @param acknowledgeTimestamp the acknowledgeTimestamp to set
     */
    public void setAcknowledgeTimestamp(Timestamp acknowledgeTimestamp) {
        this.acknowledgeTimestamp = acknowledgeTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param acknowledgeErrorMessage the acknowledgeErrorMessage to set
     */
    public void setAcknowledgeErrorMessage(String acknowledgeErrorMessage) {
        this.acknowledgeErrorMessage = acknowledgeErrorMessage;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
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
     * @return <code>Long</code>
     */
    public Long getProcessingDocumentId() {
        return this.processingDocumentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPostTimestamp() {
        return this.postTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPostErrorMessage() {
        return this.postErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPostFailures() {
        return this.postFailures;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductContentTypeId() {
        return this.productContentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcknowledgeMessageId() {
        return this.acknowledgeMessageId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAckStatusId() {
        return this.ackStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAcknowledgeTimestamp() {
        return this.acknowledgeTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcknowledgeErrorMessage() {
        return this.acknowledgeErrorMessage;
    }

    /**
     * Auto generated method that gets the related <code>AmazonProductImage</code> by the relation named <code>AmazonProductImage</code>.
     * @return the <code>AmazonProductImage</code>
     * @throws RepositoryException if an error occurs
     */
    public AmazonProductImage getAmazonProductImage() throws RepositoryException {
        if (this.amazonProductImage == null) {
            this.amazonProductImage = getRelatedOne(AmazonProductImage.class, "AmazonProductImage");
        }
        return this.amazonProductImage;
    }
    /**
     * Auto generated method that gets the related <code>AmazonProductImageAck</code> by the relation named <code>AmazonProductImageAck</code>.
     * @return the <code>AmazonProductImageAck</code>
     * @throws RepositoryException if an error occurs
     */
    public AmazonProductImageAck getAmazonProductImageAck() throws RepositoryException {
        if (this.amazonProductImageAck == null) {
            this.amazonProductImageAck = getRelatedOne(AmazonProductImageAck.class, "AmazonProductImageAck");
        }
        return this.amazonProductImageAck;
    }

    /**
     * Auto generated value setter.
     * @param amazonProductImage the amazonProductImage to set
    */
    public void setAmazonProductImage(AmazonProductImage amazonProductImage) {
        this.amazonProductImage = amazonProductImage;
    }
    /**
     * Auto generated value setter.
     * @param amazonProductImageAck the amazonProductImageAck to set
    */
    public void setAmazonProductImageAck(AmazonProductImageAck amazonProductImageAck) {
        this.amazonProductImageAck = amazonProductImageAck;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setStatusId((String) mapValue.get("statusId"));
        setProcessingDocumentId((Long) mapValue.get("processingDocumentId"));
        setPostTimestamp((Timestamp) mapValue.get("postTimestamp"));
        setPostErrorMessage((String) mapValue.get("postErrorMessage"));
        setPostFailures((Long) mapValue.get("postFailures"));
        setProductContentTypeId((String) mapValue.get("productContentTypeId"));
        setAcknowledgeMessageId((String) mapValue.get("acknowledgeMessageId"));
        setAckStatusId((String) mapValue.get("ackStatusId"));
        setAcknowledgeTimestamp((Timestamp) mapValue.get("acknowledgeTimestamp"));
        setAcknowledgeErrorMessage((String) mapValue.get("acknowledgeErrorMessage"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("processingDocumentId", getProcessingDocumentId());
        mapValue.put("postTimestamp", getPostTimestamp());
        mapValue.put("postErrorMessage", getPostErrorMessage());
        mapValue.put("postFailures", getPostFailures());
        mapValue.put("productContentTypeId", getProductContentTypeId());
        mapValue.put("acknowledgeMessageId", getAcknowledgeMessageId());
        mapValue.put("ackStatusId", getAckStatusId());
        mapValue.put("acknowledgeTimestamp", getAcknowledgeTimestamp());
        mapValue.put("acknowledgeErrorMessage", getAcknowledgeErrorMessage());
        return mapValue;
    }


}