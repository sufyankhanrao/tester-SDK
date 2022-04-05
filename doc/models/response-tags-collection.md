
# Response Tags Collection

## Structure

`ResponseTagsCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"TagsCollection"` | String getType() | setType(String type) |
| `List` | [`List<List7>`](../../doc/models/list-7.md) | Required | Resource Members | List<List7> getList() | setList(List<List7> list) |

## Example (as JSON)

```json
{
  "type": "TagsCollection",
  "list": {
    "location_id": "11e95f8ec39de8fbdb0a4f1a",
    "title": "My terminal",
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "created_ts": null,
    "modified_ts": null
  }
}
```

