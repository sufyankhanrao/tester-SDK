
# Filter 3

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandingDomainUrl` | `String` | Optional | - | String getBrandingDomainUrl() | setBrandingDomainUrl(String brandingDomainUrl) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `Aba` | `String` | Optional | - | String getAba() | setAba(String aba) |
| `AccountNumber` | `String` | Optional | - | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `Address1` | `String` | Optional | - | String getAddress1() | setAddress1(String address1) |
| `Address2` | `String` | Optional | - | String getAddress2() | setAddress2(String address2) |
| `BrandingDomainId` | `String` | Optional | - | String getBrandingDomainId() | setBrandingDomainId(String brandingDomainId) |
| `City` | `String` | Optional | - | String getCity() | setCity(String city) |
| `ContactEmailTrxReceiptDefault` | `String` | Optional | - | String getContactEmailTrxReceiptDefault() | setContactEmailTrxReceiptDefault(String contactEmailTrxReceiptDefault) |
| `Dda` | `String` | Optional | - | String getDda() | setDda(String dda) |
| `DefaultAch` | `String` | Optional | - | String getDefaultAch() | setDefaultAch(String defaultAch) |
| `DefaultCc` | `String` | Optional | - | String getDefaultCc() | setDefaultCc(String defaultCc) |
| `DeveloperCompanyId` | `String` | Optional | - | String getDeveloperCompanyId() | setDeveloperCompanyId(String developerCompanyId) |
| `EmailReplyTo` | `String` | Optional | - | String getEmailReplyTo() | setEmailReplyTo(String emailReplyTo) |
| `Fax` | `String` | Optional | - | String getFax() | setFax(String fax) |
| `LocationApiId` | `String` | Optional | - | String getLocationApiId() | setLocationApiId(String locationApiId) |
| `LocationApiKey` | `String` | Optional | - | String getLocationApiKey() | setLocationApiKey(String locationApiKey) |
| `LocationC1` | `String` | Optional | - | String getLocationC1() | setLocationC1(String locationC1) |
| `LocationC2` | `String` | Optional | - | String getLocationC2() | setLocationC2(String locationC2) |
| `LocationC3` | `String` | Optional | - | String getLocationC3() | setLocationC3(String locationC3) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `OfficePhone` | `String` | Optional | - | String getOfficePhone() | setOfficePhone(String officePhone) |
| `OfficeExtPhone` | `String` | Optional | - | String getOfficeExtPhone() | setOfficeExtPhone(String officeExtPhone) |
| `ParentId` | `String` | Optional | - | String getParentId() | setParentId(String parentId) |
| `RecurringNotificationDaysDefault` | `String` | Optional | - | String getRecurringNotificationDaysDefault() | setRecurringNotificationDaysDefault(String recurringNotificationDaysDefault) |
| `ShowContactFiles` | `String` | Optional | - | String getShowContactFiles() | setShowContactFiles(String showContactFiles) |
| `ShowContactNotes` | `String` | Optional | - | String getShowContactNotes() | setShowContactNotes(String showContactNotes) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `TicketHashKey` | `String` | Optional | - | String getTicketHashKey() | setTicketHashKey(String ticketHashKey) |
| `Tz` | `String` | Optional | - | String getTz() | setTz(String tz) |
| `ZipCode` | `String` | Optional | - | String getZipCode() | setZipCode(String zipCode) |
| `BrandingDomain` | `String` | Optional | - | String getBrandingDomain() | setBrandingDomain(String brandingDomain) |
| `ProductTransactions` | `String` | Optional | - | String getProductTransactions() | setProductTransactions(String productTransactions) |
| `ProductFile` | `String` | Optional | - | String getProductFile() | setProductFile(String productFile) |
| `ProductAccountvault` | `String` | Optional | - | String getProductAccountvault() | setProductAccountvault(String productAccountvault) |
| `ProductRecurring` | `String` | Optional | - | String getProductRecurring() | setProductRecurring(String productRecurring) |
| `Tags` | `String` | Optional | - | String getTags() | setTags(String tags) |
| `Terminals` | `String` | Optional | - | String getTerminals() | setTerminals(String terminals) |

## Example (as JSON)

```json
{
  "branding_domain_url": null,
  "created_ts": null,
  "id": null,
  "modified_ts": null,
  "aba": null,
  "account_number": null,
  "address1": null,
  "address2": null,
  "branding_domain_id": null,
  "city": null,
  "contact_email_trx_receipt_default": null,
  "dda": null,
  "default_ach": null,
  "default_cc": null,
  "developer_company_id": null,
  "email_reply_to": null,
  "fax": null,
  "location_api_id": null,
  "location_api_key": null,
  "location_c1": null,
  "location_c2": null,
  "location_c3": null,
  "name": null,
  "office_phone": null,
  "office_ext_phone": null,
  "parent_id": null,
  "recurring_notification_days_default": null,
  "show_contact_files": null,
  "show_contact_notes": null,
  "state": null,
  "ticket_hash_key": null,
  "tz": null,
  "zip_code": null,
  "branding_domain": null,
  "product_transactions": null,
  "product_file": null,
  "product_accountvault": null,
  "product_recurring": null,
  "tags": null,
  "terminals": null
}
```

