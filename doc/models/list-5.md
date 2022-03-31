
# List 5

## Structure

`List5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountVaultId` | `String` | Required | Token ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getAccountVaultId() | setAccountVaultId(String accountVaultId) |
| `Active` | [`ActiveEnum`](../../doc/models/active-enum.md) | Required | Active | ActiveEnum getActive() | setActive(ActiveEnum active) |
| `Description` | `String` | Optional | Description<br>**Constraints**: *Maximum Length*: `36` | String getDescription() | setDescription(String description) |
| `EndDate` | `String` | Optional | End date<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getEndDate() | setEndDate(String endDate) |
| `InstallmentTotalCount` | `Integer` | Optional | Installment Total Count<br>**Constraints**: `>= 1`, `<= 999` | Integer getInstallmentTotalCount() | setInstallmentTotalCount(Integer installmentTotalCount) |
| `Interval` | `int` | Required | Interval<br>**Constraints**: `>= 0`, `<= 365` | int getInterval() | setInterval(int interval) |
| `IntervalType` | [`IntervalTypeEnum`](../../doc/models/interval-type-enum.md) | Required | Interval Type | IntervalTypeEnum getIntervalType() | setIntervalType(IntervalTypeEnum intervalType) |
| `LocationId` | `String` | Required | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `NotificationDays` | `Integer` | Optional | Notification Days<br>**Constraints**: `>= 0`, `<= 365` | Integer getNotificationDays() | setNotificationDays(Integer notificationDays) |
| `PaymentMethod` | [`PaymentMethodEnum`](../../doc/models/payment-method-enum.md) | Required | Payment Method | PaymentMethodEnum getPaymentMethod() | setPaymentMethod(PaymentMethodEnum paymentMethod) |
| `ProductTransactionId` | `String` | Optional | Product Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getProductTransactionId() | setProductTransactionId(String productTransactionId) |
| `RecurringId` | `String` | Optional | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getRecurringId() | setRecurringId(String recurringId) |
| `RecurringApiId` | `String` | Optional | Recurring Api ID<br>**Constraints**: *Maximum Length*: `64` | String getRecurringApiId() | setRecurringApiId(String recurringApiId) |
| `StartDate` | `String` | Required | Start date<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getStartDate() | setStartDate(String startDate) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Required | Status | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `TransactionAmount` | `double` | Required | Transaction amount | double getTransactionAmount() | setTransactionAmount(double transactionAmount) |
| `TermsAgree` | `Boolean` | Optional | Terms Agree | Boolean getTermsAgree() | setTermsAgree(Boolean termsAgree) |
| `TermsAgreeIp` | `String` | Optional | Terms Agree Ip<br>**Constraints**: *Maximum Length*: `16` | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `RecurringC1` | `String` | Optional | Custom field used for integrations<br>**Constraints**: *Maximum Length*: `128` | String getRecurringC1() | setRecurringC1(String recurringC1) |
| `RecurringC2` | `String` | Optional | Custom field used for integrations<br>**Constraints**: *Maximum Length*: `128` | String getRecurringC2() | setRecurringC2(String recurringC2) |
| `RecurringC3` | `String` | Optional | Custom field used for integrations<br>**Constraints**: *Maximum Length*: `128` | String getRecurringC3() | setRecurringC3(String recurringC3) |
| `SendToProcAsRecur` | `Boolean` | Optional | Send To Proc As Recur | Boolean getSendToProcAsRecur() | setSendToProcAsRecur(Boolean sendToProcAsRecur) |
| `Id` | `String` | Required | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `NextRunDate` | `String` | Required | Next Run Date<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getNextRunDate() | setNextRunDate(String nextRunDate) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `RecurringTypeId` | [`RecurringTypeIdEnum`](../../doc/models/recurring-type-id-enum.md) | Required | Recurring Type | RecurringTypeIdEnum getRecurringTypeId() | setRecurringTypeId(RecurringTypeIdEnum recurringTypeId) |

## Example (as JSON)

```json
{
  "account_vault_id": "11e95f8ec39de8fbdb0a4f1a",
  "active": 1,
  "interval": 1,
  "interval_type": "d",
  "location_id": "11e95f8ec39de8fbdb0a4f1a",
  "payment_method": "cc",
  "start_date": "2021-12-01",
  "status": "active",
  "transaction_amount": 3.0,
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "next_run_date": "2021-12-01",
  "created_ts": null,
  "modified_ts": null,
  "recurring_type_id": "i"
}
```

