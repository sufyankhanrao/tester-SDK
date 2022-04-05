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
 * This is a model class for ResponseAsyncStatus type.
 */
public class ResponseAsyncStatus {
    private String type;
    private Data data;

    /**
     * Default constructor.
     */
    public ResponseAsyncStatus() {
        type = "AsyncStatus";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  data  Data value for data.
     */
    public ResponseAsyncStatus(
            String type,
            Data data) {
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
     * @return Returns the Data
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Data getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for Data
     */
    @JsonSetter("data")
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * Converts this ResponseAsyncStatus into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResponseAsyncStatus [" + "type=" + type + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link ResponseAsyncStatus.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResponseAsyncStatus.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type)
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link ResponseAsyncStatus}.
     */
    public static class Builder {
        private String type = "AsyncStatus";
        private Data data;

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
         * @param  data  Data value for data.
         * @return Builder
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link ResponseAsyncStatus} object using the set fields.
         * @return {@link ResponseAsyncStatus}
         */
        public ResponseAsyncStatus build() {
            return new ResponseAsyncStatus(type, data);
        }
    }
}