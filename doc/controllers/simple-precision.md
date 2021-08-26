# Simple Precision

```java
SimplePrecision simplePrecision = client.getSimplePrecision();
```

## Class Name

`SimplePrecision`

## Methods

* [Generate](/doc/controllers/simple-precision.md#generate)
* [Validate](/doc/controllers/simple-precision.md#validate)


# Generate

Generate

```java
CompletableFuture<Double> generateAsync()
```

## Response Type

`double`

## Example Usage

```java
simplePrecision.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

Validate

```java
CompletableFuture<ServerResponse> validateAsync(
    final double body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `double` | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
double body = 135.76;

simplePrecision.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

