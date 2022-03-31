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
 * This is a model class for Filter6 type.
 */
public class Filter6 {
    private String accountVaultId;
    private String active;
    private String description;
    private String endDate;
    private String installmentTotalCount;
    private String interval;
    private String intervalType;
    private String locationId;
    private String notificationDays;
    private String paymentMethod;
    private String productTransactionId;
    private String recurringId;
    private String recurringApiId;
    private String startDate;
    private String status;
    private String transactionAmount;
    private String termsAgree;
    private String termsAgreeIp;
    private String recurringC1;
    private String recurringC2;
    private String recurringC3;
    private String sendToProcAsRecur;
    private String id;
    private String nextRunDate;
    private String createdTs;
    private String modifiedTs;
    private String recurringTypeId;

    /**
     * Default constructor.
     */
    public Filter6() {
    }

    /**
     * Initialization constructor.
     * @param  accountVaultId  String value for accountVaultId.
     * @param  active  String value for active.
     * @param  description  String value for description.
     * @param  endDate  String value for endDate.
     * @param  installmentTotalCount  String value for installmentTotalCount.
     * @param  interval  String value for interval.
     * @param  intervalType  String value for intervalType.
     * @param  locationId  String value for locationId.
     * @param  notificationDays  String value for notificationDays.
     * @param  paymentMethod  String value for paymentMethod.
     * @param  productTransactionId  String value for productTransactionId.
     * @param  recurringId  String value for recurringId.
     * @param  recurringApiId  String value for recurringApiId.
     * @param  startDate  String value for startDate.
     * @param  status  String value for status.
     * @param  transactionAmount  String value for transactionAmount.
     * @param  termsAgree  String value for termsAgree.
     * @param  termsAgreeIp  String value for termsAgreeIp.
     * @param  recurringC1  String value for recurringC1.
     * @param  recurringC2  String value for recurringC2.
     * @param  recurringC3  String value for recurringC3.
     * @param  sendToProcAsRecur  String value for sendToProcAsRecur.
     * @param  id  String value for id.
     * @param  nextRunDate  String value for nextRunDate.
     * @param  createdTs  String value for createdTs.
     * @param  modifiedTs  String value for modifiedTs.
     * @param  recurringTypeId  String value for recurringTypeId.
     */
    public Filter6(
            String accountVaultId,
            String active,
            String description,
            String endDate,
            String installmentTotalCount,
            String interval,
            String intervalType,
            String locationId,
            String notificationDays,
            String paymentMethod,
            String productTransactionId,
            String recurringId,
            String recurringApiId,
            String startDate,
            String status,
            String transactionAmount,
            String termsAgree,
            String termsAgreeIp,
            String recurringC1,
            String recurringC2,
            String recurringC3,
            String sendToProcAsRecur,
            String id,
            String nextRunDate,
            String createdTs,
            String modifiedTs,
            String recurringTypeId) {
        this.accountVaultId = accountVaultId;
        this.active = active;
        this.description = description;
        this.endDate = endDate;
        this.installmentTotalCount = installmentTotalCount;
        this.interval = interval;
        this.intervalType = intervalType;
        this.locationId = locationId;
        this.notificationDays = notificationDays;
        this.paymentMethod = paymentMethod;
        this.productTransactionId = productTransactionId;
        this.recurringId = recurringId;
        this.recurringApiId = recurringApiId;
        this.startDate = startDate;
        this.status = status;
        this.transactionAmount = transactionAmount;
        this.termsAgree = termsAgree;
        this.termsAgreeIp = termsAgreeIp;
        this.recurringC1 = recurringC1;
        this.recurringC2 = recurringC2;
        this.recurringC3 = recurringC3;
        this.sendToProcAsRecur = sendToProcAsRecur;
        this.id = id;
        this.nextRunDate = nextRunDate;
        this.createdTs = createdTs;
        this.modifiedTs = modifiedTs;
        this.recurringTypeId = recurringTypeId;
    }

    /**
     * Getter for AccountVaultId.
     * @return Returns the String
     */
    @JsonGetter("account_vault_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountVaultId() {
        return accountVaultId;
    }

    /**
     * Setter for AccountVaultId.
     * @param accountVaultId Value for String
     */
    @JsonSetter("account_vault_id")
    public void setAccountVaultId(String accountVaultId) {
        this.accountVaultId = accountVaultId;
    }

    /**
     * Getter for Active.
     * @return Returns the String
     */
    @JsonGetter("active")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * @param active Value for String
     */
    @JsonSetter("active")
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for EndDate.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for InstallmentTotalCount.
     * @return Returns the String
     */
    @JsonGetter("installment_total_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInstallmentTotalCount() {
        return installmentTotalCount;
    }

