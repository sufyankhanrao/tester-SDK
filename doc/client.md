
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `version` | `String` | *Default*: `"v1"` |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance. |

The API client can be initialized as follows:

```java
OneOfNonScalarEndpointsClient client = new OneOfNonScalarEndpointsClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.TESTING)
    .version("v1")
    .build();
```

## OneOf-non-scalar-endpointsClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getOneOfNonPrimitiveTypesInRequestBodyController()` | Provides access to OneOfNonPrimitiveTypesInRequestBody controller. | `OneOfNonPrimitiveTypesInRequestBodyController` |
| `getMixNonPrimitiveTypesInRequestBodyController()` | Provides access to MixNonPrimitiveTypesInRequestBody controller. | `MixNonPrimitiveTypesInRequestBodyController` |
| `getOneOfNonPrimitiveTypesInResponseBodyController()` | Provides access to OneOfNonPrimitiveTypesInResponseBody controller. | `OneOfNonPrimitiveTypesInResponseBodyController` |
| `getMixNonPrimitiveTypesInResponseBodyController()` | Provides access to MixNonPrimitiveTypesInResponseBody controller. | `MixNonPrimitiveTypesInResponseBodyController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getVersion()` | version value. | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

