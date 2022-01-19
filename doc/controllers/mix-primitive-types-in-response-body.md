# Mix Primitive Types in Response Body

```java
MixPrimitiveTypesInResponseBodyController mixPrimitiveTypesInResponseBodyController = client.getMixPrimitiveTypesInResponseBodyController();
```

## Class Name

`MixPrimitiveTypesInResponseBodyController`


# Get Anyof Container of Oneof

```java
CompletableFuture<AnyOfContainerOfOneOf> getAnyofContainerOfOneofAsync(
    final GetAnyofContainerOfOneofInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`AnyOfContainerOfOneOf`](/doc/models/any-of-container-of-one-of.md)

## Example Usage

```java
GetAnyofContainerOfOneofInput getAnyofContainerOfOneofInput = new GetAnyofContainerOfOneofInput();
getAnyofContainerOfOneofInput.setIsPrimitiveType(false);
getAnyofContainerOfOneofInput.setIsAtEndpointLevel(false);
getAnyofContainerOfOneofInput.setHasDiscriminator(false);

mixPrimitiveTypesInResponseBodyController.getAnyofContainerOfOneofAsync(getAnyofContainerOfOneofInput).thenAccept(result -> {
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

