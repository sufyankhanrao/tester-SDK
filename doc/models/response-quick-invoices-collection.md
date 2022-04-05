
# Response Quick Invoices Collection

## Structure

`ResponseQuickInvoicesCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"QuickInvoicesCollection"` | String getType() | setType(String type) |
| `List` | [`List<List4>`](../../doc/models/list-4.md) | Required | Resource Members | List<List4> getList() | setList(List<List4> list) |

## Example (as JSON)

```json
{
  "type": "QuickInvoicesCollection",
  "list": {
    "location_id": "11e95f8ec39de8fbdb0a4f1a",
    "title": "My terminal",
    "cc_product_transaction_id": "11e95f8ec39de8fbdb0a4f1a",
    "due_date": "2021-12-01",
    "item_list": {
      "name": "Bread",
      "amount": 20.15
    },
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "created_ts": null,
    "modified_ts": null
  }
}
```

