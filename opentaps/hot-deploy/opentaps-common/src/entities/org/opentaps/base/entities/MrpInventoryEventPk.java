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
import java.sql.Timestamp;

@Embeddable
public class MrpInventoryEventPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="PRODUCT_ID")
    private String productId;
    @Column(name="EVENT_DATE")
    private Timestamp eventDate;
    @Column(name="INVENTORY_EVENT_PLAN_TYPE_ID")
    private String inventoryEventPlanTypeId;
    @Column(name="FACILITY_ID")
    private String facilityId;

    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param eventDate the eventDate to set
     */
    public void setEventDate(Timestamp eventDate) {
        this.eventDate = eventDate;
    }
    /**
     * Auto generated value setter.
     * @param inventoryEventPlanTypeId the inventoryEventPlanTypeId to set
     */
    public void setInventoryEventPlanTypeId(String inventoryEventPlanTypeId) {
        this.inventoryEventPlanTypeId = inventoryEventPlanTypeId;
    }
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getEventDate() {
        return this.eventDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryEventPlanTypeId() {
        return this.inventoryEventPlanTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityId() {
        return this.facilityId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(productId).append("*");
            sb.append(eventDate).append("*");
            sb.append(inventoryEventPlanTypeId).append("*");
            sb.append(facilityId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof MrpInventoryEventPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}