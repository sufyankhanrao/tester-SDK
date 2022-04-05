
# Response Webhook

## Structure

`ResponseWebhook`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"Webhook"` | String getType() | setType(String type) |
| `Data` | [`Data16`](../../doc/models/data-16.md) | Optional | - | Data16 getData() | setData(Data16 data) |

## Example (as JSON)

```json
{
  "type": "Webhook"
}
```

