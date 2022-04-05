
# Data 13

## Structure

`Data13`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdditionalAmounts` | [`List<AdditionalAmount>`](../../doc/models/additional-amount.md) | Optional | Additional amounts | List<AdditionalAmount> getAdditionalAmounts() | setAdditionalAmounts(List<AdditionalAmount> additionalAmounts) |
| `BillingCity` | `String` | Optional | The City portion of the address associated with the Credit Card (CC) or Bank Account (ACH).<br>**Constraints**: *Maximum Length*: `36` | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingPhone` | `String` | Optional | The Phone # to be used to contact Payer if there are any issues processing a transaction.<br>**Constraints**: *Maximum Length*: `10` | String getBillingPhone() | setBillingPhone(String billingPhone) |
| `BillingState` | `String` | Optional | The State portion of the address associated with the Credit Card (CC) or Bank Account (ACH).<br>**Constraints**: *Maximum Length*: `24` | String getBillingState() | setBillingState(String billingState) |
| `BillingStreet` | `String` | Optional | The Street portion of the address associated with the Credit Card (CC) or Bank Account (ACH).<br>**Constraints**: *Maximum Length*: `32` | String getBillingStreet() | setBillingStreet(String billingStreet) |
| `BillingZip` | `String` | Optional | The Zip or 'Postal Code' portion of the address associated with the Credit Card (CC) or Bank Account (ACH).<br>**Constraints**: *Maximum Length*: `10` | String getBillingZip() | setBillingZip(String billingZip) |
| `CheckinDate` | `String` | Optional | Checkin Date - The time difference between checkin_date and checkout_date must be less than or equal to 99 days.<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getCheckinDate() | setCheckinDate(String checkinDate) |
| `CheckoutDate` | `String` | Optional | Checkout Date - The time difference between checkin_date and checkout_date must be less than or equal to 99 days.<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getCheckoutDate() | setCheckoutDate(String checkoutDate) |
| `ClerkNumber` | `String` | Optional | Clerk or Employee Identifier<br>**Constraints**: *Maximum Length*: `16` | String getClerkNumber() | setClerkNumber(String clerkNumber) |
| `ContactApiId` | `String` | Optional | This can be supplied in place of contact_id if you would like to use a contact for the transaction and are using your own custom api_id's to track contacts in the system.<br>**Constraints**: *Maximum Length*: `36` | String getContactApiId() | setContactApiId(String contactApiId) |
| `ContactId` | `String` | Optional | If contact_id is provided, ensure it belongs to the same location as the transaction. You cannot move transaction across locations.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getContactId() | setContactId(String contactId) |
| `CustomData` | `String` | Optional | A field that allows custom JSON to be entered to store extra data.<br>**Constraints**: *Maximum Length*: `512` | String getCustomData() | setCustomData(String customData) |
| `CustomerId` | `String` | Optional | Can be used by Merchants to identify Contacts in our system by an ID from another system.<br>**Constraints**: *Maximum Length*: `64` | String getCustomerId() | setCustomerId(String customerId) |
| `CustomerIp` | `String` | Optional | Can be used to store customer IP Address | String getCustomerIp() | setCustomerIp(String customerIp) |
| `Description` | `String` | Optional | Description<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getDescription() | setDescription(String description) |
| `DlNumber` | `String` | Optional | Used for certain ACH transactions where Driver's License is required by the terminal being used.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50` | String getDlNumber() | setDlNumber(String dlNumber) |
| `DlState` | `String` | Optional | Used for certain ACH transactions where Driver's License is required by the terminal being used.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2` | String getDlState() | setDlState(String dlState) |
| `DobYear` | `String` | Optional | Required for certain ACH transactions where Identity Verification has been enabled for the terminal.  Either ssn4 or dob_year will need to be passed in this scenario but NOT BOTH.<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `4` | String getDobYear() | setDobYear(String dobYear) |
| `IiasInd` | `Boolean` | Optional | Possible values are '0', '1','2' | Boolean getIiasInd() | setIiasInd(Boolean iiasInd) |
| `ImageFront` | `String` | Optional | A base64 encoded string for the image.  Used with Check21 ACH transactions. | String getImageFront() | setImageFront(String imageFront) |
| `ImageBack` | `String` | Optional | A base64 encoded string for the image.  Used with Check21 ACH transactions. | String getImageBack() | setImageBack(String imageBack) |
| `Installment` | `Boolean` | Optional | Flag that is allowed to be passed on card not present industries to signify the transaction is a fixed installment plan transaction. | Boolean getInstallment() | setInstallment(Boolean installment) |
| `InstallmentNumber` | `Double` | Optional | If this is a fixed installment plan and installment field is being passed as 1, then this field must have a vlue of 1-999 specifying the current installment number that is running.<br>**Constraints**: `>= 1`, `<= 999` | Double getInstallmentNumber() | setInstallmentNumber(Double installmentNumber) |
| `InstallmentCount` | `Double` | Optional | If this is a fixed installment plan and installment field is being passed as 1, then this field must have a vlue of 1-999 specifying the total number of installments on the plan. This number must be grater than or equal to installment_number.<br>**Constraints**: `>= 1`, `<= 999` | Double getInstallmentCount() | setInstallmentCount(Double installmentCount) |
| `LocationApiId` | `String` | Optional | This can be supplied in place of location_id for the transaction if you are using your own custom api_id's for your locations.<br>**Constraints**: *Maximum Length*: `36` | String getLocationApiId() | setLocationApiId(String locationApiId) |
| `LocationId` | `String` | Optional | A valid Location Id to associate the transaction with.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `NoShow` | `Boolean` | Optional | Used in Lodging | Boolean getNoShow() | setNoShow(Boolean noShow) |
| `NotificationEmailAddress` | `String` | Optional | If email is supplied then receipt will be emailed | String getNotificationEmailAddress() | setNotificationEmailAddress(String notificationEmailAddress) |
| `OrderNum` | `String` | Optional | Required for CC transactions , if merchant's deposit account's duplicate check per batch has 'order_num' field<br>**Constraints**: *Maximum Length*: `32` | String getOrderNum() | setOrderNum(String orderNum) |
| `PoNumber` | `String` | Optional | Purchase Order number<br>**Constraints**: *Maximum Length*: `36` | String getPoNumber() | setPoNumber(String poNumber) |
| `PreviousTransactionId` | `String` | Optional | previous_transaction_id is used as token to run transaction. Account details OR previous_transaction_id should be passed to run transaction.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getPreviousTransactionId() | setPreviousTransactionId(String previousTransactionId) |
| `ProductTransactionId` | `String` | Optional | The Product's method (cc/ach) has to match the action. If not provided, the API will use the default configured for the Location.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getProductTransactionId() | setProductTransactionId(String productTransactionId) |
| `QuickInvoiceId` | `String` | Optional | Can be used to associate a transaction to a Quick Invoice.  Quick Invoice transactions will have a value for this field automatically.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getQuickInvoiceId() | setQuickInvoiceId(String quickInvoiceId) |
| `Recurring` | `Boolean` | Optional | Flag that is allowed to be passed on card not present industries to signify the transaction is an ongoing recurring transaction. Possible values to send are 0 or 1. This field must be 0 or not present if installment is sent as 1. | Boolean getRecurring() | setRecurring(Boolean recurring) |
| `RecurringNumber` | `Double` | Optional | If this is an ongoing recurring and recurring field is being passed as 1, then this field must have a vlue of 1-999 specifying the current recurring number that is running.<br>**Constraints**: `>= 1`, `<= 999` | Double getRecurringNumber() | setRecurringNumber(Double recurringNumber) |
| `RoomNum` | `String` | Optional | Used in Lodging<br>**Constraints**: *Maximum Length*: `12` | String getRoomNum() | setRoomNum(String roomNum) |
| `RoomRate` | `Double` | Optional | Required if merchant industry type is lodging. | Double getRoomRate() | setRoomRate(Double roomRate) |
| `SaveAccount` | `Boolean` | Optional | Specifies to save account to contacts profile if account_number/track_data is present with either contact_id or contact_api_id in params. | Boolean getSaveAccount() | setSaveAccount(Boolean saveAccount) |
| `SaveAccountTitle` | `String` | Optional | If saving account vault while running a transaction, this will be the title of the account vault.<br>**Constraints**: *Maximum Length*: `16` | String getSaveAccountTitle() | setSaveAccountTitle(String saveAccountTitle) |
| `SettleDate` | `String` | Optional | Settle date<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getSettleDate() | setSettleDate(String settleDate) |
| `StatusId` | `Integer` | Optional | Status ID - See status id section for more detail<br>**Constraints**: `<= 999` | Integer getStatusId() | setStatusId(Integer statusId) |
| `SubtotalAmount` | `Double` | Optional | This field is allowed and required for transactions that have a product where surcharge is configured.<br>**Constraints**: `<= 9999999999` | Double getSubtotalAmount() | setSubtotalAmount(Double subtotalAmount) |
| `SurchargeAmount` | `Double` | Optional | This field is allowed and required for transactions that have a product where surcharge is configured.<br>**Constraints**: `<= 9999999999` | Double getSurchargeAmount() | setSurchargeAmount(Double surchargeAmount) |
| `Tags` | `String` | Optional | Tags | String getTags() | setTags(String tags) |
| `Safe` | `String` | Optional | Safe | String getSafe() | setSafe(String safe) |
| `Tax` | `Double` | Optional | Amount of Sales tax - If supplied, this amount should be included in the total transaction_amount field<br>**Constraints**: `<= 9999999999` | Double getTax() | setTax(Double tax) |
| `TerminalId` | `String` | Optional | Terminal ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getTerminalId() | setTerminalId(String terminalId) |
| `TermsAgree` | `Integer` | Optional | Terms Agreement | Integer getTermsAgree() | setTermsAgree(Integer termsAgree) |
| `TermsAgreeIp` | `String` | Optional | Terms Agree IP | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `Ticket` | `Integer` | Optional | Ticket | Integer getTicket() | setTicket(Integer ticket) |
| `TipAmount` | `Double` | Optional | Optional tip amount. Tip is not supported for lodging and ecommerce merchants.<br>**Constraints**: `<= 9999999999` | Double getTipAmount() | setTipAmount(Double tipAmount) |
| `TransactionAmount` | `double` | Required | Amount of the transaction. This should always be the desired settle amount of the transaction.<br>**Constraints**: `<= 9999999999` | double getTransactionAmount() | setTransactionAmount(double transactionAmount) |
| `TransactionApiId` | `String` | Optional | See api_id page for more details<br>**Constraints**: *Maximum Length*: `64` | String getTransactionApiId() | setTransactionApiId(String transactionApiId) |
| `TransactionC1` | `String` | Optional | Custom field 1 for api users to store custom data<br>**Constraints**: *Maximum Length*: `128` | String getTransactionC1() | setTransactionC1(String transactionC1) |
| `TransactionC2` | `String` | Optional | Custom field 2 for api users to store custom data<br>**Constraints**: *Maximum Length*: `128` | String getTransactionC2() | setTransactionC2(String transactionC2) |
| `TransactionC3` | `String` | Optional | Custom field 3 for api users to store custom data<br>**Constraints**: *Maximum Length*: `128` | String getTransactionC3() | setTransactionC3(String transactionC3) |
| `TransactionC4` | `String` | Optional | Custom field 4 for api users to store custom data<br>**Constraints**: *Maximum Length*: `128` | String getTransactionC4() | setTransactionC4(String transactionC4) |
| `TrxSourceId` | `Integer` | Optional | How the transaction was obtained by the API.<br>**Constraints**: `<= 99` | Integer getTrxSourceId() | setTrxSourceId(Integer trxSourceId) |
| `AccountHolderName` | `String` | Optional | For CC, this is the 'Name (as it appears) on Card'. For ACH, this is the 'Name on Account'.<br>**Constraints**: *Maximum Length*: `32` | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `AccountNumber` | `String` | Optional | For CC transactions, a credit card number. For ACH transactions, a bank account number.<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `19` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountType` | `String` | Optional | Required for ACH transactions if account_vault_id is not provided.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32` | String getAccountType() | setAccountType(String accountType) |
| `AccountVaultApiId` | `String` | Optional | This can be supplied in place of account_vault_id if you would like to use an account vault for the transaction and are using your own custom api_id's to track accountvaults in the system.<br>**Constraints**: *Maximum Length*: `36` | String getAccountVaultApiId() | setAccountVaultApiId(String accountVaultApiId) |
| `AccountVaultId` | `String` | Optional | Required if account_number,  track_data, micr_data is not provided.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getAccountVaultId() | setAccountVaultId(String accountVaultId) |
| `AchIdentifier` | `String` | Optional | Required for ACH transactions in certain scenarios.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getAchIdentifier() | setAchIdentifier(String achIdentifier) |
| `AchSecCode` | [`AchSecCodeEnum`](../../doc/models/ach-sec-code-enum.md) | Optional | Required for ACH transactions if account_vault_id is not provided. | AchSecCodeEnum getAchSecCode() | setAchSecCode(AchSecCodeEnum achSecCode) |
| `AdvanceDeposit` | `Boolean` | Optional | Advance Deposit | Boolean getAdvanceDeposit() | setAdvanceDeposit(Boolean advanceDeposit) |
| `AuthAmount` | `Double` | Optional | Authorization Amount<br>**Constraints**: `<= 9999999999` | Double getAuthAmount() | setAuthAmount(Double authAmount) |
| `AuthCode` | `String` | Optional | Required on force transactions. Ignored for all other actions.<br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `6` | String getAuthCode() | setAuthCode(String authCode) |
| `Avs` | [`AvsEnum`](../../doc/models/avs-enum.md) | Optional | AVS | AvsEnum getAvs() | setAvs(AvsEnum avs) |
| `AvsEnhanced` | `String` | Optional | AVS Enhanced<br>**Constraints**: *Minimum Length*: `1` | String getAvsEnhanced() | setAvsEnhanced(String avsEnhanced) |
| `CardholderPresent` | `Boolean` | Optional | If the cardholder is present at the point of service | Boolean getCardholderPresent() | setCardholderPresent(Boolean cardholderPresent) |
| `CardPresent` | `Boolean` | Optional | A POST only field to specify whether or not the card is present. | Boolean getCardPresent() | setCardPresent(Boolean cardPresent) |
| `CheckNumber` | `String` | Optional | Required for transactions using TEL SEC code.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `15` | String getCheckNumber() | setCheckNumber(String checkNumber) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `Cvv` | `String` | Optional | Required for CC transactions if vt_require_cvv is true on producttransaction(Merchant Deposit Account).<br>**Constraints**: *Maximum Length*: `4` | String getCvv() | setCvv(String cvv) |
| `CvvResponse` | `String` | Optional | Obfuscated CVV<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getCvvResponse() | setCvvResponse(String cvvResponse) |
| `EFormat` | [`EFormatEnum`](../../doc/models/e-format-enum.md) | Optional | Encrypted Track Data Format. | EFormatEnum getEFormat() | setEFormat(EFormatEnum eFormat) |
| `ETrackData` | `String` | Optional | Encrypted Track Data | String getETrackData() | setETrackData(String eTrackData) |
| `ESerialNumber` | `String` | Optional | Encrypted Track Data KSN<br>**Constraints**: *Maximum Length*: `20` | String getESerialNumber() | setESerialNumber(String eSerialNumber) |
| `EntryModeId` | [`EntryModeIdEnum`](../../doc/models/entry-mode-id-enum.md) | Optional | Entry Mode - See entry mode section for more detail | EntryModeIdEnum getEntryModeId() | setEntryModeId(EntryModeIdEnum entryModeId) |
| `EmvReceiptData` | `String` | Optional | This field is a read only field. This field will only be populated for EMV transactions and will contain proper JSON formatted data with some or all of the following fields: TC,TVR,AID,TSI,ATC,APPLAB,APPN,CVM<br>**Constraints**: *Maximum Length*: `512` | String getEmvReceiptData() | setEmvReceiptData(String emvReceiptData) |
| `FirstSix` | `String` | Optional | First six numbers of account_number.  Automatically generated by system.<br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `6` | String getFirstSix() | setFirstSix(String firstSix) |
| `Id` | `String` | Required | Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `LastFour` | `String` | Optional | Last four numbers of account_number.  Automatically generated by the system.<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `4` | String getLastFour() | setLastFour(String lastFour) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `PaymentMethod` | [`PaymentMethod4Enum`](../../doc/models/payment-method-4-enum.md) | Required | 'cc' or 'ach' | PaymentMethod4Enum getPaymentMethod() | setPaymentMethod(PaymentMethod4Enum paymentMethod) |
| `SecureAuthData` | `String` | Optional | (ECOMM) The token authentication value associated with 3D secure transactions (Such as CAVV, UCAF auth data) | String getSecureAuthData() | setSecureAuthData(String secureAuthData) |
| `SecureProtocolVersion` | `Integer` | Optional | (ECOMM)  Secure Program Protocol Version | Integer getSecureProtocolVersion() | setSecureProtocolVersion(Integer secureProtocolVersion) |
| `SecureCollectionIndicator` | `Integer` | Optional | (ECOMM) Used for UCAF collection indicator or Discover Autentication type | Integer getSecureCollectionIndicator() | setSecureCollectionIndicator(Integer secureCollectionIndicator) |
| `SecureCrytogram` | `String` | Optional | (ECOMM) Used to supply the Digital Payment Cryptogram obtained from a Digital Secure Remote Payment (DSRP) transaction | String getSecureCrytogram() | setSecureCrytogram(String secureCrytogram) |
| `SecureDirectoryServerTransactionId` | `String` | Optional | (ECOMM) Directory Server Transaction ID (Such as XID, TAVV) | String getSecureDirectoryServerTransactionId() | setSecureDirectoryServerTransactionId(String secureDirectoryServerTransactionId) |
| `SecureEcommUrl` | `String` | Optional | (ECOMM) This field is used to enter a merchant identifier such as the Merchant URL or reverse domain name as presented to the consumer during the checkout process for a Digital Secure Remote payment transaction | String getSecureEcommUrl() | setSecureEcommUrl(String secureEcommUrl) |
| `TerminalSerialNumber` | `String` | Optional | If transaction was processed using a terminal, this field would contain the terminal's serial number<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[a-zA-Z0-9]*$` | String getTerminalSerialNumber() | setTerminalSerialNumber(String terminalSerialNumber) |
| `Threedsecure` | `Boolean` | Optional | Specifies to save account to contacts profile if account_number/track_data is present with either contact_id or contact_api_id in params. | Boolean getThreedsecure() | setThreedsecure(Boolean threedsecure) |
| `TrackData` | `String` | Optional | Tags<br>**Constraints**: *Maximum Length*: `256` | String getTrackData() | setTrackData(String trackData) |
| `TransactionSettlementStatus` | `String` | Optional | (Deprecated field)<br>**Constraints**: *Maximum Length*: `32` | String getTransactionSettlementStatus() | setTransactionSettlementStatus(String transactionSettlementStatus) |
| `ChargeBackDate` | `String` | Optional | Charge Back Date (ACH Trxs)<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getChargeBackDate() | setChargeBackDate(String chargeBackDate) |
| `IsRecurring` | `Boolean` | Optional | Flag that is allowed to be passed on card not present industries to signify the transaction is a fixed installment plan transaction. | Boolean getIsRecurring() | setIsRecurring(Boolean isRecurring) |
| `NotificationEmailSent` | `String` | Optional | Indicates if email receipt has been sent | String getNotificationEmailSent() | setNotificationEmailSent(String notificationEmailSent) |
| `Par` | `String` | Optional | A field usually returned form the processor to uniquely identifier a specific cardholder's credit card.<br>**Constraints**: *Maximum Length*: `36` | String getPar() | setPar(String par) |
| `ReasonCodeId` | `Double` | Optional | Response reason code that provides more detail as to the result of the transaction. The reason code list can be found here: Response Reason Codes<br>**Constraints**: `<= 9999` | Double getReasonCodeId() | setReasonCodeId(Double reasonCodeId) |
| `RecurringId` | `String` | Optional | A unique identifer used to associate a transaction with a Recurring.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getRecurringId() | setRecurringId(String recurringId) |
| `TransactionBatchId` | `String` | Optional | For cc transactions, this is the id of the batch the transaction belongs to (not to be confused with batch number). This will be null for transactions that do not settle (void and authonly).<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getTransactionBatchId() | setTransactionBatchId(String transactionBatchId) |
| `TypeId` | [`TypeIdEnum`](../../doc/models/type-id-enum.md) | Optional | Type ID - See type id section for more detail | TypeIdEnum getTypeId() | setTypeId(TypeIdEnum typeId) |
| `Verbiage` | `String` | Optional | Verbiage -Do not use verbiage to see if the transaction was approved, use status_id | String getVerbiage() | setVerbiage(String verbiage) |
| `VoidDate` | `LocalDateTime` | Optional | void date | LocalDateTime getVoidDate() | setVoidDate(LocalDateTime voidDate) |
| `Batch` | `String` | Optional | Batch | String getBatch() | setBatch(String batch) |
| `ResponseMessage` | `String` | Optional | Response Message<br>**Constraints**: *Maximum Length*: `255` | String getResponseMessage() | setResponseMessage(String responseMessage) |
| `ReturnDate` | `String` | Optional | Return Date<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getReturnDate() | setReturnDate(String returnDate) |

## Example (as JSON)

```json
{
  "transaction_amount": 20,
  "created_ts": null,
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "modified_ts": null,
  "payment_method": "cc"
}
```

