
# Filter 6

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountVaultId` | `String` | Optional | - | String getAccountVaultId() | setAccountVaultId(String accountVaultId) |
| `Active` | `String` | Optional | - | String getActive() | setActive(String active) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `EndDate` | `String` | Optional | - | String getEndDate() | setEndDate(String endDate) |
| `InstallmentTotalCount` | `String` | Optional | - | String getInstallmentTotalCount() | setInstallmentTotalCount(String installmentTotalCount) |
| `Interval` | `String` | Optional | - | String getInterval() | setInterval(String interval) |
| `IntervalType` | `String` | Optional | - | String getIntervalType() | setIntervalType(String intervalType) |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `NotificationDays` | `String` | Optional | - | String getNotificationDays() | setNotificationDays(String notificationDays) |
| `PaymentMethod` | `String` | Optional | - | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `ProductTransactionId` | `String` | Optional | - | String getProductTransactionId() | setProductTransactionId(String productTransactionId) |
| `RecurringId` | `String` | Optional | - | String getRecurringId() | setRecurringId(String recurringId) |
| `RecurringApiId` | `String` | Optional | - | String getRecurringApiId() | setRecurringApiId(String recurringApiId) |
| `StartDate` | `String` | Optional | - | String getStartDate() | setStartDate(String startDate) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `TransactionAmount` | `String` | Optional | - | String getTransactionAmount() | setTransactionAmount(String transactionAmount) |
| `TermsAgree` | `String` | Optional | - | String getTermsAgree() | setTermsAgree(String termsAgree) |
| `TermsAgreeIp` | `String` | Optional | - | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `RecurringC1` | `String` | Optional | - | String getRecurringC1() | setRecurringC1(String recurringC1) |
| `RecurringC2` | `String` | Optional | - | String getRecurringC2() | setRecurringC2(String recurringC2) |
| `RecurringC3` | `String` | Optional | - | String getRecurringC3() | setRecurringC3(String recurringC3) |
| `SendToProcAsRecur` | `String` | Optional | - | String getSendToProcAsRecur() | setSendToProcAsRecur(String sendToProcAsRecur) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `NextRunDate` | `String` | Optional | - | String getNextRunDate() | setNextRunDate(String nextRunDate) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `RecurringTypeId` | `String` | Optional | - | String getRecurringTypeId() | setRecurringTypeId(String recurringTypeId) |

## Example (as JSON)

```json
{
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
  "send_to_proc_as_recur": null,
  "id": null,
  "next_run_date": null,
  "created_ts": null,
  "modified_ts": null,
  "recurring_type_id": null
}
```

