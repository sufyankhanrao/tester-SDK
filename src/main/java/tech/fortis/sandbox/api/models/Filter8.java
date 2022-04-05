/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Filter8 type.
 */
public class Filter8 {
    private String locationId;
    private String title;
    private String id;
    private String createdTs;
    private String modifiedTs;

    /**
     * Default constructor.
     */
    public Filter8() {
    }

    /**
     * Initialization constructor.
     * @param  locationId  String value for locationId.
     * @param  title  String value for title.
     * @param  id  String value for id.
     * @param  createdTs  String value for createdTs.
     * @param  modifiedTs  String value for modifiedTs.
     */
    public Filter8(
            String locationId,
            String title,
            String id,
            String createdTs,
            String modifiedTs) {
        this.locationId = locationId;
        this.title = title;
        this.id = id;
        this.createdTs = createdTs;
        this.modifiedTs = modifiedTs;
    }

    /**
     * Getter for LocationId.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationId() {
        return locationId;
    }

    /**
     * Setter for LocationId.
     * @param locationId Value for String
     */
    @JsonSetter("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for CreatedTs.
     * @return Returns the String
     */
    @JsonGetter("created_ts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedTs() {
        return createdTs;
    }

    /**
     * Setter for CreatedTs.
     * @param createdTs Value for String
     */
    @JsonSetter("created_ts")
    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * Getter for ModifiedTs.
     * @return Returns the String
     */
    @JsonGetter("modified_ts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getModifiedTs() {
        return modifiedTs;
    }

    /**
     * Setter for ModifiedTs.
     * @param modifiedTs Value for String
     */
    @JsonSetter("modified_ts")
    public void setModifiedTs(String modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    /**
     * Converts this Filter8 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Filter8 [" + "locationId=" + locationId + ", title=" + title + ", id=" + id
                + ", createdTs=" + createdTs + ", modifiedTs=" + modifiedTs + "]";
    }

    /**
     * Builds a new {@link Filter8.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Filter8.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .locationId(getLocationId())
                .title(getTitle())
                .id(getId())
                .createdTs(getCreatedTs())
                .modifiedTs(getModifiedTs());
        return builder;
    }

    /**
     * Class to build instances of {@link Filter8}.
     */
    public static class Builder {
        private String locationId;
        private String title;
        private String id;
        private String createdTs;
        private String modifiedTs;



        /**
         * Setter for locationId.
         * @param  locationId  String value for locationId.
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

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
         * Setter for createdTs.
         * @param  createdTs  String value for createdTs.
         * @return Builder
         */
        public Builder createdTs(String createdTs) {
            this.createdTs = createdTs;
            return this;
        }

        /**
         * Setter for modifiedTs.
         * @param  modifiedTs  String value for modifiedTs.
         * @return Builder
         */
        public Builder modifiedTs(String modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }

        /**
         * Builds a new {@link Filter8} object using the set fields.
         * @return {@link Filter8}
         */
        public Filter8 build() {
            return new Filter8(locationId, title, id, createdTs, modifiedTs);
        }
    }
}