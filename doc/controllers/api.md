# API

```java
APIController aPIController = client.getAPIController();
```

## Class Name

`APIController`

## Methods

* [Send Custom Attribute Definition](/doc/controllers/api.md#send-custom-attribute-definition)
* [Send Custom Attribute Value](/doc/controllers/api.md#send-custom-attribute-value)


# Send Custom Attribute Definition

```java
CompletableFuture<ServerResponse> sendCustomAttributeDefinitionAsync(
    final CustomAttributeDefinition customAttributeDefinition,
    final boolean setToNull,
    final boolean unSet)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customAttributeDefinition` | [`CustomAttributeDefinition`](/doc/models/custom-attribute-definition.md) | Body, Required | - |
| `setToNull` | `boolean` | Query, Required | - |
| `unSet` | `boolean` | Query, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
CustomAttributeDefinition customAttributeDefinition = new CustomAttributeDefinition();
customAttributeDefinition.setName("a name");
customAttributeDefinition.setId("definition-123");
customAttributeDefinition.setSchema(localhost3000.utilitie.JsonValue.fromJsonString("{\"$schema\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"description\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"description\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}}}"));
boolean setToNull = false;
boolean unSet = false;

aPIController.sendCustomAttributeDefinitionAsync(customAttributeDefinition, setToNull, unSet).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Custom Attribute Value

```java
CompletableFuture<ServerResponse> sendCustomAttributeValueAsync(
    final CustomAttributeValue customAttributeValue,
    final boolean setToNull,
    final boolean unSet)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customAttributeValue` | [`CustomAttributeValue`](/doc/models/custom-attribute-value.md) | Body, Required | - |
| `setToNull` | `boolean` | Query, Required | - |
| `unSet` | `boolean` | Query, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
CustomAttributeValue customAttributeValue = new CustomAttributeValue();
customAttributeValue.setId("value-456");
customAttributeValue.setDefinitionId("definition-123");
customAttributeValue.setValue(localhost3000.utilitie.JsonValue.fromJsonString("{\"firstName\":\"John\",\"lastName\":\"Doe\",\"age\":21,\"test\":null}"));
boolean setToNull = false;
boolean unSet = false;

aPIController.sendCustomAttributeValueAsync(customAttributeValue, setToNull, unSet).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

