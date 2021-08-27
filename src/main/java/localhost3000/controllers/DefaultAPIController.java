/*
 * JsonValueTesterLib
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
import localhost3000.models.CustomAttributeDefinition;
import localhost3000.models.CustomAttributeValue;
import localhost3000.models.ServerResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultAPIController extends BaseController implements APIController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultAPIController(Configuration config, HttpClient httpClient,
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
    public DefaultAPIController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @param  customAttributeDefinition  Required parameter: Example:
     * @param  setToNull  Required parameter: Example:
     * @param  unSet  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendCustomAttributeDefinition(
            final CustomAttributeDefinition customAttributeDefinition,
            final boolean setToNull,
            final boolean unSet) throws ApiException, IOException {
        HttpRequest request = buildSendCustomAttributeDefinitionRequest(customAttributeDefinition,
                setToNull, unSet);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendCustomAttributeDefinitionResponse(context);
    }

    /**
     * @param  customAttributeDefinition  Required parameter: Example:
     * @param  setToNull  Required parameter: Example:
     * @param  unSet  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendCustomAttributeDefinitionAsync(
            final CustomAttributeDefinition customAttributeDefinition,
            final boolean setToNull,
            final boolean unSet) {
        return makeHttpCallAsync(() -> buildSendCustomAttributeDefinitionRequest(
                customAttributeDefinition, setToNull, unSet),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendCustomAttributeDefinitionResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendCustomAttributeDefinition.
     */
    private HttpRequest buildSendCustomAttributeDefinitionRequest(
            final CustomAttributeDefinition customAttributeDefinition,
            final boolean setToNull,
            final boolean unSet) throws JsonProcessingException {
        //validating required parameters
        if (null == customAttributeDefinition) {
            throw new NullPointerException("The parameter \"customAttributeDefinition\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/sendCustomAttributeDefinition");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("setToNull", setToNull);
        queryParameters.put("unSet", unSet);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(customAttributeDefinition);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendCustomAttributeDefinition.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendCustomAttributeDefinitionResponse(
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

    /**
     * @param  customAttributeValue  Required parameter: Example:
     * @param  setToNull  Required parameter: Example:
     * @param  unSet  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendCustomAttributeValue(
            final CustomAttributeValue customAttributeValue,
            final boolean setToNull,
            final boolean unSet) throws ApiException, IOException {
        HttpRequest request = buildSendCustomAttributeValueRequest(customAttributeValue, setToNull,
                unSet);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendCustomAttributeValueResponse(context);
    }

    /**
     * @param  customAttributeValue  Required parameter: Example:
     * @param  setToNull  Required parameter: Example:
     * @param  unSet  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendCustomAttributeValueAsync(
            final CustomAttributeValue customAttributeValue,
            final boolean setToNull,
            final boolean unSet) {
        return makeHttpCallAsync(() -> buildSendCustomAttributeValueRequest(customAttributeValue,
                setToNull, unSet),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendCustomAttributeValueResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendCustomAttributeValue.
     */
    private HttpRequest buildSendCustomAttributeValueRequest(
            final CustomAttributeValue customAttributeValue,
            final boolean setToNull,
            final boolean unSet) throws JsonProcessingException {
        //validating required parameters
        if (null == customAttributeValue) {
            throw new NullPointerException("The parameter \"customAttributeValue\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/sendCustomAttributeValue");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("setToNull", setToNull);
        queryParameters.put("unSet", unSet);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(customAttributeValue);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendCustomAttributeValue.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendCustomAttributeValueResponse(
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