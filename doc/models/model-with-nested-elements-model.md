
# Model With Nested Elements Model

## Structure

`ModelWithNestedElementsModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Elements` | [`SimpleElements`](/doc/models/simple-elements.md) | Required | A model with only non-array, primitive type elements. Look [here](https://gist.github.com/thehappybug/f6cf13f8b5c14a9079ed6402fffe6861#generate-simple-object) for the expected xml schema | SimpleElements getElements() | setElements(SimpleElements elements) |
| `Simple` | `String` | Required | - | String getSimple() | setSimple(String simple) |

## Example (as XML)

```xml
<response>
  <nested>
    <string>string-element0</string>
    <nonreserved>nonreserved2</nonreserved>
    <number>240</number>
    <precision>43.76</precision>
    <boolean>false</boolean>
  </nested>
  <simple>simple2</simple>
</response>
```

