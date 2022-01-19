# Group 2

```java
Group2Controller group2Controller = client.getGroup2Controller();
```

## Class Name

`Group2Controller`


# Send Oneof Simple

```java
CompletableFuture<Object> sendOneofSimpleAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofSimpleSession2 session)
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
SendOneofSimpleSession2 sendOneofSimpleSession2 = SendOneofSimpleSession2.fromEvening(evening);

group2Controller.sendOneofSimpleAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofSimpleSession2).thenAccept(result -> {
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

