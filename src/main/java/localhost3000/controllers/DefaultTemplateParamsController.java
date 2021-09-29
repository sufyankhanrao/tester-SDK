/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.List;
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
import localhost3000.models.EchoResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultTemplateParamsController extends BaseController implements TemplateParamsController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultTemplateParamsController(Configuration config, HttpClient httpClient,
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
    public DefaultTemplateParamsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @param  strings  Required parameter: <testing> <testing>
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EchoResponse sendStringArray(
            final List<String> strings) throws ApiException, IOException {
        HttpRequest request = buildSendStringArrayRequest(strings);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringArrayResponse(context);
    }

    /**
     * @param  strings  Required parameter: <testing> <testing>
     * @return    Returns the EchoResponse response from the API call
     */
    public CompletableFuture<EchoResponse> sendStringArrayAsync(
            final List<String> strings) {
        return makeHttpCallAsync(() -> buildSendStringArrayRequest(strings),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringArray.
     */
    private HttpRequest buildSendStringArrayRequest(
            final List<String> strings) {
        //validating required parameters
        if (null == strings) {
            throw new NullPointerException("The parameter \"strings\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/template/{strings}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("strings",
                new SimpleEntry<Object, Boolean>(strings, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
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
     * Processes the response for sendStringArray.
     * @return An object of type EchoResponse
     */
    private EchoResponse handleSendStringArrayResponse(
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

    /**
     * @param  integers  Required parameter: <testing> <testing>
     * @return    Returns the EchoResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EchoResponse sendIntegerArray(
            final List<Integer> integers) throws ApiException, IOException {
        HttpRequest request = buildSendIntegerArrayRequest(integers);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendIntegerArrayResponse(context);
    }

    /**
     * @param  integers  Required parameter: <testing> <testing>
     * @return    Returns the EchoResponse response from the API call
     */
    public CompletableFuture<EchoResponse> sendIntegerArrayAsync(
            final List<Integer> integers) {
        return makeHttpCallAsync(() -> buildSendIntegerArrayRequest(integers),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendIntegerArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendIntegerArray.
     */
    private HttpRequest buildSendIntegerArrayRequest(
            final List<Integer> integers) {
        //validating required parameters
        if (null == integers) {
            throw new NullPointerException("The parameter \"integers\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/template/{integers}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("integers",
                new SimpleEntry<Object, Boolean>(integers, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
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
     * Processes the response for sendIntegerArray.
     * @return An object of type EchoResponse
     */
    private EchoResponse handleSendIntegerArrayResponse(
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