# Form Params

```java
FormParamsController formParamsController = client.getFormParamsController();
```

## Class Name

`FormParamsController`

## Methods

* [Send Delete Form](/doc/controllers/form-params.md#send-delete-form)
* [Send Delete Multipart](/doc/controllers/form-params.md#send-delete-multipart)
* [Send Date Array](/doc/controllers/form-params.md#send-date-array)
* [Send Date](/doc/controllers/form-params.md#send-date)
* [Send Unix Date Time](/doc/controllers/form-params.md#send-unix-date-time)
* [Send Rfc 1123 Date Time](/doc/controllers/form-params.md#send-rfc-1123-date-time)
* [Send Rfc 3339 Date Time](/doc/controllers/form-params.md#send-rfc-3339-date-time)
* [Send Unix Date Time Array](/doc/controllers/form-params.md#send-unix-date-time-array)
* [Send Rfc 1123 Date Time Array](/doc/controllers/form-params.md#send-rfc-1123-date-time-array)
* [Send Long](/doc/controllers/form-params.md#send-long)
* [Send Integer Array](/doc/controllers/form-params.md#send-integer-array)
* [Send String Array](/doc/controllers/form-params.md#send-string-array)
* [Allow Dynamic Form Fields](/doc/controllers/form-params.md#allow-dynamic-form-fields)
* [Send Model](/doc/controllers/form-params.md#send-model)
* [Send Model Array](/doc/controllers/form-params.md#send-model-array)
* [Send File](/doc/controllers/form-params.md#send-file)
* [Send Multiple Files](/doc/controllers/form-params.md#send-multiple-files)
* [Send String](/doc/controllers/form-params.md#send-string)
* [Send Rfc 3339 Date Time Array](/doc/controllers/form-params.md#send-rfc-3339-date-time-array)
* [Send Mixed Array](/doc/controllers/form-params.md#send-mixed-array)
* [Update Model With Form](/doc/controllers/form-params.md#update-model-with-form)
* [Send Delete Form 1](/doc/controllers/form-params.md#send-delete-form-1)
* [Send Delete Form With Model Array](/doc/controllers/form-params.md#send-delete-form-with-model-array)
* [Update Model Array With Form](/doc/controllers/form-params.md#update-model-array-with-form)
* [Update String With Form](/doc/controllers/form-params.md#update-string-with-form)
* [Update String Array With Form](/doc/controllers/form-params.md#update-string-array-with-form)
* [Send Integer Enum Array](/doc/controllers/form-params.md#send-integer-enum-array)
* [Send String Enum Array](/doc/controllers/form-params.md#send-string-enum-array)
* [Send String in Form With New Line](/doc/controllers/form-params.md#send-string-in-form-with-new-line)
* [Send String in Form With R](/doc/controllers/form-params.md#send-string-in-form-with-r)
* [Send String in Form With R N](/doc/controllers/form-params.md#send-string-in-form-with-r-n)
* [Send Optional Unix Date Time in Body](/doc/controllers/form-params.md#send-optional-unix-date-time-in-body)
* [Send Optional Rfc 1123 in Body](/doc/controllers/form-params.md#send-optional-rfc-1123-in-body)
* [Send Datetime Optional in Endpoint](/doc/controllers/form-params.md#send-datetime-optional-in-endpoint)
* [Send Optional Unix Time Stamp in Model Body](/doc/controllers/form-params.md#send-optional-unix-time-stamp-in-model-body)
* [Send Optional Unix Time Stamp in Nested Model Body](/doc/controllers/form-params.md#send-optional-unix-time-stamp-in-nested-model-body)
* [Send Rfc 1123 Date Time in Nested Model](/doc/controllers/form-params.md#send-rfc-1123-date-time-in-nested-model)
* [Send Rfc 1123 Date Time in Model](/doc/controllers/form-params.md#send-rfc-1123-date-time-in-model)
* [Send Optional Datetime in Model](/doc/controllers/form-params.md#send-optional-datetime-in-model)
* [Send Rfc 339 Date Time in Nested Models](/doc/controllers/form-params.md#send-rfc-339-date-time-in-nested-models)
* [Uuid as Optional](/doc/controllers/form-params.md#uuid-as-optional)
* [Boolean as Optional](/doc/controllers/form-params.md#boolean-as-optional)
* [Date as Optional](/doc/controllers/form-params.md#date-as-optional)
* [Dynamic as Optional](/doc/controllers/form-params.md#dynamic-as-optional)
* [String as Optional](/doc/controllers/form-params.md#string-as-optional)
* [Precision as Optional](/doc/controllers/form-params.md#precision-as-optional)
* [Long as Optional](/doc/controllers/form-params.md#long-as-optional)
* [Send Number as Optional](/doc/controllers/form-params.md#send-number-as-optional)


# Send Delete Form

```java
CompletableFuture<ServerResponse> sendDeleteFormAsync(
    final DeleteBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DeleteBody`](/doc/models/delete-body.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
DeleteBody body = new DeleteBody();
body.setName("name6");
body.setField("field0");

formParamsController.sendDeleteFormAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Delete Multipart

```java
CompletableFuture<ServerResponse> sendDeleteMultipartAsync(
    final FileWrapper file)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `file` | `FileWrapper` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
FileWrapper file = new FileWrapper(new File("dummy_file"), "optional-content-type");

formParamsController.sendDeleteMultipartAsync(file).thenAccept(result -> {
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
| `dates` | `List<LocalDate>` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<LocalDate> dates = new LinkedList<>();
dates.add(LocalDate.parse("2016-03-13"));
dates.add(LocalDate.parse("2016-03-13"));

formParamsController.sendDateArrayAsync(dates).thenAccept(result -> {
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
| `date` | `LocalDate` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDate date = LocalDate.parse("2016-03-13");

formParamsController.sendDateAsync(date).thenAccept(result -> {
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
| `datetime` | `LocalDateTime` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault());

formParamsController.sendUnixDateTimeAsync(datetime).thenAccept(result -> {
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
| `datetime` | `LocalDateTime` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT");

formParamsController.sendRfc1123DateTimeAsync(datetime).thenAccept(result -> {
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
| `datetime` | `LocalDateTime` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime datetime = LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME);

formParamsController.sendRfc3339DateTimeAsync(datetime).thenAccept(result -> {
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
| `datetimes` | `List<LocalDateTime>` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));
datetimes.add(LocalDateTime.ofInstant(Instant.ofEpochSecond(1480809600), ZoneId.systemDefault()));

formParamsController.sendUnixDateTimeArrayAsync(datetimes).thenAccept(result -> {
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
| `datetimes` | `List<LocalDateTime>` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
datetimes.add(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));

formParamsController.sendRfc1123DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Long

```java
CompletableFuture<ServerResponse> sendLongAsync(
    final long value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `long` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
long value = 64L;

formParamsController.sendLongAsync(value).thenAccept(result -> {
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
| `integers` | `List<Integer>` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<Integer> integers = new LinkedList<>();
integers.add(45);
integers.add(46);
integers.add(47);

formParamsController.sendIntegerArrayAsync(integers).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String Array

```java
CompletableFuture<ServerResponse> sendStringArrayAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<String> strings = new LinkedList<>();
strings.add("strings5");

formParamsController.sendStringArrayAsync(strings).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Allow Dynamic Form Fields

```java
CompletableFuture<ServerResponse> allowDynamicFormFieldsAsync(
    final String name,
    final Map<String, Object> fieldParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Form, Required | <testing> <testing> |
| `fieldParameters` | `Map<String, Object>` | Optional | Pass additional field parameters. |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String name = "name0";
LinkedHashMap<String, Object> fieldParameters = new LinkedHashMap<>();
fieldParameters.put("key0", "additionalFieldParams9");

formParamsController.allowDynamicFormFieldsAsync(name, fieldParameters).thenAccept(result -> {
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
| `model` | [`Employee`](/doc/models/employee.md) | Form, Required | <testing> <testing> |

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

formParamsController.sendModelAsync(model).thenAccept(result -> {
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
| `models` | [`List<Employee>`](/doc/models/employee.md) | Form, Required | <testing> <testing> |

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


formParamsController.sendModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send File

```java
CompletableFuture<ServerResponse> sendFileAsync(
    final FileWrapper file)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `file` | `FileWrapper` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
FileWrapper file = new FileWrapper(new File("dummy_file"), "optional-content-type");

formParamsController.sendFileAsync(file).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Multiple Files

```java
CompletableFuture<ServerResponse> sendMultipleFilesAsync(
    final FileWrapper file,
    final FileWrapper file1)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `file` | `FileWrapper` | Form, Required | <testing> <testing> |
| `file1` | `FileWrapper` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
FileWrapper file = new FileWrapper(new File("dummy_file"), "optional-content-type");
FileWrapper file1 = new FileWrapper(new File("dummy_file"), "optional-content-type");

formParamsController.sendMultipleFilesAsync(file, file1).thenAccept(result -> {
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
| `value` | `String` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

formParamsController.sendStringAsync(value).thenAccept(result -> {
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
| `datetimes` | `List<LocalDateTime>` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<LocalDateTime> datetimes = new LinkedList<>();
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
datetimes.add(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));

formParamsController.sendRfc3339DateTimeArrayAsync(datetimes).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Mixed Array

<testing> Send a variety for form params. Returns file count and body params

```java
CompletableFuture<ServerResponse> sendMixedArrayAsync(
    final SendMixedArrayInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `file` | `FileWrapper` | Form, Required | <testing> <testing> |
| `integers` | `List<Integer>` | Form, Required | <testing> <testing> |
| `models` | [`List<Employee>`](/doc/models/employee.md) | Form, Required | <testing> <testing> |
| `strings` | `List<String>` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SendMixedArrayInput sendMixedArrayInput = new SendMixedArrayInput();
sendMixedArrayInput.setFile(new FileWrapper(new File("dummy_file"), "optional-content-type"));
sendMixedArrayInput.setIntegers(new LinkedList<>());
sendMixedArrayInput.getIntegers().add(45);
sendMixedArrayInput.getIntegers().add(46);
sendMixedArrayInput.getIntegers().add(47);
sendMixedArrayInput.setModels(new LinkedList<>());

Employee sendMixedArrayInputModels0 = new Employee();
sendMixedArrayInputModels0.setAddress("address2");
sendMixedArrayInputModels0.setAge(254L);
sendMixedArrayInputModels0.setBirthday(LocalDate.parse("2016-03-13"));
sendMixedArrayInputModels0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
sendMixedArrayInputModels0.setName("name6");
sendMixedArrayInputModels0.setUid("uid6");
sendMixedArrayInputModels0.setDepartment("department6");
sendMixedArrayInputModels0.setDependents(new LinkedList<>());

Person sendMixedArrayInputModels0Dependents0 = new Person();
sendMixedArrayInputModels0Dependents0.setAddress("address9");
sendMixedArrayInputModels0Dependents0.setAge(49L);
sendMixedArrayInputModels0Dependents0.setBirthday(LocalDate.parse("2016-03-13"));
sendMixedArrayInputModels0Dependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
sendMixedArrayInputModels0Dependents0.setName("name3");
sendMixedArrayInputModels0Dependents0.setUid("uid3");
sendMixedArrayInputModels0.getDependents().add(sendMixedArrayInputModels0Dependents0);

Person sendMixedArrayInputModels0Dependents1 = new Person();
sendMixedArrayInputModels0Dependents1.setAddress("address0");
sendMixedArrayInputModels0Dependents1.setAge(50L);
sendMixedArrayInputModels0Dependents1.setBirthday(LocalDate.parse("2016-03-13"));
sendMixedArrayInputModels0Dependents1.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
sendMixedArrayInputModels0Dependents1.setName("name4");
sendMixedArrayInputModels0Dependents1.setUid("uid4");
sendMixedArrayInputModels0.getDependents().add(sendMixedArrayInputModels0Dependents1);

Person sendMixedArrayInputModels0Dependents2 = new Person();
sendMixedArrayInputModels0Dependents2.setAddress("address1");
sendMixedArrayInputModels0Dependents2.setAge(51L);
sendMixedArrayInputModels0Dependents2.setBirthday(LocalDate.parse("2016-03-13"));
sendMixedArrayInputModels0Dependents2.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
sendMixedArrayInputModels0Dependents2.setName("name5");
sendMixedArrayInputModels0Dependents2.setUid("uid5");
sendMixedArrayInputModels0.getDependents().add(sendMixedArrayInputModels0Dependents2);

sendMixedArrayInputModels0.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
sendMixedArrayInputModels0.setJoiningDay(Days.MONDAY);
sendMixedArrayInputModels0.setSalary(84);
sendMixedArrayInputModels0.setWorkingDays(new LinkedList<>());
sendMixedArrayInputModels0.getWorkingDays().add(Days.SUNDAY);
sendMixedArrayInputModels0.setBoss(new Person());
sendMixedArrayInputModels0.getBoss().setAddress("address0");
sendMixedArrayInputModels0.getBoss().setAge(154L);
sendMixedArrayInputModels0.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
sendMixedArrayInputModels0.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
sendMixedArrayInputModels0.getBoss().setName("name4");
sendMixedArrayInputModels0.getBoss().setUid("uid4");
sendMixedArrayInput.getModels().add(sendMixedArrayInputModels0);

Employee sendMixedArrayInputModels1 = new Employee();
sendMixedArrayInputModels1.setAddress("address3");
sendMixedArrayInputModels1.setAge(255L);
sendMixedArrayInputModels1.setBirthday(LocalDate.parse("2016-03-13"));
sendMixedArrayInputModels1.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
sendMixedArrayInputModels1.setName("name7");
sendMixedArrayInputModels1.setUid("uid7");
sendMixedArrayInputModels1.setDepartment("department7");
sendMixedArrayInputModels1.setDependents(new LinkedList<>());

Person sendMixedArrayInputModels1Dependents0 = new Person();
sendMixedArrayInputModels1Dependents0.setAddress("address0");
sendMixedArrayInputModels1Dependents0.setAge(50L);
sendMixedArrayInputModels1Dependents0.setBirthday(LocalDate.parse("2016-03-13"));
sendMixedArrayInputModels1Dependents0.setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
sendMixedArrayInputModels1Dependents0.setName("name4");
sendMixedArrayInputModels1Dependents0.setUid("uid4");
sendMixedArrayInputModels1.getDependents().add(sendMixedArrayInputModels1Dependents0);

sendMixedArrayInputModels1.setHiredAt(DateTimeHelper.fromRfc1123DateTime("Mon, 15 Jun 2009 20:45:30 GMT"));
sendMixedArrayInputModels1.setJoiningDay(Days.MONDAY);
sendMixedArrayInputModels1.setSalary(85);
sendMixedArrayInputModels1.setWorkingDays(new LinkedList<>());
sendMixedArrayInputModels1.getWorkingDays().add(Days.MONDAY);
sendMixedArrayInputModels1.getWorkingDays().add(Days.TUESDAY);
sendMixedArrayInputModels1.setBoss(new Person());
sendMixedArrayInputModels1.getBoss().setAddress("address1");
sendMixedArrayInputModels1.getBoss().setAge(155L);
sendMixedArrayInputModels1.getBoss().setBirthday(LocalDate.parse("2016-03-13"));
sendMixedArrayInputModels1.getBoss().setBirthtime(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));
sendMixedArrayInputModels1.getBoss().setName("name5");
sendMixedArrayInputModels1.getBoss().setUid("uid5");
sendMixedArrayInput.getModels().add(sendMixedArrayInputModels1);

sendMixedArrayInput.setStrings(new LinkedList<>());
sendMixedArrayInput.getStrings().add("strings5");

formParamsController.sendMixedArrayAsync(sendMixedArrayInput).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Model With Form

```java
CompletableFuture<ServerResponse> updateModelWithFormAsync(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](/doc/models/employee.md) | Form, Required | <testing> <testing> |

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

formParamsController.updateModelWithFormAsync(model).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Delete Form 1

```java
CompletableFuture<ServerResponse> sendDeleteForm1Async(
    final Employee model)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `model` | [`Employee`](/doc/models/employee.md) | Form, Required | <testing> <testing> |

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

formParamsController.sendDeleteForm1Async(model).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send Delete Form With Model Array

```java
CompletableFuture<ServerResponse> sendDeleteFormWithModelArrayAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](/doc/models/employee.md) | Form, Required | <testing> <testing> |

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


formParamsController.sendDeleteFormWithModelArrayAsync(models).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Model Array With Form

```java
CompletableFuture<ServerResponse> updateModelArrayWithFormAsync(
    final List<Employee> models)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `models` | [`List<Employee>`](/doc/models/employee.md) | Form, Required | <testing> <testing> |

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


formParamsController.updateModelArrayWithFormAsync(models).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update String With Form

```java
CompletableFuture<ServerResponse> updateStringWithFormAsync(
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `value` | `String` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
String value = "value2";

formParamsController.updateStringWithFormAsync(value).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update String Array With Form

```java
CompletableFuture<ServerResponse> updateStringArrayWithFormAsync(
    final List<String> strings)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `strings` | `List<String>` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<String> strings = new LinkedList<>();
strings.add("strings5");

formParamsController.updateStringArrayWithFormAsync(strings).thenAccept(result -> {
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
| `suites` | [`List<SuiteCode>`](/doc/models/suite-code.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<SuiteCode> suites = new LinkedList<>();
suites.add(SuiteCode.HEARTS);
suites.add(SuiteCode.SPADES);
suites.add(SuiteCode.CLUBS);

formParamsController.sendIntegerEnumArrayAsync(suites).thenAccept(result -> {
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
| `days` | [`List<Days>`](/doc/models/days.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
List<Days> days = new LinkedList<>();
days.add(Days.SUNDAY);
days.add(Days.MONDAY);
days.add(Days.TUESDAY);

formParamsController.sendStringEnumArrayAsync(days).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String in Form With New Line

```java
CompletableFuture<ServerResponse> sendStringInFormWithNewLineAsync(
    final TestNstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestNstringEncoding`](/doc/models/test-nstring-encoding.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
TestNstringEncoding body = new TestNstringEncoding();
body.setField("field0");
body.setName("name6");

formParamsController.sendStringInFormWithNewLineAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String in Form With R

```java
CompletableFuture<ServerResponse> sendStringInFormWithRAsync(
    final TestRstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestRstringEncoding`](/doc/models/test-rstring-encoding.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
TestRstringEncoding body = new TestRstringEncoding();
body.setField("field0");
body.setName("name6");

formParamsController.sendStringInFormWithRAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Send String in Form With R N

```java
CompletableFuture<ServerResponse> sendStringInFormWithRNAsync(
    final TestRNstringEncoding body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TestRNstringEncoding`](/doc/models/test-r-nstring-encoding.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
TestRNstringEncoding body = new TestRNstringEncoding();
body.setField("field0");
body.setName("name6");

formParamsController.sendStringInFormWithRNAsync(body).thenAccept(result -> {
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
| `dateTime` | `LocalDateTime` | Form, Optional | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(1484719381), ZoneId.systemDefault());

formParamsController.sendOptionalUnixDateTimeInBodyAsync(dateTime).thenAccept(result -> {
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
| `body` | `LocalDateTime` | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime body = DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT");

formParamsController.sendOptionalRfc1123InBodyAsync(body).thenAccept(result -> {
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
| `body` | `LocalDateTime` | Form, Optional | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LocalDateTime body = LocalDateTime.parse("02/13/1994 14:01:54", DateTimeFormatter.ISO_DATE_TIME);

formParamsController.sendDatetimeOptionalInEndpointAsync(body).thenAccept(result -> {
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
| `dateTime` | [`UnixDateTime`](/doc/models/unix-date-time.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
UnixDateTime dateTime = new UnixDateTime();
dateTime.setDateTime(LocalDateTime.ofInstant(Instant.ofEpochSecond(1484719381), ZoneId.systemDefault()));

formParamsController.sendOptionalUnixTimeStampInModelBodyAsync(dateTime).thenAccept(result -> {
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
| `dateTime` | [`SendUnixDateTime`](/doc/models/send-unix-date-time.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SendUnixDateTime dateTime = new SendUnixDateTime();
dateTime.setDateTime(new UnixDateTime());
dateTime.getDateTime().setDateTime(LocalDateTime.ofInstant(Instant.ofEpochSecond(1484719381), ZoneId.systemDefault()));

formParamsController.sendOptionalUnixTimeStampInNestedModelBodyAsync(dateTime).thenAccept(result -> {
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
| `body` | [`SendRfc1123DateTime`](/doc/models/send-rfc-1123-date-time.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SendRfc1123DateTime body = new SendRfc1123DateTime();
body.setDateTime(new ModelWithOptionalRfc1123DateTime());
body.getDateTime().setDateTime(DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"));

formParamsController.sendRfc1123DateTimeInNestedModelAsync(body).thenAccept(result -> {
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
| `dateTime` | [`ModelWithOptionalRfc1123DateTime`](/doc/models/model-with-optional-rfc-1123-date-time.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
ModelWithOptionalRfc1123DateTime dateTime = new ModelWithOptionalRfc1123DateTime();
dateTime.setDateTime(DateTimeHelper.fromRfc1123DateTime("Sun, 06 Nov 1994 08:49:37 GMT"));

formParamsController.sendRfc1123DateTimeInModelAsync(dateTime).thenAccept(result -> {
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
| `body` | [`ModelWithOptionalRfc3339DateTime`](/doc/models/model-with-optional-rfc-3339-date-time.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
ModelWithOptionalRfc3339DateTime body = new ModelWithOptionalRfc3339DateTime();
body.setDateTime(LocalDateTime.parse("1994-02-13T14:01:54.9571247Z", DateTimeFormatter.ISO_DATE_TIME));

formParamsController.sendOptionalDatetimeInModelAsync(body).thenAccept(result -> {
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
| `body` | [`SendRfc339DateTime`](/doc/models/send-rfc-339-date-time.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
SendRfc339DateTime body = new SendRfc339DateTime();
body.setDateTime(new ModelWithOptionalRfc3339DateTime());
body.getDateTime().setDateTime(LocalDateTime.parse("1994-02-13T14:01:54.9571247Z", DateTimeFormatter.ISO_DATE_TIME));

formParamsController.sendRfc339DateTimeInNestedModelsAsync(body).thenAccept(result -> {
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
| `body` | [`UuidAsOptional`](/doc/models/uuid-as-optional.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
UuidAsOptional body = new UuidAsOptional();
body.setUuid(UUID.fromString("123e4567-e89b-12d3-a456-426655440000"));

formParamsController.uuidAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`BooleanAsOptional`](/doc/models/boolean-as-optional.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
BooleanAsOptional body = new BooleanAsOptional();
body.setMBoolean(true);

formParamsController.booleanAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`DateAsOptional`](/doc/models/date-as-optional.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
DateAsOptional body = new DateAsOptional();
body.setDate(LocalDate.parse("1994-02-13"));

formParamsController.dateAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`DynamicAsOptional`](/doc/models/dynamic-as-optional.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
DynamicAsOptional body = new DynamicAsOptional();
body.setDynamic(localhost3000.ApiHelper.deserialize("{\"dynamic\":\"test\"}"));

formParamsController.dynamicAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`StringAsOptional`](/doc/models/string-as-optional.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
StringAsOptional body = new StringAsOptional();
body.setMString("test");

formParamsController.stringAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`PrecisionAsOptional`](/doc/models/precision-as-optional.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
PrecisionAsOptional body = new PrecisionAsOptional();
body.setPrecision(1.23);

formParamsController.precisionAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`LongAsOptional`](/doc/models/long-as-optional.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
LongAsOptional body = new LongAsOptional();
body.setMLong(123123L);

formParamsController.longAsOptionalAsync(body).thenAccept(result -> {
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
| `body` | [`NumberAsOptional`](/doc/models/number-as-optional.md) | Form, Required | <testing> <testing> |

## Response Type

[`ServerResponse`](/doc/models/server-response.md)

## Example Usage

```java
NumberAsOptional body = new NumberAsOptional();
body.setNumber(1);

formParamsController.sendNumberAsOptionalAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

