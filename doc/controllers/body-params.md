# Body Params

```java
BodyParamsController bodyParamsController = client.getBodyParamsController();
```

## Class Name

`BodyParamsController`

## Methods

* [Send Delete Plain Text](/doc/controllers/body-params.md#send-delete-plain-text)
* [Send Delete Body](/doc/controllers/body-params.md#send-delete-body)
* [Send Date Array](/doc/controllers/body-params.md#send-date-array)
* [Send Date](/doc/controllers/body-params.md#send-date)
* [Send Unix Date Time](/doc/controllers/body-params.md#send-unix-date-time)
* [Send Rfc 1123 Date Time](/doc/controllers/body-params.md#send-rfc-1123-date-time)
* [Send Rfc 3339 Date Time](/doc/controllers/body-params.md#send-rfc-3339-date-time)
* [Send Unix Date Time Array](/doc/controllers/body-params.md#send-unix-date-time-array)
* [Send Rfc 1123 Date Time Array](/doc/controllers/body-params.md#send-rfc-1123-date-time-array)
* [Send Rfc 3339 Date Time Array](/doc/controllers/body-params.md#send-rfc-3339-date-time-array)
* [Send String Array](/doc/controllers/body-params.md#send-string-array)
* [Update String](/doc/controllers/body-params.md#update-string)
* [Send Integer Array](/doc/controllers/body-params.md#send-integer-array)
* [Wrap Body in Object](/doc/controllers/body-params.md#wrap-body-in-object)
* [Additional Model Parameters](/doc/controllers/body-params.md#additional-model-parameters)
* [Validate Required Parameter](/doc/controllers/body-params.md#validate-required-parameter)
* [Additional Model Parameters 1](/doc/controllers/body-params.md#additional-model-parameters-1)
* [Send Model](/doc/controllers/body-params.md#send-model)
* [Send Model Array](/doc/controllers/body-params.md#send-model-array)
* [Send Dynamic](/doc/controllers/body-params.md#send-dynamic)
* [Send String](/doc/controllers/body-params.md#send-string)
* [Send String Enum Array](/doc/controllers/body-params.md#send-string-enum-array)
* [Send Integer Enum Array](/doc/controllers/body-params.md#send-integer-enum-array)
* [Update Model](/doc/controllers/body-params.md#update-model)
* [Send Delete Body With Model](/doc/controllers/body-params.md#send-delete-body-with-model)
* [Send Delete Body With Model Array](/doc/controllers/body-params.md#send-delete-body-with-model-array)
* [Update Model Array](/doc/controllers/body-params.md#update-model-array)
* [Update String 1](/doc/controllers/body-params.md#update-string-1)
* [Update String Array](/doc/controllers/body-params.md#update-string-array)
* [Send String With New Line](/doc/controllers/body-params.md#send-string-with-new-line)
* [Send String With R](/doc/controllers/body-params.md#send-string-with-r)
* [Send String in Body With R N](/doc/controllers/body-params.md#send-string-in-body-with-r-n)
* [Send Optional Unix Date Time in Body](/doc/controllers/body-params.md#send-optional-unix-date-time-in-body)
* [Send Optional Rfc 1123 in Body](/doc/controllers/body-params.md#send-optional-rfc-1123-in-body)
* [Send Datetime Optional in Endpoint](/doc/controllers/body-params.md#send-datetime-optional-in-endpoint)
* [Send Optional Unix Time Stamp in Model Body](/doc/controllers/body-params.md#send-optional-unix-time-stamp-in-model-body)
* [Send Optional Unix Time Stamp in Nested Model Body](/doc/controllers/body-params.md#send-optional-unix-time-stamp-in-nested-model-body)
* [Send Rfc 1123 Date Time in Nested Model](/doc/controllers/body-params.md#send-rfc-1123-date-time-in-nested-model)
* [Send Rfc 1123 Date Time in Model](/doc/controllers/body-params.md#send-rfc-1123-date-time-in-model)
* [Send Optional Datetime in Model](/doc/controllers/body-params.md#send-optional-datetime-in-model)
* [Send Rfc 339 Date Time in Nested Models](/doc/controllers/body-params.md#send-rfc-339-date-time-in-nested-models)
* [Uuid as Optional](/doc/controllers/body-params.md#uuid-as-optional)
* [Boolean as Optional](/doc/controllers/body-params.md#boolean-as-optional)
* [Date as Optional](/doc/controllers/body-params.md#date-as-optional)
* [Dynamic as Optional](/doc/controllers/body-params.md#dynamic-as-optional)
* [String as Optional](/doc/controllers/body-params.md#string-as-optional)
* [Precision as Optional](/doc/controllers/body-params.md#precision-as-optional)
* [Long as Optional](/doc/controllers/body-params.md#long-as-optional)
* [Send Number as Optional](/doc/controllers/body-params.md#send-number-as-optional)


# Send Delete Plain Text

```java
CompletableFuture<ServerResponse> sendDeletePlainTextAsync(
    final String textString)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `textString` | `String` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String textString = "textString2";

bodyParamsController.sendDeletePlainTextAsync(textString).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Delete Body

```java
CompletableFuture<ServerResponse> sendDeleteBodyAsync(
    final DeleteBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeleteBody`](/doc/models/delete-body.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
DeleteBody body = new DeleteBody();
body.setName("name6");
body.setField("field0");

bodyParamsController.sendDeleteBodyAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Date Array

```java
CompletableFuture<ServerResponse> sendDateArrayAsync(
    final List<LocalDate> dates)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dates` | `List<LocalDate>` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<LocalDate> dates = new LinkedList<>();
dates.add(LocalDate.parse("2016-03-13"));
dates.add(LocalDate.parse("2016-03-13"));

bodyParamsController.sendDateArrayAsync(dates).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Date

```java
CompletableFuture<ServerResponse> sendDateAsync(
    final LocalDate date)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `date` | `LocalDate` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDate date = LocalDate.parse("2016-03-13");

bodyParamsController.sendDateAsync(date).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Unix Date Time

```java
CompletableFuture<ServerResponse> sendUnixDateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault());

bodyParamsController.sendUnixDateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Rfc 1123 Date Time

```java
CompletableFuture<ServerResponse> sendRfc1123DateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT");

bodyParamsController.sendRfc1123DateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Rfc 3339 Date Time

```java
CompletableFuture<ServerResponse> sendRfc3339DateTimeAsync(
    final LocalDateTime datetime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetime` | `LocalDateTime` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME);

bodyParamsController.sendRfc3339DateTimeAsync(datetime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Unix Date Time Array

```java
CompletableFuture<ServerResponse> sendUnixDateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));

bodyParamsController.sendUnixDateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Rfc 1123 Date Time Array

```java
CompletableFuture<ServerResponse> sendRfc1123DateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));

bodyParamsController.sendRfc1123DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Rfc 3339 Date Time Array

```java
CompletableFuture<ServerResponse> sendRfc3339DateTimeArrayAsync(
    final List<LocalDateTime> datetimes)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `datetimes` | `List<LocalDateTime>` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));

bodyParamsController.sendRfc3339DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String Array

&lt;testing&gt; sends a string body param

```java
CompletableFuture<ServerResponse> sendStringArrayAsync(
    final List<String> sarray)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `sarray` | `List<String>` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<String> sarray = new LinkedList<>();
sarray.add("sarray8");
sarray.add("sarray9");

bodyParamsController.sendStringArrayAsync(sarray).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update String

```java
CompletableFuture<ServerResponse> updateStringAsync(
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `String` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

bodyParamsController.updateStringAsync(value).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Integer Array

```java
CompletableFuture<ServerResponse> sendIntegerArrayAsync(
    final List<Integer> integers)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `integers` | `List<Integer>` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<Integer> integers = new LinkedList<>();
integers.add(45);
integers.add(46);
integers.add(47);

bodyParamsController.sendIntegerArrayAsync(integers).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Wrap Body in Object

```java
CompletableFuture<ServerResponse> wrapBodyInObjectAsync(
    final String field,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `field` | `String` | Body, Required | &lt;testing&gt; &lt;testing&gt; |
| `name` | `String` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String field = "field6";
String name = "name0";

bodyParamsController.wrapBodyInObjectAsync(field, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Additional Model Parameters

```java
CompletableFuture<ServerResponse> additionalModelParametersAsync(
    final AdditionalModelParameters model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`AdditionalModelParameters`](/doc/models/additional-model-parameters.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
AdditionalModelParameters model = new AdditionalModelParameters();
model.setName("name2");
model.setField("field4");
model.setAddress("address8");
model.setJob(new Job());
model.getJob().setCompany("company8");

bodyParamsController.additionalModelParametersAsync(model).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Validate Required Parameter

```java
CompletableFuture<ServerResponse> validateRequiredParameterAsync(
    final Validate model,
    final String option)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Validate`](/doc/models/validate.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |
| `option` | `String` | Query, Optional | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
Validate model = new Validate();
model.setField("field4");
model.setName("name2");

bodyParamsController.validateRequiredParameterAsync(model, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Additional Model Parameters 1

&lt;testing&gt;

```java
CompletableFuture<ServerResponse> additionalModelParameters1Async(
    final AdditionalModelParameters model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`AdditionalModelParameters`](/doc/models/additional-model-parameters.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
AdditionalModelParameters model = new AdditionalModelParameters();
model.setName("name2");
model.setField("field4");
model.setAddress("address8");
model.setJob(new Job());
model.getJob().setCompany("company8");

bodyParamsController.additionalModelParameters1Async(model).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Model

```java
CompletableFuture<ServerResponse> sendModelAsync(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](/doc/models/employee.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
Employee model = new Employee();
model.setAddress("address8");
model.setAge(186L);
model.setBirthday(LocalDate.parse("2016-03-13"));
model.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
model.setName("name2");
model.setUid("uid2");
model.setDepartment("department8");
model.setDependents(new LinkedList<>());

Person modelDependents0 = new Person();
modelDependents0.setAddress("address5");
modelDependents0.setAge(237L);
modelDependents0.setBirthday(LocalDate.parse("2016-03-13"));
modelDependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
modelDependents0.setName("name9");
modelDependents0.setUid("uid9");
model.getDependents().add(modelDependents0);

model.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
model.setJoiningDay(Days.MONDAY);
model.setSalary(240);
model.setWorkingDays(new LinkedList<>());
model.getWorkingDays().add(Days.THURSDAY);
model.getWorkingDays().add(Days.WEDNESDAY_);
model.getWorkingDays().add(Days.TUESDAY);
model.setBoss(new Person());
model.getBoss().setAddress("address6");
model.getBoss().setAge(158L);
model.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
model.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
model.getBoss().setName("name0");
model.getBoss().setUid("uid0");

bodyParamsController.sendModelAsync(model).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Model Array

```java
CompletableFuture<ServerResponse> sendModelArrayAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](/doc/models/employee.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<Employee> models = new LinkedList<>();

Employee models0 = new Employee();
models0.setAddress("address2");
models0.setAge(254L);
models0.setBirthday(LocalDate.parse("2016-03-13"));
models0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0.setName("name6");
models0.setUid("uid6");
models0.setDepartment("department6");
models0.setDependents(new LinkedList<>());

Person models0Dependents0 = new Person();
models0Dependents0.setAddress("address9");
models0Dependents0.setAge(49L);
models0Dependents0.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents0.setName("name3");
models0Dependents0.setUid("uid3");
models0.getDependents().add(models0Dependents0);

Person models0Dependents1 = new Person();
models0Dependents1.setAddress("address0");
models0Dependents1.setAge(50L);
models0Dependents1.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents1.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents1.setName("name4");
models0Dependents1.setUid("uid4");
models0.getDependents().add(models0Dependents1);

Person models0Dependents2 = new Person();
models0Dependents2.setAddress("address1");
models0Dependents2.setAge(51L);
models0Dependents2.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents2.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents2.setName("name5");
models0Dependents2.setUid("uid5");
models0.getDependents().add(models0Dependents2);

models0.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
models0.setJoiningDay(Days.MONDAY);
models0.setSalary(84);
models0.setWorkingDays(new LinkedList<>());
models0.getWorkingDays().add(Days.SUNDAY);
models0.setBoss(new Person());
models0.getBoss().setAddress("address0");
models0.getBoss().setAge(154L);
models0.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
models0.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0.getBoss().setName("name4");
models0.getBoss().setUid("uid4");
models.add(models0);

Employee models1 = new Employee();
models1.setAddress("address3");
models1.setAge(255L);
models1.setBirthday(LocalDate.parse("2016-03-13"));
models1.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1.setName("name7");
models1.setUid("uid7");
models1.setDepartment("department7");
models1.setDependents(new LinkedList<>());

Person models1Dependents0 = new Person();
models1Dependents0.setAddress("address0");
models1Dependents0.setAge(50L);
models1Dependents0.setBirthday(LocalDate.parse("2016-03-13"));
models1Dependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1Dependents0.setName("name4");
models1Dependents0.setUid("uid4");
models1.getDependents().add(models1Dependents0);

models1.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
models1.setJoiningDay(Days.MONDAY);
models1.setSalary(85);
models1.setWorkingDays(new LinkedList<>());
models1.getWorkingDays().add(Days.MONDAY);
models1.getWorkingDays().add(Days.TUESDAY);
models1.setBoss(new Person());
models1.getBoss().setAddress("address1");
models1.getBoss().setAge(155L);
models1.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
models1.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1.getBoss().setName("name5");
models1.getBoss().setUid("uid5");
models.add(models1);


bodyParamsController.sendModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Dynamic

```java
CompletableFuture<ServerResponse> sendDynamicAsync(
    final Object dynamic)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dynamic` | `Object` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
Object dynamic = localhost3000.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}");

bodyParamsController.sendDynamicAsync(dynamic).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String

```java
CompletableFuture<ServerResponse> sendStringAsync(
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `String` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

bodyParamsController.sendStringAsync(value).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String Enum Array

```java
CompletableFuture<ServerResponse> sendStringEnumArrayAsync(
    final List<Days> days)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `days` | [`List<Days>`](/doc/models/days.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<Days> days = new LinkedList<>();
days.add(Days.SUNDAY);
days.add(Days.MONDAY);
days.add(Days.TUESDAY);

bodyParamsController.sendStringEnumArrayAsync(days).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Integer Enum Array

```java
CompletableFuture<ServerResponse> sendIntegerEnumArrayAsync(
    final List<SuiteCode> suites)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `suites` | [`List<SuiteCode>`](/doc/models/suite-code.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<SuiteCode> suites = new LinkedList<>();
suites.add(SuiteCode.HEARTS);
suites.add(SuiteCode.SPADES);
suites.add(SuiteCode.CLUBS);

bodyParamsController.sendIntegerEnumArrayAsync(suites).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Model

```java
CompletableFuture<ServerResponse> updateModelAsync(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](/doc/models/employee.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
Employee model = new Employee();
model.setAddress("address8");
model.setAge(186L);
model.setBirthday(LocalDate.parse("2016-03-13"));
model.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
model.setName("name2");
model.setUid("uid2");
model.setDepartment("department8");
model.setDependents(new LinkedList<>());

Person modelDependents0 = new Person();
modelDependents0.setAddress("address5");
modelDependents0.setAge(237L);
modelDependents0.setBirthday(LocalDate.parse("2016-03-13"));
modelDependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
modelDependents0.setName("name9");
modelDependents0.setUid("uid9");
model.getDependents().add(modelDependents0);

model.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
model.setJoiningDay(Days.MONDAY);
model.setSalary(240);
model.setWorkingDays(new LinkedList<>());
model.getWorkingDays().add(Days.THURSDAY);
model.getWorkingDays().add(Days.WEDNESDAY_);
model.getWorkingDays().add(Days.TUESDAY);
model.setBoss(new Person());
model.getBoss().setAddress("address6");
model.getBoss().setAge(158L);
model.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
model.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
model.getBoss().setName("name0");
model.getBoss().setUid("uid0");

bodyParamsController.updateModelAsync(model).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Delete Body With Model

```java
CompletableFuture<ServerResponse> sendDeleteBodyWithModelAsync(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](/doc/models/employee.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
Employee model = new Employee();
model.setAddress("address8");
model.setAge(186L);
model.setBirthday(LocalDate.parse("2016-03-13"));
model.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
model.setName("name2");
model.setUid("uid2");
model.setDepartment("department8");
model.setDependents(new LinkedList<>());

Person modelDependents0 = new Person();
modelDependents0.setAddress("address5");
modelDependents0.setAge(237L);
modelDependents0.setBirthday(LocalDate.parse("2016-03-13"));
modelDependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
modelDependents0.setName("name9");
modelDependents0.setUid("uid9");
model.getDependents().add(modelDependents0);

model.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
model.setJoiningDay(Days.MONDAY);
model.setSalary(240);
model.setWorkingDays(new LinkedList<>());
model.getWorkingDays().add(Days.THURSDAY);
model.getWorkingDays().add(Days.WEDNESDAY_);
model.getWorkingDays().add(Days.TUESDAY);
model.setBoss(new Person());
model.getBoss().setAddress("address6");
model.getBoss().setAge(158L);
model.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
model.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
model.getBoss().setName("name0");
model.getBoss().setUid("uid0");

bodyParamsController.sendDeleteBodyWithModelAsync(model).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Delete Body With Model Array

```java
CompletableFuture<ServerResponse> sendDeleteBodyWithModelArrayAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](/doc/models/employee.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<Employee> models = new LinkedList<>();

Employee models0 = new Employee();
models0.setAddress("address2");
models0.setAge(254L);
models0.setBirthday(LocalDate.parse("2016-03-13"));
models0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0.setName("name6");
models0.setUid("uid6");
models0.setDepartment("department6");
models0.setDependents(new LinkedList<>());

Person models0Dependents0 = new Person();
models0Dependents0.setAddress("address9");
models0Dependents0.setAge(49L);
models0Dependents0.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents0.setName("name3");
models0Dependents0.setUid("uid3");
models0.getDependents().add(models0Dependents0);

Person models0Dependents1 = new Person();
models0Dependents1.setAddress("address0");
models0Dependents1.setAge(50L);
models0Dependents1.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents1.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents1.setName("name4");
models0Dependents1.setUid("uid4");
models0.getDependents().add(models0Dependents1);

Person models0Dependents2 = new Person();
models0Dependents2.setAddress("address1");
models0Dependents2.setAge(51L);
models0Dependents2.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents2.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents2.setName("name5");
models0Dependents2.setUid("uid5");
models0.getDependents().add(models0Dependents2);

models0.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
models0.setJoiningDay(Days.MONDAY);
models0.setSalary(84);
models0.setWorkingDays(new LinkedList<>());
models0.getWorkingDays().add(Days.SUNDAY);
models0.setBoss(new Person());
models0.getBoss().setAddress("address0");
models0.getBoss().setAge(154L);
models0.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
models0.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0.getBoss().setName("name4");
models0.getBoss().setUid("uid4");
models.add(models0);

Employee models1 = new Employee();
models1.setAddress("address3");
models1.setAge(255L);
models1.setBirthday(LocalDate.parse("2016-03-13"));
models1.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1.setName("name7");
models1.setUid("uid7");
models1.setDepartment("department7");
models1.setDependents(new LinkedList<>());

Person models1Dependents0 = new Person();
models1Dependents0.setAddress("address0");
models1Dependents0.setAge(50L);
models1Dependents0.setBirthday(LocalDate.parse("2016-03-13"));
models1Dependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1Dependents0.setName("name4");
models1Dependents0.setUid("uid4");
models1.getDependents().add(models1Dependents0);

models1.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
models1.setJoiningDay(Days.MONDAY);
models1.setSalary(85);
models1.setWorkingDays(new LinkedList<>());
models1.getWorkingDays().add(Days.MONDAY);
models1.getWorkingDays().add(Days.TUESDAY);
models1.setBoss(new Person());
models1.getBoss().setAddress("address1");
models1.getBoss().setAge(155L);
models1.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
models1.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1.getBoss().setName("name5");
models1.getBoss().setUid("uid5");
models.add(models1);


bodyParamsController.sendDeleteBodyWithModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Model Array

```java
CompletableFuture<ServerResponse> updateModelArrayAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](/doc/models/employee.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<Employee> models = new LinkedList<>();

Employee models0 = new Employee();
models0.setAddress("address2");
models0.setAge(254L);
models0.setBirthday(LocalDate.parse("2016-03-13"));
models0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0.setName("name6");
models0.setUid("uid6");
models0.setDepartment("department6");
models0.setDependents(new LinkedList<>());

Person models0Dependents0 = new Person();
models0Dependents0.setAddress("address9");
models0Dependents0.setAge(49L);
models0Dependents0.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents0.setName("name3");
models0Dependents0.setUid("uid3");
models0.getDependents().add(models0Dependents0);

Person models0Dependents1 = new Person();
models0Dependents1.setAddress("address0");
models0Dependents1.setAge(50L);
models0Dependents1.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents1.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents1.setName("name4");
models0Dependents1.setUid("uid4");
models0.getDependents().add(models0Dependents1);

Person models0Dependents2 = new Person();
models0Dependents2.setAddress("address1");
models0Dependents2.setAge(51L);
models0Dependents2.setBirthday(LocalDate.parse("2016-03-13"));
models0Dependents2.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0Dependents2.setName("name5");
models0Dependents2.setUid("uid5");
models0.getDependents().add(models0Dependents2);

models0.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
models0.setJoiningDay(Days.MONDAY);
models0.setSalary(84);
models0.setWorkingDays(new LinkedList<>());
models0.getWorkingDays().add(Days.SUNDAY);
models0.setBoss(new Person());
models0.getBoss().setAddress("address0");
models0.getBoss().setAge(154L);
models0.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
models0.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models0.getBoss().setName("name4");
models0.getBoss().setUid("uid4");
models.add(models0);

Employee models1 = new Employee();
models1.setAddress("address3");
models1.setAge(255L);
models1.setBirthday(LocalDate.parse("2016-03-13"));
models1.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1.setName("name7");
models1.setUid("uid7");
models1.setDepartment("department7");
models1.setDependents(new LinkedList<>());

Person models1Dependents0 = new Person();
models1Dependents0.setAddress("address0");
models1Dependents0.setAge(50L);
models1Dependents0.setBirthday(LocalDate.parse("2016-03-13"));
models1Dependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1Dependents0.setName("name4");
models1Dependents0.setUid("uid4");
models1.getDependents().add(models1Dependents0);

models1.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
models1.setJoiningDay(Days.MONDAY);
models1.setSalary(85);
models1.setWorkingDays(new LinkedList<>());
models1.getWorkingDays().add(Days.MONDAY);
models1.getWorkingDays().add(Days.TUESDAY);
models1.setBoss(new Person());
models1.getBoss().setAddress("address1");
models1.getBoss().setAge(155L);
models1.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
models1.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
models1.getBoss().setName("name5");
models1.getBoss().setUid("uid5");
models.add(models1);


bodyParamsController.updateModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update String 1

```java
CompletableFuture<ServerResponse> updateString1Async(
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `String` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

bodyParamsController.updateString1Async(value).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update String Array

```java
CompletableFuture<ServerResponse> updateStringArrayAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<String> strings = new LinkedList<>();
strings.add("strings5");

bodyParamsController.updateStringArrayAsync(strings).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String With New Line

```java
CompletableFuture<ServerResponse> sendStringWithNewLineAsync(
    final TestNstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestNstringEncoding`](/doc/models/test-nstring-encoding.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
TestNstringEncoding body = new TestNstringEncoding();
body.setField("field0");
body.setName("name6");

bodyParamsController.sendStringWithNewLineAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String With R

```java
CompletableFuture<ServerResponse> sendStringWithRAsync(
    final TestRstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestRstringEncoding`](/doc/models/test-rstring-encoding.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
TestRstringEncoding body = new TestRstringEncoding();
body.setField("field0");
body.setName("name6");

bodyParamsController.sendStringWithRAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String in Body With R N

```java
CompletableFuture<ServerResponse> sendStringInBodyWithRNAsync(
    final TestRNstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestRNstringEncoding`](/doc/models/test-r-nstring-encoding.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
TestRNstringEncoding body = new TestRNstringEncoding();
body.setField("field0");
body.setName("name6");

bodyParamsController.sendStringInBodyWithRNAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Optional Unix Date Time in Body

```java
CompletableFuture<ServerResponse> sendOptionalUnixDateTimeInBodyAsync(
    final LocalDateTime dateTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | `LocalDateTime` | Body, Optional | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(1484719381), ZoneId.systemDefault());

bodyParamsController.sendOptionalUnixDateTimeInBodyAsync(dateTime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Optional Rfc 1123 in Body

```java
CompletableFuture<ServerResponse> sendOptionalRfc1123InBodyAsync(
    final LocalDateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `LocalDateTime` | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime body = DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT");

bodyParamsController.sendOptionalRfc1123InBodyAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Datetime Optional in Endpoint

```java
CompletableFuture<ServerResponse> sendDatetimeOptionalInEndpointAsync(
    final LocalDateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `LocalDateTime` | Body, Optional | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime body = LocalDateTime.parse("02/13/1994 14:01:54", DateTimeFormatter.ISO_DATE_TIME);

bodyParamsController.sendDatetimeOptionalInEndpointAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Optional Unix Time Stamp in Model Body

```java
CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInModelBodyAsync(
    final UnixDateTime dateTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | [`UnixDateTime`](/doc/models/unix-date-time.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
UnixDateTime dateTime = new UnixDateTime();
dateTime.setDateTime(LocalDateTime.ofInstant(Instant.ofEpochSecond(1484719381), ZoneId.systemDefault()));

bodyParamsController.sendOptionalUnixTimeStampInModelBodyAsync(dateTime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Optional Unix Time Stamp in Nested Model Body

```java
CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInNestedModelBodyAsync(
    final SendUnixDateTime dateTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | [`SendUnixDateTime`](/doc/models/send-unix-date-time.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SendUnixDateTime dateTime = new SendUnixDateTime();
dateTime.setDateTime(new UnixDateTime());
dateTime.getDateTime().setDateTime(LocalDateTime.ofInstant(Instant.ofEpochSecond(1484719381), ZoneId.systemDefault()));

bodyParamsController.sendOptionalUnixTimeStampInNestedModelBodyAsync(dateTime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Rfc 1123 Date Time in Nested Model

```java
CompletableFuture<ServerResponse> sendRfc1123DateTimeInNestedModelAsync(
    final SendRfc1123DateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SendRfc1123DateTime`](/doc/models/send-rfc-1123-date-time.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SendRfc1123DateTime body = new SendRfc1123DateTime();
body.setDateTime(new ModelWithOptionalRfc1123DateTime());
body.getDateTime().setDateTime(DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"));

bodyParamsController.sendRfc1123DateTimeInNestedModelAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Rfc 1123 Date Time in Model

```java
CompletableFuture<ServerResponse> sendRfc1123DateTimeInModelAsync(
    final ModelWithOptionalRfc1123DateTime dateTime)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `dateTime` | [`ModelWithOptionalRfc1123DateTime`](/doc/models/model-with-optional-rfc-1123-date-time.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
ModelWithOptionalRfc1123DateTime dateTime = new ModelWithOptionalRfc1123DateTime();
dateTime.setDateTime(DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"));

bodyParamsController.sendRfc1123DateTimeInModelAsync(dateTime).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Optional Datetime in Model

```java
CompletableFuture<ServerResponse> sendOptionalDatetimeInModelAsync(
    final ModelWithOptionalRfc3339DateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ModelWithOptionalRfc3339DateTime`](/doc/models/model-with-optional-rfc-3339-date-time.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
ModelWithOptionalRfc3339DateTime body = new ModelWithOptionalRfc3339DateTime();
body.setDateTime(LocalDateTime.parse("1994-02-13T14:01:54.9571247Z", DateTimeFormatter.ISO_DATE_TIME));

bodyParamsController.sendOptionalDatetimeInModelAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Rfc 339 Date Time in Nested Models

```java
CompletableFuture<ServerResponse> sendRfc339DateTimeInNestedModelsAsync(
    final SendRfc339DateTime body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SendRfc339DateTime`](/doc/models/send-rfc-339-date-time.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SendRfc339DateTime body = new SendRfc339DateTime();
body.setDateTime(new ModelWithOptionalRfc3339DateTime());
body.getDateTime().setDateTime(LocalDateTime.parse("1994-02-13T14:01:54.9571247Z", DateTimeFormatter.ISO_DATE_TIME));

bodyParamsController.sendRfc339DateTimeInNestedModelsAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Uuid as Optional

```java
CompletableFuture<ServerResponse> uuidAsOptionalAsync(
    final UuidAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UuidAsOptional`](/doc/models/uuid-as-optional.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
UuidAsOptional body = new UuidAsOptional();
body.setUuid(UUID.fromString("123e4567-e89b-12d3-a456-426655440000"));

bodyParamsController.uuidAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Boolean as Optional

```java
CompletableFuture<ServerResponse> booleanAsOptionalAsync(
    final BooleanAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BooleanAsOptional`](/doc/models/boolean-as-optional.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
BooleanAsOptional body = new BooleanAsOptional();
body.setMBoolean(true);

bodyParamsController.booleanAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Date as Optional

```java
CompletableFuture<ServerResponse> dateAsOptionalAsync(
    final DateAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DateAsOptional`](/doc/models/date-as-optional.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
DateAsOptional body = new DateAsOptional();
body.setDate(LocalDate.parse("1994-02-13"));

bodyParamsController.dateAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Dynamic as Optional

```java
CompletableFuture<ServerResponse> dynamicAsOptionalAsync(
    final DynamicAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DynamicAsOptional`](/doc/models/dynamic-as-optional.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
DynamicAsOptional body = new DynamicAsOptional();
body.setDynamic(localhost3000.ApiHelper.deserialize("{\"dynamic\":\"test\"}"));

bodyParamsController.dynamicAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# String as Optional

```java
CompletableFuture<ServerResponse> stringAsOptionalAsync(
    final StringAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`StringAsOptional`](/doc/models/string-as-optional.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
StringAsOptional body = new StringAsOptional();
body.setMString("test");

bodyParamsController.stringAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Precision as Optional

```java
CompletableFuture<ServerResponse> precisionAsOptionalAsync(
    final PrecisionAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PrecisionAsOptional`](/doc/models/precision-as-optional.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
PrecisionAsOptional body = new PrecisionAsOptional();
body.setPrecision(1.23);

bodyParamsController.precisionAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Long as Optional

```java
CompletableFuture<ServerResponse> longAsOptionalAsync(
    final LongAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`LongAsOptional`](/doc/models/long-as-optional.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LongAsOptional body = new LongAsOptional();
body.setMLong(123123L);

bodyParamsController.longAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Number as Optional

```java
CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
    final NumberAsOptional body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`NumberAsOptional`](/doc/models/number-as-optional.md) | Body, Required | &lt;testing&gt; &lt;testing&gt; |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
NumberAsOptional body = new NumberAsOptional();
body.setNumber(1);

bodyParamsController.sendNumberAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

