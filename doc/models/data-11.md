
# Data 11

## Structure

`Data11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Required | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `DefaultProductTransactionId` | `String` | Optional | Product Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getDefaultProductTransactionId() | setDefaultProductTransactionId(String defaultProductTransactionId) |
| `TerminalApplicationId` | `String` | Required | Terminal Application ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getTerminalApplicationId() | setTerminalApplicationId(String terminalApplicationId) |
| `TerminalCvmId` | `String` | Optional | Terminal CVM ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getTerminalCvmId() | setTerminalCvmId(String terminalCvmId) |
| `TerminalManufacturerId` | [`TerminalManufacturerIdEnum`](../../doc/models/terminal-manufacturer-id-enum.md) | Required | Terminal Manufacturer ID | TerminalManufacturerIdEnum getTerminalManufacturerId() | setTerminalManufacturerId(TerminalManufacturerIdEnum terminalManufacturerId) |
| `Title` | `String` | Required | Terminal Name<br>**Constraints**: *Maximum Length*: `64` | String getTitle() | setTitle(String title) |
| `MacAddress` | `String` | Optional | Terminal MAC Address<br>**Constraints**: *Maximum Length*: `12` | String getMacAddress() | setMacAddress(String macAddress) |
| `LocalIpAddress` | `String` | Required | Terminal Local IP Address | String getLocalIpAddress() | setLocalIpAddress(String localIpAddress) |
| `Port` | `int` | Required | Terminal Port<br>**Default**: `10009`<br>**Constraints**: `>= 0`, `<= 65535` | int getPort() | setPort(int port) |
| `SerialNumber` | `String` | Required | Terminal Serial Number<br>**Constraints**: *Maximum Length*: `24`, *Pattern*: `^[a-zA-Z0-9]*$` | String getSerialNumber() | setSerialNumber(String serialNumber) |
| `TerminalNumber` | `String` | Required | Terminal Number<br>**Constraints**: *Minimum Length*: `15`, *Maximum Length*: `15`, *Pattern*: `^[a-zA-Z0-9]*$` | String getTerminalNumber() | setTerminalNumber(String terminalNumber) |
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
| `Debit` | `boolean` | Required | Debit | boolean getDebit() | setDebit(boolean debit) |
| `Emv` | `boolean` | Required | EMV | boolean getEmv() | setEmv(boolean emv) |
| `CashbackEnable` | `boolean` | Required | Cashback Enable | boolean getCashbackEnable() | setCashbackEnable(boolean cashbackEnable) |
| `PrintEnable` | `boolean` | Required | Print Enable | boolean getPrintEnable() | setPrintEnable(boolean printEnable) |
| `SigCaptureEnable` | `boolean` | Required | Sig Capture Enable | boolean getSigCaptureEnable() | setSigCaptureEnable(boolean sigCaptureEnable) |
| `IsProvisioned` | `Boolean` | Optional | Is Provisioned | Boolean getIsProvisioned() | setIsProvisioned(Boolean isProvisioned) |
| `TipEnable` | `Boolean` | Optional | Tip Enable | Boolean getTipEnable() | setTipEnable(Boolean tipEnable) |
| `ValidatedDecryption` | `Boolean` | Optional | Validated Decryption | Boolean getValidatedDecryption() | setValidatedDecryption(Boolean validatedDecryption) |
| `CommunicationType` | [`CommunicationTypeEnum`](../../doc/models/communication-type-enum.md) | Optional | Communication Type | CommunicationTypeEnum getCommunicationType() | setCommunicationType(CommunicationTypeEnum communicationType) |
| `Id` | `String` | Required | Terminal ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `LastRegistrationTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getLastRegistrationTs() | setLastRegistrationTs(LocalDateTime lastRegistrationTs) |
| `CreatedUserId` | `String` | Required | User ID Created the register<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getCreatedUserId() | setCreatedUserId(String createdUserId) |
| `ModifiedUserId` | `String` | Required | Last User ID that updated the register<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getModifiedUserId() | setModifiedUserId(String modifiedUserId) |
| `TrsDomain` | `String` | Optional | TRS domain | String getTrsDomain() | setTrsDomain(String trsDomain) |

## Example (as JSON)

```json
{
  "location_id": "11e95f8ec39de8fbdb0a4f1a",
  "terminal_application_id": "11e95f8ec39de8fbdb0a4f1a",
  "terminal_manufacturer_id": 1,
  "title": "My terminal",
  "local_ip_address": "192.168.0.10",
  "port": 10009,
  "serial_number": "1234567890",
  "terminal_number": null,
  "debit": false,
  "emv": false,
  "cashback_enable": false,
  "print_enable": false,
  "sig_capture_enable": false,
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "created_ts": null,
  "modified_ts": null,
  "last_registration_ts": null,
  "created_user_id": "11e95f8ec39de8fbdb0a4f1a",
  "modified_user_id": "11e95f8ec39de8fbdb0a4f1a"
}
```

