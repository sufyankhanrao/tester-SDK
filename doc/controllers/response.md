# Response

```java
ResponseController responseController = client.getResponseController();
```

## Class Name

`ResponseController`


# Get Nullable Scalar Type Container in Response

```java
CompletableFuture<NullableScalarTypeContainer> getNullableScalarTypeContainerInResponseAsync()
```

## Response Type

[`NullableScalarTypeContainer`](/doc/models/nullable-scalar-type-container.md)

## Example Usage

```java
responseController.getNullableScalarTypeContainerInResponseAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

