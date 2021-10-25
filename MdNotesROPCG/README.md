
# Getting Started with MdNotesROPCG

## Introduction

API for Markdown Notes app.

## Building

The generated code has dependencies over external libraries like UniRest. These dependencies are defined in the `composer.json` file that comes with the SDK. To resolve these dependencies, we use the Composer package manager which requires PHP greater than or equal to 7.2 installed in your system. Visit [https://getcomposer.org/download/](https://getcomposer.org/download/) to download the installer file for Composer and run it in your system. Open command prompt and type `composer --version`. This should display the current version of the Composer installed if the installation was successful.

* Using command line, navigate to the directory containing the generated files (including `composer.json`) for the SDK.
* Run the command `composer install`. This should install all the required dependencies and create the `vendor` directory in your project directory.

![Building SDK - Step 1](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=installDependencies)

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

The following section explains how to use the MdNotesROPCGLib library in a new project.

### 1. Open Project in an IDE

Open an IDE for PHP like PhpStorm. The basic workflow presented here is also applicable if you prefer using a different editor or IDE.

![Open project in PHPStorm - Step 1](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=openIDE)

Click on `Open` in PhpStorm to browse to your generated SDK directory and then click `OK`.

![Open project in PHPStorm - Step 2](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=openProject0)

### 2. Add a new Test Project

Create a new directory by right clicking on the solution name as shown below:

![Add a new project in PHPStorm - Step 1](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=createDirectory)

Name the directory as "test".

![Add a new project in PHPStorm - Step 2](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=nameDirectory)

Add a PHP file to this project.

![Add a new project in PHPStorm - Step 3](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=createFile)

Name it "testSDK".

![Add a new project in PHPStorm - Step 4](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=nameFile)

Depending on your project setup, you might need to include composer's autoloader in your PHP code to enable auto loading of classes.

```php
require_once "vendor/autoload.php";
```

It is important that the path inside require_once correctly points to the file `autoload.php` inside the vendor directory created during dependency installations.

![Add a new project in PHPStorm - Step 5](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=projectFiles)

After this you can add code to initialize the client library and acquire the instance of a Controller class. Sample code to initialize the client library and use the Controller methods is given in the subsequent sections.

### 3. Run the Test Project

To run your project you must set the Interpreter for your project. Interpreter is the PHP engine installed on your computer.

Open `Settings` from `File` menu.

![Run Test Project - Step 1](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=openSettings)

Select `PHP` from within `Languages & Frameworks`.

![Run Test Project - Step 2](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=setInterpreter0)

Browse for Interpreters near the `Interpreter` option and choose your interpreter.

![Run Test Project - Step 3](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=setInterpreter1)

Once the interpreter is selected, click `OK`.

![Run Test Project - Step 4](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=setInterpreter2)

To run your project, right click on your PHP file inside your Test project and click on `Run`.

![Run Test Project - Step 5](https://apidocs.io/illustration/php?workspaceFolder=MdNotesROPCG&step=runProject)

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `timeout` | `int` | Timeout for API calls |
| `oAuthClientId` | `string` | OAuth 2 Client ID |
| `oAuthClientSecret` | `string` | OAuth 2 Client Secret |
| `oAuthUsername` | `string` | OAuth 2 Resource Owner Username |
| `oAuthPassword` | `string` | OAuth 2 Resource Owner Password |
| `oAuthToken` | `OAuthToken` |  |

The API client can be initialized as follows:

```php
$client = new MdNotesROPCGLib\MdNotesROPCGClient([
    // Set authentication parameters
    'oAuthClientId' => 'OAuthClientId',
    'oAuthClientSecret' => 'OAuthClientSecret',
    'oAuthUsername' => 'OAuthUsername',
    'oAuthPassword' => 'OAuthPassword',

    // Set the environment
    'environment' => 'production',
]);
```

## Authorization

Your application must obtain user authorization before it can execute an endpoint call. This SDK uses *OAuth 2.0 Authorization* to authorize the client.

The `fetchToken()` method will exchange the user's credentials for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

```php
try {
    $token = $client->getResourceOwnerAuth()->fetchToken();
    // re-instantiate the client with oauth token
    $client = $client->withConfiguration([
        'oAuthToken' => $token
    ]);
} catch (MdNotesROPCGLib\Exceptions\ApiException $e) {
    // handle exception
}
```

The client can now make authorized endpoint calls.

### Refreshing the token

An access token may expire after sometime. To extend its lifetime, you must refresh the token.

```php
if ($client->getResourceOwnerAuth()->isTokenExpired()) {
    try {
        $token = $client->getResourceOwnerAuth()->refreshToken();
        // re-instantiate the client with oauth token
        $client = $client->withConfiguration([
            'oAuthToken' => $token
        ]);
    } catch (MdNotesROPCGLib\Exceptions\ApiException $e) {
        // handle exception
    }
}
```

If a token expires, the SDK will attempt to automatically refresh the token before the next endpoint call requiring authentication.

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```php
// store token
$_SESSION['access_token'] = $client->getResourceOwnerAuth()->getOAuthToken();
```

### Creating a client from a stored token

To authorize a client from a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```php
// load token later...
$token = $_SESSION['access_token'];

// re-instantiate the client with oauth token
$client = $client->withConfiguration([
    'oAuthToken' => $token
]);
```

### Complete example

```php
<?php
require_once __DIR__.'/vendor/autoload.php';

session_start();

// Client configuration
$client = new MdNotesROPCGLib\MdNotesROPCGClient([
    // Set authentication parameters
    'oAuthClientId' => 'OAuthClientId',
    'oAuthClientSecret' => 'OAuthClientSecret',
    'oAuthUsername' => 'OAuthUsername',
    'oAuthPassword' => 'OAuthPassword',

    // Set the environment
    'environment' => 'production',
]);



// Obtain access token, restore from cache if possible
if (isset($_SESSION['access_token'])) {
    $token = $_SESSION['access_token'];
    // re-instantiate the client with oauth token
    $client = $client->withConfiguration([
        'oAuthToken' => $token
    ]);
} else {
    try {
        // fetch an oauth token to authorize the client
        $token = $client->getResourceOwnerAuth()->fetchToken();
        // re-instantiate the client with oauth token
        $client = $client->withConfiguration([
            'oAuthToken' => $token
        ]);

        // store token
        $_SESSION['access_token'] = $token;
    } catch (MdNotesROPCGLib\Exceptions\ApiException $e) {
        // handle exception
    }
}

// check if token gets expired, then try to refresh the token
if ($client->getResourceOwnerAuth()->isTokenExpired()) {
    try {
        // refresh the token
        $token = $client->getResourceOwnerAuth()->refreshToken();
        // re-instantiate the client with oauth token
        $client = $client->withConfiguration([
            'oAuthToken' => $token
        ]);

        // update the cached token
        $_SESSION['access_token'] = $token;
    } catch (MdNotesROPCGLib\Exceptions\ApiException $e) {
        // handle exception
    }
}

// the client is now authorized; you can use $client to make endpoint calls
```

## List of APIs

* [Service](/doc/controllers/service.md)
* [User](/doc/controllers/user.md)

## Classes Documentation

* [Utility Classes](/doc/utility-classes.md)
* [ApiException](/doc/api-exception.md)
* [HttpRequest](/doc/http-request.md)
* [HttpResponse](/doc/http-response.md)

