
# Person

## Structure

`Person`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Address` | `String` | Required | &lt;testing&gt; &lt;testing&gt; | String getAddress() | setAddress(String address) |
| `Age` | `long` | Required | &lt;testing&gt; &lt;testing&gt; | long getAge() | setAge(long age) |
| `Birthday` | `LocalDate` | Required | &lt;testing&gt; &lt;testing&gt; | LocalDate getBirthday() | setBirthday(LocalDate birthday) |
| `Birthtime` | `LocalDateTime` | Required | &lt;testing&gt; &lt;testing&gt; | LocalDateTime getBirthtime() | setBirthtime(LocalDateTime birthtime) |
| `Name` | `String` | Required | &lt;testing&gt; &lt;testing&gt; | String getName() | setName(String name) |
| `Uid` | `String` | Required | &lt;testing&gt; &lt;testing&gt; | String getUid() | setUid(String uid) |
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

