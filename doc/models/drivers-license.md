
# Drivers License

Used for certain ACH transactions where Driver's License is required by the terminal being used.

## Structure

`DriversLicense`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `String` | Required | Driver License State Issuer<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2` | String getState() | setState(String state) |
| `Number` | `String` | Required | Driver License Number<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50` | String getNumber() | setNumber(String number) |

## Example (as JSON)

```json
{
  "state": "state4",
  "number": "number2"
}
```

