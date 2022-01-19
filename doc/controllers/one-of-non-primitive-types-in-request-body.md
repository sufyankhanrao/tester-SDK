# One of Non Primitive Types in Request Body

```java
OneOfNonPrimitiveTypesInRequestBodyController oneOfNonPrimitiveTypesInRequestBodyController = client.getOneOfNonPrimitiveTypesInRequestBodyController();
```

## Class Name

`OneOfNonPrimitiveTypesInRequestBodyController`

## Methods

* [Send Oneof Simple](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-simple)
* [Send Oneof Outer Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-outer-array)
* [Send Oneof Inner Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-inner-array)
* [Send Oneof Array of Arrays](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-array-of-arrays)
* [Send Oneof Inner Mixed Arrays](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-inner-mixed-arrays)
* [Send Oneof Array of Mixed Arrays](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-array-of-mixed-arrays)
* [Send Oneof Outer Map](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-outer-map)
* [Send Oneof Inner Map](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-inner-map)
* [Send Oneof Map of Map](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-map-of-map)
* [Send Oneof Inner Mixed Map](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-inner-mixed-map)
* [Send Oneof Map of Inner Mixed Map](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-map-of-inner-mixed-map)
* [Send Oneof Outer Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-outer-array-of-map-flag)
* [Send Oneof Inner Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-inner-array-of-map-flag)
* [Send Oneof Array of Map Flag of Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-array-of-map-flag-of-array-of-map-flag)
* [Send Oneof Inner Mixed Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-inner-mixed-array-of-map-flag)
* [Send Oneof Array of Map Flag of Mixed Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-array-of-map-flag-of-mixed-array-of-map-flag)
* [Send Oneof Outer Map of Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-outer-map-of-array)
* [Send Oneof Inner Map of Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-inner-map-of-array)
* [Send Oneof Map of Array of Map of Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-map-of-array-of-map-of-array)
* [Send Oneof Inner Mixed Map of Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-inner-mixed-map-of-array)
* [Send Oneof Map of Array of Mixed Map of Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-map-of-array-of-mixed-map-of-array)
* [Send Oneof Array of Maps](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-array-of-maps)
* [Send Oneof Array of Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-array-of-array-of-map-flag)
* [Send Oneof Map of Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-map-of-array)
* [Send Oneof Map of Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-map-of-array-of-map-flag)
* [Send Oneof Array of Map Flag of Array](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-array-of-map-flag-of-array)
* [Send Oneof Array of Map Flag of Map](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-oneof-array-of-map-flag-of-map)
* [Send Multi Level Oneof](/doc/controllers/one-of-non-primitive-types-in-request-body.md#send-multi-level-oneof)


# Send Oneof Simple

```java
CompletableFuture<ServerResponse> sendOneofSimpleAsync(
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
| `session` | [`SendOneofSimpleSession`]($m/SendOneofSimpleSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

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

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofSimpleAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofSimpleSession).thenAccept(result -> {
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


# Send Oneof Outer Array

```java
CompletableFuture<ServerResponse> sendOneofOuterArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendOneofOuterArraySession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendOneofOuterArraySession>`]($m/SendOneofOuterArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofOuterArraySession> session = new LinkedList<>();


Evening session0 = new Evening();
session0.setStartsAt("startsAtDummy");
session0.setEndsAt("endsAtDummy");
session0.setOfferDinner(true);
session.add(SendOneofOuterArraySession.fromEvening(session0));

Morning session1 = new Morning();
session1.setStartsAt("startsAtDummy");
session1.setEndsAt("endsAtDummy");
session1.setOfferTeaBreak(true);
session.add(SendOneofOuterArraySession.fromMorning(session1));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofOuterArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Inner Array

```java
CompletableFuture<ServerResponse> sendOneofInnerArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofInnerArraySession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofInnerArraySession`]($m/SendOneofInnerArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<Evening> evening = new LinkedList<>();

Evening evening0 = new Evening();
evening0.setStartsAt("startsAtDummy");
evening0.setEndsAt("endsAtDummy");
evening0.setOfferDinner(true);
evening.add(evening0);

SendOneofInnerArraySession sendOneofInnerArraySession = SendOneofInnerArraySession.fromEvening(evening);

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofInnerArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofInnerArraySession).thenAccept(result -> {
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


# Send Oneof Array of Arrays

```java
CompletableFuture<ServerResponse> sendOneofArrayOfArraysAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendOneofArrayOfArraysSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendOneofArrayOfArraysSession>`]($m/SendOneofArrayOfArraysSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofArrayOfArraysSession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendOneofArrayOfArraysSession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofArrayOfArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Inner Mixed Arrays

```java
CompletableFuture<ServerResponse> sendOneofInnerMixedArraysAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofInnerMixedArraysSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofInnerMixedArraysSession`]($m/SendOneofInnerMixedArraysSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<Morning> morning = new LinkedList<>();

Morning morning0 = new Morning();
morning0.setStartsAt("startsAtDummy");
morning0.setEndsAt("endsAtDummy");
morning0.setOfferTeaBreak(true);
morning.add(morning0);

SendOneofInnerMixedArraysSession sendOneofInnerMixedArraysSession = SendOneofInnerMixedArraysSession.fromMorning(morning);

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofInnerMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofInnerMixedArraysSession).thenAccept(result -> {
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


# Send Oneof Array of Mixed Arrays

```java
CompletableFuture<ServerResponse> sendOneofArrayOfMixedArraysAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendOneofArrayOfMixedArraysSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendOneofArrayOfMixedArraysSession>`]($m/SendOneofArrayOfMixedArraysSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofArrayOfMixedArraysSession> session = new LinkedList<>();


Morning session0 = new Morning();
session0.setStartsAt("startsAt9");
session0.setEndsAt("endsAt9");
session0.setOfferTeaBreak(true);
session.add(SendOneofArrayOfMixedArraysSession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofArrayOfMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Outer Map

```java
CompletableFuture<ServerResponse> sendOneofOuterMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendOneofOuterMapSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendOneofOuterMapSession>`]($m/SendOneofOuterMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendOneofOuterMapSession> session = new LinkedHashMap<>();





oneOfNonPrimitiveTypesInRequestBodyController.sendOneofOuterMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Inner Map

```java
CompletableFuture<ServerResponse> sendOneofInnerMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofInnerMapSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofInnerMapSession`]($m/SendOneofInnerMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, Evening> evening = new LinkedHashMap<>();

Evening evening0 = new Evening();
evening0.setStartsAt(null);
evening0.setEndsAt(null);
evening0.setOfferDinner(null);
evening.put("",evening0);

Evening evening1 = new Evening();
evening1.setStartsAt(null);
evening1.setEndsAt(null);
evening1.setOfferDinner(null);
evening.put("",evening1);

SendOneofInnerMapSession sendOneofInnerMapSession = SendOneofInnerMapSession.fromEvening(evening);

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofInnerMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofInnerMapSession).thenAccept(result -> {
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


# Send Oneof Map of Map

```java
CompletableFuture<ServerResponse> sendOneofMapOfMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendOneofMapOfMapSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendOneofMapOfMapSession>`]($m/SendOneofMapOfMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendOneofMapOfMapSession> session = new LinkedHashMap<>();




oneOfNonPrimitiveTypesInRequestBodyController.sendOneofMapOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Inner Mixed Map

```java
CompletableFuture<ServerResponse> sendOneofInnerMixedMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofInnerMixedMapSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofInnerMixedMapSession`]($m/SendOneofInnerMixedMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, Morning> morning = new LinkedHashMap<>();

Morning morning0 = new Morning();
morning0.setStartsAt(null);
morning0.setEndsAt(null);
morning0.setOfferTeaBreak(null);
morning.put("",morning0);

Morning morning1 = new Morning();
morning1.setStartsAt(null);
morning1.setEndsAt(null);
morning1.setOfferTeaBreak(null);
morning.put("",morning1);

SendOneofInnerMixedMapSession sendOneofInnerMixedMapSession = SendOneofInnerMixedMapSession.fromMorning(morning);

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofInnerMixedMapSession).thenAccept(result -> {
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


# Send Oneof Map of Inner Mixed Map

```java
CompletableFuture<ServerResponse> sendOneofMapOfInnerMixedMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendOneofMapOfInnerMixedMapSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendOneofMapOfInnerMixedMapSession>`]($m/SendOneofMapOfInnerMixedMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendOneofMapOfInnerMixedMapSession> session = new LinkedHashMap<>();




oneOfNonPrimitiveTypesInRequestBodyController.sendOneofMapOfInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Outer Array of Map Flag

```java
CompletableFuture<ServerResponse> sendOneofOuterArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendOneofOuterArrayOfMapFlagSession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendOneofOuterArrayOfMapFlagSession>>`]($m/SendOneofOuterArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofOuterArrayOfMapFlagSession> session = new LinkedList<>();


Morning session0 = new Morning();
session0.setStartsAt(null);
session0.setEndsAt(null);
session0.setOfferTeaBreak(null);
session.add(SendOneofOuterArrayOfMapFlagSession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofOuterArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Inner Array of Map Flag

```java
CompletableFuture<ServerResponse> sendOneofInnerArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofInnerArrayOfMapFlagSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofInnerArrayOfMapFlagSession`]($m/SendOneofInnerArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<Morning> morning = new LinkedList<>();

Morning morning0 = new Morning();
morning0.setStartsAt(null);
morning0.setEndsAt(null);
morning0.setOfferTeaBreak(null);
morning.add(morning0);

Morning morning1 = new Morning();
morning1.setStartsAt(null);
morning1.setEndsAt(null);
morning1.setOfferTeaBreak(null);
morning.add(morning1);

SendOneofInnerArrayOfMapFlagSession sendOneofInnerArrayOfMapFlagSession = SendOneofInnerArrayOfMapFlagSession.fromMorning(morning);

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofInnerArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofInnerArrayOfMapFlagSession).thenAccept(result -> {
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


# Send Oneof Array of Map Flag of Array of Map Flag

```java
CompletableFuture<ServerResponse> sendOneofArrayOfMapFlagOfArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendOneofArrayOfMapFlagOfArrayOfMapFlagSession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendOneofArrayOfMapFlagOfArrayOfMapFlagSession>>`]($m/SendOneofArrayOfMapFlagOfArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofArrayOfMapFlagOfArrayOfMapFlagSession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendOneofArrayOfMapFlagOfArrayOfMapFlagSession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofArrayOfMapFlagOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Inner Mixed Array of Map Flag

```java
CompletableFuture<ServerResponse> sendOneofInnerMixedArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofInnerMixedArrayOfMapFlagSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofInnerMixedArrayOfMapFlagSession`]($m/SendOneofInnerMixedArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<Morning> morning = new LinkedList<>();

Morning morning0 = new Morning();
morning0.setStartsAt(null);
morning0.setEndsAt(null);
morning0.setOfferTeaBreak(null);
morning.add(morning0);

Morning morning1 = new Morning();
morning1.setStartsAt(null);
morning1.setEndsAt(null);
morning1.setOfferTeaBreak(null);
morning.add(morning1);

SendOneofInnerMixedArrayOfMapFlagSession sendOneofInnerMixedArrayOfMapFlagSession = SendOneofInnerMixedArrayOfMapFlagSession.fromMorning(morning);

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofInnerMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofInnerMixedArrayOfMapFlagSession).thenAccept(result -> {
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


# Send Oneof Array of Map Flag of Mixed Array of Map Flag

```java
CompletableFuture<ServerResponse> sendOneofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendOneofArrayOfMapFlagOfMixedArrayOfMapFlagSession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendOneofArrayOfMapFlagOfMixedArrayOfMapFlagSession>>`]($m/SendOneofArrayOfMapFlagOfMixedArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofArrayOfMapFlagOfMixedArrayOfMapFlagSession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendOneofArrayOfMapFlagOfMixedArrayOfMapFlagSession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Outer Map of Array

```java
CompletableFuture<ServerResponse> sendOneofOuterMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, List<SendOneofOuterMapOfArraySession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, List<SendOneofOuterMapOfArraySession>>`]($m/SendOneofOuterMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofOuterMapOfArraySession> session = new LinkedList<>();


Morning session0 = new Morning();
session0.setStartsAt(null);
session0.setEndsAt(null);
session0.setOfferTeaBreak(null);
session.add(SendOneofOuterMapOfArraySession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofOuterMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Inner Map of Array

```java
CompletableFuture<ServerResponse> sendOneofInnerMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofInnerMapOfArraySession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofInnerMapOfArraySession`]($m/SendOneofInnerMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<Morning> morning = new LinkedList<>();

Morning morning0 = new Morning();
morning0.setStartsAt(null);
morning0.setEndsAt(null);
morning0.setOfferTeaBreak(null);
morning.add(morning0);

Morning morning1 = new Morning();
morning1.setStartsAt(null);
morning1.setEndsAt(null);
morning1.setOfferTeaBreak(null);
morning.add(morning1);

SendOneofInnerMapOfArraySession sendOneofInnerMapOfArraySession = SendOneofInnerMapOfArraySession.fromMorning(morning);

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofInnerMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofInnerMapOfArraySession).thenAccept(result -> {
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


# Send Oneof Map of Array of Map of Array

```java
CompletableFuture<ServerResponse> sendOneofMapOfArrayOfMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, List<SendOneofMapOfArrayOfMapOfArraySession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, List<SendOneofMapOfArrayOfMapOfArraySession>>`]($m/SendOneofMapOfArrayOfMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofMapOfArrayOfMapOfArraySession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendOneofMapOfArrayOfMapOfArraySession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofMapOfArrayOfMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Inner Mixed Map of Array

```java
CompletableFuture<ServerResponse> sendOneofInnerMixedMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendOneofInnerMixedMapOfArraySession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendOneofInnerMixedMapOfArraySession`]($m/SendOneofInnerMixedMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<Morning> morning = new LinkedList<>();

Morning morning0 = new Morning();
morning0.setStartsAt(null);
morning0.setEndsAt(null);
morning0.setOfferTeaBreak(null);
morning.add(morning0);

Morning morning1 = new Morning();
morning1.setStartsAt(null);
morning1.setEndsAt(null);
morning1.setOfferTeaBreak(null);
morning.add(morning1);

SendOneofInnerMixedMapOfArraySession sendOneofInnerMixedMapOfArraySession = SendOneofInnerMixedMapOfArraySession.fromMorning(morning);

oneOfNonPrimitiveTypesInRequestBodyController.sendOneofInnerMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendOneofInnerMixedMapOfArraySession).thenAccept(result -> {
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


# Send Oneof Map of Array of Mixed Map of Array

```java
CompletableFuture<ServerResponse> sendOneofMapOfArrayOfMixedMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, List<SendOneofMapOfArrayOfMixedMapOfArraySession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, List<SendOneofMapOfArrayOfMixedMapOfArraySession>>`]($m/SendOneofMapOfArrayOfMixedMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofMapOfArrayOfMixedMapOfArraySession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendOneofMapOfArrayOfMixedMapOfArraySession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofMapOfArrayOfMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Array of Maps

```java
CompletableFuture<ServerResponse> sendOneofArrayOfMapsAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendOneofArrayOfMapsSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendOneofArrayOfMapsSession>`]($m/SendOneofArrayOfMapsSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofArrayOfMapsSession> session = new LinkedList<>();


Map<String, Morning> morning = new LinkedHashMap<>();

session.add(SendOneofArrayOfMapsSession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofArrayOfMapsAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Array of Array of Map Flag

```java
CompletableFuture<ServerResponse> sendOneofArrayOfArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendOneofArrayOfArrayOfMapFlagSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendOneofArrayOfArrayOfMapFlagSession>`]($m/SendOneofArrayOfArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofArrayOfArrayOfMapFlagSession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendOneofArrayOfArrayOfMapFlagSession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofArrayOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Map of Array

```java
CompletableFuture<ServerResponse> sendOneofMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendOneofMapOfArraySession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendOneofMapOfArraySession>`]($m/SendOneofMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendOneofMapOfArraySession> session = new LinkedHashMap<>();




oneOfNonPrimitiveTypesInRequestBodyController.sendOneofMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Map of Array of Map Flag

```java
CompletableFuture<ServerResponse> sendOneofMapOfArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendOneofMapOfArrayOfMapFlagSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendOneofMapOfArrayOfMapFlagSession>`]($m/SendOneofMapOfArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendOneofMapOfArrayOfMapFlagSession> session = new LinkedHashMap<>();




oneOfNonPrimitiveTypesInRequestBodyController.sendOneofMapOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Array of Map Flag of Array

```java
CompletableFuture<ServerResponse> sendOneofArrayOfMapFlagOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendOneofArrayOfMapFlagOfArraySession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendOneofArrayOfMapFlagOfArraySession>>`]($m/SendOneofArrayOfMapFlagOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofArrayOfMapFlagOfArraySession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendOneofArrayOfMapFlagOfArraySession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofArrayOfMapFlagOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Oneof Array of Map Flag of Map

```java
CompletableFuture<ServerResponse> sendOneofArrayOfMapFlagOfMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendOneofArrayOfMapFlagOfMapSession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendOneofArrayOfMapFlagOfMapSession>>`]($m/SendOneofArrayOfMapFlagOfMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendOneofArrayOfMapFlagOfMapSession> session = new LinkedList<>();


Map<String, Morning> morning = new LinkedHashMap<>();

session.add(SendOneofArrayOfMapFlagOfMapSession.fromMorning(session0));


oneOfNonPrimitiveTypesInRequestBodyController.sendOneofArrayOfMapFlagOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Multi Level Oneof

```java
CompletableFuture<ServerResponse> sendMultiLevelOneofAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendMultiLevelOneofSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendMultiLevelOneofSession`]($m/SendMultiLevelOneofSession) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Evening evening = new Evening();
evening.setStartsAt("startsAtDummy");
evening.setEndsAt("endsAtDummy");
evening.setOfferDinner(true);
SendMultiLevelOneofSessionCase1 sendMultiLevelOneofSessionCase1 = SendMultiLevelOneofSessionCase1.fromEvening2(evening);
SendMultiLevelOneofSession sendMultiLevelOneofSession = SendMultiLevelOneofSession.fromCase1(sendMultiLevelOneofSessionCase1);

oneOfNonPrimitiveTypesInRequestBodyController.sendMultiLevelOneofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendMultiLevelOneofSession).thenAccept(result -> {
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

