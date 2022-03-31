
# Response Recurring

## Structure

`ResponseRecurring`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"Recurring"` | String getType() | setType(String type) |
| `Data` | [`Data8`](../../doc/models/data-8.md) | Optional | - | Data8 getData() | setData(Data8 data) |

## Example (as JSON)

```json
{
  "type": "Recurring"
}
```

