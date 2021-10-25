
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `timeout` | `int` | Timeout for API calls |
| `oAuthClientId` | `string` | OAuth 2 Client ID |
| `oAuthClientSecret` | `string` | OAuth 2 Client Secret |
| `oAuthToken` | `OAuthToken` |  |

The API client can be initialized as follows:

```php
$client = new MdNotesCCGLib\MdNotesCCGClient([
    // Set authentication parameters
    'oAuthClientId' => 'OAuthClientId',
    'oAuthClientSecret' => 'OAuthClientSecret',

    // Set the environment
    'environment' => 'production',
]);
```

## MdNotesCCG Client

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

## Controllers

| Name | Description |
|  --- | --- |
| getUserController() | Gets UserController |
| getServiceController() | Gets ServiceController |
| getOAuthAuthorizationController() | Gets OAuthAuthorizationController |

