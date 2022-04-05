
# V1 Terminals Request 1

## Structure

`V1TerminalsRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Optional | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `DefaultProductTransactionId` | `String` | Optional | Product Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getDefaultProductTransactionId() | setDefaultProductTransactionId(String defaultProductTransactionId) |
| `TerminalApplicationId` | `String` | Optional | Terminal Application ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getTerminalApplicationId() | setTerminalApplicationId(String terminalApplicationId) |
| `TerminalCvmId` | `String` | Optional | Terminal CVM ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getTerminalCvmId() | setTerminalCvmId(String terminalCvmId) |
| `TerminalManufacturerId` | [`TerminalManufacturerIdEnum`](../../doc/models/terminal-manufacturer-id-enum.md) | Optional | Terminal Manufacturer ID | TerminalManufacturerIdEnum getTerminalManufacturerId() | setTerminalManufacturerId(TerminalManufacturerIdEnum terminalManufacturerId) |
| `Title` | `String` | Optional | Terminal Name<br>**Constraints**: *Maximum Length*: `64` | String getTitle() | setTitle(String title) |
| `MacAddress` | `String` | Optional | Terminal MAC Address<br>**Constraints**: *Maximum Length*: `12` | String getMacAddress() | setMacAddress(String macAddress) |
| `LocalIpAddress` | `String` | Optional | Terminal Local IP Address | String getLocalIpAddress() | setLocalIpAddress(String localIpAddress) |
| `Port` | `Integer` | Optional | Terminal Port<br>**Default**: `10009`<br>**Constraints**: `>= 0`, `<= 65535` | Integer getPort() | setPort(Integer port) |
| `SerialNumber` | `String` | Optional | Terminal Serial Number<br>**Constraints**: *Maximum Length*: `24`, *Pattern*: `^[a-zA-Z0-9]*$` | String getSerialNumber() | setSerialNumber(String serialNumber) |
| `TerminalNumber` | `String` | Optional | Terminal Number<br>**Constraints**: *Minimum Length*: `15`, *Maximum Length*: `15`, *Pattern*: `^[a-zA-Z0-9]*$` | String getTerminalNumber() | setTerminalNumber(String terminalNumber) |
| `TerminalTimeouts` | [`TerminalTimeouts`](../../doc/models/terminal-timeouts.md) | Optional | The following options outlines some configurable timeout values that can be used to customize the experience at the terminal for the cardholder. | TerminalTimeouts getTerminalTimeouts() | setTerminalTimeouts(TerminalTimeouts terminalTimeouts) |
| `TipPercents` | [`TipPercents`](../../doc/models/tip-percents.md) | Optional | A JSON of tip percents the JSON MUST contain only these three fields: percent_1, percent_2, percent_3 | TipPercents getTipPercents() | setTipPercents(TipPercents tipPercents) |
| `LocationApiId` | `String` | Optional | Location Api ID<br>**Constraints**: *Maximum Length*: `64` | String getLocationApiId() | setLocationApiId(String locationApiId) |
| `TerminalApiId` | `String` | Optional | Terminal Api ID<br>**Constraints**: *Maximum Length*: `64` | String getTerminalApiId() | setTerminalApiId(String terminalApiId) |
| `HeaderLine1` | `String` | Optional | Header Line 1<br>**Constraints**: *Maximum Length*: `32` | String getHeaderLine1() | setHeaderLine1(String headerLine1) |
| `HeaderLine2` | `String` | Optional | Header Line 2<br>**Constraints**: *Maximum Length*: `32` | String getHeaderLine2() | setHeaderLine2(String headerLine2) |
| `HeaderLine3` | `String` | Optional | Header Line 3<br>**Constraints**: *Maximum Length*: `32` | String getHeaderLine3() | setHeaderLine3(String headerLine3) |
| `HeaderLine4` | `String` | Optional | Header Line 4<br>**Constraints**: *Maximum Length*: `32` | String getHeaderLine4() | setHeaderLine4(String headerLine4) |
| `HeaderLine5` | `String` | Optional | Header Line 5<br>**Constraints**: *Maximum Length*: `32` | String getHeaderLine5() | setHeaderLine5(String headerLine5) |
| `TrailerLine1` | `String` | Optional | Trailer Line 1<br>**Constraints**: *Maximum Length*: `32` | String getTrailerLine1() | setTrailerLine1(String trailerLine1) |
| `TrailerLine2` | `String` | Optional | Trailer Line 2<br>**Constraints**: *Maximum Length*: `32` | String getTrailerLine2() | setTrailerLine2(String trailerLine2) |
| `TrailerLine3` | `String` | Optional | Trailer Line 3<br>**Constraints**: *Maximum Length*: `32` | String getTrailerLine3() | setTrailerLine3(String trailerLine3) |
| `TrailerLine4` | `String` | Optional | Trailer Line 4<br>**Constraints**: *Maximum Length*: `32` | String getTrailerLine4() | setTrailerLine4(String trailerLine4) |
| `TrailerLine5` | `String` | Optional | Trailer Line 5<br>**Constraints**: *Maximum Length*: `32` | String getTrailerLine5() | setTrailerLine5(String trailerLine5) |
| `DefaultCheckin` | `String` | Optional | Default Checkin<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getDefaultCheckin() | setDefaultCheckin(String defaultCheckin) |
| `DefaultCheckout` | `String` | Optional | Default Checkout<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getDefaultCheckout() | setDefaultCheckout(String defaultCheckout) |
| `DefaultRoomRate` | `Double` | Optional | Default Room Rate<br>**Constraints**: `>= 0`, `<= 100` | Double getDefaultRoomRate() | setDefaultRoomRate(Double defaultRoomRate) |
| `DefaultRoomNumber` | `String` | Optional | Default Room Number<br>**Constraints**: *Maximum Length*: `12` | String getDefaultRoomNumber() | setDefaultRoomNumber(String defaultRoomNumber) |
| `Debit` | `Boolean` | Optional | Debit | Boolean getDebit() | setDebit(Boolean debit) |
| `Emv` | `Boolean` | Optional | EMV | Boolean getEmv() | setEmv(Boolean emv) |
| `CashbackEnable` | `Boolean` | Optional | Cashback Enable | Boolean getCashbackEnable() | setCashbackEnable(Boolean cashbackEnable) |
| `PrintEnable` | `Boolean` | Optional | Print Enable | Boolean getPrintEnable() | setPrintEnable(Boolean printEnable) |
| `SigCaptureEnable` | `Boolean` | Optional | Sig Capture Enable | Boolean getSigCaptureEnable() | setSigCaptureEnable(Boolean sigCaptureEnable) |
| `IsProvisioned` | `Boolean` | Optional | Is Provisioned | Boolean getIsProvisioned() | setIsProvisioned(Boolean isProvisioned) |
| `TipEnable` | `Boolean` | Optional | Tip Enable | Boolean getTipEnable() | setTipEnable(Boolean tipEnable) |
| `ValidatedDecryption` | `Boolean` | Optional | Validated Decryption | Boolean getValidatedDecryption() | setValidatedDecryption(Boolean validatedDecryption) |
| `CommunicationType` | [`CommunicationTypeEnum`](../../doc/models/communication-type-enum.md) | Optional | Communication Type | CommunicationTypeEnum getCommunicationType() | setCommunicationType(CommunicationTypeEnum communicationType) |

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
  "communication_type": null
}
```

