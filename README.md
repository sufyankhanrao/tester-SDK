
# Getting Started with Tester

## Introduction

Testing various
api
features

## Building

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=import3)

## Installation

The following section explains how to use the TesterLib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *TesterLib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify TesterLib in `Group Id`, tester-lib in `Artifact Id` and 1.1.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=Tester-Java&workspaceName=Tester&projectName=TesterLib&rootNamespace=localhost3000&groupId=TesterLib&artifactId=tester-lib&version=1.1.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project TesterLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `port` | `String` | *Default*: `"80"` |
| `suites` | `SuiteCode` | *Default*: `SuiteCode.HEARTS` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `skipSslCertVerification` | `boolean` | Specifies whether to skip SSL certificate verification.<br /> **Default: false** |

The API client can be initialized as follows:

```java
TesterClient client = new TesterClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.TESTING)
    .port("80")
    .suites(SuiteCode.HEARTS)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | - |
| testing | **Default** |

## API Errors

Here is the list of errors that the API might throw.

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | 400 Global | `ApiException` |
| 402 | 402 Global | `ApiException` |
| 403 | 403 Global | `ApiException` |
| 404 | 404 Global | `ApiException` |
| 412 | Precondition Failed | [`NestedModelException`](doc/models/nested-model-exception.md) |
| 450 | caught global exception | [`CustomErrorResponseException`](doc/models/custom-error-response-exception.md) |
| 452 | global exception with string | [`ExceptionWithStringException`](doc/models/exception-with-string-exception.md) |
| 453 | boolean in global exception | [`ExceptionWithBooleanException`](doc/models/exception-with-boolean-exception.md) |
| 454 | dynamic in global exception | [`ExceptionWithDynamicException`](doc/models/exception-with-dynamic-exception.md) |
| 455 | uuid in global exception | [`ExceptionWithUUIDException`](doc/models/exception-with-uuid-exception.md) |
| 456 | date in global exception | [`ExceptionWithDateException`](doc/models/exception-with-date-exception.md) |
| 457 | number in global  exception | [`ExceptionWithNumberException`](doc/models/exception-with-number-exception.md) |
| 458 | long in global exception | [`ExceptionWithLongException`](doc/models/exception-with-long-exception.md) |
| 459 | precision in global  exception | [`ExceptionWithPrecisionException`](doc/models/exception-with-precision-exception.md) |
| 460 | rfc3339 in global exception | [`ExceptionWithRfc3339DateTimeException`](doc/models/exception-with-rfc-3339-date-time-exception.md) |
| 461 | unix time stamp in global exception | [`UnixTimeStampException`](doc/models/unix-time-stamp-exception.md) |
| 462 | rfc1123 in global exception | [`Rfc1123Exception`](doc/models/rfc-1123-exception.md) |
| 463 | boolean in model as global exception | [`SendBooleanInModelAsException`](doc/models/send-boolean-in-model-as-exception.md) |
| 464 | rfc3339 in model as global exception | [`SendRfc3339InModelAsException`](doc/models/send-rfc-3339-in-model-as-exception.md) |
| 465 | rfc1123 in model as global exception | [`SendRfc1123InModelAsException`](doc/models/send-rfc-1123-in-model-as-exception.md) |
| 466 | unix time stamp in model as global exception | [`SendUnixTimeStampInModelAsException`](doc/models/send-unix-time-stamp-in-model-as-exception.md) |
| 467 | send date in model as global exception | [`SendDateInModelAsException`](doc/models/send-date-in-model-as-exception.md) |
| 468 | send dynamic in model as global exception | [`SendDynamicInModelAsException`](doc/models/send-dynamic-in-model-as-exception.md) |
| 469 | send string in model as global exception | [`SendStringInModelAsException`](doc/models/send-string-in-model-as-exception.md) |
| 470 | send long in model as global exception | [`SendLongInModelAsException`](doc/models/send-long-in-model-as-exception.md) |
| 471 | send number in model as global exception | [`SendNumberInModelAsException`](doc/models/send-number-in-model-as-exception.md) |
| 472 | send precision in model as global exception | [`SendPrecisionInModelAsException`](doc/models/send-precision-in-model-as-exception.md) |
| 473 | send uuid in model as global exception | [`SendUuidInModelAsException`](doc/models/send-uuid-in-model-as-exception.md) |
| 500 | 500 Global | [`GlobalTestException`](doc/models/global-test-exception.md) |
| Default | Invalid response. | [`GlobalTestException`](doc/models/global-test-exception.md) |

## List of APIs

* [Response Types](doc/controllers/response-types.md)
* [Form Params](doc/controllers/form-params.md)
* [Body Params](doc/controllers/body-params.md)
* [Error Codes](doc/controllers/error-codes.md)
* [Query Param](doc/controllers/query-param.md)
* [Echo](doc/controllers/echo.md)
* [Header](doc/controllers/header.md)
* [Template Params](doc/controllers/template-params.md)
* [Query Params](doc/controllers/query-params.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

