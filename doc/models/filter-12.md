
# Filter 12

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter12`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | - | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `Address` | `String` | Optional | - | String getAddress() | setAddress(String address) |
| `BrandingDomainUrl` | `String` | Optional | - | String getBrandingDomainUrl() | setBrandingDomainUrl(String brandingDomainUrl) |
| `CellPhone` | `String` | Optional | - | String getCellPhone() | setCellPhone(String cellPhone) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `CompanyName` | `String` | Optional | - | String getCompanyName() | setCompanyName(String companyName) |
| `ContactId` | `String` | Optional | - | String getContactId() | setContactId(String contactId) |
| `DateOfBirth` | `String` | Optional | - | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `DomainId` | `String` | Optional | - | String getDomainId() | setDomainId(String domainId) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `EmailTrxReceipt` | `String` | Optional | - | String getEmailTrxReceipt() | setEmailTrxReceipt(String emailTrxReceipt) |
| `HomePhone` | `String` | Optional | - | String getHomePhone() | setHomePhone(String homePhone) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `Locale` | `String` | Optional | - | String getLocale() | setLocale(String locale) |
| `OfficePhone` | `String` | Optional | - | String getOfficePhone() | setOfficePhone(String officePhone) |
| `OfficeExtPhone` | `String` | Optional | - | String getOfficeExtPhone() | setOfficeExtPhone(String officeExtPhone) |
| `PrimaryLocationId` | `String` | Optional | - | String getPrimaryLocationId() | setPrimaryLocationId(String primaryLocationId) |
| `RequiresNewPassword` | `String` | Optional | - | String getRequiresNewPassword() | setRequiresNewPassword(String requiresNewPassword) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `TermsConditionId` | `String` | Optional | - | String getTermsConditionId() | setTermsConditionId(String termsConditionId) |
| `Tz` | `String` | Optional | - | String getTz() | setTz(String tz) |
| `UiPrefs` | `String` | Optional | - | String getUiPrefs() | setUiPrefs(String uiPrefs) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `UserApiKey` | `String` | Optional | - | String getUserApiKey() | setUserApiKey(String userApiKey) |
| `UserHashKey` | `String` | Optional | - | String getUserHashKey() | setUserHashKey(String userHashKey) |
| `UserTypeId` | `String` | Optional | - | String getUserTypeId() | setUserTypeId(String userTypeId) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `Zip` | `String` | Optional | - | String getZip() | setZip(String zip) |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `ContactApiId` | `String` | Optional | - | String getContactApiId() | setContactApiId(String contactApiId) |
| `PrimaryLocationApiId` | `String` | Optional | - | String getPrimaryLocationApiId() | setPrimaryLocationApiId(String primaryLocationApiId) |
| `StatusId` | `String` | Optional | - | String getStatusId() | setStatusId(String statusId) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `LoginAttempts` | `String` | Optional | - | String getLoginAttempts() | setLoginAttempts(String loginAttempts) |
| `LastLoginTs` | `String` | Optional | - | String getLastLoginTs() | setLastLoginTs(String lastLoginTs) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `CreatedUserId` | `String` | Optional | - | String getCreatedUserId() | setCreatedUserId(String createdUserId) |
| `TermsAcceptedTs` | `String` | Optional | - | String getTermsAcceptedTs() | setTermsAcceptedTs(String termsAcceptedTs) |
| `TermsAgreeIp` | `String` | Optional | - | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `CurrentDateTime` | `String` | Optional | - | String getCurrentDateTime() | setCurrentDateTime(String currentDateTime) |

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
  "status_id": null,
  "id": null,
  "status": null,
  "login_attempts": null,
  "last_login_ts": null,
  "created_ts": null,
  "modified_ts": null,
  "created_user_id": null,
  "terms_accepted_ts": null,
  "terms_agree_ip": null,
  "current_date_time": null
}
```

