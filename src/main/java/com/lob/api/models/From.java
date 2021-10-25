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
 * This is a model class for From type.
 */
public class From {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object from;

    /**
     * Default constructor.
     */
    public From() {
    }

    /**
     * Initialization constructor.
     * @param  from  Object value for from.
     */
    public From(
            Object from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * @return Returns the Object
     */
    @JsonGetter("from")
    public Object getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * @param from Value for Object
     */
    @JsonSetter("from")
    public void setFrom(Object from) {
        this.from = from;
    }

    /**
     * Converts this From into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "From [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link From.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link From.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .from(getFrom());
        return builder;
    }

    /**
     * Class to build instances of {@link From}.
     */
    public static class Builder {
        private Object from;



        /**
         * Setter for from.
         * @param  from  Object value for from.
         * @return Builder
         */
        public Builder from(Object from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link From} object using the set fields.
         * @return {@link From}
         */
        public From build() {
            return new From(from);
        }
    }
}
