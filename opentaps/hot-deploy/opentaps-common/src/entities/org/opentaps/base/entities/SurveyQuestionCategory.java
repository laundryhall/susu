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
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity SurveyQuestionCategory.
 */
@javax.persistence.Entity
@Table(name="SURVEY_QUESTION_CATEGORY")
public class SurveyQuestionCategory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("surveyQuestionCategoryId", "SURVEY_QUESTION_CATEGORY_ID");
        fields.put("parentCategoryId", "PARENT_CATEGORY_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SurveyQuestionCategory", fields);
}
  public static enum Fields implements EntityFieldInterface<SurveyQuestionCategory> {
    surveyQuestionCategoryId("surveyQuestionCategoryId"),
    parentCategoryId("parentCategoryId"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="SurveyQuestionCategory_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SurveyQuestionCategory_GEN")
   @Id
   @Column(name="SURVEY_QUESTION_CATEGORY_ID")
   private String surveyQuestionCategoryId;
   @Column(name="PARENT_CATEGORY_ID")
   private String parentCategoryId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SurveyQuestionCategory parentSurveyQuestionCategory = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="surveyQuestionCategory", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SURVEY_QUESTION_CATEGORY_ID")
   
   private List<SurveyQuestion> surveyQuestions = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentSurveyQuestionCategory", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_CATEGORY_ID")
   
   private List<SurveyQuestionCategory> childSurveyQuestionCategorys = null;

  /**
   * Default constructor.
   */
  public SurveyQuestionCategory() {
      super();
      this.baseEntityName = "SurveyQuestionCategory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("surveyQuestionCategoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("surveyQuestionCategoryId");this.allFieldsNames.add("parentCategoryId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SurveyQuestionCategory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param surveyQuestionCategoryId the surveyQuestionCategoryId to set
     */
    public void setSurveyQuestionCategoryId(String surveyQuestionCategoryId) {
        this.surveyQuestionCategoryId = surveyQuestionCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param parentCategoryId the parentCategoryId to set
     */
    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
    public String getSurveyQuestionCategoryId() {
        return this.surveyQuestionCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentCategoryId() {
        return this.parentCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
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
     * Auto generated method that gets the related <code>SurveyQuestionCategory</code> by the relation named <code>ParentSurveyQuestionCategory</code>.
     * @return the <code>SurveyQuestionCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyQuestionCategory getParentSurveyQuestionCategory() throws RepositoryException {
        if (this.parentSurveyQuestionCategory == null) {
            this.parentSurveyQuestionCategory = getRelatedOne(SurveyQuestionCategory.class, "ParentSurveyQuestionCategory");
        }
        return this.parentSurveyQuestionCategory;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestion</code> by the relation named <code>SurveyQuestion</code>.
     * @return the list of <code>SurveyQuestion</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SurveyQuestion> getSurveyQuestions() throws RepositoryException {
        if (this.surveyQuestions == null) {
            this.surveyQuestions = getRelated(SurveyQuestion.class, "SurveyQuestion");
        }
        return this.surveyQuestions;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestionCategory</code> by the relation named <code>ChildSurveyQuestionCategory</code>.
     * @return the list of <code>SurveyQuestionCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SurveyQuestionCategory> getChildSurveyQuestionCategorys() throws RepositoryException {
        if (this.childSurveyQuestionCategorys == null) {
            this.childSurveyQuestionCategorys = getRelated(SurveyQuestionCategory.class, "ChildSurveyQuestionCategory");
        }
        return this.childSurveyQuestionCategorys;
    }

    /**
     * Auto generated value setter.
     * @param parentSurveyQuestionCategory the parentSurveyQuestionCategory to set
    */
    public void setParentSurveyQuestionCategory(SurveyQuestionCategory parentSurveyQuestionCategory) {
        this.parentSurveyQuestionCategory = parentSurveyQuestionCategory;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestions the surveyQuestions to set
    */
    public void setSurveyQuestions(List<SurveyQuestion> surveyQuestions) {
        this.surveyQuestions = surveyQuestions;
    }
    /**
     * Auto generated value setter.
     * @param childSurveyQuestionCategorys the childSurveyQuestionCategorys to set
    */
    public void setChildSurveyQuestionCategorys(List<SurveyQuestionCategory> childSurveyQuestionCategorys) {
        this.childSurveyQuestionCategorys = childSurveyQuestionCategorys;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSurveyQuestionCategoryId((String) mapValue.get("surveyQuestionCategoryId"));
        setParentCategoryId((String) mapValue.get("parentCategoryId"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("surveyQuestionCategoryId", getSurveyQuestionCategoryId());
        mapValue.put("parentCategoryId", getParentCategoryId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
