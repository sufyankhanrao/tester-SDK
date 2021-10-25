
# Getting Started with Dropbox

## Introduction

API for testing OAuth2 with Dropbox

## Building

The generated code has dependencies over external libraries like UniRest. These dependencies are defined in the `composer.json` file that comes with the SDK. To resolve these dependencies, we use the Composer package manager which requires PHP greater than or equal to 7.2 installed in your system. Visit [https://getcomposer.org/download/](https://getcomposer.org/download/) to download the installer file for Composer and run it in your system. Open command prompt and type `composer --version`. This should display the current version of the Composer installed if the installation was successful.

* Using command line, navigate to the directory containing the generated files (including `composer.json`) for the SDK.
* Run the command `composer install`. This should install all the required dependencies and create the `vendor` directory in your project directory.

![Building SDK - Step 1](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=installDependencies)

### Configuring CURL Certificate Path in php.ini

:information_source: **Note** This is for Windows users only.

CURL used to include a list of accepted CAs, but no longer bundles ANY CA certs. So by default it will reject all SSL certificates as unverifiable. You will have to get your CA's cert and point curl at it. The steps are as follows:

1. Download the certificate bundle (.pem file) from [https://curl.haxx.se/docs/caextract.html](https://curl.haxx.se/docs/caextract.html) on to your system.
2. Add curl.cainfo = "PATH_TO/cacert.pem" to your php.ini file located in your php installation. “PATH_TO” must be an absolute path containing the .pem file.

```
[curl]; A default value for the CURLOPT_CAINFO option. This is required to be an
; absolute path.
curl.cainfo = PATH_TO/cacert.pem
```

## Installation

The following section explains how to use the DropboxLib library in a new project.

### 1. Open Project in an IDE

Open an IDE for PHP like PhpStorm. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

![Open project in PHPStorm - Step 1](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=openIDE)

Click on `Open` in PhpStorm to browse to your generated SDK directory and then click `OK`.

![Open project in PHPStorm - Step 2](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=openProject0)

### 2. Add a new Test Project

Create a new directory by right clicking on the solution name as shown below:

![Add a new project in PHPStorm - Step 1](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=createDirectory)

Name the directory as "test".

![Add a new project in PHPStorm - Step 2](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=nameDirectory)

Add a PHP file to this project.

![Add a new project in PHPStorm - Step 3](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=createFile)

Name it "testSDK".

![Add a new project in PHPStorm - Step 4](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=nameFile)

Depending on your project setup, you might need to include composer's autoloader in your PHP code to enable auto loading of classes.

```php
require_once "vendor/autoload.php";
```

It is important that the path inside require_once correctly points to the file `autoload.php` inside the vendor directory created during dependency installations.

![Add a new project in PHPStorm - Step 5](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=projectFiles)

After this you can add code to initialize the client library and acquire the instance of a Controller class. Sample code to initialize the client library and use the Controller methods is given in the subsequent sections.

### 3. Run the Test Project

To run your project you must set the Interpreter for your project. Interpreter is the PHP engine installed on your computer.

Open `Settings` from `File` menu.

![Run Test Project - Step 1](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=openSettings)

Select `PHP` from within `Languages & Frameworks`.

![Run Test Project - Step 2](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=setInterpreter0)

Browse for Interpreters near the `Interpreter` option and choose your interpreter.

![Run Test Project - Step 3](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=setInterpreter1)

Once the interpreter is selected, click `OK`.

![Run Test Project - Step 4](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=setInterpreter2)

To run your project, right click on your PHP file inside your Test project and click on `Run`.

![Run Test Project - Step 5](https://apidocs.io/illustration/php?workspaceFolder=Dropbox&step=runProject)

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `basepath` | `string` | Base path of the Dropbox API server<br>*Default*: `'api.dropboxapi.com'` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `timeout` | `int` | Timeout for API calls |
| `oAuthClientId` | `string` | OAuth 2 Client ID |
| `oAuthRedirectUri` | `string` | OAuth 2 Redirection endpoint or Callback Uri |
| `oAuthToken` | `OAuthToken` |  |

The API client can be initialized as follows:

```php
$client = new DropboxLib\DropboxClient([
    // Set authentication parameters
    'oAuthClientId' => 'OAuthClientId',
    'oAuthRedirectUri' => 'OAuthRedirectUri',

    // Set the environment
    'environment' => 'production',

    // Set configuration parameters
    'basepath' => 'api.dropboxapi.com',
]);
```

## Authorization

Your application must obtain user authorization before it can execute an endpoint call. This SDK uses *OAuth 2.0 Implicit Grant* to obtain a user's consent to perform an API request on user's behalf.

This process requires the presence of a client-side JavaScript code on the redirect URI page to receive the *access token* after the consent step is completed.

### 1- Obtain user consent

To obtain user's consent, you must redirect the user to the authorization page. The `buildAuthorizationUrl()` method creates the URL to the authorization page.

```php
$authUrl = $client->getImplicitAuth()->buildAuthorizationUrl();
header('Location: ' . filter_var($authUrl, FILTER_SANITIZE_URL));
```

### 2- Handle the OAuth server response

Once the user responds to the consent request, the OAuth 2.0 server responds to your application's access request by redirecting the user to the redirect URI specified set in `Configuration`.

The redirect URI will receive the *access token* as the `token` argument in the URL fragment.

```
https://example.com/oauth/callback#token=XXXXXXXXXXXXXXXXXXXXXXXXX
```

The access token must be extracted by the client-side JavaScript code. The access token can be used to authorize any further endpoint calls by the JavaScript code.

## List of APIs

* [Files](/doc/controllers/files.md)

## Classes Documentation

* [Utility Classes](/doc/utility-classes.md)
* [ApiException](/doc/api-exception.md)
* [HttpRequest](/doc/http-request.md)
* [HttpResponse](/doc/http-response.md)

