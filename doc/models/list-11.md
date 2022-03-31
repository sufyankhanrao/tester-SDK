
# List 11

## Structure

`List11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `Address` | `String` | Optional | Address<br>**Constraints**: *Maximum Length*: `255`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getAddress() | setAddress(String address) |
| `BrandingDomainUrl` | `String` | Required | Address<br>**Constraints**: *Maximum Length*: `64` | String getBrandingDomainUrl() | setBrandingDomainUrl(String brandingDomainUrl) |
| `CellPhone` | `String` | Optional | Cell Phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getCellPhone() | setCellPhone(String cellPhone) |
| `City` | `String` | Optional | City<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getCity() | setCity(String city) |
| `CompanyName` | `String` | Optional | Company Name<br>**Constraints**: *Maximum Length*: `64` | String getCompanyName() | setCompanyName(String companyName) |
| `ContactId` | `String` | Required | Contact<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getContactId() | setContactId(String contactId) |
| `DateOfBirth` | `String` | Optional | Date Of Birth<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `DomainId` | `String` | Required | Domain<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getDomainId() | setDomainId(String domainId) |
| `Email` | `String` | Required | Email<br>**Constraints**: *Maximum Length*: `128` | String getEmail() | setEmail(String email) |
| `EmailTrxReceipt` | `boolean` | Required | Email Trx Receipt | boolean getEmailTrxReceipt() | setEmailTrxReceipt(boolean emailTrxReceipt) |
| `HomePhone` | `String` | Optional | Home Phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getHomePhone() | setHomePhone(String homePhone) |
| `FirstName` | `String` | Optional | First Name<br>**Constraints**: *Maximum Length*: `64` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Required | Last Name<br>**Constraints**: *Maximum Length*: `64` | String getLastName() | setLastName(String lastName) |
| `Locale` | `String` | Required | Locale<br>**Constraints**: *Maximum Length*: `8` | String getLocale() | setLocale(String locale) |
| `OfficePhone` | `String` | Optional | Office Phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getOfficePhone() | setOfficePhone(String officePhone) |
| `OfficeExtPhone` | `String` | Optional | Office Ext Phone<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^\d{1,10}$` | String getOfficeExtPhone() | setOfficeExtPhone(String officeExtPhone) |
| `PrimaryLocationId` | `String` | Required | Primary Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getPrimaryLocationId() | setPrimaryLocationId(String primaryLocationId) |
| `RequiresNewPassword` | `String` | Optional | Requires New Password<br>**Constraints**: *Maximum Length*: `1` | String getRequiresNewPassword() | setRequiresNewPassword(String requiresNewPassword) |
| `State` | `String` | Optional | State<br>**Constraints**: *Maximum Length*: `24`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getState() | setState(String state) |
| `TermsConditionId` | `String` | Required | Terms Agree Ip<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getTermsConditionId() | setTermsConditionId(String termsConditionId) |
| `Tz` | `String` | Required | Time zone<br>**Constraints**: *Maximum Length*: `30` | String getTz() | setTz(String tz) |
| `UiPrefs` | [`UiPrefs1`](../../doc/models/ui-prefs-1.md) | Required | Ui Prefs | UiPrefs1 getUiPrefs() | setUiPrefs(UiPrefs1 uiPrefs) |
| `Username` | `String` | Required | Username<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |
| `UserApiKey` | `String` | Optional | User Api Key<br>**Constraints**: *Minimum Length*: `16`, *Maximum Length*: `64` | String getUserApiKey() | setUserApiKey(String userApiKey) |
| `UserHashKey` | `String` | Optional | User Hash Key<br>**Constraints**: *Minimum Length*: `24`, *Maximum Length*: `36` | String getUserHashKey() | setUserHashKey(String userHashKey) |
| `UserTypeId` | [`UserTypeIdEnum`](../../doc/models/user-type-id-enum.md) | Required | User Type | UserTypeIdEnum getUserTypeId() | setUserTypeId(UserTypeIdEnum userTypeId) |
| `Password` | `String` | Optional | Password<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `128`, *Pattern*: `^(?=.*[`!@#$%^&*()_+\-=\[\]{};':"\\\|,.<>\/?~])(?=.*[0-9])(?=.*[a-zA-Z]).*$` | String getPassword() | setPassword(String password) |
| `Zip` | `String` | Optional | Zip<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `10`, *Pattern*: `^\d{5,10}$` | String getZip() | setZip(String zip) |
| `LocationId` | `String` | Optional | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `ContactApiId` | `String` | Optional | ContactApi Id | String getContactApiId() | setContactApiId(String contactApiId) |
| `PrimaryLocationApiId` | `String` | Optional | Primary LocationApi ID | String getPrimaryLocationApiId() | setPrimaryLocationApiId(String primaryLocationApiId) |
| `StatusId` | `Boolean` | Optional | Status | Boolean getStatusId() | setStatusId(Boolean statusId) |
| `Id` | `String` | Required | User ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `Status` | `int` | Required | Status<br>**Constraints**: `>= 0`, `<= 1` | int getStatus() | setStatus(int status) |
| `LoginAttempts` | `double` | Required | Login Attempts | double getLoginAttempts() | setLoginAttempts(double loginAttempts) |
| `LastLoginTs` | `LocalDateTime` | Required | Last Login | LocalDateTime getLastLoginTs() | setLastLoginTs(LocalDateTime lastLoginTs) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `CreatedUserId` | `String` | Required | Created User<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getCreatedUserId() | setCreatedUserId(String createdUserId) |
| `TermsAcceptedTs` | `LocalDateTime` | Optional | Terms Accepted | LocalDateTime getTermsAcceptedTs() | setTermsAcceptedTs(LocalDateTime termsAcceptedTs) |
| `TermsAgreeIp` | `String` | Optional | Terms Agree Ip<br>**Constraints**: *Maximum Length*: `16` | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `CurrentDateTime` | `String` | Required | Current Date Time<br>**Constraints**: *Maximum Length*: `24` | String getCurrentDateTime() | setCurrentDateTime(String currentDateTime) |

## Example (as JSON)

```json
{
  "branding_domain_url": "{branding_domain_url}",
  "contact_id": "11e95f8ec39de8fbdb0a4f1a",
  "domain_id": "11e95f8ec39de8fbdb0a4f1a",
  "email": "testuser@test.com",
  "email_trx_receipt": true,
  "last_name": "Smith",
  "locale": "en-US",
  "primary_location_id": "11e95f8ec39de8fbdb0a4f1a",
  "terms_condition_id": "11e95f8ec39de8fbdb0a4f1a",
  "tz": "America/New_York",
  "ui_prefs": {
    "entry_page": "dashboard",
    "page_size": 2,
    "report_export_type": 99,
    "process_method": 99,
    "default_terminal": "11e95f8ec39de8fbdb0a4f1a"
  },
  "username": "{user_name}",
  "user_type_id": 100,
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "status": 1,
  "login_attempts": 0,
  "last_login_ts": null,
  "created_ts": null,
  "modified_ts": null,
  "created_user_id": "11e95f8ec39de8fbdb0a4f1a",
  "current_date_time": "03/11/2019 17:38:26"
}
```

