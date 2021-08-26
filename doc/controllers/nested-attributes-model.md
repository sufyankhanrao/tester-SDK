# Nested Attributes Model

```java
NestedAttributesModel nestedAttributesModel = client.getNestedAttributesModel();
```

## Class Name

`NestedAttributesModel`

## Methods

* [Generate](/doc/controllers/nested-attributes-model.md#generate)
* [Validate](/doc/controllers/nested-attributes-model.md#validate)


# Generate

Generate

```java
CompletableFuture<ModelWithNestedAttributesModel> generateAsync()
```

## Response Type

[`ModelWithNestedAttributesModel`](/doc/models/model-with-nested-attributes-model.md)

## Example Usage

```java
nestedAttributesModel.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects an XML document that should perfectly map onto the "ModelWithNestedAttributesModel" model

```java
CompletableFuture<ServerResponse> validateAsync(
    final ModelWithNestedAttributesModel body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ModelWithNestedAttributesModel`](/doc/models/model-with-nested-attributes-model.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
ModelWithNestedAttributesModel body = new ModelWithNestedAttributesModel();
body.setSimpleAttributes(new SimpleAttributes());
body.getSimpleAttributes().setStringElement("string-element2");
body.getSimpleAttributes().setNonreserved("nonreserved4");
body.getSimpleAttributes().setNumberElement(14);
body.getSimpleAttributes().setPrecision(164.38);
body.getSimpleAttributes().setBooleanElement(false);
body.setSimple("simple6");

nestedAttributesModel.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

