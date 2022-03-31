
# Sort 3

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandingDomainUrl` | [`BrandingDomainUrlEnum`](../../doc/models/branding-domain-url-enum.md) | Optional | - | BrandingDomainUrlEnum getBrandingDomainUrl() | setBrandingDomainUrl(BrandingDomainUrlEnum brandingDomainUrl) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `Aba` | [`AbaEnum`](../../doc/models/aba-enum.md) | Optional | - | AbaEnum getAba() | setAba(AbaEnum aba) |
| `AccountNumber` | [`AccountNumberEnum`](../../doc/models/account-number-enum.md) | Optional | - | AccountNumberEnum getAccountNumber() | setAccountNumber(AccountNumberEnum accountNumber) |
| `Address1` | [`AddressEnum`](../../doc/models/address-enum.md) | Optional | - | AddressEnum getAddress1() | setAddress1(AddressEnum address1) |
| `Address2` | [`AddressEnum`](../../doc/models/address-enum.md) | Optional | - | AddressEnum getAddress2() | setAddress2(AddressEnum address2) |
| `BrandingDomainId` | [`BrandingDomainIdEnum`](../../doc/models/branding-domain-id-enum.md) | Optional | - | BrandingDomainIdEnum getBrandingDomainId() | setBrandingDomainId(BrandingDomainIdEnum brandingDomainId) |
| `City` | [`CityEnum`](../../doc/models/city-enum.md) | Optional | - | CityEnum getCity() | setCity(CityEnum city) |
| `ContactEmailTrxReceiptDefault` | [`ContactEmailTrxReceiptDefaultEnum`](../../doc/models/contact-email-trx-receipt-default-enum.md) | Optional | - | ContactEmailTrxReceiptDefaultEnum getContactEmailTrxReceiptDefault() | setContactEmailTrxReceiptDefault(ContactEmailTrxReceiptDefaultEnum contactEmailTrxReceiptDefault) |
| `Dda` | [`DdaEnum`](../../doc/models/dda-enum.md) | Optional | - | DdaEnum getDda() | setDda(DdaEnum dda) |
| `DefaultAch` | [`DefaultAchEnum`](../../doc/models/default-ach-enum.md) | Optional | - | DefaultAchEnum getDefaultAch() | setDefaultAch(DefaultAchEnum defaultAch) |
| `DefaultCc` | [`DefaultCcEnum`](../../doc/models/default-cc-enum.md) | Optional | - | DefaultCcEnum getDefaultCc() | setDefaultCc(DefaultCcEnum defaultCc) |
| `DeveloperCompanyId` | [`DeveloperCompanyIdEnum`](../../doc/models/developer-company-id-enum.md) | Optional | - | DeveloperCompanyIdEnum getDeveloperCompanyId() | setDeveloperCompanyId(DeveloperCompanyIdEnum developerCompanyId) |
| `EmailReplyTo` | [`EmailReplyToEnum`](../../doc/models/email-reply-to-enum.md) | Optional | - | EmailReplyToEnum getEmailReplyTo() | setEmailReplyTo(EmailReplyToEnum emailReplyTo) |
| `Fax` | [`FaxEnum`](../../doc/models/fax-enum.md) | Optional | - | FaxEnum getFax() | setFax(FaxEnum fax) |
| `LocationApiId` | [`LocationApiIdEnum`](../../doc/models/location-api-id-enum.md) | Optional | - | LocationApiIdEnum getLocationApiId() | setLocationApiId(LocationApiIdEnum locationApiId) |
| `LocationApiKey` | [`LocationApiKeyEnum`](../../doc/models/location-api-key-enum.md) | Optional | - | LocationApiKeyEnum getLocationApiKey() | setLocationApiKey(LocationApiKeyEnum locationApiKey) |
| `LocationC1` | [`LocationC1Enum`](../../doc/models/location-c1-enum.md) | Optional | - | LocationC1Enum getLocationC1() | setLocationC1(LocationC1Enum locationC1) |
| `LocationC2` | [`LocationC1Enum`](../../doc/models/location-c1-enum.md) | Optional | - | LocationC1Enum getLocationC2() | setLocationC2(LocationC1Enum locationC2) |
| `LocationC3` | [`LocationC1Enum`](../../doc/models/location-c1-enum.md) | Optional | - | LocationC1Enum getLocationC3() | setLocationC3(LocationC1Enum locationC3) |
| `Name` | [`NameEnum`](../../doc/models/name-enum.md) | Optional | - | NameEnum getName() | setName(NameEnum name) |
| `OfficePhone` | [`OfficePhoneEnum`](../../doc/models/office-phone-enum.md) | Optional | - | OfficePhoneEnum getOfficePhone() | setOfficePhone(OfficePhoneEnum officePhone) |
| `OfficeExtPhone` | [`OfficeExtPhoneEnum`](../../doc/models/office-ext-phone-enum.md) | Optional | - | OfficeExtPhoneEnum getOfficeExtPhone() | setOfficeExtPhone(OfficeExtPhoneEnum officeExtPhone) |
| `ParentId` | [`ParentIdEnum`](../../doc/models/parent-id-enum.md) | Optional | - | ParentIdEnum getParentId() | setParentId(ParentIdEnum parentId) |
| `RecurringNotificationDaysDefault` | [`RecurringNotificationDaysDefaultEnum`](../../doc/models/recurring-notification-days-default-enum.md) | Optional | - | RecurringNotificationDaysDefaultEnum getRecurringNotificationDaysDefault() | setRecurringNotificationDaysDefault(RecurringNotificationDaysDefaultEnum recurringNotificationDaysDefault) |
| `ShowContactFiles` | [`ShowContactFilesEnum`](../../doc/models/show-contact-files-enum.md) | Optional | - | ShowContactFilesEnum getShowContactFiles() | setShowContactFiles(ShowContactFilesEnum showContactFiles) |
| `ShowContactNotes` | [`ShowContactNotesEnum`](../../doc/models/show-contact-notes-enum.md) | Optional | - | ShowContactNotesEnum getShowContactNotes() | setShowContactNotes(ShowContactNotesEnum showContactNotes) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Optional | - | StateEnum getState() | setState(StateEnum state) |
| `TicketHashKey` | [`TicketHashKeyEnum`](../../doc/models/ticket-hash-key-enum.md) | Optional | - | TicketHashKeyEnum getTicketHashKey() | setTicketHashKey(TicketHashKeyEnum ticketHashKey) |
| `Tz` | [`TzEnum`](../../doc/models/tz-enum.md) | Optional | - | TzEnum getTz() | setTz(TzEnum tz) |
| `ZipCode` | [`ZipCodeEnum`](../../doc/models/zip-code-enum.md) | Optional | - | ZipCodeEnum getZipCode() | setZipCode(ZipCodeEnum zipCode) |
| `BrandingDomain` | [`BrandingDomainEnum`](../../doc/models/branding-domain-enum.md) | Optional | - | BrandingDomainEnum getBrandingDomain() | setBrandingDomain(BrandingDomainEnum brandingDomain) |
| `ProductTransactions` | [`ProductTransactionsEnum`](../../doc/models/product-transactions-enum.md) | Optional | - | ProductTransactionsEnum getProductTransactions() | setProductTransactions(ProductTransactionsEnum productTransactions) |
| `ProductFile` | [`ProductFileEnum`](../../doc/models/product-file-enum.md) | Optional | - | ProductFileEnum getProductFile() | setProductFile(ProductFileEnum productFile) |
| `ProductAccountvault` | [`ProductAccountvaultEnum`](../../doc/models/product-accountvault-enum.md) | Optional | - | ProductAccountvaultEnum getProductAccountvault() | setProductAccountvault(ProductAccountvaultEnum productAccountvault) |
| `ProductRecurring` | [`ProductRecurringEnum`](../../doc/models/product-recurring-enum.md) | Optional | - | ProductRecurringEnum getProductRecurring() | setProductRecurring(ProductRecurringEnum productRecurring) |
| `Tags` | [`TagsEnum`](../../doc/models/tags-enum.md) | Optional | - | TagsEnum getTags() | setTags(TagsEnum tags) |
| `Terminals` | [`TerminalsEnum`](../../doc/models/terminals-enum.md) | Optional | - | TerminalsEnum getTerminals() | setTerminals(TerminalsEnum terminals) |

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

