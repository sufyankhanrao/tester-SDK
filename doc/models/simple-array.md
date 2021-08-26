
# Simple Array

A model containing a string array with no xml attributes. This model's xml name should be "useThis"

## Structure

`SimpleArray`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Elem` | `List<String>` | Required | - | List<String> getElem() | setElem(List<String> elem) |

## Example (as XML)

```xml
<useThis>
  <elem>elem1</elem>
  <elem>elem2</elem>
</useThis>
```

