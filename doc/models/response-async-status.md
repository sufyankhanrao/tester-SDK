
# Response Async Status

## Structure

`ResponseAsyncStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"AsyncStatus"` | String getType() | setType(String type) |
| `Data` | [`Data`](../../doc/models/data.md) | Optional | - | Data getData() | setData(Data data) |

## Example (as JSON)

```json
{
  "type": "AsyncStatus"
}
```

