
# Discriminator in Attribute

The child model to be used for testing discriminator support using attributes.

## Structure

`DiscriminatorInAttribute`

## Inherits From

[`BaseForDiscriminatorInAttribute`](/doc/models/base-for-discriminator-in-attribute.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddedField` | `String` | Required | String element in child model. | String getAddedField() | setAddedField(String addedField) |

## Example (as XML)

```xml
<discriminated discrim="">
  <added>Added Field4</added>
  <inherited>Base Field2</inherited>
</discriminated>
```

