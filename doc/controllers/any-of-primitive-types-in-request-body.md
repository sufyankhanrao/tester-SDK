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
    final SendAnyofSimpleInput input)
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
SendAnyofSimpleInput sendAnyofSimpleInput = new SendAnyofSimpleInput();
sendAnyofSimpleInput.setIsPrimitiveType(false);
sendAnyofSimpleInput.setIsAtEndpointLevel(false);
sendAnyofSimpleInput.setHasDiscriminator(false);
sendAnyofSimpleInput.setSimpleCase(new SimpleCase());
sendAnyofSimpleInput.getSimpleCase().setValue(SimpleCaseValue.fromPrecision(23.42));

anyOfPrimitiveTypesInRequestBodyController.sendAnyofSimpleAsync(sendAnyofSimpleInput).thenAccept(result -> {
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
    final SendAnyofOuterArrayInput input)
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
SendAnyofOuterArrayInput sendAnyofOuterArrayInput = new SendAnyofOuterArrayInput();
sendAnyofOuterArrayInput.setIsPrimitiveType(false);
sendAnyofOuterArrayInput.setIsAtEndpointLevel(false);
sendAnyofOuterArrayInput.setHasDiscriminator(false);
sendAnyofOuterArrayInput.setOuterArrayCase(new OuterArrayCase());
List<OuterArrayCaseValue> outerArrayCaseValue = new LinkedList<>();


double outerArrayCaseValue0 = 190.1;
outerArrayCaseValue.add(OuterArrayCaseValue.fromPrecision(outerArrayCaseValue0));

double outerArrayCaseValue1 = 190.11;
outerArrayCaseValue.add(OuterArrayCaseValue.fromPrecision(outerArrayCaseValue1));

sendAnyofOuterArrayInput.getOuterArrayCase().setValue(outerArrayCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofOuterArrayAsync(sendAnyofOuterArrayInput).thenAccept(result -> {
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
    final SendAnyofInnerArrayInput input)
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
SendAnyofInnerArrayInput sendAnyofInnerArrayInput = new SendAnyofInnerArrayInput();
sendAnyofInnerArrayInput.setIsPrimitiveType(false);
sendAnyofInnerArrayInput.setIsAtEndpointLevel(false);
sendAnyofInnerArrayInput.setHasDiscriminator(false);
sendAnyofInnerArrayInput.setInnerArrayCase(new InnerArrayCase());
List<Double> precision = new LinkedList<>();
precision.add(210);
sendAnyofInnerArrayInput.getInnerArrayCase().setValue(InnerArrayCaseValue.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerArrayAsync(sendAnyofInnerArrayInput).thenAccept(result -> {
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
    final SendAnyofArrayOfArraysInput input)
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
SendAnyofArrayOfArraysInput sendAnyofArrayOfArraysInput = new SendAnyofArrayOfArraysInput();
sendAnyofArrayOfArraysInput.setIsPrimitiveType(false);
sendAnyofArrayOfArraysInput.setIsAtEndpointLevel(false);
sendAnyofArrayOfArraysInput.setHasDiscriminator(false);
sendAnyofArrayOfArraysInput.setArrayOfArraysCase(new ArrayOfArraysCase());
List<ArrayOfArraysCaseValue> arrayOfArraysCaseValue = new LinkedList<>();


List<Double> precision = new LinkedList<>();
precision.add(220.6);
arrayOfArraysCaseValue.add(ArrayOfArraysCaseValue.fromPrecision(arrayOfArraysCaseValue0));

List<Double> precision = new LinkedList<>();
precision.add(220.61);
precision.add(220.62);
arrayOfArraysCaseValue.add(ArrayOfArraysCaseValue.fromPrecision(arrayOfArraysCaseValue1));

sendAnyofArrayOfArraysInput.getArrayOfArraysCase().setValue(arrayOfArraysCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfArraysAsync(sendAnyofArrayOfArraysInput).thenAccept(result -> {
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
    final SendAnyofInnerMixedArraysInput input)
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
SendAnyofInnerMixedArraysInput sendAnyofInnerMixedArraysInput = new SendAnyofInnerMixedArraysInput();
sendAnyofInnerMixedArraysInput.setIsPrimitiveType(false);
sendAnyofInnerMixedArraysInput.setIsAtEndpointLevel(false);
sendAnyofInnerMixedArraysInput.setHasDiscriminator(false);
sendAnyofInnerMixedArraysInput.setInnerMixedArrayCase(new InnerMixedArrayCase());
List<Double> precision = new LinkedList<>();
precision.add(253.2);
sendAnyofInnerMixedArraysInput.getInnerMixedArrayCase().setValue(InnerMixedArrayCaseValue.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedArraysAsync(sendAnyofInnerMixedArraysInput).thenAccept(result -> {
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
    final SendAnyofArrayOfMixedArraysInput input)
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
SendAnyofArrayOfMixedArraysInput sendAnyofArrayOfMixedArraysInput = new SendAnyofArrayOfMixedArraysInput();
sendAnyofArrayOfMixedArraysInput.setIsPrimitiveType(false);
sendAnyofArrayOfMixedArraysInput.setIsAtEndpointLevel(false);
sendAnyofArrayOfMixedArraysInput.setHasDiscriminator(false);
sendAnyofArrayOfMixedArraysInput.setArrayOfMixedArrayCase(new ArrayOfMixedArrayCase());
List<ArrayOfMixedArrayCaseValue> arrayOfMixedArrayCaseValue = new LinkedList<>();


double arrayOfMixedArrayCaseValue0 = 29.02;
arrayOfMixedArrayCaseValue.add(ArrayOfMixedArrayCaseValue.fromPrecision(arrayOfMixedArrayCaseValue0));

double arrayOfMixedArrayCaseValue1 = 29.03;
arrayOfMixedArrayCaseValue.add(ArrayOfMixedArrayCaseValue.fromPrecision(arrayOfMixedArrayCaseValue1));

double arrayOfMixedArrayCaseValue2 = 29.04;
arrayOfMixedArrayCaseValue.add(ArrayOfMixedArrayCaseValue.fromPrecision(arrayOfMixedArrayCaseValue2));

sendAnyofArrayOfMixedArraysInput.getArrayOfMixedArrayCase().setValue(arrayOfMixedArrayCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMixedArraysAsync(sendAnyofArrayOfMixedArraysInput).thenAccept(result -> {
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
    final SendAnyofOuterMapInput input)
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
SendAnyofOuterMapInput sendAnyofOuterMapInput = new SendAnyofOuterMapInput();
sendAnyofOuterMapInput.setIsPrimitiveType(false);
sendAnyofOuterMapInput.setIsAtEndpointLevel(false);
sendAnyofOuterMapInput.setHasDiscriminator(false);
sendAnyofOuterMapInput.setOuterMapCase(new OuterMapCase());
Map<String, OuterMapCaseValue> outerMapCaseValue = new LinkedHashMap<>();



sendAnyofOuterMapInput.getOuterMapCase().setValue(outerMapCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofOuterMapAsync(sendAnyofOuterMapInput).thenAccept(result -> {
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
    final SendAnyofInnerMapInput input)
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
SendAnyofInnerMapInput sendAnyofInnerMapInput = new SendAnyofInnerMapInput();
sendAnyofInnerMapInput.setIsPrimitiveType(false);
sendAnyofInnerMapInput.setIsAtEndpointLevel(false);
sendAnyofInnerMapInput.setHasDiscriminator(false);
sendAnyofInnerMapInput.setInnerMapCase(new InnerMapCase());
Map<String, Double> precision = new LinkedHashMap<>();
precision.put("key0", 215.2);
precision.put("key1", 215.21);
sendAnyofInnerMapInput.getInnerMapCase().setValue(InnerMapCaseValue.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMapAsync(sendAnyofInnerMapInput).thenAccept(result -> {
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
    final SendAnyofMapOfMapInput input)
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
SendAnyofMapOfMapInput sendAnyofMapOfMapInput = new SendAnyofMapOfMapInput();
sendAnyofMapOfMapInput.setIsPrimitiveType(false);
sendAnyofMapOfMapInput.setIsAtEndpointLevel(false);
sendAnyofMapOfMapInput.setHasDiscriminator(false);
sendAnyofMapOfMapInput.setMapOfMapsCase(new MapOfMapsCase());
Map<String, MapOfMapsCaseValue> mapOfMapsCaseValue = new LinkedHashMap<>();




sendAnyofMapOfMapInput.getMapOfMapsCase().setValue(mapOfMapsCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfMapAsync(sendAnyofMapOfMapInput).thenAccept(result -> {
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
    final SendAnyofInnerMixedMapInput input)
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
SendAnyofInnerMixedMapInput sendAnyofInnerMixedMapInput = new SendAnyofInnerMixedMapInput();
sendAnyofInnerMixedMapInput.setIsPrimitiveType(false);
sendAnyofInnerMixedMapInput.setIsAtEndpointLevel(false);
sendAnyofInnerMixedMapInput.setHasDiscriminator(false);
sendAnyofInnerMixedMapInput.setInnerMixedMapCase(new InnerMixedMapCase());
Map<String, Double> precision = new LinkedHashMap<>();
precision.put("key0", 47.28);
precision.put("key1", 47.29);
precision.put("key2", 47.3);
sendAnyofInnerMixedMapInput.getInnerMixedMapCase().setValue(InnerMixedMapCaseValue.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedMapAsync(sendAnyofInnerMixedMapInput).thenAccept(result -> {
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
    final SendAnyofMapOfInnerMixedMapInput input)
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
SendAnyofMapOfInnerMixedMapInput sendAnyofMapOfInnerMixedMapInput = new SendAnyofMapOfInnerMixedMapInput();
sendAnyofMapOfInnerMixedMapInput.setIsPrimitiveType(false);
sendAnyofMapOfInnerMixedMapInput.setIsAtEndpointLevel(false);
sendAnyofMapOfInnerMixedMapInput.setHasDiscriminator(false);
sendAnyofMapOfInnerMixedMapInput.setMapOfMixedMapCase(new MapOfMixedMapCase());
Map<String, MapOfMixedMapCaseValue> mapOfMixedMapCaseValue = new LinkedHashMap<>();



sendAnyofMapOfInnerMixedMapInput.getMapOfMixedMapCase().setValue(mapOfMixedMapCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfInnerMixedMapAsync(sendAnyofMapOfInnerMixedMapInput).thenAccept(result -> {
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
    final SendAnyofOuterArrayOfMapFlagInput input)
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
SendAnyofOuterArrayOfMapFlagInput sendAnyofOuterArrayOfMapFlagInput = new SendAnyofOuterArrayOfMapFlagInput();
sendAnyofOuterArrayOfMapFlagInput.setIsPrimitiveType(false);
sendAnyofOuterArrayOfMapFlagInput.setIsAtEndpointLevel(false);
sendAnyofOuterArrayOfMapFlagInput.setHasDiscriminator(false);
sendAnyofOuterArrayOfMapFlagInput.setOuterArrayOfMapFlagCase(new OuterArrayOfMapFlagCase());
List<OuterArrayOfMapFlagCaseValue> outerArrayOfMapFlagCaseValue = new LinkedList<>();


double outerArrayOfMapFlagCaseValue0 = null;
outerArrayOfMapFlagCaseValue.add(OuterArrayOfMapFlagCaseValue.fromPrecision(outerArrayOfMapFlagCaseValue0));

double outerArrayOfMapFlagCaseValue1 = null;
outerArrayOfMapFlagCaseValue.add(OuterArrayOfMapFlagCaseValue.fromPrecision(outerArrayOfMapFlagCaseValue1));

sendAnyofOuterArrayOfMapFlagInput.getOuterArrayOfMapFlagCase().setValue(outerArrayOfMapFlagCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofOuterArrayOfMapFlagAsync(sendAnyofOuterArrayOfMapFlagInput).thenAccept(result -> {
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
    final SendAnyofInnerArrayOfMapFlagInput input)
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
SendAnyofInnerArrayOfMapFlagInput sendAnyofInnerArrayOfMapFlagInput = new SendAnyofInnerArrayOfMapFlagInput();
sendAnyofInnerArrayOfMapFlagInput.setIsPrimitiveType(false);
sendAnyofInnerArrayOfMapFlagInput.setIsAtEndpointLevel(false);
sendAnyofInnerArrayOfMapFlagInput.setHasDiscriminator(false);
sendAnyofInnerArrayOfMapFlagInput.setInnerArrayOfMapFlagCase(new InnerArrayOfMapFlagCase());
List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 213.38][key1, 213.39]);
precision.add([key0, 213.39][key1, 213.4][key2, 213.41]);
precision.add([key0, 213.4]);
sendAnyofInnerArrayOfMapFlagInput.getInnerArrayOfMapFlagCase().setValue(InnerArrayOfMapFlagCaseValue.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerArrayOfMapFlagAsync(sendAnyofInnerArrayOfMapFlagInput).thenAccept(result -> {
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
    final SendAnyofArrayOfMapFlagOfArrayOfMapFlagInput input)
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
SendAnyofArrayOfMapFlagOfArrayOfMapFlagInput sendAnyofArrayOfMapFlagOfArrayOfMapFlagInput = new SendAnyofArrayOfMapFlagOfArrayOfMapFlagInput();
sendAnyofArrayOfMapFlagOfArrayOfMapFlagInput.setIsPrimitiveType(false);
sendAnyofArrayOfMapFlagOfArrayOfMapFlagInput.setIsAtEndpointLevel(false);
sendAnyofArrayOfMapFlagOfArrayOfMapFlagInput.setHasDiscriminator(false);
sendAnyofArrayOfMapFlagOfArrayOfMapFlagInput.setArrayOfMapFlagOfInnerArrayOfMapFlagCase(new ArrayOfMapFlagOfInnerArrayOfMapFlagCase());
List<ArrayOfMapFlagOfInnerArrayOfMapFlagCaseValue> arrayOfMapFlagOfInnerArrayOfMapFlagCaseValue = new LinkedList<>();


List<Map<String, Double>> precision = new LinkedList<>();
arrayOfMapFlagOfInnerArrayOfMapFlagCaseValue.add(ArrayOfMapFlagOfInnerArrayOfMapFlagCaseValue.fromPrecision(arrayOfMapFlagOfInnerArrayOfMapFlagCaseValue0));

sendAnyofArrayOfMapFlagOfArrayOfMapFlagInput.getArrayOfMapFlagOfInnerArrayOfMapFlagCase().setValue(arrayOfMapFlagOfInnerArrayOfMapFlagCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(sendAnyofArrayOfMapFlagOfArrayOfMapFlagInput).thenAccept(result -> {
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
    final SendAnyofInnerMixedArrayOfMapFlagInput input)
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
SendAnyofInnerMixedArrayOfMapFlagInput sendAnyofInnerMixedArrayOfMapFlagInput = new SendAnyofInnerMixedArrayOfMapFlagInput();
sendAnyofInnerMixedArrayOfMapFlagInput.setIsPrimitiveType(false);
sendAnyofInnerMixedArrayOfMapFlagInput.setIsAtEndpointLevel(false);
sendAnyofInnerMixedArrayOfMapFlagInput.setHasDiscriminator(false);
sendAnyofInnerMixedArrayOfMapFlagInput.setMixedArrayOfMapFlagCase(new MixedArrayOfMapFlagCase());
List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 162.86]);
precision.add([key0, 162.87][key1, 162.88]);
sendAnyofInnerMixedArrayOfMapFlagInput.getMixedArrayOfMapFlagCase().setValue(MixedArrayOfMapFlagCaseValue.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedArrayOfMapFlagAsync(sendAnyofInnerMixedArrayOfMapFlagInput).thenAccept(result -> {
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
    final SendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput input)
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
SendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput = new SendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput();
sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput.setIsPrimitiveType(false);
sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput.setIsAtEndpointLevel(false);
sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput.setHasDiscriminator(false);
sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput.setArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase(new ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase());
List<ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue> arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue = new LinkedList<>();


List<Map<String, Double>> precision = new LinkedList<>();
arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue.add(ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue.fromPrecision(arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue0));

List<Map<String, Double>> precision = new LinkedList<>();
arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue.add(ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue.fromPrecision(arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue1));

List<Map<String, Double>> precision = new LinkedList<>();
arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue.add(ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue.fromPrecision(arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue2));

sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput.getArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase().setValue(arrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(sendAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput).thenAccept(result -> {
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
    final SendAnyofOuterMapOfArrayInput input)
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
SendAnyofOuterMapOfArrayInput sendAnyofOuterMapOfArrayInput = new SendAnyofOuterMapOfArrayInput();
sendAnyofOuterMapOfArrayInput.setIsPrimitiveType(false);
sendAnyofOuterMapOfArrayInput.setIsAtEndpointLevel(false);
sendAnyofOuterMapOfArrayInput.setHasDiscriminator(false);
sendAnyofOuterMapOfArrayInput.setOuterMapOfArrayCase(new OuterMapOfArrayCase());
List<OuterMapOfArrayCaseValue> outerMapOfArrayCaseValue = new LinkedList<>();


double outerMapOfArrayCaseValue0 = null;
outerMapOfArrayCaseValue.add(OuterMapOfArrayCaseValue.fromPrecision(outerMapOfArrayCaseValue0));

sendAnyofOuterMapOfArrayInput.getOuterMapOfArrayCase().setValue(outerMapOfArrayCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofOuterMapOfArrayAsync(sendAnyofOuterMapOfArrayInput).thenAccept(result -> {
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
    final SendAnyofInnerMapOfArrayInput input)
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
SendAnyofInnerMapOfArrayInput sendAnyofInnerMapOfArrayInput = new SendAnyofInnerMapOfArrayInput();
sendAnyofInnerMapOfArrayInput.setIsPrimitiveType(false);
sendAnyofInnerMapOfArrayInput.setIsAtEndpointLevel(false);
sendAnyofInnerMapOfArrayInput.setHasDiscriminator(false);
sendAnyofInnerMapOfArrayInput.setInnerMapOfArrayCase(new InnerMapOfArrayCase());
Map<String, List<Double>> precision = new LinkedList<>();
precision.add(key0System.Object[]);
sendAnyofInnerMapOfArrayInput.getInnerMapOfArrayCase().setValue(InnerMapOfArrayCaseValue.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMapOfArrayAsync(sendAnyofInnerMapOfArrayInput).thenAccept(result -> {
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
    final SendAnyofMapOfArrayOfMapOfArrayInput input)
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
SendAnyofMapOfArrayOfMapOfArrayInput sendAnyofMapOfArrayOfMapOfArrayInput = new SendAnyofMapOfArrayOfMapOfArrayInput();
sendAnyofMapOfArrayOfMapOfArrayInput.setIsPrimitiveType(false);
sendAnyofMapOfArrayOfMapOfArrayInput.setIsAtEndpointLevel(false);
sendAnyofMapOfArrayOfMapOfArrayInput.setHasDiscriminator(false);
sendAnyofMapOfArrayOfMapOfArrayInput.setMapOfArrayOfInnerMapOfArrayCase(new MapOfArrayOfInnerMapOfArrayCase());
List<MapOfArrayOfInnerMapOfArrayCaseValue> mapOfArrayOfInnerMapOfArrayCaseValue = new LinkedList<>();


Map<String, List<Double>> precision = new LinkedList<>();
mapOfArrayOfInnerMapOfArrayCaseValue.add(MapOfArrayOfInnerMapOfArrayCaseValue.fromPrecision(mapOfArrayOfInnerMapOfArrayCaseValue0));

Map<String, List<Double>> precision = new LinkedList<>();
mapOfArrayOfInnerMapOfArrayCaseValue.add(MapOfArrayOfInnerMapOfArrayCaseValue.fromPrecision(mapOfArrayOfInnerMapOfArrayCaseValue1));

sendAnyofMapOfArrayOfMapOfArrayInput.getMapOfArrayOfInnerMapOfArrayCase().setValue(mapOfArrayOfInnerMapOfArrayCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMapOfArrayAsync(sendAnyofMapOfArrayOfMapOfArrayInput).thenAccept(result -> {
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
    final SendAnyofInnerMixedMapOfArrayInput input)
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
SendAnyofInnerMixedMapOfArrayInput sendAnyofInnerMixedMapOfArrayInput = new SendAnyofInnerMixedMapOfArrayInput();
sendAnyofInnerMixedMapOfArrayInput.setIsPrimitiveType(false);
sendAnyofInnerMixedMapOfArrayInput.setIsAtEndpointLevel(false);
sendAnyofInnerMixedMapOfArrayInput.setHasDiscriminator(false);
sendAnyofInnerMixedMapOfArrayInput.setMixedMapOfArrayCase(new MixedMapOfArrayCase());
Map<String, List<Double>> precision = new LinkedList<>();
precision.add(key0System.Object[]);
sendAnyofInnerMixedMapOfArrayInput.getMixedMapOfArrayCase().setValue(MixedMapOfArrayCaseValue.fromPrecision(precision));
anyOfPrimitiveTypesInRequestBodyController.sendAnyofInnerMixedMapOfArrayAsync(sendAnyofInnerMixedMapOfArrayInput).thenAccept(result -> {
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
    final SendAnyofMapOfArrayOfMixedMapOfArrayInput input)
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
SendAnyofMapOfArrayOfMixedMapOfArrayInput sendAnyofMapOfArrayOfMixedMapOfArrayInput = new SendAnyofMapOfArrayOfMixedMapOfArrayInput();
sendAnyofMapOfArrayOfMixedMapOfArrayInput.setIsPrimitiveType(false);
sendAnyofMapOfArrayOfMixedMapOfArrayInput.setIsAtEndpointLevel(false);
sendAnyofMapOfArrayOfMixedMapOfArrayInput.setHasDiscriminator(false);
sendAnyofMapOfArrayOfMixedMapOfArrayInput.setMapOfArrayOfInnerMixedMapOfArrayCase(new MapOfArrayOfInnerMixedMapOfArrayCase());
List<MapOfArrayOfInnerMixedMapOfArrayCaseValue> mapOfArrayOfInnerMixedMapOfArrayCaseValue = new LinkedList<>();


Map<String, List<Double>> precision = new LinkedList<>();
mapOfArrayOfInnerMixedMapOfArrayCaseValue.add(MapOfArrayOfInnerMixedMapOfArrayCaseValue.fromPrecision(mapOfArrayOfInnerMixedMapOfArrayCaseValue0));

sendAnyofMapOfArrayOfMixedMapOfArrayInput.getMapOfArrayOfInnerMixedMapOfArrayCase().setValue(mapOfArrayOfInnerMixedMapOfArrayCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMixedMapOfArrayAsync(sendAnyofMapOfArrayOfMixedMapOfArrayInput).thenAccept(result -> {
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
    final SendAnyofArrayOfMapsInput input)
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
SendAnyofArrayOfMapsInput sendAnyofArrayOfMapsInput = new SendAnyofArrayOfMapsInput();
sendAnyofArrayOfMapsInput.setIsPrimitiveType(false);
sendAnyofArrayOfMapsInput.setIsAtEndpointLevel(false);
sendAnyofArrayOfMapsInput.setHasDiscriminator(false);
sendAnyofArrayOfMapsInput.setArrayOfMapsCase(new ArrayOfMapsCase());
List<ArrayOfMapsCaseValue> arrayOfMapsCaseValue = new LinkedList<>();


Map<String, Double> precision = new LinkedHashMap<>();
precision.put("key0", 71.7);
arrayOfMapsCaseValue.add(ArrayOfMapsCaseValue.fromPrecision(arrayOfMapsCaseValue0));

Map<String, Double> precision = new LinkedHashMap<>();
precision.put("key0", 71.71);
precision.put("key1", 71.72);
arrayOfMapsCaseValue.add(ArrayOfMapsCaseValue.fromPrecision(arrayOfMapsCaseValue1));

sendAnyofArrayOfMapsInput.getArrayOfMapsCase().setValue(arrayOfMapsCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapsAsync(sendAnyofArrayOfMapsInput).thenAccept(result -> {
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
    final SendAnyofArrayOfArrayOfMapFlagInput input)
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
SendAnyofArrayOfArrayOfMapFlagInput sendAnyofArrayOfArrayOfMapFlagInput = new SendAnyofArrayOfArrayOfMapFlagInput();
sendAnyofArrayOfArrayOfMapFlagInput.setIsPrimitiveType(false);
sendAnyofArrayOfArrayOfMapFlagInput.setIsAtEndpointLevel(false);
sendAnyofArrayOfArrayOfMapFlagInput.setHasDiscriminator(false);
sendAnyofArrayOfArrayOfMapFlagInput.setArrayOfArrayOfMapFlagCase(new ArrayOfArrayOfMapFlagCase());
List<ArrayOfArrayOfMapFlagCaseValue> arrayOfArrayOfMapFlagCaseValue = new LinkedList<>();


List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 227.08]);
precision.add([key0, 227.09][key1, 227.1]);
arrayOfArrayOfMapFlagCaseValue.add(ArrayOfArrayOfMapFlagCaseValue.fromPrecision(arrayOfArrayOfMapFlagCaseValue0));

List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 227.09][key1, 227.1]);
precision.add([key0, 227.1][key1, 227.11][key2, 227.12]);
precision.add([key0, 227.11]);
arrayOfArrayOfMapFlagCaseValue.add(ArrayOfArrayOfMapFlagCaseValue.fromPrecision(arrayOfArrayOfMapFlagCaseValue1));

List<Map<String, Double>> precision = new LinkedList<>();
precision.add([key0, 227.1][key1, 227.11][key2, 227.12]);
arrayOfArrayOfMapFlagCaseValue.add(ArrayOfArrayOfMapFlagCaseValue.fromPrecision(arrayOfArrayOfMapFlagCaseValue2));

sendAnyofArrayOfArrayOfMapFlagInput.getArrayOfArrayOfMapFlagCase().setValue(arrayOfArrayOfMapFlagCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfArrayOfMapFlagAsync(sendAnyofArrayOfArrayOfMapFlagInput).thenAccept(result -> {
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
    final SendAnyofMapOfArrayInput input)
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
SendAnyofMapOfArrayInput sendAnyofMapOfArrayInput = new SendAnyofMapOfArrayInput();
sendAnyofMapOfArrayInput.setIsPrimitiveType(false);
sendAnyofMapOfArrayInput.setIsAtEndpointLevel(false);
sendAnyofMapOfArrayInput.setHasDiscriminator(false);
sendAnyofMapOfArrayInput.setMapOfArraysCase(new MapOfArraysCase());
Map<String, MapOfArraysCaseValue> mapOfArraysCaseValue = new LinkedHashMap<>();





sendAnyofMapOfArrayInput.getMapOfArraysCase().setValue(mapOfArraysCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayAsync(sendAnyofMapOfArrayInput).thenAccept(result -> {
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
    final SendAnyofMapOfArrayOfMapFlagInput input)
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
SendAnyofMapOfArrayOfMapFlagInput sendAnyofMapOfArrayOfMapFlagInput = new SendAnyofMapOfArrayOfMapFlagInput();
sendAnyofMapOfArrayOfMapFlagInput.setIsPrimitiveType(false);
sendAnyofMapOfArrayOfMapFlagInput.setIsAtEndpointLevel(false);
sendAnyofMapOfArrayOfMapFlagInput.setHasDiscriminator(false);
sendAnyofMapOfArrayOfMapFlagInput.setMapOfArrayOfMapFlagCase(new MapOfArrayOfMapFlagCase());
Map<String, MapOfArrayOfMapFlagCaseValue> mapOfArrayOfMapFlagCaseValue = new LinkedHashMap<>();





sendAnyofMapOfArrayOfMapFlagInput.getMapOfArrayOfMapFlagCase().setValue(mapOfArrayOfMapFlagCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofMapOfArrayOfMapFlagAsync(sendAnyofMapOfArrayOfMapFlagInput).thenAccept(result -> {
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
    final SendAnyofArrayOfMapFlagOfArrayInput input)
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
SendAnyofArrayOfMapFlagOfArrayInput sendAnyofArrayOfMapFlagOfArrayInput = new SendAnyofArrayOfMapFlagOfArrayInput();
sendAnyofArrayOfMapFlagOfArrayInput.setIsPrimitiveType(false);
sendAnyofArrayOfMapFlagOfArrayInput.setIsAtEndpointLevel(false);
sendAnyofArrayOfMapFlagOfArrayInput.setHasDiscriminator(false);
sendAnyofArrayOfMapFlagOfArrayInput.setArrayOfMapFlagOfArrayCase(new ArrayOfMapFlagOfArrayCase());
List<ArrayOfMapFlagOfArrayCaseValue> arrayOfMapFlagOfArrayCaseValue = new LinkedList<>();


List<Double> precision = new LinkedList<>();
arrayOfMapFlagOfArrayCaseValue.add(ArrayOfMapFlagOfArrayCaseValue.fromPrecision(arrayOfMapFlagOfArrayCaseValue0));

sendAnyofArrayOfMapFlagOfArrayInput.getArrayOfMapFlagOfArrayCase().setValue(arrayOfMapFlagOfArrayCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfArrayAsync(sendAnyofArrayOfMapFlagOfArrayInput).thenAccept(result -> {
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
    final SendAnyofArrayOfMapFlagOfMapInput input)
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
SendAnyofArrayOfMapFlagOfMapInput sendAnyofArrayOfMapFlagOfMapInput = new SendAnyofArrayOfMapFlagOfMapInput();
sendAnyofArrayOfMapFlagOfMapInput.setIsPrimitiveType(false);
sendAnyofArrayOfMapFlagOfMapInput.setIsAtEndpointLevel(false);
sendAnyofArrayOfMapFlagOfMapInput.setHasDiscriminator(false);
sendAnyofArrayOfMapFlagOfMapInput.setArrayOfMapFlagOfMapCase(new ArrayOfMapFlagOfMapCase());
List<ArrayOfMapFlagOfMapCaseValue> arrayOfMapFlagOfMapCaseValue = new LinkedList<>();


Map<String, Double> precision = new LinkedHashMap<>();
arrayOfMapFlagOfMapCaseValue.add(ArrayOfMapFlagOfMapCaseValue.fromPrecision(arrayOfMapFlagOfMapCaseValue0));

Map<String, Double> precision = new LinkedHashMap<>();
arrayOfMapFlagOfMapCaseValue.add(ArrayOfMapFlagOfMapCaseValue.fromPrecision(arrayOfMapFlagOfMapCaseValue1));

sendAnyofArrayOfMapFlagOfMapInput.getArrayOfMapFlagOfMapCase().setValue(arrayOfMapFlagOfMapCaseValue);

anyOfPrimitiveTypesInRequestBodyController.sendAnyofArrayOfMapFlagOfMapAsync(sendAnyofArrayOfMapFlagOfMapInput).thenAccept(result -> {
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
    final SendMultiLevelAnyofInput input)
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
SendMultiLevelAnyofInput sendMultiLevelAnyofInput = new SendMultiLevelAnyofInput();
sendMultiLevelAnyofInput.setIsPrimitiveType(false);
sendMultiLevelAnyofInput.setIsAtEndpointLevel(false);
sendMultiLevelAnyofInput.setHasDiscriminator(false);
sendMultiLevelAnyofInput.setMultiLevelAnyOf(new MultiLevelAnyOf());
sendMultiLevelAnyofInput.getMultiLevelAnyOf().setValue(MultiLevelAnyOfValue.fromPrecision(211.14));

anyOfPrimitiveTypesInRequestBodyController.sendMultiLevelAnyofAsync(sendMultiLevelAnyofInput).thenAccept(result -> {
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

