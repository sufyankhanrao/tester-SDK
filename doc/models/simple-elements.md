
# Simple Elements

A model with only non-array, primitive type elements. Look [here](https://gist.github.com/thehappybug/f6cf13f8b5c14a9079ed6402fffe6861#generate-simple-object) for the expected xml schema

## Structure

`SimpleElements`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StringElement` | `String` | Required | string element (element name "string") | String getStringElement() | setStringElement(String stringElement) |
| `Nonreserved` | `String` | Required | string element (element name "nonreserved") | String getNonreserved() | setNonreserved(String nonreserved) |
| `NumberElement` | `int` | Required | number element (element name "number ") | int getNumberElement() | setNumberElement(int numberElement) |
| `Precision` | `double` | Required | precision element (element name "precision") | double getPrecision() | setPrecision(double precision) |
| `BooleanElement` | `boolean` | Required | boolean element (element name "boolean") | boolean getBooleanElement() | setBooleanElement(boolean booleanElement) |
| `ModelType` | `String` | Optional | - | String getModelType() | setModelType(String modelType) |

## Example (as XML)

```xml
<SimpleElements>
  <string>string-element8</string>
  <nonreserved>nonreserved0</nonreserved>
  <number>156</number>
  <precision>112.04</precision>
  <boolean>false</boolean>
</SimpleElements>
```

