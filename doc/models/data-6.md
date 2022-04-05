
# Data 6

## Structure

`Data6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrimaryPrincipal` | [`PrimaryPrincipal`](../../doc/models/primary-principal.md) | Required | The Primary Principal. | PrimaryPrincipal getPrimaryPrincipal() | setPrimaryPrincipal(PrimaryPrincipal primaryPrincipal) |
| `TemplateCode` | `String` | Required | The ID of the template to be used - this value will be provided by Fortis.<br>**Constraints**: *Maximum Length*: `10` | String getTemplateCode() | setTemplateCode(String templateCode) |
| `Email` | `String` | Required | Merchant email address.<br>**Constraints**: *Maximum Length*: `100` | String getEmail() | setEmail(String email) |
| `DbaName` | `String` | Required | Merchant 'Doing Business As' name.<br>**Constraints**: *Maximum Length*: `100` | String getDbaName() | setDbaName(String dbaName) |
| `Location` | [`Location`](../../doc/models/location.md) | Required | The Location. | Location getLocation() | setLocation(Location location) |
| `AppDelivery` | `String` | Required | The delivery method of the app to the merchant.<br>**Constraints**: *Maximum Length*: `20` | String getAppDelivery() | setAppDelivery(String appDelivery) |
| `BusinessCategory` | `String` | Optional | The Category of the merchant's business<br>**Constraints**: *Maximum Length*: `50` | String getBusinessCategory() | setBusinessCategory(String businessCategory) |
| `BusinessType` | `String` | Optional | The Type of a merchant's business.<br>**Constraints**: *Maximum Length*: `50` | String getBusinessType() | setBusinessType(String businessType) |
| `BusinessDescription` | `String` | Optional | Description of Goods or Services.<br>**Constraints**: *Maximum Length*: `200` | String getBusinessDescription() | setBusinessDescription(String businessDescription) |
| `SwipedPercent` | `Double` | Optional | Card present/swiped percentage<br>**Constraints**: `>= 0`, `<= 100` | Double getSwipedPercent() | setSwipedPercent(Double swipedPercent) |
| `KeyedPercent` | `Double` | Optional | Card not present/keyed percentage<br>**Constraints**: `>= 0`, `<= 100` | Double getKeyedPercent() | setKeyedPercent(Double keyedPercent) |
| `EcommercePercent` | `Double` | Optional | eCommerce percentage.<br>**Constraints**: `>= 0`, `<= 100` | Double getEcommercePercent() | setEcommercePercent(Double ecommercePercent) |
| `OwnershipType` | [`OwnershipTypeEnum`](../../doc/models/ownership-type-enum.md) | Optional | The Ownership Type of the merchant's business.<br>**Constraints**: *Maximum Length*: `10` | OwnershipTypeEnum getOwnershipType() | setOwnershipType(OwnershipTypeEnum ownershipType) |
| `FedTaxId` | `String` | Optional | Federal Tax ID (EIN).<br>**Constraints**: *Maximum Length*: `10` | String getFedTaxId() | setFedTaxId(String fedTaxId) |
| `CcAverageTicketRange` | `Double` | Optional | Average Transaction Amount Range<br>**Constraints**: `>= 1`, `<= 7` | Double getCcAverageTicketRange() | setCcAverageTicketRange(Double ccAverageTicketRange) |
| `CcMonthlyVolumeRange` | `Double` | Optional | Monthly Processing Volume Range<br>**Constraints**: `>= 1`, `<= 7` | Double getCcMonthlyVolumeRange() | setCcMonthlyVolumeRange(Double ccMonthlyVolumeRange) |
| `CcHighTicket` | `Double` | Optional | Highest transaction amount rounded to the next dollar<br>**Constraints**: `>= 0`, `<= 30000` | Double getCcHighTicket() | setCcHighTicket(Double ccHighTicket) |
| `EcAverageTicketRange` | `Double` | Optional | Average Transaction Amount Range<br>**Constraints**: `>= 1`, `<= 7` | Double getEcAverageTicketRange() | setEcAverageTicketRange(Double ecAverageTicketRange) |
| `EcMonthlyVolumeRange` | `Double` | Optional | Monthly Processing Volume Range<br>**Constraints**: `>= 1`, `<= 7` | Double getEcMonthlyVolumeRange() | setEcMonthlyVolumeRange(Double ecMonthlyVolumeRange) |
| `EcHighTicket` | `Double` | Optional | Highest transaction amount rounded to the next dollar<br>**Constraints**: `>= 0`, `<= 30000` | Double getEcHighTicket() | setEcHighTicket(Double ecHighTicket) |
| `Website` | `String` | Optional | Merchant's business website.<br>**Constraints**: *Maximum Length*: `100` | String getWebsite() | setWebsite(String website) |
| `BankAccount` | [`BankAccount`](../../doc/models/bank-account.md) | Required | The Bank Account. | BankAccount getBankAccount() | setBankAccount(BankAccount bankAccount) |
| `LegalName` | `String` | Optional | Merchant legal name.<br>**Constraints**: *Maximum Length*: `100` | String getLegalName() | setLegalName(String legalName) |
| `Contact` | [`Contact`](../../doc/models/contact.md) | Required | The Contact. | Contact getContact() | setContact(Contact contact) |
| `ClientAppId` | `String` | Required | Client-Issued ID to uniquely identify the merchant (Returned unmodified).<br>**Constraints**: *Maximum Length*: `20` | String getClientAppId() | setClientAppId(String clientAppId) |
| `AppCompleteEndpoint` | `String` | Optional | Client-side Redirect URL called after merchant completes application.<br>**Constraints**: *Maximum Length*: `400` | String getAppCompleteEndpoint() | setAppCompleteEndpoint(String appCompleteEndpoint) |
| `IsTest` | [`IsTestEnum`](../../doc/models/is-test-enum.md) | Optional | For testing only. When this property is set to 'true', the application will be submitted in demo mode.<br>**Default**: `IsTestEnum.ENUM_FALSE` | IsTestEnum getIsTest() | setIsTest(IsTestEnum isTest) |
| `Id` | `String` | Required | Contact ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `AppLink` | `String` | Required | A full page or iframeable link, set in the request app_delivery field, that can be used to retrieve and resume the generated merchant application. No link will be returned for the Default.<br>**Constraints**: *Maximum Length*: `400` | String getAppLink() | setAppLink(String appLink) |
| `EpicAppId` | `String` | Required | Fortis internal ID. Can be created that can be used to uniquely reference an application if a client_app_id is not supplied.<br>**Constraints**: *Maximum Length*: `128` | String getEpicAppId() | setEpicAppId(String epicAppId) |

## Example (as JSON)

```json
{
  "primary_principal": {
    "first_name": "Bob",
    "last_name": "Fairview"
  },
  "template_code": null,
  "email": "jtodd@example.com",
  "dba_name": "Discount Home Goods",
  "location": {
    "phone_number": "555-555-1212"
  },
  "app_delivery": null,
  "bank_account": null,
  "contact": {
    "phone_number": "555-555-3456"
  },
  "client_app_id": null,
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "app_link": "https://mpa.epicpay.com/ezapp/signup/7271bd8180684862928555caf201f156",
  "epic_app_id": "7271bd8180684862928555caf201f156"
}
```

