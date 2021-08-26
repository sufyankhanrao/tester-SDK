
# Simple Array With Element Name

A model containing a string array that has the xml name "element". The array should not be wrapped and the wrapper name should not be used.

## Structure

`SimpleArrayWithElementName`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Elem` | `List<String>` | Required | - | List<String> getElem() | setElem(List<String> elem) |

## Example (as XML)

```xml
<simpleArrayWithElementName>
  <element>elem1</element>
  <element>elem2</element>
</simpleArrayWithElementName>
```

