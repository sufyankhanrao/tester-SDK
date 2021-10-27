# Form Params

```java
FormParamsController formParamsController = client.getFormParamsController();
```

## Class Name

`FormParamsController`

## Methods

* [Create Send Nullable Scalar Type Container in Form](/doc/controllers/form-params.md#create-send-nullable-scalar-type-container-in-form)
* [Create Send Nullable Scalar Types in Form Param](/doc/controllers/form-params.md#create-send-nullable-scalar-types-in-form-param)


# Create Send Nullable Scalar Type Container in Form

```java
CompletableFuture<DynamicResponse> createSendNullableScalarTypeContainerInFormAsync(
    final boolean allNullableSetToNull,
    final NullableScalarTypeContainer nullableScalarType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `allNullableSetToNull` | `boolean` | Query, Required | - |
| `nullableScalarType` | [`NullableScalarTypeContainer`](/doc/models/nullable-scalar-type-container.md) | Form, Required | - |

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

formParamsController.createSendNullableScalarTypeContainerInFormAsync(allNullableSetToNull, nullableScalarType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Create Send Nullable Scalar Types in Form Param

```java
CompletableFuture<DynamicResponse> createSendNullableScalarTypesInFormParamAsync(
    final boolean allNullableSetToNull,
    final Double testPrecision,
    final Integer testNumber,
    final Boolean testBoolean,
    final Long testLong,
    final String testString)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `allNullableSetToNull` | `boolean` | Query, Required | - |
| `testPrecision` | `Double` | Form, Required | - |
| `testNumber` | `Integer` | Form, Required | - |
| `testBoolean` | `Boolean` | Form, Required | - |
| `testLong` | `Long` | Form, Required | - |
| `testString` | `String` | Form, Required | - |

## Response Type

`DynamicResponse`

## Example Usage

```java
boolean allNullableSetToNull = false;
Double testPrecision = 125.94;
Integer testNumber = 136;
Boolean testBoolean = false;
Long testLong = 44L;
String testString = "testString2";

formParamsController.createSendNullableScalarTypesInFormParamAsync(allNullableSetToNull, testPrecision, testNumber, testBoolean, testLong, testString).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

