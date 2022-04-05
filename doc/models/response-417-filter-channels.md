
# Response 417 Filter Channels

## Structure

`Response417filterChannels`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatusCode` | `Integer` | Optional | Response code | Integer getStatusCode() | setStatusCode(Integer statusCode) |
| `Error` | `String` | Optional | Expectation Failed | String getError() | setError(String error) |
| `Message` | `String` | Optional | Channel filters are not set for this project | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "statusCode": null,
  "error": null,
  "message": null
}
```

