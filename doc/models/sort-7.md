
# Sort 7

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Signature` | [`SignatureEnum`](../../doc/models/signature-enum.md) | Optional | - | SignatureEnum getSignature() | setSignature(SignatureEnum signature) |
| `Resource` | [`Resource4Enum`](../../doc/models/resource-4-enum.md) | Optional | - | Resource4Enum getResource() | setResource(Resource4Enum resource) |
| `ResourceId` | [`ResourceIdEnum`](../../doc/models/resource-id-enum.md) | Optional | - | ResourceIdEnum getResourceId() | setResourceId(ResourceIdEnum resourceId) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |

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

