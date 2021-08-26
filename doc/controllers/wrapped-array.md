# Wrapped Array

```java
WrappedArray wrappedArray = client.getWrappedArray();
```

## Class Name

`WrappedArray`

## Methods

* [Generate](/doc/controllers/wrapped-array.md#generate)
* [Validate](/doc/controllers/wrapped-array.md#validate)


# Generate

Generate

```java
CompletableFuture<WrappedArrayWithElementName> generateAsync()
```

## Response Type

[`WrappedArrayWithElementName`](/doc/models/wrapped-array-with-element-name.md)

## Example Usage

```java
wrappedArray.generateAsync().thenAccept(result -> {
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
    final WrappedArrayWithElementName body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`WrappedArrayWithElementName`](/doc/models/wrapped-array-with-element-name.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
WrappedArrayWithElementName body = new WrappedArrayWithElementName();
body.setElem(new LinkedList<>());
body.getElem().add("elem5");

wrappedArray.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

