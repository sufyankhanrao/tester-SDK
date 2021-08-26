# Simple Attributes Model

```java
SimpleAttributesModel simpleAttributesModel = client.getSimpleAttributesModel();
```

## Class Name

`SimpleAttributesModel`

## Methods

* [Generate](/doc/controllers/simple-attributes-model.md#generate)
* [Validate](/doc/controllers/simple-attributes-model.md#validate)


# Generate

This endpoint returns an XML document that should perfectly map onto the "Simple Attributes" model

```java
CompletableFuture<SimpleAttributes> generateAsync()
```

## Response Type

[`SimpleAttributes`](/doc/models/simple-attributes.md)

## Example Usage

```java
simpleAttributesModel.generateAsync().thenAccept(result -> {
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
    final SimpleAttributes body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SimpleAttributes`](/doc/models/simple-attributes.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SimpleAttributes body = new SimpleAttributes();
body.setStringElement("string-element4");
body.setNonreserved("nonreserved6");
body.setNumberElement(164);
body.setPrecision(247.8);
body.setBooleanElement(false);

simpleAttributesModel.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

