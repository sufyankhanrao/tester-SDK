# Wrapped and Named Array

```java
WrappedAndNamedArray wrappedAndNamedArray = client.getWrappedAndNamedArray();
```

## Class Name

`WrappedAndNamedArray`

## Methods

* [Generate](/doc/controllers/wrapped-and-named-array.md#generate)
* [Validate](/doc/controllers/wrapped-and-named-array.md#validate)


# Generate

Generate

```java
CompletableFuture<WrappedArrayWithElementAndWrappingName> generateAsync()
```

## Response Type

[`WrappedArrayWithElementAndWrappingName`](/doc/models/wrapped-array-with-element-and-wrapping-name.md)

## Example Usage

```java
wrappedAndNamedArray.generateAsync().thenAccept(result -> {
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
    final WrappedArrayWithElementAndWrappingName body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`WrappedArrayWithElementAndWrappingName`](/doc/models/wrapped-array-with-element-and-wrapping-name.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
WrappedArrayWithElementAndWrappingName body = new WrappedArrayWithElementAndWrappingName();
body.setElem(new LinkedList<>());
body.getElem().add("elem5");

wrappedAndNamedArray.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

