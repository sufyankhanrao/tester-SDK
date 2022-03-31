
# List 3

## Structure

`List3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandingDomainUrl` | `String` | Optional | Branding domain URL | String getBrandingDomainUrl() | setBrandingDomainUrl(String brandingDomainUrl) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `Id` | `String` | Required | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `Aba` | `String` | Optional | Aba / Routing<br>**Constraints**: *Minimum Length*: `9`, *Maximum Length*: `9`, *Pattern*: `^\d{9}$/` | String getAba() | setAba(String aba) |
| `AccountNumber` | `String` | Optional | Account number<br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `^[a-zA-Z0-9\-\_]+$` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `Address1` | `String` | Optional | Address 1<br>**Constraints**: *Maximum Length*: `255`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getAddress1() | setAddress1(String address1) |
| `Address2` | `String` | Optional | Address 2<br>**Constraints**: *Maximum Length*: `255`, *Pattern*: `^[\w\#\,\.\-\'\&\s\/]+$` | String getAddress2() | setAddress2(String address2) |
| `BrandingDomainId` | `String` | Optional | GUID for Branding Domain<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getBrandingDomainId() | setBrandingDomainId(String brandingDomainId) |
| `City` | `String` | Optional | City name<br>**Constraints**: *Maximum Length*: `100`, *Pattern*: `^[\w\s.]+$/` | String getCity() | setCity(String city) |
| `ContactEmailTrxReceiptDefault` | `Boolean` | Optional | If true, will email contact receipt for any transaction | Boolean getContactEmailTrxReceiptDefault() | setContactEmailTrxReceiptDefault(Boolean contactEmailTrxReceiptDefault) |
| `Dda` | `String` | Optional | Dda<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[\d]+$/` | String getDda() | setDda(String dda) |
| `DefaultAch` | `String` | Optional | GUID for Location's default ACH Product Transaction<br>**Constraints**: *Minimum Length*: `24`, *Maximum Length*: `36` | String getDefaultAch() | setDefaultAch(String defaultAch) |
| `DefaultCc` | `String` | Optional | GUID for Location's default CC Product Transaction<br>**Constraints**: *Minimum Length*: `24`, *Maximum Length*: `36` | String getDefaultCc() | setDefaultCc(String defaultCc) |
| `DeveloperCompanyId` | `String` | Optional | GUID for Developer Company<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getDeveloperCompanyId() | setDeveloperCompanyId(String developerCompanyId) |
| `EmailReplyTo` | `String` | Optional | Used as from email address when sending various notifications<br>**Constraints**: *Maximum Length*: `64` | String getEmailReplyTo() | setEmailReplyTo(String emailReplyTo) |
| `Fax` | `String` | Optional | Fax number<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10`, *Pattern*: `^\d{10}$` | String getFax() | setFax(String fax) |
| `LocationApiId` | `String` | Optional | Location api ID<br>**Constraints**: *Maximum Length*: `36` | String getLocationApiId() | setLocationApiId(String locationApiId) |
| `LocationApiKey` | `String` | Optional | Location api key<br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36` | String getLocationApiKey() | setLocationApiKey(String locationApiKey) |
| `LocationC1` | `String` | Optional | Can be used to store custom information for location.<br>**Constraints**: *Maximum Length*: `128` | String getLocationC1() | setLocationC1(String locationC1) |
| `LocationC2` | `String` | Optional | Can be used to store custom information for location.<br>**Constraints**: *Maximum Length*: `128` | String getLocationC2() | setLocationC2(String locationC2) |
| `LocationC3` | `String` | Optional | Can be used to store custom information for location.<br>**Constraints**: *Maximum Length*: `128` | String getLocationC3() | setLocationC3(String locationC3) |
| `Name` | `String` | Required | Name of the company<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getName() | setName(String name) |
| `OfficePhone` | `String` | Optional | Office phone number<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10` | String getOfficePhone() | setOfficePhone(String officePhone) |
| `OfficeExtPhone` | `String` | Optional | Office phone extension number<br>**Constraints**: *Maximum Length*: `10` | String getOfficeExtPhone() | setOfficeExtPhone(String officeExtPhone) |
| `ParentId` | `String` | Required | Location GUID of the parent location<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getParentId() | setParentId(String parentId) |
| `RecurringNotificationDaysDefault` | `Integer` | Optional | Number of days prior to a Recurring running that a notification should be sent<br>**Constraints**: `>= 0`, `<= 365` | Integer getRecurringNotificationDaysDefault() | setRecurringNotificationDaysDefault(Integer recurringNotificationDaysDefault) |
| `ShowContactFiles` | `Boolean` | Optional | If set to true will show 'Files' tab on Contact | Boolean getShowContactFiles() | setShowContactFiles(Boolean showContactFiles) |
| `ShowContactNotes` | `Boolean` | Optional | If set to true will show 'Notes' tab on Contact | Boolean getShowContactNotes() | setShowContactNotes(Boolean showContactNotes) |
| `State` | `String` | Optional | State name<br>**Constraints**: *Maximum Length*: `100`, *Pattern*: `^[\w\s.]+$/` | String getState() | setState(String state) |
| `TicketHashKey` | `String` | Optional | Ticket hash key<br>**Constraints**: *Maximum Length*: `36` | String getTicketHashKey() | setTicketHashKey(String ticketHashKey) |
| `Tz` | `String` | Optional | Time zone<br>**Constraints**: *Maximum Length*: `30` | String getTz() | setTz(String tz) |
| `ZipCode` | `String` | Optional | Zip code of the city<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `10`, *Pattern*: `^\d{5,10}$` | String getZipCode() | setZipCode(String zipCode) |
| `BrandingDomain` | `Object` | Required | Branding domain array | Object getBrandingDomain() | setBrandingDomain(Object brandingDomain) |
| `ProductTransactions` | `List<Object>` | Required | Product Transactions array | List<Object> getProductTransactions() | setProductTransactions(List<Object> productTransactions) |
| `ProductFile` | `Object` | Required | Product file array | Object getProductFile() | setProductFile(Object productFile) |
| `ProductAccountvault` | `Object` | Required | Product account vault array | Object getProductAccountvault() | setProductAccountvault(Object productAccountvault) |
| `ProductRecurring` | `Object` | Required | Product recurring array | Object getProductRecurring() | setProductRecurring(Object productRecurring) |
| `Tags` | `List<Object>` | Required | Tags array | List<Object> getTags() | setTags(List<Object> tags) |
| `Terminals` | `List<Object>` | Required | Terminals array | List<Object> getTerminals() | setTerminals(List<Object> terminals) |

## Example (as JSON)

```json
{
  "created_ts": null,
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "modified_ts": null,
  "name": "Sample Company Headquarters",
  "parent_id": "11e95f8ec39de8fbdb0a4f1a",
  "branding_domain": null,
  "product_transactions": null,
  "product_file": null,
  "product_accountvault": null,
  "product_recurring": null,
  "tags": null,
  "terminals": null
}
```

