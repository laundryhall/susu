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
 * Auto generated base entity WebSiteContent.
 */
@javax.persistence.Entity
@Table(name="WEB_SITE_CONTENT")
public class WebSiteContent extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("webSiteId", "WEB_SITE_ID");
        fields.put("contentId", "CONTENT_ID");
        fields.put("webSiteContentTypeId", "WEB_SITE_CONTENT_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WebSiteContent", fields);
}
  public static enum Fields implements EntityFieldInterface<WebSiteContent> {
    webSiteId("webSiteId"),
    contentId("contentId"),
    webSiteContentTypeId("webSiteContentTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.WebSiteContentPkBridge.class)
     private WebSiteContentPk id = new WebSiteContentPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WebSiteContentPk</code>
     */
      public WebSiteContentPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WebSiteContentPk</code> value to set
    */   
      public void setId(WebSiteContentPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WEB_SITE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WebSite webSite = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Content content = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WEB_SITE_CONTENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WebSiteContentType webSiteContentType = null;

  /**
   * Default constructor.
   */
  public WebSiteContent() {
      super();
      this.baseEntityName = "WebSiteContent";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("webSiteId");this.primaryKeyNames.add("contentId");this.primaryKeyNames.add("webSiteContentTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("webSiteId");this.allFieldsNames.add("contentId");this.allFieldsNames.add("webSiteContentTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WebSiteContent(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param webSiteId the webSiteId to set
     */
    public void setWebSiteId(String webSiteId) {
        id.setWebSiteId(webSiteId);
    }
    /**
     * Auto generated value setter.
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        id.setContentId(contentId);
    }
    /**
     * Auto generated value setter.
     * @param webSiteContentTypeId the webSiteContentTypeId to set
     */
    public void setWebSiteContentTypeId(String webSiteContentTypeId) {
        id.setWebSiteContentTypeId(webSiteContentTypeId);
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
    public String getWebSiteId() {
        return this.id.getWebSiteId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentId() {
        return this.id.getContentId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWebSiteContentTypeId() {
        return this.id.getWebSiteContentTypeId();
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
     * Auto generated method that gets the related <code>WebSite</code> by the relation named <code>WebSite</code>.
     * @return the <code>WebSite</code>
     * @throws RepositoryException if an error occurs
     */
    public WebSite getWebSite() throws RepositoryException {
        if (this.webSite == null) {
            this.webSite = getRelatedOne(WebSite.class, "WebSite");
        }
        return this.webSite;
    }
    /**
     * Auto generated method that gets the related <code>Content</code> by the relation named <code>Content</code>.
     * @return the <code>Content</code>
     * @throws RepositoryException if an error occurs
     */
    public Content getContent() throws RepositoryException {
        if (this.content == null) {
            this.content = getRelatedOne(Content.class, "Content");
        }
        return this.content;
    }
    /**
     * Auto generated method that gets the related <code>WebSiteContentType</code> by the relation named <code>WebSiteContentType</code>.
     * @return the <code>WebSiteContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public WebSiteContentType getWebSiteContentType() throws RepositoryException {
        if (this.webSiteContentType == null) {
            this.webSiteContentType = getRelatedOne(WebSiteContentType.class, "WebSiteContentType");
        }
        return this.webSiteContentType;
    }

    /**
     * Auto generated value setter.
     * @param webSite the webSite to set
    */
    public void setWebSite(WebSite webSite) {
        this.webSite = webSite;
    }
    /**
     * Auto generated value setter.
     * @param content the content to set
    */
    public void setContent(Content content) {
        this.content = content;
    }
    /**
     * Auto generated value setter.
     * @param webSiteContentType the webSiteContentType to set
    */
    public void setWebSiteContentType(WebSiteContentType webSiteContentType) {
        this.webSiteContentType = webSiteContentType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWebSiteId((String) mapValue.get("webSiteId"));
        setContentId((String) mapValue.get("contentId"));
        setWebSiteContentTypeId((String) mapValue.get("webSiteContentTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
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
        mapValue.put("webSiteId", getWebSiteId());
        mapValue.put("contentId", getContentId());
        mapValue.put("webSiteContentTypeId", getWebSiteContentTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}