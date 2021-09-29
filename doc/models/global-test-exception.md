
# Global Test Exception

&lt;testing&gt; To test specific global exceptions.

## Structure

`GlobalTestException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServerMessage` | `String` | Required | &lt;testing&gt; Represents the server's exception message | String getServerMessage() | setServerMessage(String serverMessage) |
| `ServerCode` | `int` | Required | &lt;testing&gt; Represents the server's error code | int getServerCode() | setServerCode(int serverCode) |

## Example (as JSON)

```json
{
  "ServerMessage": "ServerMessage6",
  "ServerCode": 170
}
```

