
# Response 416 Date Range

## Structure

`Response416dateRange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatusCode` | `Integer` | Optional | Response code | Integer getStatusCode() | setStatusCode(Integer statusCode) |
| `Error` | `String` | Optional | Requested Range Not Satisfiable | String getError() | setError(String error) |
| `Message` | `String` | Optional | The "fieldDate" should be less or equal to "ISODate". | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "statusCode": null,
  "error": null,
  "message": null
}
```

