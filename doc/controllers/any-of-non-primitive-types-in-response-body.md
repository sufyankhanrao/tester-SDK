# Any of Non Primitive Types in Response Body

```java
AnyOfNonPrimitiveTypesInResponseBodyController anyOfNonPrimitiveTypesInResponseBodyController = client.getAnyOfNonPrimitiveTypesInResponseBodyController();
```

## Class Name

`AnyOfNonPrimitiveTypesInResponseBodyController`

## Methods

* [Get Anyof Simple](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-simple)
* [Get Anyof Outer Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-outer-array)
* [Get Anyof Inner Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-inner-array)
* [Get Anyof Array of Arrays](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-array-of-arrays)
* [Get Anyof Inner Mixed Arrays](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-inner-mixed-arrays)
* [Get Anyof Array of Mixed Arrays](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-array-of-mixed-arrays)
* [Get Anyof Outer Map](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-outer-map)
* [Get Anyof Inner Map](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-inner-map)
* [Get Anyof Map of Map](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-map-of-map)
* [Get Anyof Inner Mixed Map](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-inner-mixed-map)
* [Get Anyof Map of Inner Mixed Map](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-map-of-inner-mixed-map)
* [Get Anyof Outer Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-outer-array-of-map-flag)
* [Get Anyof Inner Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-inner-array-of-map-flag)
* [Get Anyof Array of Map Flag of Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-array-of-map-flag-of-array-of-map-flag)
* [Get Anyof Inner Mixed Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-inner-mixed-array-of-map-flag)
* [Get Anyof Array of Map Flag of Mixed Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-array-of-map-flag-of-mixed-array-of-map-flag)
* [Get Anyof Outer Map of Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-outer-map-of-array)
* [Get Anyof Inner Map of Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-inner-map-of-array)
* [Get Anyof Map of Array of Map of Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-map-of-array-of-map-of-array)
* [Get Anyof Inner Mixed Map of Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-inner-mixed-map-of-array)
* [Get Anyof Map of Array of Mixed Map of Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-map-of-array-of-mixed-map-of-array)
* [Get Anyof Array of Maps](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-array-of-maps)
* [Get Anyof Array of Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-array-of-array-of-map-flag)
* [Get Anyof Map of Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-map-of-array)
* [Get Anyof Map of Array of Map Flag](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-map-of-array-of-map-flag)
* [Get Anyof Array of Map Flag of Array](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-array-of-map-flag-of-array)
* [Get Anyof Array of Map Flag of Map](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-anyof-array-of-map-flag-of-map)
* [Get Multi Level Anyof](/doc/controllers/any-of-non-primitive-types-in-response-body.md#get-multi-level-anyof)


# Get Anyof Simple

```java
CompletableFuture<GetAnyofSimpleSession> getAnyofSimpleAsync(
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

`GetAnyofSimpleSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofSimpleAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<GetAnyofOuterArraySession>> getAnyofOuterArrayAsync(
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

`List<GetAnyofOuterArraySession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofOuterArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetAnyofInnerArraySession> getAnyofInnerArrayAsync(
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

`GetAnyofInnerArraySession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofInnerArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<GetAnyofArrayOfArraysSession>> getAnyofArrayOfArraysAsync(
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

`List<GetAnyofArrayOfArraysSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofArrayOfArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetAnyofInnerMixedArraysSession> getAnyofInnerMixedArraysAsync(
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

`GetAnyofInnerMixedArraysSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofInnerMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<GetAnyofArrayOfMixedArraysSession>> getAnyofArrayOfMixedArraysAsync(
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

`List<GetAnyofArrayOfMixedArraysSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofArrayOfMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<Map<String, GetAnyofOuterMapSession>> getAnyofOuterMapAsync(
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

`Map<String, GetAnyofOuterMapSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofOuterMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetAnyofInnerMapSession> getAnyofInnerMapAsync(
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

`GetAnyofInnerMapSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofInnerMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<Map<String, GetAnyofMapOfMapSession>> getAnyofMapOfMapAsync(
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

`Map<String, GetAnyofMapOfMapSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofMapOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetAnyofInnerMixedMapSession> getAnyofInnerMixedMapAsync(
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

`GetAnyofInnerMixedMapSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<Map<String, GetAnyofMapOfInnerMixedMapSession>> getAnyofMapOfInnerMixedMapAsync(
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

`Map<String, GetAnyofMapOfInnerMixedMapSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofMapOfInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<Map<String, GetAnyofOuterArrayOfMapFlagSession>>> getAnyofOuterArrayOfMapFlagAsync(
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

`List<Map<String, GetAnyofOuterArrayOfMapFlagSession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofOuterArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetAnyofInnerArrayOfMapFlagSession> getAnyofInnerArrayOfMapFlagAsync(
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

`GetAnyofInnerArrayOfMapFlagSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofInnerArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<Map<String, GetAnyofArrayOfMapFlagOfArrayOfMapFlagSession>>> getAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(
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

`List<Map<String, GetAnyofArrayOfMapFlagOfArrayOfMapFlagSession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetAnyofInnerMixedArrayOfMapFlagSession> getAnyofInnerMixedArrayOfMapFlagAsync(
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

`GetAnyofInnerMixedArrayOfMapFlagSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofInnerMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<Map<String, GetAnyofArrayOfMapFlagOfMixedArrayOfMapFlagSession>>> getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(
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

`List<Map<String, GetAnyofArrayOfMapFlagOfMixedArrayOfMapFlagSession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<Map<String, List<GetAnyofOuterMapOfArraySession>>> getAnyofOuterMapOfArrayAsync(
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

`Map<String, List<GetAnyofOuterMapOfArraySession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofOuterMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetAnyofInnerMapOfArraySession> getAnyofInnerMapOfArrayAsync(
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

`GetAnyofInnerMapOfArraySession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofInnerMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<Map<String, List<GetAnyofMapOfArrayOfMapOfArraySession>>> getAnyofMapOfArrayOfMapOfArrayAsync(
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

`Map<String, List<GetAnyofMapOfArrayOfMapOfArraySession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetAnyofInnerMixedMapOfArraySession> getAnyofInnerMixedMapOfArrayAsync(
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

`GetAnyofInnerMixedMapOfArraySession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofInnerMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<Map<String, List<GetAnyofMapOfArrayOfMixedMapOfArraySession>>> getAnyofMapOfArrayOfMixedMapOfArrayAsync(
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

`Map<String, List<GetAnyofMapOfArrayOfMixedMapOfArraySession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<GetAnyofArrayOfMapsSession>> getAnyofArrayOfMapsAsync(
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

`List<GetAnyofArrayOfMapsSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapsAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<GetAnyofArrayOfArrayOfMapFlagSession>> getAnyofArrayOfArrayOfMapFlagAsync(
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

`List<GetAnyofArrayOfArrayOfMapFlagSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofArrayOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<Map<String, GetAnyofMapOfArraySession>> getAnyofMapOfArrayAsync(
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

`Map<String, GetAnyofMapOfArraySession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<Map<String, GetAnyofMapOfArrayOfMapFlagSession>> getAnyofMapOfArrayOfMapFlagAsync(
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

`Map<String, GetAnyofMapOfArrayOfMapFlagSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofMapOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<Map<String, GetAnyofArrayOfMapFlagOfArraySession>>> getAnyofArrayOfMapFlagOfArrayAsync(
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

`List<Map<String, GetAnyofArrayOfMapFlagOfArraySession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<List<Map<String, GetAnyofArrayOfMapFlagOfMapSession>>> getAnyofArrayOfMapFlagOfMapAsync(
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

`List<Map<String, GetAnyofArrayOfMapFlagOfMapSession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getAnyofArrayOfMapFlagOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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
CompletableFuture<GetMultiLevelAnyofSession> getMultiLevelAnyofAsync(
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

`GetMultiLevelAnyofSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

anyOfNonPrimitiveTypesInResponseBodyController.getMultiLevelAnyofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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

