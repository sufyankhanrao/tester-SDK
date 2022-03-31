
# Response Quick Invoice

## Structure

`ResponseQuickInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"QuickInvoice"` | String getType() | setType(String type) |
| `Data` | [`Data7`](../../doc/models/data-7.md) | Optional | - | Data7 getData() | setData(Data7 data) |

## Example (as JSON)

```json
{
  "type": "QuickInvoice"
}
```

