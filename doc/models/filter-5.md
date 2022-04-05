
# Filter 5

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `CcProductTransactionId` | `String` | Optional | - | String getCcProductTransactionId() | setCcProductTransactionId(String ccProductTransactionId) |
| `AchProductTransactionId` | `String` | Optional | - | String getAchProductTransactionId() | setAchProductTransactionId(String achProductTransactionId) |
| `DueDate` | `String` | Optional | - | String getDueDate() | setDueDate(String dueDate) |
| `ItemList` | `String` | Optional | - | String getItemList() | setItemList(String itemList) |
| `AllowOverpayment` | `String` | Optional | - | String getAllowOverpayment() | setAllowOverpayment(String allowOverpayment) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `ContactId` | `String` | Optional | - | String getContactId() | setContactId(String contactId) |
| `ContactApiId` | `String` | Optional | - | String getContactApiId() | setContactApiId(String contactApiId) |
| `CustomerId` | `String` | Optional | - | String getCustomerId() | setCustomerId(String customerId) |
| `ExpireDate` | `String` | Optional | - | String getExpireDate() | setExpireDate(String expireDate) |
| `AllowPartialPay` | `String` | Optional | - | String getAllowPartialPay() | setAllowPartialPay(String allowPartialPay) |
| `AttachFilesToEmail` | `String` | Optional | - | String getAttachFilesToEmail() | setAttachFilesToEmail(String attachFilesToEmail) |
| `SendEmail` | `String` | Optional | - | String getSendEmail() | setSendEmail(String sendEmail) |
| `InvoiceNumber` | `String` | Optional | - | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `ItemHeader` | `String` | Optional | - | String getItemHeader() | setItemHeader(String itemHeader) |
| `ItemFooter` | `String` | Optional | - | String getItemFooter() | setItemFooter(String itemFooter) |
| `AmountDue` | `String` | Optional | - | String getAmountDue() | setAmountDue(String amountDue) |
| `NotificationEmail` | `String` | Optional | - | String getNotificationEmail() | setNotificationEmail(String notificationEmail) |
| `PaymentStatusId` | `String` | Optional | - | String getPaymentStatusId() | setPaymentStatusId(String paymentStatusId) |
| `StatusId` | `String` | Optional | - | String getStatusId() | setStatusId(String statusId) |
| `Note` | `String` | Optional | - | String getNote() | setNote(String note) |
| `NotificationDaysBeforeDueDate` | `String` | Optional | - | String getNotificationDaysBeforeDueDate() | setNotificationDaysBeforeDueDate(String notificationDaysBeforeDueDate) |
| `NotificationDaysAfterDueDate` | `String` | Optional | - | String getNotificationDaysAfterDueDate() | setNotificationDaysAfterDueDate(String notificationDaysAfterDueDate) |
| `NotificationOnDueDate` | `String` | Optional | - | String getNotificationOnDueDate() | setNotificationOnDueDate(String notificationOnDueDate) |
| `SendTextToPay` | `String` | Optional | - | String getSendTextToPay() | setSendTextToPay(String sendTextToPay) |
| `Files` | `String` | Optional | - | String getFiles() | setFiles(String files) |
| `RemainingBalance` | `String` | Optional | - | String getRemainingBalance() | setRemainingBalance(String remainingBalance) |
| `SinglePaymentMinAmount` | `String` | Optional | - | String getSinglePaymentMinAmount() | setSinglePaymentMinAmount(String singlePaymentMinAmount) |
| `SinglePaymentMaxAmount` | `String` | Optional | - | String getSinglePaymentMaxAmount() | setSinglePaymentMaxAmount(String singlePaymentMaxAmount) |
| `CellPhone` | `String` | Optional | - | String getCellPhone() | setCellPhone(String cellPhone) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `CreatedUserId` | `String` | Optional | - | String getCreatedUserId() | setCreatedUserId(String createdUserId) |
| `ModifiedUserId` | `String` | Optional | - | String getModifiedUserId() | setModifiedUserId(String modifiedUserId) |
| `Active` | `String` | Optional | - | String getActive() | setActive(String active) |
| `IsActive` | `String` | Optional | - | String getIsActive() | setIsActive(String isActive) |

## Example (as JSON)

```json
{
  "location_id": null,
  "title": null,
  "cc_product_transaction_id": null,
  "ach_product_transaction_id": null,
  "due_date": null,
  "item_list": null,
  "allow_overpayment": null,
  "email": null,
  "contact_id": null,
  "contact_api_id": null,
  "customer_id": null,
  "expire_date": null,
  "allow_partial_pay": null,
  "attach_files_to_email": null,
  "send_email": null,
  "invoice_number": null,
  "item_header": null,
  "item_footer": null,
  "amount_due": null,
  "notification_email": null,
  "payment_status_id": null,
  "status_id": null,
  "note": null,
  "notification_days_before_due_date": null,
  "notification_days_after_due_date": null,
  "notification_on_due_date": null,
  "send_text_to_pay": null,
  "files": null,
  "remaining_balance": null,
  "single_payment_min_amount": null,
  "single_payment_max_amount": null,
  "cell_phone": null,
  "id": null,
  "created_ts": null,
  "modified_ts": null,
  "created_user_id": null,
  "modified_user_id": null,
  "active": null,
  "is_active": null
}
```

