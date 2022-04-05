
# Sort 11

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdditionalAmounts` | [`AdditionalAmountsEnum`](../../doc/models/additional-amounts-enum.md) | Optional | - | AdditionalAmountsEnum getAdditionalAmounts() | setAdditionalAmounts(AdditionalAmountsEnum additionalAmounts) |
| `BillingCity` | [`BillingCityEnum`](../../doc/models/billing-city-enum.md) | Optional | - | BillingCityEnum getBillingCity() | setBillingCity(BillingCityEnum billingCity) |
| `BillingPhone` | [`BillingPhoneEnum`](../../doc/models/billing-phone-enum.md) | Optional | - | BillingPhoneEnum getBillingPhone() | setBillingPhone(BillingPhoneEnum billingPhone) |
| `BillingState` | [`BillingStateEnum`](../../doc/models/billing-state-enum.md) | Optional | - | BillingStateEnum getBillingState() | setBillingState(BillingStateEnum billingState) |
| `BillingStreet` | [`BillingStreetEnum`](../../doc/models/billing-street-enum.md) | Optional | - | BillingStreetEnum getBillingStreet() | setBillingStreet(BillingStreetEnum billingStreet) |
| `BillingZip` | [`BillingZipEnum`](../../doc/models/billing-zip-enum.md) | Optional | - | BillingZipEnum getBillingZip() | setBillingZip(BillingZipEnum billingZip) |
| `CheckinDate` | [`CheckinDateEnum`](../../doc/models/checkin-date-enum.md) | Optional | - | CheckinDateEnum getCheckinDate() | setCheckinDate(CheckinDateEnum checkinDate) |
| `CheckoutDate` | [`CheckoutDateEnum`](../../doc/models/checkout-date-enum.md) | Optional | - | CheckoutDateEnum getCheckoutDate() | setCheckoutDate(CheckoutDateEnum checkoutDate) |
| `ClerkNumber` | [`ClerkNumberEnum`](../../doc/models/clerk-number-enum.md) | Optional | - | ClerkNumberEnum getClerkNumber() | setClerkNumber(ClerkNumberEnum clerkNumber) |
| `ContactApiId` | [`ContactApiIdEnum`](../../doc/models/contact-api-id-enum.md) | Optional | - | ContactApiIdEnum getContactApiId() | setContactApiId(ContactApiIdEnum contactApiId) |
| `ContactId` | [`ContactIdEnum`](../../doc/models/contact-id-enum.md) | Optional | - | ContactIdEnum getContactId() | setContactId(ContactIdEnum contactId) |
| `CustomData` | [`CustomDataEnum`](../../doc/models/custom-data-enum.md) | Optional | - | CustomDataEnum getCustomData() | setCustomData(CustomDataEnum customData) |
| `CustomerId` | [`CustomerIdEnum`](../../doc/models/customer-id-enum.md) | Optional | - | CustomerIdEnum getCustomerId() | setCustomerId(CustomerIdEnum customerId) |
| `CustomerIp` | [`CustomerIpEnum`](../../doc/models/customer-ip-enum.md) | Optional | - | CustomerIpEnum getCustomerIp() | setCustomerIp(CustomerIpEnum customerIp) |
| `Description` | [`DescriptionEnum`](../../doc/models/description-enum.md) | Optional | - | DescriptionEnum getDescription() | setDescription(DescriptionEnum description) |
| `DlNumber` | [`DlNumberEnum`](../../doc/models/dl-number-enum.md) | Optional | - | DlNumberEnum getDlNumber() | setDlNumber(DlNumberEnum dlNumber) |
| `DlState` | [`DlStateEnum`](../../doc/models/dl-state-enum.md) | Optional | - | DlStateEnum getDlState() | setDlState(DlStateEnum dlState) |
| `DobYear` | [`DobYearEnum`](../../doc/models/dob-year-enum.md) | Optional | - | DobYearEnum getDobYear() | setDobYear(DobYearEnum dobYear) |
| `IiasInd` | [`IiasIndEnum`](../../doc/models/iias-ind-enum.md) | Optional | - | IiasIndEnum getIiasInd() | setIiasInd(IiasIndEnum iiasInd) |
| `ImageFront` | [`ImageFrontEnum`](../../doc/models/image-front-enum.md) | Optional | - | ImageFrontEnum getImageFront() | setImageFront(ImageFrontEnum imageFront) |
| `ImageBack` | [`ImageBackEnum`](../../doc/models/image-back-enum.md) | Optional | - | ImageBackEnum getImageBack() | setImageBack(ImageBackEnum imageBack) |
| `Installment` | [`InstallmentEnum`](../../doc/models/installment-enum.md) | Optional | - | InstallmentEnum getInstallment() | setInstallment(InstallmentEnum installment) |
| `InstallmentNumber` | [`InstallmentNumberEnum`](../../doc/models/installment-number-enum.md) | Optional | - | InstallmentNumberEnum getInstallmentNumber() | setInstallmentNumber(InstallmentNumberEnum installmentNumber) |
| `InstallmentCount` | [`InstallmentCountEnum`](../../doc/models/installment-count-enum.md) | Optional | - | InstallmentCountEnum getInstallmentCount() | setInstallmentCount(InstallmentCountEnum installmentCount) |
| `LocationApiId` | [`LocationApiIdEnum`](../../doc/models/location-api-id-enum.md) | Optional | - | LocationApiIdEnum getLocationApiId() | setLocationApiId(LocationApiIdEnum locationApiId) |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `NoShow` | [`NoShowEnum`](../../doc/models/no-show-enum.md) | Optional | - | NoShowEnum getNoShow() | setNoShow(NoShowEnum noShow) |
| `NotificationEmailAddress` | [`NotificationEmailAddressEnum`](../../doc/models/notification-email-address-enum.md) | Optional | - | NotificationEmailAddressEnum getNotificationEmailAddress() | setNotificationEmailAddress(NotificationEmailAddressEnum notificationEmailAddress) |
| `OrderNum` | [`OrderNumEnum`](../../doc/models/order-num-enum.md) | Optional | - | OrderNumEnum getOrderNum() | setOrderNum(OrderNumEnum orderNum) |
| `PoNumber` | [`PoNumberEnum`](../../doc/models/po-number-enum.md) | Optional | - | PoNumberEnum getPoNumber() | setPoNumber(PoNumberEnum poNumber) |
| `PreviousTransactionId` | [`PreviousTransactionIdEnum`](../../doc/models/previous-transaction-id-enum.md) | Optional | - | PreviousTransactionIdEnum getPreviousTransactionId() | setPreviousTransactionId(PreviousTransactionIdEnum previousTransactionId) |
| `ProductTransactionId` | [`ProductTransactionIdEnum`](../../doc/models/product-transaction-id-enum.md) | Optional | - | ProductTransactionIdEnum getProductTransactionId() | setProductTransactionId(ProductTransactionIdEnum productTransactionId) |
| `QuickInvoiceId` | [`QuickInvoiceIdEnum`](../../doc/models/quick-invoice-id-enum.md) | Optional | - | QuickInvoiceIdEnum getQuickInvoiceId() | setQuickInvoiceId(QuickInvoiceIdEnum quickInvoiceId) |
| `Recurring` | [`RecurringEnum`](../../doc/models/recurring-enum.md) | Optional | - | RecurringEnum getRecurring() | setRecurring(RecurringEnum recurring) |
| `RecurringNumber` | [`RecurringNumberEnum`](../../doc/models/recurring-number-enum.md) | Optional | - | RecurringNumberEnum getRecurringNumber() | setRecurringNumber(RecurringNumberEnum recurringNumber) |
| `RoomNum` | [`RoomNumEnum`](../../doc/models/room-num-enum.md) | Optional | - | RoomNumEnum getRoomNum() | setRoomNum(RoomNumEnum roomNum) |
| `RoomRate` | [`RoomRateEnum`](../../doc/models/room-rate-enum.md) | Optional | - | RoomRateEnum getRoomRate() | setRoomRate(RoomRateEnum roomRate) |
| `SaveAccount` | [`SaveAccountEnum`](../../doc/models/save-account-enum.md) | Optional | - | SaveAccountEnum getSaveAccount() | setSaveAccount(SaveAccountEnum saveAccount) |
| `SaveAccountTitle` | [`SaveAccountTitleEnum`](../../doc/models/save-account-title-enum.md) | Optional | - | SaveAccountTitleEnum getSaveAccountTitle() | setSaveAccountTitle(SaveAccountTitleEnum saveAccountTitle) |
| `SettleDate` | [`SettleDateEnum`](../../doc/models/settle-date-enum.md) | Optional | - | SettleDateEnum getSettleDate() | setSettleDate(SettleDateEnum settleDate) |
| `StatusId` | [`StatusIdEnum`](../../doc/models/status-id-enum.md) | Optional | - | StatusIdEnum getStatusId() | setStatusId(StatusIdEnum statusId) |
| `SubtotalAmount` | [`SubtotalAmountEnum`](../../doc/models/subtotal-amount-enum.md) | Optional | - | SubtotalAmountEnum getSubtotalAmount() | setSubtotalAmount(SubtotalAmountEnum subtotalAmount) |
| `SurchargeAmount` | [`SurchargeAmountEnum`](../../doc/models/surcharge-amount-enum.md) | Optional | - | SurchargeAmountEnum getSurchargeAmount() | setSurchargeAmount(SurchargeAmountEnum surchargeAmount) |
| `Tags` | [`TagsEnum`](../../doc/models/tags-enum.md) | Optional | - | TagsEnum getTags() | setTags(TagsEnum tags) |
| `Safe` | [`SafeEnum`](../../doc/models/safe-enum.md) | Optional | - | SafeEnum getSafe() | setSafe(SafeEnum safe) |
| `Tax` | [`TaxEnum`](../../doc/models/tax-enum.md) | Optional | - | TaxEnum getTax() | setTax(TaxEnum tax) |
| `TerminalId` | [`TerminalIdEnum`](../../doc/models/terminal-id-enum.md) | Optional | - | TerminalIdEnum getTerminalId() | setTerminalId(TerminalIdEnum terminalId) |
| `TermsAgree` | [`TermsAgreeEnum`](../../doc/models/terms-agree-enum.md) | Optional | - | TermsAgreeEnum getTermsAgree() | setTermsAgree(TermsAgreeEnum termsAgree) |
| `TermsAgreeIp` | [`TermsAgreeIpEnum`](../../doc/models/terms-agree-ip-enum.md) | Optional | - | TermsAgreeIpEnum getTermsAgreeIp() | setTermsAgreeIp(TermsAgreeIpEnum termsAgreeIp) |
| `Ticket` | [`TicketEnum`](../../doc/models/ticket-enum.md) | Optional | - | TicketEnum getTicket() | setTicket(TicketEnum ticket) |
| `TipAmount` | [`TipAmountEnum`](../../doc/models/tip-amount-enum.md) | Optional | - | TipAmountEnum getTipAmount() | setTipAmount(TipAmountEnum tipAmount) |
| `TransactionAmount` | [`TransactionAmountEnum`](../../doc/models/transaction-amount-enum.md) | Optional | - | TransactionAmountEnum getTransactionAmount() | setTransactionAmount(TransactionAmountEnum transactionAmount) |
| `TransactionApiId` | [`TransactionApiIdEnum`](../../doc/models/transaction-api-id-enum.md) | Optional | - | TransactionApiIdEnum getTransactionApiId() | setTransactionApiId(TransactionApiIdEnum transactionApiId) |
| `TransactionC1` | [`TransactionC1Enum`](../../doc/models/transaction-c1-enum.md) | Optional | - | TransactionC1Enum getTransactionC1() | setTransactionC1(TransactionC1Enum transactionC1) |
| `TransactionC2` | [`TransactionC1Enum`](../../doc/models/transaction-c1-enum.md) | Optional | - | TransactionC1Enum getTransactionC2() | setTransactionC2(TransactionC1Enum transactionC2) |
| `TransactionC3` | [`TransactionC1Enum`](../../doc/models/transaction-c1-enum.md) | Optional | - | TransactionC1Enum getTransactionC3() | setTransactionC3(TransactionC1Enum transactionC3) |
| `TransactionC4` | [`TransactionC1Enum`](../../doc/models/transaction-c1-enum.md) | Optional | - | TransactionC1Enum getTransactionC4() | setTransactionC4(TransactionC1Enum transactionC4) |
| `TrxSourceId` | [`TrxSourceIdEnum`](../../doc/models/trx-source-id-enum.md) | Optional | - | TrxSourceIdEnum getTrxSourceId() | setTrxSourceId(TrxSourceIdEnum trxSourceId) |
| `AccountHolderName` | [`AccountHolderNameEnum`](../../doc/models/account-holder-name-enum.md) | Optional | - | AccountHolderNameEnum getAccountHolderName() | setAccountHolderName(AccountHolderNameEnum accountHolderName) |
| `AccountNumber` | [`AccountNumberEnum`](../../doc/models/account-number-enum.md) | Optional | - | AccountNumberEnum getAccountNumber() | setAccountNumber(AccountNumberEnum accountNumber) |
| `AccountType` | [`AccountType3Enum`](../../doc/models/account-type-3-enum.md) | Optional | - | AccountType3Enum getAccountType() | setAccountType(AccountType3Enum accountType) |
| `AccountVaultApiId` | [`AccountVaultApiIdEnum`](../../doc/models/account-vault-api-id-enum.md) | Optional | - | AccountVaultApiIdEnum getAccountVaultApiId() | setAccountVaultApiId(AccountVaultApiIdEnum accountVaultApiId) |
| `AccountVaultId` | [`AccountVaultIdEnum`](../../doc/models/account-vault-id-enum.md) | Optional | - | AccountVaultIdEnum getAccountVaultId() | setAccountVaultId(AccountVaultIdEnum accountVaultId) |
| `AchIdentifier` | [`AchIdentifierEnum`](../../doc/models/ach-identifier-enum.md) | Optional | - | AchIdentifierEnum getAchIdentifier() | setAchIdentifier(AchIdentifierEnum achIdentifier) |
| `AchSecCode` | [`AchSecCode2Enum`](../../doc/models/ach-sec-code-2-enum.md) | Optional | - | AchSecCode2Enum getAchSecCode() | setAchSecCode(AchSecCode2Enum achSecCode) |
| `AdvanceDeposit` | [`AdvanceDepositEnum`](../../doc/models/advance-deposit-enum.md) | Optional | - | AdvanceDepositEnum getAdvanceDeposit() | setAdvanceDeposit(AdvanceDepositEnum advanceDeposit) |
| `AuthAmount` | [`AuthAmountEnum`](../../doc/models/auth-amount-enum.md) | Optional | - | AuthAmountEnum getAuthAmount() | setAuthAmount(AuthAmountEnum authAmount) |
| `AuthCode` | [`AuthCodeEnum`](../../doc/models/auth-code-enum.md) | Optional | - | AuthCodeEnum getAuthCode() | setAuthCode(AuthCodeEnum authCode) |
| `Avs` | [`Avs2Enum`](../../doc/models/avs-2-enum.md) | Optional | - | Avs2Enum getAvs() | setAvs(Avs2Enum avs) |
| `AvsEnhanced` | [`AvsEnhancedEnum`](../../doc/models/avs-enhanced-enum.md) | Optional | - | AvsEnhancedEnum getAvsEnhanced() | setAvsEnhanced(AvsEnhancedEnum avsEnhanced) |
| `CardholderPresent` | [`CardholderPresentEnum`](../../doc/models/cardholder-present-enum.md) | Optional | - | CardholderPresentEnum getCardholderPresent() | setCardholderPresent(CardholderPresentEnum cardholderPresent) |
| `CardPresent` | [`CardPresentEnum`](../../doc/models/card-present-enum.md) | Optional | - | CardPresentEnum getCardPresent() | setCardPresent(CardPresentEnum cardPresent) |
| `CheckNumber` | [`CheckNumberEnum`](../../doc/models/check-number-enum.md) | Optional | - | CheckNumberEnum getCheckNumber() | setCheckNumber(CheckNumberEnum checkNumber) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `Cvv` | [`CvvEnum`](../../doc/models/cvv-enum.md) | Optional | - | CvvEnum getCvv() | setCvv(CvvEnum cvv) |
| `CvvResponse` | [`CvvResponseEnum`](../../doc/models/cvv-response-enum.md) | Optional | - | CvvResponseEnum getCvvResponse() | setCvvResponse(CvvResponseEnum cvvResponse) |
| `EFormat` | [`EFormat2Enum`](../../doc/models/e-format-2-enum.md) | Optional | - | EFormat2Enum getEFormat() | setEFormat(EFormat2Enum eFormat) |
| `ETrackData` | [`ETrackDataEnum`](../../doc/models/e-track-data-enum.md) | Optional | - | ETrackDataEnum getETrackData() | setETrackData(ETrackDataEnum eTrackData) |
| `ESerialNumber` | [`ESerialNumberEnum`](../../doc/models/e-serial-number-enum.md) | Optional | - | ESerialNumberEnum getESerialNumber() | setESerialNumber(ESerialNumberEnum eSerialNumber) |
| `EntryModeId` | [`EntryModeId7Enum`](../../doc/models/entry-mode-id-7-enum.md) | Optional | - | EntryModeId7Enum getEntryModeId() | setEntryModeId(EntryModeId7Enum entryModeId) |
| `EmvReceiptData` | [`EmvReceiptDataEnum`](../../doc/models/emv-receipt-data-enum.md) | Optional | - | EmvReceiptDataEnum getEmvReceiptData() | setEmvReceiptData(EmvReceiptDataEnum emvReceiptData) |
| `FirstSix` | [`FirstSixEnum`](../../doc/models/first-six-enum.md) | Optional | - | FirstSixEnum getFirstSix() | setFirstSix(FirstSixEnum firstSix) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `LastFour` | [`LastFourEnum`](../../doc/models/last-four-enum.md) | Optional | - | LastFourEnum getLastFour() | setLastFour(LastFourEnum lastFour) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `PaymentMethod` | [`PaymentMethod7Enum`](../../doc/models/payment-method-7-enum.md) | Optional | - | PaymentMethod7Enum getPaymentMethod() | setPaymentMethod(PaymentMethod7Enum paymentMethod) |
| `SecureAuthData` | [`SecureAuthDataEnum`](../../doc/models/secure-auth-data-enum.md) | Optional | - | SecureAuthDataEnum getSecureAuthData() | setSecureAuthData(SecureAuthDataEnum secureAuthData) |
| `SecureProtocolVersion` | [`SecureProtocolVersionEnum`](../../doc/models/secure-protocol-version-enum.md) | Optional | - | SecureProtocolVersionEnum getSecureProtocolVersion() | setSecureProtocolVersion(SecureProtocolVersionEnum secureProtocolVersion) |
| `SecureCollectionIndicator` | [`SecureCollectionIndicatorEnum`](../../doc/models/secure-collection-indicator-enum.md) | Optional | - | SecureCollectionIndicatorEnum getSecureCollectionIndicator() | setSecureCollectionIndicator(SecureCollectionIndicatorEnum secureCollectionIndicator) |
| `SecureCrytogram` | [`SecureCrytogramEnum`](../../doc/models/secure-crytogram-enum.md) | Optional | - | SecureCrytogramEnum getSecureCrytogram() | setSecureCrytogram(SecureCrytogramEnum secureCrytogram) |
| `SecureDirectoryServerTransactionId` | [`SecureDirectoryServerTransactionIdEnum`](../../doc/models/secure-directory-server-transaction-id-enum.md) | Optional | - | SecureDirectoryServerTransactionIdEnum getSecureDirectoryServerTransactionId() | setSecureDirectoryServerTransactionId(SecureDirectoryServerTransactionIdEnum secureDirectoryServerTransactionId) |
| `SecureEcommUrl` | [`SecureEcommUrlEnum`](../../doc/models/secure-ecomm-url-enum.md) | Optional | - | SecureEcommUrlEnum getSecureEcommUrl() | setSecureEcommUrl(SecureEcommUrlEnum secureEcommUrl) |
| `TerminalSerialNumber` | [`TerminalSerialNumberEnum`](../../doc/models/terminal-serial-number-enum.md) | Optional | - | TerminalSerialNumberEnum getTerminalSerialNumber() | setTerminalSerialNumber(TerminalSerialNumberEnum terminalSerialNumber) |
| `Threedsecure` | [`ThreedsecureEnum`](../../doc/models/threedsecure-enum.md) | Optional | - | ThreedsecureEnum getThreedsecure() | setThreedsecure(ThreedsecureEnum threedsecure) |
| `TrackData` | [`TrackDataEnum`](../../doc/models/track-data-enum.md) | Optional | - | TrackDataEnum getTrackData() | setTrackData(TrackDataEnum trackData) |
| `TransactionSettlementStatus` | [`TransactionSettlementStatusEnum`](../../doc/models/transaction-settlement-status-enum.md) | Optional | - | TransactionSettlementStatusEnum getTransactionSettlementStatus() | setTransactionSettlementStatus(TransactionSettlementStatusEnum transactionSettlementStatus) |
| `ChargeBackDate` | [`ChargeBackDateEnum`](../../doc/models/charge-back-date-enum.md) | Optional | - | ChargeBackDateEnum getChargeBackDate() | setChargeBackDate(ChargeBackDateEnum chargeBackDate) |
| `IsRecurring` | [`IsRecurringEnum`](../../doc/models/is-recurring-enum.md) | Optional | - | IsRecurringEnum getIsRecurring() | setIsRecurring(IsRecurringEnum isRecurring) |
| `NotificationEmailSent` | [`NotificationEmailSentEnum`](../../doc/models/notification-email-sent-enum.md) | Optional | - | NotificationEmailSentEnum getNotificationEmailSent() | setNotificationEmailSent(NotificationEmailSentEnum notificationEmailSent) |
| `Par` | [`ParEnum`](../../doc/models/par-enum.md) | Optional | - | ParEnum getPar() | setPar(ParEnum par) |
| `ReasonCodeId` | [`ReasonCodeIdEnum`](../../doc/models/reason-code-id-enum.md) | Optional | - | ReasonCodeIdEnum getReasonCodeId() | setReasonCodeId(ReasonCodeIdEnum reasonCodeId) |
| `RecurringId` | [`RecurringIdEnum`](../../doc/models/recurring-id-enum.md) | Optional | - | RecurringIdEnum getRecurringId() | setRecurringId(RecurringIdEnum recurringId) |
| `TransactionBatchId` | [`TransactionBatchIdEnum`](../../doc/models/transaction-batch-id-enum.md) | Optional | - | TransactionBatchIdEnum getTransactionBatchId() | setTransactionBatchId(TransactionBatchIdEnum transactionBatchId) |
| `TypeId` | [`TypeId2Enum`](../../doc/models/type-id-2-enum.md) | Optional | - | TypeId2Enum getTypeId() | setTypeId(TypeId2Enum typeId) |
| `Verbiage` | [`VerbiageEnum`](../../doc/models/verbiage-enum.md) | Optional | - | VerbiageEnum getVerbiage() | setVerbiage(VerbiageEnum verbiage) |
| `VoidDate` | [`VoidDateEnum`](../../doc/models/void-date-enum.md) | Optional | - | VoidDateEnum getVoidDate() | setVoidDate(VoidDateEnum voidDate) |
| `Batch` | [`BatchEnum`](../../doc/models/batch-enum.md) | Optional | - | BatchEnum getBatch() | setBatch(BatchEnum batch) |
| `ResponseMessage` | [`ResponseMessageEnum`](../../doc/models/response-message-enum.md) | Optional | - | ResponseMessageEnum getResponseMessage() | setResponseMessage(ResponseMessageEnum responseMessage) |
| `ReturnDate` | [`ReturnDateEnum`](../../doc/models/return-date-enum.md) | Optional | - | ReturnDateEnum getReturnDate() | setReturnDate(ReturnDateEnum returnDate) |

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

