# Mix Primitive Types in Request Body

```java
MixPrimitiveTypesInRequestBodyController mixPrimitiveTypesInRequestBodyController = client.getMixPrimitiveTypesInRequestBodyController();
```

## Class Name

`MixPrimitiveTypesInRequestBodyController`


# Send Anyof Container of Oneof

```java
CompletableFuture<ServerResponse> sendAnyofContainerOfOneofAsync(
    final SendAnyofContainerOfOneofInput input)
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
SendAnyofContainerOfOneofInput sendAnyofContainerOfOneofInput = new SendAnyofContainerOfOneofInput();
sendAnyofContainerOfOneofInput.setIsPrimitiveType(false);
sendAnyofContainerOfOneofInput.setIsAtEndpointLevel(false);
sendAnyofContainerOfOneofInput.setHasDiscriminator(false);
sendAnyofContainerOfOneofInput.setValue(new AnyOfContainerOfOneOf());
sendAnyofContainerOfOneofInput.getValue().setValue(AnyOfContainerOfOneOfValue.fromPrecision(233.58));

mixPrimitiveTypesInRequestBodyController.sendAnyofContainerOfOneofAsync(sendAnyofContainerOfOneofInput).thenAccept(result -> {
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

