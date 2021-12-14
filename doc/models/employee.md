
# Employee

## Structure

`Employee`

## Inherits From

[`Person`](/doc/models/person.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Department` | `String` | Required | - | String getDepartment() | setDepartment(String department) |
| `Dependents` | [`List<Person>`](/doc/models/person.md) | Required | - | List<Person> getDependents() | setDependents(List<Person> dependents) |
| `HiredAt` | `LocalDateTime` | Required | - | LocalDateTime getHiredAt() | setHiredAt(LocalDateTime hiredAt) |
| `JoiningDay` | [`Days`](/doc/models/days.md) | Required | **Default**: `Days.MONDAY` | Days getJoiningDay() | setJoiningDay(Days joiningDay) |
| `Salary` | `int` | Required | - | int getSalary() | setSalary(int salary) |
| `WorkingDays` | [`List<Days>`](/doc/models/days.md) | Required | - | List<Days> getWorkingDays() | setWorkingDays(List<Days> workingDays) |
| `Boss` | [`Person`](/doc/models/person.md) | Required | - | Person getBoss() | setBoss(Person boss) |

## Example (as JSON)

```json
{
  "department": null,
  "dependents": null,
  "hiredAt": null,
  "joiningDay": "Monday",
  "salary": null,
  "workingDays": null,
  "boss": null
}
```

