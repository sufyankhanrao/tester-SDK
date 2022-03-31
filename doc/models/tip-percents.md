
# Tip Percents

A JSON of tip percents the JSON MUST contain only these three fields: percent_1, percent_2, percent_3

## Structure

`TipPercents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Percent1` | `Integer` | Optional | field can only contain a value from 0 to 99, if 1 field is NULL, all fields must be null.<br>**Constraints**: `>= 0`, `<= 99` | Integer getPercent1() | setPercent1(Integer percent1) |
| `Percent2` | `Integer` | Optional | field can only contain a value from 0 to 99, if 1 field is NULL, all fields must be null.<br>**Constraints**: `>= 0`, `<= 99` | Integer getPercent2() | setPercent2(Integer percent2) |
| `Percent3` | `Integer` | Optional | field can only contain a value from 0 to 99, if 1 field is NULL, all fields must be null.<br>**Constraints**: `>= 0`, `<= 99` | Integer getPercent3() | setPercent3(Integer percent3) |

## Example (as JSON)

```json
{
  "percent_1": null,
  "percent_2": null,
  "percent_3": null
}
```

