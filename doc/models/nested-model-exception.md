
# Nested Model Exception

## Structure

`NestedModelException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServerMessage` | `String` | Required | <testing><br> | String getServerMessage() | setServerMessage(String serverMessage) |
| `ServerCode` | `String` | Required | <testing><br> | String getServerCode() | setServerCode(String serverCode) |
| `Model` | [`Validate`](/doc/models/validate.md) | Required | <testing><br> | Validate getModel() | setModel(Validate model) |

## Example (as JSON)

```json
{
  "ServerMessage": "ServerMessage6",
  "ServerCode": "ServerCode0",
  "model": {
    "field": "field4",
    "name": "name2",
    "address": null
  }
}
```
