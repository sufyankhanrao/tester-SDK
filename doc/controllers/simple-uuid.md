# Simple UUID

```java
SimpleUUID simpleUUID = client.getSimpleUUID();
```

## Class Name

`SimpleUUID`

## Methods

* [Generate](/doc/controllers/simple-uuid.md#generate)
* [Validate](/doc/controllers/simple-uuid.md#validate)


# Generate

Generate

```java
CompletableFuture<UUID> generateAsync()
```

## Response Type

`UUID`

## Example Usage

```java
simpleUUID.generateAsync().thenAccept(result -> {
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
    final UUID body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `UUID` | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
UUID body = UUID.fromString("00000df8-0000-0000-0000-000000000000");

simpleUUID.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

