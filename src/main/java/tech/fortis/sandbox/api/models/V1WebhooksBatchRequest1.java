/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import tech.fortis.sandbox.api.internal.OptionalNullable;

/**
 * This is a model class for V1WebhooksBatchRequest1 type.
 */
public class V1WebhooksBatchRequest1 {
    private Integer attemptInterval;
    private OptionalNullable<String> basicAuthUsername;
    private OptionalNullable<String> basicAuthPassword;
    private OptionalNullable<String> expands;
    private FormatEnum format;
    private Boolean isActive;
    private String locationId;
    private String locationApiId;
    private OnCreateEnum onCreate;
    private OnUpdateEnum onUpdate;
    private OnDeleteEnum onDelete;
    private String postbackConfigId;
    private String productTransactionId;
    private Resource2Enum resource;
    private Integer numberOfAttempts;
    private String url;

    /**
     * Default constructor.
     */
    public V1WebhooksBatchRequest1() {
        attemptInterval = 300;
    }

    /**
     * Initialization constructor.
     * @param  attemptInterval  Integer value for attemptInterval.
     * @param  basicAuthUsername  String value for basicAuthUsername.
     * @param  basicAuthPassword  String value for basicAuthPassword.
     * @param  expands  String value for expands.
     * @param  format  FormatEnum value for format.
     * @param  isActive  Boolean value for isActive.
     * @param  locationId  String value for locationId.
     * @param  locationApiId  String value for locationApiId.
     * @param  onCreate  OnCreateEnum value for onCreate.
     * @param  onUpdate  OnUpdateEnum value for onUpdate.
     * @param  onDelete  OnDeleteEnum value for onDelete.
     * @param  postbackConfigId  String value for postbackConfigId.
     * @param  productTransactionId  String value for productTransactionId.
     * @param  resource  Resource2Enum value for resource.
     * @param  numberOfAttempts  Integer value for numberOfAttempts.
     * @param  url  String value for url.
     */
    public V1WebhooksBatchRequest1(
            Integer attemptInterval,
            String basicAuthUsername,
            String basicAuthPassword,
            String expands,
            FormatEnum format,
            Boolean isActive,
            String locationId,
            String locationApiId,
            OnCreateEnum onCreate,
            OnUpdateEnum onUpdate,
            OnDeleteEnum onDelete,
            String postbackConfigId,
            String productTransactionId,
            Resource2Enum resource,
            Integer numberOfAttempts,
            String url) {
        this.attemptInterval = attemptInterval;
        this.basicAuthUsername = OptionalNullable.of(basicAuthUsername);
        this.basicAuthPassword = OptionalNullable.of(basicAuthPassword);
        this.expands = OptionalNullable.of(expands);
        this.format = format;
        this.isActive = isActive;
        this.locationId = locationId;
        this.locationApiId = locationApiId;
        this.onCreate = onCreate;
        this.onUpdate = onUpdate;
        this.onDelete = onDelete;
        this.postbackConfigId = postbackConfigId;
        this.productTransactionId = productTransactionId;
        this.resource = resource;
        this.numberOfAttempts = numberOfAttempts;
        this.url = url;
    }

    /**
     * Internal initialization constructor.
     */
    protected V1WebhooksBatchRequest1(Integer attemptInterval,
            OptionalNullable<String> basicAuthUsername, OptionalNullable<String> basicAuthPassword,
            OptionalNullable<String> expands, FormatEnum format, Boolean isActive,
            String locationId, String locationApiId, OnCreateEnum onCreate, OnUpdateEnum onUpdate,
            OnDeleteEnum onDelete, String postbackConfigId, String productTransactionId,
            Resource2Enum resource, Integer numberOfAttempts, String url) {
        this.attemptInterval = attemptInterval;
        this.basicAuthUsername = basicAuthUsername;
        this.basicAuthPassword = basicAuthPassword;
        this.expands = expands;
        this.format = format;
        this.isActive = isActive;
        this.locationId = locationId;
        this.locationApiId = locationApiId;
        this.onCreate = onCreate;
        this.onUpdate = onUpdate;
        this.onDelete = onDelete;
        this.postbackConfigId = postbackConfigId;
        this.productTransactionId = productTransactionId;
        this.resource = resource;
        this.numberOfAttempts = numberOfAttempts;
        this.url = url;
    }

