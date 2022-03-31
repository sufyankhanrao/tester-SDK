# Tokens

The tokens endpoint is used as a tokenization endpoint to store account vault records. If there is a need to store accountvaults (tokens) for account numbers and card numbers for later use, then this is the endpoint to perform that task.

The account_vault_id field can be used in place of the account_number and exp_date fields on most endpoints in the system. So storing an accountvault on this endpoint will allow for the reuse of the account at a later time.

```java
TokensController tokensController = client.getTokensController();
```

## Class Name

`TokensController`

## Methods

* [Create a New ACH Token](../../doc/controllers/tokens.md#create-a-new-ach-token)
* [Create a New Credit Card Token](../../doc/controllers/tokens.md#create-a-new-credit-card-token)
* [Create a New Previous Transaction Token](../../doc/controllers/tokens.md#create-a-new-previous-transaction-token)
* [Create a New Terminal Token](../../doc/controllers/tokens.md#create-a-new-terminal-token)
* [Create a New Ticket Token](../../doc/controllers/tokens.md#create-a-new-ticket-token)
* [Delete a Single Token Record](../../doc/controllers/tokens.md#delete-a-single-token-record)
* [View Single Token Record](../../doc/controllers/tokens.md#view-single-token-record)
* [List All Tokens Related](../../doc/controllers/tokens.md#list-all-tokens-related)
* [Update ACH Token](../../doc/controllers/tokens.md#update-ach-token)
* [Update CC Token](../../doc/controllers/tokens.md#update-cc-token)


# Create a New ACH Token

Create a new ACH Token

```java
CompletableFuture<ResponseToken> createANewACHTokenAsync(
    final V1TokensAchRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TokensAchRequest`](../../doc/models/v1-tokens-ach-request.md) | Body, Required | - |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
V1TokensAchRequest body = new V1TokensAchRequest();
body.setAccountHolderName("John Smith");
body.setAccountNumber("545454545454545");
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setAccountType(AccountType2Enum.SAVINGS);
body.setIsCompany(false);
body.setRouting("100020200");

tokensController.createANewACHTokenAsync(body).thenAccept(result -> {
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


# Create a New Credit Card Token

Create a new Credit Card Token

```java
CompletableFuture<ResponseToken> createANewCreditCardTokenAsync(
    final V1TokensCcRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TokensCcRequest`](../../doc/models/v1-tokens-cc-request.md) | Body, Required | - |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
V1TokensCcRequest body = new V1TokensCcRequest();
body.setAccountNumber("account_number4");
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setExpDate("0929");

tokensController.createANewCreditCardTokenAsync(body).thenAccept(result -> {
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


# Create a New Previous Transaction Token

Create a new Previous Transaction Token

```java
CompletableFuture<ResponseToken> createANewPreviousTransactionTokenAsync(
    final V1TokensPreviousTransactionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TokensPreviousTransactionRequest`](../../doc/models/v1-tokens-previous-transaction-request.md) | Body, Required | - |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
V1TokensPreviousTransactionRequest body = new V1TokensPreviousTransactionRequest();
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setPreviousTransactionId("11e95f8ec39de8fbdb0a4f1a");

tokensController.createANewPreviousTransactionTokenAsync(body).thenAccept(result -> {
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


# Create a New Terminal Token

Create a new Terminal Token

```java
CompletableFuture<ResponseToken> createANewTerminalTokenAsync(
    final V1TokensTerminalRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TokensTerminalRequest`](../../doc/models/v1-tokens-terminal-request.md) | Body, Required | - |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
V1TokensTerminalRequest body = new V1TokensTerminalRequest();
body.setContactId("11e95f8ec39de8fbdb0a4f1a");
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setTerminalId("11e95f8ec39de8fbdb0a4f1a");

tokensController.createANewTerminalTokenAsync(body).thenAccept(result -> {
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


# Create a New Ticket Token

Create a new Ticket Token

```java
CompletableFuture<ResponseToken> createANewTicketTokenAsync(
    final V1TokensTicketRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TokensTicketRequest`](../../doc/models/v1-tokens-ticket-request.md) | Body, Required | - |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
V1TokensTicketRequest body = new V1TokensTicketRequest();
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setTicket("ticket2");

tokensController.createANewTicketTokenAsync(body).thenAccept(result -> {
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


# Delete a Single Token Record

Delete a single token record

```java
CompletableFuture<ResponseToken> deleteASingleTokenRecordAsync(
    final String tokenId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tokenId` | `String` | Template, Required | A unique, system-generated identifier for the Token.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
String tokenId = "11e95f8ec39de8fbdb0a4f1a";

tokensController.deleteASingleTokenRecordAsync(tokenId).thenAccept(result -> {
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


# View Single Token Record

View single token record

```java
CompletableFuture<ResponseToken> viewSingleTokenRecordAsync(
    final String tokenId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tokenId` | `String` | Template, Required | A unique, system-generated identifier for the Token.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
String tokenId = "11e95f8ec39de8fbdb0a4f1a";

tokensController.viewSingleTokenRecordAsync(tokenId).thenAccept(result -> {
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


# List All Tokens Related

List all tokens related

```java
CompletableFuture<ResponseTokensCollection> listAllTokensRelatedAsync(
    final Page page,
    final Sort10 sort,
    final Filter10 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort10`](../../doc/models/sort-10.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter10`](../../doc/models/filter-10.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseTokensCollection`](../../doc/models/response-tokens-collection.md)

## Example Usage

```java
tokensController.listAllTokensRelatedAsync(null, null, null).thenAccept(result -> {
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


# Update ACH Token

Update ACH Token

```java
CompletableFuture<ResponseToken> updateACHTokenAsync(
    final String tokenId,
    final V1TokensAchRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tokenId` | `String` | Template, Required | A unique, system-generated identifier for the Token.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TokensAchRequest1`](../../doc/models/v1-tokens-ach-request-1.md) | Body, Required | - |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
String tokenId = "11e95f8ec39de8fbdb0a4f1a";
V1TokensAchRequest1 body = new V1TokensAchRequest1();

tokensController.updateACHTokenAsync(tokenId, body).thenAccept(result -> {
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


# Update CC Token

Update CC Token

```java
CompletableFuture<ResponseToken> updateCCTokenAsync(
    final String tokenId,
    final V1TokensCcRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tokenId` | `String` | Template, Required | A unique, system-generated identifier for the Token.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TokensCcRequest1`](../../doc/models/v1-tokens-cc-request-1.md) | Body, Required | - |

## Response Type

[`ResponseToken`](../../doc/models/response-token.md)

## Example Usage

```java
String tokenId = "11e95f8ec39de8fbdb0a4f1a";
V1TokensCcRequest1 body = new V1TokensCcRequest1();

tokensController.updateCCTokenAsync(tokenId, body).thenAccept(result -> {
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

