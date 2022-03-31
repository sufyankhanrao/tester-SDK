
# Sort 5

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `Title` | [`TitleEnum`](../../doc/models/title-enum.md) | Optional | - | TitleEnum getTitle() | setTitle(TitleEnum title) |
| `CcProductTransactionId` | [`CcProductTransactionIdEnum`](../../doc/models/cc-product-transaction-id-enum.md) | Optional | - | CcProductTransactionIdEnum getCcProductTransactionId() | setCcProductTransactionId(CcProductTransactionIdEnum ccProductTransactionId) |
| `AchProductTransactionId` | [`AchProductTransactionIdEnum`](../../doc/models/ach-product-transaction-id-enum.md) | Optional | - | AchProductTransactionIdEnum getAchProductTransactionId() | setAchProductTransactionId(AchProductTransactionIdEnum achProductTransactionId) |
| `DueDate` | [`DueDateEnum`](../../doc/models/due-date-enum.md) | Optional | - | DueDateEnum getDueDate() | setDueDate(DueDateEnum dueDate) |
| `ItemList` | [`ItemList3Enum`](../../doc/models/item-list-3-enum.md) | Optional | - | ItemList3Enum getItemList() | setItemList(ItemList3Enum itemList) |
| `AllowOverpayment` | [`AllowOverpaymentEnum`](../../doc/models/allow-overpayment-enum.md) | Optional | - | AllowOverpaymentEnum getAllowOverpayment() | setAllowOverpayment(AllowOverpaymentEnum allowOverpayment) |
| `Email` | [`EmailEnum`](../../doc/models/email-enum.md) | Optional | - | EmailEnum getEmail() | setEmail(EmailEnum email) |
| `ContactId` | [`ContactIdEnum`](../../doc/models/contact-id-enum.md) | Optional | - | ContactIdEnum getContactId() | setContactId(ContactIdEnum contactId) |
| `ContactApiId` | [`ContactApiIdEnum`](../../doc/models/contact-api-id-enum.md) | Optional | - | ContactApiIdEnum getContactApiId() | setContactApiId(ContactApiIdEnum contactApiId) |
| `CustomerId` | [`CustomerIdEnum`](../../doc/models/customer-id-enum.md) | Optional | - | CustomerIdEnum getCustomerId() | setCustomerId(CustomerIdEnum customerId) |
| `ExpireDate` | [`ExpireDateEnum`](../../doc/models/expire-date-enum.md) | Optional | - | ExpireDateEnum getExpireDate() | setExpireDate(ExpireDateEnum expireDate) |
| `AllowPartialPay` | [`AllowPartialPayEnum`](../../doc/models/allow-partial-pay-enum.md) | Optional | - | AllowPartialPayEnum getAllowPartialPay() | setAllowPartialPay(AllowPartialPayEnum allowPartialPay) |
| `AttachFilesToEmail` | [`AttachFilesToEmailEnum`](../../doc/models/attach-files-to-email-enum.md) | Optional | - | AttachFilesToEmailEnum getAttachFilesToEmail() | setAttachFilesToEmail(AttachFilesToEmailEnum attachFilesToEmail) |
| `SendEmail` | [`SendEmailEnum`](../../doc/models/send-email-enum.md) | Optional | - | SendEmailEnum getSendEmail() | setSendEmail(SendEmailEnum sendEmail) |
| `InvoiceNumber` | [`InvoiceNumberEnum`](../../doc/models/invoice-number-enum.md) | Optional | - | InvoiceNumberEnum getInvoiceNumber() | setInvoiceNumber(InvoiceNumberEnum invoiceNumber) |
| `ItemHeader` | [`ItemHeaderEnum`](../../doc/models/item-header-enum.md) | Optional | - | ItemHeaderEnum getItemHeader() | setItemHeader(ItemHeaderEnum itemHeader) |
| `ItemFooter` | [`ItemFooterEnum`](../../doc/models/item-footer-enum.md) | Optional | - | ItemFooterEnum getItemFooter() | setItemFooter(ItemFooterEnum itemFooter) |
| `AmountDue` | [`AmountDueEnum`](../../doc/models/amount-due-enum.md) | Optional | - | AmountDueEnum getAmountDue() | setAmountDue(AmountDueEnum amountDue) |
| `NotificationEmail` | [`NotificationEmailEnum`](../../doc/models/notification-email-enum.md) | Optional | - | NotificationEmailEnum getNotificationEmail() | setNotificationEmail(NotificationEmailEnum notificationEmail) |
| `PaymentStatusId` | [`PaymentStatusIdEnum`](../../doc/models/payment-status-id-enum.md) | Optional | - | PaymentStatusIdEnum getPaymentStatusId() | setPaymentStatusId(PaymentStatusIdEnum paymentStatusId) |
| `StatusId` | [`StatusIdEnum`](../../doc/models/status-id-enum.md) | Optional | - | StatusIdEnum getStatusId() | setStatusId(StatusIdEnum statusId) |
| `Note` | [`NoteEnum`](../../doc/models/note-enum.md) | Optional | - | NoteEnum getNote() | setNote(NoteEnum note) |
| `NotificationDaysBeforeDueDate` | [`NotificationDaysBeforeDueDateEnum`](../../doc/models/notification-days-before-due-date-enum.md) | Optional | - | NotificationDaysBeforeDueDateEnum getNotificationDaysBeforeDueDate() | setNotificationDaysBeforeDueDate(NotificationDaysBeforeDueDateEnum notificationDaysBeforeDueDate) |
| `NotificationDaysAfterDueDate` | [`NotificationDaysAfterDueDateEnum`](../../doc/models/notification-days-after-due-date-enum.md) | Optional | - | NotificationDaysAfterDueDateEnum getNotificationDaysAfterDueDate() | setNotificationDaysAfterDueDate(NotificationDaysAfterDueDateEnum notificationDaysAfterDueDate) |
| `NotificationOnDueDate` | [`NotificationOnDueDateEnum`](../../doc/models/notification-on-due-date-enum.md) | Optional | - | NotificationOnDueDateEnum getNotificationOnDueDate() | setNotificationOnDueDate(NotificationOnDueDateEnum notificationOnDueDate) |
| `SendTextToPay` | [`SendTextToPayEnum`](../../doc/models/send-text-to-pay-enum.md) | Optional | - | SendTextToPayEnum getSendTextToPay() | setSendTextToPay(SendTextToPayEnum sendTextToPay) |
| `Files` | [`FilesEnum`](../../doc/models/files-enum.md) | Optional | - | FilesEnum getFiles() | setFiles(FilesEnum files) |
| `RemainingBalance` | [`RemainingBalanceEnum`](../../doc/models/remaining-balance-enum.md) | Optional | - | RemainingBalanceEnum getRemainingBalance() | setRemainingBalance(RemainingBalanceEnum remainingBalance) |
| `SinglePaymentMinAmount` | [`SinglePaymentMinAmountEnum`](../../doc/models/single-payment-min-amount-enum.md) | Optional | - | SinglePaymentMinAmountEnum getSinglePaymentMinAmount() | setSinglePaymentMinAmount(SinglePaymentMinAmountEnum singlePaymentMinAmount) |
| `SinglePaymentMaxAmount` | [`SinglePaymentMaxAmountEnum`](../../doc/models/single-payment-max-amount-enum.md) | Optional | - | SinglePaymentMaxAmountEnum getSinglePaymentMaxAmount() | setSinglePaymentMaxAmount(SinglePaymentMaxAmountEnum singlePaymentMaxAmount) |
| `CellPhone` | [`CellPhoneEnum`](../../doc/models/cell-phone-enum.md) | Optional | - | CellPhoneEnum getCellPhone() | setCellPhone(CellPhoneEnum cellPhone) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `CreatedUserId` | [`CreatedUserIdEnum`](../../doc/models/created-user-id-enum.md) | Optional | - | CreatedUserIdEnum getCreatedUserId() | setCreatedUserId(CreatedUserIdEnum createdUserId) |
| `ModifiedUserId` | [`ModifiedUserIdEnum`](../../doc/models/modified-user-id-enum.md) | Optional | - | ModifiedUserIdEnum getModifiedUserId() | setModifiedUserId(ModifiedUserIdEnum modifiedUserId) |
| `Active` | [`Active4Enum`](../../doc/models/active-4-enum.md) | Optional | - | Active4Enum getActive() | setActive(Active4Enum active) |
| `IsActive` | [`IsActiveEnum`](../../doc/models/is-active-enum.md) | Optional | - | IsActiveEnum getIsActive() | setIsActive(IsActiveEnum isActive) |

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

