
# Wrapped Array With Element Name

A model containing a string array

## Structure

`WrappedArrayWithElementName`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Elem` | `List<String>` | Required | A string array that should be wrapped in another element.  The wrapping element's xml name should be "elem" and the xml names of the elements should be "animal" | List<String> getElem() | setElem(List<String> elem) |

## Example (as XML)

```xml
<wrappedArrayWithElementName>
  <elem>
    <animal>elem1</animal>
    <animal>elem2</animal>
  </elem>
</wrappedArrayWithElementName>
```

