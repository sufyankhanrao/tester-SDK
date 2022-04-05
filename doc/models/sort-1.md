
# Sort 1

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `AccountNumber` | [`AccountNumberEnum`](../../doc/models/account-number-enum.md) | Optional | - | AccountNumberEnum getAccountNumber() | setAccountNumber(AccountNumberEnum accountNumber) |
| `ContactApiId` | [`ContactApiIdEnum`](../../doc/models/contact-api-id-enum.md) | Optional | - | ContactApiIdEnum getContactApiId() | setContactApiId(ContactApiIdEnum contactApiId) |
| `FirstName` | [`FirstNameEnum`](../../doc/models/first-name-enum.md) | Optional | - | FirstNameEnum getFirstName() | setFirstName(FirstNameEnum firstName) |
| `LastName` | [`LastNameEnum`](../../doc/models/last-name-enum.md) | Optional | - | LastNameEnum getLastName() | setLastName(LastNameEnum lastName) |
| `CellPhone` | [`CellPhoneEnum`](../../doc/models/cell-phone-enum.md) | Optional | - | CellPhoneEnum getCellPhone() | setCellPhone(CellPhoneEnum cellPhone) |
| `ContactBalance` | [`ContactBalanceEnum`](../../doc/models/contact-balance-enum.md) | Optional | - | ContactBalanceEnum getContactBalance() | setContactBalance(ContactBalanceEnum contactBalance) |
| `Address` | [`AddressEnum`](../../doc/models/address-enum.md) | Optional | - | AddressEnum getAddress() | setAddress(AddressEnum address) |
| `City` | [`CityEnum`](../../doc/models/city-enum.md) | Optional | - | CityEnum getCity() | setCity(CityEnum city) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Optional | - | StateEnum getState() | setState(StateEnum state) |
| `CompanyName` | [`CompanyNameEnum`](../../doc/models/company-name-enum.md) | Optional | - | CompanyNameEnum getCompanyName() | setCompanyName(CompanyNameEnum companyName) |
| `HeaderMessage` | [`HeaderMessageEnum`](../../doc/models/header-message-enum.md) | Optional | - | HeaderMessageEnum getHeaderMessage() | setHeaderMessage(HeaderMessageEnum headerMessage) |
| `DateOfBirth` | [`DateOfBirthEnum`](../../doc/models/date-of-birth-enum.md) | Optional | - | DateOfBirthEnum getDateOfBirth() | setDateOfBirth(DateOfBirthEnum dateOfBirth) |
| `EmailTrxReceipt` | [`EmailTrxReceiptEnum`](../../doc/models/email-trx-receipt-enum.md) | Optional | - | EmailTrxReceiptEnum getEmailTrxReceipt() | setEmailTrxReceipt(EmailTrxReceiptEnum emailTrxReceipt) |
| `HomePhone` | [`HomePhoneEnum`](../../doc/models/home-phone-enum.md) | Optional | - | HomePhoneEnum getHomePhone() | setHomePhone(HomePhoneEnum homePhone) |
| `OfficePhone` | [`OfficePhoneEnum`](../../doc/models/office-phone-enum.md) | Optional | - | OfficePhoneEnum getOfficePhone() | setOfficePhone(OfficePhoneEnum officePhone) |
| `OfficeExtPhone` | [`OfficeExtPhoneEnum`](../../doc/models/office-ext-phone-enum.md) | Optional | - | OfficeExtPhoneEnum getOfficeExtPhone() | setOfficeExtPhone(OfficeExtPhoneEnum officeExtPhone) |
| `HeaderMessageType` | [`HeaderMessageTypeEnum`](../../doc/models/header-message-type-enum.md) | Optional | - | HeaderMessageTypeEnum getHeaderMessageType() | setHeaderMessageType(HeaderMessageTypeEnum headerMessageType) |
| `UpdateIfExists` | [`UpdateIfExists3Enum`](../../doc/models/update-if-exists-3-enum.md) | Optional | - | UpdateIfExists3Enum getUpdateIfExists() | setUpdateIfExists(UpdateIfExists3Enum updateIfExists) |
| `Zip` | [`ZipEnum`](../../doc/models/zip-enum.md) | Optional | - | ZipEnum getZip() | setZip(ZipEnum zip) |
| `ContactC1` | [`ContactC1Enum`](../../doc/models/contact-c1-enum.md) | Optional | - | ContactC1Enum getContactC1() | setContactC1(ContactC1Enum contactC1) |
| `ContactC2` | [`ContactC1Enum`](../../doc/models/contact-c1-enum.md) | Optional | - | ContactC1Enum getContactC2() | setContactC2(ContactC1Enum contactC2) |
| `ContactC3` | [`ContactC1Enum`](../../doc/models/contact-c1-enum.md) | Optional | - | ContactC1Enum getContactC3() | setContactC3(ContactC1Enum contactC3) |
| `ParentId` | [`ParentIdEnum`](../../doc/models/parent-id-enum.md) | Optional | - | ParentIdEnum getParentId() | setParentId(ParentIdEnum parentId) |
| `Email` | [`EmailEnum`](../../doc/models/email-enum.md) | Optional | - | EmailEnum getEmail() | setEmail(EmailEnum email) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `Active` | [`Active4Enum`](../../doc/models/active-4-enum.md) | Optional | - | Active4Enum getActive() | setActive(Active4Enum active) |

## Example (as JSON)

```json
{
  "location_id": null,
  "account_number": null,
  "contact_api_id": null,
  "first_name": null,
  "last_name": null,
  "cell_phone": null,
  "contact_balance": null,
  "address": null,
  "city": null,
  "state": null,
  "company_name": null,
  "header_message": null,
  "date_of_birth": null,
  "email_trx_receipt": null,
  "home_phone": null,
  "office_phone": null,
  "office_ext_phone": null,
  "header_message_type": null,
  "update_if_exists": null,
  "zip": null,
  "contact_c1": null,
  "contact_c2": null,
  "contact_c3": null,
  "parent_id": null,
  "email": null,
  "id": null,
  "created_ts": null,
  "modified_ts": null,
  "active": null
}
```

