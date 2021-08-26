/*
 * TesterXMLLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.xml.bind.JAXBException;
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
import localhost3000.models.BaseForDiscriminatorInElement;
import localhost3000.models.ServerResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DiscriminateUsingElement extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DiscriminateUsingElement(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * This endpoint returns a 'Discriminator in Element' model as xml.
     * @return    Returns the BaseForDiscriminatorInElement response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     * @throws    JAXBException    Signals that a JAXB exception occurred.
     */
    public BaseForDiscriminatorInElement generate() throws ApiException, IOException, JAXBException {
        HttpRequest request = buildGenerateRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGenerateResponse(context);
    }

    /**
     * This endpoint returns a 'Discriminator in Element' model as xml.
     * @return    Returns the BaseForDiscriminatorInElement response from the API call
     */
    public CompletableFuture<BaseForDiscriminatorInElement> generateAsync() {
        return makeHttpCallAsync(() -> buildGenerateRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGenerateResponse(context));
    }

    /**
     * Builds the HttpRequest object for generate.
     */
    private HttpRequest buildGenerateRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/discriminate-using-element");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/xml");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for generate.
     * @return An object of type BaseForDiscriminatorInElement
     */
    private BaseForDiscriminatorInElement handleGenerateResponse(
            HttpContext context) throws ApiException, IOException, JAXBException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BaseForDiscriminatorInElement result = ApiHelper.deserializeXml(responseBody,
                BaseForDiscriminatorInElement.class);

        return result;
    }

    /**
     * This endpoint expects a 'Discriminator in Element' model as xml.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     * @throws    JAXBException    Signals that a JAXB exception occurred.
     */
    public ServerResponse validate(
            final BaseForDiscriminatorInElement body) throws ApiException, IOException, JAXBException {
        HttpRequest request = buildValidateRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleValidateResponse(context);
    }

    /**
     * This endpoint expects a 'Discriminator in Element' model as xml.
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> validateAsync(
            final BaseForDiscriminatorInElement body) {
        return makeHttpCallAsync(() -> buildValidateRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleValidateResponse(context));
    }

    /**
     * Builds the HttpRequest object for validate.
     */
    private HttpRequest buildValidateRequest(
            final BaseForDiscriminatorInElement body) throws JsonProcessingException, JAXBException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/discriminate-using-element");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/xml");

        //prepare and invoke the API call request to fetch the response
        String bodyXml = ApiHelper.serializeXml(body, "discriminated", BaseForDiscriminatorInElement.class);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyXml);

        return request;
    }

    /**
     * Processes the response for validate.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleValidateResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ServerResponse result = ApiHelper.deserialize(responseBody,
                ServerResponse.class);

        return result;
    }

}