
# Boss

<testing> Testing circular reference.

## Structure

`Boss`

## Inherits From

[`Employee`](/doc/models/employee.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PromotedAt` | `LocalDateTime` | Required | <testing> <testing> | LocalDateTime getPromotedAt() | setPromotedAt(LocalDateTime promotedAt) |
| `Assistant` | [`Employee`](/doc/models/employee.md) | Required | <testing> <testing> | Employee getAssistant() | setAssistant(Employee assistant) |

## Example (as JSON)

```json
{
  "department": null,
  "dependents": null,
  "hiredAt": null,
  "joiningDay": "Monday",
  "salary": null,
  "workingDays": null,
  "boss": null,
  "promotedAt": null,
  "assistant": {
    "department": null,
    "dependents": null,
    "hiredAt": null,
    "joiningDay": "Monday",
    "salary": null,
    "workingDays": null,
    "boss": null
  }
}
```

