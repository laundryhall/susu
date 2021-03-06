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
 * Auto generated base entity ProductConfigItem.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CONFIG_ITEM")
public class ProductConfigItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("configItemId", "CONFIG_ITEM_ID");
        fields.put("configItemTypeId", "CONFIG_ITEM_TYPE_ID");
        fields.put("configItemName", "CONFIG_ITEM_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("longDescription", "LONG_DESCRIPTION");
        fields.put("imageUrl", "IMAGE_URL");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductConfigItem", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductConfigItem> {
    configItemId("configItemId"),
    configItemTypeId("configItemTypeId"),
    configItemName("configItemName"),
    description("description"),
    longDescription("longDescription"),
    imageUrl("imageUrl"),
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

   @org.hibernate.annotations.GenericGenerator(name="ProductConfigItem_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProductConfigItem_GEN")
   @Id
   @Column(name="CONFIG_ITEM_ID")
   private String configItemId;
   @Column(name="CONFIG_ITEM_TYPE_ID")
   private String configItemTypeId;
   @Column(name="CONFIG_ITEM_NAME")
   private String configItemName;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LONG_DESCRIPTION")
   private String longDescription;
   @Column(name="IMAGE_URL")
   private String imageUrl;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productConfigItem", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONFIG_ITEM_ID")
   
   private List<ProdConfItemContent> prodConfItemContents = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="configItemProductConfigItem", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONFIG_ITEM_ID")
   
   private List<ProductConfig> configItemProductConfigs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="configItemProductConfigItem", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONFIG_ITEM_ID")
   
   private List<ProductConfigConfig> configItemProductConfigConfigs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="configItemProductConfigItem", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONFIG_ITEM_ID")
   
   private List<ProductConfigOption> configItemProductConfigOptions = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="configItemProductConfigItem", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONFIG_ITEM_ID")
   
   private List<ProductConfigOptionIactn> configItemProductConfigOptionIactns = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="configItemToProductConfigItem", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONFIG_ITEM_ID_TO")
   
   private List<ProductConfigOptionIactn> configItemToProductConfigOptionIactns = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="configItemProductConfigItem", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONFIG_ITEM_ID")
   
   private List<ProductConfigProduct> configItemProductConfigProducts = null;

  /**
   * Default constructor.
   */
  public ProductConfigItem() {
      super();
      this.baseEntityName = "ProductConfigItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("configItemId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("configItemId");this.allFieldsNames.add("configItemTypeId");this.allFieldsNames.add("configItemName");this.allFieldsNames.add("description");this.allFieldsNames.add("longDescription");this.allFieldsNames.add("imageUrl");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductConfigItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param configItemId the configItemId to set
     */
    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId;
    }
    /**
     * Auto generated value setter.
     * @param configItemTypeId the configItemTypeId to set
     */
    public void setConfigItemTypeId(String configItemTypeId) {
        this.configItemTypeId = configItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param configItemName the configItemName to set
     */
    public void setConfigItemName(String configItemName) {
        this.configItemName = configItemName;
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
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
    public String getConfigItemId() {
        return this.configItemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigItemTypeId() {
        return this.configItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigItemName() {
        return this.configItemName;
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
    public String getImageUrl() {
        return this.imageUrl;
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
     * Auto generated method that gets the related <code>ProdConfItemContent</code> by the relation named <code>ProdConfItemContent</code>.
     * @return the list of <code>ProdConfItemContent</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProdConfItemContent> getProdConfItemContents() throws RepositoryException {
        if (this.prodConfItemContents == null) {
            this.prodConfItemContents = getRelated(ProdConfItemContent.class, "ProdConfItemContent");
        }
        return this.prodConfItemContents;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfig</code> by the relation named <code>ConfigItemProductConfig</code>.
     * @return the list of <code>ProductConfig</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfig> getConfigItemProductConfigs() throws RepositoryException {
        if (this.configItemProductConfigs == null) {
            this.configItemProductConfigs = getRelated(ProductConfig.class, "ConfigItemProductConfig");
        }
        return this.configItemProductConfigs;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigConfig</code> by the relation named <code>ConfigItemProductConfigConfig</code>.
     * @return the list of <code>ProductConfigConfig</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigConfig> getConfigItemProductConfigConfigs() throws RepositoryException {
        if (this.configItemProductConfigConfigs == null) {
            this.configItemProductConfigConfigs = getRelated(ProductConfigConfig.class, "ConfigItemProductConfigConfig");
        }
        return this.configItemProductConfigConfigs;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigOption</code> by the relation named <code>ConfigItemProductConfigOption</code>.
     * @return the list of <code>ProductConfigOption</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigOption> getConfigItemProductConfigOptions() throws RepositoryException {
        if (this.configItemProductConfigOptions == null) {
            this.configItemProductConfigOptions = getRelated(ProductConfigOption.class, "ConfigItemProductConfigOption");
        }
        return this.configItemProductConfigOptions;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigOptionIactn</code> by the relation named <code>ConfigItemProductConfigOptionIactn</code>.
     * @return the list of <code>ProductConfigOptionIactn</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigOptionIactn> getConfigItemProductConfigOptionIactns() throws RepositoryException {
        if (this.configItemProductConfigOptionIactns == null) {
            this.configItemProductConfigOptionIactns = getRelated(ProductConfigOptionIactn.class, "ConfigItemProductConfigOptionIactn");
        }
        return this.configItemProductConfigOptionIactns;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigOptionIactn</code> by the relation named <code>ConfigItemToProductConfigOptionIactn</code>.
     * @return the list of <code>ProductConfigOptionIactn</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigOptionIactn> getConfigItemToProductConfigOptionIactns() throws RepositoryException {
        if (this.configItemToProductConfigOptionIactns == null) {
            this.configItemToProductConfigOptionIactns = getRelated(ProductConfigOptionIactn.class, "ConfigItemToProductConfigOptionIactn");
        }
        return this.configItemToProductConfigOptionIactns;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigProduct</code> by the relation named <code>ConfigItemProductConfigProduct</code>.
     * @return the list of <code>ProductConfigProduct</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductConfigProduct> getConfigItemProductConfigProducts() throws RepositoryException {
        if (this.configItemProductConfigProducts == null) {
            this.configItemProductConfigProducts = getRelated(ProductConfigProduct.class, "ConfigItemProductConfigProduct");
        }
        return this.configItemProductConfigProducts;
    }

    /**
     * Auto generated value setter.
     * @param prodConfItemContents the prodConfItemContents to set
    */
    public void setProdConfItemContents(List<ProdConfItemContent> prodConfItemContents) {
        this.prodConfItemContents = prodConfItemContents;
    }
    /**
     * Auto generated value setter.
     * @param configItemProductConfigs the configItemProductConfigs to set
    */
    public void setConfigItemProductConfigs(List<ProductConfig> configItemProductConfigs) {
        this.configItemProductConfigs = configItemProductConfigs;
    }
    /**
     * Auto generated value setter.
     * @param configItemProductConfigConfigs the configItemProductConfigConfigs to set
    */
    public void setConfigItemProductConfigConfigs(List<ProductConfigConfig> configItemProductConfigConfigs) {
        this.configItemProductConfigConfigs = configItemProductConfigConfigs;
    }
    /**
     * Auto generated value setter.
     * @param configItemProductConfigOptions the configItemProductConfigOptions to set
    */
    public void setConfigItemProductConfigOptions(List<ProductConfigOption> configItemProductConfigOptions) {
        this.configItemProductConfigOptions = configItemProductConfigOptions;
    }
    /**
     * Auto generated value setter.
     * @param configItemProductConfigOptionIactns the configItemProductConfigOptionIactns to set
    */
    public void setConfigItemProductConfigOptionIactns(List<ProductConfigOptionIactn> configItemProductConfigOptionIactns) {
        this.configItemProductConfigOptionIactns = configItemProductConfigOptionIactns;
    }
    /**
     * Auto generated value setter.
     * @param configItemToProductConfigOptionIactns the configItemToProductConfigOptionIactns to set
    */
    public void setConfigItemToProductConfigOptionIactns(List<ProductConfigOptionIactn> configItemToProductConfigOptionIactns) {
        this.configItemToProductConfigOptionIactns = configItemToProductConfigOptionIactns;
    }
    /**
     * Auto generated value setter.
     * @param configItemProductConfigProducts the configItemProductConfigProducts to set
    */
    public void setConfigItemProductConfigProducts(List<ProductConfigProduct> configItemProductConfigProducts) {
        this.configItemProductConfigProducts = configItemProductConfigProducts;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addProdConfItemContent(ProdConfItemContent prodConfItemContent) {
        if (this.prodConfItemContents == null) {
            this.prodConfItemContents = new ArrayList<ProdConfItemContent>();
        }
        this.prodConfItemContents.add(prodConfItemContent);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProdConfItemContent(ProdConfItemContent prodConfItemContent) {
        if (this.prodConfItemContents == null) {
            return;
        }
        this.prodConfItemContents.remove(prodConfItemContent);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProdConfItemContent() {
        if (this.prodConfItemContents == null) {
            return;
        }
        this.prodConfItemContents.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addConfigItemProductConfig(ProductConfig configItemProductConfig) {
        if (this.configItemProductConfigs == null) {
            this.configItemProductConfigs = new ArrayList<ProductConfig>();
        }
        this.configItemProductConfigs.add(configItemProductConfig);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeConfigItemProductConfig(ProductConfig configItemProductConfig) {
        if (this.configItemProductConfigs == null) {
            return;
        }
        this.configItemProductConfigs.remove(configItemProductConfig);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearConfigItemProductConfig() {
        if (this.configItemProductConfigs == null) {
            return;
        }
        this.configItemProductConfigs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addConfigItemProductConfigConfig(ProductConfigConfig configItemProductConfigConfig) {
        if (this.configItemProductConfigConfigs == null) {
            this.configItemProductConfigConfigs = new ArrayList<ProductConfigConfig>();
        }
        this.configItemProductConfigConfigs.add(configItemProductConfigConfig);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeConfigItemProductConfigConfig(ProductConfigConfig configItemProductConfigConfig) {
        if (this.configItemProductConfigConfigs == null) {
            return;
        }
        this.configItemProductConfigConfigs.remove(configItemProductConfigConfig);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearConfigItemProductConfigConfig() {
        if (this.configItemProductConfigConfigs == null) {
            return;
        }
        this.configItemProductConfigConfigs.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addConfigItemProductConfigOption(ProductConfigOption configItemProductConfigOption) {
        if (this.configItemProductConfigOptions == null) {
            this.configItemProductConfigOptions = new ArrayList<ProductConfigOption>();
        }
        this.configItemProductConfigOptions.add(configItemProductConfigOption);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeConfigItemProductConfigOption(ProductConfigOption configItemProductConfigOption) {
        if (this.configItemProductConfigOptions == null) {
            return;
        }
        this.configItemProductConfigOptions.remove(configItemProductConfigOption);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearConfigItemProductConfigOption() {
        if (this.configItemProductConfigOptions == null) {
            return;
        }
        this.configItemProductConfigOptions.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addConfigItemProductConfigOptionIactn(ProductConfigOptionIactn configItemProductConfigOptionIactn) {
        if (this.configItemProductConfigOptionIactns == null) {
            this.configItemProductConfigOptionIactns = new ArrayList<ProductConfigOptionIactn>();
        }
        this.configItemProductConfigOptionIactns.add(configItemProductConfigOptionIactn);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeConfigItemProductConfigOptionIactn(ProductConfigOptionIactn configItemProductConfigOptionIactn) {
        if (this.configItemProductConfigOptionIactns == null) {
            return;
        }
        this.configItemProductConfigOptionIactns.remove(configItemProductConfigOptionIactn);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearConfigItemProductConfigOptionIactn() {
        if (this.configItemProductConfigOptionIactns == null) {
            return;
        }
        this.configItemProductConfigOptionIactns.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addConfigItemToProductConfigOptionIactn(ProductConfigOptionIactn configItemToProductConfigOptionIactn) {
        if (this.configItemToProductConfigOptionIactns == null) {
            this.configItemToProductConfigOptionIactns = new ArrayList<ProductConfigOptionIactn>();
        }
        this.configItemToProductConfigOptionIactns.add(configItemToProductConfigOptionIactn);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeConfigItemToProductConfigOptionIactn(ProductConfigOptionIactn configItemToProductConfigOptionIactn) {
        if (this.configItemToProductConfigOptionIactns == null) {
            return;
        }
        this.configItemToProductConfigOptionIactns.remove(configItemToProductConfigOptionIactn);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearConfigItemToProductConfigOptionIactn() {
        if (this.configItemToProductConfigOptionIactns == null) {
            return;
        }
        this.configItemToProductConfigOptionIactns.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addConfigItemProductConfigProduct(ProductConfigProduct configItemProductConfigProduct) {
        if (this.configItemProductConfigProducts == null) {
            this.configItemProductConfigProducts = new ArrayList<ProductConfigProduct>();
        }
        this.configItemProductConfigProducts.add(configItemProductConfigProduct);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeConfigItemProductConfigProduct(ProductConfigProduct configItemProductConfigProduct) {
        if (this.configItemProductConfigProducts == null) {
            return;
        }
        this.configItemProductConfigProducts.remove(configItemProductConfigProduct);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearConfigItemProductConfigProduct() {
        if (this.configItemProductConfigProducts == null) {
            return;
        }
        this.configItemProductConfigProducts.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setConfigItemId((String) mapValue.get("configItemId"));
        setConfigItemTypeId((String) mapValue.get("configItemTypeId"));
        setConfigItemName((String) mapValue.get("configItemName"));
        setDescription((String) mapValue.get("description"));
        setLongDescription((String) mapValue.get("longDescription"));
        setImageUrl((String) mapValue.get("imageUrl"));
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
        mapValue.put("configItemId", getConfigItemId());
        mapValue.put("configItemTypeId", getConfigItemTypeId());
        mapValue.put("configItemName", getConfigItemName());
        mapValue.put("description", getDescription());
        mapValue.put("longDescription", getLongDescription());
        mapValue.put("imageUrl", getImageUrl());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
