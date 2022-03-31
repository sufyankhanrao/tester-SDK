
# Response Transaction Processing

## Structure

`ResponseTransactionProcessing`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Resource Type<br>**Default**: `"TransactionProcessing"` | String getType() | setType(String type) |
| `Data` | [`Data14`](../../doc/models/data-14.md) | Optional | - | Data14 getData() | setData(Data14 data) |

## Example (as JSON)

```json
{
  "type": "TransactionProcessing"
}
```

