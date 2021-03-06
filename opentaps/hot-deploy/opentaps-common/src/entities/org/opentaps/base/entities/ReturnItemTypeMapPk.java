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
public class ReturnItemTypeMapPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="RETURN_ITEM_MAP_KEY")
    private String returnItemMapKey;
    @Column(name="RETURN_HEADER_TYPE_ID")
    private String returnHeaderTypeId;

    /**
     * Auto generated value setter.
     * @param returnItemMapKey the returnItemMapKey to set
     */
    public void setReturnItemMapKey(String returnItemMapKey) {
        this.returnItemMapKey = returnItemMapKey;
    }
    /**
     * Auto generated value setter.
     * @param returnHeaderTypeId the returnHeaderTypeId to set
     */
    public void setReturnHeaderTypeId(String returnHeaderTypeId) {
        this.returnHeaderTypeId = returnHeaderTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnItemMapKey() {
        return this.returnItemMapKey;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnHeaderTypeId() {
        return this.returnHeaderTypeId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(returnItemMapKey).append("*");
            sb.append(returnHeaderTypeId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ReturnItemTypeMapPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
