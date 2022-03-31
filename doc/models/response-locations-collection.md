
# Response Locations Collection

## Structure

`ResponseLocationsCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"LocationsCollection"` | String getType() | setType(String type) |
| `List` | [`List<List3>`](../../doc/models/list-3.md) | Required | Resource Members | List<List3> getList() | setList(List<List3> list) |

## Example (as JSON)

```json
{
  "type": "LocationsCollection",
  "list": {
    "created_ts": null,
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "modified_ts": null,
    "name": "Sample Company Headquarters",
    "parent_id": "11e95f8ec39de8fbdb0a4f1a",
    "branding_domain": null,
    "product_transactions": null,
    "product_file": null,
    "product_accountvault": null,
    "product_recurring": null,
    "tags": null,
    "terminals": null
  }
}
```

