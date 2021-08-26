# Simple Elements Model

```java
SimpleElementsModel simpleElementsModel = client.getSimpleElementsModel();
```

## Class Name

`SimpleElementsModel`

## Methods

* [Generate](/doc/controllers/simple-elements-model.md#generate)
* [Validate](/doc/controllers/simple-elements-model.md#validate)


# Generate

This endpoint returns an XML document that should perfectly map onto the "Simple Elements" model

```java
CompletableFuture<SimpleElements> generateAsync()
```

## Response Type

[`SimpleElements`](/doc/models/simple-elements.md)

## Example Usage

```java
simpleElementsModel.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects an XML document that should perfectly map onto the "Simple Attributes" model

```java
CompletableFuture<ServerResponse> validateAsync(
    final SimpleElements body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SimpleElements`](/doc/models/simple-elements.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SimpleElements body = new SimpleElements();
body.setStringElement("string-element4");
body.setNonreserved("nonreserved6");
body.setNumberElement(164);
body.setPrecision(247.8);
body.setBooleanElement(false);

simpleElementsModel.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

