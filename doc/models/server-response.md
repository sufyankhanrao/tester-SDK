
# Server Response

## Structure

`ServerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Passed` | `boolean` | Required | <testing> <testing> | boolean getPassed() | setPassed(boolean passed) |
| `Message` | `String` | Optional | <testing> <testing> | String getMessage() | setMessage(String message) |
| `Input` | `Map<String, Object>` | Optional | <testing> <testing> | Map<String, Object> getInput() | setInput(Map<String, Object> input) |

## Example (as JSON)

```json
{
  "passed": false,
  "Message": null,
  "input": null
}
```

