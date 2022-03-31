
# Response Transactions Collection

## Structure

`ResponseTransactionsCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"TransactionsCollection"` | String getType() | setType(String type) |
| `List` | [`List<List10>`](../../doc/models/list-10.md) | Required | Resource Members | List<List10> getList() | setList(List<List10> list) |

## Example (as JSON)

```json
{
  "type": "TransactionsCollection",
  "list": {
    "transaction_amount": 20,
    "created_ts": null,
    "id": "11e95f8ec39de8fbdb0a4f1a",
    "modified_ts": null,
    "payment_method": "cc"
  }
}
```

