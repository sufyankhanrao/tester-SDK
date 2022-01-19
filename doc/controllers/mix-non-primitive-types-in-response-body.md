# Mix Non Primitive Types in Response Body

```java
MixNonPrimitiveTypesInResponseBodyController mixNonPrimitiveTypesInResponseBodyController = client.getMixNonPrimitiveTypesInResponseBodyController();
```

## Class Name

`MixNonPrimitiveTypesInResponseBodyController`


# Get Anyof Container of Oneof

```java
CompletableFuture<Object> getAnyofContainerOfOneofAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

`object`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

mixNonPrimitiveTypesInResponseBodyController.getAnyofContainerOfOneofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | `ApiException` |

