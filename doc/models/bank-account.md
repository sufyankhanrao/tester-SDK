
# Bank Account

The Bank Account.

## Structure

`BankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RoutingNumber` | `String` | Optional | Nine-digit Bank routing number.<br>**Constraints**: *Maximum Length*: `9` | String getRoutingNumber() | setRoutingNumber(String routingNumber) |
| `AccountNumber` | `String` | Optional | Bank account number..<br>**Constraints**: *Maximum Length*: `17` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountHolderName` | `String` | Optional | Name on bank account.<br>**Constraints**: *Maximum Length*: `40` | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |

## Example (as JSON)

```json
{
  "routing_number": null,
  "account_number": null,
  "account_holder_name": null
}
```

