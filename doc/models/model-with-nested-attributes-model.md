
# Model With Nested Attributes Model

## Structure

`ModelWithNestedAttributesModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SimpleAttributes` | [`SimpleAttributes`](/doc/models/simple-attributes.md) | Required | A model with only attributes (attributes can only be non-array primitive types) | SimpleAttributes getSimpleAttributes() | setSimpleAttributes(SimpleAttributes simpleAttributes) |
| `Simple` | `String` | Required | - | String getSimple() | setSimple(String simple) |

## Example (as XML)

```xml
<ModelWithNestedAttributesModel>
  <Attributes string="string-element6" nonreserved="nonreserved8" number="6" precision="28.62" boolean="false" />
  <simple>simple2</simple>
</ModelWithNestedAttributesModel>
```

