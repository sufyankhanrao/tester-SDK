
# Primary Principal

The Primary Principal.

## Structure

`PrimaryPrincipal`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Required | Signer's first name<br>**Constraints**: *Maximum Length*: `20` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Required | Signer's last name<br>**Constraints**: *Maximum Length*: `20` | String getLastName() | setLastName(String lastName) |
| `MiddleName` | `String` | Optional | Signer's middle name<br>**Constraints**: *Maximum Length*: `20` | String getMiddleName() | setMiddleName(String middleName) |
| `Title` | `String` | Optional | Signer's title<br>**Constraints**: *Maximum Length*: `20` | String getTitle() | setTitle(String title) |
| `DateOfBirth` | `String` | Optional | Signer's date of birth<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[\d]{4}-[\d]{2}-[\d]{2}$` | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `AddressLine1` | `String` | Optional | Signer's residential address line 1<br>**Constraints**: *Maximum Length*: `100` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | Signer's residential address line 2<br>**Constraints**: *Maximum Length*: `20` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `City` | `String` | Optional | Signer's city<br>**Constraints**: *Maximum Length*: `50` | String getCity() | setCity(String city) |
| `StateProvince` | `String` | Optional | Signer's two-digit state code<br>**Constraints**: *Maximum Length*: `2` | String getStateProvince() | setStateProvince(String stateProvince) |
| `PostalCode` | `String` | Optional | Signer's postal code<br>**Constraints**: *Maximum Length*: `10` | String getPostalCode() | setPostalCode(String postalCode) |
| `Ssn` | `String` | Optional | Last four digits of the primary principal or Signer's social security number<br>**Constraints**: *Maximum Length*: `4` | String getSsn() | setSsn(String ssn) |
| `OwnershipPercent` | `Double` | Optional | Percentage of business owned by primary principal or signer<br>**Constraints**: `<= 3` | Double getOwnershipPercent() | setOwnershipPercent(Double ownershipPercent) |
| `PhoneNumber` | `String` | Optional | Signer's phone number<br>**Constraints**: *Maximum Length*: `20` | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |

## Example (as JSON)

```json
{
  "first_name": "Bob",
  "last_name": "Fairview"
}
```

