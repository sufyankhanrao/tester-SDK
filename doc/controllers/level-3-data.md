# Level 3 Data

The Level 3 Data endpoint is used to create/update/retrieve/delete Level 3 Data associated with a transaction.

For Locations/Merchants that have Level 3 Data enabled:

1. The Level 3 Data endpoint can be used to supply all the extra data necessary to help qualify the transactions. The Level 3 Data is submitted the same for every processor, but is submitted differently for Visa vs Mastercard transactions (see examples below).
2. The initial Level 3 Data is submitted by the API up front.
   1. Each transaction that is run with a commercial (or purchasing) card will have default Level 3 Data sent to the processor. This is helpful so that even if a merchant doesn't update the transaction with the necessary Level 3 Data, it will still contain a basic record of Level 3 Data to help with the qualifications.
3. If a merchant needs to update the Level 3 Data to supply more specific information, this is done by an additional POST request to the `/v1/transactions/{transaction_id}/level3/{card_type}` endpoint.
   1. Every POST will overwrite any previous Level 3 Data submitted for the transaction.
      1. Additional POSTs will need to contain ALL the Level 3 Data that needs to be submitted to the processor.
      2. Omitting a previously supplied value will clear that value from the transaction record.

If you are not sure if you can use the Level 3 Data endpoint, perform these steps to determine whether you are able:

1. Run a transaction.

2. Once the initial transaction is complete, submit a GET request to:
   
   `/v1/transactions/{transaction_id}?expand=transaction_level3`

3. You should get a response with typical transaction data, but you should also notice an extra field in the response called "transaction_level3".

4. If the transaction_level3 field has Level 3 Data then you can use the Level 3 Data endpoint.

5. If this field is null then you cannot use the Level 3 Data endpoint.

### Industry Support by Processor

| Industry         | TSYS     | FirstData | Vantiv   |
|------------------|----------|-----------|----------|
| Retail           | &#10003; | &#10003;  | &#10003; |
| Ecommerce        | &#10003; | &#10003;  | &#10003; |
| Direct Marketing | &#10003; | &#10003;  | &#10003; |
| Lodging          |          | &#10003;  |          |

```java
Level3DataController level3DataController = client.getLevel3DataController();
```

## Class Name

`Level3DataController`

## Methods

* [Create a New Level 3 Entry for a Master Card](../../doc/controllers/level-3-data.md#create-a-new-level-3-entry-for-a-master-card)
* [Create a New Level 3 Entry for a Visa](../../doc/controllers/level-3-data.md#create-a-new-level-3-entry-for-a-visa)
* [Delete a Single Level 3 Record](../../doc/controllers/level-3-data.md#delete-a-single-level-3-record)
* [View Single Level 3 Record](../../doc/controllers/level-3-data.md#view-single-level-3-record)


# Create a New Level 3 Entry for a Master Card

Create a new Level3 entry for a MasterCard

```java
CompletableFuture<ResponseTransaction> createANewLevel3EntryForAMasterCardAsync(
    final V1TransactionsLevel3MasterCardRequest body,
    final String transactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsLevel3MasterCardRequest`](../../doc/models/v1-transactions-level-3-master-card-request.md) | Body, Required | - |
| `transactionId` | `String` | Template, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsLevel3MasterCardRequest body = new V1TransactionsLevel3MasterCardRequest();
body.setLevel3Data(new Level3Data());
String transactionId = "transaction_id8";

level3DataController.createANewLevel3EntryForAMasterCardAsync(body, transactionId).thenAccept(result -> {
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


# Create a New Level 3 Entry for a Visa

Create a new Level3 entry for a Visa

```java
CompletableFuture<ResponseTransaction> createANewLevel3EntryForAVisaAsync(
    final V1TransactionsLevel3VisaRequest body,
    final String transactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TransactionsLevel3VisaRequest`](../../doc/models/v1-transactions-level-3-visa-request.md) | Body, Required | - |
| `transactionId` | `String` | Template, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
V1TransactionsLevel3VisaRequest body = new V1TransactionsLevel3VisaRequest();
body.setLevel3Data(new Level3Data1());
String transactionId = "transaction_id8";

level3DataController.createANewLevel3EntryForAVisaAsync(body, transactionId).thenAccept(result -> {
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


# Delete a Single Level 3 Record

Delete a single level3 record

```java
CompletableFuture<ResponseTransaction> deleteASingleLevel3RecordAsync(
    final String transactionId,
    final String level3Id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | - |
| `level3Id` | `String` | Template, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
String transactionId = "transaction_id8";
String level3Id = "level3_id6";

level3DataController.deleteASingleLevel3RecordAsync(transactionId, level3Id).thenAccept(result -> {
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


# View Single Level 3 Record

View single level3 record

```java
CompletableFuture<ResponseTransaction> viewSingleLevel3RecordAsync(
    final String transactionId,
    final String level3Id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | - |
| `level3Id` | `String` | Template, Required | - |

## Response Type

[`ResponseTransaction`](../../doc/models/response-transaction.md)

## Example Usage

```java
String transactionId = "transaction_id8";
String level3Id = "level3_id6";

level3DataController.viewSingleLevel3RecordAsync(transactionId, level3Id).thenAccept(result -> {
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

