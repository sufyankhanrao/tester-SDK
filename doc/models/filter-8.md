
# Filter 8

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter8`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |

## Example (as JSON)

```json
{
  "location_id": null,
  "title": null,
  "id": null,
  "created_ts": null,
  "modified_ts": null
}
```

