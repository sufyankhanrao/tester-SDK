# Nested Elements Model

```java
NestedElementsModel nestedElementsModel = client.getNestedElementsModel();
```

## Class Name

`NestedElementsModel`

## Methods

* [Generate](/doc/controllers/nested-elements-model.md#generate)
* [Validate](/doc/controllers/nested-elements-model.md#validate)


# Generate

Generate

```java
CompletableFuture<ModelWithNestedElementsModel> generateAsync()
```

## Response Type

[`ModelWithNestedElementsModel`](/doc/models/model-with-nested-elements-model.md)

## Example Usage

```java
nestedElementsModel.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects an XML document that should perfectly map onto the "ModelwithNestedElementsModel" model

```java
CompletableFuture<ServerResponse> validateAsync(
    final ModelWithNestedElementsModel body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ModelWithNestedElementsModel`](/doc/models/model-with-nested-elements-model.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
ModelWithNestedElementsModel body = new ModelWithNestedElementsModel();
body.setElements(new SimpleElements());
body.getElements().setStringElement("string-element6");
body.getElements().setNonreserved("nonreserved8");
body.getElements().setNumberElement(248);
body.getElements().setPrecision(179.52);
body.getElements().setBooleanElement(false);
body.setSimple("simple6");

nestedElementsModel.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

