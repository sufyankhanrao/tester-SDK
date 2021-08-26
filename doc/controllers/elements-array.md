# Elements Array

```java
ElementsArray elementsArray = client.getElementsArray();
```

## Class Name

`ElementsArray`

## Methods

* [Generate](/doc/controllers/elements-array.md#generate)
* [Validate](/doc/controllers/elements-array.md#validate)


# Generate

Generate

```java
CompletableFuture<SimpleArray> generateAsync()
```

## Response Type

[`SimpleArray`](/doc/models/simple-array.md)

## Example Usage

```java
elementsArray.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects an XML document that should perfectly map onto the "simpleArray" model

```java
CompletableFuture<ServerResponse> validateAsync(
    final SimpleArray body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SimpleArray`](/doc/models/simple-array.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SimpleArray body = new SimpleArray();
body.setElem(new LinkedList<>());
body.getElem().add("elem5");

elementsArray.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

