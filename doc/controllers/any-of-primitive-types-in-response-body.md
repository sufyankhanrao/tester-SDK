# Any of Primitive Types in Response Body

```java
AnyOfPrimitiveTypesInResponseBodyController anyOfPrimitiveTypesInResponseBodyController = client.getAnyOfPrimitiveTypesInResponseBodyController();
```

## Class Name

`AnyOfPrimitiveTypesInResponseBodyController`

## Methods

* [Get Anyof Simple](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-simple)
* [Get Anyof Outer Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-outer-array)
* [Get Anyof Inner Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-inner-array)
* [Get Anyof Array of Arrays](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-array-of-arrays)
* [Get Anyof Inner Mixed Arrays](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-inner-mixed-arrays)
* [Get Anyof Array of Mixed Arrays](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-array-of-mixed-arrays)
* [Get Anyof Outer Map](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-outer-map)
* [Get Anyof Inner Map](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-inner-map)
* [Get Anyof Map of Map](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-map-of-map)
* [Get Anyof Inner Mixed Map](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-inner-mixed-map)
* [Get Anyof Map of Inner Mixed Map](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-map-of-inner-mixed-map)
* [Get Anyof Outer Array of Map Flag](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-outer-array-of-map-flag)
* [Get Anyof Inner Array of Map Flag](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-inner-array-of-map-flag)
* [Get Anyof Array of Map Flag of Array of Map Flag](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-array-of-map-flag-of-array-of-map-flag)
* [Get Anyof Inner Mixed Array of Map Flag](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-inner-mixed-array-of-map-flag)
* [Get Anyof Array of Map Flag of Mixed Array of Map Flag](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-array-of-map-flag-of-mixed-array-of-map-flag)
* [Get Anyof Outer Map of Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-outer-map-of-array)
* [Get Anyof Inner Map of Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-inner-map-of-array)
* [Get Anyof Map of Array of Map of Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-map-of-array-of-map-of-array)
* [Get Anyof Inner Mixed Map of Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-inner-mixed-map-of-array)
* [Get Anyof Map of Array of Mixed Map of Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-map-of-array-of-mixed-map-of-array)
* [Get Anyof Array of Maps](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-array-of-maps)
* [Get Anyof Array of Array of Map Flag](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-array-of-array-of-map-flag)
* [Get Anyof Map of Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-map-of-array)
* [Get Anyof Map of Array of Map Flag](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-map-of-array-of-map-flag)
* [Get Anyof Array of Map Flag of Array](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-array-of-map-flag-of-array)
* [Get Anyof Array of Map Flag of Map](/doc/controllers/any-of-primitive-types-in-response-body.md#get-anyof-array-of-map-flag-of-map)
* [Get Multi Level Anyof](/doc/controllers/any-of-primitive-types-in-response-body.md#get-multi-level-anyof)


# Get Anyof Simple

```java
CompletableFuture<SimpleCase> getAnyofSimpleAsync(
    final GetAnyofSimpleInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`SimpleCase`](/doc/models/simple-case.md)

## Example Usage

```java
GetAnyofSimpleInput getAnyofSimpleInput = new GetAnyofSimpleInput();
getAnyofSimpleInput.setIsPrimitiveType(false);
getAnyofSimpleInput.setIsAtEndpointLevel(false);
getAnyofSimpleInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofSimpleAsync(getAnyofSimpleInput).thenAccept(result -> {
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


# Get Anyof Outer Array

```java
CompletableFuture<OuterArrayCase> getAnyofOuterArrayAsync(
    final GetAnyofOuterArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`OuterArrayCase`](/doc/models/outer-array-case.md)

## Example Usage

```java
GetAnyofOuterArrayInput getAnyofOuterArrayInput = new GetAnyofOuterArrayInput();
getAnyofOuterArrayInput.setIsPrimitiveType(false);
getAnyofOuterArrayInput.setIsAtEndpointLevel(false);
getAnyofOuterArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofOuterArrayAsync(getAnyofOuterArrayInput).thenAccept(result -> {
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


# Get Anyof Inner Array

```java
CompletableFuture<InnerArrayCase> getAnyofInnerArrayAsync(
    final GetAnyofInnerArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`InnerArrayCase`](/doc/models/inner-array-case.md)

## Example Usage

```java
GetAnyofInnerArrayInput getAnyofInnerArrayInput = new GetAnyofInnerArrayInput();
getAnyofInnerArrayInput.setIsPrimitiveType(false);
getAnyofInnerArrayInput.setIsAtEndpointLevel(false);
getAnyofInnerArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerArrayAsync(getAnyofInnerArrayInput).thenAccept(result -> {
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


# Get Anyof Array of Arrays

```java
CompletableFuture<ArrayOfArraysCase> getAnyofArrayOfArraysAsync(
    final GetAnyofArrayOfArraysInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`ArrayOfArraysCase`](/doc/models/array-of-arrays-case.md)

## Example Usage

```java
GetAnyofArrayOfArraysInput getAnyofArrayOfArraysInput = new GetAnyofArrayOfArraysInput();
getAnyofArrayOfArraysInput.setIsPrimitiveType(false);
getAnyofArrayOfArraysInput.setIsAtEndpointLevel(false);
getAnyofArrayOfArraysInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfArraysAsync(getAnyofArrayOfArraysInput).thenAccept(result -> {
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


# Get Anyof Inner Mixed Arrays

```java
CompletableFuture<InnerMixedArrayCase> getAnyofInnerMixedArraysAsync(
    final GetAnyofInnerMixedArraysInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`InnerMixedArrayCase`](/doc/models/inner-mixed-array-case.md)

## Example Usage

```java
GetAnyofInnerMixedArraysInput getAnyofInnerMixedArraysInput = new GetAnyofInnerMixedArraysInput();
getAnyofInnerMixedArraysInput.setIsPrimitiveType(false);
getAnyofInnerMixedArraysInput.setIsAtEndpointLevel(false);
getAnyofInnerMixedArraysInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMixedArraysAsync(getAnyofInnerMixedArraysInput).thenAccept(result -> {
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


# Get Anyof Array of Mixed Arrays

```java
CompletableFuture<ArrayOfMixedArrayCase> getAnyofArrayOfMixedArraysAsync(
    final GetAnyofArrayOfMixedArraysInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`ArrayOfMixedArrayCase`](/doc/models/array-of-mixed-array-case.md)

## Example Usage

```java
GetAnyofArrayOfMixedArraysInput getAnyofArrayOfMixedArraysInput = new GetAnyofArrayOfMixedArraysInput();
getAnyofArrayOfMixedArraysInput.setIsPrimitiveType(false);
getAnyofArrayOfMixedArraysInput.setIsAtEndpointLevel(false);
getAnyofArrayOfMixedArraysInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMixedArraysAsync(getAnyofArrayOfMixedArraysInput).thenAccept(result -> {
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


# Get Anyof Outer Map

```java
CompletableFuture<OuterMapCase> getAnyofOuterMapAsync(
    final GetAnyofOuterMapInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`OuterMapCase`](/doc/models/outer-map-case.md)

## Example Usage

```java
GetAnyofOuterMapInput getAnyofOuterMapInput = new GetAnyofOuterMapInput();
getAnyofOuterMapInput.setIsPrimitiveType(false);
getAnyofOuterMapInput.setIsAtEndpointLevel(false);
getAnyofOuterMapInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofOuterMapAsync(getAnyofOuterMapInput).thenAccept(result -> {
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


# Get Anyof Inner Map

```java
CompletableFuture<InnerMapCase> getAnyofInnerMapAsync(
    final GetAnyofInnerMapInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`InnerMapCase`](/doc/models/inner-map-case.md)

## Example Usage

```java
GetAnyofInnerMapInput getAnyofInnerMapInput = new GetAnyofInnerMapInput();
getAnyofInnerMapInput.setIsPrimitiveType(false);
getAnyofInnerMapInput.setIsAtEndpointLevel(false);
getAnyofInnerMapInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMapAsync(getAnyofInnerMapInput).thenAccept(result -> {
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


# Get Anyof Map of Map

```java
CompletableFuture<MapOfMapsCase> getAnyofMapOfMapAsync(
    final GetAnyofMapOfMapInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MapOfMapsCase`](/doc/models/map-of-maps-case.md)

## Example Usage

```java
GetAnyofMapOfMapInput getAnyofMapOfMapInput = new GetAnyofMapOfMapInput();
getAnyofMapOfMapInput.setIsPrimitiveType(false);
getAnyofMapOfMapInput.setIsAtEndpointLevel(false);
getAnyofMapOfMapInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfMapAsync(getAnyofMapOfMapInput).thenAccept(result -> {
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


# Get Anyof Inner Mixed Map

```java
CompletableFuture<InnerMixedMapCase> getAnyofInnerMixedMapAsync(
    final GetAnyofInnerMixedMapInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`InnerMixedMapCase`](/doc/models/inner-mixed-map-case.md)

## Example Usage

```java
GetAnyofInnerMixedMapInput getAnyofInnerMixedMapInput = new GetAnyofInnerMixedMapInput();
getAnyofInnerMixedMapInput.setIsPrimitiveType(false);
getAnyofInnerMixedMapInput.setIsAtEndpointLevel(false);
getAnyofInnerMixedMapInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMixedMapAsync(getAnyofInnerMixedMapInput).thenAccept(result -> {
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


# Get Anyof Map of Inner Mixed Map

```java
CompletableFuture<MapOfMixedMapCase> getAnyofMapOfInnerMixedMapAsync(
    final GetAnyofMapOfInnerMixedMapInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MapOfMixedMapCase`](/doc/models/map-of-mixed-map-case.md)

## Example Usage

```java
GetAnyofMapOfInnerMixedMapInput getAnyofMapOfInnerMixedMapInput = new GetAnyofMapOfInnerMixedMapInput();
getAnyofMapOfInnerMixedMapInput.setIsPrimitiveType(false);
getAnyofMapOfInnerMixedMapInput.setIsAtEndpointLevel(false);
getAnyofMapOfInnerMixedMapInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfInnerMixedMapAsync(getAnyofMapOfInnerMixedMapInput).thenAccept(result -> {
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


# Get Anyof Outer Array of Map Flag

```java
CompletableFuture<OuterArrayOfMapFlagCase> getAnyofOuterArrayOfMapFlagAsync(
    final GetAnyofOuterArrayOfMapFlagInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`OuterArrayOfMapFlagCase`](/doc/models/outer-array-of-map-flag-case.md)

## Example Usage

```java
GetAnyofOuterArrayOfMapFlagInput getAnyofOuterArrayOfMapFlagInput = new GetAnyofOuterArrayOfMapFlagInput();
getAnyofOuterArrayOfMapFlagInput.setIsPrimitiveType(false);
getAnyofOuterArrayOfMapFlagInput.setIsAtEndpointLevel(false);
getAnyofOuterArrayOfMapFlagInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofOuterArrayOfMapFlagAsync(getAnyofOuterArrayOfMapFlagInput).thenAccept(result -> {
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


# Get Anyof Inner Array of Map Flag

```java
CompletableFuture<InnerArrayOfMapFlagCase> getAnyofInnerArrayOfMapFlagAsync(
    final GetAnyofInnerArrayOfMapFlagInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`InnerArrayOfMapFlagCase`](/doc/models/inner-array-of-map-flag-case.md)

## Example Usage

```java
GetAnyofInnerArrayOfMapFlagInput getAnyofInnerArrayOfMapFlagInput = new GetAnyofInnerArrayOfMapFlagInput();
getAnyofInnerArrayOfMapFlagInput.setIsPrimitiveType(false);
getAnyofInnerArrayOfMapFlagInput.setIsAtEndpointLevel(false);
getAnyofInnerArrayOfMapFlagInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerArrayOfMapFlagAsync(getAnyofInnerArrayOfMapFlagInput).thenAccept(result -> {
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


# Get Anyof Array of Map Flag of Array of Map Flag

```java
CompletableFuture<ArrayOfMapFlagOfInnerArrayOfMapFlagCase> getAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(
    final GetAnyofArrayOfMapFlagOfArrayOfMapFlagInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`ArrayOfMapFlagOfInnerArrayOfMapFlagCase`](/doc/models/array-of-map-flag-of-inner-array-of-map-flag-case.md)

## Example Usage

```java
GetAnyofArrayOfMapFlagOfArrayOfMapFlagInput getAnyofArrayOfMapFlagOfArrayOfMapFlagInput = new GetAnyofArrayOfMapFlagOfArrayOfMapFlagInput();
getAnyofArrayOfMapFlagOfArrayOfMapFlagInput.setIsPrimitiveType(false);
getAnyofArrayOfMapFlagOfArrayOfMapFlagInput.setIsAtEndpointLevel(false);
getAnyofArrayOfMapFlagOfArrayOfMapFlagInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(getAnyofArrayOfMapFlagOfArrayOfMapFlagInput).thenAccept(result -> {
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


# Get Anyof Inner Mixed Array of Map Flag

```java
CompletableFuture<MixedArrayOfMapFlagCase> getAnyofInnerMixedArrayOfMapFlagAsync(
    final GetAnyofInnerMixedArrayOfMapFlagInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MixedArrayOfMapFlagCase`](/doc/models/mixed-array-of-map-flag-case.md)

## Example Usage

```java
GetAnyofInnerMixedArrayOfMapFlagInput getAnyofInnerMixedArrayOfMapFlagInput = new GetAnyofInnerMixedArrayOfMapFlagInput();
getAnyofInnerMixedArrayOfMapFlagInput.setIsPrimitiveType(false);
getAnyofInnerMixedArrayOfMapFlagInput.setIsAtEndpointLevel(false);
getAnyofInnerMixedArrayOfMapFlagInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMixedArrayOfMapFlagAsync(getAnyofInnerMixedArrayOfMapFlagInput).thenAccept(result -> {
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


# Get Anyof Array of Map Flag of Mixed Array of Map Flag

```java
CompletableFuture<ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase> getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(
    final GetAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase`](/doc/models/array-of-map-flag-of-inner-mixed-array-of-map-flag-case.md)

## Example Usage

```java
GetAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput = new GetAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput();
getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput.setIsPrimitiveType(false);
getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput.setIsAtEndpointLevel(false);
getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagInput).thenAccept(result -> {
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


# Get Anyof Outer Map of Array

```java
CompletableFuture<OuterMapOfArrayCase> getAnyofOuterMapOfArrayAsync(
    final GetAnyofOuterMapOfArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`OuterMapOfArrayCase`](/doc/models/outer-map-of-array-case.md)

## Example Usage

```java
GetAnyofOuterMapOfArrayInput getAnyofOuterMapOfArrayInput = new GetAnyofOuterMapOfArrayInput();
getAnyofOuterMapOfArrayInput.setIsPrimitiveType(false);
getAnyofOuterMapOfArrayInput.setIsAtEndpointLevel(false);
getAnyofOuterMapOfArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofOuterMapOfArrayAsync(getAnyofOuterMapOfArrayInput).thenAccept(result -> {
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


# Get Anyof Inner Map of Array

```java
CompletableFuture<InnerMapOfArrayCase> getAnyofInnerMapOfArrayAsync(
    final GetAnyofInnerMapOfArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`InnerMapOfArrayCase`](/doc/models/inner-map-of-array-case.md)

## Example Usage

```java
GetAnyofInnerMapOfArrayInput getAnyofInnerMapOfArrayInput = new GetAnyofInnerMapOfArrayInput();
getAnyofInnerMapOfArrayInput.setIsPrimitiveType(false);
getAnyofInnerMapOfArrayInput.setIsAtEndpointLevel(false);
getAnyofInnerMapOfArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMapOfArrayAsync(getAnyofInnerMapOfArrayInput).thenAccept(result -> {
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


# Get Anyof Map of Array of Map of Array

```java
CompletableFuture<MapOfArrayOfInnerMapOfArrayCase> getAnyofMapOfArrayOfMapOfArrayAsync(
    final GetAnyofMapOfArrayOfMapOfArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MapOfArrayOfInnerMapOfArrayCase`](/doc/models/map-of-array-of-inner-map-of-array-case.md)

## Example Usage

```java
GetAnyofMapOfArrayOfMapOfArrayInput getAnyofMapOfArrayOfMapOfArrayInput = new GetAnyofMapOfArrayOfMapOfArrayInput();
getAnyofMapOfArrayOfMapOfArrayInput.setIsPrimitiveType(false);
getAnyofMapOfArrayOfMapOfArrayInput.setIsAtEndpointLevel(false);
getAnyofMapOfArrayOfMapOfArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMapOfArrayAsync(getAnyofMapOfArrayOfMapOfArrayInput).thenAccept(result -> {
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


# Get Anyof Inner Mixed Map of Array

```java
CompletableFuture<MixedMapOfArrayCase> getAnyofInnerMixedMapOfArrayAsync(
    final GetAnyofInnerMixedMapOfArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MixedMapOfArrayCase`](/doc/models/mixed-map-of-array-case.md)

## Example Usage

```java
GetAnyofInnerMixedMapOfArrayInput getAnyofInnerMixedMapOfArrayInput = new GetAnyofInnerMixedMapOfArrayInput();
getAnyofInnerMixedMapOfArrayInput.setIsPrimitiveType(false);
getAnyofInnerMixedMapOfArrayInput.setIsAtEndpointLevel(false);
getAnyofInnerMixedMapOfArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMixedMapOfArrayAsync(getAnyofInnerMixedMapOfArrayInput).thenAccept(result -> {
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


# Get Anyof Map of Array of Mixed Map of Array

```java
CompletableFuture<MapOfArrayOfInnerMixedMapOfArrayCase> getAnyofMapOfArrayOfMixedMapOfArrayAsync(
    final GetAnyofMapOfArrayOfMixedMapOfArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MapOfArrayOfInnerMixedMapOfArrayCase`](/doc/models/map-of-array-of-inner-mixed-map-of-array-case.md)

## Example Usage

```java
GetAnyofMapOfArrayOfMixedMapOfArrayInput getAnyofMapOfArrayOfMixedMapOfArrayInput = new GetAnyofMapOfArrayOfMixedMapOfArrayInput();
getAnyofMapOfArrayOfMixedMapOfArrayInput.setIsPrimitiveType(false);
getAnyofMapOfArrayOfMixedMapOfArrayInput.setIsAtEndpointLevel(false);
getAnyofMapOfArrayOfMixedMapOfArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMixedMapOfArrayAsync(getAnyofMapOfArrayOfMixedMapOfArrayInput).thenAccept(result -> {
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


# Get Anyof Array of Maps

```java
CompletableFuture<ArrayOfMapsCase> getAnyofArrayOfMapsAsync(
    final GetAnyofArrayOfMapsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`ArrayOfMapsCase`](/doc/models/array-of-maps-case.md)

## Example Usage

```java
GetAnyofArrayOfMapsInput getAnyofArrayOfMapsInput = new GetAnyofArrayOfMapsInput();
getAnyofArrayOfMapsInput.setIsPrimitiveType(false);
getAnyofArrayOfMapsInput.setIsAtEndpointLevel(false);
getAnyofArrayOfMapsInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapsAsync(getAnyofArrayOfMapsInput).thenAccept(result -> {
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


# Get Anyof Array of Array of Map Flag

```java
CompletableFuture<ArrayOfArrayOfMapFlagCase> getAnyofArrayOfArrayOfMapFlagAsync(
    final GetAnyofArrayOfArrayOfMapFlagInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`ArrayOfArrayOfMapFlagCase`](/doc/models/array-of-array-of-map-flag-case.md)

## Example Usage

```java
GetAnyofArrayOfArrayOfMapFlagInput getAnyofArrayOfArrayOfMapFlagInput = new GetAnyofArrayOfArrayOfMapFlagInput();
getAnyofArrayOfArrayOfMapFlagInput.setIsPrimitiveType(false);
getAnyofArrayOfArrayOfMapFlagInput.setIsAtEndpointLevel(false);
getAnyofArrayOfArrayOfMapFlagInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfArrayOfMapFlagAsync(getAnyofArrayOfArrayOfMapFlagInput).thenAccept(result -> {
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


# Get Anyof Map of Array

```java
CompletableFuture<MapOfArraysCase> getAnyofMapOfArrayAsync(
    final GetAnyofMapOfArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MapOfArraysCase`](/doc/models/map-of-arrays-case.md)

## Example Usage

```java
GetAnyofMapOfArrayInput getAnyofMapOfArrayInput = new GetAnyofMapOfArrayInput();
getAnyofMapOfArrayInput.setIsPrimitiveType(false);
getAnyofMapOfArrayInput.setIsAtEndpointLevel(false);
getAnyofMapOfArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayAsync(getAnyofMapOfArrayInput).thenAccept(result -> {
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


# Get Anyof Map of Array of Map Flag

```java
CompletableFuture<MapOfArrayOfMapFlagCase> getAnyofMapOfArrayOfMapFlagAsync(
    final GetAnyofMapOfArrayOfMapFlagInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MapOfArrayOfMapFlagCase`](/doc/models/map-of-array-of-map-flag-case.md)

## Example Usage

```java
GetAnyofMapOfArrayOfMapFlagInput getAnyofMapOfArrayOfMapFlagInput = new GetAnyofMapOfArrayOfMapFlagInput();
getAnyofMapOfArrayOfMapFlagInput.setIsPrimitiveType(false);
getAnyofMapOfArrayOfMapFlagInput.setIsAtEndpointLevel(false);
getAnyofMapOfArrayOfMapFlagInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMapFlagAsync(getAnyofMapOfArrayOfMapFlagInput).thenAccept(result -> {
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


# Get Anyof Array of Map Flag of Array

```java
CompletableFuture<ArrayOfMapFlagOfArrayCase> getAnyofArrayOfMapFlagOfArrayAsync(
    final GetAnyofArrayOfMapFlagOfArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`ArrayOfMapFlagOfArrayCase`](/doc/models/array-of-map-flag-of-array-case.md)

## Example Usage

```java
GetAnyofArrayOfMapFlagOfArrayInput getAnyofArrayOfMapFlagOfArrayInput = new GetAnyofArrayOfMapFlagOfArrayInput();
getAnyofArrayOfMapFlagOfArrayInput.setIsPrimitiveType(false);
getAnyofArrayOfMapFlagOfArrayInput.setIsAtEndpointLevel(false);
getAnyofArrayOfMapFlagOfArrayInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfArrayAsync(getAnyofArrayOfMapFlagOfArrayInput).thenAccept(result -> {
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


# Get Anyof Array of Map Flag of Map

```java
CompletableFuture<ArrayOfMapFlagOfMapCase> getAnyofArrayOfMapFlagOfMapAsync(
    final GetAnyofArrayOfMapFlagOfMapInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`ArrayOfMapFlagOfMapCase`](/doc/models/array-of-map-flag-of-map-case.md)

## Example Usage

```java
GetAnyofArrayOfMapFlagOfMapInput getAnyofArrayOfMapFlagOfMapInput = new GetAnyofArrayOfMapFlagOfMapInput();
getAnyofArrayOfMapFlagOfMapInput.setIsPrimitiveType(false);
getAnyofArrayOfMapFlagOfMapInput.setIsAtEndpointLevel(false);
getAnyofArrayOfMapFlagOfMapInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfMapAsync(getAnyofArrayOfMapFlagOfMapInput).thenAccept(result -> {
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


# Get Multi Level Anyof

```java
CompletableFuture<MultiLevelAnyOf> getMultiLevelAnyofAsync(
    final GetMultiLevelAnyofInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `isPrimitiveType` | `boolean` | Query, Required | - |
| `isAtEndpointLevel` | `boolean` | Query, Required | - |
| `hasDiscriminator` | `boolean` | Query, Required | - |

## Response Type

[`MultiLevelAnyOf`](/doc/models/multi-level-any-of.md)

## Example Usage

```java
GetMultiLevelAnyofInput getMultiLevelAnyofInput = new GetMultiLevelAnyofInput();
getMultiLevelAnyofInput.setIsPrimitiveType(false);
getMultiLevelAnyofInput.setIsAtEndpointLevel(false);
getMultiLevelAnyofInput.setHasDiscriminator(false);

anyOfPrimitiveTypesInResponseBodyController.getMultiLevelAnyofAsync(getMultiLevelAnyofInput).thenAccept(result -> {
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

