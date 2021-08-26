# Simple Integer

```java
SimpleInteger simpleInteger = client.getSimpleInteger();
```

## Class Name

`SimpleInteger`

## Methods

* [Generate](/doc/controllers/simple-integer.md#generate)
* [Validate](/doc/controllers/simple-integer.md#validate)


# Generate

Generate

```java
CompletableFuture<Integer> generateAsync()
```

## Response Type

`int`

## Example Usage

```java
simpleInteger.generateAsync().thenAccept(result -> {
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
    final int body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `int` | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
int body = 8;

simpleInteger.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

