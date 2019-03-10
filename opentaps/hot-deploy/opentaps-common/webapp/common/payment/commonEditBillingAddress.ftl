<#--
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
-->

<#--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->

<#-- This file has been modified by Open Source Strategies, Inc. -->


<tr>
  <@displayTitleCell title=uiLabelMap.PartyBillingAddress/>
  <td>
    <table cellspacing="0">
      <#if curPostalAddress?exists>
        <tr>
          <td class="button-col">
            <input type="radio" name="contactMechId" value="${curContactMechId}" checked="checked">
          </td>
          <td>
            <p><b>${uiLabelMap.PartyUseCurrentAddress}:</b></p>
            <#list curPartyContactMechPurposes as curPartyContactMechPurpose> 
              <#assign curContactMechPurposeType = curPartyContactMechPurpose.getRelatedOneCache("ContactMechPurposeType")/>
              <p><b>${curContactMechPurposeType.get("description",locale)?if_exists}</b></p>
              <#if curPartyContactMechPurpose.thruDate?exists>
                <p>(${uiLabelMap.CommonExpire}:${curPartyContactMechPurpose.thruDate.toString()})</p>
              </#if>
            </#list>
            <#if curPostalAddress.toName?exists><p><b>${uiLabelMap.CommonTo}:</b> ${curPostalAddress.toName}</p></#if>
            <#if curPostalAddress.attnName?exists><p><b>${uiLabelMap.PartyAddrAttnName}:</b> ${curPostalAddress.attnName}</p></#if>
            <#if curPostalAddress.address1?exists><p>${curPostalAddress.address1}</p></#if>
            <#if curPostalAddress.address2?exists><p>${curPostalAddress.address2}</p></#if>
            <p>${curPostalAddress.city}<#if curPostalAddress.stateProvinceGeoId?has_content>,&nbsp;${curPostalAddress.stateProvinceGeoId}</#if>&nbsp;${curPostalAddress.postalCode}</p>
            <#if curPostalAddress.countryGeoId?exists><p>${curPostalAddress.countryGeoId}</p></#if>
            <p>(${uiLabelMap.CommonUpdated}:&nbsp;${(curPartyContactMech.fromDate.toString())?if_exists})</p>
            <#if curPartyContactMech.thruDate?exists><p><b>${uiLabelMap.CommonDelete}:&nbsp;${curPartyContactMech.thruDate.toString()}</b></p></#if>
          </td>
        </tr>
      </#if>
      <#list postalAddressInfos as postalAddressInfo>
        <#assign contactMech = postalAddressInfo.contactMech/>
        <#assign partyContactMechPurposes = postalAddressInfo.partyContactMechPurposes/>
        <#assign postalAddress = postalAddressInfo.postalAddress/>
        <#assign partyContactMech = postalAddressInfo.partyContactMech/>
        <tr>
          <td class="button-col">
            <input type='radio' name='contactMechId' value='${contactMech.contactMechId}'>
          </td>
          <td>
            <#list partyContactMechPurposes as partyContactMechPurpose>
              <#assign contactMechPurposeType = partyContactMechPurpose.getRelatedOneCache("ContactMechPurposeType")/>
              <p><b>${contactMechPurposeType.get("description",locale)?if_exists}</b></p>
              <#if partyContactMechPurpose.thruDate?exists><p>(${uiLabelMap.CommonExpire}:${partyContactMechPurpose.thruDate})</p></#if>
            </#list>
            <#if postalAddress.toName?exists><p><b>${uiLabelMap.CommonTo}:</b> ${postalAddress.toName}</p></#if>
            <#if postalAddress.attnName?exists><p><b>${uiLabelMap.PartyAddrAttnName}:</b> ${postalAddress.attnName}</p></#if>
            <#if postalAddress.address1?exists><p>${postalAddress.address1}</p></#if>
            <#if postalAddress.address2?exists><p>${postalAddress.address2}</p></#if>
            <p>${postalAddress.city}<#if postalAddress.stateProvinceGeoId?has_content>,&nbsp;${postalAddress.stateProvinceGeoId}</#if>&nbsp;${postalAddress.postalCode}</p>
            <#if postalAddress.countryGeoId?exists><p>${postalAddress.countryGeoId}</p></#if>
            <p>(${uiLabelMap.CommonUpdated}:&nbsp;${(partyContactMech.fromDate.toString())?if_exists})</p>
            <#if partyContactMech.thruDate?exists><p><b>${uiLabelMap.CommonDelete}:&nbsp;${partyContactMech.thruDate.toString()}</b></p></#if>
          </td>
        </tr>
      </#list>
      <#if !postalAddressInfos?has_content && !curContactMech?exists>
        <tr><td colspan='2'>${uiLabelMap.PartyNoContactInformation}.</td></tr>
      </#if>
    </table>
  </td>
</tr>
