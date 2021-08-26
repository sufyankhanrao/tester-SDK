
# Simple Attributes

A model with only attributes (attributes can only be non-array primitive types)

## Structure

`SimpleAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StringElement` | `String` | Required | string attribute (node name "string") | String getStringElement() | setStringElement(String stringElement) |
| `Nonreserved` | `String` | Required | string attribute (node name "nonreserved") | String getNonreserved() | setNonreserved(String nonreserved) |
| `NumberElement` | `int` | Required | number attribute (node name "number ") | int getNumberElement() | setNumberElement(int numberElement) |
| `Precision` | `double` | Required | precision attribute (node name "precision") | double getPrecision() | setPrecision(double precision) |
| `BooleanElement` | `boolean` | Required | boolean attribute (node name "boolean") | boolean getBooleanElement() | setBooleanElement(boolean booleanElement) |
| `AttributesType` | `String` | Optional | - | String getAttributesType() | setAttributesType(String attributesType) |

## Example (as XML)

```xml
<SimpleAttributes string="string-element8" nonreserved="nonreserved0" number="156" precision="112.04" boolean="false" />
```

