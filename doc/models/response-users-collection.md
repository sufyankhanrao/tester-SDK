
# Response Users Collection

## Structure

`ResponseUsersCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"UsersCollection"` | String getType() | setType(String type) |
| `List` | [`List<List11>`](../../doc/models/list-11.md) | Required | Resource Members | List<List11> getList() | setList(List<List11> list) |

## Example (as JSON)

```json
{
  "type": "UsersCollection",
  "list": {
    "branding_domain_url": "{branding_domain_url}",
    "contact_id": "11e95f8ec39de8fbdb0a4f1a",
    "domain_id": "11e95f8ec39de8fbdb0a4f1a",
    "email": "testuser@test.com",
    "email_trx_receipt": true,
    "last_name": "Smith",
    "locale": "en-US",
    "primary_location_id": "11e95f8ec39de8fbdb0a4f1a",
    "terms_condition_id": "11e95f8ec39de8fbdb0a4f1a",
    "tz": "America/New_York",
    "ui_prefs": {
      "entry_page": "dashboard",
      "page_size": 2,
      "report_export_type": 99,
      "process_method": 99,
      "default_terminal": "11e95f8ec39de8fbdb0a4f1a"
    },
    "username": "{user_name}",
    "user_type_id": 100,
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "status": 1,
    "login_attempts": 0,
    "last_login_ts": null,
    "created_ts": null,
    "modified_ts": null,
    "created_user_id": "11e95f8ec39de8fbdb0a4f1a",
    "current_date_time": "03/11/2019 17:38:26"
  }
}
```