    /**
     * Getter for AttemptInterval.
     * Number of seconds before another retry is submitted
     * @return Returns the Integer
     */
    @JsonGetter("attempt_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAttemptInterval() {
        return attemptInterval;
    }

    /**
     * Setter for AttemptInterval.
     * Number of seconds before another retry is submitted
     * @param attemptInterval Value for Integer
     */
    @JsonSetter("attempt_interval")
    public void setAttemptInterval(Integer attemptInterval) {
        this.attemptInterval = attemptInterval;
    }

    /**
     * Internal Getter for BasicAuthUsername.
     * The Basic authorization username for the URL, if not supplied, the postback will be submitted
     * without Basic authorization headers
     * @return Returns the Internal String
     */
    @JsonGetter("basic_auth_username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBasicAuthUsername() {
        return this.basicAuthUsername;
    }

    /**
     * Getter for BasicAuthUsername.
     * The Basic authorization username for the URL, if not supplied, the postback will be submitted
     * without Basic authorization headers
     * @return Returns the String
     */
    public String getBasicAuthUsername() {
        return OptionalNullable.getFrom(basicAuthUsername);
    }

    /**
     * Setter for BasicAuthUsername.
     * The Basic authorization username for the URL, if not supplied, the postback will be submitted
     * without Basic authorization headers
     * @param basicAuthUsername Value for String
     */
    @JsonSetter("basic_auth_username")
    public void setBasicAuthUsername(String basicAuthUsername) {
        this.basicAuthUsername = OptionalNullable.of(basicAuthUsername);
    }

    /**
     * UnSetter for BasicAuthUsername.
     * The Basic authorization username for the URL, if not supplied, the postback will be submitted
     * without Basic authorization headers
     */
    public void unsetBasicAuthUsername() {
        basicAuthUsername = null;
    }

    /**
     * Internal Getter for BasicAuthPassword.
     * The basic authorization password
     * @return Returns the Internal String
     */
    @JsonGetter("basic_auth_password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBasicAuthPassword() {
        return this.basicAuthPassword;
    }

    /**
     * Getter for BasicAuthPassword.
     * The basic authorization password
     * @return Returns the String
     */
    public String getBasicAuthPassword() {
        return OptionalNullable.getFrom(basicAuthPassword);
    }

    /**
     * Setter for BasicAuthPassword.
     * The basic authorization password
     * @param basicAuthPassword Value for String
     */
    @JsonSetter("basic_auth_password")
    public void setBasicAuthPassword(String basicAuthPassword) {
        this.basicAuthPassword = OptionalNullable.of(basicAuthPassword);
    }

    /**
     * UnSetter for BasicAuthPassword.
     * The basic authorization password
     */
    public void unsetBasicAuthPassword() {
        basicAuthPassword = null;
    }

    /**
     * Internal Getter for Expands.
     * An option list of expanded data to send with base data. (i.e. set this field to
     * “contact,account_vault” to get the contact an accountvault used to run a transaction.)
     * @return Returns the Internal String
     */
    @JsonGetter("expands")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpands() {
        return this.expands;
    }

    /**
     * Getter for Expands.
     * An option list of expanded data to send with base data. (i.e. set this field to
     * “contact,account_vault” to get the contact an accountvault used to run a transaction.)
     * @return Returns the String
     */
    public String getExpands() {
        return OptionalNullable.getFrom(expands);
    }

    /**
     * Setter for Expands.
     * An option list of expanded data to send with base data. (i.e. set this field to
     * “contact,account_vault” to get the contact an accountvault used to run a transaction.)
     * @param expands Value for String
     */
    @JsonSetter("expands")
    public void setExpands(String expands) {
        this.expands = OptionalNullable.of(expands);
    }

