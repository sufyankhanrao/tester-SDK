/*
 * OneOfNonScalarEndpointsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
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
import localhost3000.models.containers.GetOneofContainerOfAnyofSession;

/**
 * This class lists all the endpoints of the groups.
 */
public final class MixNonPrimitiveTypesInResponseBodyController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public MixNonPrimitiveTypesInResponseBodyController(Configuration config, HttpClient httpClient,
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
    public MixNonPrimitiveTypesInResponseBodyController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @param  isPrimitiveType  Required parameter: Example:
     * @param  isAtEndpointLevel  Required parameter: Example:
     * @param  hasDiscriminator  Required parameter: Example:
     * @return    Returns the GetOneofContainerOfAnyofSession response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOneofContainerOfAnyofSession getOneofContainerOfAnyof(
            final boolean isPrimitiveType,
            final boolean isAtEndpointLevel,
            final boolean hasDiscriminator) throws ApiException, IOException {
        HttpRequest request = buildGetOneofContainerOfAnyofRequest(isPrimitiveType,
                isAtEndpointLevel, hasDiscriminator);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetOneofContainerOfAnyofResponse(context);
    }

    /**
     * @param  isPrimitiveType  Required parameter: Example:
     * @param  isAtEndpointLevel  Required parameter: Example:
     * @param  hasDiscriminator  Required parameter: Example:
     * @return    Returns the GetOneofContainerOfAnyofSession response from the API call
     */
    public CompletableFuture<GetOneofContainerOfAnyofSession> getOneofContainerOfAnyofAsync(
            final boolean isPrimitiveType,
            final boolean isAtEndpointLevel,
            final boolean hasDiscriminator) {
        return makeHttpCallAsync(() -> buildGetOneofContainerOfAnyofRequest(isPrimitiveType,
                isAtEndpointLevel, hasDiscriminator),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetOneofContainerOfAnyofResponse(context));
    }

    /**
     * Builds the HttpRequest object for getOneofContainerOfAnyof.
     */
    private HttpRequest buildGetOneofContainerOfAnyofRequest(
            final boolean isPrimitiveType,
            final boolean isAtEndpointLevel,
            final boolean hasDiscriminator) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/oneof/anyof/response/multiLevel");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("isPrimitiveType", isPrimitiveType);
        queryParameters.put("isAtEndpointLevel", isAtEndpointLevel);
        queryParameters.put("hasDiscriminator", hasDiscriminator);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);

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
     * Processes the response for getOneofContainerOfAnyof.
     * @return An object of type GetOneofContainerOfAnyofSession
     */
    private GetOneofContainerOfAnyofSession handleGetOneofContainerOfAnyofResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ApiException("", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetOneofContainerOfAnyofSession result = ApiHelper.deserialize(responseBody,
                GetOneofContainerOfAnyofSession.class);

        return result;
    }

}