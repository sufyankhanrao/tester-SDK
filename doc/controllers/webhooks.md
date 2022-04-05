# Webhooks

```java
WebhooksController webhooksController = client.getWebhooksController();
```

## Class Name

`WebhooksController`

## Methods

* [Create a New Transaction Batch Postback Config](../../doc/controllers/webhooks.md#create-a-new-transaction-batch-postback-config)
* [Create a New Contact Postback Config](../../doc/controllers/webhooks.md#create-a-new-contact-postback-config)
* [Create a New Transaction Postback Config](../../doc/controllers/webhooks.md#create-a-new-transaction-postback-config)
* [Delete a Postback Config](../../doc/controllers/webhooks.md#delete-a-postback-config)
* [Update Transaction Batch Postback Config](../../doc/controllers/webhooks.md#update-transaction-batch-postback-config)
* [Update Contact Postback Config](../../doc/controllers/webhooks.md#update-contact-postback-config)
* [Update Transaction Postback Config](../../doc/controllers/webhooks.md#update-transaction-postback-config)


# Create a New Transaction Batch Postback Config

Create a new transaction batch postback config

```java
CompletableFuture<ResponseWebhook> createANewTransactionBatchPostbackConfigAsync(
    final V1WebhooksBatchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1WebhooksBatchRequest`](../../doc/models/v1-webhooks-batch-request.md) | Body, Required | - |

## Response Type

[`ResponseWebhook`](../../doc/models/response-webhook.md)

## Example Usage

```java
V1WebhooksBatchRequest body = new V1WebhooksBatchRequest();
body.setIsActive(false);
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setOnCreate(OnCreateEnum.ENUM_1);
body.setOnUpdate(OnUpdateEnum.ENUM_1);
body.setOnDelete(OnDeleteEnum.ENUM_1);
body.setProductTransactionId("11e95f8ec39de8fbdb0a4f1a");
body.setNumberOfAttempts(1);
body.setUrl("https://127.0.0.1/receiver");

webhooksController.createANewTransactionBatchPostbackConfigAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |
| 412 | Precondition Failed | [`Response412Exception`](../../doc/models/response-412-exception.md) |


# Create a New Contact Postback Config

Create a new contact postback config

```java
CompletableFuture<ResponseWebhook> createANewContactPostbackConfigAsync(
    final V1WebhooksContactRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1WebhooksContactRequest`](../../doc/models/v1-webhooks-contact-request.md) | Body, Required | - |

## Response Type

[`ResponseWebhook`](../../doc/models/response-webhook.md)

## Example Usage

```java
V1WebhooksContactRequest body = new V1WebhooksContactRequest();
body.setIsActive(false);
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setOnCreate(OnCreateEnum.ENUM_1);
body.setOnUpdate(OnUpdateEnum.ENUM_1);
body.setOnDelete(OnDeleteEnum.ENUM_1);
body.setNumberOfAttempts(1);
body.setUrl("https://127.0.0.1/receiver");

webhooksController.createANewContactPostbackConfigAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |
| 412 | Precondition Failed | [`Response412Exception`](../../doc/models/response-412-exception.md) |


# Create a New Transaction Postback Config

Create a new transaction postback config

```java
CompletableFuture<ResponseWebhook> createANewTransactionPostbackConfigAsync(
    final V1WebhooksTransactionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1WebhooksTransactionRequest`](../../doc/models/v1-webhooks-transaction-request.md) | Body, Required | - |

## Response Type

[`ResponseWebhook`](../../doc/models/response-webhook.md)

## Example Usage

```java
V1WebhooksTransactionRequest body = new V1WebhooksTransactionRequest();
body.setIsActive(false);
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setOnCreate(OnCreateEnum.ENUM_1);
body.setOnUpdate(OnUpdateEnum.ENUM_1);
body.setOnDelete(OnDeleteEnum.ENUM_1);
body.setProductTransactionId("11e95f8ec39de8fbdb0a4f1a");
body.setNumberOfAttempts(1);
body.setUrl("https://127.0.0.1/receiver");

webhooksController.createANewTransactionPostbackConfigAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |
| 412 | Precondition Failed | [`Response412Exception`](../../doc/models/response-412-exception.md) |


# Delete a Postback Config

Delete a postback config

```java
CompletableFuture<ResponseWebhook> deleteAPostbackConfigAsync(
    final String webhookId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `webhookId` | `String` | Template, Required | Postback Config ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseWebhook`](../../doc/models/response-webhook.md)

## Example Usage

```java
String webhookId = "11e95f8ec39de8fbdb0a4f1a";

webhooksController.deleteAPostbackConfigAsync(webhookId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |


# Update Transaction Batch Postback Config

Update transaction batch postback config

```java
CompletableFuture<ResponseWebhook> updateTransactionBatchPostbackConfigAsync(
    final String webhookId,
    final V1WebhooksBatchRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `webhookId` | `String` | Template, Required | Postback Config ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1WebhooksBatchRequest1`](../../doc/models/v1-webhooks-batch-request-1.md) | Body, Required | - |

## Response Type

[`ResponseWebhook`](../../doc/models/response-webhook.md)

## Example Usage

```java
String webhookId = "11e95f8ec39de8fbdb0a4f1a";
V1WebhooksBatchRequest1 body = new V1WebhooksBatchRequest1();

webhooksController.updateTransactionBatchPostbackConfigAsync(webhookId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |
| 412 | Precondition Failed | [`Response412Exception`](../../doc/models/response-412-exception.md) |


# Update Contact Postback Config

Update contact postback config

```java
CompletableFuture<ResponseWebhook> updateContactPostbackConfigAsync(
    final String webhookId,
    final V1WebhooksContactRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `webhookId` | `String` | Template, Required | Postback Config ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1WebhooksContactRequest1`](../../doc/models/v1-webhooks-contact-request-1.md) | Body, Required | - |

## Response Type

[`ResponseWebhook`](../../doc/models/response-webhook.md)

## Example Usage

```java
String webhookId = "11e95f8ec39de8fbdb0a4f1a";
V1WebhooksContactRequest1 body = new V1WebhooksContactRequest1();

webhooksController.updateContactPostbackConfigAsync(webhookId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |
| 412 | Precondition Failed | [`Response412Exception`](../../doc/models/response-412-exception.md) |


# Update Transaction Postback Config

Update transaction postback config

```java
CompletableFuture<ResponseWebhook> updateTransactionPostbackConfigAsync(
    final String webhookId,
    final V1WebhooksTransactionRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `webhookId` | `String` | Template, Required | Postback Config ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1WebhooksTransactionRequest1`](../../doc/models/v1-webhooks-transaction-request-1.md) | Body, Required | - |

## Response Type

[`ResponseWebhook`](../../doc/models/response-webhook.md)

## Example Usage

```java
String webhookId = "11e95f8ec39de8fbdb0a4f1a";
V1WebhooksTransactionRequest1 body = new V1WebhooksTransactionRequest1();

webhooksController.updateTransactionPostbackConfigAsync(webhookId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |
| 412 | Precondition Failed | [`Response412Exception`](../../doc/models/response-412-exception.md) |

