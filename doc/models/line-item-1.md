
# Line Item 1

## Structure

`LineItem1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | Description of the item.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `26` | String getDescription() | setDescription(String description) |
| `CommodityCode` | `String` | Required | An international description code of the individual good or service being supplied.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `12` | String getCommodityCode() | setCommodityCode(String commodityCode) |
| `DiscountAmount` | `Double` | Optional | Total discount amount applied against the line item total ,Can accept Two (2) decimal places.<br>**Constraints**: `<= 999999999999` | Double getDiscountAmount() | setDiscountAmount(Double discountAmount) |
| `OtherTaxAmount` | `Double` | Optional | Used if city or multiple county taxes need to be broken out separately ,Can accept Two (2) decimal places.<br>**Constraints**: `<= 999999999999` | Double getOtherTaxAmount() | setOtherTaxAmount(Double otherTaxAmount) |
| `ProductCode` | `String` | Required | Merchant-defined description code of the item.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `12` | String getProductCode() | setProductCode(String productCode) |
| `Quantity` | `Double` | Optional | Quantity of the item, can accept Four (4) decimal places.<br>**Constraints**: `<= 99999` | Double getQuantity() | setQuantity(Double quantity) |
| `TaxAmount` | `Double` | Optional | Amount of any value added taxes, can accept Two (2) decimal places.<br>**Constraints**: `>= 0`, `<= 999999999` | Double getTaxAmount() | setTaxAmount(Double taxAmount) |
| `TaxRate` | `Double` | Optional | Tax rate used to calculate the sales tax amount, can accept 2 decimal places.<br>**Constraints**: `<= 9999` | Double getTaxRate() | setTaxRate(Double taxRate) |
| `UnitCode` | `String` | Required | Units of measurement as used in international trade. (See Codes for Units of Measurement below for unit code abbreviations)<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getUnitCode() | setUnitCode(String unitCode) |
| `UnitCost` | `double` | Required | Unit cost of the item ,Can accept Four (4) decimal places.<br>**Constraints**: `<= 999999999999` | double getUnitCost() | setUnitCost(double unitCost) |

## Example (as JSON)

```json
{
  "description": "cool drink",
  "commodity_code": "cc123456",
  "product_code": "fanta123456",
  "unit_code": "gll",
  "unit_cost": 3
}
```

