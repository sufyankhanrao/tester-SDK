
# Response Terminals Collection

## Structure

`ResponseTerminalsCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"TerminalsCollection"` | String getType() | setType(String type) |
| `List` | [`List<List8>`](../../doc/models/list-8.md) | Required | Resource Members | List<List8> getList() | setList(List<List8> list) |

## Example (as JSON)

```json
{
  "type": "TerminalsCollection",
  "list": {
    "location_id": "11e95f8ec39de8fbdb0a4f1a",
    "terminal_application_id": "11e95f8ec39de8fbdb0a4f1a",
    "terminal_manufacturer_id": 1,
    "title": "My terminal",
    "local_ip_address": "192.168.0.10",
    "port": 10009,
    "serial_number": "1234567890",
    "terminal_number": null,
    "debit": false,
    "emv": false,
    "cashback_enable": false,
    "print_enable": false,
    "sig_capture_enable": false,
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "created_ts": null,
    "modified_ts": null,
    "last_registration_ts": null,
    "created_user_id": "11e95f8ec39de8fbdb0a4f1a",
    "modified_user_id": "11e95f8ec39de8fbdb0a4f1a"
  }
}
```

