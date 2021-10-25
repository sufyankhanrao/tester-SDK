
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `timeout` | `int` | Timeout for API calls |
| `oAuthClientId` | `string` | OAuth 2 Client ID |
| `oAuthClientSecret` | `string` | OAuth 2 Client Secret |
| `oAuthRedirectUri` | `string` | OAuth 2 Redirection endpoint or Callback Uri |
| `oAuthToken` | `OAuthToken` |  |

The API client can be initialized as follows:

```php
$client = new MdNotesACGLib\MdNotesACGClient([
    // Set authentication parameters
    'oAuthClientId' => 'OAuthClientId',
    'oAuthClientSecret' => 'OAuthClientSecret',
    'oAuthRedirectUri' => 'OAuthRedirectUri',
]);
```

## MdNotes-ACG Client

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

## Controllers

| Name | Description |
|  --- | --- |
| getServiceController() | Gets ServiceController |
| getUserController() | Gets UserController |
| getOAuthAuthorizationController() | Gets OAuthAuthorizationController |

