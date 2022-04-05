
# Data 7

## Structure

`Data7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Required | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `Title` | `String` | Required | Title<br>**Constraints**: *Maximum Length*: `64` | String getTitle() | setTitle(String title) |
| `CcProductTransactionId` | `String` | Required | Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getCcProductTransactionId() | setCcProductTransactionId(String ccProductTransactionId) |
| `AchProductTransactionId` | `String` | Optional | ACH Product Transaction Id<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getAchProductTransactionId() | setAchProductTransactionId(String achProductTransactionId) |
| `DueDate` | `String` | Required | Due Date, Format: Y-m-d<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getDueDate() | setDueDate(String dueDate) |
| `ItemList` | [`List<ItemList>`](../../doc/models/item-list.md) | Required | Item List<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `99`, *Unique Items Required* | List<ItemList> getItemList() | setItemList(List<ItemList> itemList) |
| `AllowOverpayment` | `Boolean` | Optional | Allow Overpayment. | Boolean getAllowOverpayment() | setAllowOverpayment(Boolean allowOverpayment) |
| `Email` | `String` | Optional | Email<br>**Constraints**: *Maximum Length*: `128` | String getEmail() | setEmail(String email) |
| `ContactId` | `String` | Optional | Contact ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getContactId() | setContactId(String contactId) |
| `ContactApiId` | `String` | Optional | Contact API Id<br>**Constraints**: *Maximum Length*: `64` | String getContactApiId() | setContactApiId(String contactApiId) |
| `CustomerId` | `String` | Optional | Customer Id<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getCustomerId() | setCustomerId(String customerId) |
| `ExpireDate` | `String` | Optional | Expire Date.<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getExpireDate() | setExpireDate(String expireDate) |
| `AllowPartialPay` | `Boolean` | Optional | Allow partial pay | Boolean getAllowPartialPay() | setAllowPartialPay(Boolean allowPartialPay) |
| `AttachFilesToEmail` | `Boolean` | Optional | Attach Files to Email | Boolean getAttachFilesToEmail() | setAttachFilesToEmail(Boolean attachFilesToEmail) |
| `SendEmail` | `Boolean` | Optional | Send Email | Boolean getSendEmail() | setSendEmail(Boolean sendEmail) |
| `InvoiceNumber` | `String` | Optional | Invoice number<br>**Constraints**: *Maximum Length*: `64` | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `ItemHeader` | `String` | Optional | Item Header<br>**Constraints**: *Maximum Length*: `250` | String getItemHeader() | setItemHeader(String itemHeader) |
| `ItemFooter` | `String` | Optional | Item footer<br>**Constraints**: *Maximum Length*: `250` | String getItemFooter() | setItemFooter(String itemFooter) |
| `AmountDue` | `Double` | Optional | Amount Due | Double getAmountDue() | setAmountDue(Double amountDue) |
| `NotificationEmail` | `String` | Optional | Notification email<br>**Constraints**: *Maximum Length*: `640` | String getNotificationEmail() | setNotificationEmail(String notificationEmail) |
| `PaymentStatusId` | `Double` | Optional | Payment Status Id<br>**Constraints**: `>= 1`, `<= 3` | Double getPaymentStatusId() | setPaymentStatusId(Double paymentStatusId) |
| `StatusId` | `Double` | Optional | Status Id<br>**Constraints**: `>= 0`, `<= 1` | Double getStatusId() | setStatusId(Double statusId) |
| `Note` | `String` | Optional | Note<br>**Constraints**: *Maximum Length*: `200` | String getNote() | setNote(String note) |
| `NotificationDaysBeforeDueDate` | `Integer` | Optional | Notification days before due date<br>**Constraints**: `>= 0`, `<= 99` | Integer getNotificationDaysBeforeDueDate() | setNotificationDaysBeforeDueDate(Integer notificationDaysBeforeDueDate) |
| `NotificationDaysAfterDueDate` | `Integer` | Optional | Notification days after due date<br>**Constraints**: `>= 0`, `<= 99` | Integer getNotificationDaysAfterDueDate() | setNotificationDaysAfterDueDate(Integer notificationDaysAfterDueDate) |
| `NotificationOnDueDate` | `Boolean` | Optional | Notification on due date | Boolean getNotificationOnDueDate() | setNotificationOnDueDate(Boolean notificationOnDueDate) |
| `SendTextToPay` | `Integer` | Optional | Send Text To Pay<br>**Constraints**: `>= 0`, `<= 99` | Integer getSendTextToPay() | setSendTextToPay(Integer sendTextToPay) |
| `Files` | `List<Object>` | Optional | Files | List<Object> getFiles() | setFiles(List<Object> files) |
| `RemainingBalance` | `Double` | Optional | Remaining Balance | Double getRemainingBalance() | setRemainingBalance(Double remainingBalance) |
| `SinglePaymentMinAmount` | `Double` | Optional | Single Payment Min Amount | Double getSinglePaymentMinAmount() | setSinglePaymentMinAmount(Double singlePaymentMinAmount) |
| `SinglePaymentMaxAmount` | `Double` | Optional | Single Payment Max Amount<br>**Default**: `9999999.99d` | Double getSinglePaymentMaxAmount() | setSinglePaymentMaxAmount(Double singlePaymentMaxAmount) |
| `CellPhone` | `String` | Optional | Cell Phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getCellPhone() | setCellPhone(String cellPhone) |
| `Id` | `String` | Required | Quick Invoice ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `CreatedUserId` | `String` | Optional | Created User Id<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getCreatedUserId() | setCreatedUserId(String createdUserId) |
| `ModifiedUserId` | `String` | Optional | Modified User Id<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getModifiedUserId() | setModifiedUserId(String modifiedUserId) |
| `Active` | `Boolean` | Optional | Active status | Boolean getActive() | setActive(Boolean active) |
| `IsActive` | `Boolean` | Optional | Register is active | Boolean getIsActive() | setIsActive(Boolean isActive) |

## Example (as JSON)

```json
{
  "location_id": "11e95f8ec39de8fbdb0a4f1a",
  "title": "My terminal",
  "cc_product_transaction_id": "11e95f8ec39de8fbdb0a4f1a",
  "due_date": "2021-12-01",
  "item_list": {
    "name": "Bread",
    "amount": 20.15
  },
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "created_ts": null,
  "modified_ts": null
}
```

