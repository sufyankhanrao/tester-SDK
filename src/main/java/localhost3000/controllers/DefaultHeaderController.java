/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

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
import localhost3000.models.ServerResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultHeaderController extends BaseController implements HeaderController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultHeaderController(Configuration config, HttpClient httpClient,
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
    public DefaultHeaderController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Sends a single header params.
     * @param  customHeader  Required parameter: Example:
     * @param  value  Required parameter: Represents the value of the custom header
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendHeaders(
            final String customHeader,
            final String value) throws ApiException, IOException {
        HttpRequest request = buildSendHeadersRequest(customHeader, value);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendHeadersResponse(context);
    }

    /**
     * Sends a single header params.
     * @param  customHeader  Required parameter: Example:
     * @param  value  Required parameter: Represents the value of the custom header
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendHeadersAsync(
            final String customHeader,
            final String value) {
        return makeHttpCallAsync(() -> buildSendHeadersRequest(customHeader, value),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendHeadersResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendHeaders.
     */
    private HttpRequest buildSendHeadersRequest(
            final String customHeader,
            final String value) {
        //validating required parameters
        if (null == customHeader) {
            throw new NullPointerException("The parameter \"customHeader\" is a required parameter and cannot be null.");
        }

        if (null == value) {
            throw new NullPointerException("The parameter \"value\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/header");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("custom-header", customHeader);
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("value", value);

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
     * Processes the response for sendHeaders.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendHeadersResponse(
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
        ServerResponse result = ApiHelper.deserialize(responseBody,
                ServerResponse.class);

        return result;
    }

}