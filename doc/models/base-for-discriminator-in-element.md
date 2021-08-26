
# Base for Discriminator in Element

A model to serve as the base class for testing discriminator support using elements.

## Structure

`BaseForDiscriminatorInElement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Discriminator` | `String` | Optional | The discriminator element. | String getDiscriminator() | setDiscriminator(String discriminator) |
| `BaseField` | `String` | Required | String element in parent model. | String getBaseField() | setBaseField(String baseField) |

## Example (as XML)

```xml
<discriminated>
  <inherited>Base Field2</inherited>
</discriminated>
```

