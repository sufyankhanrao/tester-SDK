
# Client Class Documentation

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

## Dropbox Client

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

## Controllers

| Name | Description |
|  --- | --- |
| getFilesController() | Gets FilesController |

