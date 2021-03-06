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
 * Auto generated base entity AgreementType.
 */
@javax.persistence.Entity
@Table(name="AGREEMENT_TYPE")
public class AgreementType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("agreementTypeId", "AGREEMENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AgreementType", fields);
}
  public static enum Fields implements EntityFieldInterface<AgreementType> {
    agreementTypeId("agreementTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="AgreementType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="AgreementType_GEN")
   @Id
   @Column(name="AGREEMENT_TYPE_ID")
   private String agreementTypeId;
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
   
   private AgreementType parentAgreementType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="agreementType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="AGREEMENT_TYPE_ID")
   
   private List<Agreement> agreements = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="agreementType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="AGREEMENT_TYPE_ID")
   
   private List<AgreementDocumentTypeMap> agreementDocumentTypeMaps = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="agreementType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="AGREEMENT_TYPE_ID")
   
   private List<AgreementInvoiceItemType> agreementInvoiceItemTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="agreementType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="AGREEMENT_TYPE_ID")
   
   private List<AgreementToItemMap> agreementToItemMaps = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentAgreementType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<AgreementType> childAgreementTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="agreementType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="AGREEMENT_TYPE_ID")
   
   private List<AgreementTypeAttr> agreementTypeAttrs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="agreementType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="AGREEMENT_TYPE_ID")
   
   private List<AgreementTypeForRoleType> agreementTypeForRoleTypes = null;

  /**
   * Default constructor.
   */
  public AgreementType() {
      super();
      this.baseEntityName = "AgreementType";
      this.isView = false;
      this.resourceName = "PartyEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("agreementTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("agreementTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AgreementType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param agreementTypeId the agreementTypeId to set
     */
    public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
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
    public String getAgreementTypeId() {
        return this.agreementTypeId;
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
     * Auto generated method that gets the related <code>AgreementType</code> by the relation named <code>ParentAgreementType</code>.
     * @return the <code>AgreementType</code>
     * @throws RepositoryException if an error occurs
     */
    public AgreementType getParentAgreementType() throws RepositoryException {
        if (this.parentAgreementType == null) {
            this.parentAgreementType = getRelatedOne(AgreementType.class, "ParentAgreementType");
        }
        return this.parentAgreementType;
    }
    /**
     * Auto generated method that gets the related <code>Agreement</code> by the relation named <code>Agreement</code>.
     * @return the list of <code>Agreement</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Agreement> getAgreements() throws RepositoryException {
        if (this.agreements == null) {
            this.agreements = getRelated(Agreement.class, "Agreement");
        }
        return this.agreements;
    }
    /**
     * Auto generated method that gets the related <code>AgreementDocumentTypeMap</code> by the relation named <code>AgreementDocumentTypeMap</code>.
     * @return the list of <code>AgreementDocumentTypeMap</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementDocumentTypeMap> getAgreementDocumentTypeMaps() throws RepositoryException {
        if (this.agreementDocumentTypeMaps == null) {
            this.agreementDocumentTypeMaps = getRelated(AgreementDocumentTypeMap.class, "AgreementDocumentTypeMap");
        }
        return this.agreementDocumentTypeMaps;
    }
    /**
     * Auto generated method that gets the related <code>AgreementInvoiceItemType</code> by the relation named <code>AgreementInvoiceItemType</code>.
     * @return the list of <code>AgreementInvoiceItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementInvoiceItemType> getAgreementInvoiceItemTypes() throws RepositoryException {
        if (this.agreementInvoiceItemTypes == null) {
            this.agreementInvoiceItemTypes = getRelated(AgreementInvoiceItemType.class, "AgreementInvoiceItemType");
        }
        return this.agreementInvoiceItemTypes;
    }
    /**
     * Auto generated method that gets the related <code>AgreementToItemMap</code> by the relation named <code>AgreementToItemMap</code>.
     * @return the list of <code>AgreementToItemMap</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementToItemMap> getAgreementToItemMaps() throws RepositoryException {
        if (this.agreementToItemMaps == null) {
            this.agreementToItemMaps = getRelated(AgreementToItemMap.class, "AgreementToItemMap");
        }
        return this.agreementToItemMaps;
    }
    /**
     * Auto generated method that gets the related <code>AgreementType</code> by the relation named <code>ChildAgreementType</code>.
     * @return the list of <code>AgreementType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementType> getChildAgreementTypes() throws RepositoryException {
        if (this.childAgreementTypes == null) {
            this.childAgreementTypes = getRelated(AgreementType.class, "ChildAgreementType");
        }
        return this.childAgreementTypes;
    }
    /**
     * Auto generated method that gets the related <code>AgreementTypeAttr</code> by the relation named <code>AgreementTypeAttr</code>.
     * @return the list of <code>AgreementTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementTypeAttr> getAgreementTypeAttrs() throws RepositoryException {
        if (this.agreementTypeAttrs == null) {
            this.agreementTypeAttrs = getRelated(AgreementTypeAttr.class, "AgreementTypeAttr");
        }
        return this.agreementTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>AgreementTypeForRoleType</code> by the relation named <code>AgreementTypeForRoleType</code>.
     * @return the list of <code>AgreementTypeForRoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AgreementTypeForRoleType> getAgreementTypeForRoleTypes() throws RepositoryException {
        if (this.agreementTypeForRoleTypes == null) {
            this.agreementTypeForRoleTypes = getRelated(AgreementTypeForRoleType.class, "AgreementTypeForRoleType");
        }
        return this.agreementTypeForRoleTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentAgreementType the parentAgreementType to set
    */
    public void setParentAgreementType(AgreementType parentAgreementType) {
        this.parentAgreementType = parentAgreementType;
    }
    /**
     * Auto generated value setter.
     * @param agreements the agreements to set
    */
    public void setAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
    }
    /**
     * Auto generated value setter.
     * @param agreementDocumentTypeMaps the agreementDocumentTypeMaps to set
    */
    public void setAgreementDocumentTypeMaps(List<AgreementDocumentTypeMap> agreementDocumentTypeMaps) {
        this.agreementDocumentTypeMaps = agreementDocumentTypeMaps;
    }
    /**
     * Auto generated value setter.
     * @param agreementInvoiceItemTypes the agreementInvoiceItemTypes to set
    */
    public void setAgreementInvoiceItemTypes(List<AgreementInvoiceItemType> agreementInvoiceItemTypes) {
        this.agreementInvoiceItemTypes = agreementInvoiceItemTypes;
    }
    /**
     * Auto generated value setter.
     * @param agreementToItemMaps the agreementToItemMaps to set
    */
    public void setAgreementToItemMaps(List<AgreementToItemMap> agreementToItemMaps) {
        this.agreementToItemMaps = agreementToItemMaps;
    }
    /**
     * Auto generated value setter.
     * @param childAgreementTypes the childAgreementTypes to set
    */
    public void setChildAgreementTypes(List<AgreementType> childAgreementTypes) {
        this.childAgreementTypes = childAgreementTypes;
    }
    /**
     * Auto generated value setter.
     * @param agreementTypeAttrs the agreementTypeAttrs to set
    */
    public void setAgreementTypeAttrs(List<AgreementTypeAttr> agreementTypeAttrs) {
        this.agreementTypeAttrs = agreementTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param agreementTypeForRoleTypes the agreementTypeForRoleTypes to set
    */
    public void setAgreementTypeForRoleTypes(List<AgreementTypeForRoleType> agreementTypeForRoleTypes) {
        this.agreementTypeForRoleTypes = agreementTypeForRoleTypes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addAgreementInvoiceItemType(AgreementInvoiceItemType agreementInvoiceItemType) {
        if (this.agreementInvoiceItemTypes == null) {
            this.agreementInvoiceItemTypes = new ArrayList<AgreementInvoiceItemType>();
        }
        this.agreementInvoiceItemTypes.add(agreementInvoiceItemType);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeAgreementInvoiceItemType(AgreementInvoiceItemType agreementInvoiceItemType) {
        if (this.agreementInvoiceItemTypes == null) {
            return;
        }
        this.agreementInvoiceItemTypes.remove(agreementInvoiceItemType);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearAgreementInvoiceItemType() {
        if (this.agreementInvoiceItemTypes == null) {
            return;
        }
        this.agreementInvoiceItemTypes.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addAgreementToItemMap(AgreementToItemMap agreementToItemMap) {
        if (this.agreementToItemMaps == null) {
            this.agreementToItemMaps = new ArrayList<AgreementToItemMap>();
        }
        this.agreementToItemMaps.add(agreementToItemMap);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeAgreementToItemMap(AgreementToItemMap agreementToItemMap) {
        if (this.agreementToItemMaps == null) {
            return;
        }
        this.agreementToItemMaps.remove(agreementToItemMap);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearAgreementToItemMap() {
        if (this.agreementToItemMaps == null) {
            return;
        }
        this.agreementToItemMaps.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addAgreementTypeAttr(AgreementTypeAttr agreementTypeAttr) {
        if (this.agreementTypeAttrs == null) {
            this.agreementTypeAttrs = new ArrayList<AgreementTypeAttr>();
        }
        this.agreementTypeAttrs.add(agreementTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeAgreementTypeAttr(AgreementTypeAttr agreementTypeAttr) {
        if (this.agreementTypeAttrs == null) {
            return;
        }
        this.agreementTypeAttrs.remove(agreementTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearAgreementTypeAttr() {
        if (this.agreementTypeAttrs == null) {
            return;
        }
        this.agreementTypeAttrs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addAgreementTypeForRoleType(AgreementTypeForRoleType agreementTypeForRoleType) {
        if (this.agreementTypeForRoleTypes == null) {
            this.agreementTypeForRoleTypes = new ArrayList<AgreementTypeForRoleType>();
        }
        this.agreementTypeForRoleTypes.add(agreementTypeForRoleType);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeAgreementTypeForRoleType(AgreementTypeForRoleType agreementTypeForRoleType) {
        if (this.agreementTypeForRoleTypes == null) {
            return;
        }
        this.agreementTypeForRoleTypes.remove(agreementTypeForRoleType);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearAgreementTypeForRoleType() {
        if (this.agreementTypeForRoleTypes == null) {
            return;
        }
        this.agreementTypeForRoleTypes.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAgreementTypeId((String) mapValue.get("agreementTypeId"));
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
        mapValue.put("agreementTypeId", getAgreementTypeId());
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
