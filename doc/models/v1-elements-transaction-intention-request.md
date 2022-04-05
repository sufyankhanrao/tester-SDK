
# V1 Elements Transaction Intention Request

## Structure

`V1ElementsTransactionIntentionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | [`ActionEnum`](../../doc/models/action-enum.md) | Optional | The action to be performed<br>**Default**: `ActionEnum.SALE` | ActionEnum getAction() | setAction(ActionEnum action) |
| `Methods` | [`List<Method>`](../../doc/models/method.md) | Optional | Byt default the system will try to offer all the availables payment methods from your account. But if you like, you can specify exactly what services you want to use.<br>**Constraints**: *Minimum Items*: `1`, *Unique Items Required* | List<Method> getMethods() | setMethods(List<Method> methods) |
| `Amount` | `int` | Required | The total amount to be charged<br>**Constraints**: `>= 1`, `<= 999999999` | int getAmount() | setAmount(int amount) |
| `TaxAmount` | `Integer` | Optional | Amount of Sales Tax. If supplied, this amount should be already included in the transaction amount.<br>**Constraints**: `>= 1`, `<= 999999999` | Integer getTaxAmount() | setTaxAmount(Integer taxAmount) |
| `Currency` | `String` | Required, Constant | The currency for the transaction<br>**Default**: `"usd"` | String getCurrency() | setCurrency(String currency) |
| `LocationId` | `String` | Optional | Location ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |

## Example (as JSON)

```json
{
  "amount": 1099,
  "currency": "usd"
}
```

