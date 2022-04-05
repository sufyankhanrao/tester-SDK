
# Sort 6

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountVaultId` | [`AccountVaultIdEnum`](../../doc/models/account-vault-id-enum.md) | Optional | - | AccountVaultIdEnum getAccountVaultId() | setAccountVaultId(AccountVaultIdEnum accountVaultId) |
| `Active` | [`Active4Enum`](../../doc/models/active-4-enum.md) | Optional | - | Active4Enum getActive() | setActive(Active4Enum active) |
| `Description` | [`DescriptionEnum`](../../doc/models/description-enum.md) | Optional | - | DescriptionEnum getDescription() | setDescription(DescriptionEnum description) |
| `EndDate` | [`EndDateEnum`](../../doc/models/end-date-enum.md) | Optional | - | EndDateEnum getEndDate() | setEndDate(EndDateEnum endDate) |
| `InstallmentTotalCount` | [`InstallmentTotalCountEnum`](../../doc/models/installment-total-count-enum.md) | Optional | - | InstallmentTotalCountEnum getInstallmentTotalCount() | setInstallmentTotalCount(InstallmentTotalCountEnum installmentTotalCount) |
| `Interval` | [`IntervalEnum`](../../doc/models/interval-enum.md) | Optional | - | IntervalEnum getInterval() | setInterval(IntervalEnum interval) |
| `IntervalType` | [`IntervalType3Enum`](../../doc/models/interval-type-3-enum.md) | Optional | - | IntervalType3Enum getIntervalType() | setIntervalType(IntervalType3Enum intervalType) |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `NotificationDays` | [`NotificationDaysEnum`](../../doc/models/notification-days-enum.md) | Optional | - | NotificationDaysEnum getNotificationDays() | setNotificationDays(NotificationDaysEnum notificationDays) |
| `PaymentMethod` | [`PaymentMethod7Enum`](../../doc/models/payment-method-7-enum.md) | Optional | - | PaymentMethod7Enum getPaymentMethod() | setPaymentMethod(PaymentMethod7Enum paymentMethod) |
| `ProductTransactionId` | [`ProductTransactionIdEnum`](../../doc/models/product-transaction-id-enum.md) | Optional | - | ProductTransactionIdEnum getProductTransactionId() | setProductTransactionId(ProductTransactionIdEnum productTransactionId) |
| `RecurringId` | [`RecurringIdEnum`](../../doc/models/recurring-id-enum.md) | Optional | - | RecurringIdEnum getRecurringId() | setRecurringId(RecurringIdEnum recurringId) |
| `RecurringApiId` | [`RecurringApiIdEnum`](../../doc/models/recurring-api-id-enum.md) | Optional | - | RecurringApiIdEnum getRecurringApiId() | setRecurringApiId(RecurringApiIdEnum recurringApiId) |
| `StartDate` | [`StartDateEnum`](../../doc/models/start-date-enum.md) | Optional | - | StartDateEnum getStartDate() | setStartDate(StartDateEnum startDate) |
| `Status` | [`Status3Enum`](../../doc/models/status-3-enum.md) | Optional | - | Status3Enum getStatus() | setStatus(Status3Enum status) |
| `TransactionAmount` | [`TransactionAmountEnum`](../../doc/models/transaction-amount-enum.md) | Optional | - | TransactionAmountEnum getTransactionAmount() | setTransactionAmount(TransactionAmountEnum transactionAmount) |
| `TermsAgree` | [`TermsAgreeEnum`](../../doc/models/terms-agree-enum.md) | Optional | - | TermsAgreeEnum getTermsAgree() | setTermsAgree(TermsAgreeEnum termsAgree) |
| `TermsAgreeIp` | [`TermsAgreeIpEnum`](../../doc/models/terms-agree-ip-enum.md) | Optional | - | TermsAgreeIpEnum getTermsAgreeIp() | setTermsAgreeIp(TermsAgreeIpEnum termsAgreeIp) |
| `RecurringC1` | [`RecurringC1Enum`](../../doc/models/recurring-c1-enum.md) | Optional | - | RecurringC1Enum getRecurringC1() | setRecurringC1(RecurringC1Enum recurringC1) |
| `RecurringC2` | [`RecurringC1Enum`](../../doc/models/recurring-c1-enum.md) | Optional | - | RecurringC1Enum getRecurringC2() | setRecurringC2(RecurringC1Enum recurringC2) |
| `RecurringC3` | [`RecurringC1Enum`](../../doc/models/recurring-c1-enum.md) | Optional | - | RecurringC1Enum getRecurringC3() | setRecurringC3(RecurringC1Enum recurringC3) |
| `SendToProcAsRecur` | [`SendToProcAsRecurEnum`](../../doc/models/send-to-proc-as-recur-enum.md) | Optional | - | SendToProcAsRecurEnum getSendToProcAsRecur() | setSendToProcAsRecur(SendToProcAsRecurEnum sendToProcAsRecur) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `NextRunDate` | [`NextRunDateEnum`](../../doc/models/next-run-date-enum.md) | Optional | - | NextRunDateEnum getNextRunDate() | setNextRunDate(NextRunDateEnum nextRunDate) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `RecurringTypeId` | [`RecurringTypeId2Enum`](../../doc/models/recurring-type-id-2-enum.md) | Optional | - | RecurringTypeId2Enum getRecurringTypeId() | setRecurringTypeId(RecurringTypeId2Enum recurringTypeId) |

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

