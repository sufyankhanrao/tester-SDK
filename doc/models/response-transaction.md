
# Response Transaction

## Structure

`ResponseTransaction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"Transaction"` | String getType() | setType(String type) |
| `Data` | [`Data13`](../../doc/models/data-13.md) | Optional | - | Data13 getData() | setData(Data13 data) |

## Example (as JSON)

```json
{
  "type": "Transaction"
}
```

