
# Configuration Interface

This is the base class for all exceptions that represent an error response from the server.

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getPort()` | port value. | `String` |
| `getSuites()` | suites value. | `SuiteCode` |
| `getHttpClientConfig()` | Http Client Configuration instance.<br>* See available [builder methods here](/doc/http-client-configuration-builder.md). | `ReadonlyHttpClientConfiguration` |
| `getLoggingConfig()` | Logging Configuration instance. | `ReadonlyLoggingConfiguration` |
| `getBaseUri(Server server)` | Get base URI by current environment. | `String` |
| `getBaseUri()` | Get base URI by current environment. | `String` |

