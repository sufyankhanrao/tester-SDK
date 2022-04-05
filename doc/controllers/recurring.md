# Recurring

The recurrings endpoint is used to run a recurring transaction one or more times. There are two different types of recurrings:

1. **ongoing** (recurring_type_id="o") - a recurring that runs until it is deleted or an end date has been set.
2. **installment** (recurring_type_id="i") - a recurring that runs a fixed number of times, regardless of approval or decline.

When setting up a reccuring, it isn't necessarily linked directly to a contact, it is linked to an account vault through the account_vault_id or account_vault_api_id field. The account vault is then in turn linked to a contact. So in order to create a recurring, you must first create a contact, then create an account vault for that contact. Then the id of the account vault can be used for the recurring as account_vault_id.

```java
RecurringController recurringController = client.getRecurringController();
```

## Class Name

`RecurringController`

## Methods

* [Create a New Recurring Record](../../doc/controllers/recurring.md#create-a-new-recurring-record)
* [List All Recurring Record](../../doc/controllers/recurring.md#list-all-recurring-record)
* [Delete Recurring Record](../../doc/controllers/recurring.md#delete-recurring-record)
* [View Single Recurring Record](../../doc/controllers/recurring.md#view-single-recurring-record)
* [Update Recurring Payment](../../doc/controllers/recurring.md#update-recurring-payment)
* [Activate Recurring Payment](../../doc/controllers/recurring.md#activate-recurring-payment)
* [Defer Recurring Payment](../../doc/controllers/recurring.md#defer-recurring-payment)
* [Place on Hold Recurring Payment](../../doc/controllers/recurring.md#place-on-hold-recurring-payment)
* [Skip Recurring Payment](../../doc/controllers/recurring.md#skip-recurring-payment)


# Create a New Recurring Record

Create a new recurring record

```java
CompletableFuture<ResponseRecurring> createANewRecurringRecordAsync(
    final V1RecurringsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1RecurringsRequest`](../../doc/models/v1-recurrings-request.md) | Body, Required | - |

## Response Type

[`ResponseRecurring`](../../doc/models/response-recurring.md)

## Example Usage

```java
V1RecurringsRequest body = new V1RecurringsRequest();
body.setAccountVaultId("11e95f8ec39de8fbdb0a4f1a");
body.setInterval(1);
body.setIntervalType(IntervalTypeEnum.D);
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setStartDate("2021-12-01");
body.setTransactionAmount(3);

recurringController.createANewRecurringRecordAsync(body).thenAccept(result -> {
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


# List All Recurring Record

List all recurring record

```java
CompletableFuture<ResponseRecurringsCollection> listAllRecurringRecordAsync(
    final Page page,
    final Sort6 sort,
    final Filter6 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort6`](../../doc/models/sort-6.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter6`](../../doc/models/filter-6.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseRecurringsCollection`](../../doc/models/response-recurrings-collection.md)

## Example Usage

```java
recurringController.listAllRecurringRecordAsync(null, null, null).thenAccept(result -> {
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


# Delete Recurring Record

Delete recurring record

```java
CompletableFuture<ResponseRecurring> deleteRecurringRecordAsync(
    final String recurringId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recurringId` | `String` | Template, Required | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseRecurring`](../../doc/models/response-recurring.md)

## Example Usage

```java
String recurringId = "11e95f8ec39de8fbdb0a4f1a";

recurringController.deleteRecurringRecordAsync(recurringId).thenAccept(result -> {
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


# View Single Recurring Record

View single recurring record

```java
CompletableFuture<ResponseRecurring> viewSingleRecurringRecordAsync(
    final String recurringId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recurringId` | `String` | Template, Required | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseRecurring`](../../doc/models/response-recurring.md)

## Example Usage

```java
String recurringId = "11e95f8ec39de8fbdb0a4f1a";

recurringController.viewSingleRecurringRecordAsync(recurringId).thenAccept(result -> {
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


# Update Recurring Payment

Update recurring payment

```java
CompletableFuture<ResponseRecurring> updateRecurringPaymentAsync(
    final String recurringId,
    final V1RecurringsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recurringId` | `String` | Template, Required | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1RecurringsRequest1`](../../doc/models/v1-recurrings-request-1.md) | Body, Required | - |

## Response Type

[`ResponseRecurring`](../../doc/models/response-recurring.md)

## Example Usage

```java
String recurringId = "11e95f8ec39de8fbdb0a4f1a";
V1RecurringsRequest1 body = new V1RecurringsRequest1();

recurringController.updateRecurringPaymentAsync(recurringId, body).thenAccept(result -> {
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


# Activate Recurring Payment

Activate recurring payment

```java
CompletableFuture<ResponseRecurring> activateRecurringPaymentAsync(
    final String recurringId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recurringId` | `String` | Template, Required | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseRecurring`](../../doc/models/response-recurring.md)

## Example Usage

```java
String recurringId = "11e95f8ec39de8fbdb0a4f1a";

recurringController.activateRecurringPaymentAsync(recurringId).thenAccept(result -> {
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


# Defer Recurring Payment

Defer recurring payment

```java
CompletableFuture<ResponseRecurring> deferRecurringPaymentAsync(
    final String recurringId,
    final V1RecurringsDeferPaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recurringId` | `String` | Template, Required | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1RecurringsDeferPaymentRequest`](../../doc/models/v1-recurrings-defer-payment-request.md) | Body, Required | - |

## Response Type

[`ResponseRecurring`](../../doc/models/response-recurring.md)

## Example Usage

```java
String recurringId = "11e95f8ec39de8fbdb0a4f1a";
V1RecurringsDeferPaymentRequest body = new V1RecurringsDeferPaymentRequest();
body.setDeferCount(64);

recurringController.deferRecurringPaymentAsync(recurringId, body).thenAccept(result -> {
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


# Place on Hold Recurring Payment

Place on hold recurring payment

```java
CompletableFuture<ResponseRecurring> placeOnHoldRecurringPaymentAsync(
    final String recurringId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recurringId` | `String` | Template, Required | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseRecurring`](../../doc/models/response-recurring.md)

## Example Usage

```java
String recurringId = "11e95f8ec39de8fbdb0a4f1a";

recurringController.placeOnHoldRecurringPaymentAsync(recurringId).thenAccept(result -> {
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


# Skip Recurring Payment

Skip recurring payment

```java
CompletableFuture<ResponseRecurring> skipRecurringPaymentAsync(
    final String recurringId,
    final V1RecurringsSkipPaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recurringId` | `String` | Template, Required | Recurring ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1RecurringsSkipPaymentRequest`](../../doc/models/v1-recurrings-skip-payment-request.md) | Body, Required | - |

## Response Type

[`ResponseRecurring`](../../doc/models/response-recurring.md)

## Example Usage

```java
String recurringId = "11e95f8ec39de8fbdb0a4f1a";
V1RecurringsSkipPaymentRequest body = new V1RecurringsSkipPaymentRequest();
body.setSkipCount(174);

recurringController.skipRecurringPaymentAsync(recurringId, body).thenAccept(result -> {
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

