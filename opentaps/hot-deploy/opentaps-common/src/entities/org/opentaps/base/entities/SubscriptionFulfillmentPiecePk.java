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
public class SubscriptionFulfillmentPiecePk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="SUBSCRIPTION_ACTIVITY_ID")
    private String subscriptionActivityId;
    @Column(name="SUBSCRIPTION_ID")
    private String subscriptionId;

    /**
     * Auto generated value setter.
     * @param subscriptionActivityId the subscriptionActivityId to set
     */
    public void setSubscriptionActivityId(String subscriptionActivityId) {
        this.subscriptionActivityId = subscriptionActivityId;
    }
    /**
     * Auto generated value setter.
     * @param subscriptionId the subscriptionId to set
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSubscriptionActivityId() {
        return this.subscriptionActivityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(subscriptionActivityId).append("*");
            sb.append(subscriptionId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof SubscriptionFulfillmentPiecePk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}