    /**
     * UnSetter for Expands.
     * An option list of expanded data to send with base data. (i.e. set this field to
     * “contact,account_vault” to get the contact an accountvault used to run a transaction.)
     */
    public void unsetExpands() {
        expands = null;
    }

    /**
     * Getter for Format.
     * Options include: api-default
     * @return Returns the FormatEnum
     */
    @JsonGetter("format")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FormatEnum getFormat() {
        return format;
    }

    /**
     * Setter for Format.
     * Options include: api-default
     * @param format Value for FormatEnum
     */
    @JsonSetter("format")
    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    /**
     * Getter for IsActive.
     * Flag to indicate whether configuration is active (in effect).
     * @return Returns the Boolean
     */
    @JsonGetter("is_active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Setter for IsActive.
     * Flag to indicate whether configuration is active (in effect).
     * @param isActive Value for Boolean
     */
    @JsonSetter("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * Getter for LocationId.
     * The location identifier of the resource you want to recieve postbacks from.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationId() {
        return locationId;
    }

    /**
     * Setter for LocationId.
     * The location identifier of the resource you want to recieve postbacks from.
     * @param locationId Value for String
     */
    @JsonSetter("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    /**
     * Getter for LocationApiId.
     * Location Api ID
     * @return Returns the String
     */
    @JsonGetter("location_api_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationApiId() {
        return locationApiId;
    }

    /**
     * Setter for LocationApiId.
     * Location Api ID
     * @param locationApiId Value for String
     */
    @JsonSetter("location_api_id")
    public void setLocationApiId(String locationApiId) {
        this.locationApiId = locationApiId;
    }

    /**
     * Getter for OnCreate.
     * To receive postbacks on the creation of a resource
     * @return Returns the OnCreateEnum
     */
    @JsonGetter("on_create")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnCreateEnum getOnCreate() {
        return onCreate;
    }

    /**
     * Setter for OnCreate.
     * To receive postbacks on the creation of a resource
     * @param onCreate Value for OnCreateEnum
     */
    @JsonSetter("on_create")
    public void setOnCreate(OnCreateEnum onCreate) {
        this.onCreate = onCreate;
    }

    /**
     * Getter for OnUpdate.
     * To receive postbacks on the updating of a resource
     * @return Returns the OnUpdateEnum
     */
    @JsonGetter("on_update")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnUpdateEnum getOnUpdate() {
        return onUpdate;
    }

    /**
     * Setter for OnUpdate.
     * To receive postbacks on the updating of a resource
     * @param onUpdate Value for OnUpdateEnum
     */
    @JsonSetter("on_update")
    public void setOnUpdate(OnUpdateEnum onUpdate) {
        this.onUpdate = onUpdate;
    }

    /**
     * Getter for OnDelete.
     * To receive postbacks when the record is deleted
     * @return Returns the OnDeleteEnum
     */
    @JsonGetter("on_delete")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnDeleteEnum getOnDelete() {
        return onDelete;
    }

    /**
     * Setter for OnDelete.
     * To receive postbacks when the record is deleted
     * @param onDelete Value for OnDeleteEnum
     */
    @JsonSetter("on_delete")
    public void setOnDelete(OnDeleteEnum onDelete) {
        this.onDelete = onDelete;
    }

    /**
     * Getter for PostbackConfigId.
     * Postback Config ID
     * @return Returns the String
     */
    @JsonGetter("postback_config_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostbackConfigId() {
        return postbackConfigId;
    }

    /**
     * Setter for PostbackConfigId.
     * Postback Config ID
     * @param postbackConfigId Value for String
     */
    @JsonSetter("postback_config_id")
    public void setPostbackConfigId(String postbackConfigId) {
        this.postbackConfigId = postbackConfigId;
    }

    /**
     * Getter for ProductTransactionId.
     * Required when using 'transaction' or 'transactionbatch' resource
     * @return Returns the String
     */
    @JsonGetter("product_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductTransactionId() {
        return productTransactionId;
    }

    /**
     * Setter for ProductTransactionId.
     * Required when using 'transaction' or 'transactionbatch' resource
     * @param productTransactionId Value for String
     */
    @JsonSetter("product_transaction_id")
    public void setProductTransactionId(String productTransactionId) {
        this.productTransactionId = productTransactionId;
    }

    /**
     * Getter for Resource.
     * The resource you want to subscribe the postbacks to.
     * @return Returns the Resource2Enum
     */
    @JsonGetter("resource")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Resource2Enum getResource() {
        return resource;
    }

    /**
     * Setter for Resource.
     * The resource you want to subscribe the postbacks to.
     * @param resource Value for Resource2Enum
     */
    @JsonSetter("resource")
    public void setResource(Resource2Enum resource) {
        this.resource = resource;
    }

    /**
     * Getter for NumberOfAttempts.
     * Maximum number of attempts on failure
     * @return Returns the Integer
     */
    @JsonGetter("number_of_attempts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberOfAttempts() {
        return numberOfAttempts;
    }

    /**
     * Setter for NumberOfAttempts.
     * Maximum number of attempts on failure
     * @param numberOfAttempts Value for Integer
     */
    @JsonSetter("number_of_attempts")
    public void setNumberOfAttempts(Integer numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    /**
     * Getter for Url.
     * The URL where the postback will be submitted
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The URL where the postback will be submitted
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this V1WebhooksBatchRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V1WebhooksBatchRequest1 [" + "attemptInterval=" + attemptInterval
                + ", basicAuthUsername=" + basicAuthUsername + ", basicAuthPassword="
                + basicAuthPassword + ", expands=" + expands + ", format=" + format + ", isActive="
                + isActive + ", locationId=" + locationId + ", locationApiId=" + locationApiId
                + ", onCreate=" + onCreate + ", onUpdate=" + onUpdate + ", onDelete=" + onDelete
                + ", postbackConfigId=" + postbackConfigId + ", productTransactionId="
                + productTransactionId + ", resource=" + resource + ", numberOfAttempts="
                + numberOfAttempts + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link V1WebhooksBatchRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1WebhooksBatchRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .attemptInterval(getAttemptInterval())
                .format(getFormat())
                .isActive(getIsActive())
                .locationId(getLocationId())
                .locationApiId(getLocationApiId())
                .onCreate(getOnCreate())
                .onUpdate(getOnUpdate())
                .onDelete(getOnDelete())
                .postbackConfigId(getPostbackConfigId())
                .productTransactionId(getProductTransactionId())
                .resource(getResource())
                .numberOfAttempts(getNumberOfAttempts())
                .url(getUrl());
        builder.basicAuthUsername = internalGetBasicAuthUsername();
        builder.basicAuthPassword = internalGetBasicAuthPassword();
        builder.expands = internalGetExpands();
        return builder;
    }

    /**
     * Class to build instances of {@link V1WebhooksBatchRequest1}.
     */
    public static class Builder {
        private Integer attemptInterval = 300;
        private OptionalNullable<String> basicAuthUsername;
        private OptionalNullable<String> basicAuthPassword;
        private OptionalNullable<String> expands;
        private FormatEnum format;
        private Boolean isActive;
        private String locationId;
        private String locationApiId;
        private OnCreateEnum onCreate;
        private OnUpdateEnum onUpdate;
        private OnDeleteEnum onDelete;
        private String postbackConfigId;
        private String productTransactionId;
        private Resource2Enum resource;
        private Integer numberOfAttempts;
        private String url;



        /**
         * Setter for attemptInterval.
         * @param  attemptInterval  Integer value for attemptInterval.
         * @return Builder
         */
        public Builder attemptInterval(Integer attemptInterval) {
            this.attemptInterval = attemptInterval;
            return this;
        }

        /**
         * Setter for basicAuthUsername.
         * @param  basicAuthUsername  String value for basicAuthUsername.
         * @return Builder
         */
        public Builder basicAuthUsername(String basicAuthUsername) {
            this.basicAuthUsername = OptionalNullable.of(basicAuthUsername);
            return this;
        }

        /**
         * UnSetter for basicAuthUsername.
         * @return Builder
         */
        public Builder unsetBasicAuthUsername() {
            basicAuthUsername = null;
            return this;
        }

        /**
         * Setter for basicAuthPassword.
         * @param  basicAuthPassword  String value for basicAuthPassword.
         * @return Builder
         */
        public Builder basicAuthPassword(String basicAuthPassword) {
            this.basicAuthPassword = OptionalNullable.of(basicAuthPassword);
            return this;
        }

        /**
         * UnSetter for basicAuthPassword.
         * @return Builder
         */
        public Builder unsetBasicAuthPassword() {
            basicAuthPassword = null;
            return this;
        }

        /**
         * Setter for expands.
         * @param  expands  String value for expands.
         * @return Builder
         */
        public Builder expands(String expands) {
            this.expands = OptionalNullable.of(expands);
            return this;
        }

        /**
         * UnSetter for expands.
         * @return Builder
         */
        public Builder unsetExpands() {
            expands = null;
            return this;
        }

        /**
         * Setter for format.
         * @param  format  FormatEnum value for format.
         * @return Builder
         */
        public Builder format(FormatEnum format) {
            this.format = format;
            return this;
        }

        /**
         * Setter for isActive.
         * @param  isActive  Boolean value for isActive.
         * @return Builder
         */
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
         * Setter for locationId.
         * @param  locationId  String value for locationId.
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        /**
         * Setter for locationApiId.
         * @param  locationApiId  String value for locationApiId.
         * @return Builder
         */
        public Builder locationApiId(String locationApiId) {
            this.locationApiId = locationApiId;
            return this;
        }

        /**
         * Setter for onCreate.
         * @param  onCreate  OnCreateEnum value for onCreate.
         * @return Builder
         */
        public Builder onCreate(OnCreateEnum onCreate) {
            this.onCreate = onCreate;
            return this;
        }

        /**
         * Setter for onUpdate.
         * @param  onUpdate  OnUpdateEnum value for onUpdate.
         * @return Builder
         */
        public Builder onUpdate(OnUpdateEnum onUpdate) {
            this.onUpdate = onUpdate;
            return this;
        }

        /**
         * Setter for onDelete.
         * @param  onDelete  OnDeleteEnum value for onDelete.
         * @return Builder
         */
        public Builder onDelete(OnDeleteEnum onDelete) {
            this.onDelete = onDelete;
            return this;
        }

        /**
         * Setter for postbackConfigId.
         * @param  postbackConfigId  String value for postbackConfigId.
         * @return Builder
         */
        public Builder postbackConfigId(String postbackConfigId) {
            this.postbackConfigId = postbackConfigId;
            return this;
        }

        /**
         * Setter for productTransactionId.
         * @param  productTransactionId  String value for productTransactionId.
         * @return Builder
         */
        public Builder productTransactionId(String productTransactionId) {
            this.productTransactionId = productTransactionId;
            return this;
        }

        /**
         * Setter for resource.
         * @param  resource  Resource2Enum value for resource.
         * @return Builder
         */
        public Builder resource(Resource2Enum resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Setter for numberOfAttempts.
         * @param  numberOfAttempts  Integer value for numberOfAttempts.
         * @return Builder
         */
        public Builder numberOfAttempts(Integer numberOfAttempts) {
            this.numberOfAttempts = numberOfAttempts;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link V1WebhooksBatchRequest1} object using the set fields.
         * @return {@link V1WebhooksBatchRequest1}
         */
        public V1WebhooksBatchRequest1 build() {
            return new V1WebhooksBatchRequest1(attemptInterval, basicAuthUsername,
                    basicAuthPassword, expands, format, isActive, locationId, locationApiId,
                    onCreate, onUpdate, onDelete, postbackConfigId, productTransactionId, resource,
                    numberOfAttempts, url);
        }
    }
}
