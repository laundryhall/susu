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
 * Auto generated base entity DocumentType.
 */
@javax.persistence.Entity
@Table(name="DOCUMENT_TYPE")
public class DocumentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("documentTypeId", "DOCUMENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DocumentType", fields);
}
  public static enum Fields implements EntityFieldInterface<DocumentType> {
    documentTypeId("documentTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
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

   @org.hibernate.annotations.GenericGenerator(name="DocumentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="DocumentType_GEN")
   @Id
   @Column(name="DOCUMENT_TYPE_ID")
   private String documentTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
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
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private DocumentType parentDocumentType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="documentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="DOCUMENT_TYPE_ID")
   
   private List<Document> documents = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentDocumentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<DocumentType> childDocumentTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="documentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="DOCUMENT_TYPE_ID")
   
   private List<DocumentTypeAttr> documentTypeAttrs = null;

  /**
   * Default constructor.
   */
  public DocumentType() {
      super();
      this.baseEntityName = "DocumentType";
      this.isView = false;
      this.resourceName = "ContentEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("documentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("documentTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DocumentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
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
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
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
    public String getDocumentTypeId() {
        return this.documentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
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
     * Auto generated method that gets the related <code>DocumentType</code> by the relation named <code>ParentDocumentType</code>.
     * @return the <code>DocumentType</code>
     * @throws RepositoryException if an error occurs
     */
    public DocumentType getParentDocumentType() throws RepositoryException {
        if (this.parentDocumentType == null) {
            this.parentDocumentType = getRelatedOne(DocumentType.class, "ParentDocumentType");
        }
        return this.parentDocumentType;
    }
    /**
     * Auto generated method that gets the related <code>Document</code> by the relation named <code>Document</code>.
     * @return the list of <code>Document</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Document> getDocuments() throws RepositoryException {
        if (this.documents == null) {
            this.documents = getRelated(Document.class, "Document");
        }
        return this.documents;
    }
    /**
     * Auto generated method that gets the related <code>DocumentType</code> by the relation named <code>ChildDocumentType</code>.
     * @return the list of <code>DocumentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends DocumentType> getChildDocumentTypes() throws RepositoryException {
        if (this.childDocumentTypes == null) {
            this.childDocumentTypes = getRelated(DocumentType.class, "ChildDocumentType");
        }
        return this.childDocumentTypes;
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
     * Auto generated value setter.
     * @param parentDocumentType the parentDocumentType to set
    */
    public void setParentDocumentType(DocumentType parentDocumentType) {
        this.parentDocumentType = parentDocumentType;
    }
    /**
     * Auto generated value setter.
     * @param documents the documents to set
    */
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    /**
     * Auto generated value setter.
     * @param childDocumentTypes the childDocumentTypes to set
    */
    public void setChildDocumentTypes(List<DocumentType> childDocumentTypes) {
        this.childDocumentTypes = childDocumentTypes;
    }
    /**
     * Auto generated value setter.
     * @param documentTypeAttrs the documentTypeAttrs to set
    */
    public void setDocumentTypeAttrs(List<DocumentTypeAttr> documentTypeAttrs) {
        this.documentTypeAttrs = documentTypeAttrs;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addDocumentTypeAttr(DocumentTypeAttr documentTypeAttr) {
        if (this.documentTypeAttrs == null) {
            this.documentTypeAttrs = new ArrayList<DocumentTypeAttr>();
        }
        this.documentTypeAttrs.add(documentTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeDocumentTypeAttr(DocumentTypeAttr documentTypeAttr) {
        if (this.documentTypeAttrs == null) {
            return;
        }
        this.documentTypeAttrs.remove(documentTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearDocumentTypeAttr() {
        if (this.documentTypeAttrs == null) {
            return;
        }
        this.documentTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setDocumentTypeId((String) mapValue.get("documentTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
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
        mapValue.put("documentTypeId", getDocumentTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
