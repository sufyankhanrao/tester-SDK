
# Employee

## Structure

`Employee`

## Inherits From

[`Person`](/doc/models/person.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Department` | `String` | Required | &lt;testing&gt; &lt;testing&gt; | String getDepartment() | setDepartment(String department) |
| `Dependents` | [`List<Person>`](/doc/models/person.md) | Required | &lt;testing&gt; &lt;testing&gt; | List<Person> getDependents() | setDependents(List<Person> dependents) |
| `HiredAt` | `LocalDateTime` | Required | &lt;testing&gt; &lt;testing&gt; | LocalDateTime getHiredAt() | setHiredAt(LocalDateTime hiredAt) |
| `JoiningDay` | [`Days`](/doc/models/days.md) | Required | &lt;testing&gt; &lt;testing&gt;&lt;br&gt;**Default**: `Days.MONDAY`&lt;br&gt;*Default: `Days.MONDAY`* | Days getJoiningDay() | setJoiningDay(Days joiningDay) |
| `Salary` | `int` | Required | &lt;testing&gt; &lt;testing&gt; | int getSalary() | setSalary(int salary) |
| `WorkingDays` | [`List<Days>`](/doc/models/days.md) | Required | &lt;testing&gt; &lt;testing&gt; | List<Days> getWorkingDays() | setWorkingDays(List<Days> workingDays) |
| `Boss` | [`Person`](/doc/models/person.md) | Required | &lt;testing&gt; &lt;testing&gt; | Person getBoss() | setBoss(Person boss) |

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

