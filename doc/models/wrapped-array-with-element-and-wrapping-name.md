
# Wrapped Array With Element and Wrapping Name

A model containing a string array

## Structure

`WrappedArrayWithElementAndWrappingName`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Elem` | `List<String>` | Required | A string array that should be wrapped in another element.  The wrapping element's xml name should be "elements" and the xml names of the elements should be "animal" | List<String> getElem() | setElem(List<String> elem) |

## Example (as XML)

```xml
<wrappedArrayWithElementAndWrappingName>
  <elements>
    <animal>elem1</animal>
    <animal>elem2</animal>
  </elements>
</wrappedArrayWithElementAndWrappingName>
```

