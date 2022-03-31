
# Filter 1

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `AccountNumber` | `String` | Optional | - | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ContactApiId` | `String` | Optional | - | String getContactApiId() | setContactApiId(String contactApiId) |
| `FirstName` | `String` | Optional | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | - | String getLastName() | setLastName(String lastName) |
| `CellPhone` | `String` | Optional | - | String getCellPhone() | setCellPhone(String cellPhone) |
| `ContactBalance` | `String` | Optional | - | String getContactBalance() | setContactBalance(String contactBalance) |
| `Address` | `String` | Optional | - | String getAddress() | setAddress(String address) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `CompanyName` | `String` | Optional | - | String getCompanyName() | setCompanyName(String companyName) |
| `HeaderMessage` | `String` | Optional | - | String getHeaderMessage() | setHeaderMessage(String headerMessage) |
| `DateOfBirth` | `String` | Optional | - | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `EmailTrxReceipt` | `String` | Optional | - | String getEmailTrxReceipt() | setEmailTrxReceipt(String emailTrxReceipt) |
| `HomePhone` | `String` | Optional | - | String getHomePhone() | setHomePhone(String homePhone) |
| `OfficePhone` | `String` | Optional | - | String getOfficePhone() | setOfficePhone(String officePhone) |
| `OfficeExtPhone` | `String` | Optional | - | String getOfficeExtPhone() | setOfficeExtPhone(String officeExtPhone) |
| `HeaderMessageType` | `String` | Optional | - | String getHeaderMessageType() | setHeaderMessageType(String headerMessageType) |
| `UpdateIfExists` | `String` | Optional | - | String getUpdateIfExists() | setUpdateIfExists(String updateIfExists) |
| `Zip` | `String` | Optional | - | String getZip() | setZip(String zip) |
| `ContactC1` | `String` | Optional | - | String getContactC1() | setContactC1(String contactC1) |
| `ContactC2` | `String` | Optional | - | String getContactC2() | setContactC2(String contactC2) |
| `ContactC3` | `String` | Optional | - | String getContactC3() | setContactC3(String contactC3) |
| `ParentId` | `String` | Optional | - | String getParentId() | setParentId(String parentId) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `Active` | `String` | Optional | - | String getActive() | setActive(String active) |

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

