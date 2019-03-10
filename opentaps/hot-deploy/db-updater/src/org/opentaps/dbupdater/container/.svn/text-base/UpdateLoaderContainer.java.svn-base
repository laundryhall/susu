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

/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/

/* This file has been modified by Open Source Strategies, Inc. */

package org.opentaps.dbupdater.container;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javolution.util.FastList;
import org.ofbiz.base.container.Container;
import org.ofbiz.base.container.ContainerConfig;
import org.ofbiz.base.container.ContainerException;
import org.ofbiz.base.util.Debug;
import org.ofbiz.base.util.GeneralException;
import org.ofbiz.base.util.StringUtil;
import org.ofbiz.base.util.UtilDateTime;
import org.ofbiz.base.util.UtilMisc;
import org.ofbiz.base.util.UtilURL;
import org.ofbiz.base.util.UtilValidate;
import org.ofbiz.entity.GenericDelegator;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.GenericValue;
import org.ofbiz.entity.condition.EntityCondition;
import org.ofbiz.entity.condition.EntityOperator;
import org.ofbiz.entity.util.EntityDataLoader;
import org.ofbiz.entity.util.EntityUtil;
import org.ofbiz.service.ServiceDispatcher;


/**
 * Loads update.
 */
public class UpdateLoaderContainer implements Container {

    private static final String MODULE = UpdateLoaderContainer.class.getName();

    protected String overrideDelegator = null;
    protected String overrideGroup = null;
    protected String configFile = null;
    protected String directory = null;
    protected List<String> files = FastList.newInstance();
    protected String component = null;
    protected boolean useDummyFks = false;
    protected boolean maintainTxs = false;
    protected boolean tryInserts = false;
    protected boolean failOnError = true;
    protected int txTimeout = -1;

    public UpdateLoaderContainer() {
        super();
    }

    /**
     * @see org.ofbiz.base.container.Container#init(java.lang.String[], java.lang.String)
     */
    public void init(String[] args, String configFile) throws ContainerException {
        this.configFile = configFile;
        // disable job scheduler, JMS listener and startup services
        ServiceDispatcher.enableJM(false);
        ServiceDispatcher.enableJMS(false);
        ServiceDispatcher.enableSvcs(false);

        /*
           install arguments:
           timeout (transaction timeout default 7200)
           file (import a specific file or list of files)
           dir (to set the import directory)
           failonerror (throw an exception on a load error, defaults to true, if false errors are only reported but the loader goes on)

           Example:
           $ java -jar ofbiz.jar -update -timeout=7200 
           $ java -jar ofbiz.jar -update -file=/tmp/dataload.xml
        */
        if (args != null) {
            for (String argument: args) {
                // arguments can prefix w/ a '-'. Just strip them off
                if (argument.startsWith("-")) {
                    int subIdx = 1;
                    if (argument.startsWith("--")) {
                        subIdx = 2;
                    }
                    argument = argument.substring(subIdx);
                }

                // parse the arguments
                String argumentName;
                String argumentVal;
                if (argument.indexOf("=") != -1) {
                    argumentName = argument.substring(0, argument.indexOf("="));
                    argumentVal = argument.substring(argument.indexOf("=") + 1);
                } else {
                    argumentName = argument;
                    argumentVal = "";
                }
                Debug.log("Update Argument - " + argumentName + " = " + argumentVal, MODULE);

                if ("timeout".equalsIgnoreCase(argumentName)) {
                    try {
                        this.txTimeout = Integer.parseInt(argumentVal);
                    } catch (Exception e) {
                        this.txTimeout = -1;
                    }
                } else if ("file".equalsIgnoreCase(argumentName)) {
                    this.files.addAll(StringUtil.split(argumentVal, ","));
                } else if ("dir".equalsIgnoreCase(argumentName)) {
                    this.directory = argumentVal;
                } else if ("failonerror".equalsIgnoreCase(argumentName)) {
                    this.failOnError = !"false".equalsIgnoreCase(argumentVal);
                } else if ("help".equalsIgnoreCase(argumentName)) {
                    Debug.log("--------------------------------------", MODULE);
                    Debug.log("java -jar ofbiz.jar -update [options]", MODULE);
                    Debug.log("-file=[path] ......... load a single from from location, can be a comma separated list", MODULE);
                    Debug.log("-dir=[path] .......... sets an alternate directory from which to load the updates, defaults to ./updates/data", MODULE);
                    Debug.log("-failonerror ..........stop the load immediately on error, defaults to true", MODULE);
                    Debug.log("-help ................ display this information", MODULE);
                    System.exit(1);
                }
            }
        }
    }

