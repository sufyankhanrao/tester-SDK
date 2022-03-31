
# Response Contact

## Structure

`ResponseContact`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"Contact"` | String getType() | setType(String type) |
| `Data` | [`Data2`](../../doc/models/data-2.md) | Optional | - | Data2 getData() | setData(Data2 data) |

## Example (as JSON)

```json
{
  "type": "Contact"
}
```

