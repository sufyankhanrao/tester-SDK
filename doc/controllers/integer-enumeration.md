# Integer Enumeration

```java
IntegerEnumeration integerEnumeration = client.getIntegerEnumeration();
```

## Class Name

`IntegerEnumeration`

## Methods

* [Generate](/doc/controllers/integer-enumeration.md#generate)
* [Validate](/doc/controllers/integer-enumeration.md#validate)


# Generate

Generate

```java
CompletableFuture<IntegerEnum> generateAsync()
```

## Response Type

[`IntegerEnum`](/doc/models/integer-enum.md)

## Example Usage

```java
integerEnumeration.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

validate

```java
CompletableFuture<ServerResponse> validateAsync(
    final IntegerEnum body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`IntegerEnum`](/doc/models/integer-enum.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
IntegerEnum body = IntegerEnum.FOURTYSEVEN;

integerEnumeration.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

