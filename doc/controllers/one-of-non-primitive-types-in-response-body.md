# One of Non Primitive Types in Response Body

```java
OneOfNonPrimitiveTypesInResponseBodyController oneOfNonPrimitiveTypesInResponseBodyController = client.getOneOfNonPrimitiveTypesInResponseBodyController();
```

## Class Name

`OneOfNonPrimitiveTypesInResponseBodyController`

## Methods

* [Get Oneof Simple](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-simple)
* [Get Oneof Outer Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-outer-array)
* [Get Oneof Inner Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-inner-array)
* [Get Oneof Array of Arrays](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-array-of-arrays)
* [Get Oneof Inner Mixed Arrays](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-inner-mixed-arrays)
* [Get Oneof Array of Mixed Arrays](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-array-of-mixed-arrays)
* [Get Oneof Outer Map](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-outer-map)
* [Get Oneof Inner Map](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-inner-map)
* [Get Oneof Map of Map](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-map-of-map)
* [Get Oneof Inner Mixed Map](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-inner-mixed-map)
* [Get Oneof Map of Inner Mixed Map](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-map-of-inner-mixed-map)
* [Get Oneof Outer Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-outer-array-of-map-flag)
* [Get Oneof Inner Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-inner-array-of-map-flag)
* [Get Oneof Array of Map Flag of Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-array-of-map-flag-of-array-of-map-flag)
* [Get Oneof Inner Mixed Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-inner-mixed-array-of-map-flag)
* [Get Oneof Array of Map Flag of Mixed Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-array-of-map-flag-of-mixed-array-of-map-flag)
* [Get Oneof Outer Map of Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-outer-map-of-array)
* [Get Oneof Inner Map of Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-inner-map-of-array)
* [Get Oneof Map of Array of Map of Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-map-of-array-of-map-of-array)
* [Get Oneof Inner Mixed Map of Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-inner-mixed-map-of-array)
* [Get Oneof Map of Array of Mixed Map of Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-map-of-array-of-mixed-map-of-array)
* [Get Oneof Array of Maps](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-array-of-maps)
* [Get Oneof Array of Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-array-of-array-of-map-flag)
* [Get Oneof Map of Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-map-of-array)
* [Get Oneof Map of Array of Map Flag](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-map-of-array-of-map-flag)
* [Get Oneof Array of Map Flag of Array](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-array-of-map-flag-of-array)
* [Get Oneof Array of Map Flag of Map](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-oneof-array-of-map-flag-of-map)
* [Get Multi Level Oneof](/doc/controllers/one-of-non-primitive-types-in-response-body.md#get-multi-level-oneof)


# Get Oneof Simple

```java
CompletableFuture<GetOneofSimpleSession> getOneofSimpleAsync(
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

`GetOneofSimpleSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofSimpleAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Outer Array

```java
CompletableFuture<List<GetOneofOuterArraySession>> getOneofOuterArrayAsync(
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

`List<GetOneofOuterArraySession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofOuterArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Inner Array

```java
CompletableFuture<GetOneofInnerArraySession> getOneofInnerArrayAsync(
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

`GetOneofInnerArraySession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofInnerArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Array of Arrays

```java
CompletableFuture<List<GetOneofArrayOfArraysSession>> getOneofArrayOfArraysAsync(
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

`List<GetOneofArrayOfArraysSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofArrayOfArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Inner Mixed Arrays

```java
CompletableFuture<GetOneofInnerMixedArraysSession> getOneofInnerMixedArraysAsync(
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

`GetOneofInnerMixedArraysSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofInnerMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Array of Mixed Arrays

```java
CompletableFuture<List<GetOneofArrayOfMixedArraysSession>> getOneofArrayOfMixedArraysAsync(
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

`List<GetOneofArrayOfMixedArraysSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofArrayOfMixedArraysAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Outer Map

```java
CompletableFuture<Map<String, GetOneofOuterMapSession>> getOneofOuterMapAsync(
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

`Map<String, GetOneofOuterMapSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofOuterMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Inner Map

```java
CompletableFuture<GetOneofInnerMapSession> getOneofInnerMapAsync(
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

`GetOneofInnerMapSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofInnerMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Map of Map

```java
CompletableFuture<Map<String, GetOneofMapOfMapSession>> getOneofMapOfMapAsync(
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

`Map<String, GetOneofMapOfMapSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofMapOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Inner Mixed Map

```java
CompletableFuture<GetOneofInnerMixedMapSession> getOneofInnerMixedMapAsync(
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

`GetOneofInnerMixedMapSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Map of Inner Mixed Map

```java
CompletableFuture<Map<String, GetOneofMapOfInnerMixedMapSession>> getOneofMapOfInnerMixedMapAsync(
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

`Map<String, GetOneofMapOfInnerMixedMapSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofMapOfInnerMixedMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Outer Array of Map Flag

```java
CompletableFuture<List<Map<String, GetOneofOuterArrayOfMapFlagSession>>> getOneofOuterArrayOfMapFlagAsync(
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

`List<Map<String, GetOneofOuterArrayOfMapFlagSession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofOuterArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Inner Array of Map Flag

```java
CompletableFuture<GetOneofInnerArrayOfMapFlagSession> getOneofInnerArrayOfMapFlagAsync(
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

`GetOneofInnerArrayOfMapFlagSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofInnerArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Array of Map Flag of Array of Map Flag

```java
CompletableFuture<List<Map<String, GetOneofArrayOfMapFlagOfArrayOfMapFlagSession>>> getOneofArrayOfMapFlagOfArrayOfMapFlagAsync(
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

`List<Map<String, GetOneofArrayOfMapFlagOfArrayOfMapFlagSession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofArrayOfMapFlagOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Inner Mixed Array of Map Flag

```java
CompletableFuture<GetOneofInnerMixedArrayOfMapFlagSession> getOneofInnerMixedArrayOfMapFlagAsync(
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

`GetOneofInnerMixedArrayOfMapFlagSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofInnerMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Array of Map Flag of Mixed Array of Map Flag

```java
CompletableFuture<List<Map<String, GetOneofArrayOfMapFlagOfMixedArrayOfMapFlagSession>>> getOneofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(
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

`List<Map<String, GetOneofArrayOfMapFlagOfMixedArrayOfMapFlagSession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofArrayOfMapFlagOfMixedArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Outer Map of Array

```java
CompletableFuture<Map<String, List<GetOneofOuterMapOfArraySession>>> getOneofOuterMapOfArrayAsync(
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

`Map<String, List<GetOneofOuterMapOfArraySession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofOuterMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Inner Map of Array

```java
CompletableFuture<GetOneofInnerMapOfArraySession> getOneofInnerMapOfArrayAsync(
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

`GetOneofInnerMapOfArraySession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofInnerMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Map of Array of Map of Array

```java
CompletableFuture<Map<String, List<GetOneofMapOfArrayOfMapOfArraySession>>> getOneofMapOfArrayOfMapOfArrayAsync(
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

`Map<String, List<GetOneofMapOfArrayOfMapOfArraySession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofMapOfArrayOfMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Inner Mixed Map of Array

```java
CompletableFuture<GetOneofInnerMixedMapOfArraySession> getOneofInnerMixedMapOfArrayAsync(
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

`GetOneofInnerMixedMapOfArraySession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofInnerMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Map of Array of Mixed Map of Array

```java
CompletableFuture<Map<String, List<GetOneofMapOfArrayOfMixedMapOfArraySession>>> getOneofMapOfArrayOfMixedMapOfArrayAsync(
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

`Map<String, List<GetOneofMapOfArrayOfMixedMapOfArraySession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofMapOfArrayOfMixedMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Array of Maps

```java
CompletableFuture<List<GetOneofArrayOfMapsSession>> getOneofArrayOfMapsAsync(
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

`List<GetOneofArrayOfMapsSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofArrayOfMapsAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Array of Array of Map Flag

```java
CompletableFuture<List<GetOneofArrayOfArrayOfMapFlagSession>> getOneofArrayOfArrayOfMapFlagAsync(
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

`List<GetOneofArrayOfArrayOfMapFlagSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofArrayOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Map of Array

```java
CompletableFuture<Map<String, GetOneofMapOfArraySession>> getOneofMapOfArrayAsync(
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

`Map<String, GetOneofMapOfArraySession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofMapOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Map of Array of Map Flag

```java
CompletableFuture<Map<String, GetOneofMapOfArrayOfMapFlagSession>> getOneofMapOfArrayOfMapFlagAsync(
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

`Map<String, GetOneofMapOfArrayOfMapFlagSession>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofMapOfArrayOfMapFlagAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Array of Map Flag of Array

```java
CompletableFuture<List<Map<String, GetOneofArrayOfMapFlagOfArraySession>>> getOneofArrayOfMapFlagOfArrayAsync(
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

`List<Map<String, GetOneofArrayOfMapFlagOfArraySession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofArrayOfMapFlagOfArrayAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Oneof Array of Map Flag of Map

```java
CompletableFuture<List<Map<String, GetOneofArrayOfMapFlagOfMapSession>>> getOneofArrayOfMapFlagOfMapAsync(
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

`List<Map<String, GetOneofArrayOfMapFlagOfMapSession>>`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getOneofArrayOfMapFlagOfMapAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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


# Get Multi Level Oneof

```java
CompletableFuture<GetMultiLevelOneofSession> getMultiLevelOneofAsync(
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

`GetMultiLevelOneofSession`

## Example Usage

```java
boolean isPrimitiveType = false;
boolean isAtEndpointLevel = false;
boolean hasDiscriminator = false;

oneOfNonPrimitiveTypesInResponseBodyController.getMultiLevelOneofAsync(isPrimitiveType, isAtEndpointLevel, hasDiscriminator).thenAccept(result -> {
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

