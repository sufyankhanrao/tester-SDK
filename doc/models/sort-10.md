
# Sort 10

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort10`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountHolderName` | [`AccountHolderNameEnum`](../../doc/models/account-holder-name-enum.md) | Optional | - | AccountHolderNameEnum getAccountHolderName() | setAccountHolderName(AccountHolderNameEnum accountHolderName) |
| `AccountNumber` | [`AccountNumberEnum`](../../doc/models/account-number-enum.md) | Optional | - | AccountNumberEnum getAccountNumber() | setAccountNumber(AccountNumberEnum accountNumber) |
| `AccountVaultApiId` | [`AccountVaultApiIdEnum`](../../doc/models/account-vault-api-id-enum.md) | Optional | - | AccountVaultApiIdEnum getAccountVaultApiId() | setAccountVaultApiId(AccountVaultApiIdEnum accountVaultApiId) |
| `AccountvaultC1` | [`AccountvaultC1Enum`](../../doc/models/accountvault-c1-enum.md) | Optional | - | AccountvaultC1Enum getAccountvaultC1() | setAccountvaultC1(AccountvaultC1Enum accountvaultC1) |
| `AccountvaultC2` | [`AccountvaultC1Enum`](../../doc/models/accountvault-c1-enum.md) | Optional | - | AccountvaultC1Enum getAccountvaultC2() | setAccountvaultC2(AccountvaultC1Enum accountvaultC2) |
| `AccountvaultC3` | [`AccountvaultC1Enum`](../../doc/models/accountvault-c1-enum.md) | Optional | - | AccountvaultC1Enum getAccountvaultC3() | setAccountvaultC3(AccountvaultC1Enum accountvaultC3) |
| `AchSecCode` | [`AchSecCode2Enum`](../../doc/models/ach-sec-code-2-enum.md) | Optional | - | AchSecCode2Enum getAchSecCode() | setAchSecCode(AchSecCode2Enum achSecCode) |
| `BillingAddress` | [`BillingAddressEnum`](../../doc/models/billing-address-enum.md) | Optional | - | BillingAddressEnum getBillingAddress() | setBillingAddress(BillingAddressEnum billingAddress) |
| `BillingCity` | [`BillingCityEnum`](../../doc/models/billing-city-enum.md) | Optional | - | BillingCityEnum getBillingCity() | setBillingCity(BillingCityEnum billingCity) |
| `BillingPhone` | [`BillingPhoneEnum`](../../doc/models/billing-phone-enum.md) | Optional | - | BillingPhoneEnum getBillingPhone() | setBillingPhone(BillingPhoneEnum billingPhone) |
| `BillingState` | [`BillingStateEnum`](../../doc/models/billing-state-enum.md) | Optional | - | BillingStateEnum getBillingState() | setBillingState(BillingStateEnum billingState) |
| `BillingZip` | [`BillingZipEnum`](../../doc/models/billing-zip-enum.md) | Optional | - | BillingZipEnum getBillingZip() | setBillingZip(BillingZipEnum billingZip) |
| `ContactId` | [`ContactIdEnum`](../../doc/models/contact-id-enum.md) | Optional | - | ContactIdEnum getContactId() | setContactId(ContactIdEnum contactId) |
| `CustomerId` | [`CustomerIdEnum`](../../doc/models/customer-id-enum.md) | Optional | - | CustomerIdEnum getCustomerId() | setCustomerId(CustomerIdEnum customerId) |
| `DriversLicense` | [`DriversLicense7Enum`](../../doc/models/drivers-license-7-enum.md) | Optional | - | DriversLicense7Enum getDriversLicense() | setDriversLicense(DriversLicense7Enum driversLicense) |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `PreviousAccountVaultApiId` | [`PreviousAccountVaultApiIdEnum`](../../doc/models/previous-account-vault-api-id-enum.md) | Optional | - | PreviousAccountVaultApiIdEnum getPreviousAccountVaultApiId() | setPreviousAccountVaultApiId(PreviousAccountVaultApiIdEnum previousAccountVaultApiId) |
| `PreviousAccountVaultId` | [`PreviousAccountVaultIdEnum`](../../doc/models/previous-account-vault-id-enum.md) | Optional | - | PreviousAccountVaultIdEnum getPreviousAccountVaultId() | setPreviousAccountVaultId(PreviousAccountVaultIdEnum previousAccountVaultId) |
| `PreviousTransactionId` | [`PreviousTransactionIdEnum`](../../doc/models/previous-transaction-id-enum.md) | Optional | - | PreviousTransactionIdEnum getPreviousTransactionId() | setPreviousTransactionId(PreviousTransactionIdEnum previousTransactionId) |
| `Ssn4` | [`Ssn4Enum`](../../doc/models/ssn-4-enum.md) | Optional | - | Ssn4Enum getSsn4() | setSsn4(Ssn4Enum ssn4) |
| `TermsAgree` | [`TermsAgreeEnum`](../../doc/models/terms-agree-enum.md) | Optional | - | TermsAgreeEnum getTermsAgree() | setTermsAgree(TermsAgreeEnum termsAgree) |
| `TermsAgreeIp` | [`TermsAgreeIpEnum`](../../doc/models/terms-agree-ip-enum.md) | Optional | - | TermsAgreeIpEnum getTermsAgreeIp() | setTermsAgreeIp(TermsAgreeIpEnum termsAgreeIp) |
| `Title` | [`TitleEnum`](../../doc/models/title-enum.md) | Optional | - | TitleEnum getTitle() | setTitle(TitleEnum title) |
| `AccountType` | [`AccountType3Enum`](../../doc/models/account-type-3-enum.md) | Optional | - | AccountType3Enum getAccountType() | setAccountType(AccountType3Enum accountType) |
| `Active` | [`Active4Enum`](../../doc/models/active-4-enum.md) | Optional | - | Active4Enum getActive() | setActive(Active4Enum active) |
| `CauSummaryStatusId` | [`CauSummaryStatusIdEnum`](../../doc/models/cau-summary-status-id-enum.md) | Optional | - | CauSummaryStatusIdEnum getCauSummaryStatusId() | setCauSummaryStatusId(CauSummaryStatusIdEnum cauSummaryStatusId) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `ESerialNumber` | [`ESerialNumberEnum`](../../doc/models/e-serial-number-enum.md) | Optional | - | ESerialNumberEnum getESerialNumber() | setESerialNumber(ESerialNumberEnum eSerialNumber) |
| `ETrackData` | [`ETrackDataEnum`](../../doc/models/e-track-data-enum.md) | Optional | - | ETrackDataEnum getETrackData() | setETrackData(ETrackDataEnum eTrackData) |
| `EFormat` | [`EFormat2Enum`](../../doc/models/e-format-2-enum.md) | Optional | - | EFormat2Enum getEFormat() | setEFormat(EFormat2Enum eFormat) |
| `EKeyedData` | [`EKeyedDataEnum`](../../doc/models/e-keyed-data-enum.md) | Optional | - | EKeyedDataEnum getEKeyedData() | setEKeyedData(EKeyedDataEnum eKeyedData) |
| `ExpiringInMonths` | [`ExpiringInMonthsEnum`](../../doc/models/expiring-in-months-enum.md) | Optional | - | ExpiringInMonthsEnum getExpiringInMonths() | setExpiringInMonths(ExpiringInMonthsEnum expiringInMonths) |
| `FirstSix` | [`FirstSixEnum`](../../doc/models/first-six-enum.md) | Optional | - | FirstSixEnum getFirstSix() | setFirstSix(FirstSixEnum firstSix) |
| `HasRecurring` | [`HasRecurringEnum`](../../doc/models/has-recurring-enum.md) | Optional | - | HasRecurringEnum getHasRecurring() | setHasRecurring(HasRecurringEnum hasRecurring) |
| `LastFour` | [`LastFourEnum`](../../doc/models/last-four-enum.md) | Optional | - | LastFourEnum getLastFour() | setLastFour(LastFourEnum lastFour) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `PaymentMethod` | [`PaymentMethod7Enum`](../../doc/models/payment-method-7-enum.md) | Optional | - | PaymentMethod7Enum getPaymentMethod() | setPaymentMethod(PaymentMethod7Enum paymentMethod) |
| `Ticket` | [`TicketEnum`](../../doc/models/ticket-enum.md) | Optional | - | TicketEnum getTicket() | setTicket(TicketEnum ticket) |
| `TrackData` | [`TrackDataEnum`](../../doc/models/track-data-enum.md) | Optional | - | TrackDataEnum getTrackData() | setTrackData(TrackDataEnum trackData) |

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

