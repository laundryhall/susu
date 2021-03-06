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
 * Auto generated base entity Document.
 */
@javax.persistence.Entity
@Table(name="DOCUMENT")
public class Document extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("documentId", "DOCUMENT_ID");
        fields.put("documentTypeId", "DOCUMENT_TYPE_ID");
        fields.put("dateCreated", "DATE_CREATED");
        fields.put("comments", "COMMENTS");
        fields.put("documentLocation", "DOCUMENT_LOCATION");
        fields.put("documentText", "DOCUMENT_TEXT");
        fields.put("imageData", "IMAGE_DATA");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("Document", fields);
}
  public static enum Fields implements EntityFieldInterface<Document> {
    documentId("documentId"),
    documentTypeId("documentTypeId"),
    dateCreated("dateCreated"),
    comments("comments"),
    documentLocation("documentLocation"),
    documentText("documentText"),
    imageData("imageData"),
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

   @org.hibernate.annotations.GenericGenerator(name="Document_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="Document_GEN")
   @Id
   @Column(name="DOCUMENT_ID")
   private String documentId;
   @Column(name="DOCUMENT_TYPE_ID")
   private String documentTypeId;
   @Column(name="DATE_CREATED")
   private Timestamp dateCreated;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="DOCUMENT_LOCATION")
   private String documentLocation;
   @Column(name="DOCUMENT_TEXT")
   private String documentText;
   @Column(name="IMAGE_DATA")
   private byte[] imageData;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="DOCUMENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DocumentType documentType = null;
   private transient List<DocumentTypeAttr> documentTypeAttrs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="document", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="DOCUMENT_ID")
   
   private List<ShippingDocument> shippingDocuments = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="document", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="DOCUMENT_ID")
   
   private List<DocumentAttribute> documentAttributes = null;

  /**
   * Default constructor.
   */
  public Document() {
      super();
      this.baseEntityName = "Document";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("documentId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("documentId");this.allFieldsNames.add("documentTypeId");this.allFieldsNames.add("dateCreated");this.allFieldsNames.add("comments");this.allFieldsNames.add("documentLocation");this.allFieldsNames.add("documentText");this.allFieldsNames.add("imageData");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public Document(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param documentId the documentId to set
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
    /**
     * Auto generated value setter.
     * @param documentTypeId the documentTypeId to set
     */
    public void setDocumentTypeId(String documentTypeId) {
        this.documentTypeId = documentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
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
     * @param documentLocation the documentLocation to set
     */
    public void setDocumentLocation(String documentLocation) {
        this.documentLocation = documentLocation;
    }
    /**
     * Auto generated value setter.
     * @param documentText the documentText to set
     */
    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }
    /**
     * Auto generated value setter.
     * @param imageData the imageData to set
     */
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
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
    public String getDocumentId() {
        return this.documentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDocumentTypeId() {
        return this.documentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getDateCreated() {
        return this.dateCreated;
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
     * @return <code>String</code>
     */
    public String getDocumentLocation() {
        return this.documentLocation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDocumentText() {
        return this.documentText;
    }
    /**
     * Auto generated value accessor.
     * @return <code>byte[]</code>
     */
    public byte[] getImageData() {
        return this.imageData;
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
     * Auto generated method that gets the related <code>DocumentType</code> by the relation named <code>DocumentType</code>.
     * @return the <code>DocumentType</code>
     * @throws RepositoryException if an error occurs
     */
    public DocumentType getDocumentType() throws RepositoryException {
        if (this.documentType == null) {
            this.documentType = getRelatedOne(DocumentType.class, "DocumentType");
        }
        return this.documentType;
    }
    /**
     * Auto generated method that gets the related <code>DocumentTypeAttr</code> by the relation named <code>DocumentTypeAttr</code>.
     * @return the list of <code>DocumentTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends DocumentTypeAttr> getDocumentTypeAttrs() throws RepositoryException {
        if (this.documentTypeAttrs == null) {
            this.documentTypeAttrs = getRelated(DocumentTypeAttr.class, "DocumentTypeAttr");
        }
        return this.documentTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>ShippingDocument</code> by the relation named <code>ShippingDocument</code>.
     * @return the list of <code>ShippingDocument</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ShippingDocument> getShippingDocuments() throws RepositoryException {
        if (this.shippingDocuments == null) {
            this.shippingDocuments = getRelated(ShippingDocument.class, "ShippingDocument");
        }
        return this.shippingDocuments;
    }
    /**
     * Auto generated method that gets the related <code>DocumentAttribute</code> by the relation named <code>DocumentAttribute</code>.
     * @return the list of <code>DocumentAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends DocumentAttribute> getDocumentAttributes() throws RepositoryException {
        if (this.documentAttributes == null) {
            this.documentAttributes = getRelated(DocumentAttribute.class, "DocumentAttribute");
        }
        return this.documentAttributes;
    }

    /**
     * Auto generated value setter.
     * @param documentType the documentType to set
    */
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }
    /**
     * Auto generated value setter.
     * @param documentTypeAttrs the documentTypeAttrs to set
    */
    public void setDocumentTypeAttrs(List<DocumentTypeAttr> documentTypeAttrs) {
        this.documentTypeAttrs = documentTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param shippingDocuments the shippingDocuments to set
    */
    public void setShippingDocuments(List<ShippingDocument> shippingDocuments) {
        this.shippingDocuments = shippingDocuments;
    }
    /**
     * Auto generated value setter.
     * @param documentAttributes the documentAttributes to set
    */
    public void setDocumentAttributes(List<DocumentAttribute> documentAttributes) {
        this.documentAttributes = documentAttributes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addShippingDocument(ShippingDocument shippingDocument) {
        if (this.shippingDocuments == null) {
            this.shippingDocuments = new ArrayList<ShippingDocument>();
        }
        this.shippingDocuments.add(shippingDocument);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeShippingDocument(ShippingDocument shippingDocument) {
        if (this.shippingDocuments == null) {
            return;
        }
        this.shippingDocuments.remove(shippingDocument);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearShippingDocument() {
        if (this.shippingDocuments == null) {
            return;
        }
        this.shippingDocuments.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addDocumentAttribute(DocumentAttribute documentAttribute) {
        if (this.documentAttributes == null) {
            this.documentAttributes = new ArrayList<DocumentAttribute>();
        }
        this.documentAttributes.add(documentAttribute);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeDocumentAttribute(DocumentAttribute documentAttribute) {
        if (this.documentAttributes == null) {
            return;
        }
        this.documentAttributes.remove(documentAttribute);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearDocumentAttribute() {
        if (this.documentAttributes == null) {
            return;
        }
        this.documentAttributes.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setDocumentId((String) mapValue.get("documentId"));
        setDocumentTypeId((String) mapValue.get("documentTypeId"));
        setDateCreated((Timestamp) mapValue.get("dateCreated"));
        setComments((String) mapValue.get("comments"));
        setDocumentLocation((String) mapValue.get("documentLocation"));
        setDocumentText((String) mapValue.get("documentText"));
        setImageData((byte[]) mapValue.get("imageData"));
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
        mapValue.put("documentId", getDocumentId());
        mapValue.put("documentTypeId", getDocumentTypeId());
        mapValue.put("dateCreated", getDateCreated());
        mapValue.put("comments", getComments());
        mapValue.put("documentLocation", getDocumentLocation());
        mapValue.put("documentText", getDocumentText());
        mapValue.put("imageData", getImageData());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
