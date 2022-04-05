
# Response Batch

## Structure

`ResponseBatch`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"Batch"` | String getType() | setType(String type) |
| `Data` | [`Data1`](../../doc/models/data-1.md) | Optional | - | Data1 getData() | setData(Data1 data) |

## Example (as JSON)

```json
{
  "type": "Batch"
}
```

