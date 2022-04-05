
# V1 Transactions Level 3 Master Card Request

## Structure

`V1TransactionsLevel3MasterCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Level3Data` | [`Level3Data`](../../doc/models/level-3-data.md) | Required | - | Level3Data getLevel3Data() | setLevel3Data(Level3Data level3Data) |

## Example (as JSON)

```json
{
  "level3_data": {
    "destination_country_code": null,
    "duty_amount": null,
    "freight_amount": null,
    "national_tax": null,
    "sales_tax": null,
    "shipfrom_zip_code": null,
    "shipto_zip_code": null,
    "tax_amount": null,
    "tax_exempt": null,
    "line_items": null
  }
}
```

