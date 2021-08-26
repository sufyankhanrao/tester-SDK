
# Attributes and Elements

## Structure

`AttributesAndElements`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StringAttr` | `String` | Required | string attribute (attribute name "string") | String getStringAttr() | setStringAttr(String stringAttr) |
| `NumberAttr` | `int` | Required | number attribute (attribute name "number") | int getNumberAttr() | setNumberAttr(int numberAttr) |
| `StringElement` | `String` | Required | string element (element name "string") | String getStringElement() | setStringElement(String stringElement) |
| `NumberElement` | `int` | Required | number element (element name "number") | int getNumberElement() | setNumberElement(int numberElement) |

## Example (as XML)

```xml
<AttributesAndElements string="string-attr2" number="78">
  <string>string-element8</string>
  <number>156</number>
</AttributesAndElements>
```

