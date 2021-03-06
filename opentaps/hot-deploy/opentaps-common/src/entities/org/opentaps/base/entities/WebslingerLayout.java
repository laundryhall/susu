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
 * Auto generated base entity WebslingerLayout.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWebslingerLayouts", query="SELECT WS.WEBSLINGER_SERVER_ID AS \"webslingerServerId\",WS.DELEGATOR_NAME AS \"delegatorName\",WS.DISPATCHER_NAME AS \"dispatcherName\",WS.SERVER_NAME AS \"serverName\",WS.WEB_SITE_ID AS \"webSiteId\",WS.TARGET AS \"target\",WS.LOAD_AT_START AS \"loadAtStart\",WHM.HOST_NAME AS \"hostName\",WHM.CONTEXT_PATH AS \"contextPath\" FROM WEBSLINGER_SERVER WS INNER JOIN WEBSLINGER_HOST_MAPPING WHM ON WS.WEBSLINGER_SERVER_ID = WHM.WEBSLINGER_SERVER_ID", resultSetMapping="WebslingerLayoutMapping")
@SqlResultSetMapping(name="WebslingerLayoutMapping", entities={
@EntityResult(entityClass=WebslingerLayout.class, fields = {
@FieldResult(name="webslingerServerId", column="webslingerServerId")
,@FieldResult(name="delegatorName", column="delegatorName")
,@FieldResult(name="dispatcherName", column="dispatcherName")
,@FieldResult(name="serverName", column="serverName")
,@FieldResult(name="webSiteId", column="webSiteId")
,@FieldResult(name="target", column="target")
,@FieldResult(name="loadAtStart", column="loadAtStart")
,@FieldResult(name="hostName", column="hostName")
,@FieldResult(name="contextPath", column="contextPath")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WebslingerLayout extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("webslingerServerId", "WS.WEBSLINGER_SERVER_ID");
        fields.put("delegatorName", "WS.DELEGATOR_NAME");
        fields.put("dispatcherName", "WS.DISPATCHER_NAME");
        fields.put("serverName", "WS.SERVER_NAME");
        fields.put("webSiteId", "WS.WEB_SITE_ID");
        fields.put("target", "WS.TARGET");
        fields.put("loadAtStart", "WS.LOAD_AT_START");
        fields.put("hostName", "WHM.HOST_NAME");
        fields.put("contextPath", "WHM.CONTEXT_PATH");
fieldMapColumns.put("WebslingerLayout", fields);
}
  public static enum Fields implements EntityFieldInterface<WebslingerLayout> {
    webslingerServerId("webslingerServerId"),
    delegatorName("delegatorName"),
    dispatcherName("dispatcherName"),
    serverName("serverName"),
    webSiteId("webSiteId"),
    target("target"),
    loadAtStart("loadAtStart"),
    hostName("hostName"),
    contextPath("contextPath");
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
   private String webslingerServerId;
    
   private String delegatorName;
    
   private String dispatcherName;
    
   private String serverName;
    
   private String webSiteId;
    
   private String target;
    
   private String loadAtStart;
    
   private String hostName;
    
   private String contextPath;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WEBSLINGER_SERVER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WebslingerServer webslingerServer = null;
   private transient List<WebslingerServerBase> webslingerServerBases = null;
   private transient WebslingerHostMapping webslingerHostMapping = null;

  /**
   * Default constructor.
   */
  public WebslingerLayout() {
      super();
      this.baseEntityName = "WebslingerLayout";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("webslingerServerId");this.primaryKeyNames.add("hostName");this.primaryKeyNames.add("contextPath");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("webslingerServerId");this.allFieldsNames.add("delegatorName");this.allFieldsNames.add("dispatcherName");this.allFieldsNames.add("serverName");this.allFieldsNames.add("webSiteId");this.allFieldsNames.add("target");this.allFieldsNames.add("loadAtStart");this.allFieldsNames.add("hostName");this.allFieldsNames.add("contextPath");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WebslingerLayout(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param webslingerServerId the webslingerServerId to set
     */
    public void setWebslingerServerId(String webslingerServerId) {
        this.webslingerServerId = webslingerServerId;
    }
    /**
     * Auto generated value setter.
     * @param delegatorName the delegatorName to set
     */
    public void setDelegatorName(String delegatorName) {
        this.delegatorName = delegatorName;
    }
    /**
     * Auto generated value setter.
     * @param dispatcherName the dispatcherName to set
     */
    public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }
    /**
     * Auto generated value setter.
     * @param serverName the serverName to set
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
    /**
     * Auto generated value setter.
     * @param webSiteId the webSiteId to set
     */
    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
    /**
     * Auto generated value setter.
     * @param target the target to set
     */
    public void setTarget(String target) {
        this.target = target;
    }
    /**
     * Auto generated value setter.
     * @param loadAtStart the loadAtStart to set
     */
    public void setLoadAtStart(String loadAtStart) {
        this.loadAtStart = loadAtStart;
    }
    /**
     * Auto generated value setter.
     * @param hostName the hostName to set
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    /**
     * Auto generated value setter.
     * @param contextPath the contextPath to set
     */
    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWebslingerServerId() {
        return this.webslingerServerId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDelegatorName() {
        return this.delegatorName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDispatcherName() {
        return this.dispatcherName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getServerName() {
        return this.serverName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWebSiteId() {
        return this.webSiteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTarget() {
        return this.target;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLoadAtStart() {
        return this.loadAtStart;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContextPath() {
        return this.contextPath;
    }

    /**
     * Auto generated method that gets the related <code>WebslingerServer</code> by the relation named <code>WebslingerServer</code>.
     * @return the <code>WebslingerServer</code>
     * @throws RepositoryException if an error occurs
     */
    public WebslingerServer getWebslingerServer() throws RepositoryException {
        if (this.webslingerServer == null) {
            this.webslingerServer = getRelatedOne(WebslingerServer.class, "WebslingerServer");
        }
        return this.webslingerServer;
    }
    /**
     * Auto generated method that gets the related <code>WebslingerServerBase</code> by the relation named <code>WebslingerServerBase</code>.
     * @return the list of <code>WebslingerServerBase</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WebslingerServerBase> getWebslingerServerBases() throws RepositoryException {
        if (this.webslingerServerBases == null) {
            this.webslingerServerBases = getRelated(WebslingerServerBase.class, "WebslingerServerBase");
        }
        return this.webslingerServerBases;
    }
    /**
     * Auto generated method that gets the related <code>WebslingerHostMapping</code> by the relation named <code>WebslingerHostMapping</code>.
     * @return the <code>WebslingerHostMapping</code>
     * @throws RepositoryException if an error occurs
     */
    public WebslingerHostMapping getWebslingerHostMapping() throws RepositoryException {
        if (this.webslingerHostMapping == null) {
            this.webslingerHostMapping = getRelatedOne(WebslingerHostMapping.class, "WebslingerHostMapping");
        }
        return this.webslingerHostMapping;
    }

    /**
     * Auto generated value setter.
     * @param webslingerServer the webslingerServer to set
    */
    public void setWebslingerServer(WebslingerServer webslingerServer) {
        this.webslingerServer = webslingerServer;
    }
    /**
     * Auto generated value setter.
     * @param webslingerServerBases the webslingerServerBases to set
    */
    public void setWebslingerServerBases(List<WebslingerServerBase> webslingerServerBases) {
        this.webslingerServerBases = webslingerServerBases;
    }
    /**
     * Auto generated value setter.
     * @param webslingerHostMapping the webslingerHostMapping to set
    */
    public void setWebslingerHostMapping(WebslingerHostMapping webslingerHostMapping) {
        this.webslingerHostMapping = webslingerHostMapping;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWebslingerServerId((String) mapValue.get("webslingerServerId"));
        setDelegatorName((String) mapValue.get("delegatorName"));
        setDispatcherName((String) mapValue.get("dispatcherName"));
        setServerName((String) mapValue.get("serverName"));
        setWebSiteId((String) mapValue.get("webSiteId"));
        setTarget((String) mapValue.get("target"));
        setLoadAtStart((String) mapValue.get("loadAtStart"));
        setHostName((String) mapValue.get("hostName"));
        setContextPath((String) mapValue.get("contextPath"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("webslingerServerId", getWebslingerServerId());
        mapValue.put("delegatorName", getDelegatorName());
        mapValue.put("dispatcherName", getDispatcherName());
        mapValue.put("serverName", getServerName());
        mapValue.put("webSiteId", getWebSiteId());
        mapValue.put("target", getTarget());
        mapValue.put("loadAtStart", getLoadAtStart());
        mapValue.put("hostName", getHostName());
        mapValue.put("contextPath", getContextPath());
        return mapValue;
    }


}
