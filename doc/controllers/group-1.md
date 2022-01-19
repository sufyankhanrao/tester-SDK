# Group 1

```java
Group1Controller group1Controller = client.getGroup1Controller();
```

## Class Name

`Group1Controller`


# Send Oneof Simple

```java
CompletableFuture<Object> sendOneofSimpleAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofSimpleSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | `object` | Body, Required | Course session |

## Response Type

`object`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Evening evening = new Evening();
evening.setStartsAt("startsAtDummy");
evening.setEndsAt("endsAtDummy");
evening.setOfferDinner(true);
SendOneofSimpleSession sendOneofSimpleSession = SendOneofSimpleSession.fromEvening(evening);

group1Controller.sendOneofSimpleAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofSimpleSession).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
  "startsAt": "startsAtDummy",
  "endsAt": "endsAtDummy",
  "offerDinner": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | `ApiException` |

