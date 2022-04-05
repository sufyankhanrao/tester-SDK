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
import tech.fortis.sandbox.api.models.Filter5;
import tech.fortis.sandbox.api.models.Page;
import tech.fortis.sandbox.api.models.ResponseQuickInvoice;
import tech.fortis.sandbox.api.models.ResponseQuickInvoicesCollection;
import tech.fortis.sandbox.api.models.Sort5;
import tech.fortis.sandbox.api.models.V1QuickInvoicesRequest;
import tech.fortis.sandbox.api.models.V1QuickInvoicesRequest1;
import tech.fortis.sandbox.api.models.V1QuickInvoicesTransactionRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class QuickInvoicesController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public QuickInvoicesController(Configuration config, HttpClient httpClient,
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
    public QuickInvoicesController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Create a new quick invoice.
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseQuickInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseQuickInvoice createANewQuickInvoice(
            final V1QuickInvoicesRequest body) throws ApiException, IOException {
        HttpRequest request = buildCreateANewQuickInvoiceRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateANewQuickInvoiceResponse(context);
    }

    /**
     * Create a new quick invoice.
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseQuickInvoice response from the API call
     */
    public CompletableFuture<ResponseQuickInvoice> createANewQuickInvoiceAsync(
            final V1QuickInvoicesRequest body) {
        return makeHttpCallAsync(() -> buildCreateANewQuickInvoiceRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateANewQuickInvoiceResponse(context));
    }

    /**
     * Builds the HttpRequest object for createANewQuickInvoice.
     */
    private HttpRequest buildCreateANewQuickInvoiceRequest(
            final V1QuickInvoicesRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/quick-invoices");

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
     * Processes the response for createANewQuickInvoice.
     * @return An object of type ResponseQuickInvoice
     */
    private ResponseQuickInvoice handleCreateANewQuickInvoiceResponse(
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
        ResponseQuickInvoice result = ApiHelper.deserialize(responseBody,
                ResponseQuickInvoice.class);

        return result;
    }

    /**
     * List all quick invoices related.
     * @param  page  Optional parameter: Use this field to specify paginate your results, by using
     *         page size and number. You can use one of the following methods: &gt;/endpoint?page={
     *         "number": 1, "size": 50 } &gt; &gt;/endpoint?page[number]=1&page[size]=50
     * @param  sort  Optional parameter: You can use any `field_name` from this endpoint results,
     *         and you can combine more than one field for more complex sorting. You can use one of
     *         the following methods: &gt;/endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
     *         &gt; &gt;/endpoint?sort[field_name]=asc&sort[field_name2]=desc
     * @param  filter  Optional parameter: You can use any `field_name` from this endpoint results
     *         as a filter, and you can also use more than one field to create AND conditions. You
     *         can use one of the following methods: &gt;/endpoint?filter={ "field_name": "Value" } &gt;
     *         &gt;/endpoint?filter[field_name]=Value
     * @return    Returns the ResponseQuickInvoicesCollection response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseQuickInvoicesCollection listAllQuickInvoicesRelated(
            final Page page,
            final Sort5 sort,
            final Filter5 filter) throws ApiException, IOException {
        HttpRequest request = buildListAllQuickInvoicesRelatedRequest(page, sort, filter);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListAllQuickInvoicesRelatedResponse(context);
    }

    /**
     * List all quick invoices related.
     * @param  page  Optional parameter: Use this field to specify paginate your results, by using
     *         page size and number. You can use one of the following methods: &gt;/endpoint?page={
     *         "number": 1, "size": 50 } &gt; &gt;/endpoint?page[number]=1&page[size]=50
     * @param  sort  Optional parameter: You can use any `field_name` from this endpoint results,
     *         and you can combine more than one field for more complex sorting. You can use one of
     *         the following methods: &gt;/endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
     *         &gt; &gt;/endpoint?sort[field_name]=asc&sort[field_name2]=desc
     * @param  filter  Optional parameter: You can use any `field_name` from this endpoint results
     *         as a filter, and you can also use more than one field to create AND conditions. You
     *         can use one of the following methods: &gt;/endpoint?filter={ "field_name": "Value" } &gt;
     *         &gt;/endpoint?filter[field_name]=Value
     * @return    Returns the ResponseQuickInvoicesCollection response from the API call
     */
    public CompletableFuture<ResponseQuickInvoicesCollection> listAllQuickInvoicesRelatedAsync(
            final Page page,
            final Sort5 sort,
            final Filter5 filter) {
        return makeHttpCallAsync(() -> buildListAllQuickInvoicesRelatedRequest(page, sort, filter),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleListAllQuickInvoicesRelatedResponse(context));
    }

    /**
     * Builds the HttpRequest object for listAllQuickInvoicesRelated.
     */
    private HttpRequest buildListAllQuickInvoicesRelatedRequest(
            final Page page,
            final Sort5 sort,
            final Filter5 filter) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/quick-invoices");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("page", page);
        queryParameters.put("sort", sort);
        queryParameters.put("filter", filter);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for listAllQuickInvoicesRelated.
     * @return An object of type ResponseQuickInvoicesCollection
     */
    private ResponseQuickInvoicesCollection handleListAllQuickInvoicesRelatedResponse(
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
        ResponseQuickInvoicesCollection result = ApiHelper.deserialize(responseBody,
                ResponseQuickInvoicesCollection.class);

        return result;
    }

    /**
     * Resend Notification Email.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @return    Returns the ResponseQuickInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseQuickInvoice resendNotificationEmail(
            final String quickInvoiceId) throws ApiException, IOException {
        HttpRequest request = buildResendNotificationEmailRequest(quickInvoiceId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleResendNotificationEmailResponse(context);
    }

    /**
     * Resend Notification Email.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @return    Returns the ResponseQuickInvoice response from the API call
     */
    public CompletableFuture<ResponseQuickInvoice> resendNotificationEmailAsync(
            final String quickInvoiceId) {
        return makeHttpCallAsync(() -> buildResendNotificationEmailRequest(quickInvoiceId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleResendNotificationEmailResponse(context));
    }

    /**
     * Builds the HttpRequest object for resendNotificationEmail.
     */
    private HttpRequest buildResendNotificationEmailRequest(
            final String quickInvoiceId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/quick-invoices/{quick_invoice_id}/resend");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("quick_invoice_id",
                new SimpleEntry<Object, Boolean>(quickInvoiceId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for resendNotificationEmail.
     * @return An object of type ResponseQuickInvoice
     */
    private ResponseQuickInvoice handleResendNotificationEmailResponse(
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
        ResponseQuickInvoice result = ApiHelper.deserialize(responseBody,
                ResponseQuickInvoice.class);

        return result;
    }

    /**
     * Associate Transaction with Ouick Invoice.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseQuickInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseQuickInvoice associateTransactionWithOuickInvoice(
            final String quickInvoiceId,
            final V1QuickInvoicesTransactionRequest body) throws ApiException, IOException {
        HttpRequest request = buildAssociateTransactionWithOuickInvoiceRequest(quickInvoiceId,
                body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAssociateTransactionWithOuickInvoiceResponse(context);
    }

    /**
     * Associate Transaction with Ouick Invoice.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseQuickInvoice response from the API call
     */
    public CompletableFuture<ResponseQuickInvoice> associateTransactionWithOuickInvoiceAsync(
            final String quickInvoiceId,
            final V1QuickInvoicesTransactionRequest body) {
        return makeHttpCallAsync(() -> buildAssociateTransactionWithOuickInvoiceRequest(
                quickInvoiceId, body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleAssociateTransactionWithOuickInvoiceResponse(context));
    }

    /**
     * Builds the HttpRequest object for associateTransactionWithOuickInvoice.
     */
    private HttpRequest buildAssociateTransactionWithOuickInvoiceRequest(
            final String quickInvoiceId,
            final V1QuickInvoicesTransactionRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/quick-invoices/{quick_invoice_id}/transaction");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("quick_invoice_id",
                new SimpleEntry<Object, Boolean>(quickInvoiceId, true));
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
     * Processes the response for associateTransactionWithOuickInvoice.
     * @return An object of type ResponseQuickInvoice
     */
    private ResponseQuickInvoice handleAssociateTransactionWithOuickInvoiceResponse(
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
        ResponseQuickInvoice result = ApiHelper.deserialize(responseBody,
                ResponseQuickInvoice.class);

        return result;
    }

    /**
     * Remove transaction from Quick Invoice.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseQuickInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseQuickInvoice removeTransactionFromQuickInvoice(
            final String quickInvoiceId,
            final V1QuickInvoicesTransactionRequest body) throws ApiException, IOException {
        HttpRequest request = buildRemoveTransactionFromQuickInvoiceRequest(quickInvoiceId, body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRemoveTransactionFromQuickInvoiceResponse(context);
    }

    /**
     * Remove transaction from Quick Invoice.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseQuickInvoice response from the API call
     */
    public CompletableFuture<ResponseQuickInvoice> removeTransactionFromQuickInvoiceAsync(
            final String quickInvoiceId,
            final V1QuickInvoicesTransactionRequest body) {
        return makeHttpCallAsync(() -> buildRemoveTransactionFromQuickInvoiceRequest(quickInvoiceId,
                body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleRemoveTransactionFromQuickInvoiceResponse(context));
    }

    /**
     * Builds the HttpRequest object for removeTransactionFromQuickInvoice.
     */
    private HttpRequest buildRemoveTransactionFromQuickInvoiceRequest(
            final String quickInvoiceId,
            final V1QuickInvoicesTransactionRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/quick-invoices/{quick_invoice_id}/transaction");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("quick_invoice_id",
                new SimpleEntry<Object, Boolean>(quickInvoiceId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().deleteBody(queryBuilder, headers, null,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for removeTransactionFromQuickInvoice.
     * @return An object of type ResponseQuickInvoice
     */
    private ResponseQuickInvoice handleRemoveTransactionFromQuickInvoiceResponse(
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
        ResponseQuickInvoice result = ApiHelper.deserialize(responseBody,
                ResponseQuickInvoice.class);

        return result;
    }

    /**
     * Delete quick Invoice.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @return    Returns the ResponseQuickInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseQuickInvoice deleteQuickInvoice(
            final String quickInvoiceId) throws ApiException, IOException {
        HttpRequest request = buildDeleteQuickInvoiceRequest(quickInvoiceId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeleteQuickInvoiceResponse(context);
    }

    /**
     * Delete quick Invoice.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @return    Returns the ResponseQuickInvoice response from the API call
     */
    public CompletableFuture<ResponseQuickInvoice> deleteQuickInvoiceAsync(
            final String quickInvoiceId) {
        return makeHttpCallAsync(() -> buildDeleteQuickInvoiceRequest(quickInvoiceId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleDeleteQuickInvoiceResponse(context));
    }

    /**
     * Builds the HttpRequest object for deleteQuickInvoice.
     */
    private HttpRequest buildDeleteQuickInvoiceRequest(
            final String quickInvoiceId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/quick-invoices/{quick_invoice_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("quick_invoice_id",
                new SimpleEntry<Object, Boolean>(quickInvoiceId, true));
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
     * Processes the response for deleteQuickInvoice.
     * @return An object of type ResponseQuickInvoice
     */
    private ResponseQuickInvoice handleDeleteQuickInvoiceResponse(
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
        ResponseQuickInvoice result = ApiHelper.deserialize(responseBody,
                ResponseQuickInvoice.class);

        return result;
    }

    /**
     * View single quick invoice record.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @return    Returns the ResponseQuickInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseQuickInvoice viewSingleQuickInvoiceRecord(
            final String quickInvoiceId) throws ApiException, IOException {
        HttpRequest request = buildViewSingleQuickInvoiceRecordRequest(quickInvoiceId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleViewSingleQuickInvoiceRecordResponse(context);
    }

    /**
     * View single quick invoice record.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @return    Returns the ResponseQuickInvoice response from the API call
     */
    public CompletableFuture<ResponseQuickInvoice> viewSingleQuickInvoiceRecordAsync(
            final String quickInvoiceId) {
        return makeHttpCallAsync(() -> buildViewSingleQuickInvoiceRecordRequest(quickInvoiceId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleViewSingleQuickInvoiceRecordResponse(context));
    }

    /**
     * Builds the HttpRequest object for viewSingleQuickInvoiceRecord.
     */
    private HttpRequest buildViewSingleQuickInvoiceRecordRequest(
            final String quickInvoiceId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/quick-invoices/{quick_invoice_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("quick_invoice_id",
                new SimpleEntry<Object, Boolean>(quickInvoiceId, true));
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
     * Processes the response for viewSingleQuickInvoiceRecord.
     * @return An object of type ResponseQuickInvoice
     */
    private ResponseQuickInvoice handleViewSingleQuickInvoiceRecordResponse(
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
        ResponseQuickInvoice result = ApiHelper.deserialize(responseBody,
                ResponseQuickInvoice.class);

        return result;
    }

    /**
     * Update quick invoice.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseQuickInvoice response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseQuickInvoice updateQuickInvoice(
            final String quickInvoiceId,
            final V1QuickInvoicesRequest1 body) throws ApiException, IOException {
        HttpRequest request = buildUpdateQuickInvoiceRequest(quickInvoiceId, body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateQuickInvoiceResponse(context);
    }

    /**
     * Update quick invoice.
     * @param  quickInvoiceId  Required parameter: Quick Invoice ID
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseQuickInvoice response from the API call
     */
    public CompletableFuture<ResponseQuickInvoice> updateQuickInvoiceAsync(
            final String quickInvoiceId,
            final V1QuickInvoicesRequest1 body) {
        return makeHttpCallAsync(() -> buildUpdateQuickInvoiceRequest(quickInvoiceId, body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleUpdateQuickInvoiceResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateQuickInvoice.
     */
    private HttpRequest buildUpdateQuickInvoiceRequest(
            final String quickInvoiceId,
            final V1QuickInvoicesRequest1 body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/quick-invoices/{quick_invoice_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("quick_invoice_id",
                new SimpleEntry<Object, Boolean>(quickInvoiceId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().patchBody(queryBuilder, headers, null,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateQuickInvoice.
     * @return An object of type ResponseQuickInvoice
     */
    private ResponseQuickInvoice handleUpdateQuickInvoiceResponse(
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
        ResponseQuickInvoice result = ApiHelper.deserialize(responseBody,
                ResponseQuickInvoice.class);

        return result;
    }

}