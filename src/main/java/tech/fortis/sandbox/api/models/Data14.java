/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Data14 type.
 */
public class Data14 {
    private Async async;

    /**
     * Default constructor.
     */
    public Data14() {
    }

    /**
     * Initialization constructor.
     * @param  async  Async value for async.
     */
    public Data14(
            Async async) {
        this.async = async;
    }

    /**
     * Getter for Async.
     * Do not store the Async Code for long term use, it expires after 30 days.
     * @return Returns the Async
     */
    @JsonGetter("async")
    public Async getAsync() {
        return async;
    }

    /**
     * Setter for Async.
     * Do not store the Async Code for long term use, it expires after 30 days.
     * @param async Value for Async
     */
    @JsonSetter("async")
    public void setAsync(Async async) {
        this.async = async;
    }

    /**
     * Converts this Data14 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Data14 [" + "async=" + async + "]";
    }

    /**
     * Builds a new {@link Data14.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Data14.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(async);
        return builder;
    }

    /**
     * Class to build instances of {@link Data14}.
     */
    public static class Builder {
        private Async async;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  async  Async value for async.
         */
        public Builder(Async async) {
            this.async = async;
        }

        /**
         * Setter for async.
         * @param  async  Async value for async.
         * @return Builder
         */
        public Builder async(Async async) {
            this.async = async;
            return this;
        }

        /**
         * Builds a new {@link Data14} object using the set fields.
         * @return {@link Data14}
         */
        public Data14 build() {
            return new Data14(async);
        }
    }
}