
# Data 2

## Structure

`Data2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Required | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `AccountNumber` | `String` | Optional | Contact Account Number<br>**Constraints**: *Maximum Length*: `32` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ContactApiId` | `String` | Optional | Contact API Id<br>**Constraints**: *Maximum Length*: `64`, *Pattern*: `^[a-zA-Z0-9]*$` | String getContactApiId() | setContactApiId(String contactApiId) |
| `FirstName` | `String` | Optional | First Name<br>**Constraints**: *Maximum Length*: `64` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Required | Last Name<br>**Constraints**: *Maximum Length*: `64` | String getLastName() | setLastName(String lastName) |
| `CellPhone` | `String` | Optional | Cell phone of contact<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getCellPhone() | setCellPhone(String cellPhone) |
| `ContactBalance` | `Double` | Optional | Contact Balance<br>**Constraints**: `>= -99999999.99`, `<= 99999999.99` | Double getContactBalance() | setContactBalance(Double contactBalance) |
| `Address` | `String` | Optional | Address of contact<br>**Constraints**: *Maximum Length*: `255`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getAddress() | setAddress(String address) |
| `City` | `String` | Optional | City of contact<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getCity() | setCity(String city) |
| `State` | `String` | Optional | State of contact<br>**Constraints**: *Maximum Length*: `24`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getState() | setState(String state) |
| `CompanyName` | `String` | Optional | Company Name<br>**Constraints**: *Maximum Length*: `64` | String getCompanyName() | setCompanyName(String companyName) |
| `HeaderMessage` | `String` | Optional | Header Message<br>**Constraints**: *Maximum Length*: `250` | String getHeaderMessage() | setHeaderMessage(String headerMessage) |
| `DateOfBirth` | `String` | Optional | Contacts DOB, Format: yyyy-MM-dd<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `EmailTrxReceipt` | `boolean` | Required | Whether or not to email all transactions receipts to contact (1 or 0) | boolean getEmailTrxReceipt() | setEmailTrxReceipt(boolean emailTrxReceipt) |
| `HomePhone` | `String` | Optional | Contacts home phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getHomePhone() | setHomePhone(String homePhone) |
| `OfficePhone` | `String` | Optional | Contacts office phone<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getOfficePhone() | setOfficePhone(String officePhone) |
| `OfficeExtPhone` | `String` | Optional | Optional phone extension for office phone<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^\d{1,10}$` | String getOfficeExtPhone() | setOfficeExtPhone(String officeExtPhone) |
| `HeaderMessageType` | `int` | Required | Header Message Type<br>**Constraints**: `>= 0`, `<= 4` | int getHeaderMessageType() | setHeaderMessageType(int headerMessageType) |
| `UpdateIfExists` | [`UpdateIfExistsEnum`](../../doc/models/update-if-exists-enum.md) | Optional | Update If Exists | UpdateIfExistsEnum getUpdateIfExists() | setUpdateIfExists(UpdateIfExistsEnum updateIfExists) |
| `Zip` | `String` | Optional | Zip of contact<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `10`, *Pattern*: `^\d{5,10}$` | String getZip() | setZip(String zip) |
| `ContactC1` | `String` | Optional | Custom field 1 for api users to store custom data<br>**Constraints**: *Maximum Length*: `128` | String getContactC1() | setContactC1(String contactC1) |
| `ContactC2` | `String` | Optional | Custom field 2 for api users to store custom data<br>**Constraints**: *Maximum Length*: `128` | String getContactC2() | setContactC2(String contactC2) |
| `ContactC3` | `String` | Optional | Custom field 3 for api users to store custom data<br>**Constraints**: *Maximum Length*: `128` | String getContactC3() | setContactC3(String contactC3) |
| `ParentId` | `String` | Optional | Parent Id<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getParentId() | setParentId(String parentId) |
| `Email` | `String` | Optional | Email of contact<br>**Constraints**: *Maximum Length*: `64` | String getEmail() | setEmail(String email) |
| `Id` | `String` | Required | Contact ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `Active` | `int` | Required | Active<br>**Constraints**: `>= 0`, `<= 1` | int getActive() | setActive(int active) |

## Example (as JSON)

```json
{
  "location_id": "11e95f8ec39de8fbdb0a4f1a",
  "last_name": "Smith",
  "email_trx_receipt": true,
  "header_message_type": 0,
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "created_ts": null,
  "modified_ts": null,
  "active": 1
}
```

