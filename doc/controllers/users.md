# Users

```java
UsersController usersController = client.getUsersController();
```

## Class Name

`UsersController`

## Methods

* [Create a New API Key](../../doc/controllers/users.md#create-a-new-api-key)
* [Create a New User](../../doc/controllers/users.md#create-a-new-user)
* [List All User Related](../../doc/controllers/users.md#list-all-user-related)
* [Delete a User Record](../../doc/controllers/users.md#delete-a-user-record)
* [View Single User Record](../../doc/controllers/users.md#view-single-user-record)
* [Update a User Record](../../doc/controllers/users.md#update-a-user-record)
* [View Self Record](../../doc/controllers/users.md#view-self-record)


# Create a New API Key

Create a new API key

```java
CompletableFuture<ResponseUser> createANewAPIKeyAsync(
    final String userId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userId` | `String` | Template, Required | User ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseUser`](../../doc/models/response-user.md)

## Example Usage

```java
String userId = "11e95f8ec39de8fbdb0a4f1a";

usersController.createANewAPIKeyAsync(userId).thenAccept(result -> {
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


# Create a New User

Create a new user

```java
CompletableFuture<ResponseUser> createANewUserAsync(
    final V1UsersRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1UsersRequest`](../../doc/models/v1-users-request.md) | Body, Required | - |

## Response Type

[`ResponseUser`](../../doc/models/response-user.md)

## Example Usage

```java
V1UsersRequest body = new V1UsersRequest();
body.setEmail("testuser@test.com");
body.setLastName("Smith");
body.setPrimaryLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setUsername("{user_name}");
body.setUserTypeId(UserTypeIdEnum.ENUM_100);

usersController.createANewUserAsync(body).thenAccept(result -> {
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


# List All User Related

List all user related

```java
CompletableFuture<ResponseUsersCollection> listAllUserRelatedAsync(
    final Page page,
    final Sort12 sort,
    final Filter12 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort12`](../../doc/models/sort-12.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter12`](../../doc/models/filter-12.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseUsersCollection`](../../doc/models/response-users-collection.md)

## Example Usage

```java
usersController.listAllUserRelatedAsync(null, null, null).thenAccept(result -> {
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


# Delete a User Record

Delete a user record

```java
CompletableFuture<ResponseUser> deleteAUserRecordAsync(
    final String userId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userId` | `String` | Template, Required | - |

## Response Type

[`ResponseUser`](../../doc/models/response-user.md)

## Example Usage

```java
String userId = "user_id8";

usersController.deleteAUserRecordAsync(userId).thenAccept(result -> {
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


# View Single User Record

View single user record

```java
CompletableFuture<ResponseUser> viewSingleUserRecordAsync(
    final String userId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userId` | `String` | Template, Required | User ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseUser`](../../doc/models/response-user.md)

## Example Usage

```java
String userId = "11e95f8ec39de8fbdb0a4f1a";

usersController.viewSingleUserRecordAsync(userId).thenAccept(result -> {
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


# Update a User Record

Update a user record

```java
CompletableFuture<ResponseUser> updateAUserRecordAsync(
    final String userId,
    final V1UsersRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `userId` | `String` | Template, Required | User ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1UsersRequest1`](../../doc/models/v1-users-request-1.md) | Body, Required | - |

## Response Type

[`ResponseUser`](../../doc/models/response-user.md)

## Example Usage

```java
String userId = "11e95f8ec39de8fbdb0a4f1a";
V1UsersRequest1 body = new V1UsersRequest1();

usersController.updateAUserRecordAsync(userId, body).thenAccept(result -> {
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


# View Self Record

View self record

```java
CompletableFuture<ResponseUser> viewSelfRecordAsync()
```

## Response Type

[`ResponseUser`](../../doc/models/response-user.md)

## Example Usage

```java
usersController.viewSelfRecordAsync().thenAccept(result -> {
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

