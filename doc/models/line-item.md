
# Line Item

## Structure

`LineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AlternateTaxId` | `String` | Optional | Tax identification number of the merchant that reported the alternate tax amount.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `15` | String getAlternateTaxId() | setAlternateTaxId(String alternateTaxId) |
| `DebitCredit` | [`DebitCreditEnum`](../../doc/models/debit-credit-enum.md) | Optional | Indicator used to reflect debit (D) or credit (C) transaction. Allowed values: “D”, “C”.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | DebitCreditEnum getDebitCredit() | setDebitCredit(DebitCreditEnum debitCredit) |
| `Description` | `String` | Required | Description of the item.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `26` | String getDescription() | setDescription(String description) |
| `DiscountAmount` | `Double` | Optional | Total discount amount applied against the line item total ,Can accept Two (2) decimal places.<br>**Constraints**: `<= 999999999999` | Double getDiscountAmount() | setDiscountAmount(Double discountAmount) |
| `DiscountRate` | `Double` | Optional | Discount rate for the line item ,Can accept Two (2) decimal places.<br>**Constraints**: `<= 99999` | Double getDiscountRate() | setDiscountRate(Double discountRate) |
| `ProductCode` | `String` | Required | Merchant-defined description code of the item.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `12` | String getProductCode() | setProductCode(String productCode) |
| `Quantity` | `Double` | Optional | Quantity of the item, can accept Four (4) decimal places.<br>**Constraints**: `<= 99999` | Double getQuantity() | setQuantity(Double quantity) |
| `TaxAmount` | `Double` | Optional | Amount of any value added taxes, can accept Two (2) decimal places.<br>**Constraints**: `>= 0`, `<= 999999999` | Double getTaxAmount() | setTaxAmount(Double taxAmount) |
| `TaxRate` | `Double` | Optional | Tax rate used to calculate the sales tax amount, can accept 2 decimal places.<br>**Constraints**: `<= 9999` | Double getTaxRate() | setTaxRate(Double taxRate) |
| `TaxTypeApplied` | `String` | Optional | Type of value-added taxes that are being used (Conditional If tax amount is supplied)<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `4` | String getTaxTypeApplied() | setTaxTypeApplied(String taxTypeApplied) |
| `TaxTypeId` | `String` | Optional | Indicates the type of tax collected in relationship to a specific tax amount (Conditional If tax amount is supplied)<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2` | String getTaxTypeId() | setTaxTypeId(String taxTypeId) |
| `UnitCode` | `String` | Required | Units of measurement as used in international trade. (See Codes for Units of Measurement below for unit code abbreviations)<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getUnitCode() | setUnitCode(String unitCode) |
| `UnitCost` | `double` | Required | Unit cost of the item ,Can accept Four (4) decimal places.<br>**Constraints**: `<= 999999999999` | double getUnitCost() | setUnitCost(double unitCost) |

## Example (as JSON)

```json
{
  "description": null,
  "product_code": "coke12345678",
  "unit_code": "gll",
  "unit_cost": 10
}
```

