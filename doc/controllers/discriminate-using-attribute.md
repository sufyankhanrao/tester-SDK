# Discriminate Using Attribute

```java
DiscriminateUsingAttribute discriminateUsingAttribute = client.getDiscriminateUsingAttribute();
```

## Class Name

`DiscriminateUsingAttribute`

## Methods

* [Generate](/doc/controllers/discriminate-using-attribute.md#generate)
* [Validate](/doc/controllers/discriminate-using-attribute.md#validate)


# Generate

This endpoint returns a 'Discriminator in Attribute' model as xml.

```java
CompletableFuture<BaseForDiscriminatorInAttribute> generateAsync()
```

## Response Type

[`BaseForDiscriminatorInAttribute`](/doc/models/base-for-discriminator-in-attribute.md)

## Example Usage

```java
discriminateUsingAttribute.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects a 'Discriminator in Attribute' model as xml.

```java
CompletableFuture<ServerResponse> validateAsync(
    final BaseForDiscriminatorInAttribute body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BaseForDiscriminatorInAttribute`](/doc/models/base-for-discriminator-in-attribute.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
BaseForDiscriminatorInAttribute body = new BaseForDiscriminatorInAttribute();
body.setBaseField("Base Field6");

discriminateUsingAttribute.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

