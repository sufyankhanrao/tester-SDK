
# Sort 8

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort8`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `Title` | [`TitleEnum`](../../doc/models/title-enum.md) | Optional | - | TitleEnum getTitle() | setTitle(TitleEnum title) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |

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

