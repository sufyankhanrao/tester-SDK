
# Response Contacts Collection

## Structure

`ResponseContactsCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"ContactsCollection"` | String getType() | setType(String type) |
| `List` | [`List<List1>`](../../doc/models/list-1.md) | Required | Resource Members | List<List1> getList() | setList(List<List1> list) |

## Example (as JSON)

```json
{
  "type": "ContactsCollection",
  "list": {
    "location_id": "11e95f8ec39de8fbdb0a4f1a",
    "last_name": "Smith",
    "email_trx_receipt": true,
    "header_message_type": 0,
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "created_ts": null,
    "modified_ts": null,
    "active": 1
  }
}
```

