
# Server Response

## Structure

`ServerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Passed` | `boolean` | Required | &lt;testing&gt; &lt;testing&gt; | boolean getPassed() | setPassed(boolean passed) |
| `Message` | `String` | Optional | &lt;testing&gt; &lt;testing&gt; | String getMessage() | setMessage(String message) |
| `Input` | `Map<String, Object>` | Optional | &lt;testing&gt; &lt;testing&gt; | Map<String, Object> getInput() | setInput(Map<String, Object> input) |

## Example (as JSON)

```json
{
  "passed": false,
  "Message": null,
  "input": null
}
```

