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
 * This is a model class for Filter2 type.
 */
public class Filter2 {
    private String locationId;
    private String terminalId;
    private String requireSignature;
    private String deviceTermApiId;
    private String termsConditions;
    private String createdTs;
    private String createdUserId;
    private String id;
    private String modifiedTs;
    private String reasonCodeId;
    private String signature;

    /**
     * Default constructor.
     */
    public Filter2() {
    }

    /**
     * Initialization constructor.
     * @param  locationId  String value for locationId.
     * @param  terminalId  String value for terminalId.
     * @param  requireSignature  String value for requireSignature.
     * @param  deviceTermApiId  String value for deviceTermApiId.
     * @param  termsConditions  String value for termsConditions.
     * @param  createdTs  String value for createdTs.
     * @param  createdUserId  String value for createdUserId.
     * @param  id  String value for id.
     * @param  modifiedTs  String value for modifiedTs.
     * @param  reasonCodeId  String value for reasonCodeId.
     * @param  signature  String value for signature.
     */
    public Filter2(
            String locationId,
            String terminalId,
            String requireSignature,
            String deviceTermApiId,
            String termsConditions,
            String createdTs,
            String createdUserId,
            String id,
            String modifiedTs,
            String reasonCodeId,
            String signature) {
        this.locationId = locationId;
        this.terminalId = terminalId;
        this.requireSignature = requireSignature;
        this.deviceTermApiId = deviceTermApiId;
        this.termsConditions = termsConditions;
        this.createdTs = createdTs;
        this.createdUserId = createdUserId;
        this.id = id;
        this.modifiedTs = modifiedTs;
        this.reasonCodeId = reasonCodeId;
        this.signature = signature;
    }

