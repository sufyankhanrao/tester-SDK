# On Boarding

```java
OnBoardingController onBoardingController = client.getOnBoardingController();
```

## Class Name

`OnBoardingController`


# Merchant Boarding

This method can be used to pre-populate data on the Merchant Processing Application (MPA), a form that prospective merchants must complete and sign prior to approval. Using this method will reduce the effort required by the merchant at boarding time, in scenarios where data about the prospective merchant has already been collected. This method will return an Application ID, which can be sent to a prospective merchant to obtain and complete the pre-filled application.

Properties that are marked "Required" indicate the minimum required data for creating and saving an MPA. When using this method, you must provide data for each "Required" property, or you will not receive an Application ID. Properties that are marked "Required for completion" are those which need to be provided to Fortis before the Merchant Processing Application can be approved. These properties may be omitted or left blank when using this method, however, the merchant will be required to provide this data before the application can be submitted. Properties that are marked "Conditionally Required" may be required for completion of the Merchant Processing Application, depending on the values provided for other fields. See the description for each of these properties for more information about their requirement criteria.

```java
CompletableFuture<ResponseOnboarding> merchantBoardingAsync(
    final V1OnboardingRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`V1OnboardingRequest`](../../doc/models/v1-onboarding-request.md) | Body, Required | - |

## Response Type

[`ResponseOnboarding`](../../doc/models/response-onboarding.md)

## Example Usage

```java
V1OnboardingRequest body = new V1OnboardingRequest();
body.setPrimaryPrincipal(new PrimaryPrincipal());
body.getPrimaryPrincipal().setFirstName("Bob");
body.getPrimaryPrincipal().setLastName("Fairview");
body.setTemplateCode("template_code6");
body.setEmail("email@domain.com");
body.setDbaName("Discount Home Goods");
body.setLocation(new Location());
body.getLocation().setPhoneNumber("555-555-1212");
body.setAppDelivery(AppDeliveryEnum.DIRECT);
body.setBankAccount(new BankAccount());
body.setContact(new Contact());
body.getContact().setPhoneNumber("555-555-3456");

onBoardingController.merchantBoardingAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized | [`Response401tokenException`](../../doc/models/response-401-token-exception.md) |
| 412 | Precondition Failed | [`Response412Exception`](../../doc/models/response-412-exception.md) |

