
# V1 Transactions Level 3 Visa Request

## Structure

`V1TransactionsLevel3VisaRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Level3Data` | [`Level3Data1`](../../doc/models/level-3-data-1.md) | Required | Level 3 data object | Level3Data1 getLevel3Data() | setLevel3Data(Level3Data1 level3Data) |

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
    "customer_vat_registration": null,
    "merchant_vat_registration": null,
    "order_date": null,
    "summary_commodity_code": null,
    "tax_rate": null,
    "unique_vat_ref_number": null,
    "line_items": null
  }
}
```

