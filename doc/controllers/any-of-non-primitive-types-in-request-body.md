# Any of Non Primitive Types in Request Body

```java
AnyOfNonPrimitiveTypesInRequestBodyController anyOfNonPrimitiveTypesInRequestBodyController = client.getAnyOfNonPrimitiveTypesInRequestBodyController();
```

## Class Name

`AnyOfNonPrimitiveTypesInRequestBodyController`

## Methods

* [Send Anyof Simple](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-simple)
* [Send Anyof Outer Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-outer-array)
* [Send Anyof Inner Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-inner-array)
* [Send Anyof Array of Arrays](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-array-of-arrays)
* [Send Anyof Inner Mixed Arrays](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-inner-mixed-arrays)
* [Send Anyof Array of Mixed Arrays](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-array-of-mixed-arrays)
* [Send Anyof Outer Map](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-outer-map)
* [Send Anyof Inner Map](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-inner-map)
* [Send Anyof Map of Map](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-map-of-map)
* [Send Anyof Inner Mixed Map](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-inner-mixed-map)
* [Send Anyof Map of Inner Mixed Map](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-map-of-inner-mixed-map)
* [Send Anyof Outer Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-outer-array-of-map-flag)
* [Send Anyof Inner Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-inner-array-of-map-flag)
* [Send Anyof Array of Map Flag of Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-array-of-map-flag-of-array-of-map-flag)
* [Send Anyof Inner Mixed Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-inner-mixed-array-of-map-flag)
* [Send Anyof Array of Map Flag of Mixed Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-array-of-map-flag-of-mixed-array-of-map-flag)
* [Send Anyof Outer Map of Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-outer-map-of-array)
* [Send Anyof Inner Map of Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-inner-map-of-array)
* [Send Anyof Map of Array of Map of Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-map-of-array-of-map-of-array)
* [Send Anyof Inner Mixed Map of Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-inner-mixed-map-of-array)
* [Send Anyof Map of Array of Mixed Map of Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-map-of-array-of-mixed-map-of-array)
* [Send Anyof Array of Maps](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-array-of-maps)
* [Send Anyof Array of Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-array-of-array-of-map-flag)
* [Send Anyof Map of Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-map-of-array)
* [Send Anyof Map of Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-map-of-array-of-map-flag)
* [Send Anyof Array of Map Flag of Array](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-array-of-map-flag-of-array)
* [Send Anyof Array of Map Flag of Map](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-anyof-array-of-map-flag-of-map)
* [Send Multi Level Anyof](/doc/controllers/any-of-non-primitive-types-in-request-body.md#send-multi-level-anyof)


# Send Anyof Simple

```java
CompletableFuture<ServerResponse> sendAnyofSimpleAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofSimpleSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofSimpleSession`]($m/SendAnyofSimpleSession) | Body, Required | Course session |

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
SendAnyofSimpleSession sendAnyofSimpleSession = SendAnyofSimpleSession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofSimpleAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofSimpleSession).thenAccept(result -> {
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


# Send Anyof Outer Array

```java
CompletableFuture<ServerResponse> sendAnyofOuterArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendAnyofOuterArraySession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendAnyofOuterArraySession>`]($m/SendAnyofOuterArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofOuterArraySession> session = new LinkedList<>();


Morning session0 = new Morning();
session0.setStartsAt("startsAt9");
session0.setEndsAt("endsAt9");
session0.setOfferTeaBreak(true);
session.add(SendAnyofOuterArraySession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofOuterArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Inner Array

```java
CompletableFuture<ServerResponse> sendAnyofInnerArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofInnerArraySession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofInnerArraySession`]($m/SendAnyofInnerArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<Morning> morning = new LinkedList<>();

Morning morning0 = new Morning();
morning0.setStartsAt("startsAt8");
morning0.setEndsAt("endsAt0");
morning0.setOfferTeaBreak(false);
morning.add(morning0);

Morning morning1 = new Morning();
morning1.setStartsAt("startsAt7");
morning1.setEndsAt("endsAt1");
morning1.setOfferTeaBreak(true);
morning.add(morning1);

SendAnyofInnerArraySession sendAnyofInnerArraySession = SendAnyofInnerArraySession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofInnerArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofInnerArraySession).thenAccept(result -> {
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


# Send Anyof Array of Arrays

```java
CompletableFuture<ServerResponse> sendAnyofArrayOfArraysAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendAnyofArrayOfArraysSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendAnyofArrayOfArraysSession>`]($m/SendAnyofArrayOfArraysSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofArrayOfArraysSession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendAnyofArrayOfArraysSession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofArrayOfArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Inner Mixed Arrays

```java
CompletableFuture<ServerResponse> sendAnyofInnerMixedArraysAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofInnerMixedArraysSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofInnerMixedArraysSession`]($m/SendAnyofInnerMixedArraysSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<Morning> morning = new LinkedList<>();

Morning morning0 = new Morning();
morning0.setStartsAt("startsAt8");
morning0.setEndsAt("endsAt0");
morning0.setOfferTeaBreak(false);
morning.add(morning0);

Morning morning1 = new Morning();
morning1.setStartsAt("startsAt7");
morning1.setEndsAt("endsAt1");
morning1.setOfferTeaBreak(true);
morning.add(morning1);

SendAnyofInnerMixedArraysSession sendAnyofInnerMixedArraysSession = SendAnyofInnerMixedArraysSession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofInnerMixedArraysSession).thenAccept(result -> {
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


# Send Anyof Array of Mixed Arrays

```java
CompletableFuture<ServerResponse> sendAnyofArrayOfMixedArraysAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendAnyofArrayOfMixedArraysSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendAnyofArrayOfMixedArraysSession>`]($m/SendAnyofArrayOfMixedArraysSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofArrayOfMixedArraysSession> session = new LinkedList<>();


Morning session0 = new Morning();
session0.setStartsAt("startsAt9");
session0.setEndsAt("endsAt9");
session0.setOfferTeaBreak(true);
session.add(SendAnyofArrayOfMixedArraysSession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Outer Map

```java
CompletableFuture<ServerResponse> sendAnyofOuterMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendAnyofOuterMapSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendAnyofOuterMapSession>`]($m/SendAnyofOuterMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendAnyofOuterMapSession> session = new LinkedHashMap<>();




anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofOuterMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Inner Map

```java
CompletableFuture<ServerResponse> sendAnyofInnerMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofInnerMapSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofInnerMapSession`]($m/SendAnyofInnerMapSession) | Body, Required | Course session |

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

SendAnyofInnerMapSession sendAnyofInnerMapSession = SendAnyofInnerMapSession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofInnerMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofInnerMapSession).thenAccept(result -> {
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


# Send Anyof Map of Map

```java
CompletableFuture<ServerResponse> sendAnyofMapOfMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendAnyofMapOfMapSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendAnyofMapOfMapSession>`]($m/SendAnyofMapOfMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendAnyofMapOfMapSession> session = new LinkedHashMap<>();




anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofMapOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Inner Mixed Map

```java
CompletableFuture<ServerResponse> sendAnyofInnerMixedMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofInnerMixedMapSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofInnerMixedMapSession`]($m/SendAnyofInnerMixedMapSession) | Body, Required | Course session |

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

SendAnyofInnerMixedMapSession sendAnyofInnerMixedMapSession = SendAnyofInnerMixedMapSession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofInnerMixedMapSession).thenAccept(result -> {
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


# Send Anyof Map of Inner Mixed Map

```java
CompletableFuture<ServerResponse> sendAnyofMapOfInnerMixedMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendAnyofMapOfInnerMixedMapSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendAnyofMapOfInnerMixedMapSession>`]($m/SendAnyofMapOfInnerMixedMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendAnyofMapOfInnerMixedMapSession> session = new LinkedHashMap<>();




anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofMapOfInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Outer Array of Map Flag

```java
CompletableFuture<ServerResponse> sendAnyofOuterArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendAnyofOuterArrayOfMapFlagSession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendAnyofOuterArrayOfMapFlagSession>>`]($m/SendAnyofOuterArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofOuterArrayOfMapFlagSession> session = new LinkedList<>();


Morning session0 = new Morning();
session0.setStartsAt(null);
session0.setEndsAt(null);
session0.setOfferTeaBreak(null);
session.add(SendAnyofOuterArrayOfMapFlagSession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofOuterArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Inner Array of Map Flag

```java
CompletableFuture<ServerResponse> sendAnyofInnerArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofInnerArrayOfMapFlagSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofInnerArrayOfMapFlagSession`]($m/SendAnyofInnerArrayOfMapFlagSession) | Body, Required | Course session |

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

SendAnyofInnerArrayOfMapFlagSession sendAnyofInnerArrayOfMapFlagSession = SendAnyofInnerArrayOfMapFlagSession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofInnerArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofInnerArrayOfMapFlagSession).thenAccept(result -> {
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


# Send Anyof Array of Map Flag of Array of Map Flag

```java
CompletableFuture<ServerResponse> sendAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendAnyofArrayOfMapFlagOfArrayOfMapFlagSession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendAnyofArrayOfMapFlagOfArrayOfMapFlagSession>>`]($m/SendAnyofArrayOfMapFlagOfArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofArrayOfMapFlagOfArrayOfMapFlagSession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendAnyofArrayOfMapFlagOfArrayOfMapFlagSession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Inner Mixed Array of Map Flag

```java
CompletableFuture<ServerResponse> sendAnyofInnerMixedArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofInnerMixedArrayOfMapFlagSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofInnerMixedArrayOfMapFlagSession`]($m/SendAnyofInnerMixedArrayOfMapFlagSession) | Body, Required | Course session |

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

SendAnyofInnerMixedArrayOfMapFlagSession sendAnyofInnerMixedArrayOfMapFlagSession = SendAnyofInnerMixedArrayOfMapFlagSession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofInnerMixedArrayOfMapFlagSession).thenAccept(result -> {
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


# Send Anyof Array of Map Flag of Mixed Array of Map Flag

```java
CompletableFuture<ServerResponse> sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagSession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagSession>>`]($m/SendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagSession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagSession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Outer Map of Array

```java
CompletableFuture<ServerResponse> sendAnyofOuterMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, List<SendAnyofOuterMapOfArraySession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, List<SendAnyofOuterMapOfArraySession>>`]($m/SendAnyofOuterMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofOuterMapOfArraySession> session = new LinkedList<>();


Morning session0 = new Morning();
session0.setStartsAt(null);
session0.setEndsAt(null);
session0.setOfferTeaBreak(null);
session.add(SendAnyofOuterMapOfArraySession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofOuterMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Inner Map of Array

```java
CompletableFuture<ServerResponse> sendAnyofInnerMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofInnerMapOfArraySession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofInnerMapOfArraySession`]($m/SendAnyofInnerMapOfArraySession) | Body, Required | Course session |

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

SendAnyofInnerMapOfArraySession sendAnyofInnerMapOfArraySession = SendAnyofInnerMapOfArraySession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofInnerMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofInnerMapOfArraySession).thenAccept(result -> {
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


# Send Anyof Map of Array of Map of Array

```java
CompletableFuture<ServerResponse> sendAnyofMapOfArrayOfMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, List<SendAnyofMapOfArrayOfMapOfArraySession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, List<SendAnyofMapOfArrayOfMapOfArraySession>>`]($m/SendAnyofMapOfArrayOfMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofMapOfArrayOfMapOfArraySession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendAnyofMapOfArrayOfMapOfArraySession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Inner Mixed Map of Array

```java
CompletableFuture<ServerResponse> sendAnyofInnerMixedMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendAnyofInnerMixedMapOfArraySession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendAnyofInnerMixedMapOfArraySession`]($m/SendAnyofInnerMixedMapOfArraySession) | Body, Required | Course session |

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

SendAnyofInnerMixedMapOfArraySession sendAnyofInnerMixedMapOfArraySession = SendAnyofInnerMixedMapOfArraySession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendAnyofInnerMixedMapOfArraySession).thenAccept(result -> {
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


# Send Anyof Map of Array of Mixed Map of Array

```java
CompletableFuture<ServerResponse> sendAnyofMapOfArrayOfMixedMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, List<SendAnyofMapOfArrayOfMixedMapOfArraySession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, List<SendAnyofMapOfArrayOfMixedMapOfArraySession>>`]($m/SendAnyofMapOfArrayOfMixedMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofMapOfArrayOfMixedMapOfArraySession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendAnyofMapOfArrayOfMixedMapOfArraySession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Array of Maps

```java
CompletableFuture<ServerResponse> sendAnyofArrayOfMapsAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendAnyofArrayOfMapsSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendAnyofArrayOfMapsSession>`]($m/SendAnyofArrayOfMapsSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofArrayOfMapsSession> session = new LinkedList<>();


Map<String, Morning> morning = new LinkedHashMap<>();

session.add(SendAnyofArrayOfMapsSession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapsAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Array of Array of Map Flag

```java
CompletableFuture<ServerResponse> sendAnyofArrayOfArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<SendAnyofArrayOfArrayOfMapFlagSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<SendAnyofArrayOfArrayOfMapFlagSession>`]($m/SendAnyofArrayOfArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofArrayOfArrayOfMapFlagSession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendAnyofArrayOfArrayOfMapFlagSession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofArrayOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Map of Array

```java
CompletableFuture<ServerResponse> sendAnyofMapOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendAnyofMapOfArraySession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendAnyofMapOfArraySession>`]($m/SendAnyofMapOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendAnyofMapOfArraySession> session = new LinkedHashMap<>();




anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Map of Array of Map Flag

```java
CompletableFuture<ServerResponse> sendAnyofMapOfArrayOfMapFlagAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final Map<String, SendAnyofMapOfArrayOfMapFlagSession> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`Map<String, SendAnyofMapOfArrayOfMapFlagSession>`]($m/SendAnyofMapOfArrayOfMapFlagSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
Map<String, SendAnyofMapOfArrayOfMapFlagSession> session = new LinkedHashMap<>();




anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Array of Map Flag of Array

```java
CompletableFuture<ServerResponse> sendAnyofArrayOfMapFlagOfArrayAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendAnyofArrayOfMapFlagOfArraySession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendAnyofArrayOfMapFlagOfArraySession>>`]($m/SendAnyofArrayOfMapFlagOfArraySession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofArrayOfMapFlagOfArraySession> session = new LinkedList<>();


List<Morning> morning = new LinkedList<>();

session.add(SendAnyofArrayOfMapFlagOfArraySession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Anyof Array of Map Flag of Map

```java
CompletableFuture<ServerResponse> sendAnyofArrayOfMapFlagOfMapAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final List<Map<String, SendAnyofArrayOfMapFlagOfMapSession>> session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`List<Map<String, SendAnyofArrayOfMapFlagOfMapSession>>`]($m/SendAnyofArrayOfMapFlagOfMapSession) | Body, Required | Course session |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
List<SendAnyofArrayOfMapFlagOfMapSession> session = new LinkedList<>();


Map<String, Morning> morning = new LinkedHashMap<>();

session.add(SendAnyofArrayOfMapFlagOfMapSession.fromMorning(session0));


anyOfNonPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session).thenAccept(result -> {
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


# Send Multi Level Anyof

```java
CompletableFuture<ServerResponse> sendMultiLevelAnyofAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SendMultiLevelAnyofSession session)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `session` | [`SendMultiLevelAnyofSession`]($m/SendMultiLevelAnyofSession) | Body, Required | - |

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
SendMultiLevelAnyofSession sendMultiLevelAnyofSession = SendMultiLevelAnyofSession.fromMorning(morning);

anyOfNonPrimitiveTypesInRequestBodyController.sendMultiLevelAnyofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, sendMultiLevelAnyofSession).thenAccept(result -> {
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

