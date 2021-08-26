# Attributes Model With Inheritance

```java
AttributesModelWithInheritance attributesModelWithInheritance = client.getAttributesModelWithInheritance();
```

## Class Name

`AttributesModelWithInheritance`

## Methods

* [Generate](/doc/controllers/attributes-model-with-inheritance.md#generate)
* [Validate](/doc/controllers/attributes-model-with-inheritance.md#validate)


# Generate

Generate

```java
CompletableFuture<ModelWithInheritedAttributes> generateAsync()
```

## Response Type

[`ModelWithInheritedAttributes`](/doc/models/model-with-inherited-attributes.md)

## Example Usage

```java
attributesModelWithInheritance.generateAsync().thenAccept(result -> {
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
    final ModelWithInheritedAttributes body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ModelWithInheritedAttributes`](/doc/models/model-with-inherited-attributes.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
ModelWithInheritedAttributes body = new ModelWithInheritedAttributes();
body.setStringElement("string-element4");
body.setNonreserved("nonreserved6");
body.setNumberElement(164);
body.setPrecision(247.8);
body.setBooleanElement(false);
body.setNewStringField("NewStringField6");

attributesModelWithInheritance.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

