# Query Params

```java
QueryParamsController queryParamsController = client.getQueryParamsController();
```

## Class Name

`QueryParamsController`

## Methods

* [Send Number as Optional](/doc/controllers/query-params.md#send-number-as-optional)
* [Send Long as Optional](/doc/controllers/query-params.md#send-long-as-optional)
* [Precision as Optional](/doc/controllers/query-params.md#precision-as-optional)
* [Boolean as Optional](/doc/controllers/query-params.md#boolean-as-optional)
* [Rfc 1123 Datetime as Optional](/doc/controllers/query-params.md#rfc-1123-datetime-as-optional)
* [Rfc 3339 Datetime as Optional](/doc/controllers/query-params.md#rfc-3339-datetime-as-optional)
* [Send Date as Optional](/doc/controllers/query-params.md#send-date-as-optional)
* [Send String as Optional](/doc/controllers/query-params.md#send-string-as-optional)
* [Unixdatetime as Optional](/doc/controllers/query-params.md#unixdatetime-as-optional)


# Send Number as Optional

```java
CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
    final int number,
    final Integer number1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `number` | `int` | Query, Required | <testing><br> |
| `number1` | `Integer` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
int number = 1;
Integer number1 = 1;

queryParamsController.sendNumberAsOptionalAsync(number, number1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Long as Optional

```java
CompletableFuture<ServerResponse> sendLongAsOptionalAsync(
    final long mLong,
    final Long long1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mLong` | `long` | Query, Required | <testing><br> |
| `long1` | `Long` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
long mLong = 123123L;
Long long1 = 123123L;

queryParamsController.sendLongAsOptionalAsync(mLong, long1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Precision as Optional

```java
CompletableFuture<ServerResponse> precisionAsOptionalAsync(
    final double precision,
    final Double precision1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `precision` | `double` | Query, Required | <testing><br> |
| `precision1` | `Double` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
double precision = 1.23;
Double precision1 = 1.23;

queryParamsController.precisionAsOptionalAsync(precision, precision1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Boolean as Optional

```java
CompletableFuture<ServerResponse> booleanAsOptionalAsync(
    final boolean mBoolean,
    final Boolean boolean1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mBoolean` | `boolean` | Query, Required | <testing><br> |
| `boolean1` | `Boolean` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
boolean mBoolean = true;
Boolean boolean1 = true;

queryParamsController.booleanAsOptionalAsync(mBoolean, boolean1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Rfc 1123 Datetime as Optional

```java
CompletableFuture<ServerResponse> rfc1123DatetimeAsOptionalAsync(
    final LocalDateTime dateTime,
    final LocalDateTime dateTime1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | `LocalDateTime` | Query, Required | <testing><br> |
| `dateTime1` | `LocalDateTime` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime dateTime = DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT");
LocalDateTime dateTime1 = DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT");

queryParamsController.rfc1123DatetimeAsOptionalAsync(dateTime, dateTime1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Rfc 3339 Datetime as Optional

```java
CompletableFuture<ServerResponse> rfc3339DatetimeAsOptionalAsync(
    final LocalDateTime dateTime,
    final LocalDateTime dateTime1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | `LocalDateTime` | Query, Required | <testing><br> |
| `dateTime1` | `LocalDateTime` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime dateTime = LocalDateTime.parse("1994-02-13 14:01:54", DateTimeFormatter.ISO_DATE_TIME);
LocalDateTime dateTime1 = LocalDateTime.parse("1994-02-13 14:01:54", DateTimeFormatter.ISO_DATE_TIME);

queryParamsController.rfc3339DatetimeAsOptionalAsync(dateTime, dateTime1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Date as Optional

```java
CompletableFuture<ServerResponse> sendDateAsOptionalAsync(
    final LocalDate date,
    final LocalDate date1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `date` | `LocalDate` | Query, Required | <testing><br> |
| `date1` | `LocalDate` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDate date = LocalDate.parse("1994-02-13");
LocalDate date1 = LocalDate.parse("1994-02-13");

queryParamsController.sendDateAsOptionalAsync(date, date1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String as Optional

```java
CompletableFuture<ServerResponse> sendStringAsOptionalAsync(
    final String string,
    final String string1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `string` | `String` | Query, Required | <testing><br> |
| `string1` | `String` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String string = "test";
String string1 = "test";

queryParamsController.sendStringAsOptionalAsync(string, string1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Unixdatetime as Optional

```java
CompletableFuture<ServerResponse> unixdatetimeAsOptionalAsync(
    final LocalDateTime dateTime,
    final LocalDateTime dateTime1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | `LocalDateTime` | Query, Required | <testing><br> |
| `dateTime1` | `LocalDateTime` | Query, Optional | <testing><br> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(1484719381), ZoneId.systemDefault());
LocalDateTime dateTime1 = LocalDateTime.ofInstant(Instant.ofEpochSecond(1484719381), ZoneId.systemDefault());

queryParamsController.unixdatetimeAsOptionalAsync(dateTime, dateTime1).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

