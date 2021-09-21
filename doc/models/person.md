
# Person

## Structure

`Person`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Address` | `String` | Required | <testing><br> | String getAddress() | setAddress(String address) |
| `Age` | `long` | Required | <testing><br> | long getAge() | setAge(long age) |
| `Birthday` | `LocalDate` | Required | <testing><br> | LocalDate getBirthday() | setBirthday(LocalDate birthday) |
| `Birthtime` | `LocalDateTime` | Required | <testing><br> | LocalDateTime getBirthtime() | setBirthtime(LocalDateTime birthtime) |
| `Name` | `String` | Required | <testing><br> | String getName() | setName(String name) |
| `Uid` | `String` | Required | <testing><br> | String getUid() | setUid(String uid) |
| `PersonType` | `String` | Optional | - | String getPersonType() | setPersonType(String personType) |

## Example (as JSON)

```json
{
  "address": "address6",
  "age": 250,
  "birthday": "2016-03-13",
  "birthtime": "2016-03-13T12:52:32.123Z",
  "name": "name0",
  "uid": "uid0",
  "personType": null
}
```

