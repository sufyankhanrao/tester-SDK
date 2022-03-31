
# Location

The Location.

## Structure

`Location`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Optional | Merchant's business address line 1.<br>**Constraints**: *Maximum Length*: `100` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | Merchant's business address line 2.<br>**Constraints**: *Maximum Length*: `20` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `City` | `String` | Optional | Merchant's business city.<br>**Constraints**: *Maximum Length*: `50` | String getCity() | setCity(String city) |
| `StateProvince` | `String` | Optional | Merchant's business two-digit state or province code.<br>**Constraints**: *Maximum Length*: `2` | String getStateProvince() | setStateProvince(String stateProvince) |
| `PostalCode` | `String` | Optional | Merchant's business postal code.<br>**Constraints**: *Maximum Length*: `10` | String getPostalCode() | setPostalCode(String postalCode) |
| `PhoneNumber` | `String` | Required | Merchant's business phone number.<br>**Constraints**: *Maximum Length*: `20` | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |

## Example (as JSON)

```json
{
  "phone_number": "555-555-1212"
}
```

