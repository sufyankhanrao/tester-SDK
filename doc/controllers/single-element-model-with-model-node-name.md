# Single Element Model With Model Node Name

```java
SingleElementModelWithModelNodeName singleElementModelWithModelNodeName = client.getSingleElementModelWithModelNodeName();
```

## Class Name

`SingleElementModelWithModelNodeName`

## Methods

* [Generate](/doc/controllers/single-element-model-with-model-node-name.md#generate)
* [Validate](/doc/controllers/single-element-model-with-model-node-name.md#validate)


# Generate

This endpoint returns an XML document that should perfectly map onto the "Simple Elements" model

```java
CompletableFuture<SingleElementWithNodeName> generateAsync()
```

## Response Type

[`SingleElementWithNodeName`](/doc/models/single-element-with-node-name.md)

## Example Usage

```java
singleElementModelWithModelNodeName.generateAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate

This endpoint expects an XML document that should perfectly map onto the "Simple Attributes" model

```java
CompletableFuture<ServerResponse> validateAsync(
    final SingleElementWithNodeName body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SingleElementWithNodeName`](/doc/models/single-element-with-node-name.md) | Body, Required | - |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SingleElementWithNodeName body = new SingleElementWithNodeName();
body.setStringElement("string-element4");

singleElementModelWithModelNodeName.validateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

