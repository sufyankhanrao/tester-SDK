
# Custom Attribute Definition

## Structure

`CustomAttributeDefinition`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Schema` | `JsonValue` | Required | - | JsonValue getSchema() | setSchema(JsonValue schema) |
| `CommentSchema` | `JsonValue` | Optional | - | JsonValue getCommentSchema() | setCommentSchema(JsonValue commentSchema) |

## Example (as JSON)

```json
{
  "name": "a name",
  "id": "definition-123",
  "schema": {
    "$schema": "https://json-schema.org/draft/2020-12/schema",
    "title": "Person",
    "type": "object",
    "properties": {
      "firstName": {
        "type": "string",
        "description": "The person's first name."
      },
      "lastName": {
        "type": "string",
        "description": "The person's last name.",
        "test": null
      },
      "age": {
        "type": "integer",
        "description": "Age in years",
        "minimum": 0
      }
    }
  }
}
```

