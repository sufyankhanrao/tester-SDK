/*
 * LobAPI20200211SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.internal.OptionalNullable;

/**
 * This is a model class for AddressFieldsIntl type.
 */
public class AddressFieldsIntl {
    private String addressLine1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> addressLine2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> addressCity;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> addressState;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> addressZip;

    /**
     * Default constructor.
     */
    public AddressFieldsIntl() {
    }

    /**
     * Initialization constructor.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressCity  String value for addressCity.
     * @param  addressState  String value for addressState.
     * @param  addressZip  String value for addressZip.
     */
    public AddressFieldsIntl(
            String addressLine1,
            String addressLine2,
            String addressCity,
            String addressState,
            String addressZip) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = OptionalNullable.of(addressLine2);
        this.addressCity = OptionalNullable.of(addressCity);
        this.addressState = OptionalNullable.of(addressState);
        this.addressZip = OptionalNullable.of(addressZip);
    }

    /**
     * Internal initialization constructor.
     */
    protected AddressFieldsIntl(String addressLine1, OptionalNullable<String> addressLine2,
            OptionalNullable<String> addressCity, OptionalNullable<String> addressState,
            OptionalNullable<String> addressZip) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZip = addressZip;
    }

    /**
     * Getter for AddressLine1.
     * @return Returns the String
     */
    @JsonGetter("address_line1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * @param addressLine1 Value for String
     */
    @JsonSetter("address_line1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Internal Getter for AddressLine2.
     * @return Returns the Internal String
     */
    @JsonGetter("address_line2")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddressLine2() {
        return this.addressLine2;
    }

    /**
     * Getter for AddressLine2.
     * @return Returns the String
     */
    public String getAddressLine2() {
        return OptionalNullable.getFrom(addressLine2);
    }

    /**
     * Setter for AddressLine2.
     * @param addressLine2 Value for String
     */
    @JsonSetter("address_line2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = OptionalNullable.of(addressLine2);
    }

    /**
     * UnSetter for AddressLine2.
     */
    public void unsetAddressLine2() {
        addressLine2 = null;
    }

    /**
     * Internal Getter for AddressCity.
     * @return Returns the Internal String
     */
    @JsonGetter("address_city")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddressCity() {
        return this.addressCity;
    }

    /**
     * Getter for AddressCity.
     * @return Returns the String
     */
    public String getAddressCity() {
        return OptionalNullable.getFrom(addressCity);
    }

    /**
     * Setter for AddressCity.
     * @param addressCity Value for String
     */
    @JsonSetter("address_city")
    public void setAddressCity(String addressCity) {
        this.addressCity = OptionalNullable.of(addressCity);
    }

    /**
     * UnSetter for AddressCity.
     */
    public void unsetAddressCity() {
        addressCity = null;
    }

    /**
     * Internal Getter for AddressState.
     * @return Returns the Internal String
     */
    @JsonGetter("address_state")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddressState() {
        return this.addressState;
    }

    /**
     * Getter for AddressState.
     * @return Returns the String
     */
    public String getAddressState() {
        return OptionalNullable.getFrom(addressState);
    }

    /**
     * Setter for AddressState.
     * @param addressState Value for String
     */
    @JsonSetter("address_state")
    public void setAddressState(String addressState) {
        this.addressState = OptionalNullable.of(addressState);
    }

    /**
     * UnSetter for AddressState.
     */
    public void unsetAddressState() {
        addressState = null;
    }

    /**
     * Internal Getter for AddressZip.
     * Optional postal code.
     * @return Returns the Internal String
     */
    @JsonGetter("address_zip")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddressZip() {
        return this.addressZip;
    }

    /**
     * Getter for AddressZip.
     * Optional postal code.
     * @return Returns the String
     */
    public String getAddressZip() {
        return OptionalNullable.getFrom(addressZip);
    }

    /**
     * Setter for AddressZip.
     * Optional postal code.
     * @param addressZip Value for String
     */
    @JsonSetter("address_zip")
    public void setAddressZip(String addressZip) {
        this.addressZip = OptionalNullable.of(addressZip);
    }

    /**
     * UnSetter for AddressZip.
     * Optional postal code.
     */
    public void unsetAddressZip() {
        addressZip = null;
    }

    /**
     * Converts this AddressFieldsIntl into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddressFieldsIntl [" + "addressLine1=" + addressLine1 + ", addressLine2="
                + addressLine2 + ", addressCity=" + addressCity + ", addressState=" + addressState
                + ", addressZip=" + addressZip + "]";
    }

    /**
     * Builds a new {@link AddressFieldsIntl.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddressFieldsIntl.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(addressLine1);
        builder.addressLine2 = internalGetAddressLine2();
        builder.addressCity = internalGetAddressCity();
        builder.addressState = internalGetAddressState();
        builder.addressZip = internalGetAddressZip();
        return builder;
    }

    /**
     * Class to build instances of {@link AddressFieldsIntl}.
     */
    public static class Builder {
        private String addressLine1;
        private OptionalNullable<String> addressLine2;
        private OptionalNullable<String> addressCity;
        private OptionalNullable<String> addressState;
        private OptionalNullable<String> addressZip;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  addressLine1  String value for addressLine1.
         */
        public Builder(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        /**
         * Setter for addressLine1.
         * @param  addressLine1  String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        /**
         * Setter for addressLine2.
         * @param  addressLine2  String value for addressLine2.
         * @return Builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = OptionalNullable.of(addressLine2);
            return this;
        }

        /**
         * UnSetter for addressLine2.
         * @return Builder
         */
        public Builder unsetAddressLine2() {
            addressLine2 = null;
            return this;
        }

        /**
         * Setter for addressCity.
         * @param  addressCity  String value for addressCity.
         * @return Builder
         */
        public Builder addressCity(String addressCity) {
            this.addressCity = OptionalNullable.of(addressCity);
            return this;
        }

        /**
         * UnSetter for addressCity.
         * @return Builder
         */
        public Builder unsetAddressCity() {
            addressCity = null;
            return this;
        }

        /**
         * Setter for addressState.
         * @param  addressState  String value for addressState.
         * @return Builder
         */
        public Builder addressState(String addressState) {
            this.addressState = OptionalNullable.of(addressState);
            return this;
        }

        /**
         * UnSetter for addressState.
         * @return Builder
         */
        public Builder unsetAddressState() {
            addressState = null;
            return this;
        }

        /**
         * Setter for addressZip.
         * @param  addressZip  String value for addressZip.
         * @return Builder
         */
        public Builder addressZip(String addressZip) {
            this.addressZip = OptionalNullable.of(addressZip);
            return this;
        }

        /**
         * UnSetter for addressZip.
         * @return Builder
         */
        public Builder unsetAddressZip() {
            addressZip = null;
            return this;
        }

        /**
         * Builds a new {@link AddressFieldsIntl} object using the set fields.
         * @return {@link AddressFieldsIntl}
         */
        public AddressFieldsIntl build() {
            return new AddressFieldsIntl(addressLine1, addressLine2, addressCity, addressState,
                    addressZip);
        }
    }
}
