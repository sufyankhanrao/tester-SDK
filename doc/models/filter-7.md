
# Filter 7

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Signature` | `String` | Optional | - | String getSignature() | setSignature(String signature) |
| `Resource` | `String` | Optional | - | String getResource() | setResource(String resource) |
| `ResourceId` | `String` | Optional | - | String getResourceId() | setResourceId(String resourceId) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |

## Example (as JSON)

```json
{
  "signature": null,
  "resource": null,
  "resource_id": null,
  "id": null,
  "created_ts": null,
  "modified_ts": null
}
```

