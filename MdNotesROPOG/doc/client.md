
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `timeout` | `int` | Timeout for API calls |
| `oAuthUsername` | `string` | OAuth 2 Resource Owner Username |
| `oAuthPassword` | `string` | OAuth 2 Resource Owner Password |
| `oAuthToken` | `OAuthToken` |  |

The API client can be initialized as follows:

```php
$client = new MdNotesROPCGLib\MdNotesROPCGClient([
    // Set authentication parameters
    'oAuthUsername' => 'OAuthUsername',
    'oAuthPassword' => 'OAuthPassword',

    // Set the environment
    'environment' => 'production',
]);
```

## MdNotesROPCG Client

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

## Controllers

| Name | Description |
|  --- | --- |
| getServiceController() | Gets ServiceController |
| getUserController() | Gets UserController |
| getOAuthAuthorizationController() | Gets OAuthAuthorizationController |

