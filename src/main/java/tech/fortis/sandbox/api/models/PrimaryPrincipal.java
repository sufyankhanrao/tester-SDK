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
 * This is a model class for PrimaryPrincipal type.
 */
public class PrimaryPrincipal {
    private String firstName;
    private String lastName;
    private String middleName;
    private String title;
    private String dateOfBirth;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String ssn;
    private Double ownershipPercent;
    private String phoneNumber;

    /**
     * Default constructor.
     */
    public PrimaryPrincipal() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  middleName  String value for middleName.
     * @param  title  String value for title.
     * @param  dateOfBirth  String value for dateOfBirth.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  city  String value for city.
     * @param  stateProvince  String value for stateProvince.
     * @param  postalCode  String value for postalCode.
     * @param  ssn  String value for ssn.
     * @param  ownershipPercent  Double value for ownershipPercent.
     * @param  phoneNumber  String value for phoneNumber.
     */
    public PrimaryPrincipal(
            String firstName,
            String lastName,
            String middleName,
            String title,
            String dateOfBirth,
            String addressLine1,
            String addressLine2,
            String city,
            String stateProvince,
            String postalCode,
            String ssn,
            Double ownershipPercent,
            String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateProvince = stateProvince;
        this.postalCode = postalCode;
        this.ssn = ssn;
        this.ownershipPercent = ownershipPercent;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for FirstName.
     * Signer's first name
     * @return Returns the String
     */
    @JsonGetter("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * Signer's first name
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * Signer's last name
     * @return Returns the String
     */
    @JsonGetter("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * Signer's last name
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for MiddleName.
     * Signer's middle name
     * @return Returns the String
     */
    @JsonGetter("middle_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Setter for MiddleName.
     * Signer's middle name
     * @param middleName Value for String
     */
    @JsonSetter("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Getter for Title.
     * Signer's title
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * Signer's title
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for DateOfBirth.
     * Signer's date of birth
     * @return Returns the String
     */
    @JsonGetter("date_of_birth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter for DateOfBirth.
     * Signer's date of birth
     * @param dateOfBirth Value for String
     */
    @JsonSetter("date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for AddressLine1.
     * Signer's residential address line 1
     * @return Returns the String
     */
    @JsonGetter("address_line_1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * Signer's residential address line 1
     * @param addressLine1 Value for String
     */
    @JsonSetter("address_line_1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter for AddressLine2.
     * Signer's residential address line 2
     * @return Returns the String
     */
    @JsonGetter("address_line_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter for AddressLine2.
     * Signer's residential address line 2
     * @param addressLine2 Value for String
     */
    @JsonSetter("address_line_2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Getter for City.
     * Signer's city
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * Signer's city
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for StateProvince.
     * Signer's two-digit state code
     * @return Returns the String
     */
    @JsonGetter("state_province")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * Setter for StateProvince.
     * Signer's two-digit state code
     * @param stateProvince Value for String
     */
    @JsonSetter("state_province")
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    /**
     * Getter for PostalCode.
     * Signer's postal code
     * @return Returns the String
     */
    @JsonGetter("postal_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter for PostalCode.
     * Signer's postal code
     * @param postalCode Value for String
     */
    @JsonSetter("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Getter for Ssn.
     * Last four digits of the primary principal or Signer's social security number
     * @return Returns the String
     */
    @JsonGetter("ssn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSsn() {
        return ssn;
    }

    /**
     * Setter for Ssn.
     * Last four digits of the primary principal or Signer's social security number
     * @param ssn Value for String
     */
    @JsonSetter("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * Getter for OwnershipPercent.
     * Percentage of business owned by primary principal or signer
     * @return Returns the Double
     */
    @JsonGetter("ownership_percent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOwnershipPercent() {
        return ownershipPercent;
    }

    /**
     * Setter for OwnershipPercent.
     * Percentage of business owned by primary principal or signer
     * @param ownershipPercent Value for Double
     */
    @JsonSetter("ownership_percent")
    public void setOwnershipPercent(Double ownershipPercent) {
        this.ownershipPercent = ownershipPercent;
    }

    /**
     * Getter for PhoneNumber.
     * Signer's phone number
     * @return Returns the String
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * Signer's phone number
     * @param phoneNumber Value for String
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Converts this PrimaryPrincipal into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrimaryPrincipal [" + "firstName=" + firstName + ", lastName=" + lastName
                + ", middleName=" + middleName + ", title=" + title + ", dateOfBirth=" + dateOfBirth
                + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
                + city + ", stateProvince=" + stateProvince + ", postalCode=" + postalCode
                + ", ssn=" + ssn + ", ownershipPercent=" + ownershipPercent + ", phoneNumber="
                + phoneNumber + "]";
    }

    /**
     * Builds a new {@link PrimaryPrincipal.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrimaryPrincipal.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(firstName, lastName)
                .middleName(getMiddleName())
                .title(getTitle())
                .dateOfBirth(getDateOfBirth())
                .addressLine1(getAddressLine1())
                .addressLine2(getAddressLine2())
                .city(getCity())
                .stateProvince(getStateProvince())
                .postalCode(getPostalCode())
                .ssn(getSsn())
                .ownershipPercent(getOwnershipPercent())
                .phoneNumber(getPhoneNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link PrimaryPrincipal}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String title;
        private String dateOfBirth;
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String stateProvince;
        private String postalCode;
        private String ssn;
        private Double ownershipPercent;
        private String phoneNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  firstName  String value for firstName.
         * @param  lastName  String value for lastName.
         */
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for middleName.
         * @param  middleName  String value for middleName.
         * @return Builder
         */
        public Builder middleName(String middleName) {
            this.middleName = middleName;
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
         * Setter for dateOfBirth.
         * @param  dateOfBirth  String value for dateOfBirth.
         * @return Builder
         */
        public Builder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
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
            this.addressLine2 = addressLine2;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for stateProvince.
         * @param  stateProvince  String value for stateProvince.
         * @return Builder
         */
        public Builder stateProvince(String stateProvince) {
            this.stateProvince = stateProvince;
            return this;
        }

        /**
         * Setter for postalCode.
         * @param  postalCode  String value for postalCode.
         * @return Builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Setter for ssn.
         * @param  ssn  String value for ssn.
         * @return Builder
         */
        public Builder ssn(String ssn) {
            this.ssn = ssn;
            return this;
        }

        /**
         * Setter for ownershipPercent.
         * @param  ownershipPercent  Double value for ownershipPercent.
         * @return Builder
         */
        public Builder ownershipPercent(Double ownershipPercent) {
            this.ownershipPercent = ownershipPercent;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  String value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Builds a new {@link PrimaryPrincipal} object using the set fields.
         * @return {@link PrimaryPrincipal}
         */
        public PrimaryPrincipal build() {
            return new PrimaryPrincipal(firstName, lastName, middleName, title, dateOfBirth,
                    addressLine1, addressLine2, city, stateProvince, postalCode, ssn,
                    ownershipPercent, phoneNumber);
        }
    }
}