    /**
     * Setter for InstallmentTotalCount.
     * @param installmentTotalCount Value for String
     */
    @JsonSetter("installment_total_count")
    public void setInstallmentTotalCount(String installmentTotalCount) {
        this.installmentTotalCount = installmentTotalCount;
    }

    /**
     * Getter for Interval.
     * @return Returns the String
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * @param interval Value for String
     */
    @JsonSetter("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalType.
     * @return Returns the String
     */
    @JsonGetter("interval_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIntervalType() {
        return intervalType;
    }

    /**
     * Setter for IntervalType.
     * @param intervalType Value for String
     */
    @JsonSetter("interval_type")
    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
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
     * Getter for NotificationDays.
     * @return Returns the String
     */
    @JsonGetter("notification_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNotificationDays() {
        return notificationDays;
    }

    /**
     * Setter for NotificationDays.
     * @param notificationDays Value for String
     */
    @JsonSetter("notification_days")
    public void setNotificationDays(String notificationDays) {
        this.notificationDays = notificationDays;
    }

    /**
     * Getter for PaymentMethod.
     * @return Returns the String
     */
    @JsonGetter("payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * @param paymentMethod Value for String
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for ProductTransactionId.
     * @return Returns the String
     */
    @JsonGetter("product_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductTransactionId() {
        return productTransactionId;
    }

    /**
     * Setter for ProductTransactionId.
     * @param productTransactionId Value for String
     */
    @JsonSetter("product_transaction_id")
    public void setProductTransactionId(String productTransactionId) {
        this.productTransactionId = productTransactionId;
    }

    /**
     * Getter for RecurringId.
     * @return Returns the String
     */
    @JsonGetter("recurring_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringId() {
        return recurringId;
    }

    /**
     * Setter for RecurringId.
     * @param recurringId Value for String
     */
    @JsonSetter("recurring_id")
    public void setRecurringId(String recurringId) {
        this.recurringId = recurringId;
    }

    /**
     * Getter for RecurringApiId.
     * @return Returns the String
     */
    @JsonGetter("recurring_api_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringApiId() {
        return recurringApiId;
    }

    /**
     * Setter for RecurringApiId.
     * @param recurringApiId Value for String
     */
    @JsonSetter("recurring_api_id")
    public void setRecurringApiId(String recurringApiId) {
        this.recurringApiId = recurringApiId;
    }

    /**
     * Getter for StartDate.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for TransactionAmount.
     * @return Returns the String
     */
    @JsonGetter("transaction_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter for TransactionAmount.
     * @param transactionAmount Value for String
     */
    @JsonSetter("transaction_amount")
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * Getter for TermsAgree.
     * @return Returns the String
     */
    @JsonGetter("terms_agree")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTermsAgree() {
        return termsAgree;
    }

    /**
     * Setter for TermsAgree.
     * @param termsAgree Value for String
     */
    @JsonSetter("terms_agree")
    public void setTermsAgree(String termsAgree) {
        this.termsAgree = termsAgree;
    }

    /**
     * Getter for TermsAgreeIp.
     * @return Returns the String
     */
    @JsonGetter("terms_agree_ip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTermsAgreeIp() {
        return termsAgreeIp;
    }

    /**
     * Setter for TermsAgreeIp.
     * @param termsAgreeIp Value for String
     */
    @JsonSetter("terms_agree_ip")
    public void setTermsAgreeIp(String termsAgreeIp) {
        this.termsAgreeIp = termsAgreeIp;
    }

    /**
     * Getter for RecurringC1.
     * @return Returns the String
     */
    @JsonGetter("recurring_c1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringC1() {
        return recurringC1;
    }

    /**
     * Setter for RecurringC1.
     * @param recurringC1 Value for String
     */
    @JsonSetter("recurring_c1")
    public void setRecurringC1(String recurringC1) {
        this.recurringC1 = recurringC1;
    }

    /**
     * Getter for RecurringC2.
     * @return Returns the String
     */
    @JsonGetter("recurring_c2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringC2() {
        return recurringC2;
    }

    /**
     * Setter for RecurringC2.
     * @param recurringC2 Value for String
     */
    @JsonSetter("recurring_c2")
    public void setRecurringC2(String recurringC2) {
        this.recurringC2 = recurringC2;
    }

    /**
     * Getter for RecurringC3.
     * @return Returns the String
     */
    @JsonGetter("recurring_c3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringC3() {
        return recurringC3;
    }

    /**
     * Setter for RecurringC3.
     * @param recurringC3 Value for String
     */
    @JsonSetter("recurring_c3")
    public void setRecurringC3(String recurringC3) {
        this.recurringC3 = recurringC3;
    }

    /**
     * Getter for SendToProcAsRecur.
     * @return Returns the String
     */
    @JsonGetter("send_to_proc_as_recur")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSendToProcAsRecur() {
        return sendToProcAsRecur;
    }

    /**
     * Setter for SendToProcAsRecur.
     * @param sendToProcAsRecur Value for String
     */
    @JsonSetter("send_to_proc_as_recur")
    public void setSendToProcAsRecur(String sendToProcAsRecur) {
        this.sendToProcAsRecur = sendToProcAsRecur;
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
     * Getter for NextRunDate.
     * @return Returns the String
     */
    @JsonGetter("next_run_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextRunDate() {
        return nextRunDate;
    }

    /**
     * Setter for NextRunDate.
     * @param nextRunDate Value for String
     */
    @JsonSetter("next_run_date")
    public void setNextRunDate(String nextRunDate) {
        this.nextRunDate = nextRunDate;
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
     * Getter for RecurringTypeId.
     * @return Returns the String
     */
    @JsonGetter("recurring_type_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringTypeId() {
        return recurringTypeId;
    }

    /**
     * Setter for RecurringTypeId.
     * @param recurringTypeId Value for String
     */
    @JsonSetter("recurring_type_id")
    public void setRecurringTypeId(String recurringTypeId) {
        this.recurringTypeId = recurringTypeId;
    }

    /**
     * Converts this Filter6 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Filter6 [" + "accountVaultId=" + accountVaultId + ", active=" + active
                + ", description=" + description + ", endDate=" + endDate
                + ", installmentTotalCount=" + installmentTotalCount + ", interval=" + interval
                + ", intervalType=" + intervalType + ", locationId=" + locationId
                + ", notificationDays=" + notificationDays + ", paymentMethod=" + paymentMethod
                + ", productTransactionId=" + productTransactionId + ", recurringId=" + recurringId
                + ", recurringApiId=" + recurringApiId + ", startDate=" + startDate + ", status="
                + status + ", transactionAmount=" + transactionAmount + ", termsAgree=" + termsAgree
                + ", termsAgreeIp=" + termsAgreeIp + ", recurringC1=" + recurringC1
                + ", recurringC2=" + recurringC2 + ", recurringC3=" + recurringC3
                + ", sendToProcAsRecur=" + sendToProcAsRecur + ", id=" + id + ", nextRunDate="
                + nextRunDate + ", createdTs=" + createdTs + ", modifiedTs=" + modifiedTs
                + ", recurringTypeId=" + recurringTypeId + "]";
    }

    /**
     * Builds a new {@link Filter6.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Filter6.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountVaultId(getAccountVaultId())
                .active(getActive())
                .description(getDescription())
                .endDate(getEndDate())
                .installmentTotalCount(getInstallmentTotalCount())
                .interval(getInterval())
                .intervalType(getIntervalType())
                .locationId(getLocationId())
                .notificationDays(getNotificationDays())
                .paymentMethod(getPaymentMethod())
                .productTransactionId(getProductTransactionId())
                .recurringId(getRecurringId())
                .recurringApiId(getRecurringApiId())
                .startDate(getStartDate())
                .status(getStatus())
                .transactionAmount(getTransactionAmount())
                .termsAgree(getTermsAgree())
                .termsAgreeIp(getTermsAgreeIp())
                .recurringC1(getRecurringC1())
                .recurringC2(getRecurringC2())
                .recurringC3(getRecurringC3())
                .sendToProcAsRecur(getSendToProcAsRecur())
                .id(getId())
                .nextRunDate(getNextRunDate())
                .createdTs(getCreatedTs())
                .modifiedTs(getModifiedTs())
                .recurringTypeId(getRecurringTypeId());
        return builder;
    }

    /**
     * Class to build instances of {@link Filter6}.
     */
    public static class Builder {
        private String accountVaultId;
        private String active;
        private String description;
        private String endDate;
        private String installmentTotalCount;
        private String interval;
        private String intervalType;
        private String locationId;
        private String notificationDays;
        private String paymentMethod;
        private String productTransactionId;
        private String recurringId;
        private String recurringApiId;
        private String startDate;
        private String status;
        private String transactionAmount;
        private String termsAgree;
        private String termsAgreeIp;
        private String recurringC1;
        private String recurringC2;
        private String recurringC3;
        private String sendToProcAsRecur;
        private String id;
        private String nextRunDate;
        private String createdTs;
        private String modifiedTs;
        private String recurringTypeId;



        /**
         * Setter for accountVaultId.
         * @param  accountVaultId  String value for accountVaultId.
         * @return Builder
         */
        public Builder accountVaultId(String accountVaultId) {
            this.accountVaultId = accountVaultId;
            return this;
        }

        /**
         * Setter for active.
         * @param  active  String value for active.
         * @return Builder
         */
        public Builder active(String active) {
            this.active = active;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  String value for endDate.
         * @return Builder
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for installmentTotalCount.
         * @param  installmentTotalCount  String value for installmentTotalCount.
         * @return Builder
         */
        public Builder installmentTotalCount(String installmentTotalCount) {
            this.installmentTotalCount = installmentTotalCount;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  String value for interval.
         * @return Builder
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalType.
         * @param  intervalType  String value for intervalType.
         * @return Builder
         */
        public Builder intervalType(String intervalType) {
            this.intervalType = intervalType;
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
         * Setter for notificationDays.
         * @param  notificationDays  String value for notificationDays.
         * @return Builder
         */
        public Builder notificationDays(String notificationDays) {
            this.notificationDays = notificationDays;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  String value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
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
         * Setter for recurringId.
         * @param  recurringId  String value for recurringId.
         * @return Builder
         */
        public Builder recurringId(String recurringId) {
            this.recurringId = recurringId;
            return this;
        }

        /**
         * Setter for recurringApiId.
         * @param  recurringApiId  String value for recurringApiId.
         * @return Builder
         */
        public Builder recurringApiId(String recurringApiId) {
            this.recurringApiId = recurringApiId;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for transactionAmount.
         * @param  transactionAmount  String value for transactionAmount.
         * @return Builder
         */
        public Builder transactionAmount(String transactionAmount) {
            this.transactionAmount = transactionAmount;
            return this;
        }

        /**
         * Setter for termsAgree.
         * @param  termsAgree  String value for termsAgree.
         * @return Builder
         */
        public Builder termsAgree(String termsAgree) {
            this.termsAgree = termsAgree;
            return this;
        }

        /**
         * Setter for termsAgreeIp.
         * @param  termsAgreeIp  String value for termsAgreeIp.
         * @return Builder
         */
        public Builder termsAgreeIp(String termsAgreeIp) {
            this.termsAgreeIp = termsAgreeIp;
            return this;
        }

        /**
         * Setter for recurringC1.
         * @param  recurringC1  String value for recurringC1.
         * @return Builder
         */
        public Builder recurringC1(String recurringC1) {
            this.recurringC1 = recurringC1;
            return this;
        }

        /**
         * Setter for recurringC2.
         * @param  recurringC2  String value for recurringC2.
         * @return Builder
         */
        public Builder recurringC2(String recurringC2) {
            this.recurringC2 = recurringC2;
            return this;
        }

        /**
         * Setter for recurringC3.
         * @param  recurringC3  String value for recurringC3.
         * @return Builder
         */
        public Builder recurringC3(String recurringC3) {
            this.recurringC3 = recurringC3;
            return this;
        }

        /**
         * Setter for sendToProcAsRecur.
         * @param  sendToProcAsRecur  String value for sendToProcAsRecur.
         * @return Builder
         */
        public Builder sendToProcAsRecur(String sendToProcAsRecur) {
            this.sendToProcAsRecur = sendToProcAsRecur;
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
         * Setter for nextRunDate.
         * @param  nextRunDate  String value for nextRunDate.
         * @return Builder
         */
        public Builder nextRunDate(String nextRunDate) {
            this.nextRunDate = nextRunDate;
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
         * Setter for modifiedTs.
         * @param  modifiedTs  String value for modifiedTs.
         * @return Builder
         */
        public Builder modifiedTs(String modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }

        /**
         * Setter for recurringTypeId.
         * @param  recurringTypeId  String value for recurringTypeId.
         * @return Builder
         */
        public Builder recurringTypeId(String recurringTypeId) {
            this.recurringTypeId = recurringTypeId;
            return this;
        }

        /**
         * Builds a new {@link Filter6} object using the set fields.
         * @return {@link Filter6}
         */
        public Filter6 build() {
            return new Filter6(accountVaultId, active, description, endDate, installmentTotalCount,
                    interval, intervalType, locationId, notificationDays, paymentMethod,
                    productTransactionId, recurringId, recurringApiId, startDate, status,
                    transactionAmount, termsAgree, termsAgreeIp, recurringC1, recurringC2,
                    recurringC3, sendToProcAsRecur, id, nextRunDate, createdTs, modifiedTs,
                    recurringTypeId);
        }
    }
}
