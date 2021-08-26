# Attributes and Elements Model

```java
AttributesAndElementsModel attributesAndElementsModel = client.getAttributesAndElementsModel();
```

## Class Name

`AttributesAndElementsModel`

## Methods

* [Generate](/doc/controllers/attributes-and-elements-model.md#generate)
* [Validate](/doc/controllers/attributes-and-elements-model.md#validate)
* [Generate Array](/doc/controllers/attributes-and-elements-model.md#generate-array)
* [Validate Array](/doc/controllers/attributes-and-elements-model.md#validate-array)


# Generate

This endpoint returns an XML document that should perfectly map onto the "AttributesAndElements" model

```java
CompletableFuture<AttributesAndElements> generateAsync()
```

## Response Type

[`AttributesAndElements`](/doc/models/attributes-and-elements.md)

## Example Usage

```java
attributesAndElementsModel.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects an XML document that should perfectly map onto the "AttributesAndElements" model

```java
CompletableFuture<ServerResponse> validateAsync(
    final AttributesAndElements body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AttributesAndElements`](/doc/models/attributes-and-elements.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
AttributesAndElements body = new AttributesAndElements();
body.setStringAttr("string-attr8");
body.setNumberAttr(70);
body.setStringElement("string-element4");
body.setNumberElement(164);

attributesAndElementsModel.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Generate Array

This endpoint returns an XML document that should perfectly map onto the "AttributesAndElements" model array

```java
CompletableFuture<List<AttributesAndElements>> generateArrayAsync()
```

## Response Type

[`List<AttributesAndElements>`](/doc/models/attributes-and-elements.md)

## Example Usage

```java
attributesAndElementsModel.generateArrayAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate Array

This endpoint expects an XML document that should perfectly map onto the "AttributesAndElements" model array

```java
CompletableFuture<ServerResponse> validateArrayAsync(
    final List<AttributesAndElements> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<AttributesAndElements>`](/doc/models/attributes-and-elements.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<AttributesAndElements> body = new LinkedList<>();

AttributesAndElements body0 = new AttributesAndElements();
body0.setStringAttr("string-attr6");
body0.setNumberAttr(194);
body0.setStringElement("string-element2");
body0.setNumberElement(40);
body.add(body0);

AttributesAndElements body1 = new AttributesAndElements();
body1.setStringAttr("string-attr7");
body1.setNumberAttr(193);
body1.setStringElement("string-element3");
body1.setNumberElement(41);
body.add(body1);


attributesAndElementsModel.validateArrayAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

