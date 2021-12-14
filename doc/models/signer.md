
# Signer

## Structure

`Signer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Links` | `List<String>` | Required | - | List<String> getLinks() | setLinks(List<String> links) |
| `ExternalSignerId` | `String` | Required | - | String getExternalSignerId() | setExternalSignerId(String externalSignerId) |
| `RedirectSettings` | [`RedirectSettings`](/doc/models/redirect-settings.md) | Required | - | RedirectSettings getRedirectSettings() | setRedirectSettings(RedirectSettings redirectSettings) |
| `SignatureType` | [`SignatureType`](/doc/models/signature-type.md) | Required | - | SignatureType getSignatureType() | setSignatureType(SignatureType signatureType) |
| `Ui` | [`Ui`](/doc/models/ui.md) | Required | - | Ui getUi() | setUi(Ui ui) |
| `Tags` | `List<String>` | Required | - | List<String> getTags() | setTags(List<String> tags) |
| `Order` | `int` | Required | - | int getOrder() | setOrder(int order) |
| `Required` | `boolean` | Required | - | boolean getRequired() | setRequired(boolean required) |

## Example (as JSON)

```json
{
  "id": "1bef97d1-0704-4eb2-a490-a8f2007675db",
  "url": "https://sign-test.idfy.io/start?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJrdmVyc2lvbiI6IjdmNzhjNzNkMmQ1MjQzZWRiYjdiNDI0MmI2MDE1MWU4IiwiZG9jaWQiOiIwOTljY2VkYS0zOGE4LTRiMDEtODdiOS1hOGYyMDA3Njc1ZDYiLCJhaWQiOiJjMGNlMTQ2OC1hYzk0LTRiMzQtODc2ZS1hODg1MDBjMmI5YTEiLCJsZyI6ImVuIiwiZXJyIjpudWxsLCJpZnIiOmZhbHNlLCJ3Ym1zZyI6ZmFsc2UsInNmaWQiOiIxYmVmOTdkMS0wNzA0LTRlYjItYTQ5MC1hOGYyMDA3Njc1ZGIiLCJ1cmxleHAiOm51bGwsImF0aCI6bnVsbCwiZHQiOiJUZXN0IGRvY3VtZW50IiwidmYiOmZhbHNlLCJhbiI6IklkZnkgU0RLIGRlbW8iLCJ0aCI6IlBpbmsiLCJzcCI6IkN1YmVzIiwiZG9tIjpudWxsLCJyZGlyIjpmYWxzZSwidXQiOiJ3ZWIiLCJ1dHYiOm51bGwsInNtIjoidGVzdEB0ZXN0LmNvbSJ9.Dyy2RSeR6dmU8qxOEi-2gEX3Gg7wry6JhkZIWOuADDdu5jJWidQLcxfJn_qAHNpb",
  "links": [],
  "externalSignerId": "uoiahsd321982983jhrmnec2wsadm32",
  "redirectSettings": {
    "redirectMode": "donot_redirect"
  },
  "signatureType": {
    "mechanism": "pkisignature",
    "onEacceptUseHandWrittenSignature": false
  },
  "ui": {
    "dialogs": {
      "before": {
        "useCheckBox": false,
        "title": "Info",
        "message": "Please read the contract on the next pages carefully. Pay some extra attention to paragraph 5."
      }
    },
    "language": "EN",
    "styling": {
      "colorTheme": "Pink",
      "spinner": "Cubes"
    }
  },
  "tags": [],
  "order": 0,
  "required": false
}
```

