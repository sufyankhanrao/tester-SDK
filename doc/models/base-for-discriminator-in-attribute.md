
# Base for Discriminator in Attribute

A model to serve as the base class for testing discriminator support using attributes.

## Structure

`BaseForDiscriminatorInAttribute`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Discriminator` | `String` | Optional | The discriminator attribute. | String getDiscriminator() | setDiscriminator(String discriminator) |
| `BaseField` | `String` | Required | String element in parent model. | String getBaseField() | setBaseField(String baseField) |

## Example (as XML)

```xml
<discriminated discrim="">
  <inherited>Base Field2</inherited>
</discriminated>
```

