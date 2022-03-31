
# Response Recurrings Collection

## Structure

`ResponseRecurringsCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"RecurringsCollection"` | String getType() | setType(String type) |
| `List` | [`List<List5>`](../../doc/models/list-5.md) | Required | Resource Members | List<List5> getList() | setList(List<List5> list) |

## Example (as JSON)

```json
{
  "type": "RecurringsCollection",
  "list": {
    "account_vault_id": "11e95f8ec39de8fbdb0a4f1a",
    "active": 1,
    "interval": 1,
    "interval_type": "d",
    "location_id": "11e95f8ec39de8fbdb0a4f1a",
    "payment_method": "cc",
    "start_date": "2021-12-01",
    "status": "active",
    "transaction_amount": 3.0,
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "next_run_date": "2021-12-01",
    "created_ts": null,
    "modified_ts": null,
    "recurring_type_id": "i"
  }
}
```

