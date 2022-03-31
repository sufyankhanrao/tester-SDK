
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.SANDBOX`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |
| `customHeaderUserId` | `String` |  |
| `customHeaderUserApiKey` | `String` |  |
| `customHeaderDeveloperId` | `String` |  |

The API client can be initialized as follows:

```java
FortisAPIClient client = new FortisAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials("CustomHeaderUserId", "CustomHeaderUserApiKey", "CustomHeaderDeveloperId")
    .environment(Environment.SANDBOX)
    .build();
```

## Fortis APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getOnBoardingController()` | Provides access to OnBoarding controller. | `OnBoardingController` |
| `getBatchesController()` | Provides access to Batches controller. | `BatchesController` |
| `getContactsController()` | Provides access to Contacts controller. | `ContactsController` |
| `getDeviceTermsController()` | Provides access to DeviceTerms controller. | `DeviceTermsController` |
| `getLocationsController()` | Provides access to Locations controller. | `LocationsController` |
| `getQuickInvoicesController()` | Provides access to QuickInvoices controller. | `QuickInvoicesController` |
| `getRecurringController()` | Provides access to Recurring controller. | `RecurringController` |
| `getSignaturesController()` | Provides access to Signatures controller. | `SignaturesController` |
| `getTagsController()` | Provides access to Tags controller. | `TagsController` |
| `getTerminalsController()` | Provides access to Terminals controller. | `TerminalsController` |
| `getTokensController()` | Provides access to Tokens controller. | `TokensController` |
| `getTransactionsACHController()` | Provides access to TransactionsACH controller. | `TransactionsACHController` |
| `getTransactionsCreditCardController()` | Provides access to TransactionsCreditCard controller. | `TransactionsCreditCardController` |
| `getTransactionsUpdatesController()` | Provides access to TransactionsUpdates controller. | `TransactionsUpdatesController` |
| `getTransactionsReadController()` | Provides access to TransactionsRead controller. | `TransactionsReadController` |
| `getLevel3DataController()` | Provides access to Level3Data controller. | `Level3DataController` |
| `getUsersController()` | Provides access to Users controller. | `UsersController` |
| `getWebhooksController()` | Provides access to Webhooks controller. | `WebhooksController` |
| `getElementsController()` | Provides access to Elements controller. | `ElementsController` |
| `getAsyncProcessingController()` | Provides access to AsyncProcessing controller. | `AsyncProcessingController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

