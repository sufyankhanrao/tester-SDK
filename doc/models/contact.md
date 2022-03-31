
# Contact

The Contact.

## Structure

`Contact`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirstName` | `String` | Optional | Contact's first name.<br>**Constraints**: *Maximum Length*: `20` | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | Contact's last name.<br>**Constraints**: *Maximum Length*: `20` | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Optional | Contact's email address.<br>**Constraints**: *Maximum Length*: `20` | String getEmail() | setEmail(String email) |
| `PhoneNumber` | `String` | Required | Contact's phone.<br>**Constraints**: *Maximum Length*: `20` | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |

## Example (as JSON)

```json
{
  "phone_number": "555-555-3456"
}
```

