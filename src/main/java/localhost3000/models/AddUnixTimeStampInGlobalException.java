/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import localhost3000.DateTimeHelper;

/**
 * This is a model class for AddUnixTimeStampInGlobalException type.
 */
public class AddUnixTimeStampInGlobalException
        extends BaseModel {
    private LocalDateTime dateTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime dateTime1;

    /**
     * Default constructor.
     */
    public AddUnixTimeStampInGlobalException() {
    }

    /**
     * Initialization constructor.
     * @param  dateTime  LocalDateTime value for dateTime.
     * @param  dateTime1  LocalDateTime value for dateTime1.
     */
    public AddUnixTimeStampInGlobalException(
            LocalDateTime dateTime,
            LocalDateTime dateTime1) {
        this.dateTime = dateTime;
        this.dateTime1 = dateTime1;
    }

    /**
     * Getter for DateTime.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dateTime")
    @JsonSerialize(using = DateTimeHelper.UnixTimestampSerializer.class)
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * Setter for DateTime.
     * @param dateTime Value for LocalDateTime
     */
    @JsonSetter("dateTime")
    @JsonDeserialize(using = DateTimeHelper.UnixTimestampDeserializer.class)
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Getter for DateTime1.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dateTime1")
    @JsonSerialize(using = DateTimeHelper.UnixTimestampSerializer.class)
    public LocalDateTime getDateTime1() {
        return dateTime1;
    }

    /**
     * Setter for DateTime1.
     * @param dateTime1 Value for LocalDateTime
     */
    @JsonSetter("dateTime1")
    @JsonDeserialize(using = DateTimeHelper.UnixTimestampDeserializer.class)
    public void setDateTime1(LocalDateTime dateTime1) {
        this.dateTime1 = dateTime1;
    }

    /**
     * Converts this AddUnixTimeStampInGlobalException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddUnixTimeStampInGlobalException [" + "dateTime=" + dateTime + ", dateTime1="
                + dateTime1 + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link AddUnixTimeStampInGlobalException.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddUnixTimeStampInGlobalException.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dateTime)
                .dateTime1(getDateTime1());
        return builder;
    }

    /**
     * Class to build instances of {@link AddUnixTimeStampInGlobalException}.
     */
    public static class Builder {
        private LocalDateTime dateTime;
        private LocalDateTime dateTime1;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dateTime  LocalDateTime value for dateTime.
         */
        public Builder(LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }

        /**
         * Setter for dateTime.
         * @param  dateTime  LocalDateTime value for dateTime.
         * @return Builder
         */
        public Builder dateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        /**
         * Setter for dateTime1.
         * @param  dateTime1  LocalDateTime value for dateTime1.
         * @return Builder
         */
        public Builder dateTime1(LocalDateTime dateTime1) {
            this.dateTime1 = dateTime1;
            return this;
        }

        /**
         * Builds a new {@link AddUnixTimeStampInGlobalException} object using the set fields.
         * @return {@link AddUnixTimeStampInGlobalException}
         */
        public AddUnixTimeStampInGlobalException build() {
            return new AddUnixTimeStampInGlobalException(dateTime, dateTime1);
        }
    }
}
