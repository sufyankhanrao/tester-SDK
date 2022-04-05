# Device Terms

Below you will find information on all of the available endpoint actions, fields, requirements, and responses.

> **Note:** *This endpoint is intended for use with signature capable terminals only.  On POST, if a device is not signature capable and require_signature is true, the API should return a 422 with the message "Device is not signature capable."*

```java
DeviceTermsController deviceTermsController = client.getDeviceTermsController();
```

## Class Name

`DeviceTermsController`

## Methods

* [Create a New Device Term](../../doc/controllers/device-terms.md#create-a-new-device-term)
* [List All Device Terms Related](../../doc/controllers/device-terms.md#list-all-device-terms-related)
* [View Single Device Term Record](../../doc/controllers/device-terms.md#view-single-device-term-record)


# Create a New Device Term

Create a new device term

```java
CompletableFuture<ResponseDeviceTerm> createANewDeviceTermAsync(
    final V1DeviceTermsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1DeviceTermsRequest`](../../doc/models/v1-device-terms-request.md) | Body, Required | - |

## Response Type

[`ResponseDeviceTerm`](../../doc/models/response-device-term.md)

## Example Usage

```java
V1DeviceTermsRequest body = new V1DeviceTermsRequest();
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setTerminalId("11e95f8ec39de8fbdb0a4f1a");
body.setRequireSignature(false);
body.setTermsConditions("FUNgib0Vh0B9c0Wbttvr50vNtGLOkTdFL0eFmhN1RJpKhK14IENeDa8irp2dEk9thEcVHvVEyriQeZLs5NjNsCzqNj9JDA4RSJwK647IFtYjrNPN1nBb9bw6hoQ71oT5kpsiXGt8HcqBFVBVeDA7psIzKAyDveAw2o1hfjipkOtXrPgWun0rYwyyFuvqkT1egQYKfYDj");

deviceTermsController.createANewDeviceTermAsync(body).thenAccept(result -> {
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


# List All Device Terms Related

List all device terms related

```java
CompletableFuture<ResponseDeviceTermsCollection> listAllDeviceTermsRelatedAsync(
    final Page page,
    final Sort2 sort,
    final Filter2 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort2`](../../doc/models/sort-2.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter2`](../../doc/models/filter-2.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseDeviceTermsCollection`](../../doc/models/response-device-terms-collection.md)

## Example Usage

```java
deviceTermsController.listAllDeviceTermsRelatedAsync(null, null, null).thenAccept(result -> {
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


# View Single Device Term Record

View single device term record

```java
CompletableFuture<ResponseDeviceTerm> viewSingleDeviceTermRecordAsync(
    final String deviceTermsId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `deviceTermsId` | `String` | Template, Required | Device term ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseDeviceTerm`](../../doc/models/response-device-term.md)

## Example Usage

```java
String deviceTermsId = "11e95f8ec39de8fbdb0a4f1a";

deviceTermsController.viewSingleDeviceTermRecordAsync(deviceTermsId).thenAccept(result -> {
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

