
# Data

## Structure

`Data`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `UUID` | Required | A [UUID v4](https://datatracker.ietf.org/doc/html/rfc4122) that's unique for the Async Request | UUID getCode() | setCode(UUID code) |
| `Type` | `String` | Required | The @type from the original request. | String getType() | setType(String type) |
| `Id` | `String` | Required | After a sucessfully processing, the system will fill with the final ID for the document | String getId() | setId(String id) |
| `Progress` | `int` | Required | The current percentage progress<br>**Constraints**: `>= 0`, `<= 100` | int getProgress() | setProgress(int progress) |
| `Error` | `String` | Optional | In case of error processing, it will contain the error details | String getError() | setError(String error) |
| `Ttl` | `long` | Required | The date (in [Epoch Time](https://en.wikipedia.org/wiki/Unix_time)) this status register is set to expire. Usually 30 days after the request. | long getTtl() | setTtl(long ttl) |

## Example (as JSON)

```json
{
  "code": "406c66c3-21cb-47fb-80fc-843bc42507fb",
  "type": "Transaction",
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "progress": 100,
  "ttl": 7956886942
}
```

