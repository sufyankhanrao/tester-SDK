
# Evening

Course evening session

## Structure

`Evening`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartsAt` | `String` | Required | Session start time | String getStartsAt() | setStartsAt(String startsAt) |
| `EndsAt` | `String` | Required | Session end time | String getEndsAt() | setEndsAt(String endsAt) |
| `OfferDinner` | `boolean` | Required | Offer dinner during session | boolean getOfferDinner() | setOfferDinner(boolean offerDinner) |

## Example (as JSON)

```json
{
  "startsAt": "startsAt8",
  "endsAt": "endsAt0",
  "offerDinner": false
}
```

