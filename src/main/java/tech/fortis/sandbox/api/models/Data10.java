/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import tech.fortis.sandbox.api.DateTimeHelper;

/**
 * This is a model class for Data10 type.
 */
public class Data10 {
    private String locationId;
    private String title;
    private String id;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;

    /**
     * Default constructor.
     */
    public Data10() {
    }

    /**
     * Initialization constructor.
     * @param  locationId  String value for locationId.
     * @param  title  String value for title.
     * @param  id  String value for id.
     * @param  createdTs  LocalDateTime value for createdTs.
     * @param  modifiedTs  LocalDateTime value for modifiedTs.
     */
    public Data10(
            String locationId,
            String title,
            String id,
            LocalDateTime createdTs,
            LocalDateTime modifiedTs) {
        this.locationId = locationId;
        this.title = title;
        this.id = id;
        this.createdTs = createdTs;
        this.modifiedTs = modifiedTs;
    }

    /**
     * Getter for LocationId.
     * Location ID
     * @return Returns the String
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     * Setter for LocationId.
     * Location ID
     * @param locationId Value for String
     */
    @JsonSetter("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    /**
     * Getter for Title.
     * Tag Title
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * Tag Title
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Id.
     * Tag ID
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Tag ID
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for CreatedTs.
     * Created Time Stamp
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_ts")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    /**
     * Setter for CreatedTs.
     * Created Time Stamp
     * @param createdTs Value for LocalDateTime
     */
    @JsonSetter("created_ts")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * Getter for ModifiedTs.
     * Modified Time Stamp
     * @return Returns the LocalDateTime
     */
    @JsonGetter("modified_ts")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getModifiedTs() {
        return modifiedTs;
    }

    /**
     * Setter for ModifiedTs.
     * Modified Time Stamp
     * @param modifiedTs Value for LocalDateTime
     */
    @JsonSetter("modified_ts")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setModifiedTs(LocalDateTime modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    /**
     * Converts this Data10 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Data10 [" + "locationId=" + locationId + ", title=" + title + ", id=" + id
                + ", createdTs=" + createdTs + ", modifiedTs=" + modifiedTs + "]";
    }

    /**
     * Builds a new {@link Data10.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Data10.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(locationId, title, id, createdTs, modifiedTs);
        return builder;
    }

    /**
     * Class to build instances of {@link Data10}.
     */
    public static class Builder {
        private String locationId;
        private String title;
        private String id;
        private LocalDateTime createdTs;
        private LocalDateTime modifiedTs;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  locationId  String value for locationId.
         * @param  title  String value for title.
         * @param  id  String value for id.
         * @param  createdTs  LocalDateTime value for createdTs.
         * @param  modifiedTs  LocalDateTime value for modifiedTs.
         */
        public Builder(String locationId, String title, String id, LocalDateTime createdTs,
                LocalDateTime modifiedTs) {
            this.locationId = locationId;
            this.title = title;
            this.id = id;
            this.createdTs = createdTs;
            this.modifiedTs = modifiedTs;
        }

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
         * @param  createdTs  LocalDateTime value for createdTs.
         * @return Builder
         */
        public Builder createdTs(LocalDateTime createdTs) {
            this.createdTs = createdTs;
            return this;
        }

        /**
         * Setter for modifiedTs.
         * @param  modifiedTs  LocalDateTime value for modifiedTs.
         * @return Builder
         */
        public Builder modifiedTs(LocalDateTime modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }

        /**
         * Builds a new {@link Data10} object using the set fields.
         * @return {@link Data10}
         */
        public Data10 build() {
            return new Data10(locationId, title, id, createdTs, modifiedTs);
        }
    }
}
