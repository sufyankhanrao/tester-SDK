/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import tech.fortis.sandbox.api.DateTimeHelper;

/**
 * This is a model class for Data8 type.
 */
public class Data8 {
    private String accountVaultId;
    private ActiveEnum active;
    private String description;
    private String endDate;
    private Integer installmentTotalCount;
    private int interval;
    private IntervalTypeEnum intervalType;
    private String locationId;
    private Integer notificationDays;
    private PaymentMethodEnum paymentMethod;
    private String productTransactionId;
    private String recurringId;
    private String recurringApiId;
    private String startDate;
    private StatusEnum status;
    private double transactionAmount;
    private Boolean termsAgree;
    private String termsAgreeIp;
    private String recurringC1;
    private String recurringC2;
    private String recurringC3;
    private Boolean sendToProcAsRecur;
    private String id;
    private String nextRunDate;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;
    private RecurringTypeIdEnum recurringTypeId;

    /**
     * Default constructor.
     */
    public Data8() {
    }

    /**
     * Initialization constructor.
     * @param  accountVaultId  String value for accountVaultId.
     * @param  active  ActiveEnum value for active.
     * @param  interval  int value for interval.
     * @param  intervalType  IntervalTypeEnum value for intervalType.
     * @param  locationId  String value for locationId.
     * @param  paymentMethod  PaymentMethodEnum value for paymentMethod.
     * @param  startDate  String value for startDate.
     * @param  status  StatusEnum value for status.
     * @param  transactionAmount  double value for transactionAmount.
     * @param  id  String value for id.
     * @param  nextRunDate  String value for nextRunDate.
     * @param  createdTs  LocalDateTime value for createdTs.
     * @param  modifiedTs  LocalDateTime value for modifiedTs.
     * @param  recurringTypeId  RecurringTypeIdEnum value for recurringTypeId.
     * @param  description  String value for description.
     * @param  endDate  String value for endDate.
     * @param  installmentTotalCount  Integer value for installmentTotalCount.
     * @param  notificationDays  Integer value for notificationDays.
     * @param  productTransactionId  String value for productTransactionId.
     * @param  recurringId  String value for recurringId.
     * @param  recurringApiId  String value for recurringApiId.
     * @param  termsAgree  Boolean value for termsAgree.
     * @param  termsAgreeIp  String value for termsAgreeIp.
     * @param  recurringC1  String value for recurringC1.
     * @param  recurringC2  String value for recurringC2.
     * @param  recurringC3  String value for recurringC3.
     * @param  sendToProcAsRecur  Boolean value for sendToProcAsRecur.
     */
    public Data8(
            String accountVaultId,
            ActiveEnum active,
            int interval,
            IntervalTypeEnum intervalType,
            String locationId,
            PaymentMethodEnum paymentMethod,
            String startDate,
            StatusEnum status,
            double transactionAmount,
            String id,
            String nextRunDate,
            LocalDateTime createdTs,
            LocalDateTime modifiedTs,
            RecurringTypeIdEnum recurringTypeId,
            String description,
            String endDate,
            Integer installmentTotalCount,
            Integer notificationDays,
            String productTransactionId,
            String recurringId,
            String recurringApiId,
            Boolean termsAgree,
            String termsAgreeIp,
            String recurringC1,
            String recurringC2,
            String recurringC3,
            Boolean sendToProcAsRecur) {
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
     * Token ID
     * @return Returns the String
     */
    @JsonGetter("account_vault_id")
    public String getAccountVaultId() {
        return accountVaultId;
    }

    /**
     * Setter for AccountVaultId.
     * Token ID
     * @param accountVaultId Value for String
     */
    @JsonSetter("account_vault_id")
    public void setAccountVaultId(String accountVaultId) {
        this.accountVaultId = accountVaultId;
    }

    /**
     * Getter for Active.
     * Active
     * @return Returns the ActiveEnum
     */
    @JsonGetter("active")
    public ActiveEnum getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * Active
     * @param active Value for ActiveEnum
     */
    @JsonSetter("active")
    public void setActive(ActiveEnum active) {
        this.active = active;
    }

    /**
     * Getter for Description.
     * Description
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for EndDate.
     * End date
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * End date
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for InstallmentTotalCount.
     * Installment Total Count
     * @return Returns the Integer
     */
    @JsonGetter("installment_total_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInstallmentTotalCount() {
        return installmentTotalCount;
    }

    /**
     * Setter for InstallmentTotalCount.
     * Installment Total Count
     * @param installmentTotalCount Value for Integer
     */
    @JsonSetter("installment_total_count")
    public void setInstallmentTotalCount(Integer installmentTotalCount) {
        this.installmentTotalCount = installmentTotalCount;
    }

    /**
     * Getter for Interval.
     * Interval
     * @return Returns the int
     */
    @JsonGetter("interval")
    public int getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * Interval
     * @param interval Value for int
     */
    @JsonSetter("interval")
    public void setInterval(int interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalType.
     * Interval Type
     * @return Returns the IntervalTypeEnum
     */
    @JsonGetter("interval_type")
    public IntervalTypeEnum getIntervalType() {
        return intervalType;
    }

    /**
     * Setter for IntervalType.
     * Interval Type
     * @param intervalType Value for IntervalTypeEnum
     */
    @JsonSetter("interval_type")
    public void setIntervalType(IntervalTypeEnum intervalType) {
        this.intervalType = intervalType;
    }

    /**
     * Getter for LocationId.
     * Location ID
     * @return Returns the String
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     * Setter for LocationId.
     * Location ID
     * @param locationId Value for String
     */
    @JsonSetter("location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    /**
     * Getter for NotificationDays.
     * Notification Days
     * @return Returns the Integer
     */
    @JsonGetter("notification_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNotificationDays() {
        return notificationDays;
    }

    /**
     * Setter for NotificationDays.
     * Notification Days
     * @param notificationDays Value for Integer
     */
    @JsonSetter("notification_days")
    public void setNotificationDays(Integer notificationDays) {
        this.notificationDays = notificationDays;
    }

    /**
     * Getter for PaymentMethod.
     * Payment Method
     * @return Returns the PaymentMethodEnum
     */
    @JsonGetter("payment_method")
    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * Payment Method
     * @param paymentMethod Value for PaymentMethodEnum
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for ProductTransactionId.
     * Product Transaction ID
     * @return Returns the String
     */
    @JsonGetter("product_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductTransactionId() {
        return productTransactionId;
    }

    /**
     * Setter for ProductTransactionId.
     * Product Transaction ID
     * @param productTransactionId Value for String
     */
    @JsonSetter("product_transaction_id")
    public void setProductTransactionId(String productTransactionId) {
        this.productTransactionId = productTransactionId;
    }

    /**
     * Getter for RecurringId.
     * Recurring ID
     * @return Returns the String
     */
    @JsonGetter("recurring_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringId() {
        return recurringId;
    }

    /**
     * Setter for RecurringId.
     * Recurring ID
     * @param recurringId Value for String
     */
    @JsonSetter("recurring_id")
    public void setRecurringId(String recurringId) {
        this.recurringId = recurringId;
    }

    /**
     * Getter for RecurringApiId.
     * Recurring Api ID
     * @return Returns the String
     */
    @JsonGetter("recurring_api_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringApiId() {
        return recurringApiId;
    }

    /**
     * Setter for RecurringApiId.
     * Recurring Api ID
     * @param recurringApiId Value for String
     */
    @JsonSetter("recurring_api_id")
    public void setRecurringApiId(String recurringApiId) {
        this.recurringApiId = recurringApiId;
    }

    /**
     * Getter for StartDate.
     * Start date
     * @return Returns the String
     */
    @JsonGetter("start_date")
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * Start date
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for Status.
     * Status
     * @return Returns the StatusEnum
     */
    @JsonGetter("status")
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status
     * @param status Value for StatusEnum
     */
    @JsonSetter("status")
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for TransactionAmount.
     * Transaction amount
     * @return Returns the double
     */
    @JsonGetter("transaction_amount")
    public double getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter for TransactionAmount.
     * Transaction amount
     * @param transactionAmount Value for double
     */
    @JsonSetter("transaction_amount")
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * Getter for TermsAgree.
     * Terms Agree
     * @return Returns the Boolean
     */
    @JsonGetter("terms_agree")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTermsAgree() {
        return termsAgree;
    }

    /**
     * Setter for TermsAgree.
     * Terms Agree
     * @param termsAgree Value for Boolean
     */
    @JsonSetter("terms_agree")
    public void setTermsAgree(Boolean termsAgree) {
        this.termsAgree = termsAgree;
    }

    /**
     * Getter for TermsAgreeIp.
     * Terms Agree Ip
     * @return Returns the String
     */
    @JsonGetter("terms_agree_ip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTermsAgreeIp() {
        return termsAgreeIp;
    }

    /**
     * Setter for TermsAgreeIp.
     * Terms Agree Ip
     * @param termsAgreeIp Value for String
     */
    @JsonSetter("terms_agree_ip")
    public void setTermsAgreeIp(String termsAgreeIp) {
        this.termsAgreeIp = termsAgreeIp;
    }

    /**
     * Getter for RecurringC1.
     * Custom field used for integrations
     * @return Returns the String
     */
    @JsonGetter("recurring_c1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringC1() {
        return recurringC1;
    }

    /**
     * Setter for RecurringC1.
     * Custom field used for integrations
     * @param recurringC1 Value for String
     */
    @JsonSetter("recurring_c1")
    public void setRecurringC1(String recurringC1) {
        this.recurringC1 = recurringC1;
    }

    /**
     * Getter for RecurringC2.
     * Custom field used for integrations
     * @return Returns the String
     */
    @JsonGetter("recurring_c2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringC2() {
        return recurringC2;
    }

    /**
     * Setter for RecurringC2.
     * Custom field used for integrations
     * @param recurringC2 Value for String
     */
    @JsonSetter("recurring_c2")
    public void setRecurringC2(String recurringC2) {
        this.recurringC2 = recurringC2;
    }

    /**
     * Getter for RecurringC3.
     * Custom field used for integrations
     * @return Returns the String
     */
    @JsonGetter("recurring_c3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurringC3() {
        return recurringC3;
    }

    /**
     * Setter for RecurringC3.
     * Custom field used for integrations
     * @param recurringC3 Value for String
     */
    @JsonSetter("recurring_c3")
    public void setRecurringC3(String recurringC3) {
        this.recurringC3 = recurringC3;
    }

    /**
     * Getter for SendToProcAsRecur.
     * Send To Proc As Recur
     * @return Returns the Boolean
     */
    @JsonGetter("send_to_proc_as_recur")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSendToProcAsRecur() {
        return sendToProcAsRecur;
    }

    /**
     * Setter for SendToProcAsRecur.
     * Send To Proc As Recur
     * @param sendToProcAsRecur Value for Boolean
     */
    @JsonSetter("send_to_proc_as_recur")
    public void setSendToProcAsRecur(Boolean sendToProcAsRecur) {
        this.sendToProcAsRecur = sendToProcAsRecur;
    }

    /**
     * Getter for Id.
     * Recurring ID
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Recurring ID
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for NextRunDate.
     * Next Run Date
     * @return Returns the String
     */
    @JsonGetter("next_run_date")
    public String getNextRunDate() {
        return nextRunDate;
    }

    /**
     * Setter for NextRunDate.
     * Next Run Date
     * @param nextRunDate Value for String
     */
    @JsonSetter("next_run_date")
    public void setNextRunDate(String nextRunDate) {
        this.nextRunDate = nextRunDate;
    }

    /**
     * Getter for CreatedTs.
     * Created Time Stamp
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_ts")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    /**
     * Setter for CreatedTs.
     * Created Time Stamp
     * @param createdTs Value for LocalDateTime
     */
    @JsonSetter("created_ts")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * Getter for ModifiedTs.
     * Modified Time Stamp
     * @return Returns the LocalDateTime
     */
    @JsonGetter("modified_ts")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getModifiedTs() {
        return modifiedTs;
    }

    /**
     * Setter for ModifiedTs.
     * Modified Time Stamp
     * @param modifiedTs Value for LocalDateTime
     */
    @JsonSetter("modified_ts")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setModifiedTs(LocalDateTime modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    /**
     * Getter for RecurringTypeId.
     * Recurring Type
     * @return Returns the RecurringTypeIdEnum
     */
    @JsonGetter("recurring_type_id")
    public RecurringTypeIdEnum getRecurringTypeId() {
        return recurringTypeId;
    }

    /**
     * Setter for RecurringTypeId.
     * Recurring Type
     * @param recurringTypeId Value for RecurringTypeIdEnum
     */
    @JsonSetter("recurring_type_id")
    public void setRecurringTypeId(RecurringTypeIdEnum recurringTypeId) {
        this.recurringTypeId = recurringTypeId;
    }

    /**
     * Converts this Data8 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Data8 [" + "accountVaultId=" + accountVaultId + ", active=" + active + ", interval="
                + interval + ", intervalType=" + intervalType + ", locationId=" + locationId
                + ", paymentMethod=" + paymentMethod + ", startDate=" + startDate + ", status="
                + status + ", transactionAmount=" + transactionAmount + ", id=" + id
                + ", nextRunDate=" + nextRunDate + ", createdTs=" + createdTs + ", modifiedTs="
                + modifiedTs + ", recurringTypeId=" + recurringTypeId + ", description="
                + description + ", endDate=" + endDate + ", installmentTotalCount="
                + installmentTotalCount + ", notificationDays=" + notificationDays
                + ", productTransactionId=" + productTransactionId + ", recurringId=" + recurringId
                + ", recurringApiId=" + recurringApiId + ", termsAgree=" + termsAgree
                + ", termsAgreeIp=" + termsAgreeIp + ", recurringC1=" + recurringC1
                + ", recurringC2=" + recurringC2 + ", recurringC3=" + recurringC3
                + ", sendToProcAsRecur=" + sendToProcAsRecur + "]";
    }

    /**
     * Builds a new {@link Data8.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Data8.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountVaultId, active, interval, intervalType, locationId,
                paymentMethod, startDate, status, transactionAmount, id, nextRunDate, createdTs,
                modifiedTs, recurringTypeId)
                .description(getDescription())
                .endDate(getEndDate())
                .installmentTotalCount(getInstallmentTotalCount())
                .notificationDays(getNotificationDays())
                .productTransactionId(getProductTransactionId())
                .recurringId(getRecurringId())
                .recurringApiId(getRecurringApiId())
                .termsAgree(getTermsAgree())
                .termsAgreeIp(getTermsAgreeIp())
                .recurringC1(getRecurringC1())
                .recurringC2(getRecurringC2())
                .recurringC3(getRecurringC3())
                .sendToProcAsRecur(getSendToProcAsRecur());
        return builder;
    }

    /**
     * Class to build instances of {@link Data8}.
     */
    public static class Builder {
        private String accountVaultId;
        private ActiveEnum active;
        private int interval;
        private IntervalTypeEnum intervalType;
        private String locationId;
        private PaymentMethodEnum paymentMethod;
        private String startDate;
        private StatusEnum status;
        private double transactionAmount;
        private String id;
        private String nextRunDate;
        private LocalDateTime createdTs;
        private LocalDateTime modifiedTs;
        private RecurringTypeIdEnum recurringTypeId;
        private String description;
        private String endDate;
        private Integer installmentTotalCount;
        private Integer notificationDays;
        private String productTransactionId;
        private String recurringId;
        private String recurringApiId;
        private Boolean termsAgree;
        private String termsAgreeIp;
        private String recurringC1;
        private String recurringC2;
        private String recurringC3;
        private Boolean sendToProcAsRecur;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountVaultId  String value for accountVaultId.
         * @param  active  ActiveEnum value for active.
         * @param  interval  int value for interval.
         * @param  intervalType  IntervalTypeEnum value for intervalType.
         * @param  locationId  String value for locationId.
         * @param  paymentMethod  PaymentMethodEnum value for paymentMethod.
         * @param  startDate  String value for startDate.
         * @param  status  StatusEnum value for status.
         * @param  transactionAmount  double value for transactionAmount.
         * @param  id  String value for id.
         * @param  nextRunDate  String value for nextRunDate.
         * @param  createdTs  LocalDateTime value for createdTs.
         * @param  modifiedTs  LocalDateTime value for modifiedTs.
         * @param  recurringTypeId  RecurringTypeIdEnum value for recurringTypeId.
         */
        public Builder(String accountVaultId, ActiveEnum active, int interval,
                IntervalTypeEnum intervalType, String locationId, PaymentMethodEnum paymentMethod,
                String startDate, StatusEnum status, double transactionAmount, String id,
                String nextRunDate, LocalDateTime createdTs, LocalDateTime modifiedTs,
                RecurringTypeIdEnum recurringTypeId) {
            this.accountVaultId = accountVaultId;
            this.active = active;
            this.interval = interval;
            this.intervalType = intervalType;
            this.locationId = locationId;
            this.paymentMethod = paymentMethod;
            this.startDate = startDate;
            this.status = status;
            this.transactionAmount = transactionAmount;
            this.id = id;
            this.nextRunDate = nextRunDate;
            this.createdTs = createdTs;
            this.modifiedTs = modifiedTs;
            this.recurringTypeId = recurringTypeId;
        }

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
         * @param  active  ActiveEnum value for active.
         * @return Builder
         */
        public Builder active(ActiveEnum active) {
            this.active = active;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  int value for interval.
         * @return Builder
         */
        public Builder interval(int interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalType.
         * @param  intervalType  IntervalTypeEnum value for intervalType.
         * @return Builder
         */
        public Builder intervalType(IntervalTypeEnum intervalType) {
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
         * Setter for paymentMethod.
         * @param  paymentMethod  PaymentMethodEnum value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(PaymentMethodEnum paymentMethod) {
            this.paymentMethod = paymentMethod;
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
         * @param  status  StatusEnum value for status.
         * @return Builder
         */
        public Builder status(StatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for transactionAmount.
         * @param  transactionAmount  double value for transactionAmount.
         * @return Builder
         */
        public Builder transactionAmount(double transactionAmount) {
            this.transactionAmount = transactionAmount;
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
         * @param  createdTs  LocalDateTime value for createdTs.
         * @return Builder
         */
        public Builder createdTs(LocalDateTime createdTs) {
            this.createdTs = createdTs;
            return this;
        }

        /**
         * Setter for modifiedTs.
         * @param  modifiedTs  LocalDateTime value for modifiedTs.
         * @return Builder
         */
        public Builder modifiedTs(LocalDateTime modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }

        /**
         * Setter for recurringTypeId.
         * @param  recurringTypeId  RecurringTypeIdEnum value for recurringTypeId.
         * @return Builder
         */
        public Builder recurringTypeId(RecurringTypeIdEnum recurringTypeId) {
            this.recurringTypeId = recurringTypeId;
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
         * @param  installmentTotalCount  Integer value for installmentTotalCount.
         * @return Builder
         */
        public Builder installmentTotalCount(Integer installmentTotalCount) {
            this.installmentTotalCount = installmentTotalCount;
            return this;
        }

        /**
         * Setter for notificationDays.
         * @param  notificationDays  Integer value for notificationDays.
         * @return Builder
         */
        public Builder notificationDays(Integer notificationDays) {
            this.notificationDays = notificationDays;
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
         * Setter for termsAgree.
         * @param  termsAgree  Boolean value for termsAgree.
         * @return Builder
         */
        public Builder termsAgree(Boolean termsAgree) {
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
         * @param  sendToProcAsRecur  Boolean value for sendToProcAsRecur.
         * @return Builder
         */
        public Builder sendToProcAsRecur(Boolean sendToProcAsRecur) {
            this.sendToProcAsRecur = sendToProcAsRecur;
            return this;
        }

        /**
         * Builds a new {@link Data8} object using the set fields.
         * @return {@link Data8}
         */
        public Data8 build() {
            return new Data8(accountVaultId, active, interval, intervalType, locationId,
                    paymentMethod, startDate, status, transactionAmount, id, nextRunDate, createdTs,
                    modifiedTs, recurringTypeId, description, endDate, installmentTotalCount,
                    notificationDays, productTransactionId, recurringId, recurringApiId, termsAgree,
                    termsAgreeIp, recurringC1, recurringC2, recurringC3, sendToProcAsRecur);
        }
    }
}
