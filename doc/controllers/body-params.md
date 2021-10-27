# Body Params

```java
BodyParamsController bodyParamsController = client.getBodyParamsController();
```

## Class Name

`BodyParamsController`


# Create Send Nullable Scalar Type Container in Body

```java
CompletableFuture<DynamicResponse> createSendNullableScalarTypeContainerInBodyAsync(
    final boolean allNullableSetToNull,
    final NullableScalarTypeContainer nullableScalarType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `allNullableSetToNull` | `boolean` | Query, Required | - |
| `nullableScalarType` | [`NullableScalarTypeContainer`](/doc/models/nullable-scalar-type-container.md) | Body, Required | - |

## Response Type

`DynamicResponse`

## Example Usage

```java
boolean allNullableSetToNull = false;
NullableScalarTypeContainer nullableScalarType = new NullableScalarTypeContainer();
nullableScalarType.setTestPrecision(60.78);
nullableScalarType.setTestNumber(236);
nullableScalarType.setTestBoolean(false);
nullableScalarType.setTestLong(184L);
nullableScalarType.setTestString("testString8");

bodyParamsController.createSendNullableScalarTypeContainerInBodyAsync(allNullableSetToNull, nullableScalarType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

