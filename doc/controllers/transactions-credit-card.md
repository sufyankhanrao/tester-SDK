# Transactions - Credit Card

```java
TransactionsCreditCardController transactionsCreditCardController = client.getTransactionsCreditCardController();
```

## Class Name

`TransactionsCreditCardController`

## Methods

* [CC Auth Only](../../doc/controllers/transactions-credit-card.md#cc-auth-only)
* [CC Auth Only - Tokenized](../../doc/controllers/transactions-credit-card.md#cc-auth-only-tokenized)
* [CC AVS](../../doc/controllers/transactions-credit-card.md#cc-avs)
* [CC AVS - Tokenized](../../doc/controllers/transactions-credit-card.md#cc-avs-tokenized)
* [CC Force](../../doc/controllers/transactions-credit-card.md#cc-force)
* [CC Force - Tokenized](../../doc/controllers/transactions-credit-card.md#cc-force-tokenized)
* [CC Refund](../../doc/controllers/transactions-credit-card.md#cc-refund)
* [CC Refund - Tokenized](../../doc/controllers/transactions-credit-card.md#cc-refund-tokenized)
* [CC Sale](../../doc/controllers/transactions-credit-card.md#cc-sale)
* [CC Sale - Terminal](../../doc/controllers/transactions-credit-card.md#cc-sale-terminal)
* [CC Sale - Tokenized](../../doc/controllers/transactions-credit-card.md#cc-sale-tokenized)


# CC Auth Only

Create a new keyed Credit Card authorization only transaction

```java
CompletableFuture<ResponseTransaction> cCAuthOnlyAsync(
    final V1TransactionsCcAuthOnlyKeyedRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcAuthOnlyKeyedRequest`](../../doc/models/v1-transactions-cc-auth-only-keyed-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcAuthOnlyKeyedRequest body = new V1TransactionsCcAuthOnlyKeyedRequest();
body.setTransactionAmount(28.86);
body.setAccountNumber("account_number4");
body.setExpDate("0722");

transactionsCreditCardController.cCAuthOnlyAsync(body).thenAccept(result -> {
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


# CC Auth Only - Tokenized

Create a new tokenized Credit Card authorization only transaction

```java
CompletableFuture<ResponseTransaction> cCAuthOnlyTokenizedAsync(
    final V1TransactionsCcAuthOnlyTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcAuthOnlyTokenRequest`](../../doc/models/v1-transactions-cc-auth-only-token-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcAuthOnlyTokenRequest body = new V1TransactionsCcAuthOnlyTokenRequest();
body.setTransactionAmount(28.86);
body.setAccountVaultId("11e95f8ec39de8fbdb0a4f1a");

transactionsCreditCardController.cCAuthOnlyTokenizedAsync(body).thenAccept(result -> {
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


# CC AVS

Create a new keyed Credit Card AVS only transaction

```java
CompletableFuture<ResponseTransaction> cCAVSAsync(
    final V1TransactionsCcAvsOnlyKeyedRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcAvsOnlyKeyedRequest`](../../doc/models/v1-transactions-cc-avs-only-keyed-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcAvsOnlyKeyedRequest body = new V1TransactionsCcAvsOnlyKeyedRequest();
body.setTransactionAmount(28.86);
body.setAccountNumber("account_number4");
body.setExpDate("0722");

transactionsCreditCardController.cCAVSAsync(body).thenAccept(result -> {
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


# CC AVS - Tokenized

Create a new tokenized Credit Card AVS only transaction

```java
CompletableFuture<ResponseTransaction> cCAVSTokenizedAsync(
    final V1TransactionsCcAvsOnlyTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcAvsOnlyTokenRequest`](../../doc/models/v1-transactions-cc-avs-only-token-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcAvsOnlyTokenRequest body = new V1TransactionsCcAvsOnlyTokenRequest();
body.setTransactionAmount(28.86);
body.setAccountVaultId("11e95f8ec39de8fbdb0a4f1a");

transactionsCreditCardController.cCAVSTokenizedAsync(body).thenAccept(result -> {
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


# CC Force

Create a new keyed Credit Card force transaction

```java
CompletableFuture<ResponseTransaction> cCForceAsync(
    final V1TransactionsCcForceKeyedRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcForceKeyedRequest`](../../doc/models/v1-transactions-cc-force-keyed-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcForceKeyedRequest body = new V1TransactionsCcForceKeyedRequest();
body.setTransactionAmount(28.86);
body.setAccountNumber("account_number4");
body.setExpDate("0722");
body.setAuthCode("auth_code2");

transactionsCreditCardController.cCForceAsync(body).thenAccept(result -> {
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


# CC Force - Tokenized

Create a new tokenized Credit Card force transaction

```java
CompletableFuture<ResponseTransaction> cCForceTokenizedAsync(
    final V1TransactionsCcForceTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcForceTokenRequest`](../../doc/models/v1-transactions-cc-force-token-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcForceTokenRequest body = new V1TransactionsCcForceTokenRequest();
body.setTransactionAmount(28.86);
body.setAccountVaultId("11e95f8ec39de8fbdb0a4f1a");

transactionsCreditCardController.cCForceTokenizedAsync(body).thenAccept(result -> {
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


# CC Refund

Create a new keyed Credit Card refund transaction

```java
CompletableFuture<ResponseTransaction> cCRefundAsync(
    final V1TransactionsCcRefundKeyedRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcRefundKeyedRequest`](../../doc/models/v1-transactions-cc-refund-keyed-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcRefundKeyedRequest body = new V1TransactionsCcRefundKeyedRequest();
body.setTransactionAmount(28.86);
body.setAccountNumber("account_number4");
body.setExpDate("0722");

transactionsCreditCardController.cCRefundAsync(body).thenAccept(result -> {
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


# CC Refund - Tokenized

Create a new tokenized Credit Card refund transaction

```java
CompletableFuture<ResponseTransaction> cCRefundTokenizedAsync(
    final V1TransactionsCcRefundTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcRefundTokenRequest`](../../doc/models/v1-transactions-cc-refund-token-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcRefundTokenRequest body = new V1TransactionsCcRefundTokenRequest();
body.setTransactionAmount(28.86);
body.setAccountVaultId("11e95f8ec39de8fbdb0a4f1a");

transactionsCreditCardController.cCRefundTokenizedAsync(body).thenAccept(result -> {
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


# CC Sale

Create a new keyed Credit Card sale transaction

```java
CompletableFuture<ResponseTransaction> cCSaleAsync(
    final V1TransactionsCcSaleKeyedRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcSaleKeyedRequest`](../../doc/models/v1-transactions-cc-sale-keyed-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcSaleKeyedRequest body = new V1TransactionsCcSaleKeyedRequest();
body.setTransactionAmount(28.86);
body.setAccountNumber("account_number4");
body.setExpDate("0722");

transactionsCreditCardController.cCSaleAsync(body).thenAccept(result -> {
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


# CC Sale - Terminal

Create a new terminal Credit Card sale transaction

```java
CompletableFuture<ResponseTransactionProcessing> cCSaleTerminalAsync(
    final V1TransactionsCcSaleTerminalRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcSaleTerminalRequest`](../../doc/models/v1-transactions-cc-sale-terminal-request.md) | Body, Required | - |

## Response Type

[`ResponseTransactionProcessing`](../../doc/models/response-transaction-processing.md)

## Example Usage

```java
V1TransactionsCcSaleTerminalRequest body = new V1TransactionsCcSaleTerminalRequest();
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setTerminalId("11e95f8ec39de8fbdb0a4f1a");
body.setTransactionAmount(28.86);

transactionsCreditCardController.cCSaleTerminalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "type": "TransactionProcessing",
  "data": {
    "async": {
      "code": "406c66c3-21cb-47fb-80fc-843bc42507fb",
      "link": "/v1/async/status/406c66c3-21cb-47fb-80fc-843bc42507fb"
    }
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |
| 412 | Precondition Failed | [`Response412Exception`](../../doc/models/response-412-exception.md) |


# CC Sale - Tokenized

Create a new tokenized Credit Card sale transaction

```java
CompletableFuture<ResponseTransaction> cCSaleTokenizedAsync(
    final V1TransactionsCcSaleTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsCcSaleTokenRequest`](../../doc/models/v1-transactions-cc-sale-token-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsCcSaleTokenRequest body = new V1TransactionsCcSaleTokenRequest();
body.setTransactionAmount(28.86);
body.setAccountVaultId("11e95f8ec39de8fbdb0a4f1a");

transactionsCreditCardController.cCSaleTokenizedAsync(body).thenAccept(result -> {
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

