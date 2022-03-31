# Tags

```java
TagsController tagsController = client.getTagsController();
```

## Class Name

`TagsController`

## Methods

* [Create a New Tag](../../doc/controllers/tags.md#create-a-new-tag)
* [List All Tags Related](../../doc/controllers/tags.md#list-all-tags-related)
* [Delete Tag Record](../../doc/controllers/tags.md#delete-tag-record)
* [View Single Tags Record](../../doc/controllers/tags.md#view-single-tags-record)
* [Update Tag Record](../../doc/controllers/tags.md#update-tag-record)


# Create a New Tag

Create a new tag

```java
CompletableFuture<ResponseTag> createANewTagAsync(
    final V1TagsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TagsRequest`](../../doc/models/v1-tags-request.md) | Body, Required | - |

## Response Type

[`ResponseTag`](../../doc/models/response-tag.md)

## Example Usage

```java
V1TagsRequest body = new V1TagsRequest();
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setTitle("My terminal");

tagsController.createANewTagAsync(body).thenAccept(result -> {
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


# List All Tags Related

List all tags related

```java
CompletableFuture<ResponseTagsCollection> listAllTagsRelatedAsync(
    final Page page,
    final Sort8 sort,
    final Filter8 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort8`](../../doc/models/sort-8.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter8`](../../doc/models/filter-8.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseTagsCollection`](../../doc/models/response-tags-collection.md)

## Example Usage

```java
tagsController.listAllTagsRelatedAsync(null, null, null).thenAccept(result -> {
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


# Delete Tag Record

Delete tag record

```java
CompletableFuture<ResponseTag> deleteTagRecordAsync(
    final String tagId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tagId` | `String` | Template, Required | Tag ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseTag`](../../doc/models/response-tag.md)

## Example Usage

```java
String tagId = "11e95f8ec39de8fbdb0a4f1a";

tagsController.deleteTagRecordAsync(tagId).thenAccept(result -> {
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


# View Single Tags Record

View single tags record

```java
CompletableFuture<ResponseTag> viewSingleTagsRecordAsync(
    final String tagId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tagId` | `String` | Template, Required | Tag ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseTag`](../../doc/models/response-tag.md)

## Example Usage

```java
String tagId = "11e95f8ec39de8fbdb0a4f1a";

tagsController.viewSingleTagsRecordAsync(tagId).thenAccept(result -> {
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


# Update Tag Record

Update tag record

```java
CompletableFuture<ResponseTag> updateTagRecordAsync(
    final String tagId,
    final V1TagsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tagId` | `String` | Template, Required | Tag ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TagsRequest1`](../../doc/models/v1-tags-request-1.md) | Body, Required | - |

## Response Type

[`ResponseTag`](../../doc/models/response-tag.md)

## Example Usage

```java
String tagId = "11e95f8ec39de8fbdb0a4f1a";
V1TagsRequest1 body = new V1TagsRequest1();

tagsController.updateTagRecordAsync(tagId, body).thenAccept(result -> {
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

