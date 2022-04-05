
# List 9

## Structure

`List9`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountHolderName` | `String` | Optional | Account holder name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32` | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `AccountNumber` | `String` | Optional | Account number<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `19`, *Pattern*: `^[\d]+$` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountVaultApiId` | `String` | Optional | This field can be used to correlate Account Vaults in our system to data within an outside software integration<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` | String getAccountVaultApiId() | setAccountVaultApiId(String accountVaultApiId) |
| `AccountvaultC1` | `String` | Optional | Custom field 1 for API users to store custom data<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getAccountvaultC1() | setAccountvaultC1(String accountvaultC1) |
| `AccountvaultC2` | `String` | Optional | Custom field 2 for API users to store custom data<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getAccountvaultC2() | setAccountvaultC2(String accountvaultC2) |
| `AccountvaultC3` | `String` | Optional | Custom field 3 for API users to store custom data<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getAccountvaultC3() | setAccountvaultC3(String accountvaultC3) |
| `AchSecCode` | `String` | Optional | SEC code for the account<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getAchSecCode() | setAchSecCode(String achSecCode) |
| `BillingAddress` | `String` | Optional | The Street portion of the address associated with the Credit Card (CC) or Bank Account (ACH).<br>**Constraints**: *Maximum Length*: `255`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | The City portion of the address associated with the Credit Card (CC) or Bank Account (ACH).<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingPhone` | `String` | Optional | The Phone # to be used to contact Payer if there are any issues processing a transaction.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getBillingPhone() | setBillingPhone(String billingPhone) |
| `BillingState` | `String` | Optional | The State portion of the address associated with the Credit Card (CC) or Bank Account (ACH).<br>**Constraints**: *Maximum Length*: `24`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | The Zip or 'Postal Code' portion of the address associated with the Credit Card (CC) or Bank Account (ACH).<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `10`, *Pattern*: `^\d{5,10}$` | String getBillingZip() | setBillingZip(String billingZip) |
| `ContactId` | `String` | Optional | Used to associate the Account Vault with a Contact.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getContactId() | setContactId(String contactId) |
| `CustomerId` | `String` | Optional | Used to store a customer identification number.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50` | String getCustomerId() | setCustomerId(String customerId) |
| `DriversLicense` | [`DriversLicense`](../../doc/models/drivers-license.md) | Optional | Used for certain ACH transactions where Driver's License is required by the terminal being used. | DriversLicense getDriversLicense() | setDriversLicense(DriversLicense driversLicense) |
| `LocationId` | `String` | Required | A valid Location Id associated with the Contact for this Token<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `PreviousAccountVaultApiId` | `String` | Optional | Can be used to pull payment info from a previous account vault api id.<br>**Constraints**: *Maximum Length*: `64` | String getPreviousAccountVaultApiId() | setPreviousAccountVaultApiId(String previousAccountVaultApiId) |
| `PreviousAccountVaultId` | `String` | Optional | Can be used to pull payment info from a previous account vault.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getPreviousAccountVaultId() | setPreviousAccountVaultId(String previousAccountVaultId) |
| `PreviousTransactionId` | `String` | Optional | Can be used to pull payment info from a previous transaction.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getPreviousTransactionId() | setPreviousTransactionId(String previousTransactionId) |
| `Ssn4` | `String` | Optional | The last four of the account_holder social security number.<br>**Constraints**: *Maximum Length*: `4` | String getSsn4() | setSsn4(String ssn4) |
| `TermsAgree` | `Boolean` | Optional | Terms agreement. | Boolean getTermsAgree() | setTermsAgree(Boolean termsAgree) |
| `TermsAgreeIp` | `String` | Optional | The ip address of the client that agreed to terms. | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `Title` | `String` | Optional | Used to describe the Token for easier identification within our UI.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16` | String getTitle() | setTitle(String title) |
| `AccountType` | `String` | Required | Account type<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32` | String getAccountType() | setAccountType(String accountType) |
| `Active` | [`Active2Enum`](../../doc/models/active-2-enum.md) | Required | Register is Active | Active2Enum getActive() | setActive(Active2Enum active) |
| `CauSummaryStatusId` | `double` | Required | CAU Summary Status ID. | double getCauSummaryStatusId() | setCauSummaryStatusId(double cauSummaryStatusId) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `Id` | `String` | Required | A unique, system-generated identifier for the Token.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `ESerialNumber` | `String` | Optional | E Serial Number<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[a-zA-Z0-9]*$` | String getESerialNumber() | setESerialNumber(String eSerialNumber) |
| `ETrackData` | `String` | Optional | E Track Data | String getETrackData() | setETrackData(String eTrackData) |
| `EFormat` | `String` | Optional | E Format | String getEFormat() | setEFormat(String eFormat) |
| `EKeyedData` | `String` | Optional | E Keyed Data | String getEKeyedData() | setEKeyedData(String eKeyedData) |
| `ExpiringInMonths` | `Integer` | Optional | Determined by API based on card exp_date. | Integer getExpiringInMonths() | setExpiringInMonths(Integer expiringInMonths) |
| `FirstSix` | `double` | Required | The first six numbers of an account number.  System will generate a value for this field automatically.<br>**Constraints**: `<= 6` | double getFirstSix() | setFirstSix(double firstSix) |
| `HasRecurring` | `boolean` | Required | True indicates that this account vault is tied to a Recurring Payment | boolean getHasRecurring() | setHasRecurring(boolean hasRecurring) |
| `LastFour` | `double` | Required | The last four numbers of an account number.  System will generate a value for this field automatically.<br>**Constraints**: `<= 4` | double getLastFour() | setLastFour(double lastFour) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `PaymentMethod` | [`PaymentMethod2Enum`](../../doc/models/payment-method-2-enum.md) | Required | Must be provided as either 'cc' or 'ach'. | PaymentMethod2Enum getPaymentMethod() | setPaymentMethod(PaymentMethod2Enum paymentMethod) |
| `Ticket` | `String` | Optional | A valid ticket that was created to store the token.<br>**Constraints**: *Maximum Length*: `36` | String getTicket() | setTicket(String ticket) |
| `TrackData` | `String` | Optional | Track Data from a magnetic card swipe.<br>**Constraints**: *Maximum Length*: `256` | String getTrackData() | setTrackData(String trackData) |

## Example (as JSON)

```json
{
  "location_id": "11e95f8ec39de8fbdb0a4f1a",
  "account_type": "checking",
  "active": 1,
  "cau_summary_status_id": null,
  "created_ts": null,
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "first_six": null,
  "has_recurring": false,
  "last_four": null,
  "modified_ts": null,
  "payment_method": "cc"
}
```

