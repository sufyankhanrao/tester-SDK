
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.TESTING`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance.<br>* See available [builder methods here](/doc/http-client-configuration-builder.md). |

The API client can be initialized as follows:

```java
TesterXMLClient client = new TesterXMLClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.TESTING)
    .build();
```

## Tester-XMLClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getDiscriminateUsingAttribute()` | Provides access to DiscriminateUsingAttribute controller. | `DiscriminateUsingAttribute` |
| `getDiscriminateUsingElement()` | Provides access to DiscriminateUsingElement controller. | `DiscriminateUsingElement` |
| `getSimpleAttributesModel()` | Provides access to SimpleAttributesModel controller. | `SimpleAttributesModel` |
| `getAttributesModelWithInheritance()` | Provides access to AttributesModelWithInheritance controller. | `AttributesModelWithInheritance` |
| `getNestedAttributesModel()` | Provides access to NestedAttributesModel controller. | `NestedAttributesModel` |
| `getSimpleElementsModel()` | Provides access to SimpleElementsModel controller. | `SimpleElementsModel` |
| `getElementsModelWithInheritance()` | Provides access to ElementsModelWithInheritance controller. | `ElementsModelWithInheritance` |
| `getNestedElementsModel()` | Provides access to NestedElementsModel controller. | `NestedElementsModel` |
| `getSingleElementModelWithModelNodeName()` | Provides access to SingleElementModelWithModelNodeName controller. | `SingleElementModelWithModelNodeName` |
| `getAttributesAndElementsModel()` | Provides access to AttributesAndElementsModel controller. | `AttributesAndElementsModel` |
| `getStringEnumeration()` | Provides access to StringEnumeration controller. | `StringEnumeration` |
| `getIntegerEnumeration()` | Provides access to IntegerEnumeration controller. | `IntegerEnumeration` |
| `getElementsArray()` | Provides access to ElementsArray controller. | `ElementsArray` |
| `getNamedElementsArray()` | Provides access to NamedElementsArray controller. | `NamedElementsArray` |
| `getWrappedArray()` | Provides access to WrappedArray controller. | `WrappedArray` |
| `getWrappedAndNamedArray()` | Provides access to WrappedAndNamedArray controller. | `WrappedAndNamedArray` |
| `getSimpleInteger()` | Provides access to SimpleInteger controller. | `SimpleInteger` |
| `getSimplePrecision()` | Provides access to SimplePrecision controller. | `SimplePrecision` |
| `getSimpleLong()` | Provides access to SimpleLong controller. | `SimpleLong` |
| `getSimpleString()` | Provides access to SimpleString controller. | `SimpleString` |
| `getSimpleUUID()` | Provides access to SimpleUUID controller. | `SimpleUUID` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

