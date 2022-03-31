
# V1 Transactions Cc Avs Only Token Request

## Structure

`V1TransactionsCcAvsOnlyTokenRequest`

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
| `StatusId` | [`StatusId1Enum`](../../doc/models/status-id-1-enum.md) | Optional | Status ID - See status id section for more detail<br><br>> Sale cc Approved<br>> <br>> Sale cc AuthOnly<br>> <br>> Refund cc Refunded<br>> <br>> Credit/Debit/Refund cc AvsOnly<br>> <br>> Credit/Debit/Refund ach Pending Origination<br>> <br>> Credit/Debit/Refund ach Originating<br>> <br>> Credit/Debit/Refund ach Originated<br>> <br>> Credit/Debit/Refund ach Settled<br>> <br>> Settled (depracated - batches are now settled on the /v2/transactionbatches endpoint)<br>> <br>> All cc/ach Voided<br>> <br>> All cc/ach Declined<br>> <br>> Credit/Debit/Refund ach Charged Back | StatusId1Enum getStatusId() | setStatusId(StatusId1Enum statusId) |
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
| `AdvanceDeposit` | `Boolean` | Optional | Advance Deposit | Boolean getAdvanceDeposit() | setAdvanceDeposit(Boolean advanceDeposit) |
| `AuthAmount` | `Double` | Optional | Authorization Amount<br>**Constraints**: `<= 9999999999` | Double getAuthAmount() | setAuthAmount(Double authAmount) |
| `CardholderPresent` | `Boolean` | Optional | If the cardholder is present at the point of service | Boolean getCardholderPresent() | setCardholderPresent(Boolean cardholderPresent) |
| `CardPresent` | `Boolean` | Optional | A POST only field to specify whether or not the card is present. | Boolean getCardPresent() | setCardPresent(Boolean cardPresent) |
| `SecureAuthData` | `String` | Optional | (ECOMM) The token authentication value associated with 3D secure transactions (Such as CAVV, UCAF auth data) | String getSecureAuthData() | setSecureAuthData(String secureAuthData) |
| `SecureProtocolVersion` | `Integer` | Optional | (ECOMM)  Secure Program Protocol Version | Integer getSecureProtocolVersion() | setSecureProtocolVersion(Integer secureProtocolVersion) |
| `SecureCollectionIndicator` | `Integer` | Optional | (ECOMM) Used for UCAF collection indicator or Discover Autentication type | Integer getSecureCollectionIndicator() | setSecureCollectionIndicator(Integer secureCollectionIndicator) |
| `SecureCrytogram` | `String` | Optional | (ECOMM) Used to supply the Digital Payment Cryptogram obtained from a Digital Secure Remote Payment (DSRP) transaction | String getSecureCrytogram() | setSecureCrytogram(String secureCrytogram) |
| `SecureDirectoryServerTransactionId` | `String` | Optional | (ECOMM) Directory Server Transaction ID (Such as XID, TAVV) | String getSecureDirectoryServerTransactionId() | setSecureDirectoryServerTransactionId(String secureDirectoryServerTransactionId) |
| `SecureEcommUrl` | `String` | Optional | (ECOMM) This field is used to enter a merchant identifier such as the Merchant URL or reverse domain name as presented to the consumer during the checkout process for a Digital Secure Remote payment transaction | String getSecureEcommUrl() | setSecureEcommUrl(String secureEcommUrl) |
| `TerminalSerialNumber` | `String` | Optional | If transaction was processed using a terminal, this field would contain the terminal's serial number<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[a-zA-Z0-9]*$` | String getTerminalSerialNumber() | setTerminalSerialNumber(String terminalSerialNumber) |
| `Threedsecure` | `Boolean` | Optional | Specifies to save account to contacts profile if account_number/track_data is present with either contact_id or contact_api_id in params. | Boolean getThreedsecure() | setThreedsecure(Boolean threedsecure) |
| `WalletId` | `String` | Optional | This value provides information about transactions initiation (If transaction initiated from Apple Pay In App, this field should contain 100 value).<br>**Constraints**: *Maximum Length*: `3` | String getWalletId() | setWalletId(String walletId) |
| `AccountVaultId` | `String` | Required | Required if account_number,  track_data, micr_data is not provided.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getAccountVaultId() | setAccountVaultId(String accountVaultId) |
| `AccountVaultApiId` | `String` | Optional | This can be supplied in place of account_vault_id if you would like to use an account vault for the transaction and are using your own custom api_id's to track accountvaults in the system.<br>**Constraints**: *Maximum Length*: `36` | String getAccountVaultApiId() | setAccountVaultApiId(String accountVaultApiId) |

## Example (as JSON)

```json
{
  "transaction_amount": 20,
  "account_vault_id": "11e95f8ec39de8fbdb0a4f1a"
}
```

