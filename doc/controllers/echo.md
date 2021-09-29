# Echo

```java
EchoController echoController = client.getEchoController();
```

## Class Name

`EchoController`

## Methods

* [Json Echo](/doc/controllers/echo.md#json-echo)
* [Form Echo](/doc/controllers/echo.md#form-echo)
* [Query Echo](/doc/controllers/echo.md#query-echo)


# Json Echo

&lt;testing&gt; Echo's back the request

```java
CompletableFuture<DynamicResponse> jsonEchoAsync(
    final Object input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | `Object` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

`DynamicResponse`

## Example Usage

```java
Object input = localhost3000.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}");

echoController.jsonEchoAsync(input).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Form Echo

&lt;testing&gt; Sends the request including any form params as JSON

```java
CompletableFuture<DynamicResponse> formEchoAsync(
    final Object input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | `Object` | Form, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

`DynamicResponse`

## Example Usage

```java
Object input = localhost3000.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}");

echoController.formEchoAsync(input).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Query Echo

```java
CompletableFuture<EchoResponse> queryEchoAsync(
    final Map<String, Object> queryParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `queryParameters` | `Map<String, Object>` | Optional | Pass additional query parameters. |

## Response Type

[`EchoResponse`](/doc/models/echo-response.md)

## Example Usage

```java
LinkedHashMap<String, Object> queryParameters = new LinkedHashMap<>();
queryParameters.put("key0", "additionalQueryParams2");

echoController.queryEchoAsync(queryParameters).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

