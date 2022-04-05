
# Response Signature

## Structure

`ResponseSignature`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"Signature"` | String getType() | setType(String type) |
| `Data` | [`Data9`](../../doc/models/data-9.md) | Optional | - | Data9 getData() | setData(Data9 data) |

## Example (as JSON)

```json
{
  "type": "Signature"
}
```

