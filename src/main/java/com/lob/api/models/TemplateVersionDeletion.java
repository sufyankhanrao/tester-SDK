/*
 * LobAPI20200211SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TemplateVersionDeletion type.
 */
public class TemplateVersionDeletion {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean deleted;

    /**
     * Default constructor.
     */
    public TemplateVersionDeletion() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  deleted  Boolean value for deleted.
     */
    public TemplateVersionDeletion(
            String id,
            Boolean deleted) {
        this.id = id;
        this.deleted = deleted;
    }

    /**
     * Getter for Id.
     * Unique identifier prefixed with `vrsn_`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier prefixed with `vrsn_`.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @return Returns the Boolean
     */
    @JsonGetter("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Setter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @param deleted Value for Boolean
     */
    @JsonSetter("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Converts this TemplateVersionDeletion into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TemplateVersionDeletion [" + "id=" + id + ", deleted=" + deleted + "]";
    }

    /**
     * Builds a new {@link TemplateVersionDeletion.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TemplateVersionDeletion.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .deleted(getDeleted());
        return builder;
    }

    /**
     * Class to build instances of {@link TemplateVersionDeletion}.
     */
    public static class Builder {
        private String id;
        private Boolean deleted;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for deleted.
         * @param  deleted  Boolean value for deleted.
         * @return Builder
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Builds a new {@link TemplateVersionDeletion} object using the set fields.
         * @return {@link TemplateVersionDeletion}
         */
        public TemplateVersionDeletion build() {
            return new TemplateVersionDeletion(id, deleted);
        }
    }
}
