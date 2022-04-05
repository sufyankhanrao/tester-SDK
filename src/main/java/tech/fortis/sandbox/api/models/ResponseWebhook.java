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
 * This is a model class for ResponseWebhook type.
 */
public class ResponseWebhook {
    private String type;
    private Data16 data;

    /**
     * Default constructor.
     */
    public ResponseWebhook() {
        type = "Webhook";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  data  Data16 value for data.
     */
    public ResponseWebhook(
            String type,
            Data16 data) {
        this.type = type;
        this.data = data;
    }

    /**
     * Getter for Type.
     * Resource Type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Resource Type
     * @param type Value for String
     */
    @JsonSetter("type")
    private void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Data.
     * @return Returns the Data16
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Data16 getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for Data16
     */
    @JsonSetter("data")
    public void setData(Data16 data) {
        this.data = data;
    }

    /**
     * Converts this ResponseWebhook into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResponseWebhook [" + "type=" + type + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link ResponseWebhook.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResponseWebhook.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type)
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link ResponseWebhook}.
     */
    public static class Builder {
        private String type = "Webhook";
        private Data16 data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         */
        public Builder(String type) {
            this.type = type;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  Data16 value for data.
         * @return Builder
         */
        public Builder data(Data16 data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link ResponseWebhook} object using the set fields.
         * @return {@link ResponseWebhook}
         */
        public ResponseWebhook build() {
            return new ResponseWebhook(type, data);
        }
    }
}