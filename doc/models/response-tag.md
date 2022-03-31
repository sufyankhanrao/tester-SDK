
# Response Tag

## Structure

`ResponseTag`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"Tag"` | String getType() | setType(String type) |
| `Data` | [`Data10`](../../doc/models/data-10.md) | Optional | - | Data10 getData() | setData(Data10 data) |

## Example (as JSON)

```json
{
  "type": "Tag"
}
```

