
# Response Tokens Collection

## Structure

`ResponseTokensCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"TokensCollection"` | String getType() | setType(String type) |
| `List` | [`List<List9>`](../../doc/models/list-9.md) | Required | Resource Members | List<List9> getList() | setList(List<List9> list) |

## Example (as JSON)

```json
{
  "type": "TokensCollection",
  "list": {
    "location_id": "11e95f8ec39de8fbdb0a4f1a",
    "account_type": "checking",
    "active": 1,
    "cau_summary_status_id": null,
    "created_ts": null,
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "first_six": null,
    "has_recurring": false,
    "last_four": null,
    "modified_ts": null,
    "payment_method": "cc"
  }
}
```

