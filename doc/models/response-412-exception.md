
# Response 412 Exception

## Structure

`Response412Exception`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatusCode` | `Integer` | Optional | Response code | Integer getStatusCode() | setStatusCode(Integer statusCode) |
| `Error` | `String` | Optional | Error description | String getError() | setError(String error) |
| `Message` | `String` | Optional | Error message | String getMessage() | setMessage(String message) |
| `Details` | [`List<Detail>`](../../doc/models/detail.md) | Optional | Error detail | List<Detail> getDetails() | setDetails(List<Detail> details) |

## Example (as JSON)

```json
{
  "statusCode": null,
  "error": null,
  "message": null,
  "details": null
}
```

