
# Server Response

## Structure

`ServerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Passed` | `boolean` | Required | <testing><br> | boolean getPassed() | setPassed(boolean passed) |
| `Message` | `String` | Optional | <testing><br> | String getMessage() | setMessage(String message) |
| `Input` | `Map<String, Object>` | Optional | <testing><br> | Map<String, Object> getInput() | setInput(Map<String, Object> input) |

## Example (as JSON)

```json
{
  "passed": false,
  "Message": null,
  "input": null
}
```

