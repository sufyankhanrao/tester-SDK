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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofSimpleAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofOuterArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofOuterMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofOuterArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofOuterMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofInnerMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapsAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
    final boolean isPrimitiveType,
    final boolean isAtEndpointLevel,
    final boolean hasDiscriminator)
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
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfPrimitiveTypesInResponseBodyController.getMultiLevelAnyofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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

