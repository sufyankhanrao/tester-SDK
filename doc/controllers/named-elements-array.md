# Named Elements Array

```java
NamedElementsArray namedElementsArray = client.getNamedElementsArray();
```

## Class Name

`NamedElementsArray`

## Methods

* [Generate](/doc/controllers/named-elements-array.md#generate)
* [Validate](/doc/controllers/named-elements-array.md#validate)


# Generate

Generate

```java
CompletableFuture<SimpleArrayWithElementName> generateAsync()
```

## Response Type

[`SimpleArrayWithElementName`](/doc/models/simple-array-with-element-name.md)

## Example Usage

```java
namedElementsArray.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects an XML document that should perfectly map onto the "simpleArrayWithElementName" model

```java
CompletableFuture<ServerResponse> validateAsync(
    final SimpleArrayWithElementName body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SimpleArrayWithElementName`](/doc/models/simple-array-with-element-name.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SimpleArrayWithElementName body = new SimpleArrayWithElementName();
body.setElem(new LinkedList<>());
body.getElem().add("elem5");

namedElementsArray.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

