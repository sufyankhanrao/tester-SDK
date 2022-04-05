
# Level 3 Data

## Structure

`Level3Data`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DestinationCountryCode` | `String` | Optional | Code of the country where the goods are being shipped.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getDestinationCountryCode() | setDestinationCountryCode(String destinationCountryCode) |
| `DutyAmount` | `Double` | Optional | Fee amount associated with the import of the purchased goods ,Can accept Two (2) decimal places<br>**Constraints**: `>= 0`, `<= 999999999999` | Double getDutyAmount() | setDutyAmount(Double dutyAmount) |
| `FreightAmount` | `Double` | Optional | Freight or shipping portion of the total transaction amount ,Can accept Two (2) decimal places.<br>**Constraints**: `>= 0`, `<= 999999999999` | Double getFreightAmount() | setFreightAmount(Double freightAmount) |
| `NationalTax` | `Double` | Optional | National tax for the transaction ,Can accept Two (2) decimal places.<br>**Constraints**: `<= 9999999999` | Double getNationalTax() | setNationalTax(Double nationalTax) |
| `SalesTax` | `Double` | Optional | Sales tax for the transaction ,Can accept Two (2) decimal places.<br>**Constraints**: `<= 9999999999` | Double getSalesTax() | setSalesTax(Double salesTax) |
| `ShipfromZipCode` | `String` | Optional | Postal/ZIP code of the address from where the purchased goods are being shipped.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `10` | String getShipfromZipCode() | setShipfromZipCode(String shipfromZipCode) |
| `ShiptoZipCode` | `String` | Optional | Postal/ZIP code of the address where purchased goods will be delivered.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `10` | String getShiptoZipCode() | setShiptoZipCode(String shiptoZipCode) |
| `TaxAmount` | `Double` | Optional | Amount of any value added taxes ,Can accept Two (2) decimal places.<br>**Constraints**: `>= 0`, `<= 999999999` | Double getTaxAmount() | setTaxAmount(Double taxAmount) |
| `TaxExempt` | [`TaxExemptEnum`](../../doc/models/tax-exempt-enum.md) | Optional | Sales Tax Exempt. Allowed values: “1”, “0”. | TaxExemptEnum getTaxExempt() | setTaxExempt(TaxExemptEnum taxExempt) |
| `LineItems` | [`List<LineItem>`](../../doc/models/line-item.md) | Optional | Array of line items in transaction | List<LineItem> getLineItems() | setLineItems(List<LineItem> lineItems) |

## Example (as JSON)

```json
{
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
```

