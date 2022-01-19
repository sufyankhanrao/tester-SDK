/*
 * OneOfNonScalarEndpointsModifiedLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
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
import localhost3000.http.client.HttpClient;
import localhost3000.http.client.HttpContext;
import localhost3000.http.request.HttpRequest;
import localhost3000.http.response.HttpResponse;
import localhost3000.http.response.HttpStringResponse;
import localhost3000.models.containers.SendOneofSimpleSession;
import localhost3000.models.containers.SendOneofSimpleSession1;

/**
 * This class lists all the endpoints of the groups.
 */
public final class Group1Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public Group1Controller(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * @param  isPrimitiveType  Required parameter: Example:
     * @param  isAtEndpointLevel  Required parameter: Example:
     * @param  hasDiscriminator  Required parameter: Example:
     * @param  session  Required parameter: Course session
     * @return    Returns the SendOneofSimpleSession1 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SendOneofSimpleSession1 sendOneofSimple(
            final boolean isPrimitiveType,
            final boolean isAtEndpointLevel,
            final boolean hasDiscriminator,
            final SendOneofSimpleSession session) throws ApiException, IOException {
        HttpRequest request = buildSendOneofSimpleRequest(isPrimitiveType, isAtEndpointLevel,
                hasDiscriminator, session);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendOneofSimpleResponse(context);
    }

    /**
     * @param  isPrimitiveType  Required parameter: Example:
     * @param  isAtEndpointLevel  Required parameter: Example:
     * @param  hasDiscriminator  Required parameter: Example:
     * @param  session  Required parameter: Course session
     * @return    Returns the SendOneofSimpleSession1 response from the API call
     */
    public CompletableFuture<SendOneofSimpleSession1> sendOneofSimpleAsync(
            final boolean isPrimitiveType,
            final boolean isAtEndpointLevel,
            final boolean hasDiscriminator,
            final SendOneofSimpleSession session) {
        return makeHttpCallAsync(() -> buildSendOneofSimpleRequest(isPrimitiveType,
                isAtEndpointLevel, hasDiscriminator, session),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendOneofSimpleResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendOneofSimple.
     */
    private HttpRequest buildSendOneofSimpleRequest(
            final boolean isPrimitiveType,
            final boolean isAtEndpointLevel,
            final boolean hasDiscriminator,
            final SendOneofSimpleSession session) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/oneof/body/simple");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("isPrimitiveType", isPrimitiveType);
        queryParameters.put("isAtEndpointLevel", isAtEndpointLevel);
        queryParameters.put("hasDiscriminator", hasDiscriminator);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(session);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        return request;
    }

    /**
     * Processes the response for sendOneofSimple.
     * @return An object of type SendOneofSimpleSession1
     */
    private SendOneofSimpleSession1 handleSendOneofSimpleResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if (responseCode == 400) {
            throw new ApiException("", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SendOneofSimpleSession1 result = ApiHelper.deserialize(responseBody,
                SendOneofSimpleSession1.class);

        return result;
    }

}