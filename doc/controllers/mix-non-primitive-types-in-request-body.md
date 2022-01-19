# Mix Non Primitive Types in Request Body

```java
MixNonPrimitiveTypesInRequestBodyController mixNonPrimitiveTypesInRequestBodyController = client.getMixNonPrimitiveTypesInRequestBodyController();
```

## Class Name

`MixNonPrimitiveTypesInRequestBodyController`


# Send Oneof Container of Anyof

```java
CompletableFuture<ServerResponse> sendOneofContainerOfAnyofAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofContainerOfAnyofSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofContainerOfAnyofSession`]($m/SendOneofContainerOfAnyofSession) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Noon noon = new Noon();
noon.setStartsAt("startsAtDummy");
noon.setEndsAt("endsAtDummy");
noon.setOfferLunch(true);
SendOneofContainerOfAnyofSessionCase1 sendOneofContainerOfAnyofSessionCase1 = SendOneofContainerOfAnyofSessionCase1.fromNoon(noon);
SendOneofContainerOfAnyofSession sendOneofContainerOfAnyofSession = SendOneofContainerOfAnyofSession.fromCase1(sendOneofContainerOfAnyofSessionCase1);

mixNonPrimitiveTypesInRequestBodyController.sendOneofContainerOfAnyofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofContainerOfAnyofSession).thenAccept(result -> {
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

