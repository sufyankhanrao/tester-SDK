# Transactions - Read

```java
TransactionsReadController transactionsReadController = client.getTransactionsReadController();
```

## Class Name

`TransactionsReadController`

## Methods

* [Get BIN Info](../../doc/controllers/transactions-read.md#get-bin-info)
* [Get Transaction](../../doc/controllers/transactions-read.md#get-transaction)
* [List Transactions](../../doc/controllers/transactions-read.md#list-transactions)


# Get BIN Info

Get BIN info record associated with a transaction

```java
CompletableFuture<ResponseTransaction> getBINInfoAsync(
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

transactionsReadController.getBINInfoAsync(transactionId).thenAccept(result -> {
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


# Get Transaction

Get single transaction record

```java
CompletableFuture<ResponseTransaction> getTransactionAsync(
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

transactionsReadController.getTransactionAsync(transactionId).thenAccept(result -> {
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


# List Transactions

List transactions

```java
CompletableFuture<ResponseTransactionsCollection> listTransactionsAsync(
    final Page page,
    final Sort11 sort,
    final Filter11 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort11`](../../doc/models/sort-11.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter11`](../../doc/models/filter-11.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseTransactionsCollection`](../../doc/models/response-transactions-collection.md)

## Example Usage

```java
transactionsReadController.listTransactionsAsync(null, null, null).thenAccept(result -> {
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

