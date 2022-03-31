
# V1 Webhooks Transaction Request

## Structure

`V1WebhooksTransactionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AttemptInterval` | `Integer` | Optional | Number of seconds before another retry is submitted<br>**Default**: `300`<br>**Constraints**: `>= 300`, `<= 86400` | Integer getAttemptInterval() | setAttemptInterval(Integer attemptInterval) |
| `BasicAuthUsername` | `String` | Optional | The Basic authorization username for the URL, if not supplied, the postback will be submitted without Basic authorization headers<br>**Constraints**: *Maximum Length*: `512` | String getBasicAuthUsername() | setBasicAuthUsername(String basicAuthUsername) |
| `BasicAuthPassword` | `String` | Optional | The basic authorization password<br>**Constraints**: *Maximum Length*: `512` | String getBasicAuthPassword() | setBasicAuthPassword(String basicAuthPassword) |
| `Expands` | `String` | Optional | An option list of expanded data to send with base data. (i.e. set this field to “contact,account_vault” to get the contact an accountvault used to run a transaction.)<br>**Constraints**: *Maximum Length*: `512` | String getExpands() | setExpands(String expands) |
| `Format` | [`FormatEnum`](../../doc/models/format-enum.md) | Optional | Options include: api-default | FormatEnum getFormat() | setFormat(FormatEnum format) |
| `IsActive` | `boolean` | Required | Flag to indicate whether configuration is active (in effect). | boolean getIsActive() | setIsActive(boolean isActive) |
| `LocationId` | `String` | Required | The location identifier of the resource you want to recieve postbacks from.<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getLocationId() | setLocationId(String locationId) |
| `LocationApiId` | `String` | Optional | Location Api ID | String getLocationApiId() | setLocationApiId(String locationApiId) |
| `OnCreate` | [`OnCreateEnum`](../../doc/models/on-create-enum.md) | Required | To receive postbacks on the creation of a resource | OnCreateEnum getOnCreate() | setOnCreate(OnCreateEnum onCreate) |
| `OnUpdate` | [`OnUpdateEnum`](../../doc/models/on-update-enum.md) | Required | To receive postbacks on the updating of a resource | OnUpdateEnum getOnUpdate() | setOnUpdate(OnUpdateEnum onUpdate) |
| `OnDelete` | [`OnDeleteEnum`](../../doc/models/on-delete-enum.md) | Required | To receive postbacks when the record is deleted | OnDeleteEnum getOnDelete() | setOnDelete(OnDeleteEnum onDelete) |
| `PostbackConfigId` | `String` | Optional | Postback Config ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getPostbackConfigId() | setPostbackConfigId(String postbackConfigId) |
| `ProductTransactionId` | `String` | Required | Required when using 'transaction' or 'transactionbatch' resource<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getProductTransactionId() | setProductTransactionId(String productTransactionId) |
| `Resource` | [`Resource2Enum`](../../doc/models/resource-2-enum.md) | Optional | The resource you want to subscribe the postbacks to.<br>**Constraints**: *Maximum Length*: `128` | Resource2Enum getResource() | setResource(Resource2Enum resource) |
| `NumberOfAttempts` | `int` | Required | Maximum number of attempts on failure<br>**Constraints**: `>= 1`, `<= 5` | int getNumberOfAttempts() | setNumberOfAttempts(int numberOfAttempts) |
| `Url` | `String` | Required | The URL where the postback will be submitted<br>**Constraints**: *Maximum Length*: `512` | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "is_active": null,
  "location_id": "11e95f8ec39de8fbdb0a4f1a",
  "on_create": 1,
  "on_update": 1,
  "on_delete": 1,
  "product_transaction_id": "11e95f8ec39de8fbdb0a4f1a",
  "number_of_attempts": 1,
  "url": "https://127.0.0.1/receiver"
}
```

