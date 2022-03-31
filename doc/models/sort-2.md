
# Sort 2

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LocationId` | [`LocationIdEnum`](../../doc/models/location-id-enum.md) | Optional | - | LocationIdEnum getLocationId() | setLocationId(LocationIdEnum locationId) |
| `TerminalId` | [`TerminalIdEnum`](../../doc/models/terminal-id-enum.md) | Optional | - | TerminalIdEnum getTerminalId() | setTerminalId(TerminalIdEnum terminalId) |
| `RequireSignature` | [`RequireSignatureEnum`](../../doc/models/require-signature-enum.md) | Optional | - | RequireSignatureEnum getRequireSignature() | setRequireSignature(RequireSignatureEnum requireSignature) |
| `DeviceTermApiId` | [`DeviceTermApiIdEnum`](../../doc/models/device-term-api-id-enum.md) | Optional | - | DeviceTermApiIdEnum getDeviceTermApiId() | setDeviceTermApiId(DeviceTermApiIdEnum deviceTermApiId) |
| `TermsConditions` | [`TermsConditionsEnum`](../../doc/models/terms-conditions-enum.md) | Optional | - | TermsConditionsEnum getTermsConditions() | setTermsConditions(TermsConditionsEnum termsConditions) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `CreatedUserId` | [`CreatedUserIdEnum`](../../doc/models/created-user-id-enum.md) | Optional | - | CreatedUserIdEnum getCreatedUserId() | setCreatedUserId(CreatedUserIdEnum createdUserId) |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `ReasonCodeId` | [`ReasonCodeIdEnum`](../../doc/models/reason-code-id-enum.md) | Optional | - | ReasonCodeIdEnum getReasonCodeId() | setReasonCodeId(ReasonCodeIdEnum reasonCodeId) |
| `Signature` | [`SignatureEnum`](../../doc/models/signature-enum.md) | Optional | - | SignatureEnum getSignature() | setSignature(SignatureEnum signature) |

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

