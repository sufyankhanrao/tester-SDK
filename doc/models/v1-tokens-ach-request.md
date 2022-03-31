
# V1 Tokens Ach Request

## Structure

`V1TokensAchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountHolderName` | `String` | Required | Account holder name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32` | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `AccountNumber` | `String` | Required | Account number<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `19` | String getAccountNumber() | setAccountNumber(String accountNumber) |
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
| `AccountType` | [`AccountType2Enum`](../../doc/models/account-type-2-enum.md) | Required | Account type | AccountType2Enum getAccountType() | setAccountType(AccountType2Enum accountType) |
| `DobYear` | `String` | Optional | Used for certain ACH transactions where Identity Verification is enabled on the terminal being used.<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `4`, *Pattern*: `^(19\d{2})\|20\d{2}$` | String getDobYear() | setDobYear(String dobYear) |
| `IsCompany` | `boolean` | Required | This identifies whether the ACH account belongs to a company or individual. This can affect which SEC code is used when attempting to run a transaction. | boolean getIsCompany() | setIsCompany(boolean isCompany) |
| `Routing` | `String` | Required | Required for ACH. The Routing Number for the bank account being used.<br>**Constraints**: *Minimum Length*: `9`, *Maximum Length*: `9` | String getRouting() | setRouting(String routing) |

## Example (as JSON)

```json
{
  "account_holder_name": "John Smith",
  "account_number": "545454545454545",
  "location_id": "11e95f8ec39de8fbdb0a4f1a",
  "account_type": "savings",
  "is_company": false,
  "routing": "100020200"
}
```

