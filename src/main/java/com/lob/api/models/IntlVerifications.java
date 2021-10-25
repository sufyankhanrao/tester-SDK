/*
 * LobAPI20200211SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for IntlVerifications type.
 */
public class IntlVerifications {
    private List<Object> addresses;
    private boolean errors;

    /**
     * Default constructor.
     */
    public IntlVerifications() {
    }

    /**
     * Initialization constructor.
     * @param  addresses  List of Object value for addresses.
     * @param  errors  boolean value for errors.
     */
    public IntlVerifications(
            List<Object> addresses,
            boolean errors) {
        this.addresses = addresses;
        this.errors = errors;
    }

    /**
     * Getter for Addresses.
     * @return Returns the List of Object
     */
    @JsonGetter("addresses")
    public List<Object> getAddresses() {
        return addresses;
    }

    /**
     * Setter for Addresses.
     * @param addresses Value for List of Object
     */
    @JsonSetter("addresses")
    public void setAddresses(List<Object> addresses) {
        this.addresses = addresses;
    }

    /**
     * Getter for Errors.
     * Indicates whether any errors occurred during the verification process.
     * @return Returns the boolean
     */
    @JsonGetter("errors")
    public boolean getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * Indicates whether any errors occurred during the verification process.
     * @param errors Value for boolean
     */
    @JsonSetter("errors")
    public void setErrors(boolean errors) {
        this.errors = errors;
    }

    /**
     * Converts this IntlVerifications into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IntlVerifications [" + "addresses=" + addresses + ", errors=" + errors + "]";
    }

    /**
     * Builds a new {@link IntlVerifications.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IntlVerifications.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(addresses, errors);
        return builder;
    }

    /**
     * Class to build instances of {@link IntlVerifications}.
     */
    public static class Builder {
        private List<Object> addresses;
        private boolean errors;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  addresses  List of Object value for addresses.
         * @param  errors  boolean value for errors.
         */
        public Builder(List<Object> addresses, boolean errors) {
            this.addresses = addresses;
            this.errors = errors;
        }

        /**
         * Setter for addresses.
         * @param  addresses  List of Object value for addresses.
         * @return Builder
         */
        public Builder addresses(List<Object> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  boolean value for errors.
         * @return Builder
         */
        public Builder errors(boolean errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link IntlVerifications} object using the set fields.
         * @return {@link IntlVerifications}
         */
        public IntlVerifications build() {
            return new IntlVerifications(addresses, errors);
        }
    }
}