    /**
     * Getter for LocationId.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationId() {
        return locationId;
    }

    /**
     * Setter for LocationId.
     * @param locationId Value for String
     */
    @JsonSetter("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    /**
     * Getter for TerminalId.
     * @return Returns the String
     */
    @JsonGetter("terminal_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Setter for TerminalId.
     * @param terminalId Value for String
     */
    @JsonSetter("terminal_id")
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * Getter for RequireSignature.
     * @return Returns the String
     */
    @JsonGetter("require_signature")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequireSignature() {
        return requireSignature;
    }

    /**
     * Setter for RequireSignature.
     * @param requireSignature Value for String
     */
    @JsonSetter("require_signature")
    public void setRequireSignature(String requireSignature) {
        this.requireSignature = requireSignature;
    }

    /**
     * Getter for DeviceTermApiId.
     * @return Returns the String
     */
    @JsonGetter("device_term_api_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeviceTermApiId() {
        return deviceTermApiId;
    }

    /**
     * Setter for DeviceTermApiId.
     * @param deviceTermApiId Value for String
     */
    @JsonSetter("device_term_api_id")
    public void setDeviceTermApiId(String deviceTermApiId) {
        this.deviceTermApiId = deviceTermApiId;
    }

    /**
     * Getter for TermsConditions.
     * @return Returns the String
     */
    @JsonGetter("terms_conditions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTermsConditions() {
        return termsConditions;
    }

    /**
     * Setter for TermsConditions.
     * @param termsConditions Value for String
     */
    @JsonSetter("terms_conditions")
    public void setTermsConditions(String termsConditions) {
        this.termsConditions = termsConditions;
    }

    /**
     * Getter for CreatedTs.
     * @return Returns the String
     */
    @JsonGetter("created_ts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedTs() {
        return createdTs;
    }

    /**
     * Setter for CreatedTs.
     * @param createdTs Value for String
     */
    @JsonSetter("created_ts")
    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * Getter for CreatedUserId.
     * @return Returns the String
     */
    @JsonGetter("created_user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * Setter for CreatedUserId.
     * @param createdUserId Value for String
     */
    @JsonSetter("created_user_id")
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for ModifiedTs.
     * @return Returns the String
     */
    @JsonGetter("modified_ts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getModifiedTs() {
        return modifiedTs;
    }

    /**
     * Setter for ModifiedTs.
     * @param modifiedTs Value for String
     */
    @JsonSetter("modified_ts")
    public void setModifiedTs(String modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    /**
     * Getter for ReasonCodeId.
     * @return Returns the String
     */
    @JsonGetter("reason_code_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReasonCodeId() {
        return reasonCodeId;
    }

    /**
     * Setter for ReasonCodeId.
     * @param reasonCodeId Value for String
     */
    @JsonSetter("reason_code_id")
    public void setReasonCodeId(String reasonCodeId) {
        this.reasonCodeId = reasonCodeId;
    }

    /**
     * Getter for Signature.
     * @return Returns the String
     */
    @JsonGetter("signature")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSignature() {
        return signature;
    }

    /**
     * Setter for Signature.
     * @param signature Value for String
     */
    @JsonSetter("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Converts this Filter2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Filter2 [" + "locationId=" + locationId + ", terminalId=" + terminalId
                + ", requireSignature=" + requireSignature + ", deviceTermApiId=" + deviceTermApiId
                + ", termsConditions=" + termsConditions + ", createdTs=" + createdTs
                + ", createdUserId=" + createdUserId + ", id=" + id + ", modifiedTs=" + modifiedTs
                + ", reasonCodeId=" + reasonCodeId + ", signature=" + signature + "]";
    }

    /**
     * Builds a new {@link Filter2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Filter2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .locationId(getLocationId())
                .terminalId(getTerminalId())
                .requireSignature(getRequireSignature())
                .deviceTermApiId(getDeviceTermApiId())
                .termsConditions(getTermsConditions())
                .createdTs(getCreatedTs())
                .createdUserId(getCreatedUserId())
                .id(getId())
                .modifiedTs(getModifiedTs())
                .reasonCodeId(getReasonCodeId())
                .signature(getSignature());
        return builder;
    }

    /**
     * Class to build instances of {@link Filter2}.
     */
    public static class Builder {
        private String locationId;
        private String terminalId;
        private String requireSignature;
        private String deviceTermApiId;
        private String termsConditions;
        private String createdTs;
        private String createdUserId;
        private String id;
        private String modifiedTs;
        private String reasonCodeId;
        private String signature;



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
         * Setter for terminalId.
         * @param  terminalId  String value for terminalId.
         * @return Builder
         */
        public Builder terminalId(String terminalId) {
            this.terminalId = terminalId;
            return this;
        }

        /**
         * Setter for requireSignature.
         * @param  requireSignature  String value for requireSignature.
         * @return Builder
         */
        public Builder requireSignature(String requireSignature) {
            this.requireSignature = requireSignature;
            return this;
        }

        /**
         * Setter for deviceTermApiId.
         * @param  deviceTermApiId  String value for deviceTermApiId.
         * @return Builder
         */
        public Builder deviceTermApiId(String deviceTermApiId) {
            this.deviceTermApiId = deviceTermApiId;
            return this;
        }

        /**
         * Setter for termsConditions.
         * @param  termsConditions  String value for termsConditions.
         * @return Builder
         */
        public Builder termsConditions(String termsConditions) {
            this.termsConditions = termsConditions;
            return this;
        }

        /**
         * Setter for createdTs.
         * @param  createdTs  String value for createdTs.
         * @return Builder
         */
        public Builder createdTs(String createdTs) {
            this.createdTs = createdTs;
            return this;
        }

        /**
         * Setter for createdUserId.
         * @param  createdUserId  String value for createdUserId.
         * @return Builder
         */
        public Builder createdUserId(String createdUserId) {
            this.createdUserId = createdUserId;
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
         * Setter for modifiedTs.
         * @param  modifiedTs  String value for modifiedTs.
         * @return Builder
         */
        public Builder modifiedTs(String modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }

        /**
         * Setter for reasonCodeId.
         * @param  reasonCodeId  String value for reasonCodeId.
         * @return Builder
         */
        public Builder reasonCodeId(String reasonCodeId) {
            this.reasonCodeId = reasonCodeId;
            return this;
        }

        /**
         * Setter for signature.
         * @param  signature  String value for signature.
         * @return Builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Builds a new {@link Filter2} object using the set fields.
         * @return {@link Filter2}
         */
        public Filter2 build() {
            return new Filter2(locationId, terminalId, requireSignature, deviceTermApiId,
                    termsConditions, createdTs, createdUserId, id, modifiedTs, reasonCodeId,
                    signature);
        }
    }
}