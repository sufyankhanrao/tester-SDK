# Query Params

```java
QueryParamsController queryParamsController = client.getQueryParamsController();
```

## Class Name

`QueryParamsController`


# Get Send Nullable Scalar Types in Query

```java
CompletableFuture<DynamicResponse> getSendNullableScalarTypesInQueryAsync(
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
| `testPrecision` | `Double` | Query, Required | - |
| `testNumber` | `Integer` | Query, Required | - |
| `testBoolean` | `Boolean` | Query, Required | - |
| `testLong` | `Long` | Query, Required | - |
| `testString` | `String` | Query, Required | - |

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

queryParamsController.getSendNullableScalarTypesInQueryAsync(allNullableSetToNull, testPrecision, testNumber, testBoolean, testLong, testString).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

