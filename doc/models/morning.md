
# Morning

Course morning session

## Structure

`Morning`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartsAt` | `String` | Required | Session start time | String getStartsAt() | setStartsAt(String startsAt) |
| `EndsAt` | `String` | Required | Session end time | String getEndsAt() | setEndsAt(String endsAt) |
| `OfferTeaBreak` | `boolean` | Required | Offer tea break during session | boolean getOfferTeaBreak() | setOfferTeaBreak(boolean offerTeaBreak) |

## Example (as JSON)

```json
{
  "startsAt": "startsAt8",
  "endsAt": "endsAt0",
  "offerTeaBreak": false
}
```

