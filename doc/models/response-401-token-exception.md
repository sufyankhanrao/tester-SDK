
# Response 401 Token Exception

## Structure

`Response401tokenException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatusCode` | `Integer` | Optional | Response code | Integer getStatusCode() | setStatusCode(Integer statusCode) |
| `Error` | `String` | Optional | Unauthorized | String getError() | setError(String error) |
| `Message` | `String` | Optional | Invalid token | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "statusCode": null,
  "error": null,
  "message": null
}
```

