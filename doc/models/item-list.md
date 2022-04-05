
# Item List

## Structure

`ItemList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Item's Name, must be unique on the list<br>**Constraints**: *Maximum Length*: `100` | String getName() | setName(String name) |
| `Amount` | `double` | Required | Item's Amount<br>**Constraints**: `>= 0`, `<= 9999999.99` | double getAmount() | setAmount(double amount) |

## Example (as JSON)

```json
{
  "name": "Bread",
  "amount": 20.15
}
```

