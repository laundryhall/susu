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

import java.io.Serializable;
import javax.persistence.*;

import java.lang.String;

@Embeddable
public class OldOrderItemAssociationPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="SALES_ORDER_ID")
    private String salesOrderId;
    @Column(name="SO_ITEM_SEQ_ID")
    private String soItemSeqId;
    @Column(name="PURCHASE_ORDER_ID")
    private String purchaseOrderId;
    @Column(name="PO_ITEM_SEQ_ID")
    private String poItemSeqId;

    /**
     * Auto generated value setter.
     * @param salesOrderId the salesOrderId to set
     */
    public void setSalesOrderId(String salesOrderId) {
        this.salesOrderId = salesOrderId;
    }
    /**
     * Auto generated value setter.
     * @param soItemSeqId the soItemSeqId to set
     */
    public void setSoItemSeqId(String soItemSeqId) {
        this.soItemSeqId = soItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param purchaseOrderId the purchaseOrderId to set
     */
    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }
    /**
     * Auto generated value setter.
     * @param poItemSeqId the poItemSeqId to set
     */
    public void setPoItemSeqId(String poItemSeqId) {
        this.poItemSeqId = poItemSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalesOrderId() {
        return this.salesOrderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSoItemSeqId() {
        return this.soItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPoItemSeqId() {
        return this.poItemSeqId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(salesOrderId).append("*");
            sb.append(soItemSeqId).append("*");
            sb.append(purchaseOrderId).append("*");
            sb.append(poItemSeqId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof OldOrderItemAssociationPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
