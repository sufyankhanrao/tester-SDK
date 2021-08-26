# Simple String

```java
SimpleString simpleString = client.getSimpleString();
```

## Class Name

`SimpleString`

## Methods

* [Generate](/doc/controllers/simple-string.md#generate)
* [Validate](/doc/controllers/simple-string.md#validate)
* [Generate Array](/doc/controllers/simple-string.md#generate-array)
* [Validate Array](/doc/controllers/simple-string.md#validate-array)


# Generate

Generate

```java
CompletableFuture<String> generateAsync()
```

## Response Type

`String`

## Example Usage

```java
simpleString.generateAsync().thenAccept(result -> {
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
    final String body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `String` | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String body = "body6";

simpleString.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Generate Array

Generate

```java
CompletableFuture<List<String>> generateArrayAsync()
```

## Response Type

`List<String>`

## Example Usage

```java
simpleString.generateArrayAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate Array

Validate

```java
CompletableFuture<ServerResponse> validateArrayAsync(
    final List<String> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `List<String>` | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<String> body = new LinkedList<>();
body.add("body4");
body.add("body5");

simpleString.validateArrayAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

