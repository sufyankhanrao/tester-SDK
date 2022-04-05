# Transactions - ACH

```java
TransactionsACHController transactionsACHController = client.getTransactionsACHController();
```

## Class Name

`TransactionsACHController`

## Methods

* [ACH Credit](../../doc/controllers/transactions-ach.md#ach-credit)
* [ACH Credit - Tokenized](../../doc/controllers/transactions-ach.md#ach-credit-tokenized)
* [ACH Debit](../../doc/controllers/transactions-ach.md#ach-debit)
* [ACH Debit - Tokenized](../../doc/controllers/transactions-ach.md#ach-debit-tokenized)


# ACH Credit

Create a new keyed ACH credit transaction

```java
CompletableFuture<ResponseTransaction> aCHCreditAsync(
    final V1TransactionsAchCreditKeyedRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsAchCreditKeyedRequest`](../../doc/models/v1-transactions-ach-credit-keyed-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsAchCreditKeyedRequest body = new V1TransactionsAchCreditKeyedRequest();
body.setTransactionAmount(28.86);
body.setAchSecCode("C21");
body.setAccountHolderName("smith");
body.setAccountNumber("24345");
body.setAccountType(AccountType6Enum.CHECKING);
body.setRouting("051904524");

transactionsACHController.aCHCreditAsync(body).thenAccept(result -> {
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


# ACH Credit - Tokenized

Create a new tokenized ACH credit transaction

```java
CompletableFuture<ResponseTransaction> aCHCreditTokenizedAsync(
    final V1TransactionsAchCreditTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsAchCreditTokenRequest`](../../doc/models/v1-transactions-ach-credit-token-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsAchCreditTokenRequest body = new V1TransactionsAchCreditTokenRequest();
body.setTransactionAmount(28.86);
body.setAccountVaultId("11e95f8ec39de8fbdb0a4f1a");

transactionsACHController.aCHCreditTokenizedAsync(body).thenAccept(result -> {
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


# ACH Debit

Create a new keyed ACH debit transaction

```java
CompletableFuture<ResponseTransaction> aCHDebitAsync(
    final V1TransactionsAchDebitKeyedRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsAchDebitKeyedRequest`](../../doc/models/v1-transactions-ach-debit-keyed-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsAchDebitKeyedRequest body = new V1TransactionsAchDebitKeyedRequest();
body.setTransactionAmount(28.86);
body.setAchSecCode("C21");
body.setAccountHolderName("smith");
body.setAccountNumber("24345");
body.setAccountType(AccountType6Enum.CHECKING);
body.setRouting("051904524");

transactionsACHController.aCHDebitAsync(body).thenAccept(result -> {
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


# ACH Debit - Tokenized

Create a new tokenized ACH debit transaction

```java
CompletableFuture<ResponseTransaction> aCHDebitTokenizedAsync(
    final V1TransactionsAchDebitTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsAchDebitTokenRequest`](../../doc/models/v1-transactions-ach-debit-token-request.md) | Body, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsAchDebitTokenRequest body = new V1TransactionsAchDebitTokenRequest();
body.setTransactionAmount(28.86);
body.setAccountVaultId("11e95f8ec39de8fbdb0a4f1a");

transactionsACHController.aCHDebitTokenizedAsync(body).thenAccept(result -> {
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

