/*
 * LobAPI20200211SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.DateTimeHelper;
import com.lob.api.internal.OptionalNullable;
import java.time.LocalDateTime;

/**
 * This is a model class for BankAccount type.
 */
public class BankAccount {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> description;
    private String routingNumber;
    private String accountNumber;
    private AccountTypeEnum accountType;
    private String signatory;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Metadata metadata;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean deleted;
    private String object;
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> signatureUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String bankName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean verified;

    /**
     * Default constructor.
     */
    public BankAccount() {
        verified = false;
    }

    /**
     * Initialization constructor.
     * @param  routingNumber  String value for routingNumber.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountType  AccountTypeEnum value for accountType.
     * @param  signatory  String value for signatory.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  dateModified  LocalDateTime value for dateModified.
     * @param  object  String value for object.
     * @param  id  String value for id.
     * @param  description  String value for description.
     * @param  metadata  Metadata value for metadata.
     * @param  deleted  Boolean value for deleted.
     * @param  signatureUrl  String value for signatureUrl.
     * @param  bankName  String value for bankName.
     * @param  verified  Boolean value for verified.
     */
    public BankAccount(
            String routingNumber,
            String accountNumber,
            AccountTypeEnum accountType,
            String signatory,
            LocalDateTime dateCreated,
            LocalDateTime dateModified,
            String object,
            String id,
            String description,
            Metadata metadata,
            Boolean deleted,
            String signatureUrl,
            String bankName,
            Boolean verified) {
        this.description = OptionalNullable.of(description);
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.signatory = signatory;
        this.metadata = metadata;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.deleted = deleted;
        this.object = object;
        this.id = id;
        this.signatureUrl = OptionalNullable.of(signatureUrl);
        this.bankName = bankName;
        this.verified = verified;
    }

    /**
     * Internal initialization constructor.
     */
    protected BankAccount(String routingNumber, String accountNumber, AccountTypeEnum accountType,
            String signatory, LocalDateTime dateCreated, LocalDateTime dateModified, String object,
            String id, OptionalNullable<String> description, Metadata metadata, Boolean deleted,
            OptionalNullable<String> signatureUrl, String bankName, Boolean verified) {
        this.description = description;
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.signatory = signatory;
        this.metadata = metadata;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.deleted = deleted;
        this.object = object;
        this.id = id;
        this.signatureUrl = signatureUrl;
        this.bankName = bankName;
        this.verified = verified;
    }

