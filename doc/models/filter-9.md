
# Filter 9

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter9`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `DefaultProductTransactionId` | `String` | Optional | - | String getDefaultProductTransactionId() | setDefaultProductTransactionId(String defaultProductTransactionId) |
| `TerminalApplicationId` | `String` | Optional | - | String getTerminalApplicationId() | setTerminalApplicationId(String terminalApplicationId) |
| `TerminalCvmId` | `String` | Optional | - | String getTerminalCvmId() | setTerminalCvmId(String terminalCvmId) |
| `TerminalManufacturerId` | `String` | Optional | - | String getTerminalManufacturerId() | setTerminalManufacturerId(String terminalManufacturerId) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `MacAddress` | `String` | Optional | - | String getMacAddress() | setMacAddress(String macAddress) |
| `LocalIpAddress` | `String` | Optional | - | String getLocalIpAddress() | setLocalIpAddress(String localIpAddress) |
| `Port` | `String` | Optional | - | String getPort() | setPort(String port) |
| `SerialNumber` | `String` | Optional | - | String getSerialNumber() | setSerialNumber(String serialNumber) |
| `TerminalNumber` | `String` | Optional | - | String getTerminalNumber() | setTerminalNumber(String terminalNumber) |
| `TerminalTimeouts` | `String` | Optional | - | String getTerminalTimeouts() | setTerminalTimeouts(String terminalTimeouts) |
| `TipPercents` | `String` | Optional | - | String getTipPercents() | setTipPercents(String tipPercents) |
| `LocationApiId` | `String` | Optional | - | String getLocationApiId() | setLocationApiId(String locationApiId) |
| `TerminalApiId` | `String` | Optional | - | String getTerminalApiId() | setTerminalApiId(String terminalApiId) |
| `HeaderLine1` | `String` | Optional | - | String getHeaderLine1() | setHeaderLine1(String headerLine1) |
| `HeaderLine2` | `String` | Optional | - | String getHeaderLine2() | setHeaderLine2(String headerLine2) |
| `HeaderLine3` | `String` | Optional | - | String getHeaderLine3() | setHeaderLine3(String headerLine3) |
| `HeaderLine4` | `String` | Optional | - | String getHeaderLine4() | setHeaderLine4(String headerLine4) |
| `HeaderLine5` | `String` | Optional | - | String getHeaderLine5() | setHeaderLine5(String headerLine5) |
| `TrailerLine1` | `String` | Optional | - | String getTrailerLine1() | setTrailerLine1(String trailerLine1) |
| `TrailerLine2` | `String` | Optional | - | String getTrailerLine2() | setTrailerLine2(String trailerLine2) |
| `TrailerLine3` | `String` | Optional | - | String getTrailerLine3() | setTrailerLine3(String trailerLine3) |
| `TrailerLine4` | `String` | Optional | - | String getTrailerLine4() | setTrailerLine4(String trailerLine4) |
| `TrailerLine5` | `String` | Optional | - | String getTrailerLine5() | setTrailerLine5(String trailerLine5) |
| `DefaultCheckin` | `String` | Optional | - | String getDefaultCheckin() | setDefaultCheckin(String defaultCheckin) |
| `DefaultCheckout` | `String` | Optional | - | String getDefaultCheckout() | setDefaultCheckout(String defaultCheckout) |
| `DefaultRoomRate` | `String` | Optional | - | String getDefaultRoomRate() | setDefaultRoomRate(String defaultRoomRate) |
| `DefaultRoomNumber` | `String` | Optional | - | String getDefaultRoomNumber() | setDefaultRoomNumber(String defaultRoomNumber) |
| `Debit` | `String` | Optional | - | String getDebit() | setDebit(String debit) |
| `Emv` | `String` | Optional | - | String getEmv() | setEmv(String emv) |
| `CashbackEnable` | `String` | Optional | - | String getCashbackEnable() | setCashbackEnable(String cashbackEnable) |
| `PrintEnable` | `String` | Optional | - | String getPrintEnable() | setPrintEnable(String printEnable) |
| `SigCaptureEnable` | `String` | Optional | - | String getSigCaptureEnable() | setSigCaptureEnable(String sigCaptureEnable) |
| `IsProvisioned` | `String` | Optional | - | String getIsProvisioned() | setIsProvisioned(String isProvisioned) |
| `TipEnable` | `String` | Optional | - | String getTipEnable() | setTipEnable(String tipEnable) |
| `ValidatedDecryption` | `String` | Optional | - | String getValidatedDecryption() | setValidatedDecryption(String validatedDecryption) |
| `CommunicationType` | `String` | Optional | - | String getCommunicationType() | setCommunicationType(String communicationType) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `LastRegistrationTs` | `String` | Optional | - | String getLastRegistrationTs() | setLastRegistrationTs(String lastRegistrationTs) |
| `CreatedUserId` | `String` | Optional | - | String getCreatedUserId() | setCreatedUserId(String createdUserId) |
| `ModifiedUserId` | `String` | Optional | - | String getModifiedUserId() | setModifiedUserId(String modifiedUserId) |
| `TrsDomain` | `String` | Optional | - | String getTrsDomain() | setTrsDomain(String trsDomain) |

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

