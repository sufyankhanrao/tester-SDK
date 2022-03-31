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
import tech.fortis.sandbox.api.models.Filter2;
import tech.fortis.sandbox.api.models.Page;
import tech.fortis.sandbox.api.models.ResponseDeviceTerm;
import tech.fortis.sandbox.api.models.ResponseDeviceTermsCollection;
import tech.fortis.sandbox.api.models.Sort2;
import tech.fortis.sandbox.api.models.V1DeviceTermsRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DeviceTermsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DeviceTermsController(Configuration config, HttpClient httpClient,
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
    public DeviceTermsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Create a new device term.
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseDeviceTerm response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseDeviceTerm createANewDeviceTerm(
            final V1DeviceTermsRequest body) throws ApiException, IOException {
        HttpRequest request = buildCreateANewDeviceTermRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateANewDeviceTermResponse(context);
    }

    /**
     * Create a new device term.
     * @param  body  Required parameter: Example:
     * @return    Returns the ResponseDeviceTerm response from the API call
     */
    public CompletableFuture<ResponseDeviceTerm> createANewDeviceTermAsync(
            final V1DeviceTermsRequest body) {
        return makeHttpCallAsync(() -> buildCreateANewDeviceTermRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateANewDeviceTermResponse(context));
    }

    /**
     * Builds the HttpRequest object for createANewDeviceTerm.
     */
    private HttpRequest buildCreateANewDeviceTermRequest(
            final V1DeviceTermsRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/device-terms");

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
     * Processes the response for createANewDeviceTerm.
     * @return An object of type ResponseDeviceTerm
     */
    private ResponseDeviceTerm handleCreateANewDeviceTermResponse(
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
        ResponseDeviceTerm result = ApiHelper.deserialize(responseBody,
                ResponseDeviceTerm.class);

        return result;
    }

    /**
     * List all device terms related.
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
     * @return    Returns the ResponseDeviceTermsCollection response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseDeviceTermsCollection listAllDeviceTermsRelated(
            final Page page,
            final Sort2 sort,
            final Filter2 filter) throws ApiException, IOException {
        HttpRequest request = buildListAllDeviceTermsRelatedRequest(page, sort, filter);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListAllDeviceTermsRelatedResponse(context);
    }

    /**
     * List all device terms related.
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
     * @return    Returns the ResponseDeviceTermsCollection response from the API call
     */
    public CompletableFuture<ResponseDeviceTermsCollection> listAllDeviceTermsRelatedAsync(
            final Page page,
            final Sort2 sort,
            final Filter2 filter) {
        return makeHttpCallAsync(() -> buildListAllDeviceTermsRelatedRequest(page, sort, filter),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleListAllDeviceTermsRelatedResponse(context));
    }

    /**
     * Builds the HttpRequest object for listAllDeviceTermsRelated.
     */
    private HttpRequest buildListAllDeviceTermsRelatedRequest(
            final Page page,
            final Sort2 sort,
            final Filter2 filter) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/device-terms");

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
     * Processes the response for listAllDeviceTermsRelated.
     * @return An object of type ResponseDeviceTermsCollection
     */
    private ResponseDeviceTermsCollection handleListAllDeviceTermsRelatedResponse(
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
        ResponseDeviceTermsCollection result = ApiHelper.deserialize(responseBody,
                ResponseDeviceTermsCollection.class);

        return result;
    }

    /**
     * View single device term record.
     * @param  deviceTermsId  Required parameter: Device term ID
     * @return    Returns the ResponseDeviceTerm response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseDeviceTerm viewSingleDeviceTermRecord(
            final String deviceTermsId) throws ApiException, IOException {
        HttpRequest request = buildViewSingleDeviceTermRecordRequest(deviceTermsId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleViewSingleDeviceTermRecordResponse(context);
    }

    /**
     * View single device term record.
     * @param  deviceTermsId  Required parameter: Device term ID
     * @return    Returns the ResponseDeviceTerm response from the API call
     */
    public CompletableFuture<ResponseDeviceTerm> viewSingleDeviceTermRecordAsync(
            final String deviceTermsId) {
        return makeHttpCallAsync(() -> buildViewSingleDeviceTermRecordRequest(deviceTermsId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleViewSingleDeviceTermRecordResponse(context));
    }

    /**
     * Builds the HttpRequest object for viewSingleDeviceTermRecord.
     */
    private HttpRequest buildViewSingleDeviceTermRecordRequest(
            final String deviceTermsId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/v1/device-terms/{device_terms_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("device_terms_id",
                new SimpleEntry<Object, Boolean>(deviceTermsId, true));
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
     * Processes the response for viewSingleDeviceTermRecord.
     * @return An object of type ResponseDeviceTerm
     */
    private ResponseDeviceTerm handleViewSingleDeviceTermRecordResponse(
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
        ResponseDeviceTerm result = ApiHelper.deserialize(responseBody,
                ResponseDeviceTerm.class);

        return result;
    }

}