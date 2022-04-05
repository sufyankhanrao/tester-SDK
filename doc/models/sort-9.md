
# Sort 9

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort9`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `DefaultProductTransactionId` | [`DefaultProductTransactionIdEnum`](../../doc/models/default-product-transaction-id-enum.md) | Optional | - | DefaultProductTransactionIdEnum getDefaultProductTransactionId() | setDefaultProductTransactionId(DefaultProductTransactionIdEnum defaultProductTransactionId) |
| `TerminalApplicationId` | [`TerminalApplicationIdEnum`](../../doc/models/terminal-application-id-enum.md) | Optional | - | TerminalApplicationIdEnum getTerminalApplicationId() | setTerminalApplicationId(TerminalApplicationIdEnum terminalApplicationId) |
| `TerminalCvmId` | [`TerminalCvmIdEnum`](../../doc/models/terminal-cvm-id-enum.md) | Optional | - | TerminalCvmIdEnum getTerminalCvmId() | setTerminalCvmId(TerminalCvmIdEnum terminalCvmId) |
| `TerminalManufacturerId` | [`TerminalManufacturerId3Enum`](../../doc/models/terminal-manufacturer-id-3-enum.md) | Optional | - | TerminalManufacturerId3Enum getTerminalManufacturerId() | setTerminalManufacturerId(TerminalManufacturerId3Enum terminalManufacturerId) |
| `Title` | [`TitleEnum`](../../doc/models/title-enum.md) | Optional | - | TitleEnum getTitle() | setTitle(TitleEnum title) |
| `MacAddress` | [`MacAddressEnum`](../../doc/models/mac-address-enum.md) | Optional | - | MacAddressEnum getMacAddress() | setMacAddress(MacAddressEnum macAddress) |
| `LocalIpAddress` | [`LocalIpAddressEnum`](../../doc/models/local-ip-address-enum.md) | Optional | - | LocalIpAddressEnum getLocalIpAddress() | setLocalIpAddress(LocalIpAddressEnum localIpAddress) |
| `Port` | [`PortEnum`](../../doc/models/port-enum.md) | Optional | - | PortEnum getPort() | setPort(PortEnum port) |
| `SerialNumber` | [`SerialNumberEnum`](../../doc/models/serial-number-enum.md) | Optional | - | SerialNumberEnum getSerialNumber() | setSerialNumber(SerialNumberEnum serialNumber) |
| `TerminalNumber` | [`TerminalNumberEnum`](../../doc/models/terminal-number-enum.md) | Optional | - | TerminalNumberEnum getTerminalNumber() | setTerminalNumber(TerminalNumberEnum terminalNumber) |
| `TerminalTimeouts` | [`TerminalTimeouts3Enum`](../../doc/models/terminal-timeouts-3-enum.md) | Optional | - | TerminalTimeouts3Enum getTerminalTimeouts() | setTerminalTimeouts(TerminalTimeouts3Enum terminalTimeouts) |
| `TipPercents` | [`TipPercents3Enum`](../../doc/models/tip-percents-3-enum.md) | Optional | - | TipPercents3Enum getTipPercents() | setTipPercents(TipPercents3Enum tipPercents) |
| `LocationApiId` | [`LocationApiIdEnum`](../../doc/models/location-api-id-enum.md) | Optional | - | LocationApiIdEnum getLocationApiId() | setLocationApiId(LocationApiIdEnum locationApiId) |
| `TerminalApiId` | [`TerminalApiIdEnum`](../../doc/models/terminal-api-id-enum.md) | Optional | - | TerminalApiIdEnum getTerminalApiId() | setTerminalApiId(TerminalApiIdEnum terminalApiId) |
| `HeaderLine1` | [`HeaderLine1Enum`](../../doc/models/header-line-1-enum.md) | Optional | - | HeaderLine1Enum getHeaderLine1() | setHeaderLine1(HeaderLine1Enum headerLine1) |
| `HeaderLine2` | [`HeaderLine1Enum`](../../doc/models/header-line-1-enum.md) | Optional | - | HeaderLine1Enum getHeaderLine2() | setHeaderLine2(HeaderLine1Enum headerLine2) |
| `HeaderLine3` | [`HeaderLine1Enum`](../../doc/models/header-line-1-enum.md) | Optional | - | HeaderLine1Enum getHeaderLine3() | setHeaderLine3(HeaderLine1Enum headerLine3) |
| `HeaderLine4` | [`HeaderLine1Enum`](../../doc/models/header-line-1-enum.md) | Optional | - | HeaderLine1Enum getHeaderLine4() | setHeaderLine4(HeaderLine1Enum headerLine4) |
| `HeaderLine5` | [`HeaderLine1Enum`](../../doc/models/header-line-1-enum.md) | Optional | - | HeaderLine1Enum getHeaderLine5() | setHeaderLine5(HeaderLine1Enum headerLine5) |
| `TrailerLine1` | [`TrailerLine1Enum`](../../doc/models/trailer-line-1-enum.md) | Optional | - | TrailerLine1Enum getTrailerLine1() | setTrailerLine1(TrailerLine1Enum trailerLine1) |
| `TrailerLine2` | [`TrailerLine1Enum`](../../doc/models/trailer-line-1-enum.md) | Optional | - | TrailerLine1Enum getTrailerLine2() | setTrailerLine2(TrailerLine1Enum trailerLine2) |
| `TrailerLine3` | [`TrailerLine1Enum`](../../doc/models/trailer-line-1-enum.md) | Optional | - | TrailerLine1Enum getTrailerLine3() | setTrailerLine3(TrailerLine1Enum trailerLine3) |
| `TrailerLine4` | [`TrailerLine1Enum`](../../doc/models/trailer-line-1-enum.md) | Optional | - | TrailerLine1Enum getTrailerLine4() | setTrailerLine4(TrailerLine1Enum trailerLine4) |
| `TrailerLine5` | [`TrailerLine1Enum`](../../doc/models/trailer-line-1-enum.md) | Optional | - | TrailerLine1Enum getTrailerLine5() | setTrailerLine5(TrailerLine1Enum trailerLine5) |
| `DefaultCheckin` | [`DefaultCheckinEnum`](../../doc/models/default-checkin-enum.md) | Optional | - | DefaultCheckinEnum getDefaultCheckin() | setDefaultCheckin(DefaultCheckinEnum defaultCheckin) |
| `DefaultCheckout` | [`DefaultCheckoutEnum`](../../doc/models/default-checkout-enum.md) | Optional | - | DefaultCheckoutEnum getDefaultCheckout() | setDefaultCheckout(DefaultCheckoutEnum defaultCheckout) |
| `DefaultRoomRate` | [`DefaultRoomRateEnum`](../../doc/models/default-room-rate-enum.md) | Optional | - | DefaultRoomRateEnum getDefaultRoomRate() | setDefaultRoomRate(DefaultRoomRateEnum defaultRoomRate) |
| `DefaultRoomNumber` | [`DefaultRoomNumberEnum`](../../doc/models/default-room-number-enum.md) | Optional | - | DefaultRoomNumberEnum getDefaultRoomNumber() | setDefaultRoomNumber(DefaultRoomNumberEnum defaultRoomNumber) |
| `Debit` | [`DebitEnum`](../../doc/models/debit-enum.md) | Optional | - | DebitEnum getDebit() | setDebit(DebitEnum debit) |
| `Emv` | [`EmvEnum`](../../doc/models/emv-enum.md) | Optional | - | EmvEnum getEmv() | setEmv(EmvEnum emv) |
| `CashbackEnable` | [`CashbackEnableEnum`](../../doc/models/cashback-enable-enum.md) | Optional | - | CashbackEnableEnum getCashbackEnable() | setCashbackEnable(CashbackEnableEnum cashbackEnable) |
| `PrintEnable` | [`PrintEnableEnum`](../../doc/models/print-enable-enum.md) | Optional | - | PrintEnableEnum getPrintEnable() | setPrintEnable(PrintEnableEnum printEnable) |
| `SigCaptureEnable` | [`SigCaptureEnableEnum`](../../doc/models/sig-capture-enable-enum.md) | Optional | - | SigCaptureEnableEnum getSigCaptureEnable() | setSigCaptureEnable(SigCaptureEnableEnum sigCaptureEnable) |
| `IsProvisioned` | [`IsProvisionedEnum`](../../doc/models/is-provisioned-enum.md) | Optional | - | IsProvisionedEnum getIsProvisioned() | setIsProvisioned(IsProvisionedEnum isProvisioned) |
| `TipEnable` | [`TipEnableEnum`](../../doc/models/tip-enable-enum.md) | Optional | - | TipEnableEnum getTipEnable() | setTipEnable(TipEnableEnum tipEnable) |
| `ValidatedDecryption` | [`ValidatedDecryptionEnum`](../../doc/models/validated-decryption-enum.md) | Optional | - | ValidatedDecryptionEnum getValidatedDecryption() | setValidatedDecryption(ValidatedDecryptionEnum validatedDecryption) |
| `CommunicationType` | [`CommunicationType3Enum`](../../doc/models/communication-type-3-enum.md) | Optional | - | CommunicationType3Enum getCommunicationType() | setCommunicationType(CommunicationType3Enum communicationType) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `LastRegistrationTs` | [`LastRegistrationTsEnum`](../../doc/models/last-registration-ts-enum.md) | Optional | - | LastRegistrationTsEnum getLastRegistrationTs() | setLastRegistrationTs(LastRegistrationTsEnum lastRegistrationTs) |
| `CreatedUserId` | [`CreatedUserIdEnum`](../../doc/models/created-user-id-enum.md) | Optional | - | CreatedUserIdEnum getCreatedUserId() | setCreatedUserId(CreatedUserIdEnum createdUserId) |
| `ModifiedUserId` | [`ModifiedUserIdEnum`](../../doc/models/modified-user-id-enum.md) | Optional | - | ModifiedUserIdEnum getModifiedUserId() | setModifiedUserId(ModifiedUserIdEnum modifiedUserId) |
| `TrsDomain` | [`TrsDomainEnum`](../../doc/models/trs-domain-enum.md) | Optional | - | TrsDomainEnum getTrsDomain() | setTrsDomain(TrsDomainEnum trsDomain) |

## Example (as JSON)

```json
{
  "location_id": null,
  "default_product_transaction_id": null,
  "terminal_application_id": null,
  "terminal_cvm_id": null,
  "terminal_manufacturer_id": null,
  "title": null,
  "mac_address": null,
  "local_ip_address": null,
  "port": null,
  "serial_number": null,
  "terminal_number": null,
  "terminal_timeouts": null,
  "tip_percents": null,
  "location_api_id": null,
  "terminal_api_id": null,
  "header_line_1": null,
  "header_line_2": null,
  "header_line_3": null,
  "header_line_4": null,
  "header_line_5": null,
  "trailer_line_1": null,
  "trailer_line_2": null,
  "trailer_line_3": null,
  "trailer_line_4": null,
  "trailer_line_5": null,
  "default_checkin": null,
  "default_checkout": null,
  "default_room_rate": null,
  "default_room_number": null,
  "debit": null,
  "emv": null,
  "cashback_enable": null,
  "print_enable": null,
  "sig_capture_enable": null,
  "is_provisioned": null,
  "tip_enable": null,
  "validated_decryption": null,
  "communication_type": null,
  "id": null,
  "created_ts": null,
  "modified_ts": null,
  "last_registration_ts": null,
  "created_user_id": null,
  "modified_user_id": null,
  "trs_domain": null
}
```

