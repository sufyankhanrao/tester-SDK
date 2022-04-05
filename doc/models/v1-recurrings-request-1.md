
# V1 Recurrings Request 1

## Structure

`V1RecurringsRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NextRunDate` | `String` | Optional | Next Run Date<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getNextRunDate() | setNextRunDate(String nextRunDate) |
| `AccountVaultId` | `String` | Optional | Token ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getAccountVaultId() | setAccountVaultId(String accountVaultId) |
| `Active` | [`ActiveEnum`](../../doc/models/active-enum.md) | Optional | Active | ActiveEnum getActive() | setActive(ActiveEnum active) |
| `Description` | `String` | Optional | Description<br>**Constraints**: *Maximum Length*: `36` | String getDescription() | setDescription(String description) |
| `EndDate` | `String` | Optional | End date<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getEndDate() | setEndDate(String endDate) |
| `InstallmentTotalCount` | `Integer` | Optional | Installment Total Count<br>**Constraints**: `>= 1`, `<= 999` | Integer getInstallmentTotalCount() | setInstallmentTotalCount(Integer installmentTotalCount) |
| `Interval` | `Integer` | Optional | Interval<br>**Constraints**: `>= 0`, `<= 365` | Integer getInterval() | setInterval(Integer interval) |
| `IntervalType` | [`IntervalTypeEnum`](../../doc/models/interval-type-enum.md) | Optional | Interval Type | IntervalTypeEnum getIntervalType() | setIntervalType(IntervalTypeEnum intervalType) |
| `LocationId` | `String` | Optional | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `NotificationDays` | `Integer` | Optional | Notification Days<br>**Constraints**: `>= 0`, `<= 365` | Integer getNotificationDays() | setNotificationDays(Integer notificationDays) |
| `PaymentMethod` | [`PaymentMethodEnum`](../../doc/models/payment-method-enum.md) | Optional | Payment Method | PaymentMethodEnum getPaymentMethod() | setPaymentMethod(PaymentMethodEnum paymentMethod) |
| `ProductTransactionId` | `String` | Optional | Product Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getProductTransactionId() | setProductTransactionId(String productTransactionId) |
| `RecurringId` | `String` | Optional | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getRecurringId() | setRecurringId(String recurringId) |
| `RecurringApiId` | `String` | Optional | Recurring Api ID<br>**Constraints**: *Maximum Length*: `64` | String getRecurringApiId() | setRecurringApiId(String recurringApiId) |
| `StartDate` | `String` | Optional | Start date<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getStartDate() | setStartDate(String startDate) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | Status | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `TransactionAmount` | `Double` | Optional | Transaction amount | Double getTransactionAmount() | setTransactionAmount(Double transactionAmount) |
| `TermsAgree` | `Boolean` | Optional | Terms Agree | Boolean getTermsAgree() | setTermsAgree(Boolean termsAgree) |
| `TermsAgreeIp` | `String` | Optional | Terms Agree Ip<br>**Constraints**: *Maximum Length*: `16` | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `RecurringC1` | `String` | Optional | Custom field used for integrations<br>**Constraints**: *Maximum Length*: `128` | String getRecurringC1() | setRecurringC1(String recurringC1) |
| `RecurringC2` | `String` | Optional | Custom field used for integrations<br>**Constraints**: *Maximum Length*: `128` | String getRecurringC2() | setRecurringC2(String recurringC2) |
| `RecurringC3` | `String` | Optional | Custom field used for integrations<br>**Constraints**: *Maximum Length*: `128` | String getRecurringC3() | setRecurringC3(String recurringC3) |
| `SendToProcAsRecur` | `Boolean` | Optional | Send To Proc As Recur | Boolean getSendToProcAsRecur() | setSendToProcAsRecur(Boolean sendToProcAsRecur) |

## Example (as JSON)

```json
{
  "next_run_date": null,
  "account_vault_id": null,
  "active": null,
  "description": null,
  "end_date": null,
  "installment_total_count": null,
  "interval": null,
  "interval_type": null,
  "location_id": null,
  "notification_days": null,
  "payment_method": null,
  "product_transaction_id": null,
  "recurring_id": null,
  "recurring_api_id": null,
  "start_date": null,
  "status": null,
  "transaction_amount": null,
  "terms_agree": null,
  "terms_agree_ip": null,
  "recurring_c1": null,
  "recurring_c2": null,
  "recurring_c3": null,
  "send_to_proc_as_recur": null
}
```

