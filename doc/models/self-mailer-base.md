
# Self Mailer Base

## Structure

`SelfMailerBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `MailType` | [`MailTypeEnum`](/doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS`<br>*Default: `MailTypeEnum.USPS_FIRST_CLASS`* | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in [our guide to using html and merge variables](https://lob.com/resources/guides/general/using-html-and-merge-variables). Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account) setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | `Object` | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | Object getSendDate() | setSendDate(Object sendDate) |
| `Size` | [`SelfMailerSizeEnum`](/doc/models/self-mailer-size-enum.md) | Optional | Specifies the size of the self mailer.<br>**Default**: `SelfMailerSizeEnum.ENUM_6X18_BIFOLD`<br>*Default: `SelfMailerSizeEnum.ENUM_6X18_BIFOLD`* | SelfMailerSizeEnum getSize() | setSize(SelfMailerSizeEnum size) |

## Example (as JSON)

```json
{
  "description": null,
  "metadata": null,
  "mail_type": null,
  "merge_variables": null,
  "send_date": null,
  "size": null
}
```

