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
public class ProtectedViewPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="GROUP_ID")
    private String groupId;
    @Column(name="VIEW_NAME_ID")
    private String viewNameId;

    /**
     * Auto generated value setter.
     * @param groupId the groupId to set
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    /**
     * Auto generated value setter.
     * @param viewNameId the viewNameId to set
     */
    public void setViewNameId(String viewNameId) {
        this.viewNameId = viewNameId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getViewNameId() {
        return this.viewNameId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(groupId).append("*");
            sb.append(viewNameId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ProtectedViewPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
