
# Additional Amount

## Structure

`AdditionalAmount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type1Enum`](../../doc/models/type-1-enum.md) | Optional | type of the amount [4S-Healthcare(Visa and MC Only), 4U-Prescription/Rx(Visa and MC Only), 4V-Vision/Optical(Visa Only), 4W-clinic/other qualified medical(Visa Only) ,4X-Dental(Visa Only)]. | Type1Enum getType() | setType(Type1Enum type) |
| `Amount` | `String` | Optional | The amount of additional amount.<br>**Constraints**: *Maximum Length*: `12` | String getAmount() | setAmount(String amount) |
| `AccountType` | [`AccountTypeEnum`](../../doc/models/account-type-enum.md) | Optional | Account Type | AccountTypeEnum getAccountType() | setAccountType(AccountTypeEnum accountType) |
| `Currency` | `Double` | Optional | Currency Code | Double getCurrency() | setCurrency(Double currency) |

## Example (as JSON)

```json
{
  "type": null,
  "amount": null,
  "account_type": null,
  "currency": null
}
```

