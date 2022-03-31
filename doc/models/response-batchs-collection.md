
# Response Batchs Collection

## Structure

`ResponseBatchsCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"BatchsCollection"` | String getType() | setType(String type) |
| `List` | [`List<List>`](../../doc/models/list.md) | Required | Resource Members | List<List> getList() | setList(List<List> list) |

## Example (as JSON)

```json
{
  "type": "BatchsCollection",
  "list": {
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "created_ts": null,
    "modified_ts": null,
    "processing_status_id": 2
  }
}
```

