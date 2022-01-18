# Any of Primitive Types in Request Body

```java
AnyOfPrimitiveTypesInRequestBodyController anyOfPrimitiveTypesInRequestBodyController = client.getAnyOfPrimitiveTypesInRequestBodyController();
```

## Class Name

`AnyOfPrimitiveTypesInRequestBodyController`

## Methods

* [Send Anyof Simple](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-simple)
* [Send Anyof Outer Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-outer-array)
* [Send Anyof Inner Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-inner-array)
* [Send Anyof Array of Arrays](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-array-of-arrays)
* [Send Anyof Inner Mixed Arrays](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-inner-mixed-arrays)
* [Send Anyof Array of Mixed Arrays](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-array-of-mixed-arrays)
* [Send Anyof Outer Map](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-outer-map)
* [Send Anyof Inner Map](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-inner-map)
* [Send Anyof Map of Map](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-map-of-map)
* [Send Anyof Inner Mixed Map](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-inner-mixed-map)
* [Send Anyof Map of Inner Mixed Map](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-map-of-inner-mixed-map)
* [Send Anyof Outer Array of Map Flag](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-outer-array-of-map-flag)
* [Send Anyof Inner Array of Map Flag](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-inner-array-of-map-flag)
* [Send Anyof Array of Map Flag of Array of Map Flag](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-array-of-map-flag-of-array-of-map-flag)
* [Send Anyof Inner Mixed Array of Map Flag](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-inner-mixed-array-of-map-flag)
* [Send Anyof Array of Map Flag of Mixed Array of Map Flag](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-array-of-map-flag-of-mixed-array-of-map-flag)
* [Send Anyof Outer Map of Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-outer-map-of-array)
* [Send Anyof Inner Map of Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-inner-map-of-array)
* [Send Anyof Map of Array of Map of Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-map-of-array-of-map-of-array)
* [Send Anyof Inner Mixed Map of Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-inner-mixed-map-of-array)
* [Send Anyof Map of Array of Mixed Map of Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-map-of-array-of-mixed-map-of-array)
* [Send Anyof Array of Maps](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-array-of-maps)
* [Send Anyof Array of Array of Map Flag](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-array-of-array-of-map-flag)
* [Send Anyof Map of Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-map-of-array)
* [Send Anyof Map of Array of Map Flag](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-map-of-array-of-map-flag)
* [Send Anyof Array of Map Flag of Array](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-array-of-map-flag-of-array)
* [Send Anyof Array of Map Flag of Map](/doc/controllers/any-of-primitive-types-in-request-body.md#send-anyof-array-of-map-flag-of-map)
* [Send Multi Level Anyof](/doc/controllers/any-of-primitive-types-in-request-body.md#send-multi-level-anyof)


# Send Anyof Simple

```java
CompletableFuture<ServerResponse> sendAnyofSimpleAsync(
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator,
    final SimpleCase simpleCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `simpleCase` | [`SimpleCase`](/doc/models/simple-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
SimpleCase simpleCase = new SimpleCase();
simpleCase.setValue(SimpleCaseValue2.fromPrecision(23.42));

anyOfPrimitiveTypesInRequestBodyController.sendAnyofSimpleAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, simpleCase).thenAccept(result -> {
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
    final OuterArrayCase outerArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `outerArrayCase` | [`OuterArrayCase`](/doc/models/outer-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
OuterArrayCase outerArrayCase = new OuterArrayCase();
List<OuterArrayCaseValue2> outerArrayCaseValue2 = new LinkedList<>();


double outerArrayCaseValue20 = 190.1;
outerArrayCaseValue2.add(OuterArrayCaseValue2.fromPrecision(outerArrayCaseValue20));

double outerArrayCaseValue21 = 190.11;
outerArrayCaseValue2.add(OuterArrayCaseValue2.fromPrecision(outerArrayCaseValue21));

outerArrayCase.setValue(outerArrayCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofOuterArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, outerArrayCase).thenAccept(result -> {
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
    final InnerArrayCase innerArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `innerArrayCase` | [`InnerArrayCase`](/doc/models/inner-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
InnerArrayCase innerArrayCase = new InnerArrayCase();
List<Double> precision = new LinkedList<>();
precision.add(210);
innerArrayCase.setValue(InnerArrayCaseValue2.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, innerArrayCase).thenAccept(result -> {
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
    final ArrayOfArraysCase arrayOfArraysCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `arrayOfArraysCase` | [`ArrayOfArraysCase`](/doc/models/array-of-arrays-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
ArrayOfArraysCase arrayOfArraysCase = new ArrayOfArraysCase();
List<ArrayOfArraysCaseValue2> arrayOfArraysCaseValue2 = new LinkedList<>();


List<Double> precision = new LinkedList<>();
precision.add(220.6);
arrayOfArraysCaseValue2.add(ArrayOfArraysCaseValue2.fromPrecision(arrayOfArraysCaseValue20));

List<Double> precision = new LinkedList<>();
precision.add(220.61);
precision.add(220.62);
arrayOfArraysCaseValue2.add(ArrayOfArraysCaseValue2.fromPrecision(arrayOfArraysCaseValue21));

arrayOfArraysCase.setValue(arrayOfArraysCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, arrayOfArraysCase).thenAccept(result -> {
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
    final InnerMixedArrayCase innerMixedArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `innerMixedArrayCase` | [`InnerMixedArrayCase`](/doc/models/inner-mixed-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
InnerMixedArrayCase innerMixedArrayCase = new InnerMixedArrayCase();
List<Double> precision = new LinkedList<>();
precision.add(253.2);
innerMixedArrayCase.setValue(InnerMixedArrayCaseValue2.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, innerMixedArrayCase).thenAccept(result -> {
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
    final ArrayOfMixedArrayCase arrayOfMixedArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `arrayOfMixedArrayCase` | [`ArrayOfMixedArrayCase`](/doc/models/array-of-mixed-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
ArrayOfMixedArrayCase arrayOfMixedArrayCase = new ArrayOfMixedArrayCase();
List<ArrayOfMixedArrayCaseValue2> arrayOfMixedArrayCaseValue2 = new LinkedList<>();


double arrayOfMixedArrayCaseValue20 = 29.02;
arrayOfMixedArrayCaseValue2.add(ArrayOfMixedArrayCaseValue2.fromPrecision(arrayOfMixedArrayCaseValue20));

double arrayOfMixedArrayCaseValue21 = 29.03;
arrayOfMixedArrayCaseValue2.add(ArrayOfMixedArrayCaseValue2.fromPrecision(arrayOfMixedArrayCaseValue21));

double arrayOfMixedArrayCaseValue22 = 29.04;
arrayOfMixedArrayCaseValue2.add(ArrayOfMixedArrayCaseValue2.fromPrecision(arrayOfMixedArrayCaseValue22));

arrayOfMixedArrayCase.setValue(arrayOfMixedArrayCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, arrayOfMixedArrayCase).thenAccept(result -> {
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
    final OuterMapCase outerMapCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `outerMapCase` | [`OuterMapCase`](/doc/models/outer-map-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
OuterMapCase outerMapCase = new OuterMapCase();
Map<String, OuterMapCaseValue2> outerMapCaseValue2 = new LinkedHashMap<>();



outerMapCase.setValue(outerMapCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofOuterMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, outerMapCase).thenAccept(result -> {
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
    final InnerMapCase innerMapCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `innerMapCase` | [`InnerMapCase`](/doc/models/inner-map-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
InnerMapCase innerMapCase = new InnerMapCase();
Map<String, Double> precision = new LinkedHashMap<>();
precision.put("key0", 215.2);
precision.put("key1", 215.21);
innerMapCase.setValue(InnerMapCaseValue2.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, innerMapCase).thenAccept(result -> {
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
    final MapOfMapsCase mapOfMapsCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `mapOfMapsCase` | [`MapOfMapsCase`](/doc/models/map-of-maps-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MapOfMapsCase mapOfMapsCase = new MapOfMapsCase();
Map<String, MapOfMapsCaseValue2> mapOfMapsCaseValue2 = new LinkedHashMap<>();




mapOfMapsCase.setValue(mapOfMapsCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, mapOfMapsCase).thenAccept(result -> {
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
    final InnerMixedMapCase innerMixedMapCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `innerMixedMapCase` | [`InnerMixedMapCase`](/doc/models/inner-mixed-map-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
InnerMixedMapCase innerMixedMapCase = new InnerMixedMapCase();
Map<String, Double> precision = new LinkedHashMap<>();
precision.put("key0", 47.28);
precision.put("key1", 47.29);
precision.put("key2", 47.3);
innerMixedMapCase.setValue(InnerMixedMapCaseValue2.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, innerMixedMapCase).thenAccept(result -> {
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
    final MapOfMixedMapCase mapOfMixedMapCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `mapOfMixedMapCase` | [`MapOfMixedMapCase`](/doc/models/map-of-mixed-map-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MapOfMixedMapCase mapOfMixedMapCase = new MapOfMixedMapCase();
Map<String, MapOfMixedMapCaseValue2> mapOfMixedMapCaseValue2 = new LinkedHashMap<>();



mapOfMixedMapCase.setValue(mapOfMixedMapCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, mapOfMixedMapCase).thenAccept(result -> {
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
    final OuterArrayOfMapFlagCase outerArrayOfMapFlagCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `outerArrayOfMapFlagCase` | [`OuterArrayOfMapFlagCase`](/doc/models/outer-array-of-map-flag-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
OuterArrayOfMapFlagCase outerArrayOfMapFlagCase = new OuterArrayOfMapFlagCase();
List<OuterArrayOfMapFlagCaseValue2> outerArrayOfMapFlagCaseValue2 = new LinkedList<>();


double outerArrayOfMapFlagCaseValue20 = null;
outerArrayOfMapFlagCaseValue2.add(OuterArrayOfMapFlagCaseValue2.fromPrecision(outerArrayOfMapFlagCaseValue20));

double outerArrayOfMapFlagCaseValue21 = null;
outerArrayOfMapFlagCaseValue2.add(OuterArrayOfMapFlagCaseValue2.fromPrecision(outerArrayOfMapFlagCaseValue21));

outerArrayOfMapFlagCase.setValue(outerArrayOfMapFlagCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofOuterArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, outerArrayOfMapFlagCase).thenAccept(result -> {
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
    final InnerArrayOfMapFlagCase innerArrayOfMapFlagCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `innerArrayOfMapFlagCase` | [`InnerArrayOfMapFlagCase`](/doc/models/inner-array-of-map-flag-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
InnerArrayOfMapFlagCase innerArrayOfMapFlagCase = new InnerArrayOfMapFlagCase();
List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 213.38][key1, 213.39]);
precision.add([key0, 213.39][key1, 213.4][key2, 213.41]);
precision.add([key0, 213.4]);
innerArrayOfMapFlagCase.setValue(InnerArrayOfMapFlagCaseValue2.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, innerArrayOfMapFlagCase).thenAccept(result -> {
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
    final ArrayOfMapFlagOfInnerArrayOfMapFlagCase arrayOfMapFlagOfInnerArrayOfMapFlagCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `arrayOfMapFlagOfInnerArrayOfMapFlagCase` | [`ArrayOfMapFlagOfInnerArrayOfMapFlagCase`](/doc/models/array-of-map-flag-of-inner-array-of-map-flag-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
ArrayOfMapFlagOfInnerArrayOfMapFlagCase arrayOfMapFlagOfInnerArrayOfMapFlagCase = new ArrayOfMapFlagOfInnerArrayOfMapFlagCase();
List<ArrayOfMapFlagOfInnerArrayOfMapFlagCaseValue2> arrayOfMapFlagOfInnerArrayOfMapFlagCaseValue2 = new LinkedList<>();


List<Map<String, Double>> precision = new LinkedList<>();
arrayOfMapFlagOfInnerArrayOfMapFlagCaseValue2.add(ArrayOfMapFlagOfInnerArrayOfMapFlagCaseValue2.fromPrecision(arrayOfMapFlagOfInnerArrayOfMapFlagCaseValue20));

arrayOfMapFlagOfInnerArrayOfMapFlagCase.setValue(arrayOfMapFlagOfInnerArrayOfMapFlagCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, arrayOfMapFlagOfInnerArrayOfMapFlagCase).thenAccept(result -> {
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
    final MixedArrayOfMapFlagCase mixedArrayOfMapFlagCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `mixedArrayOfMapFlagCase` | [`MixedArrayOfMapFlagCase`](/doc/models/mixed-array-of-map-flag-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MixedArrayOfMapFlagCase mixedArrayOfMapFlagCase = new MixedArrayOfMapFlagCase();
List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 162.86]);
precision.add([key0, 162.87][key1, 162.88]);
mixedArrayOfMapFlagCase.setValue(MixedArrayOfMapFlagCaseValue2.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, mixedArrayOfMapFlagCase).thenAccept(result -> {
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
    final ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase arrayOfMapFlagOfInnerMixedArrayOfMapFlagCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `arrayOfMapFlagOfInnerMixedArrayOfMapFlagCase` | [`ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase`](/doc/models/array-of-map-flag-of-inner-mixed-array-of-map-flag-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase arrayOfMapFlagOfInnerMixedArrayOfMapFlagCase = new ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase();
List<ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2> arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2 = new LinkedList<>();


List<Map<String, Double>> precision = new LinkedList<>();
arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2.add(ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2.fromPrecision(arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue20));

List<Map<String, Double>> precision = new LinkedList<>();
arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2.add(ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2.fromPrecision(arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue21));

List<Map<String, Double>> precision = new LinkedList<>();
arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2.add(ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2.fromPrecision(arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue22));

arrayOfMapFlagOfInnerMixedArrayOfMapFlagCase.setValue(arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, arrayOfMapFlagOfInnerMixedArrayOfMapFlagCase).thenAccept(result -> {
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
    final OuterMapOfArrayCase outerMapOfArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `outerMapOfArrayCase` | [`OuterMapOfArrayCase`](/doc/models/outer-map-of-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
OuterMapOfArrayCase outerMapOfArrayCase = new OuterMapOfArrayCase();
List<OuterMapOfArrayCaseValue2> outerMapOfArrayCaseValue2 = new LinkedList<>();


double outerMapOfArrayCaseValue20 = null;
outerMapOfArrayCaseValue2.add(OuterMapOfArrayCaseValue2.fromPrecision(outerMapOfArrayCaseValue20));

outerMapOfArrayCase.setValue(outerMapOfArrayCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofOuterMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, outerMapOfArrayCase).thenAccept(result -> {
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
    final InnerMapOfArrayCase innerMapOfArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `innerMapOfArrayCase` | [`InnerMapOfArrayCase`](/doc/models/inner-map-of-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
InnerMapOfArrayCase innerMapOfArrayCase = new InnerMapOfArrayCase();
Map<String, List<Double>> precision = new LinkedList<>();
precision.add(key0System.Object[]);
innerMapOfArrayCase.setValue(InnerMapOfArrayCaseValue2.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, innerMapOfArrayCase).thenAccept(result -> {
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
    final MapOfArrayOfInnerMapOfArrayCase mapOfArrayOfInnerMapOfArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `mapOfArrayOfInnerMapOfArrayCase` | [`MapOfArrayOfInnerMapOfArrayCase`](/doc/models/map-of-array-of-inner-map-of-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MapOfArrayOfInnerMapOfArrayCase mapOfArrayOfInnerMapOfArrayCase = new MapOfArrayOfInnerMapOfArrayCase();
List<MapOfArrayOfInnerMapOfArrayCaseValue2> mapOfArrayOfInnerMapOfArrayCaseValue2 = new LinkedList<>();


Map<String, List<Double>> precision = new LinkedList<>();
mapOfArrayOfInnerMapOfArrayCaseValue2.add(MapOfArrayOfInnerMapOfArrayCaseValue2.fromPrecision(mapOfArrayOfInnerMapOfArrayCaseValue20));

Map<String, List<Double>> precision = new LinkedList<>();
mapOfArrayOfInnerMapOfArrayCaseValue2.add(MapOfArrayOfInnerMapOfArrayCaseValue2.fromPrecision(mapOfArrayOfInnerMapOfArrayCaseValue21));

mapOfArrayOfInnerMapOfArrayCase.setValue(mapOfArrayOfInnerMapOfArrayCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, mapOfArrayOfInnerMapOfArrayCase).thenAccept(result -> {
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
    final MixedMapOfArrayCase mixedMapOfArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `mixedMapOfArrayCase` | [`MixedMapOfArrayCase`](/doc/models/mixed-map-of-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MixedMapOfArrayCase mixedMapOfArrayCase = new MixedMapOfArrayCase();
Map<String, List<Double>> precision = new LinkedList<>();
precision.add(key0System.Object[]);
mixedMapOfArrayCase.setValue(MixedMapOfArrayCaseValue2.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, mixedMapOfArrayCase).thenAccept(result -> {
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
    final MapOfArrayOfInnerMixedMapOfArrayCase mapOfArrayOfInnerMixedMapOfArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `mapOfArrayOfInnerMixedMapOfArrayCase` | [`MapOfArrayOfInnerMixedMapOfArrayCase`](/doc/models/map-of-array-of-inner-mixed-map-of-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MapOfArrayOfInnerMixedMapOfArrayCase mapOfArrayOfInnerMixedMapOfArrayCase = new MapOfArrayOfInnerMixedMapOfArrayCase();
List<MapOfArrayOfInnerMixedMapOfArrayCaseValue2> mapOfArrayOfInnerMixedMapOfArrayCaseValue2 = new LinkedList<>();


Map<String, List<Double>> precision = new LinkedList<>();
mapOfArrayOfInnerMixedMapOfArrayCaseValue2.add(MapOfArrayOfInnerMixedMapOfArrayCaseValue2.fromPrecision(mapOfArrayOfInnerMixedMapOfArrayCaseValue20));

mapOfArrayOfInnerMixedMapOfArrayCase.setValue(mapOfArrayOfInnerMixedMapOfArrayCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, mapOfArrayOfInnerMixedMapOfArrayCase).thenAccept(result -> {
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
    final ArrayOfMapsCase arrayOfMapsCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `arrayOfMapsCase` | [`ArrayOfMapsCase`](/doc/models/array-of-maps-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
ArrayOfMapsCase arrayOfMapsCase = new ArrayOfMapsCase();
List<ArrayOfMapsCaseValue2> arrayOfMapsCaseValue2 = new LinkedList<>();


Map<String, Double> precision = new LinkedHashMap<>();
precision.put("key0", 71.7);
arrayOfMapsCaseValue2.add(ArrayOfMapsCaseValue2.fromPrecision(arrayOfMapsCaseValue20));

Map<String, Double> precision = new LinkedHashMap<>();
precision.put("key0", 71.71);
precision.put("key1", 71.72);
arrayOfMapsCaseValue2.add(ArrayOfMapsCaseValue2.fromPrecision(arrayOfMapsCaseValue21));

arrayOfMapsCase.setValue(arrayOfMapsCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapsAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, arrayOfMapsCase).thenAccept(result -> {
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
    final ArrayOfArrayOfMapFlagCase arrayOfArrayOfMapFlagCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `arrayOfArrayOfMapFlagCase` | [`ArrayOfArrayOfMapFlagCase`](/doc/models/array-of-array-of-map-flag-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
ArrayOfArrayOfMapFlagCase arrayOfArrayOfMapFlagCase = new ArrayOfArrayOfMapFlagCase();
List<ArrayOfArrayOfMapFlagCaseValue2> arrayOfArrayOfMapFlagCaseValue2 = new LinkedList<>();


List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 227.08]);
precision.add([key0, 227.09][key1, 227.1]);
arrayOfArrayOfMapFlagCaseValue2.add(ArrayOfArrayOfMapFlagCaseValue2.fromPrecision(arrayOfArrayOfMapFlagCaseValue20));

List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 227.09][key1, 227.1]);
precision.add([key0, 227.1][key1, 227.11][key2, 227.12]);
precision.add([key0, 227.11]);
arrayOfArrayOfMapFlagCaseValue2.add(ArrayOfArrayOfMapFlagCaseValue2.fromPrecision(arrayOfArrayOfMapFlagCaseValue21));

List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 227.1][key1, 227.11][key2, 227.12]);
arrayOfArrayOfMapFlagCaseValue2.add(ArrayOfArrayOfMapFlagCaseValue2.fromPrecision(arrayOfArrayOfMapFlagCaseValue22));

arrayOfArrayOfMapFlagCase.setValue(arrayOfArrayOfMapFlagCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, arrayOfArrayOfMapFlagCase).thenAccept(result -> {
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
    final MapOfArraysCase mapOfArraysCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `mapOfArraysCase` | [`MapOfArraysCase`](/doc/models/map-of-arrays-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MapOfArraysCase mapOfArraysCase = new MapOfArraysCase();
Map<String, MapOfArraysCaseValue2> mapOfArraysCaseValue2 = new LinkedHashMap<>();





mapOfArraysCase.setValue(mapOfArraysCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, mapOfArraysCase).thenAccept(result -> {
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
    final MapOfArrayOfMapFlagCase mapOfArrayOfMapFlagCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `mapOfArrayOfMapFlagCase` | [`MapOfArrayOfMapFlagCase`](/doc/models/map-of-array-of-map-flag-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MapOfArrayOfMapFlagCase mapOfArrayOfMapFlagCase = new MapOfArrayOfMapFlagCase();
Map<String, MapOfArrayOfMapFlagCaseValue2> mapOfArrayOfMapFlagCaseValue2 = new LinkedHashMap<>();





mapOfArrayOfMapFlagCase.setValue(mapOfArrayOfMapFlagCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, mapOfArrayOfMapFlagCase).thenAccept(result -> {
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
    final ArrayOfMapFlagOfArrayCase arrayOfMapFlagOfArrayCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `arrayOfMapFlagOfArrayCase` | [`ArrayOfMapFlagOfArrayCase`](/doc/models/array-of-map-flag-of-array-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
ArrayOfMapFlagOfArrayCase arrayOfMapFlagOfArrayCase = new ArrayOfMapFlagOfArrayCase();
List<ArrayOfMapFlagOfArrayCaseValue2> arrayOfMapFlagOfArrayCaseValue2 = new LinkedList<>();


List<Double> precision = new LinkedList<>();
arrayOfMapFlagOfArrayCaseValue2.add(ArrayOfMapFlagOfArrayCaseValue2.fromPrecision(arrayOfMapFlagOfArrayCaseValue20));

arrayOfMapFlagOfArrayCase.setValue(arrayOfMapFlagOfArrayCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, arrayOfMapFlagOfArrayCase).thenAccept(result -> {
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
    final ArrayOfMapFlagOfMapCase arrayOfMapFlagOfMapCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `arrayOfMapFlagOfMapCase` | [`ArrayOfMapFlagOfMapCase`](/doc/models/array-of-map-flag-of-map-case.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
ArrayOfMapFlagOfMapCase arrayOfMapFlagOfMapCase = new ArrayOfMapFlagOfMapCase();
List<ArrayOfMapFlagOfMapCaseValue2> arrayOfMapFlagOfMapCaseValue2 = new LinkedList<>();


Map<String, Double> precision = new LinkedHashMap<>();
arrayOfMapFlagOfMapCaseValue2.add(ArrayOfMapFlagOfMapCaseValue2.fromPrecision(arrayOfMapFlagOfMapCaseValue20));

Map<String, Double> precision = new LinkedHashMap<>();
arrayOfMapFlagOfMapCaseValue2.add(ArrayOfMapFlagOfMapCaseValue2.fromPrecision(arrayOfMapFlagOfMapCaseValue21));

arrayOfMapFlagOfMapCase.setValue(arrayOfMapFlagOfMapCaseValue2);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, arrayOfMapFlagOfMapCase).thenAccept(result -> {
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
    final MultiLevelAnyOf multiLevelAnyOf)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |
| `multiLevelAnyOf` | [`MultiLevelAnyOf`](/doc/models/multi-level-any-of.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;
MultiLevelAnyOf multiLevelAnyOf = new MultiLevelAnyOf();
multiLevelAnyOf.setValue(MultiLevelAnyOfValue.fromPrecision(211.14));

anyOfPrimitiveTypesInRequestBodyController.sendMultiLevelAnyofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, multiLevelAnyOf).thenAccept(result -> {
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

