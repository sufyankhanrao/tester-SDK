
# Sort 12

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort12`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountNumber` | [`AccountNumberEnum`](../../doc/models/account-number-enum.md) | Optional | - | AccountNumberEnum getAccountNumber() | setAccountNumber(AccountNumberEnum accountNumber) |
| `Address` | [`AddressEnum`](../../doc/models/address-enum.md) | Optional | - | AddressEnum getAddress() | setAddress(AddressEnum address) |
| `BrandingDomainUrl` | [`BrandingDomainUrlEnum`](../../doc/models/branding-domain-url-enum.md) | Optional | - | BrandingDomainUrlEnum getBrandingDomainUrl() | setBrandingDomainUrl(BrandingDomainUrlEnum brandingDomainUrl) |
| `CellPhone` | [`CellPhoneEnum`](../../doc/models/cell-phone-enum.md) | Optional | - | CellPhoneEnum getCellPhone() | setCellPhone(CellPhoneEnum cellPhone) |
| `City` | [`CityEnum`](../../doc/models/city-enum.md) | Optional | - | CityEnum getCity() | setCity(CityEnum city) |
| `CompanyName` | [`CompanyNameEnum`](../../doc/models/company-name-enum.md) | Optional | - | CompanyNameEnum getCompanyName() | setCompanyName(CompanyNameEnum companyName) |
| `ContactId` | [`ContactIdEnum`](../../doc/models/contact-id-enum.md) | Optional | - | ContactIdEnum getContactId() | setContactId(ContactIdEnum contactId) |
| `DateOfBirth` | [`DateOfBirthEnum`](../../doc/models/date-of-birth-enum.md) | Optional | - | DateOfBirthEnum getDateOfBirth() | setDateOfBirth(DateOfBirthEnum dateOfBirth) |
| `DomainId` | [`DomainIdEnum`](../../doc/models/domain-id-enum.md) | Optional | - | DomainIdEnum getDomainId() | setDomainId(DomainIdEnum domainId) |
| `Email` | [`EmailEnum`](../../doc/models/email-enum.md) | Optional | - | EmailEnum getEmail() | setEmail(EmailEnum email) |
| `EmailTrxReceipt` | [`EmailTrxReceiptEnum`](../../doc/models/email-trx-receipt-enum.md) | Optional | - | EmailTrxReceiptEnum getEmailTrxReceipt() | setEmailTrxReceipt(EmailTrxReceiptEnum emailTrxReceipt) |
| `HomePhone` | [`HomePhoneEnum`](../../doc/models/home-phone-enum.md) | Optional | - | HomePhoneEnum getHomePhone() | setHomePhone(HomePhoneEnum homePhone) |
| `FirstName` | [`FirstNameEnum`](../../doc/models/first-name-enum.md) | Optional | - | FirstNameEnum getFirstName() | setFirstName(FirstNameEnum firstName) |
| `LastName` | [`LastNameEnum`](../../doc/models/last-name-enum.md) | Optional | - | LastNameEnum getLastName() | setLastName(LastNameEnum lastName) |
| `Locale` | [`LocaleEnum`](../../doc/models/locale-enum.md) | Optional | - | LocaleEnum getLocale() | setLocale(LocaleEnum locale) |
| `OfficePhone` | [`OfficePhoneEnum`](../../doc/models/office-phone-enum.md) | Optional | - | OfficePhoneEnum getOfficePhone() | setOfficePhone(OfficePhoneEnum officePhone) |
| `OfficeExtPhone` | [`OfficeExtPhoneEnum`](../../doc/models/office-ext-phone-enum.md) | Optional | - | OfficeExtPhoneEnum getOfficeExtPhone() | setOfficeExtPhone(OfficeExtPhoneEnum officeExtPhone) |
| `PrimaryLocationId` | [`PrimaryLocationIdEnum`](../../doc/models/primary-location-id-enum.md) | Optional | - | PrimaryLocationIdEnum getPrimaryLocationId() | setPrimaryLocationId(PrimaryLocationIdEnum primaryLocationId) |
| `RequiresNewPassword` | [`RequiresNewPasswordEnum`](../../doc/models/requires-new-password-enum.md) | Optional | - | RequiresNewPasswordEnum getRequiresNewPassword() | setRequiresNewPassword(RequiresNewPasswordEnum requiresNewPassword) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Optional | - | StateEnum getState() | setState(StateEnum state) |
| `TermsConditionId` | [`TermsConditionIdEnum`](../../doc/models/terms-condition-id-enum.md) | Optional | - | TermsConditionIdEnum getTermsConditionId() | setTermsConditionId(TermsConditionIdEnum termsConditionId) |
| `Tz` | [`TzEnum`](../../doc/models/tz-enum.md) | Optional | - | TzEnum getTz() | setTz(TzEnum tz) |
| `UiPrefs` | [`UiPrefs3Enum`](../../doc/models/ui-prefs-3-enum.md) | Optional | - | UiPrefs3Enum getUiPrefs() | setUiPrefs(UiPrefs3Enum uiPrefs) |
| `Username` | [`UsernameEnum`](../../doc/models/username-enum.md) | Optional | - | UsernameEnum getUsername() | setUsername(UsernameEnum username) |
| `UserApiKey` | [`UserApiKeyEnum`](../../doc/models/user-api-key-enum.md) | Optional | - | UserApiKeyEnum getUserApiKey() | setUserApiKey(UserApiKeyEnum userApiKey) |
| `UserHashKey` | [`UserHashKeyEnum`](../../doc/models/user-hash-key-enum.md) | Optional | - | UserHashKeyEnum getUserHashKey() | setUserHashKey(UserHashKeyEnum userHashKey) |
| `UserTypeId` | [`UserTypeId3Enum`](../../doc/models/user-type-id-3-enum.md) | Optional | - | UserTypeId3Enum getUserTypeId() | setUserTypeId(UserTypeId3Enum userTypeId) |
| `Password` | [`PasswordEnum`](../../doc/models/password-enum.md) | Optional | - | PasswordEnum getPassword() | setPassword(PasswordEnum password) |
| `Zip` | [`ZipEnum`](../../doc/models/zip-enum.md) | Optional | - | ZipEnum getZip() | setZip(ZipEnum zip) |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `ContactApiId` | [`ContactApiIdEnum`](../../doc/models/contact-api-id-enum.md) | Optional | - | ContactApiIdEnum getContactApiId() | setContactApiId(ContactApiIdEnum contactApiId) |
| `PrimaryLocationApiId` | [`PrimaryLocationApiIdEnum`](../../doc/models/primary-location-api-id-enum.md) | Optional | - | PrimaryLocationApiIdEnum getPrimaryLocationApiId() | setPrimaryLocationApiId(PrimaryLocationApiIdEnum primaryLocationApiId) |
| `StatusId` | [`StatusIdEnum`](../../doc/models/status-id-enum.md) | Optional | - | StatusIdEnum getStatusId() | setStatusId(StatusIdEnum statusId) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `Status` | [`Status3Enum`](../../doc/models/status-3-enum.md) | Optional | - | Status3Enum getStatus() | setStatus(Status3Enum status) |
| `LoginAttempts` | [`LoginAttemptsEnum`](../../doc/models/login-attempts-enum.md) | Optional | - | LoginAttemptsEnum getLoginAttempts() | setLoginAttempts(LoginAttemptsEnum loginAttempts) |
| `LastLoginTs` | [`LastLoginTsEnum`](../../doc/models/last-login-ts-enum.md) | Optional | - | LastLoginTsEnum getLastLoginTs() | setLastLoginTs(LastLoginTsEnum lastLoginTs) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `CreatedUserId` | [`CreatedUserIdEnum`](../../doc/models/created-user-id-enum.md) | Optional | - | CreatedUserIdEnum getCreatedUserId() | setCreatedUserId(CreatedUserIdEnum createdUserId) |
| `TermsAcceptedTs` | [`TermsAcceptedTsEnum`](../../doc/models/terms-accepted-ts-enum.md) | Optional | - | TermsAcceptedTsEnum getTermsAcceptedTs() | setTermsAcceptedTs(TermsAcceptedTsEnum termsAcceptedTs) |
| `TermsAgreeIp` | [`TermsAgreeIpEnum`](../../doc/models/terms-agree-ip-enum.md) | Optional | - | TermsAgreeIpEnum getTermsAgreeIp() | setTermsAgreeIp(TermsAgreeIpEnum termsAgreeIp) |
| `CurrentDateTime` | [`CurrentDateTimeEnum`](../../doc/models/current-date-time-enum.md) | Optional | - | CurrentDateTimeEnum getCurrentDateTime() | setCurrentDateTime(CurrentDateTimeEnum currentDateTime) |

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

