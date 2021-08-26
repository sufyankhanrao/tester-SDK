
# Discriminator in Element

The child model to be used for testing discriminator support using elements.

## Structure

`DiscriminatorInElement`

## Inherits From

[`BaseForDiscriminatorInElement`](/doc/models/base-for-discriminator-in-element.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddedField` | `String` | Required | String element in child model. | String getAddedField() | setAddedField(String addedField) |

## Example (as XML)

```xml
<discriminated>
  <added>Added Field4</added>
  <inherited>Base Field2</inherited>
</discriminated>
```

