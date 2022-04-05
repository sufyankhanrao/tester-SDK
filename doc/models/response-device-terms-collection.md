
# Response Device Terms Collection

## Structure

`ResponseDeviceTermsCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"DeviceTermsCollection"` | String getType() | setType(String type) |
| `List` | [`List<List2>`](../../doc/models/list-2.md) | Required | Resource Members | List<List2> getList() | setList(List<List2> list) |

## Example (as JSON)

```json
{
  "type": "DeviceTermsCollection",
  "list": {
    "location_id": "11e95f8ec39de8fbdb0a4f1a",
    "terminal_id": "11e95f8ec39de8fbdb0a4f1a",
    "require_signature": null,
    "terms_conditions": "FUNgib0Vh0B9c0Wbttvr50vNtGLOkTdFL0eFmhN1RJpKhK14IENeDa8irp2dEk9thEcVHvVEyriQeZLs5NjNsCzqNj9JDA4RSJwK647IFtYjrNPN1nBb9bw6hoQ71oT5kpsiXGt8HcqBFVBVeDA7psIzKAyDveAw2o1hfjipkOtXrPgWun0rYwyyFuvqkT1egQYKfYDj",
    "created_ts": null,
    "created_user_id": "11e95f8ec39de8fbdb0a4f1a",
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "modified_ts": null,
    "reason_code_id": 1000,
    "signature": null
  }
}
```

