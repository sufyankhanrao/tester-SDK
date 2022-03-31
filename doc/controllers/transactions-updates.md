# Transactions - Updates

```java
TransactionsUpdatesController transactionsUpdatesController = client.getTransactionsUpdatesController();
```

## Class Name

`TransactionsUpdatesController`

## Methods

* [Auth Complete](../../doc/controllers/transactions-updates.md#auth-complete)
* [Auth Increment](../../doc/controllers/transactions-updates.md#auth-increment)
* [Partial Reversal](../../doc/controllers/transactions-updates.md#partial-reversal)
* [Refund Transaction](../../doc/controllers/transactions-updates.md#refund-transaction)
* [Tip Adjustment](../../doc/controllers/transactions-updates.md#tip-adjustment)
* [Void](../../doc/controllers/transactions-updates.md#void)


# Auth Complete

Perform an auth complete transaction

```java
CompletableFuture<ResponseTransaction> authCompleteAsync(
    final String transactionId,
    final V1TransactionsAuthCompleteRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TransactionsAuthCompleteRequest`](../../doc/models/v1-transactions-auth-complete-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
String transactionId = "11e95f8ec39de8fbdb0a4f1a";
V1TransactionsAuthCompleteRequest body = new V1TransactionsAuthCompleteRequest();
body.setTransactionAmount(28.86);

transactionsUpdatesController.authCompleteAsync(transactionId, body).thenAccept(result -> {
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


# Auth Increment

Perform an auth increment transaction

```java
CompletableFuture<ResponseTransaction> authIncrementAsync(
    final String transactionId,
    final V1TransactionsAuthIncrementRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TransactionsAuthIncrementRequest`](../../doc/models/v1-transactions-auth-increment-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
String transactionId = "11e95f8ec39de8fbdb0a4f1a";
V1TransactionsAuthIncrementRequest body = new V1TransactionsAuthIncrementRequest();
body.setTransactionAmount(28.86);

transactionsUpdatesController.authIncrementAsync(transactionId, body).thenAccept(result -> {
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


# Partial Reversal

Perform a partial reversal

```java
CompletableFuture<ResponseTransaction> partialReversalAsync(
    final String transactionId,
    final V1TransactionsPartialReversalRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TransactionsPartialReversalRequest`](../../doc/models/v1-transactions-partial-reversal-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
String transactionId = "11e95f8ec39de8fbdb0a4f1a";
V1TransactionsPartialReversalRequest body = new V1TransactionsPartialReversalRequest();
body.setTransactionAmount(28.86);

transactionsUpdatesController.partialReversalAsync(transactionId, body).thenAccept(result -> {
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


# Refund Transaction

Perform a refund transaction

```java
CompletableFuture<ResponseTransaction> refundTransactionAsync(
    final String transactionId,
    final V1TransactionsRefundRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TransactionsRefundRequest`](../../doc/models/v1-transactions-refund-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
String transactionId = "11e95f8ec39de8fbdb0a4f1a";
V1TransactionsRefundRequest body = new V1TransactionsRefundRequest();
body.setTransactionAmount(28.86);

transactionsUpdatesController.refundTransactionAsync(transactionId, body).thenAccept(result -> {
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


# Tip Adjustment

Increment the authorized transaction amount to include a tip

```java
CompletableFuture<ResponseTransaction> tipAdjustmentAsync(
    final String transactionId,
    final V1TransactionsTipAdjustRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TransactionsTipAdjustRequest`](../../doc/models/v1-transactions-tip-adjust-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
String transactionId = "11e95f8ec39de8fbdb0a4f1a";
V1TransactionsTipAdjustRequest body = new V1TransactionsTipAdjustRequest();
body.setTipAmount(44.08);
body.setTransactionAmount(28.86);

transactionsUpdatesController.tipAdjustmentAsync(transactionId, body).thenAccept(result -> {
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


# Void

Void a transaction

```java
CompletableFuture<ResponseTransaction> voidAsync(
    final String transactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | Transaction ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
String transactionId = "11e95f8ec39de8fbdb0a4f1a";

transactionsUpdatesController.voidAsync(transactionId).thenAccept(result -> {
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

