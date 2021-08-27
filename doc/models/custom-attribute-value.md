
# Custom Attribute Value

## Structure

`CustomAttributeValue`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `DefinitionId` | `String` | Required | - | String getDefinitionId() | setDefinitionId(String definitionId) |
| `Value` | `JsonValue` | Required | - | JsonValue getValue() | setValue(JsonValue value) |
| `CommentValue` | `JsonValue` | Optional | - | JsonValue getCommentValue() | setCommentValue(JsonValue commentValue) |

## Example (as JSON)

```json
{
  "id": "value-456",
  "definitionId": "definition-123",
  "value": {
    "firstName": "John",
    "lastName": "Doe",
    "age": 21,
    "test": null
  }
}
```

