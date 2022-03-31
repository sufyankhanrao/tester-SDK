# Contacts

Below you will find information on all of the available endpoint actions, fields, requirements, and responses.

```java
ContactsController contactsController = client.getContactsController();
```

## Class Name

`ContactsController`

## Methods

* [Create a New Contact](../../doc/controllers/contacts.md#create-a-new-contact)
* [List All Contacts](../../doc/controllers/contacts.md#list-all-contacts)
* [Delete Contact](../../doc/controllers/contacts.md#delete-contact)
* [View Single Contact](../../doc/controllers/contacts.md#view-single-contact)
* [Update Contact](../../doc/controllers/contacts.md#update-contact)


# Create a New Contact

Create a new Contact

```java
CompletableFuture<ResponseContact> createANewContactAsync(
    final V1ContactsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1ContactsRequest`](../../doc/models/v1-contacts-request.md) | Body, Required | - |

## Response Type

[`ResponseContact`](../../doc/models/response-contact.md)

## Example Usage

```java
V1ContactsRequest body = new V1ContactsRequest();
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setLastName("Smith");

contactsController.createANewContactAsync(body).thenAccept(result -> {
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


# List All Contacts

List all Contacts

```java
CompletableFuture<ResponseContactsCollection> listAllContactsAsync(
    final Page page,
    final Sort1 sort,
    final Filter1 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort1`](../../doc/models/sort-1.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter1`](../../doc/models/filter-1.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseContactsCollection`](../../doc/models/response-contacts-collection.md)

## Example Usage

```java
contactsController.listAllContactsAsync(null, null, null).thenAccept(result -> {
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


# Delete Contact

Delete Contact

```java
CompletableFuture<ResponseContact> deleteContactAsync(
    final String contactId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `contactId` | `String` | Template, Required | Contact ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseContact`](../../doc/models/response-contact.md)

## Example Usage

```java
String contactId = "11e95f8ec39de8fbdb0a4f1a";

contactsController.deleteContactAsync(contactId).thenAccept(result -> {
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


# View Single Contact

View Single Contact

```java
CompletableFuture<ResponseContact> viewSingleContactAsync(
    final String contactId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `contactId` | `String` | Template, Required | Contact ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseContact`](../../doc/models/response-contact.md)

## Example Usage

```java
String contactId = "11e95f8ec39de8fbdb0a4f1a";

contactsController.viewSingleContactAsync(contactId).thenAccept(result -> {
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


# Update Contact

Update Contact

```java
CompletableFuture<ResponseContact> updateContactAsync(
    final String contactId,
    final V1ContactsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `contactId` | `String` | Template, Required | Contact ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1ContactsRequest1`](../../doc/models/v1-contacts-request-1.md) | Body, Required | - |

## Response Type

[`ResponseContact`](../../doc/models/response-contact.md)

## Example Usage

```java
String contactId = "11e95f8ec39de8fbdb0a4f1a";
V1ContactsRequest1 body = new V1ContactsRequest1();

contactsController.updateContactAsync(contactId, body).thenAccept(result -> {
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