    /**
     * Internal Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for RoutingNumber.
     * Must be a [valid US routing number](https://www.frbservices.org/index.html).
     * @return Returns the String
     */
    @JsonGetter("routing_number")
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Setter for RoutingNumber.
     * Must be a [valid US routing number](https://www.frbservices.org/index.html).
     * @param routingNumber Value for String
     */
    @JsonSetter("routing_number")
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    /**
     * Getter for AccountNumber.
     * @return Returns the String
     */
    @JsonGetter("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * @param accountNumber Value for String
     */
    @JsonSetter("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for AccountType.
     * The type of entity that holds the account.
     * @return Returns the AccountTypeEnum
     */
    @JsonGetter("account_type")
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    /**
     * Setter for AccountType.
     * The type of entity that holds the account.
     * @param accountType Value for AccountTypeEnum
     */
    @JsonSetter("account_type")
    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    /**
     * Getter for Signatory.
     * The signatory associated with your account. This name will be printed on checks created with
     * this bank account. If you prefer to use a custom signature image on your checks instead,
     * please create your bank account from the [Dashboard](https://dashboard.lob.com/#/login).
     * @return Returns the String
     */
    @JsonGetter("signatory")
    public String getSignatory() {
        return signatory;
    }

    /**
     * Setter for Signatory.
     * The signatory associated with your account. This name will be printed on checks created with
     * this bank account. If you prefer to use a custom signature image on your checks instead,
     * please create your bank account from the [Dashboard](https://dashboard.lob.com/#/login).
     * @param signatory Value for String
     */
    @JsonSetter("signatory")
    public void setSignatory(String signatory) {
        this.signatory = signatory;
    }

    /**
     * Getter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * Nested objects are not supported. See [Metadata](#section/Metadata) for more information.
     * @return Returns the Metadata
     */
    @JsonGetter("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * Nested objects are not supported. See [Metadata](#section/Metadata) for more information.
     * @param metadata Value for Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_created")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    /**
     * Setter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @param dateCreated Value for LocalDateTime
     */
    @JsonSetter("date_created")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Getter for DateModified.
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_modified")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateModified() {
        return dateModified;
    }

    /**
     * Setter for DateModified.
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     * @param dateModified Value for LocalDateTime
     */
    @JsonSetter("date_modified")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * Getter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @return Returns the Boolean
     */
    @JsonGetter("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Setter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @param deleted Value for Boolean
     */
    @JsonSetter("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Getter for Object.
     * Value is type of resource.
     * @return Returns the String
     */
    @JsonGetter("object")
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * Value is type of resource.
     * @param object Value for String
     */
    @JsonSetter("object")
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Internal Getter for SignatureUrl.
     * @return Returns the Internal String
     */
    @JsonGetter("signature_url")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSignatureUrl() {
        return this.signatureUrl;
    }

    /**
     * Getter for SignatureUrl.
     * @return Returns the String
     */
    public String getSignatureUrl() {
        return OptionalNullable.getFrom(signatureUrl);
    }

    /**
     * Setter for SignatureUrl.
     * @param signatureUrl Value for String
     */
    @JsonSetter("signature_url")
    public void setSignatureUrl(String signatureUrl) {
        this.signatureUrl = OptionalNullable.of(signatureUrl);
    }

    /**
     * UnSetter for SignatureUrl.
     */
    public void unsetSignatureUrl() {
        signatureUrl = null;
    }

    /**
     * Getter for BankName.
     * The name of the bank based on the provided routing number, e.g. `JPMORGAN CHASE BANK`.
     * @return Returns the String
     */
    @JsonGetter("bank_name")
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter for BankName.
     * The name of the bank based on the provided routing number, e.g. `JPMORGAN CHASE BANK`.
     * @param bankName Value for String
     */
    @JsonSetter("bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter for Verified.
     * A bank account must be verified before a check can be created. More info
     * [here](#operation/verify_bank_account).
     * @return Returns the Boolean
     */
    @JsonGetter("verified")
    public Boolean getVerified() {
        return verified;
    }

    /**
     * Setter for Verified.
     * A bank account must be verified before a check can be created. More info
     * [here](#operation/verify_bank_account).
     * @param verified Value for Boolean
     */
    @JsonSetter("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * Converts this BankAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccount [" + "routingNumber=" + routingNumber + ", accountNumber="
                + accountNumber + ", accountType=" + accountType + ", signatory=" + signatory
                + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", object="
                + object + ", id=" + id + ", description=" + description + ", metadata=" + metadata
                + ", deleted=" + deleted + ", signatureUrl=" + signatureUrl + ", bankName="
                + bankName + ", verified=" + verified + "]";
    }

    /**
     * Builds a new {@link BankAccount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(routingNumber, accountNumber, accountType, signatory,
                dateCreated, dateModified, object, id)
                .metadata(getMetadata())
                .deleted(getDeleted())
                .bankName(getBankName())
                .verified(getVerified());
        builder.description = internalGetDescription();
        builder.signatureUrl = internalGetSignatureUrl();
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccount}.
     */
    public static class Builder {
        private String routingNumber;
        private String accountNumber;
        private AccountTypeEnum accountType;
        private String signatory;
        private LocalDateTime dateCreated;
        private LocalDateTime dateModified;
        private String object;
        private String id;
        private OptionalNullable<String> description;
        private Metadata metadata;
        private Boolean deleted;
        private OptionalNullable<String> signatureUrl;
        private String bankName;
        private Boolean verified = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  routingNumber  String value for routingNumber.
         * @param  accountNumber  String value for accountNumber.
         * @param  accountType  AccountTypeEnum value for accountType.
         * @param  signatory  String value for signatory.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @param  dateModified  LocalDateTime value for dateModified.
         * @param  object  String value for object.
         * @param  id  String value for id.
         */
        public Builder(String routingNumber, String accountNumber, AccountTypeEnum accountType,
                String signatory, LocalDateTime dateCreated, LocalDateTime dateModified,
                String object, String id) {
            this.routingNumber = routingNumber;
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.signatory = signatory;
            this.dateCreated = dateCreated;
            this.dateModified = dateModified;
            this.object = object;
            this.id = id;
        }

        /**
         * Setter for routingNumber.
         * @param  routingNumber  String value for routingNumber.
         * @return Builder
         */
        public Builder routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Setter for accountType.
         * @param  accountType  AccountTypeEnum value for accountType.
         * @return Builder
         */
        public Builder accountType(AccountTypeEnum accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * Setter for signatory.
         * @param  signatory  String value for signatory.
         * @return Builder
         */
        public Builder signatory(String signatory) {
            this.signatory = signatory;
            return this;
        }

        /**
         * Setter for dateCreated.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @return Builder
         */
        public Builder dateCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        /**
         * Setter for dateModified.
         * @param  dateModified  LocalDateTime value for dateModified.
         * @return Builder
         */
        public Builder dateModified(LocalDateTime dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        /**
         * Setter for object.
         * @param  object  String value for object.
         * @return Builder
         */
        public Builder object(String object) {
            this.object = object;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Metadata value for metadata.
         * @return Builder
         */
        public Builder metadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for deleted.
         * @param  deleted  Boolean value for deleted.
         * @return Builder
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Setter for signatureUrl.
         * @param  signatureUrl  String value for signatureUrl.
         * @return Builder
         */
        public Builder signatureUrl(String signatureUrl) {
            this.signatureUrl = OptionalNullable.of(signatureUrl);
            return this;
        }

        /**
         * UnSetter for signatureUrl.
         * @return Builder
         */
        public Builder unsetSignatureUrl() {
            signatureUrl = null;
            return this;
        }

        /**
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        /**
         * Setter for verified.
         * @param  verified  Boolean value for verified.
         * @return Builder
         */
        public Builder verified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        /**
         * Builds a new {@link BankAccount} object using the set fields.
         * @return {@link BankAccount}
         */
        public BankAccount build() {
            return new BankAccount(routingNumber, accountNumber, accountType, signatory,
                    dateCreated, dateModified, object, id, description, metadata, deleted,
                    signatureUrl, bankName, verified);
        }
    }
}
