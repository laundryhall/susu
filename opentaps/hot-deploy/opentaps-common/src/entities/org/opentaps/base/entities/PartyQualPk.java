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
public class PartyQualPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="PARTY_ID")
    private String partyId;
    @Column(name="PARTY_QUAL_TYPE_ID")
    private String partyQualTypeId;
    @Column(name="FROM_DATE")
    private Timestamp fromDate;

    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param partyQualTypeId the partyQualTypeId to set
     */
    public void setPartyQualTypeId(String partyQualTypeId) {
        this.partyQualTypeId = partyQualTypeId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyQualTypeId() {
        return this.partyQualTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(partyId).append("*");
            sb.append(partyQualTypeId).append("*");
            sb.append(fromDate).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof PartyQualPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}