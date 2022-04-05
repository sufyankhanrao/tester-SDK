
# V1 Users Request 1

## Structure

`V1UsersRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `Address` | `String` | Optional | Address<br>**Constraints**: *Maximum Length*: `255`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getAddress() | setAddress(String address) |
| `BrandingDomainUrl` | `String` | Optional | Address<br>**Constraints**: *Maximum Length*: `64` | String getBrandingDomainUrl() | setBrandingDomainUrl(String brandingDomainUrl) |
| `CellPhone` | `String` | Optional | Cell Phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getCellPhone() | setCellPhone(String cellPhone) |
| `City` | `String` | Optional | City<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getCity() | setCity(String city) |
| `CompanyName` | `String` | Optional | Company Name<br>**Constraints**: *Maximum Length*: `64` | String getCompanyName() | setCompanyName(String companyName) |
| `ContactId` | `String` | Optional | Contact<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getContactId() | setContactId(String contactId) |
| `DateOfBirth` | `String` | Optional | Date Of Birth<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `DomainId` | `String` | Optional | Domain<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getDomainId() | setDomainId(String domainId) |
| `Email` | `String` | Optional | Email<br>**Constraints**: *Maximum Length*: `128` | String getEmail() | setEmail(String email) |
| `EmailTrxReceipt` | `Boolean` | Optional | Email Trx Receipt | Boolean getEmailTrxReceipt() | setEmailTrxReceipt(Boolean emailTrxReceipt) |
| `HomePhone` | `String` | Optional | Home Phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getHomePhone() | setHomePhone(String homePhone) |
| `FirstName` | `String` | Optional | First Name<br>**Constraints**: *Maximum Length*: `64` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | Last Name<br>**Constraints**: *Maximum Length*: `64` | String getLastName() | setLastName(String lastName) |
| `Locale` | `String` | Optional | Locale<br>**Constraints**: *Maximum Length*: `8` | String getLocale() | setLocale(String locale) |
| `OfficePhone` | `String` | Optional | Office Phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getOfficePhone() | setOfficePhone(String officePhone) |
| `OfficeExtPhone` | `String` | Optional | Office Ext Phone<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^\d{1,10}$` | String getOfficeExtPhone() | setOfficeExtPhone(String officeExtPhone) |
| `PrimaryLocationId` | `String` | Optional | Primary Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getPrimaryLocationId() | setPrimaryLocationId(String primaryLocationId) |
| `RequiresNewPassword` | `String` | Optional | Requires New Password<br>**Constraints**: *Maximum Length*: `1` | String getRequiresNewPassword() | setRequiresNewPassword(String requiresNewPassword) |
| `State` | `String` | Optional | State<br>**Constraints**: *Maximum Length*: `24`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getState() | setState(String state) |
| `TermsConditionId` | `String` | Optional | Terms Condition<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getTermsConditionId() | setTermsConditionId(String termsConditionId) |
| `Tz` | `String` | Optional | Time zone<br>**Constraints**: *Maximum Length*: `30` | String getTz() | setTz(String tz) |
| `UiPrefs` | [`UiPrefs`](../../doc/models/ui-prefs.md) | Optional | Ui Prefs | UiPrefs getUiPrefs() | setUiPrefs(UiPrefs uiPrefs) |
| `Username` | `String` | Optional | Username<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |
| `UserApiKey` | `String` | Optional | User Api Key<br>**Constraints**: *Minimum Length*: `16`, *Maximum Length*: `64` | String getUserApiKey() | setUserApiKey(String userApiKey) |
| `UserHashKey` | `String` | Optional | User Hash Key<br>**Constraints**: *Minimum Length*: `24`, *Maximum Length*: `36` | String getUserHashKey() | setUserHashKey(String userHashKey) |
| `UserTypeId` | [`UserTypeIdEnum`](../../doc/models/user-type-id-enum.md) | Optional | User Type | UserTypeIdEnum getUserTypeId() | setUserTypeId(UserTypeIdEnum userTypeId) |
| `Password` | `String` | Optional | Password<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `128`, *Pattern*: `^(?=.*[`!@#$%^&*()_+\-=\[\]{};':"\\\|,.<>\/?~])(?=.*[0-9])(?=.*[a-zA-Z]).*$` | String getPassword() | setPassword(String password) |
| `Zip` | `String` | Optional | Zip<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `10`, *Pattern*: `^\d{5,10}$` | String getZip() | setZip(String zip) |
| `LocationId` | `String` | Optional | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `ContactApiId` | `String` | Optional | ContactApi Id | String getContactApiId() | setContactApiId(String contactApiId) |
| `PrimaryLocationApiId` | `String` | Optional | Primary LocationApi ID | String getPrimaryLocationApiId() | setPrimaryLocationApiId(String primaryLocationApiId) |
| `StatusId` | `Boolean` | Optional | Status | Boolean getStatusId() | setStatusId(Boolean statusId) |

## Example (as JSON)

```json
{
  "account_number": null,
  "address": null,
  "branding_domain_url": null,
  "cell_phone": null,
  "city": null,
  "company_name": null,
  "contact_id": null,
  "date_of_birth": null,
  "domain_id": null,
  "email": null,
  "email_trx_receipt": null,
  "home_phone": null,
  "first_name": null,
  "last_name": null,
  "locale": null,
  "office_phone": null,
  "office_ext_phone": null,
  "primary_location_id": null,
  "requires_new_password": null,
  "state": null,
  "terms_condition_id": null,
  "tz": null,
  "ui_prefs": null,
  "username": null,
  "user_api_key": null,
  "user_hash_key": null,
  "user_type_id": null,
  "password": null,
  "zip": null,
  "location_id": null,
  "contact_api_id": null,
  "primary_location_api_id": null,
  "status_id": null
}
```

