# String Enumeration

```java
StringEnumeration stringEnumeration = client.getStringEnumeration();
```

## Class Name

`StringEnumeration`

## Methods

* [Generate](/doc/controllers/string-enumeration.md#generate)
* [Validate](/doc/controllers/string-enumeration.md#validate)


# Generate

Generate

```java
CompletableFuture<StringEnum> generateAsync()
```

## Response Type

[`StringEnum`](/doc/models/string-enum.md)

## Example Usage

```java
stringEnumeration.generateAsync().thenAccept(result -> {
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
    final StringEnum body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`StringEnum`](/doc/models/string-enum.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
StringEnum body = StringEnum.VALID_STRING;

stringEnumeration.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

