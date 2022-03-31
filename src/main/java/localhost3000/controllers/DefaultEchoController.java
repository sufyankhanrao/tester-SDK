/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost3000.ApiHelper;
import localhost3000.AuthManager;
import localhost3000.Configuration;
import localhost3000.exceptions.ApiException;
import localhost3000.http.Headers;
import localhost3000.http.client.HttpCallback;
import localhost3000.http.client.HttpClient;
import localhost3000.http.client.HttpContext;
import localhost3000.http.request.HttpRequest;
import localhost3000.http.response.HttpResponse;
import localhost3000.http.response.HttpStringResponse;
import localhost3000.models.DynamicResponse;
import localhost3000.models.EchoResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultEchoController extends BaseController implements EchoController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultEchoController(Configuration config, HttpClient httpClient,
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
    public DefaultEchoController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Echo's back the request.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse jsonEcho(
            final Object input) throws ApiException, IOException {
        HttpRequest request = buildJsonEchoRequest(input);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleJsonEchoResponse(context);
    }

    /**
     * Echo's back the request.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> jsonEchoAsync(
            final Object input) {
        return makeHttpCallAsync(() -> buildJsonEchoRequest(input),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleJsonEchoResponse(context));
    }

    /**
     * Builds the HttpRequest object for jsonEcho.
     */
    private HttpRequest buildJsonEchoRequest(
            final Object input) throws JsonProcessingException {
        //validating required parameters
        if (null == input) {
            throw new NullPointerException("The parameter \"input\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("echo", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(input);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for jsonEcho.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleJsonEchoResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        //return null on 404
        if (responseCode == 404) {
            return null;
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * Sends the request including any form params as JSON.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse formEcho(
            final Object input) throws ApiException, IOException {
        HttpRequest request = buildFormEchoRequest(input);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleFormEchoResponse(context);
    }

    /**
     * Sends the request including any form params as JSON.
     * @param  input  Required parameter: Example:
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> formEchoAsync(
            final Object input) {
        return makeHttpCallAsync(() -> buildFormEchoRequest(input),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleFormEchoResponse(context));
    }

    /**
     * Builds the HttpRequest object for formEcho.
     */
    private HttpRequest buildFormEchoRequest(
            final Object input) {
        //validating required parameters
        if (null == input) {
            throw new NullPointerException("The parameter \"input\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("input", input);

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
     * Processes the response for formEcho.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleFormEchoResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        //return null on 404
        if (responseCode == 404) {
            return null;
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EchoResponse queryEcho(
            final Map<String, Object> queryParameters) throws ApiException, IOException {
        HttpRequest request = buildQueryEchoRequest(queryParameters);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleQueryEchoResponse(context);
    }

    /**
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the EchoResponse response from the API call
     */
    public CompletableFuture<EchoResponse> queryEchoAsync(
            final Map<String, Object> queryParameters) {
        return makeHttpCallAsync(() -> buildQueryEchoRequest(queryParameters),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleQueryEchoResponse(context));
    }

    /**
     * Builds the HttpRequest object for queryEcho.
     */
    private HttpRequest buildQueryEchoRequest(
            final Map<String, Object> queryParameters) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
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
     * Processes the response for queryEcho.
     * @return An object of type EchoResponse
     */
    private EchoResponse handleQueryEchoResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        //return null on 404
        if (responseCode == 404) {
            return null;
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        EchoResponse result = ApiHelper.deserialize(responseBody,
                EchoResponse.class);

        return result;
    }

}