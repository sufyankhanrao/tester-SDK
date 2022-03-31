
# Response Transaction Intention

## Structure

`ResponseTransactionIntention`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"TransactionIntention"` | String getType() | setType(String type) |
| `Data` | [`Data4`](../../doc/models/data-4.md) | Optional | - | Data4 getData() | setData(Data4 data) |

## Example (as JSON)

```json
{
  "type": "TransactionIntention"
}
```

