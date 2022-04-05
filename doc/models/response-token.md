
# Response Token

## Structure

`ResponseToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"Token"` | String getType() | setType(String type) |
| `Data` | [`Data12`](../../doc/models/data-12.md) | Optional | - | Data12 getData() | setData(Data12 data) |

## Example (as JSON)

```json
{
  "type": "Token"
}
```

