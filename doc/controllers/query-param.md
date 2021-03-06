# Query Param

```java
QueryParamController queryParamController = client.getQueryParamController();
```

## Class Name

`QueryParamController`

## Methods

* [Date Array](../../doc/controllers/query-param.md#date-array)
* [Optional Dynamic Query Param](../../doc/controllers/query-param.md#optional-dynamic-query-param)
* [Date](../../doc/controllers/query-param.md#date)
* [Unix Date Time Array](../../doc/controllers/query-param.md#unix-date-time-array)
* [Unix Date Time](../../doc/controllers/query-param.md#unix-date-time)
* [Rfc 1123 Date Time](../../doc/controllers/query-param.md#rfc-1123-date-time)
* [Rfc 1123 Date Time Array](../../doc/controllers/query-param.md#rfc-1123-date-time-array)
* [Rfc 3339 Date Time Array](../../doc/controllers/query-param.md#rfc-3339-date-time-array)
* [Rfc 3339 Date Time](../../doc/controllers/query-param.md#rfc-3339-date-time)
* [No Params](../../doc/controllers/query-param.md#no-params)
* [String Param](../../doc/controllers/query-param.md#string-param)
* [Url Param](../../doc/controllers/query-param.md#url-param)
* [Number Array](../../doc/controllers/query-param.md#number-array)
* [String Array](../../doc/controllers/query-param.md#string-array)
* [Simple Query](../../doc/controllers/query-param.md#simple-query)
* [String Enum Array](../../doc/controllers/query-param.md#string-enum-array)
* [Multiple Params](../../doc/controllers/query-param.md#multiple-params)
* [Integer Enum Array](../../doc/controllers/query-param.md#integer-enum-array)
* [Send Indexed Complex Type in Query](../../doc/controllers/query-param.md#send-indexed-complex-type-in-query)
* [Send Indexed List of Complex Type in Query](../../doc/controllers/query-param.md#send-indexed-list-of-complex-type-in-query)
* [Send Indexed Map of Complex Type in Query](../../doc/controllers/query-param.md#send-indexed-map-of-complex-type-in-query)


# Date Array

```java
CompletableFuture<ServerResponse> dateArrayAsync(
    final List<LocalDate> dates)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dates` | `List<LocalDate>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDate> dates = new LinkedList<>();
dates.add(LocalDate.parse("2016-03-13"));
dates.add(LocalDate.parse("2016-03-13"));

queryParamController.dateArrayAsync(dates).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Optional Dynamic Query Param

get optional dynamic query parameter

```java
CompletableFuture<ServerResponse> optionalDynamicQueryParamAsync(
    final String name,
    final Map<String, Object> queryParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Required | - |
| `queryParameters` | `Map<String, Object>` | Optional | Pass additional query parameters. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String name = "name0";
LinkedHashMap<String, Object> queryParameters = new LinkedHashMap<>();
queryParameters.put("key0", "additionalQueryParams2");

queryParamController.optionalDynamicQueryParamAsync(name, queryParameters).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Date

```java
CompletableFuture<ServerResponse> dateAsync(
    final LocalDate date)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `date` | `LocalDate` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDate date = LocalDate.parse("2016-03-13");

queryParamController.dateAsync(date).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Unix Date Time Array

```java
CompletableFuture<ServerResponse> unixDateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));

queryParamController.unixDateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Unix Date Time

```java
CompletableFuture<ServerResponse> unixDateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault());

queryParamController.unixDateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Rfc 1123 Date Time

```java
CompletableFuture<ServerResponse> rfc1123DateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT");

queryParamController.rfc1123DateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Rfc 1123 Date Time Array

```java
CompletableFuture<ServerResponse> rfc1123DateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));

queryParamController.rfc1123DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Rfc 3339 Date Time Array

```java
CompletableFuture<ServerResponse> rfc3339DateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));

queryParamController.rfc3339DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Rfc 3339 Date Time

```java
CompletableFuture<ServerResponse> rfc3339DateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME);

queryParamController.rfc3339DateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# No Params

```java
CompletableFuture<ServerResponse> noParamsAsync()
```

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
queryParamController.noParamsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# String Param

```java
CompletableFuture<ServerResponse> stringParamAsync(
    final String string)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `string` | `String` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String string = "string4";

queryParamController.stringParamAsync(string).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Url Param

```java
CompletableFuture<ServerResponse> urlParamAsync(
    final String url)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `url` | `String` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
String url = "url4";

queryParamController.urlParamAsync(url).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Number Array

```java
CompletableFuture<ServerResponse> numberArrayAsync(
    final List<Integer> integers)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `integers` | `List<Integer>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Integer> integers = new LinkedList<>();
integers.add(45);
integers.add(46);
integers.add(47);

queryParamController.numberArrayAsync(integers).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# String Array

```java
CompletableFuture<ServerResponse> stringArrayAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<String> strings = new LinkedList<>();
strings.add("strings5");

queryParamController.stringArrayAsync(strings).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Simple Query

```java
CompletableFuture<ServerResponse> simpleQueryAsync(
    final boolean mBoolean,
    final int number,
    final String string,
    final Map<String, Object> queryParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mBoolean` | `boolean` | Query, Required | - |
| `number` | `int` | Query, Required | - |
| `string` | `String` | Query, Required | - |
| `queryParameters` | `Map<String, Object>` | Optional | Pass additional query parameters. |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
boolean mBoolean = false;
int number = 158;
String string = "string4";
LinkedHashMap<String, Object> queryParameters = new LinkedHashMap<>();
queryParameters.put("key0", "additionalQueryParams2");

queryParamController.simpleQueryAsync(mBoolean, number, string, queryParameters).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# String Enum Array

```java
CompletableFuture<ServerResponse> stringEnumArrayAsync(
    final List<Days> days)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `days` | [`List<Days>`](../../doc/models/days.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<Days> days = new LinkedList<>();
days.add(Days.SUNDAY);
days.add(Days.MONDAY);
days.add(Days.TUESDAY);

queryParamController.stringEnumArrayAsync(days).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Multiple Params

```java
CompletableFuture<ServerResponse> multipleParamsAsync(
    final int number,
    final double precision,
    final String string,
    final String url)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `number` | `int` | Query, Required | - |
| `precision` | `double` | Query, Required | - |
| `string` | `String` | Query, Required | - |
| `url` | `String` | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
int number = 158;
double precision = 112.04;
String string = "string4";
String url = "url4";

queryParamController.multipleParamsAsync(number, precision, string, url).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Integer Enum Array

```java
CompletableFuture<ServerResponse> integerEnumArrayAsync(
    final List<SuiteCode> suites)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `suites` | [`List<SuiteCode>`](../../doc/models/suite-code.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<SuiteCode> suites = new LinkedList<>();
suites.add(SuiteCode.HEARTS);
suites.add(SuiteCode.SPADES);
suites.add(SuiteCode.CLUBS);

queryParamController.integerEnumArrayAsync(suites).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Indexed Complex Type in Query

```java
CompletableFuture<ServerResponse> sendIndexedComplexTypeInQueryAsync(
    final ComplexType complexType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `complexType` | [`ComplexType`](../../doc/models/complex-type.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
ComplexType complexType = new ComplexType();
complexType.setNumberListType(new LinkedList<>());
complexType.getNumberListType().add(232);
complexType.setNumberMapType(new LinkedHashMap<>());
complexType.getNumberMapType().put("key0", 149);
complexType.getNumberMapType().put("key1", 150);
complexType.setInnerComplexType(new InnerComplexType());
complexType.getInnerComplexType().setStringType("stringType8");
complexType.getInnerComplexType().setBooleanType(false);
complexType.getInnerComplexType().setDateTimeType(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
complexType.getInnerComplexType().setDateType(LocalDate.parse("2016-03-13"));
complexType.getInnerComplexType().setUuidType(UUID.fromString("00001292-0000-0000-0000-000000000000"));
complexType.getInnerComplexType().setLongType(120L);
complexType.getInnerComplexType().setPrecisionType(252.18);
complexType.getInnerComplexType().setObjectType(localhost3000.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
complexType.getInnerComplexType().setStringListType(new LinkedList<>());
complexType.getInnerComplexType().getStringListType().add("stringListType8");
complexType.setInnerComplexListType(new LinkedList<>());

InnerComplexType complexTypeInnerComplexListType0 = new InnerComplexType();
complexTypeInnerComplexListType0.setStringType("stringType6");
complexTypeInnerComplexListType0.setBooleanType(false);
complexTypeInnerComplexListType0.setDateTimeType(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
complexTypeInnerComplexListType0.setDateType(LocalDate.parse("2016-03-13"));
complexTypeInnerComplexListType0.setUuidType(UUID.fromString("0000183a-0000-0000-0000-000000000000"));
complexTypeInnerComplexListType0.setLongType(240L);
complexTypeInnerComplexListType0.setPrecisionType(222.66);
complexTypeInnerComplexListType0.setObjectType(localhost3000.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
complexTypeInnerComplexListType0.setStringListType(new LinkedList<>());
complexTypeInnerComplexListType0.getStringListType().add("stringListType6");
complexTypeInnerComplexListType0.getStringListType().add("stringListType7");
complexTypeInnerComplexListType0.getStringListType().add("stringListType8");
complexType.getInnerComplexListType().add(complexTypeInnerComplexListType0);


queryParamController.sendIndexedComplexTypeInQueryAsync(complexType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Indexed List of Complex Type in Query

```java
CompletableFuture<ServerResponse> sendIndexedListOfComplexTypeInQueryAsync(
    final List<ComplexType> complexType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `complexType` | [`List<ComplexType>`](../../doc/models/complex-type.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
List<ComplexType> complexType = new LinkedList<>();

ComplexType complexType0 = new ComplexType();
complexType0.setNumberListType(new LinkedList<>());
complexType0.getNumberListType().add(144);
complexType0.setNumberMapType(new LinkedHashMap<>());
complexType0.getNumberMapType().put("key0", 61);
complexType0.getNumberMapType().put("key1", 62);
complexType0.setInnerComplexType(new InnerComplexType());
complexType0.getInnerComplexType().setStringType("stringType8");
complexType0.getInnerComplexType().setBooleanType(false);
complexType0.getInnerComplexType().setDateTimeType(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
complexType0.getInnerComplexType().setDateType(LocalDate.parse("2016-03-13"));
complexType0.getInnerComplexType().setUuidType(UUID.fromString("0000103a-0000-0000-0000-000000000000"));
complexType0.getInnerComplexType().setLongType(32L);
complexType0.getInnerComplexType().setPrecisionType(246.18);
complexType0.getInnerComplexType().setObjectType(localhost3000.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
complexType0.getInnerComplexType().setStringListType(new LinkedList<>());
complexType0.getInnerComplexType().getStringListType().add("stringListType8");
complexType0.setInnerComplexListType(new LinkedList<>());

InnerComplexType complexType0InnerComplexListType0 = new InnerComplexType();
complexType0InnerComplexListType0.setStringType("stringType6");
complexType0InnerComplexListType0.setBooleanType(false);
complexType0InnerComplexListType0.setDateTimeType(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
complexType0InnerComplexListType0.setDateType(LocalDate.parse("2016-03-13"));
complexType0InnerComplexListType0.setUuidType(UUID.fromString("000015e2-0000-0000-0000-000000000000"));
complexType0InnerComplexListType0.setLongType(152L);
complexType0InnerComplexListType0.setPrecisionType(216.66);
complexType0InnerComplexListType0.setObjectType(localhost3000.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
complexType0InnerComplexListType0.setStringListType(new LinkedList<>());
complexType0InnerComplexListType0.getStringListType().add("stringListType6");
complexType0InnerComplexListType0.getStringListType().add("stringListType7");
complexType0InnerComplexListType0.getStringListType().add("stringListType8");
complexType0.getInnerComplexListType().add(complexType0InnerComplexListType0);

complexType.add(complexType0);


queryParamController.sendIndexedListOfComplexTypeInQueryAsync(complexType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Indexed Map of Complex Type in Query

```java
CompletableFuture<ServerResponse> sendIndexedMapOfComplexTypeInQueryAsync(
    final Map<String, ComplexType> complexType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `complexType` | [`Map<String, ComplexType>`](../../doc/models/complex-type.md) | Query, Required | - |

## Response Type

[`ServerResponse`](../../doc/models/server-response.md)

## Example Usage

```java
Map<String, ComplexType> complexType = new LinkedHashMap<>();

ComplexType complexType0 = new ComplexType();
complexType0.setNumberListType(new LinkedList<>());
complexType0.setNumberMapType(new LinkedHashMap<>());
complexType0.setInnerComplexType(new InnerComplexType());
complexType0.getInnerComplexType().setStringType(null);
complexType0.getInnerComplexType().setBooleanType(null);
complexType0.getInnerComplexType().setDateTimeType(LocalDateTime.parse(null, DateTimeFormatter.ISO_DATE_TIME));
complexType0.getInnerComplexType().setDateType(LocalDate.parse(null));
complexType0.getInnerComplexType().setUuidType(UUID.fromString(null));
complexType0.getInnerComplexType().setLongType(null);
complexType0.getInnerComplexType().setPrecisionType(null);
complexType0.getInnerComplexType().setObjectType(localhost3000.ApiHelper.deserialize(null));
complexType0.getInnerComplexType().setStringListType(new LinkedList<>());
complexType0.setInnerComplexListType(new LinkedList<>());

complexType.put("",complexType0);


queryParamController.sendIndexedMapOfComplexTypeInQueryAsync(complexType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

