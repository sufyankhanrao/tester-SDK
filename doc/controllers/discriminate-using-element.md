# Discriminate Using Element

```java
DiscriminateUsingElement discriminateUsingElement = client.getDiscriminateUsingElement();
```

## Class Name

`DiscriminateUsingElement`

## Methods

* [Generate](/doc/controllers/discriminate-using-element.md#generate)
* [Validate](/doc/controllers/discriminate-using-element.md#validate)


# Generate

This endpoint returns a 'Discriminator in Element' model as xml.

```java
CompletableFuture<BaseForDiscriminatorInElement> generateAsync()
```

## Response Type

[`BaseForDiscriminatorInElement`](/doc/models/base-for-discriminator-in-element.md)

## Example Usage

```java
discriminateUsingElement.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects a 'Discriminator in Element' model as xml.

```java
CompletableFuture<ServerResponse> validateAsync(
    final BaseForDiscriminatorInElement body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BaseForDiscriminatorInElement`](/doc/models/base-for-discriminator-in-element.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
BaseForDiscriminatorInElement body = new BaseForDiscriminatorInElement();
body.setBaseField("Base Field6");

discriminateUsingElement.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

