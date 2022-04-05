
# Filter 10

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter10`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountHolderName` | `String` | Optional | - | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `AccountNumber` | `String` | Optional | - | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountVaultApiId` | `String` | Optional | - | String getAccountVaultApiId() | setAccountVaultApiId(String accountVaultApiId) |
| `AccountvaultC1` | `String` | Optional | - | String getAccountvaultC1() | setAccountvaultC1(String accountvaultC1) |
| `AccountvaultC2` | `String` | Optional | - | String getAccountvaultC2() | setAccountvaultC2(String accountvaultC2) |
| `AccountvaultC3` | `String` | Optional | - | String getAccountvaultC3() | setAccountvaultC3(String accountvaultC3) |
| `AchSecCode` | `String` | Optional | - | String getAchSecCode() | setAchSecCode(String achSecCode) |
| `BillingAddress` | `String` | Optional | - | String getBillingAddress() | setBillingAddress(String billingAddress) |
| `BillingCity` | `String` | Optional | - | String getBillingCity() | setBillingCity(String billingCity) |
| `BillingPhone` | `String` | Optional | - | String getBillingPhone() | setBillingPhone(String billingPhone) |
| `BillingState` | `String` | Optional | - | String getBillingState() | setBillingState(String billingState) |
| `BillingZip` | `String` | Optional | - | String getBillingZip() | setBillingZip(String billingZip) |
| `ContactId` | `String` | Optional | - | String getContactId() | setContactId(String contactId) |
| `CustomerId` | `String` | Optional | - | String getCustomerId() | setCustomerId(String customerId) |
| `DriversLicense` | `String` | Optional | - | String getDriversLicense() | setDriversLicense(String driversLicense) |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `PreviousAccountVaultApiId` | `String` | Optional | - | String getPreviousAccountVaultApiId() | setPreviousAccountVaultApiId(String previousAccountVaultApiId) |
| `PreviousAccountVaultId` | `String` | Optional | - | String getPreviousAccountVaultId() | setPreviousAccountVaultId(String previousAccountVaultId) |
| `PreviousTransactionId` | `String` | Optional | - | String getPreviousTransactionId() | setPreviousTransactionId(String previousTransactionId) |
| `Ssn4` | `String` | Optional | - | String getSsn4() | setSsn4(String ssn4) |
| `TermsAgree` | `String` | Optional | - | String getTermsAgree() | setTermsAgree(String termsAgree) |
| `TermsAgreeIp` | `String` | Optional | - | String getTermsAgreeIp() | setTermsAgreeIp(String termsAgreeIp) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `AccountType` | `String` | Optional | - | String getAccountType() | setAccountType(String accountType) |
| `Active` | `String` | Optional | - | String getActive() | setActive(String active) |
| `CauSummaryStatusId` | `String` | Optional | - | String getCauSummaryStatusId() | setCauSummaryStatusId(String cauSummaryStatusId) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `ESerialNumber` | `String` | Optional | - | String getESerialNumber() | setESerialNumber(String eSerialNumber) |
| `ETrackData` | `String` | Optional | - | String getETrackData() | setETrackData(String eTrackData) |
| `EFormat` | `String` | Optional | - | String getEFormat() | setEFormat(String eFormat) |
| `EKeyedData` | `String` | Optional | - | String getEKeyedData() | setEKeyedData(String eKeyedData) |
| `ExpiringInMonths` | `String` | Optional | - | String getExpiringInMonths() | setExpiringInMonths(String expiringInMonths) |
| `FirstSix` | `String` | Optional | - | String getFirstSix() | setFirstSix(String firstSix) |
| `HasRecurring` | `String` | Optional | - | String getHasRecurring() | setHasRecurring(String hasRecurring) |
| `LastFour` | `String` | Optional | - | String getLastFour() | setLastFour(String lastFour) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `PaymentMethod` | `String` | Optional | - | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `Ticket` | `String` | Optional | - | String getTicket() | setTicket(String ticket) |
| `TrackData` | `String` | Optional | - | String getTrackData() | setTrackData(String trackData) |

## Example (as JSON)

```json
{
  "account_holder_name": null,
  "account_number": null,
  "account_vault_api_id": null,
  "accountvault_c1": null,
  "accountvault_c2": null,
  "accountvault_c3": null,
  "ach_sec_code": null,
  "billing_address": null,
  "billing_city": null,
  "billing_phone": null,
  "billing_state": null,
  "billing_zip": null,
  "contact_id": null,
  "customer_id": null,
  "drivers_license": null,
  "location_id": null,
  "previous_account_vault_api_id": null,
  "previous_account_vault_id": null,
  "previous_transaction_id": null,
  "ssn4": null,
  "terms_agree": null,
  "terms_agree_ip": null,
  "title": null,
  "account_type": null,
  "active": null,
  "cau_summary_status_id": null,
  "created_ts": null,
  "id": null,
  "e_serial_number": null,
  "e_track_data": null,
  "e_format": null,
  "e_keyed_data": null,
  "expiring_in_months": null,
  "first_six": null,
  "has_recurring": null,
  "last_four": null,
  "modified_ts": null,
  "payment_method": null,
  "ticket": null,
  "track_data": null
}
```

