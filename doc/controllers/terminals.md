# Terminals

```java
TerminalsController terminalsController = client.getTerminalsController();
```

## Class Name

`TerminalsController`

## Methods

* [Create a New Terminal Device](../../doc/controllers/terminals.md#create-a-new-terminal-device)
* [List All Terminals Related](../../doc/controllers/terminals.md#list-all-terminals-related)
* [View Single Terminals Record](../../doc/controllers/terminals.md#view-single-terminals-record)
* [Update Terminal Record](../../doc/controllers/terminals.md#update-terminal-record)


# Create a New Terminal Device

Create a new terminal device

```java
CompletableFuture<ResponseTerminal> createANewTerminalDeviceAsync(
    final V1TerminalsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1TerminalsRequest`](../../doc/models/v1-terminals-request.md) | Body, Required | - |

## Response Type

[`ResponseTerminal`](../../doc/models/response-terminal.md)

## Example Usage

```java
V1TerminalsRequest body = new V1TerminalsRequest();
body.setLocationId("11e95f8ec39de8fbdb0a4f1a");
body.setTerminalApplicationId("11e95f8ec39de8fbdb0a4f1a");
body.setTerminalManufacturerId(TerminalManufacturerIdEnum.ENUM_1);
body.setTitle("My terminal");
body.setLocalIpAddress("192.168.0.10");
body.setPort(10009);
body.setSerialNumber("1234567890");
body.setTerminalNumber("terminal_number0");
body.setDebit(false);
body.setEmv(false);
body.setCashbackEnable(false);
body.setPrintEnable(false);
body.setSigCaptureEnable(false);

terminalsController.createANewTerminalDeviceAsync(body).thenAccept(result -> {
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


# List All Terminals Related

List all terminals related

```java
CompletableFuture<ResponseTerminalsCollection> listAllTerminalsRelatedAsync(
    final Page page,
    final Sort9 sort,
    final Filter9 filter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | [`Page`](../../doc/models/page.md) | Query, Optional | Use this field to specify paginate your results, by using page size and number. You can use one of the following methods:<br><br>> /endpoint?page={ "number": 1, "size": 50 }<br>> <br>> /endpoint?page[number]=1&page[size]=50 |
| `sort` | [`Sort9`](../../doc/models/sort-9.md) | Query, Optional | You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:<br><br>> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }<br>> <br>> /endpoint?sort[field_name]=asc&sort[field_name2]=desc |
| `filter` | [`Filter9`](../../doc/models/filter-9.md) | Query, Optional | You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:<br><br>> /endpoint?filter={ "field_name": "Value" }<br>> <br>> /endpoint?filter[field_name]=Value |

## Response Type

[`ResponseTerminalsCollection`](../../doc/models/response-terminals-collection.md)

## Example Usage

```java
terminalsController.listAllTerminalsRelatedAsync(null, null, null).thenAccept(result -> {
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


# View Single Terminals Record

View single terminals record

```java
CompletableFuture<ResponseTerminal> viewSingleTerminalsRecordAsync(
    final String terminalId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `terminalId` | `String` | Template, Required | Terminal ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |

## Response Type

[`ResponseTerminal`](../../doc/models/response-terminal.md)

## Example Usage

```java
String terminalId = "11e95f8ec39de8fbdb0a4f1a";

terminalsController.viewSingleTerminalsRecordAsync(terminalId).thenAccept(result -> {
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


# Update Terminal Record

Update terminal record

```java
CompletableFuture<ResponseTerminal> updateTerminalRecordAsync(
    final String terminalId,
    final V1TerminalsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `terminalId` | `String` | Template, Required | Terminal ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` |
| `body` | [`V1TerminalsRequest1`](../../doc/models/v1-terminals-request-1.md) | Body, Required | - |

## Response Type

[`ResponseTerminal`](../../doc/models/response-terminal.md)

## Example Usage

```java
String terminalId = "11e95f8ec39de8fbdb0a4f1a";
V1TerminalsRequest1 body = new V1TerminalsRequest1();

terminalsController.updateTerminalRecordAsync(terminalId, body).thenAccept(result -> {
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

