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
<#if productPromoCode?exists>
    <div class="screenlet">
        <div class="screenlet-title-bar">
            <h3>${uiLabelMap.ProductPromoCodeEmails}</h3>
        </div>
        <div class="screenlet-body">
            <#list productPromoCodeEmails as productPromoCodeEmail>
                <div><a href="<@ofbizUrl>deleteProductPromoCodeEmail?productPromoCodeId=${productPromoCodeEmail.productPromoCodeId}&emailAddress=${productPromoCodeEmail.emailAddress}&productPromoId=${productPromoId}</@ofbizUrl>" class="buttontext">X</a>&nbsp;${productPromoCodeEmail.emailAddress}</div>
            </#list>
            <div>
                <form method="post" action="<@ofbizUrl>createProductPromoCodeEmail</@ofbizUrl>" style="margin: 0;">
                    <input type="hidden" name="productPromoCodeId" value="${productPromoCodeId?if_exists}"/>
                    <input type="hidden" name="productPromoId" value="${productPromoId}"/>
                    <span class="label">${uiLabelMap.ProductAddEmail}:</span><input type="text" size="40" name="emailAddress">
                    <input type="submit" value="${uiLabelMap.CommonAdd}">
                </form>
                <#if productPromoCode.requireEmailOrParty?if_exists == "N">
                    <div class="tooltip">${uiLabelMap.ProductNoteRequireEmailParty}</div>
                </#if>
                <form method="post" action="<@ofbizUrl>createBulkProductPromoCodeEmail?productPromoCodeId=${productPromoCodeId?if_exists}</@ofbizUrl>" enctype="multipart/form-data" style="margin: 0;">
                    <input type="hidden" name="productPromoCodeId" value="${productPromoCodeId?if_exists}"/>
                    <input type="hidden" name="productPromoId" value="${productPromoId}"/>
                    <input type="file" size="40" name="uploadedFile">
                    <input type="submit" value="${uiLabelMap.CommonUpload}">
                </form>
            </div>
        </div>
    </div>
    <div class="screenlet">
        <div class="screenlet-title-bar">
            <h3>${uiLabelMap.ProductPromoCodeParties}</h3>
        </div>
        <div class="screenlet-body">
            <#list productPromoCodeParties as productPromoCodeParty>
                <div><a href="<@ofbizUrl>deleteProductPromoCodeParty?productPromoCodeId=${productPromoCodeParty.productPromoCodeId}&partyId=${productPromoCodeParty.partyId}&productPromoId=${productPromoId}</@ofbizUrl>" class="buttontext">X</a>&nbsp;${productPromoCodeParty.partyId}</div>
            </#list>
            <div>
                <form method="post" action="<@ofbizUrl>createProductPromoCodeParty</@ofbizUrl>">
                    <input type="hidden" name="productPromoCodeId" value="${productPromoCodeId?if_exists}"/>
                    <input type="hidden" name="productPromoId" value="${productPromoId}"/>
                    <span class="label">${uiLabelMap.ProductAddPartyId}:</span><input type="text" size="10" name="partyId">
                    <input type="submit" value="${uiLabelMap.CommonAdd}">
                </form>
            </div>
        </div>
    </div>
</#if>