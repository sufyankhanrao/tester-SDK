
# Echo Response

Raw http Request info

## Structure

`EchoResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Body` | `Map<String, Object>` | Optional | <testing><br> | Map<String, Object> getBody() | setBody(Map<String, Object> body) |
| `Headers` | `Map<String, String>` | Optional | <testing><br> | Map<String, String> getHeaders() | setHeaders(Map<String, String> headers) |
| `Method` | `String` | Optional | <testing><br> | String getMethod() | setMethod(String method) |
| `Path` | `String` | Optional | relativePath | String getPath() | setPath(String path) |
| `Query` | [`Map<String, QueryParameter>`](/doc/models/query-parameter.md) | Optional | <testing><br> | Map<String, QueryParameter> getQuery() | setQuery(Map<String, QueryParameter> query) |
| `UploadCount` | `Integer` | Optional | <testing><br> | Integer getUploadCount() | setUploadCount(Integer uploadCount) |

## Example (as JSON)

```json
{
  "body": null,
  "headers": null,
  "method": null,
  "path": null,
  "query": null,
  "uploadCount": null
}
```

