# Mix Primitive Types in Request Body

```java
MixPrimitiveTypesInRequestBodyController mixPrimitiveTypesInRequestBodyController = client.getMixPrimitiveTypesInRequestBodyController();
```

## Class Name

`MixPrimitiveTypesInRequestBodyController`


# Send Anyof Container of Oneof

```java
CompletableFuture<ServerResponse> sendAnyofContainerOfOneofAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final AnyOfContainerOfOneOf value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `value` | [`AnyOfContainerOfOneOf`](/doc/models/any-of-container-of-one-of.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
AnyOfContainerOfOneOf value = new AnyOfContainerOfOneOf();
value.setValue(AnyOfContainerOfOneOfValue.fromPrecision(233.58));

mixPrimitiveTypesInRequestBodyController.sendAnyofContainerOfOneofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, value).thenAccept(result -> {
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

