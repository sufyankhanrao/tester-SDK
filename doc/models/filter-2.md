
# Filter 2

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | `String` | Optional | - | String getLocationId() | setLocationId(String locationId) |
| `TerminalId` | `String` | Optional | - | String getTerminalId() | setTerminalId(String terminalId) |
| `RequireSignature` | `String` | Optional | - | String getRequireSignature() | setRequireSignature(String requireSignature) |
| `DeviceTermApiId` | `String` | Optional | - | String getDeviceTermApiId() | setDeviceTermApiId(String deviceTermApiId) |
| `TermsConditions` | `String` | Optional | - | String getTermsConditions() | setTermsConditions(String termsConditions) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `CreatedUserId` | `String` | Optional | - | String getCreatedUserId() | setCreatedUserId(String createdUserId) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `ReasonCodeId` | `String` | Optional | - | String getReasonCodeId() | setReasonCodeId(String reasonCodeId) |
| `Signature` | `String` | Optional | - | String getSignature() | setSignature(String signature) |

## Example (as JSON)

```json
{
  "location_id": null,
  "terminal_id": null,
  "require_signature": null,
  "device_term_api_id": null,
  "terms_conditions": null,
  "created_ts": null,
  "created_user_id": null,
  "id": null,
  "modified_ts": null,
  "reason_code_id": null,
  "signature": null
}
```

