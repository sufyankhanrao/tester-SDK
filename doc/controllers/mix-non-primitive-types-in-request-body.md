# Mix Non Primitive Types in Request Body

```java
MixNonPrimitiveTypesInRequestBodyController mixNonPrimitiveTypesInRequestBodyController = client.getMixNonPrimitiveTypesInRequestBodyController();
```

## Class Name

`MixNonPrimitiveTypesInRequestBodyController`


# Send Anyof Container of Oneof

```java
CompletableFuture<ServerResponse> sendAnyofContainerOfOneofAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofContainerOfOneofSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | `object` | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Morning morning = new Morning();
morning.setStartsAt("startsAt9");
morning.setEndsAt("endsAt9");
morning.setOfferTeaBreak(true);
SendAnyofContainerOfOneofSession sendAnyofContainerOfOneofSession = SendAnyofContainerOfOneofSession.fromMorning(morning);

mixNonPrimitiveTypesInRequestBodyController.sendAnyofContainerOfOneofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofContainerOfOneofSession).thenAccept(result -> {
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

