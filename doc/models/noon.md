
# Noon

Course noon session

## Structure

`Noon`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartsAt` | `String` | Required | Session start time | String getStartsAt() | setStartsAt(String startsAt) |
| `EndsAt` | `String` | Required | Session end time | String getEndsAt() | setEndsAt(String endsAt) |
| `OfferLunch` | `boolean` | Required | Offer lunch during session | boolean getOfferLunch() | setOfferLunch(boolean offerLunch) |

## Example (as JSON)

```json
{
  "startsAt": "startsAt8",
  "endsAt": "endsAt0",
  "offerLunch": false
}
```

