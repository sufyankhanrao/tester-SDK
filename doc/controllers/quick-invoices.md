# Quick Invoices

Quick Invoices is a way for a merchant to send an email to a customer with a link to make a payment. This link, when clicked, opens a browser containing the Quick Invoice of whatever it is that the customer purchased. Each Quick Invoice email will have the ability to be customized by the merchant. There will be a default template provided for the merchant as a starting point. Once paid, the customer will receive an email thanking them for their payment. The system will send the customer email notifications prior to the due date, on the due date, and past the due at the discretion of the merchant. There will also be reporting provided to the merchant.

### Quick Invoice Process

The detail listed below in this document explains how to use the API to create and update quick invoices. Once an invoice is created, the system will send an email with the details of the quick invoice and a link on how to make a payment towards the invoice.

The email will contain a link that looks something like the following:

`https://{url}/quickinvoice/?id={quick_invoice_id}`

When the end user receives this email, they will be able to click on the link and it will take them to a page that looks like the image below. This page is where they will be making their payment(s).

![Quick-invoice sample](https://docs.zeamster.com/download_file/view_inline/22)

Once a payment is made on the quick invoice, the transaction will show up in the transaction listing with a reference to the quick invoice.

```java
QuickInvoicesController quickInvoicesController = client.getQuickInvoicesController();
```

## Class Name

`QuickInvoicesController`

## Methods

* [Create a New Quick Invoice](../../doc/controllers/quick-invoices.md#create-a-new-quick-invoice)
* [List All Quick Invoices Related](../../doc/controllers/quick-invoices.md#list-all-quick-invoices-related)
* [Resend Notification Email](../../doc/controllers/quick-invoices.md#resend-notification-email)
* [Associate Transaction With Ouick Invoice](../../doc/controllers/quick-invoices.md#associate-transaction-with-ouick-invoice)
* [Remove Transaction From Quick Invoice](../../doc/controllers/quick-invoices.md#remove-transaction-from-quick-invoice)
* [Delete Quick Invoice](../../doc/controllers/quick-invoices.md#delete-quick-invoice)
* [View Single Quick Invoice Record](../../doc/controllers/quick-invoices.md#view-single-quick-invoice-record)
* [Update Quick Invoice](../../doc/controllers/quick-invoices.md#update-quick-invoice)


# Create a New Quick Invoice

Create a new quick invoice

```java
CompletableFuture<ResponseQuickInvoice> createANewQuickInvoiceAsync(
    final V1QuickInvoicesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1QuickInvoicesRequest`](../../doc/models/v1-quick-invoices-request.md) | Body, Required | - |

## Response Type

[`ResponseQuickInvoice`](../../doc/models/response-quick-invoice.md)

## Example Usage

```java
V1QuickInvoicesRequest body = new V1QuickInvoicesRequest();
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setTitle("My terminal");
body.setCcProductTransactionId("11e95f8ec39de8fbdb0a4f1a");
body.setDueDate("2021-12-01");
body.setItemList(new LinkedList<>());

ItemList bodyItemList0 = new ItemList();
bodyItemList0.setName("Bread");
bodyItemList0.setAmount(20.15);
body.getItemList().add(bodyItemList0);

ItemList bodyItemList1 = new ItemList();
bodyItemList1.setName("Bread");
bodyItemList1.setAmount(20.15);
body.getItemList().add(bodyItemList1);

ItemList bodyItemList2 = new ItemList();
bodyItemList2.setName("Bread");
bodyItemList2.setAmount(20.15);
body.getItemList().add(bodyItemList2);


quickInvoicesController.createANewQuickInvoiceAsync(body).thenAccept(result -> {
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


# List All Quick Invoices Related

List all quick invoices related

```java
CompletableFuture<ResponseQuickInvoicesCollection> listAllQuickInvoicesRelatedAsync(
    final Page page,
    final Sort5 sort,
    final Filter5 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort5`](../../doc/models/sort-5.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter5`](../../doc/models/filter-5.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseQuickInvoicesCollection`](../../doc/models/response-quick-invoices-collection.md)

## Example Usage

```java
quickInvoicesController.listAllQuickInvoicesRelatedAsync(null, null, null).thenAccept(result -> {
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


# Resend Notification Email

Resend Notification Email

```java
CompletableFuture<ResponseQuickInvoice> resendNotificationEmailAsync(
    final String quickInvoiceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `quickInvoiceId` | `String` | Template, Required | Quick Invoice ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseQuickInvoice`](../../doc/models/response-quick-invoice.md)

## Example Usage

```java
String quickInvoiceId = "11e95f8ec39de8fbdb0a4f1a";

quickInvoicesController.resendNotificationEmailAsync(quickInvoiceId).thenAccept(result -> {
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


# Associate Transaction With Ouick Invoice

Associate Transaction with Ouick Invoice

```java
CompletableFuture<ResponseQuickInvoice> associateTransactionWithOuickInvoiceAsync(
    final String quickInvoiceId,
    final V1QuickInvoicesTransactionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `quickInvoiceId` | `String` | Template, Required | Quick Invoice ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1QuickInvoicesTransactionRequest`](../../doc/models/v1-quick-invoices-transaction-request.md) | Body, Required | - |

## Response Type

[`ResponseQuickInvoice`](../../doc/models/response-quick-invoice.md)

## Example Usage

```java
String quickInvoiceId = "11e95f8ec39de8fbdb0a4f1a";
V1QuickInvoicesTransactionRequest body = new V1QuickInvoicesTransactionRequest();
body.setTransactionId("11e95f8ec39de8fbdb0a4f1a");

quickInvoicesController.associateTransactionWithOuickInvoiceAsync(quickInvoiceId, body).thenAccept(result -> {
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


# Remove Transaction From Quick Invoice

Remove transaction from Quick Invoice

```java
CompletableFuture<ResponseQuickInvoice> removeTransactionFromQuickInvoiceAsync(
    final String quickInvoiceId,
    final V1QuickInvoicesTransactionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `quickInvoiceId` | `String` | Template, Required | Quick Invoice ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1QuickInvoicesTransactionRequest`](../../doc/models/v1-quick-invoices-transaction-request.md) | Body, Required | - |

## Response Type

[`ResponseQuickInvoice`](../../doc/models/response-quick-invoice.md)

## Example Usage

```java
String quickInvoiceId = "11e95f8ec39de8fbdb0a4f1a";
V1QuickInvoicesTransactionRequest body = new V1QuickInvoicesTransactionRequest();
body.setTransactionId("11e95f8ec39de8fbdb0a4f1a");

quickInvoicesController.removeTransactionFromQuickInvoiceAsync(quickInvoiceId, body).thenAccept(result -> {
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


# Delete Quick Invoice

Delete quick Invoice

```java
CompletableFuture<ResponseQuickInvoice> deleteQuickInvoiceAsync(
    final String quickInvoiceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `quickInvoiceId` | `String` | Template, Required | Quick Invoice ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseQuickInvoice`](../../doc/models/response-quick-invoice.md)

## Example Usage

```java
String quickInvoiceId = "11e95f8ec39de8fbdb0a4f1a";

quickInvoicesController.deleteQuickInvoiceAsync(quickInvoiceId).thenAccept(result -> {
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


# View Single Quick Invoice Record

View single quick invoice record

```java
CompletableFuture<ResponseQuickInvoice> viewSingleQuickInvoiceRecordAsync(
    final String quickInvoiceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `quickInvoiceId` | `String` | Template, Required | Quick Invoice ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseQuickInvoice`](../../doc/models/response-quick-invoice.md)

## Example Usage

```java
String quickInvoiceId = "11e95f8ec39de8fbdb0a4f1a";

quickInvoicesController.viewSingleQuickInvoiceRecordAsync(quickInvoiceId).thenAccept(result -> {
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


# Update Quick Invoice

Update quick invoice

```java
CompletableFuture<ResponseQuickInvoice> updateQuickInvoiceAsync(
    final String quickInvoiceId,
    final V1QuickInvoicesRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `quickInvoiceId` | `String` | Template, Required | Quick Invoice ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1QuickInvoicesRequest1`](../../doc/models/v1-quick-invoices-request-1.md) | Body, Required | - |

## Response Type

[`ResponseQuickInvoice`](../../doc/models/response-quick-invoice.md)

## Example Usage

```java
String quickInvoiceId = "11e95f8ec39de8fbdb0a4f1a";
V1QuickInvoicesRequest1 body = new V1QuickInvoicesRequest1();

quickInvoicesController.updateQuickInvoiceAsync(quickInvoiceId, body).thenAccept(result -> {
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

