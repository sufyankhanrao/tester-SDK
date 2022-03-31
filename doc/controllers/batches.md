# Batches

Any user with the available permissions can perform a request to manually settle a transaction batch. This is done by using the transactionbatches endpoint with an action of "settle".

```java
BatchesController batchesController = client.getBatchesController();
```

## Class Name

`BatchesController`

## Methods

* [Settle a Batch](../../doc/controllers/batches.md#settle-a-batch)
* [View Single Batch](../../doc/controllers/batches.md#view-single-batch)
* [List All Batches](../../doc/controllers/batches.md#list-all-batches)


# Settle a Batch

Settle a Batch

```java
CompletableFuture<ResponseBatch> settleABatchAsync(
    final String batchId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Batch ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseBatch`](../../doc/models/response-batch.md)

## Example Usage

```java
String batchId = "11e95f8ec39de8fbdb0a4f1a";

batchesController.settleABatchAsync(batchId).thenAccept(result -> {
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


# View Single Batch

View Single Batch

```java
CompletableFuture<ResponseBatch> viewSingleBatchAsync(
    final String batchId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `batchId` | `String` | Template, Required | Batch ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseBatch`](../../doc/models/response-batch.md)

## Example Usage

```java
String batchId = "11e95f8ec39de8fbdb0a4f1a";

batchesController.viewSingleBatchAsync(batchId).thenAccept(result -> {
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


# List All Batches

List All Batches

```java
CompletableFuture<ResponseBatchsCollection> listAllBatchesAsync(
    final Page page,
    final Sort sort,
    final Filter filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort`](../../doc/models/sort.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter`](../../doc/models/filter.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseBatchsCollection`](../../doc/models/response-batchs-collection.md)

## Example Usage

```java
batchesController.listAllBatchesAsync(null, null, null).thenAccept(result -> {
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

