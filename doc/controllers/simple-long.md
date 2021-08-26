# Simple Long

```java
SimpleLong simpleLong = client.getSimpleLong();
```

## Class Name

`SimpleLong`

## Methods

* [Generate](/doc/controllers/simple-long.md#generate)
* [Validate](/doc/controllers/simple-long.md#validate)


# Generate

Generate

```java
CompletableFuture<Long> generateAsync()
```

## Response Type

`long`

## Example Usage

```java
simpleLong.generateAsync().thenAccept(result -> {
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
    final long body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `long` | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
long body = 8L;

simpleLong.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

