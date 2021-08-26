# Elements Model With Inheritance

```java
ElementsModelWithInheritance elementsModelWithInheritance = client.getElementsModelWithInheritance();
```

## Class Name

`ElementsModelWithInheritance`

## Methods

* [Generate](/doc/controllers/elements-model-with-inheritance.md#generate)
* [Validate](/doc/controllers/elements-model-with-inheritance.md#validate)


# Generate

Generate

```java
CompletableFuture<ModelWithInheritedElements> generateAsync()
```

## Response Type

[`ModelWithInheritedElements`](/doc/models/model-with-inherited-elements.md)

## Example Usage

```java
elementsModelWithInheritance.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects an XML document that should perfectly map onto the "ModelwithInheritedElements" model

```java
CompletableFuture<ServerResponse> validateAsync(
    final ModelWithInheritedElements body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ModelWithInheritedElements`](/doc/models/model-with-inherited-elements.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
ModelWithInheritedElements body = new ModelWithInheritedElements();
body.setStringElement("string-element4");
body.setNonreserved("nonreserved6");
body.setNumberElement(164);
body.setPrecision(247.8);
body.setBooleanElement(false);
body.setNewStringField("NewStringField6");

elementsModelWithInheritance.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

