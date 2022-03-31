
# Filter 11

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdditionalAmounts` | `String` | Optional | - | String getAdditionalAmounts() | setAdditionalAmounts(String additionalAmounts) |
| `BillingCity` | `String` | Optional | - | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingPhone` | `String` | Optional | - | String getBillingPhone() | setBillingPhone(String billingPhone) |
| `BillingState` | `String` | Optional | - | String getBillingState() | setBillingState(String billingState) |
| `BillingStreet` | `String` | Optional | - | String getBillingStreet() | setBillingStreet(String billingStreet) |
| `BillingZip` | `String` | Optional | - | String getBillingZip() | setBillingZip(String billingZip) |
| `CheckinDate` | `String` | Optional | - | String getCheckinDate() | setCheckinDate(String checkinDate) |
| `CheckoutDate` | `String` | Optional | - | String getCheckoutDate() | setCheckoutDate(String checkoutDate) |
| `ClerkNumber` | `String` | Optional | - | String getClerkNumber() | setClerkNumber(String clerkNumber) |
| `ContactApiId` | `String` | Optional | - | String getContactApiId() | setContactApiId(String contactApiId) |
| `ContactId` | `String` | Optional | - | String getContactId() | setContactId(String contactId) |
| `CustomData` | `String` | Optional | - | String getCustomData() | setCustomData(String customData) |
| `CustomerId` | `String` | Optional | - | String getCustomerId() | setCustomerId(String customerId) |
| `CustomerIp` | `String` | Optional | - | String getCustomerIp() | setCustomerIp(String customerIp) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `DlNumber` | `String` | Optional | - | String getDlNumber() | setDlNumber(String dlNumber) |
| `DlState` | `String` | Optional | - | String getDlState() | setDlState(String dlState) |
| `DobYear` | `String` | Optional | - | String getDobYear() | setDobYear(String dobYear) |
| `IiasInd` | `String` | Optional | - | String getIiasInd() | setIiasInd(String iiasInd) |
| `ImageFront` | `String` | Optional | - | String getImageFront() | setImageFront(String imageFront) |
| `ImageBack` | `String` | Optional | - | String getImageBack() | setImageBack(String imageBack) |
| `Installment` | `String` | Optional | - | String getInstallment() | setInstallment(String installment) |
| `InstallmentNumber` | `String` | Optional | - | String getInstallmentNumber() | setInstallmentNumber(String installmentNumber) |
| `InstallmentCount` | `String` | Optional | - | String getInstallmentCount() | setInstallmentCount(String installmentCount) |
| `LocationApiId` | `String` | Optional | - | String getLocationApiId() | setLocationApiId(String locationApiId) |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `NoShow` | `String` | Optional | - | String getNoShow() | setNoShow(String noShow) |
| `NotificationEmailAddress` | `String` | Optional | - | String getNotificationEmailAddress() | setNotificationEmailAddress(String notificationEmailAddress) |
| `OrderNum` | `String` | Optional | - | String getOrderNum() | setOrderNum(String orderNum) |
| `PoNumber` | `String` | Optional | - | String getPoNumber() | setPoNumber(String poNumber) |
| `PreviousTransactionId` | `String` | Optional | - | String getPreviousTransactionId() | setPreviousTransactionId(String previousTransactionId) |
| `ProductTransactionId` | `String` | Optional | - | String getProductTransactionId() | setProductTransactionId(String productTransactionId) |
| `QuickInvoiceId` | `String` | Optional | - | String getQuickInvoiceId() | setQuickInvoiceId(String quickInvoiceId) |
| `Recurring` | `String` | Optional | - | String getRecurring() | setRecurring(String recurring) |
| `RecurringNumber` | `String` | Optional | - | String getRecurringNumber() | setRecurringNumber(String recurringNumber) |
| `RoomNum` | `String` | Optional | - | String getRoomNum() | setRoomNum(String roomNum) |
| `RoomRate` | `String` | Optional | - | String getRoomRate() | setRoomRate(String roomRate) |
| `SaveAccount` | `String` | Optional | - | String getSaveAccount() | setSaveAccount(String saveAccount) |
| `SaveAccountTitle` | `String` | Optional | - | String getSaveAccountTitle() | setSaveAccountTitle(String saveAccountTitle) |
| `SettleDate` | `String` | Optional | - | String getSettleDate() | setSettleDate(String settleDate) |
| `StatusId` | `String` | Optional | - | String getStatusId() | setStatusId(String statusId) |
| `SubtotalAmount` | `String` | Optional | - | String getSubtotalAmount() | setSubtotalAmount(String subtotalAmount) |
| `SurchargeAmount` | `String` | Optional | - | String getSurchargeAmount() | setSurchargeAmount(String surchargeAmount) |
| `Tags` | `String` | Optional | - | String getTags() | setTags(String tags) |
| `Safe` | `String` | Optional | - | String getSafe() | setSafe(String safe) |
| `Tax` | `String` | Optional | - | String getTax() | setTax(String tax) |
| `TerminalId` | `String` | Optional | - | String getTerminalId() | setTerminalId(String terminalId) |
| `TermsAgree` | `String` | Optional | - | String getTermsAgree() | setTermsAgree(String termsAgree) |
| `TermsAgreeIp` | `String` | Optional | - | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `Ticket` | `String` | Optional | - | String getTicket() | setTicket(String ticket) |
| `TipAmount` | `String` | Optional | - | String getTipAmount() | setTipAmount(String tipAmount) |
| `TransactionAmount` | `String` | Optional | - | String getTransactionAmount() | setTransactionAmount(String transactionAmount) |
| `TransactionApiId` | `String` | Optional | - | String getTransactionApiId() | setTransactionApiId(String transactionApiId) |
| `TransactionC1` | `String` | Optional | - | String getTransactionC1() | setTransactionC1(String transactionC1) |
| `TransactionC2` | `String` | Optional | - | String getTransactionC2() | setTransactionC2(String transactionC2) |
| `TransactionC3` | `String` | Optional | - | String getTransactionC3() | setTransactionC3(String transactionC3) |
| `TransactionC4` | `String` | Optional | - | String getTransactionC4() | setTransactionC4(String transactionC4) |
| `TrxSourceId` | `String` | Optional | - | String getTrxSourceId() | setTrxSourceId(String trxSourceId) |
| `AccountHolderName` | `String` | Optional | - | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `AccountNumber` | `String` | Optional | - | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountType` | `String` | Optional | - | String getAccountType() | setAccountType(String accountType) |
| `AccountVaultApiId` | `String` | Optional | - | String getAccountVaultApiId() | setAccountVaultApiId(String accountVaultApiId) |
| `AccountVaultId` | `String` | Optional | - | String getAccountVaultId() | setAccountVaultId(String accountVaultId) |
| `AchIdentifier` | `String` | Optional | - | String getAchIdentifier() | setAchIdentifier(String achIdentifier) |
| `AchSecCode` | `String` | Optional | - | String getAchSecCode() | setAchSecCode(String achSecCode) |
| `AdvanceDeposit` | `String` | Optional | - | String getAdvanceDeposit() | setAdvanceDeposit(String advanceDeposit) |
| `AuthAmount` | `String` | Optional | - | String getAuthAmount() | setAuthAmount(String authAmount) |
| `AuthCode` | `String` | Optional | - | String getAuthCode() | setAuthCode(String authCode) |
| `Avs` | `String` | Optional | - | String getAvs() | setAvs(String avs) |
| `AvsEnhanced` | `String` | Optional | - | String getAvsEnhanced() | setAvsEnhanced(String avsEnhanced) |
| `CardholderPresent` | `String` | Optional | - | String getCardholderPresent() | setCardholderPresent(String cardholderPresent) |
| `CardPresent` | `String` | Optional | - | String getCardPresent() | setCardPresent(String cardPresent) |
| `CheckNumber` | `String` | Optional | - | String getCheckNumber() | setCheckNumber(String checkNumber) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `Cvv` | `String` | Optional | - | String getCvv() | setCvv(String cvv) |
| `CvvResponse` | `String` | Optional | - | String getCvvResponse() | setCvvResponse(String cvvResponse) |
| `EFormat` | `String` | Optional | - | String getEFormat() | setEFormat(String eFormat) |
| `ETrackData` | `String` | Optional | - | String getETrackData() | setETrackData(String eTrackData) |
| `ESerialNumber` | `String` | Optional | - | String getESerialNumber() | setESerialNumber(String eSerialNumber) |
| `EntryModeId` | `String` | Optional | - | String getEntryModeId() | setEntryModeId(String entryModeId) |
| `EmvReceiptData` | `String` | Optional | - | String getEmvReceiptData() | setEmvReceiptData(String emvReceiptData) |
| `FirstSix` | `String` | Optional | - | String getFirstSix() | setFirstSix(String firstSix) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `LastFour` | `String` | Optional | - | String getLastFour() | setLastFour(String lastFour) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `PaymentMethod` | `String` | Optional | - | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `SecureAuthData` | `String` | Optional | - | String getSecureAuthData() | setSecureAuthData(String secureAuthData) |
| `SecureProtocolVersion` | `String` | Optional | - | String getSecureProtocolVersion() | setSecureProtocolVersion(String secureProtocolVersion) |
| `SecureCollectionIndicator` | `String` | Optional | - | String getSecureCollectionIndicator() | setSecureCollectionIndicator(String secureCollectionIndicator) |
| `SecureCrytogram` | `String` | Optional | - | String getSecureCrytogram() | setSecureCrytogram(String secureCrytogram) |
| `SecureDirectoryServerTransactionId` | `String` | Optional | - | String getSecureDirectoryServerTransactionId() | setSecureDirectoryServerTransactionId(String secureDirectoryServerTransactionId) |
| `SecureEcommUrl` | `String` | Optional | - | String getSecureEcommUrl() | setSecureEcommUrl(String secureEcommUrl) |
| `TerminalSerialNumber` | `String` | Optional | - | String getTerminalSerialNumber() | setTerminalSerialNumber(String terminalSerialNumber) |
| `Threedsecure` | `String` | Optional | - | String getThreedsecure() | setThreedsecure(String threedsecure) |
| `TrackData` | `String` | Optional | - | String getTrackData() | setTrackData(String trackData) |
| `TransactionSettlementStatus` | `String` | Optional | - | String getTransactionSettlementStatus() | setTransactionSettlementStatus(String transactionSettlementStatus) |
| `ChargeBackDate` | `String` | Optional | - | String getChargeBackDate() | setChargeBackDate(String chargeBackDate) |
| `IsRecurring` | `String` | Optional | - | String getIsRecurring() | setIsRecurring(String isRecurring) |
| `NotificationEmailSent` | `String` | Optional | - | String getNotificationEmailSent() | setNotificationEmailSent(String notificationEmailSent) |
| `Par` | `String` | Optional | - | String getPar() | setPar(String par) |
| `ReasonCodeId` | `String` | Optional | - | String getReasonCodeId() | setReasonCodeId(String reasonCodeId) |
| `RecurringId` | `String` | Optional | - | String getRecurringId() | setRecurringId(String recurringId) |
| `TransactionBatchId` | `String` | Optional | - | String getTransactionBatchId() | setTransactionBatchId(String transactionBatchId) |
| `TypeId` | `String` | Optional | - | String getTypeId() | setTypeId(String typeId) |
| `Verbiage` | `String` | Optional | - | String getVerbiage() | setVerbiage(String verbiage) |
| `VoidDate` | `String` | Optional | - | String getVoidDate() | setVoidDate(String voidDate) |
| `Batch` | `String` | Optional | - | String getBatch() | setBatch(String batch) |
| `ResponseMessage` | `String` | Optional | - | String getResponseMessage() | setResponseMessage(String responseMessage) |
| `ReturnDate` | `String` | Optional | - | String getReturnDate() | setReturnDate(String returnDate) |

## Example (as JSON)

```json
{
  "additional_amounts": null,
  "billing_city": null,
  "billing_phone": null,
  "billing_state": null,
  "billing_street": null,
  "billing_zip": null,
  "checkin_date": null,
  "checkout_date": null,
  "clerk_number": null,
  "contact_api_id": null,
  "contact_id": null,
  "custom_data": null,
  "customer_id": null,
  "customer_ip": null,
  "description": null,
  "dl_number": null,
  "dl_state": null,
  "dob_year": null,
  "iias_ind": null,
  "image_front": null,
  "image_back": null,
  "installment": null,
  "installment_number": null,
  "installment_count": null,
  "location_api_id": null,
  "location_id": null,
  "no_show": null,
  "notification_email_address": null,
  "order_num": null,
  "po_number": null,
  "previous_transaction_id": null,
  "product_transaction_id": null,
  "quick_invoice_id": null,
  "recurring": null,
  "recurring_number": null,
  "room_num": null,
  "room_rate": null,
  "save_account": null,
  "save_account_title": null,
  "settle_date": null,
  "status_id": null,
  "subtotal_amount": null,
  "surcharge_amount": null,
  "tags": null,
  "safe": null,
  "tax": null,
  "terminal_id": null,
  "terms_agree": null,
  "terms_agree_ip": null,
  "ticket": null,
  "tip_amount": null,
  "transaction_amount": null,
  "transaction_api_id": null,
  "transaction_c1": null,
  "transaction_c2": null,
  "transaction_c3": null,
  "transaction_c4": null,
  "trx_source_id": null,
  "account_holder_name": null,
  "account_number": null,
  "account_type": null,
  "account_vault_api_id": null,
  "account_vault_id": null,
  "ach_identifier": null,
  "ach_sec_code": null,
  "advance_deposit": null,
  "auth_amount": null,
  "auth_code": null,
  "avs": null,
  "avs_enhanced": null,
  "cardholder_present": null,
  "card_present": null,
  "check_number": null,
  "created_ts": null,
  "cvv": null,
  "cvv_response": null,
  "e_format": null,
  "e_track_data": null,
  "e_serial_number": null,
  "entry_mode_id": null,
  "emv_receipt_data": null,
  "first_six": null,
  "id": null,
  "last_four": null,
  "modified_ts": null,
  "payment_method": null,
  "secure_auth_data": null,
  "secure_protocol_version": null,
  "secure_collection_indicator": null,
  "secure_crytogram": null,
  "secure_directory_server_transaction_id": null,
  "secure_ecomm_url": null,
  "terminal_serial_number": null,
  "threedsecure": null,
  "track_data": null,
  "transaction_settlement_status": null,
  "charge_back_date": null,
  "is_recurring": null,
  "notification_email_sent": null,
  "par": null,
  "reason_code_id": null,
  "recurring_id": null,
  "transaction_batch_id": null,
  "type_id": null,
  "verbiage": null,
  "void_date": null,
  "batch": null,
  "response_message": null,
  "return_date": null
}
```

