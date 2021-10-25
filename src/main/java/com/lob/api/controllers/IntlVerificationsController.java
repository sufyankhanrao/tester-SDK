/*
 * LobAPI20200211SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lob.api.ApiHelper;
import com.lob.api.AuthManager;
import com.lob.api.Configuration;
import com.lob.api.exceptions.ApiException;
import com.lob.api.exceptions.ErrorErrorException;
import com.lob.api.http.Headers;
import com.lob.api.http.client.HttpCallback;
import com.lob.api.http.client.HttpClient;
import com.lob.api.http.client.HttpContext;
import com.lob.api.http.request.HttpRequest;
import com.lob.api.http.response.HttpResponse;
import com.lob.api.http.response.HttpStringResponse;
import com.lob.api.models.IntlVerification;
import com.lob.api.models.IntlVerifications;
import com.lob.api.models.MultipleComponentsIntl;
import com.lob.api.models.XLangOutputEnum;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class IntlVerificationsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public IntlVerificationsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public IntlVerificationsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Verify a list of international (except US or US territories) address _with a live API key_.
     * Requests to this endpoint with a test API key will return a dummy response based on the
     * primary line you input.
     * @param  addresses  Required parameter: Example:
     * @return    Returns the IntlVerifications response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IntlVerifications bulkIntlVerifications(
            final List<MultipleComponentsIntl> addresses) throws ApiException, IOException {
        HttpRequest request = buildBulkIntlVerificationsRequest(addresses);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleBulkIntlVerificationsResponse(context);
    }

    /**
     * Verify a list of international (except US or US territories) address _with a live API key_.
     * Requests to this endpoint with a test API key will return a dummy response based on the
     * primary line you input.
     * @param  addresses  Required parameter: Example:
     * @return    Returns the IntlVerifications response from the API call
     */
    public CompletableFuture<IntlVerifications> bulkIntlVerificationsAsync(
            final List<MultipleComponentsIntl> addresses) {
        return makeHttpCallAsync(() -> buildBulkIntlVerificationsRequest(addresses),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleBulkIntlVerificationsResponse(context));
    }

    /**
     * Builds the HttpRequest object for bulkIntlVerifications.
     */
    private HttpRequest buildBulkIntlVerificationsRequest(
            final List<MultipleComponentsIntl> addresses) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/bulk/intl_verifications");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("addresses", addresses);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for bulkIntlVerifications.
     * @return An object of type IntlVerifications
     */
    private IntlVerifications handleBulkIntlVerificationsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        IntlVerifications result = ApiHelper.deserialize(responseBody,
                IntlVerifications.class);

        return result;
    }

    /**
     * Verify an international (except US or US territories) address _with a live API key_. Requests
     * to this endpoint with a test API key will return a dummy response based on the primary line
     * you input.
     * @param  body  Required parameter: Example:
     * @param  xLangOutput  Optional parameter: * `native` - Translate response to the native
     *         language of the country in the request * `match` - match the response to the language
     *         in the request Default response is in English.
     * @return    Returns the IntlVerification response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IntlVerification intlVerification(
            final Object body,
            final XLangOutputEnum xLangOutput) throws ApiException, IOException {
        HttpRequest request = buildIntlVerificationRequest(body, xLangOutput);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleIntlVerificationResponse(context);
    }

    /**
     * Verify an international (except US or US territories) address _with a live API key_. Requests
     * to this endpoint with a test API key will return a dummy response based on the primary line
     * you input.
     * @param  body  Required parameter: Example:
     * @param  xLangOutput  Optional parameter: * `native` - Translate response to the native
     *         language of the country in the request * `match` - match the response to the language
     *         in the request Default response is in English.
     * @return    Returns the IntlVerification response from the API call
     */
    public CompletableFuture<IntlVerification> intlVerificationAsync(
            final Object body,
            final XLangOutputEnum xLangOutput) {
        return makeHttpCallAsync(() -> buildIntlVerificationRequest(body, xLangOutput),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleIntlVerificationResponse(context));
    }

    /**
     * Builds the HttpRequest object for intlVerification.
     */
    private HttpRequest buildIntlVerificationRequest(
            final Object body,
            final XLangOutputEnum xLangOutput) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/intl_verifications");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("x-lang-output",
                (xLangOutput != null) ? xLangOutput.value() : null);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for intlVerification.
     * @return An object of type IntlVerification
     */
    private IntlVerification handleIntlVerificationResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        IntlVerification result = ApiHelper.deserialize(responseBody,
                IntlVerification.class);

        return result;
    }

}