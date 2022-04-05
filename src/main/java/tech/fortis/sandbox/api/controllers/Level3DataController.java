/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import tech.fortis.sandbox.api.ApiHelper;
import tech.fortis.sandbox.api.AuthManager;
import tech.fortis.sandbox.api.Configuration;
import tech.fortis.sandbox.api.exceptions.ApiException;
import tech.fortis.sandbox.api.exceptions.Response401tokenException;
import tech.fortis.sandbox.api.exceptions.Response412Exception;
import tech.fortis.sandbox.api.http.Headers;
import tech.fortis.sandbox.api.http.client.HttpCallback;
import tech.fortis.sandbox.api.http.client.HttpClient;
import tech.fortis.sandbox.api.http.client.HttpContext;
import tech.fortis.sandbox.api.http.request.HttpRequest;
import tech.fortis.sandbox.api.http.response.HttpResponse;
import tech.fortis.sandbox.api.http.response.HttpStringResponse;
import tech.fortis.sandbox.api.models.ResponseTransaction;
import tech.fortis.sandbox.api.models.V1TransactionsLevel3MasterCardRequest;
import tech.fortis.sandbox.api.models.V1TransactionsLevel3VisaRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class Level3DataController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public Level3DataController(Configuration config, HttpClient httpClient,
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
    public Level3DataController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Create a new Level3 entry for a MasterCard.
     * @param  body  Required parameter: Example:
     * @param  transactionId  Required parameter: Example:
     * @return    Returns the ResponseTransaction response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseTransaction createANewLevel3EntryForAMasterCard(
            final V1TransactionsLevel3MasterCardRequest body,
            final String transactionId) throws ApiException, IOException {
        HttpRequest request = buildCreateANewLevel3EntryForAMasterCardRequest(body, transactionId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateANewLevel3EntryForAMasterCardResponse(context);
    }

    /**
     * Create a new Level3 entry for a MasterCard.
     * @param  body  Required parameter: Example:
     * @param  transactionId  Required parameter: Example:
     * @return    Returns the ResponseTransaction response from the API call
     */
    public CompletableFuture<ResponseTransaction> createANewLevel3EntryForAMasterCardAsync(
            final V1TransactionsLevel3MasterCardRequest body,
            final String transactionId) {
        return makeHttpCallAsync(() -> buildCreateANewLevel3EntryForAMasterCardRequest(body,
                transactionId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateANewLevel3EntryForAMasterCardResponse(context));
    }

    /**
     * Builds the HttpRequest object for createANewLevel3EntryForAMasterCard.
     */
    private HttpRequest buildCreateANewLevel3EntryForAMasterCardRequest(
            final V1TransactionsLevel3MasterCardRequest body,
            final String transactionId) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/transactions/{transaction_id}/level3/master-card");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("transaction_id",
                new SimpleEntry<Object, Boolean>(transactionId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

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
     * Processes the response for createANewLevel3EntryForAMasterCard.
     * @return An object of type ResponseTransaction
     */
    private ResponseTransaction handleCreateANewLevel3EntryForAMasterCardResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new Response401tokenException("Unauthorized", context);
        }
        if (responseCode == 412) {
            throw new Response412Exception("Precondition Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ResponseTransaction result = ApiHelper.deserialize(responseBody,
                ResponseTransaction.class);

        return result;
    }

    /**
     * Create a new Level3 entry for a Visa.
     * @param  body  Required parameter: Example:
     * @param  transactionId  Required parameter: Example:
     * @return    Returns the ResponseTransaction response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseTransaction createANewLevel3EntryForAVisa(
            final V1TransactionsLevel3VisaRequest body,
            final String transactionId) throws ApiException, IOException {
        HttpRequest request = buildCreateANewLevel3EntryForAVisaRequest(body, transactionId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateANewLevel3EntryForAVisaResponse(context);
    }

    /**
     * Create a new Level3 entry for a Visa.
     * @param  body  Required parameter: Example:
     * @param  transactionId  Required parameter: Example:
     * @return    Returns the ResponseTransaction response from the API call
     */
    public CompletableFuture<ResponseTransaction> createANewLevel3EntryForAVisaAsync(
            final V1TransactionsLevel3VisaRequest body,
            final String transactionId) {
        return makeHttpCallAsync(() -> buildCreateANewLevel3EntryForAVisaRequest(body,
                transactionId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateANewLevel3EntryForAVisaResponse(context));
    }

    /**
     * Builds the HttpRequest object for createANewLevel3EntryForAVisa.
     */
    private HttpRequest buildCreateANewLevel3EntryForAVisaRequest(
            final V1TransactionsLevel3VisaRequest body,
            final String transactionId) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/transactions/{transaction_id}/level3/visa");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("transaction_id",
                new SimpleEntry<Object, Boolean>(transactionId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

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
     * Processes the response for createANewLevel3EntryForAVisa.
     * @return An object of type ResponseTransaction
     */
    private ResponseTransaction handleCreateANewLevel3EntryForAVisaResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new Response401tokenException("Unauthorized", context);
        }
        if (responseCode == 412) {
            throw new Response412Exception("Precondition Failed", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ResponseTransaction result = ApiHelper.deserialize(responseBody,
                ResponseTransaction.class);

        return result;
    }

    /**
     * Delete a single level3 record.
     * @param  transactionId  Required parameter: Example:
     * @param  level3Id  Required parameter: Example:
     * @return    Returns the ResponseTransaction response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseTransaction deleteASingleLevel3Record(
            final String transactionId,
            final String level3Id) throws ApiException, IOException {
        HttpRequest request = buildDeleteASingleLevel3RecordRequest(transactionId, level3Id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeleteASingleLevel3RecordResponse(context);
    }

    /**
     * Delete a single level3 record.
     * @param  transactionId  Required parameter: Example:
     * @param  level3Id  Required parameter: Example:
     * @return    Returns the ResponseTransaction response from the API call
     */
    public CompletableFuture<ResponseTransaction> deleteASingleLevel3RecordAsync(
            final String transactionId,
            final String level3Id) {
        return makeHttpCallAsync(() -> buildDeleteASingleLevel3RecordRequest(transactionId,
                level3Id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleDeleteASingleLevel3RecordResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteASingleLevel3Record.
     */
    private HttpRequest buildDeleteASingleLevel3RecordRequest(
            final String transactionId,
            final String level3Id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/transactions/{transaction_id}/level3/{level3_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("transaction_id",
                new SimpleEntry<Object, Boolean>(transactionId, true));
        templateParameters.put("level3_id",
                new SimpleEntry<Object, Boolean>(level3Id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for deleteASingleLevel3Record.
     * @return An object of type ResponseTransaction
     */
    private ResponseTransaction handleDeleteASingleLevel3RecordResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new Response401tokenException("Unauthorized", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ResponseTransaction result = ApiHelper.deserialize(responseBody,
                ResponseTransaction.class);

        return result;
    }

    /**
     * View single level3 record.
     * @param  transactionId  Required parameter: Example:
     * @param  level3Id  Required parameter: Example:
     * @return    Returns the ResponseTransaction response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseTransaction viewSingleLevel3Record(
            final String transactionId,
            final String level3Id) throws ApiException, IOException {
        HttpRequest request = buildViewSingleLevel3RecordRequest(transactionId, level3Id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleViewSingleLevel3RecordResponse(context);
    }

    /**
     * View single level3 record.
     * @param  transactionId  Required parameter: Example:
     * @param  level3Id  Required parameter: Example:
     * @return    Returns the ResponseTransaction response from the API call
     */
    public CompletableFuture<ResponseTransaction> viewSingleLevel3RecordAsync(
            final String transactionId,
            final String level3Id) {
        return makeHttpCallAsync(() -> buildViewSingleLevel3RecordRequest(transactionId, level3Id),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleViewSingleLevel3RecordResponse(context));
    }

    /**
     * Builds the HttpRequest object for viewSingleLevel3Record.
     */
    private HttpRequest buildViewSingleLevel3RecordRequest(
            final String transactionId,
            final String level3Id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/transactions/{transaction_id}/level3/{level3_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("transaction_id",
                new SimpleEntry<Object, Boolean>(transactionId, true));
        templateParameters.put("level3_id",
                new SimpleEntry<Object, Boolean>(level3Id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for viewSingleLevel3Record.
     * @return An object of type ResponseTransaction
     */
    private ResponseTransaction handleViewSingleLevel3RecordResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 401) {
            throw new Response401tokenException("Unauthorized", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ResponseTransaction result = ApiHelper.deserialize(responseBody,
                ResponseTransaction.class);

        return result;
    }

}