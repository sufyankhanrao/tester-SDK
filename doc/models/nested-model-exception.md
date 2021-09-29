
# Nested Model Exception

## Structure

`NestedModelException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServerMessage` | `String` | Required | &lt;testing&gt; &lt;testing&gt; | String getServerMessage() | setServerMessage(String serverMessage) |
| `ServerCode` | `String` | Required | &lt;testing&gt; &lt;testing&gt; | String getServerCode() | setServerCode(String serverCode) |
| `Model` | [`Validate`](/doc/models/validate.md) | Required | &lt;testing&gt; &lt;testing&gt; | Validate getModel() | setModel(Validate model) |

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

