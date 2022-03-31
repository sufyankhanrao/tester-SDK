
# Response User

## Structure

`ResponseUser`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"User"` | String getType() | setType(String type) |
| `Data` | [`Data15`](../../doc/models/data-15.md) | Optional | - | Data15 getData() | setData(Data15 data) |

## Example (as JSON)

```json
{
  "type": "User"
}
```

