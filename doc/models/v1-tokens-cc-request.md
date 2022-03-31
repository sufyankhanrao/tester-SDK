
# V1 Tokens Cc Request

## Structure

`V1TokensCcRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountHolderName` | `String` | Optional | Account holder name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32` | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `AccountNumber` | `String` | Required | Account number | String getAccountNumber() | setAccountNumber(String accountNumber) |
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
| `ExpDate` | `String` | Required | Required for CC. The Expiration Date for the credit card. (MMYY format).<br>**Constraints**: *Pattern*: `^(0[1-9]\|1[0-2])[0-9]{2}$` | String getExpDate() | setExpDate(String expDate) |
| `ESerialNumber` | `String` | Optional | E Serial Number<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[a-zA-Z0-9]*$` | String getESerialNumber() | setESerialNumber(String eSerialNumber) |
| `ETrackData` | `String` | Optional | E Track Data | String getETrackData() | setETrackData(String eTrackData) |
| `EFormat` | `String` | Optional | E Format | String getEFormat() | setEFormat(String eFormat) |
| `EKeyedData` | `String` | Optional | E Keyed Data | String getEKeyedData() | setEKeyedData(String eKeyedData) |
| `RunAvs` | `Boolean` | Optional | A flag that will override a product transactions run_avs_on_accountvault_create setting to determine if an avsonly transaction should be run prior to storing the account vault. When storing an account vault with tha run_avs flag, if the avsonly check fails account verification with the processor, the account vault will not be stored in the system. The meaning of the AVS response codes can be found here on this page.This is the new preferred method of validating a credit card and can be used instead of the legacy $1 auth only transaction.Using this flag overrides the default setting for the locations product transactions. | Boolean getRunAvs() | setRunAvs(Boolean runAvs) |
| `TrackData` | `String` | Optional | Track Data from a magnetic card swipe.<br>**Constraints**: *Maximum Length*: `256` | String getTrackData() | setTrackData(String trackData) |
| `Ticket` | `String` | Optional | A valid ticket that was created to store the token.<br>**Constraints**: *Maximum Length*: `36` | String getTicket() | setTicket(String ticket) |

## Example (as JSON)

```json
{
  "account_number": null,
  "location_id": "11e95f8ec39de8fbdb0a4f1a",
  "exp_date": "0929"
}
```

