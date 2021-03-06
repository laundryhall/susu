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
 * Auto generated base entity PaymentGatewayPayflowPro.
 */
@javax.persistence.Entity
@Table(name="PAYMENT_GATEWAY_PAYFLOW_PRO")
public class PaymentGatewayPayflowPro extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentGatewayConfigId", "PAYMENT_GATEWAY_CONFIG_ID");
        fields.put("certsPath", "CERTS_PATH");
        fields.put("hostAddress", "HOST_ADDRESS");
        fields.put("hostPort", "HOST_PORT");
        fields.put("timeout", "TIMEOUT");
        fields.put("proxyAddress", "PROXY_ADDRESS");
        fields.put("proxyPort", "PROXY_PORT");
        fields.put("proxyLogon", "PROXY_LOGON");
        fields.put("proxyPassword", "PROXY_PASSWORD");
        fields.put("vendor", "VENDOR");
        fields.put("userId", "USER_ID");
        fields.put("pwd", "PWD");
        fields.put("partner", "PARTNER");
        fields.put("checkAvs", "CHECK_AVS");
        fields.put("checkCvv2", "CHECK_CVV2");
        fields.put("preAuth", "PRE_AUTH");
        fields.put("enableTransmit", "ENABLE_TRANSMIT");
        fields.put("logFileName", "LOG_FILE_NAME");
        fields.put("loggingLevel", "LOGGING_LEVEL");
        fields.put("maxLogFileSize", "MAX_LOG_FILE_SIZE");
        fields.put("stackTraceOn", "STACK_TRACE_ON");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PaymentGatewayPayflowPro", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentGatewayPayflowPro> {
    paymentGatewayConfigId("paymentGatewayConfigId"),
    certsPath("certsPath"),
    hostAddress("hostAddress"),
    hostPort("hostPort"),
    timeout("timeout"),
    proxyAddress("proxyAddress"),
    proxyPort("proxyPort"),
    proxyLogon("proxyLogon"),
    proxyPassword("proxyPassword"),
    vendor("vendor"),
    userId("userId"),
    pwd("pwd"),
    partner("partner"),
    checkAvs("checkAvs"),
    checkCvv2("checkCvv2"),
    preAuth("preAuth"),
    enableTransmit("enableTransmit"),
    logFileName("logFileName"),
    loggingLevel("loggingLevel"),
    maxLogFileSize("maxLogFileSize"),
    stackTraceOn("stackTraceOn"),
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

   @org.hibernate.annotations.GenericGenerator(name="PaymentGatewayPayflowPro_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PaymentGatewayPayflowPro_GEN")
   @Id
   @Column(name="PAYMENT_GATEWAY_CONFIG_ID")
   private String paymentGatewayConfigId;
   @Column(name="CERTS_PATH")
   private String certsPath;
   @Column(name="HOST_ADDRESS")
   private String hostAddress;
   @Column(name="HOST_PORT")
   private Long hostPort;
   @Column(name="TIMEOUT")
   private Long timeout;
   @Column(name="PROXY_ADDRESS")
   private String proxyAddress;
   @Column(name="PROXY_PORT")
   private Long proxyPort;
   @Column(name="PROXY_LOGON")
   private String proxyLogon;
   @Column(name="PROXY_PASSWORD")
   private String proxyPassword;
   @Column(name="VENDOR")
   private String vendor;
   @Column(name="USER_ID")
   private String userId;
   @Column(name="PWD")
   private String pwd;
   @Column(name="PARTNER")
   private String partner;
   @Column(name="CHECK_AVS")
   private String checkAvs;
   @Column(name="CHECK_CVV2")
   private String checkCvv2;
   @Column(name="PRE_AUTH")
   private String preAuth;
   @Column(name="ENABLE_TRANSMIT")
   private String enableTransmit;
   @Column(name="LOG_FILE_NAME")
   private String logFileName;
   @Column(name="LOGGING_LEVEL")
   private Long loggingLevel;
   @Column(name="MAX_LOG_FILE_SIZE")
   private Long maxLogFileSize;
   @Column(name="STACK_TRACE_ON")
   private String stackTraceOn;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_GATEWAY_CONFIG_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentGatewayConfig paymentGatewayConfig = null;

  /**
   * Default constructor.
   */
  public PaymentGatewayPayflowPro() {
      super();
      this.baseEntityName = "PaymentGatewayPayflowPro";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentGatewayConfigId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentGatewayConfigId");this.allFieldsNames.add("certsPath");this.allFieldsNames.add("hostAddress");this.allFieldsNames.add("hostPort");this.allFieldsNames.add("timeout");this.allFieldsNames.add("proxyAddress");this.allFieldsNames.add("proxyPort");this.allFieldsNames.add("proxyLogon");this.allFieldsNames.add("proxyPassword");this.allFieldsNames.add("vendor");this.allFieldsNames.add("userId");this.allFieldsNames.add("pwd");this.allFieldsNames.add("partner");this.allFieldsNames.add("checkAvs");this.allFieldsNames.add("checkCvv2");this.allFieldsNames.add("preAuth");this.allFieldsNames.add("enableTransmit");this.allFieldsNames.add("logFileName");this.allFieldsNames.add("loggingLevel");this.allFieldsNames.add("maxLogFileSize");this.allFieldsNames.add("stackTraceOn");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentGatewayPayflowPro(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentGatewayConfigId the paymentGatewayConfigId to set
     */
    public void setPaymentGatewayConfigId(String paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }
    /**
     * Auto generated value setter.
     * @param certsPath the certsPath to set
     */
    public void setCertsPath(String certsPath) {
        this.certsPath = certsPath;
    }
    /**
     * Auto generated value setter.
     * @param hostAddress the hostAddress to set
     */
    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }
    /**
     * Auto generated value setter.
     * @param hostPort the hostPort to set
     */
    public void setHostPort(Long hostPort) {
        this.hostPort = hostPort;
    }
    /**
     * Auto generated value setter.
     * @param timeout the timeout to set
     */
    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }
    /**
     * Auto generated value setter.
     * @param proxyAddress the proxyAddress to set
     */
    public void setProxyAddress(String proxyAddress) {
        this.proxyAddress = proxyAddress;
    }
    /**
     * Auto generated value setter.
     * @param proxyPort the proxyPort to set
     */
    public void setProxyPort(Long proxyPort) {
        this.proxyPort = proxyPort;
    }
    /**
     * Auto generated value setter.
     * @param proxyLogon the proxyLogon to set
     */
    public void setProxyLogon(String proxyLogon) {
        this.proxyLogon = proxyLogon;
    }
    /**
     * Auto generated value setter.
     * @param proxyPassword the proxyPassword to set
     */
    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }
    /**
     * Auto generated value setter.
     * @param vendor the vendor to set
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    /**
     * Auto generated value setter.
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * Auto generated value setter.
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    /**
     * Auto generated value setter.
     * @param partner the partner to set
     */
    public void setPartner(String partner) {
        this.partner = partner;
    }
    /**
     * Auto generated value setter.
     * @param checkAvs the checkAvs to set
     */
    public void setCheckAvs(String checkAvs) {
        this.checkAvs = checkAvs;
    }
    /**
     * Auto generated value setter.
     * @param checkCvv2 the checkCvv2 to set
     */
    public void setCheckCvv2(String checkCvv2) {
        this.checkCvv2 = checkCvv2;
    }
    /**
     * Auto generated value setter.
     * @param preAuth the preAuth to set
     */
    public void setPreAuth(String preAuth) {
        this.preAuth = preAuth;
    }
    /**
     * Auto generated value setter.
     * @param enableTransmit the enableTransmit to set
     */
    public void setEnableTransmit(String enableTransmit) {
        this.enableTransmit = enableTransmit;
    }
    /**
     * Auto generated value setter.
     * @param logFileName the logFileName to set
     */
    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }
    /**
     * Auto generated value setter.
     * @param loggingLevel the loggingLevel to set
     */
    public void setLoggingLevel(Long loggingLevel) {
        this.loggingLevel = loggingLevel;
    }
    /**
     * Auto generated value setter.
     * @param maxLogFileSize the maxLogFileSize to set
     */
    public void setMaxLogFileSize(Long maxLogFileSize) {
        this.maxLogFileSize = maxLogFileSize;
    }
    /**
     * Auto generated value setter.
     * @param stackTraceOn the stackTraceOn to set
     */
    public void setStackTraceOn(String stackTraceOn) {
        this.stackTraceOn = stackTraceOn;
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
    public String getPaymentGatewayConfigId() {
        return this.paymentGatewayConfigId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCertsPath() {
        return this.certsPath;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHostAddress() {
        return this.hostAddress;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getHostPort() {
        return this.hostPort;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getTimeout() {
        return this.timeout;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProxyAddress() {
        return this.proxyAddress;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getProxyPort() {
        return this.proxyPort;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProxyLogon() {
        return this.proxyLogon;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProxyPassword() {
        return this.proxyPassword;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVendor() {
        return this.vendor;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserId() {
        return this.userId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPwd() {
        return this.pwd;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartner() {
        return this.partner;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCheckAvs() {
        return this.checkAvs;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCheckCvv2() {
        return this.checkCvv2;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPreAuth() {
        return this.preAuth;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEnableTransmit() {
        return this.enableTransmit;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLogFileName() {
        return this.logFileName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getLoggingLevel() {
        return this.loggingLevel;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getMaxLogFileSize() {
        return this.maxLogFileSize;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStackTraceOn() {
        return this.stackTraceOn;
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
     * Auto generated method that gets the related <code>PaymentGatewayConfig</code> by the relation named <code>PaymentGatewayConfig</code>.
     * @return the <code>PaymentGatewayConfig</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentGatewayConfig getPaymentGatewayConfig() throws RepositoryException {
        if (this.paymentGatewayConfig == null) {
            this.paymentGatewayConfig = getRelatedOne(PaymentGatewayConfig.class, "PaymentGatewayConfig");
        }
        return this.paymentGatewayConfig;
    }

    /**
     * Auto generated value setter.
     * @param paymentGatewayConfig the paymentGatewayConfig to set
    */
    public void setPaymentGatewayConfig(PaymentGatewayConfig paymentGatewayConfig) {
        this.paymentGatewayConfig = paymentGatewayConfig;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentGatewayConfigId((String) mapValue.get("paymentGatewayConfigId"));
        setCertsPath((String) mapValue.get("certsPath"));
        setHostAddress((String) mapValue.get("hostAddress"));
        setHostPort((Long) mapValue.get("hostPort"));
        setTimeout((Long) mapValue.get("timeout"));
        setProxyAddress((String) mapValue.get("proxyAddress"));
        setProxyPort((Long) mapValue.get("proxyPort"));
        setProxyLogon((String) mapValue.get("proxyLogon"));
        setProxyPassword((String) mapValue.get("proxyPassword"));
        setVendor((String) mapValue.get("vendor"));
        setUserId((String) mapValue.get("userId"));
        setPwd((String) mapValue.get("pwd"));
        setPartner((String) mapValue.get("partner"));
        setCheckAvs((String) mapValue.get("checkAvs"));
        setCheckCvv2((String) mapValue.get("checkCvv2"));
        setPreAuth((String) mapValue.get("preAuth"));
        setEnableTransmit((String) mapValue.get("enableTransmit"));
        setLogFileName((String) mapValue.get("logFileName"));
        setLoggingLevel((Long) mapValue.get("loggingLevel"));
        setMaxLogFileSize((Long) mapValue.get("maxLogFileSize"));
        setStackTraceOn((String) mapValue.get("stackTraceOn"));
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
        mapValue.put("paymentGatewayConfigId", getPaymentGatewayConfigId());
        mapValue.put("certsPath", getCertsPath());
        mapValue.put("hostAddress", getHostAddress());
        mapValue.put("hostPort", getHostPort());
        mapValue.put("timeout", getTimeout());
        mapValue.put("proxyAddress", getProxyAddress());
        mapValue.put("proxyPort", getProxyPort());
        mapValue.put("proxyLogon", getProxyLogon());
        mapValue.put("proxyPassword", getProxyPassword());
        mapValue.put("vendor", getVendor());
        mapValue.put("userId", getUserId());
        mapValue.put("pwd", getPwd());
        mapValue.put("partner", getPartner());
        mapValue.put("checkAvs", getCheckAvs());
        mapValue.put("checkCvv2", getCheckCvv2());
        mapValue.put("preAuth", getPreAuth());
        mapValue.put("enableTransmit", getEnableTransmit());
        mapValue.put("logFileName", getLogFileName());
        mapValue.put("loggingLevel", getLoggingLevel());
        mapValue.put("maxLogFileSize", getMaxLogFileSize());
        mapValue.put("stackTraceOn", getStackTraceOn());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