    /**
     * @see org.ofbiz.base.container.Container#start()
     */
    public boolean start() throws ContainerException {
        ContainerConfig.Container cfg = ContainerConfig.getContainer("update-container", configFile);
        ContainerConfig.Container.Property delegatorNameProp = cfg.getProperty("delegator-name");
        ContainerConfig.Container.Property entityGroupNameProp = cfg.getProperty("entity-group-name");
        ContainerConfig.Container.Property updateDirProp = cfg.getProperty("update-directory");

        String delegatorName = null;
        String entityGroupName = null;

        if (delegatorNameProp == null || delegatorNameProp.value == null || delegatorNameProp.value.length() == 0) {
            throw new ContainerException("Invalid delegator-name defined in container configuration");
        } else {
            delegatorName = delegatorNameProp.value;
        }

        if (entityGroupNameProp == null || entityGroupNameProp.value == null || entityGroupNameProp.value.length() == 0) {
            throw new ContainerException("Invalid entity-group-name defined in container configuration");
        } else {
            entityGroupName = entityGroupNameProp.value;
        }

        if (this.directory == null && (updateDirProp == null || updateDirProp.value == null || updateDirProp.value.length() == 0)) {
            throw new ContainerException("Invalid update-directory defined in container configuration");
        } else {
            directory = updateDirProp.value;
        }

        String delegatorNameToUse = overrideDelegator != null ? overrideDelegator : delegatorName;
        String groupNameToUse = overrideGroup != null ? overrideGroup : entityGroupName;
        GenericDelegator delegator = GenericDelegator.getGenericDelegator(delegatorNameToUse);
        if (delegator == null) {
            throw new ContainerException("Invalid delegator name!");
        }

        String helperName = delegator.getGroupHelperName(groupNameToUse);
        if (helperName == null) {
            throw new ContainerException("Unable to locate the datasource helper for the group [" + groupNameToUse + "]");
        }

        // get the information about which updates where already loaded or skipped
        List<String> loadedUpdateNames = FastList.newInstance();
        try {
            List<GenericValue> loadedUpdates = delegator.findByAnd("OpentapsDbUpdate", UtilMisc.toList(EntityCondition.makeCondition("statusId", EntityOperator.IN, UtilMisc.toList("UPDATE_SUCCESS", "UPDATE_SKIPPED"))), UtilMisc.toList("updateName"));
            loadedUpdateNames.addAll(EntityUtil.<String>getFieldListFromEntityList(loadedUpdates, "updateName", true));
        } catch (GeneralException e) {
            Debug.logError(e, "Could not load information about the previously loaded updates ", MODULE);
            throw new ContainerException(e);
        }

        // the list of files to process
        List<URL> urlList = FastList.newInstance();

        // if we specifically gave a list of files
        for (String fileName : this.files) {
            URL fileUrl = UtilURL.fromResource(fileName);
            if (fileUrl != null) {
                urlList.add(fileUrl);
            }
        }

        // else use the update directory files
        if (urlList.isEmpty() && this.directory != null) {
            Debug.logInfo("Loading files from directory (" + this.directory + ")", MODULE);
            File dir = new File(this.directory);
            if (dir.exists() && dir.isDirectory() && dir.canRead()) {
                File[] fileArray = dir.listFiles();
                if (fileArray != null && fileArray.length > 0) {
                    for (File file : fileArray) {
                        String lcf = file.getName().toLowerCase();
                        // note: we may accept other file formats later
                        if (lcf.endsWith(".xml")) {
                            try {
                                urlList.add(file.toURI().toURL());
                            } catch (MalformedURLException e) {
                                Debug.logError(e, "Unable to load file (" + file.getName() + "); not a valid URL.", MODULE);
                            }
                        }
                    }
                }
            } else {
                Debug.logError("Unable to load files from directory (" + this.directory + ").", MODULE);
            }
        }

        // if we are still empty, throw an error
        if (urlList.isEmpty()) {
            throw new ContainerException("Could not find any update file to load.");
        }

        // sort the list of files to load by the file name
        Collections.sort(urlList, new UrlSortByFileName());
        // remove any update that were already loaded
        Iterator<URL> iter = urlList.iterator();
        while (iter.hasNext()) {
            URL u = iter.next();
            if (loadedUpdateNames.contains(getFileName(u))) {
                iter.remove();
            }
        }

        // process the list of files
        NumberFormat changedFormat = NumberFormat.getIntegerInstance();
        changedFormat.setMinimumIntegerDigits(5);
        changedFormat.setGroupingUsed(false);

        List<Object> errorMessages = FastList.newInstance();
        List<String> infoMessages = FastList.newInstance();
        int totalRowsChanged = 0;
        if (UtilValidate.isNotEmpty(urlList)) {
            Debug.logImportant("=-=-=-=-=-=-= Doing an update with the following files:", MODULE);
            for (URL dataUrl : urlList) {
                Debug.logImportant(dataUrl.toExternalForm(), MODULE);
            }

            Debug.logImportant("=-=-=-=-=-=-= Starting the data load...", MODULE);

            for (URL dataUrl : urlList) {
                try {
                    int errorCount = errorMessages.size();
                    int rowsChanged = EntityDataLoader.loadData(dataUrl, helperName, delegator, errorMessages, txTimeout, useDummyFks, maintainTxs, tryInserts);
                    totalRowsChanged += rowsChanged;
                    // check if there are new errors
                    if (errorCount < errorMessages.size()) {
                        // record the error
                        try {
                            delegator.createOrStore(delegator.makeValue("OpentapsDbUpdate", UtilMisc.toMap("updateName", getFileName(dataUrl), "updateDate", UtilDateTime.nowTimestamp(), "statusId", "UPDATE_FAILED", "errorMessage", errorMessages.subList(errorCount, errorMessages.size() - 1).toString())));
                        } catch (GenericEntityException e2) {
                            Debug.logError(e2, "Error while recording the update error", MODULE);
                        }
                        if (this.failOnError) {
                            throw new ContainerException("Errors occurred during the update : " + errorMessages);
                        }
                    } else {
                        // record the successful update
                        delegator.createOrStore(delegator.makeValue("OpentapsDbUpdate", UtilMisc.toMap("updateName", getFileName(dataUrl), "updateDate", UtilDateTime.nowTimestamp(), "statusId", "UPDATE_SUCCESS", "errorMessage", null)));
                        infoMessages.add(changedFormat.format(rowsChanged) + " of " + changedFormat.format(totalRowsChanged) + " from " + dataUrl.toExternalForm());
                    }
                } catch (Exception e) {
                    Debug.logError(e, "Error loading update file: " + dataUrl.toExternalForm(), MODULE);
                    // record the error
                    try {
                        delegator.createOrStore(delegator.makeValue("OpentapsDbUpdate", UtilMisc.toMap("updateName", getFileName(dataUrl), "updateDate", UtilDateTime.nowTimestamp(), "statusId", "UPDATE_FAILED", "errorMessage", e.getMessage())));
                    } catch (GenericEntityException e2) {
                        Debug.logError(e2, "Error while recording the update error", MODULE);
                    }
                    if (this.failOnError) {
                        throw new ContainerException(e);
                    }
                }
            }
        } else {
            Debug.logImportant("=-=-=-=-=-=-= No update files to load found.", MODULE);
        }

        if (infoMessages.size() > 0) {
            Debug.logImportant("=-=-=-=-=-=-= Here is a summary of the update:", MODULE);
            for (String message: infoMessages) {
              Debug.logImportant(message, MODULE);
            }
        }

        if (errorMessages.size() > 0) {
            Debug.logImportant("The following errors occurred in the update:", MODULE);
            for (Object message: errorMessages) {
              Debug.logImportant(message.toString(), MODULE);
            }
        }

        Debug.logImportant("=-=-=-=-=-=-= Finished the update with " + totalRowsChanged + " rows changed.", MODULE);

        if (errorMessages.size() > 0 && this.failOnError) {
            throw new ContainerException("Errors occurred during the update.");
        }

        return true;
    }

    /**
     * @see org.ofbiz.base.container.Container#stop()
     */
    public void stop() throws ContainerException {
    }

    public static String getFileName(URL url) {
        String fn = url.getFile();
        int i = fn.lastIndexOf(File.separator);
        if (i < 0) {
            return fn;
        }
        return fn.substring(i + 1);
    }

    // used to sort the list of URLs by file name
    public class UrlSortByFileName implements Comparator<URL> {

        public int compare(URL o1, URL o2) {
            return getFileName(o1).compareTo(getFileName(o2));
        }
    }
}
