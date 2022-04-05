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
 * This is a model class for Contact type.
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    /**
     * Default constructor.
     */
    public Contact() {
    }

    /**
     * Initialization constructor.
     * @param  phoneNumber  String value for phoneNumber.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  email  String value for email.
     */
    public Contact(
            String phoneNumber,
            String firstName,
            String lastName,
            String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for FirstName.
     * Contact's first name.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * Contact's first name.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * Contact's last name.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * Contact's last name.
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Email.
     * Contact's email address.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Contact's email address.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for PhoneNumber.
     * Contact's phone.
     * @return Returns the String
     */
    @JsonGetter("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * Contact's phone.
     * @param phoneNumber Value for String
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Converts this Contact into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Contact [" + "phoneNumber=" + phoneNumber + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
    }

    /**
     * Builds a new {@link Contact.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Contact.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(phoneNumber)
                .firstName(getFirstName())
                .lastName(getLastName())
                .email(getEmail());
        return builder;
    }

    /**
     * Class to build instances of {@link Contact}.
     */
    public static class Builder {
        private String phoneNumber;
        private String firstName;
        private String lastName;
        private String email;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  phoneNumber  String value for phoneNumber.
         */
        public Builder(String phoneNumber) {
            this.phoneNumber = phoneNumber;
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
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Builds a new {@link Contact} object using the set fields.
         * @return {@link Contact}
         */
        public Contact build() {
            return new Contact(phoneNumber, firstName, lastName, email);
        }
    }
}