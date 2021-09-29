# Header

```java
HeaderController headerController = client.getHeaderController();
```

## Class Name

`HeaderController`


# Send Headers

&lt;testing&gt; Sends a single header params

```java
CompletableFuture<ServerResponse> sendHeadersAsync(
    final String customHeader,
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customHeader` | `String` | Header, Required | &lt;testing&gt; &lt;testing&gt; |
| `value` | `String` | Form, Required | &lt;testing&gt; Represents the value of the custom header |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String customHeader = "custom-header2";
String value = "value2";

headerController.sendHeadersAsync(customHeader, value).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

