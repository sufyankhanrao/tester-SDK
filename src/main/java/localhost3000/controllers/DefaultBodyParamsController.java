/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost3000.ApiHelper;
import localhost3000.AuthManager;
import localhost3000.Configuration;
import localhost3000.DateTimeHelper;
import localhost3000.exceptions.ApiException;
import localhost3000.http.Headers;
import localhost3000.http.client.HttpCallback;
import localhost3000.http.client.HttpClient;
import localhost3000.http.client.HttpContext;
import localhost3000.http.request.HttpRequest;
import localhost3000.http.response.HttpResponse;
import localhost3000.http.response.HttpStringResponse;
import localhost3000.models.AdditionalModelParameters;
import localhost3000.models.AllOptionals;
import localhost3000.models.BooleanAsOptional;
import localhost3000.models.DateAsOptional;
import localhost3000.models.Days;
import localhost3000.models.DeleteBody;
import localhost3000.models.DynamicAsOptional;
import localhost3000.models.Employee;
import localhost3000.models.LongAsOptional;
import localhost3000.models.ModelWithOptionalRfc1123DateTime;
import localhost3000.models.ModelWithOptionalRfc3339DateTime;
import localhost3000.models.NumberAsOptional;
import localhost3000.models.Optionals;
import localhost3000.models.PrecisionAsOptional;
import localhost3000.models.SendRfc1123DateTime;
import localhost3000.models.SendRfc339DateTime;
import localhost3000.models.SendUnixDateTime;
import localhost3000.models.ServerResponse;
import localhost3000.models.StringAsOptional;
import localhost3000.models.SuiteCode;
import localhost3000.models.TestNstringEncoding;
import localhost3000.models.TestRNstringEncoding;
import localhost3000.models.TestRstringEncoding;
import localhost3000.models.UnixDateTime;
import localhost3000.models.UuidAsOptional;
import localhost3000.models.Validate;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultBodyParamsController extends BaseController implements BodyParamsController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultBodyParamsController(Configuration config, HttpClient httpClient,
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
    public DefaultBodyParamsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @param  textString  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeletePlainText(
            final String textString) throws ApiException, IOException {
        HttpRequest request = buildSendDeletePlainTextRequest(textString);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDeletePlainTextResponse(context);
    }

    /**
     * @param  textString  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeletePlainTextAsync(
            final String textString) {
        return makeHttpCallAsync(() -> buildSendDeletePlainTextRequest(textString),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDeletePlainTextResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDeletePlainText.
     */
    private HttpRequest buildSendDeletePlainTextRequest(
            final String textString) {
        //validating required parameters
        if (null == textString) {
            throw new NullPointerException("The parameter \"textString\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/deletePlainTextBody");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = textString;
        HttpRequest request = getClientInstance().deleteBody(queryBuilder, headers, null,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDeletePlainText.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDeletePlainTextResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteBody(
            final DeleteBody body) throws ApiException, IOException {
        HttpRequest request = buildSendDeleteBodyRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDeleteBodyResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteBodyAsync(
            final DeleteBody body) {
        return makeHttpCallAsync(() -> buildSendDeleteBodyRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDeleteBodyResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDeleteBody.
     */
    private HttpRequest buildSendDeleteBodyRequest(
            final DeleteBody body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/deleteBody");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for sendDeleteBody.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDeleteBodyResponse(
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
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDateArray(
            final List<LocalDate> dates) throws ApiException, IOException {
        HttpRequest request = buildSendDateArrayRequest(dates);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDateArrayResponse(context);
    }

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDateArrayAsync(
            final List<LocalDate> dates) {
        return makeHttpCallAsync(() -> buildSendDateArrayRequest(dates),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDateArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDateArray.
     */
    private HttpRequest buildSendDateArrayRequest(
            final List<LocalDate> dates) throws JsonProcessingException {
        //validating required parameters
        if (null == dates) {
            throw new NullPointerException("The parameter \"dates\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/date");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = 
                ApiHelper.serialize(dates, new DateTimeHelper.SimpleDateSerializer());
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDateArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDateArrayResponse(
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
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDate(
            final LocalDate date) throws ApiException, IOException {
        HttpRequest request = buildSendDateRequest(date);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDateResponse(context);
    }

    /**
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDateAsync(
            final LocalDate date) {
        return makeHttpCallAsync(() -> buildSendDateRequest(date),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDateResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDate.
     */
    private HttpRequest buildSendDateRequest(
            final LocalDate date) {
        //validating required parameters
        if (null == date) {
            throw new NullPointerException("The parameter \"date\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/date");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = DateTimeHelper.toSimpleDate(date);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDate.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDateResponse(
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
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendUnixDateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        HttpRequest request = buildSendUnixDateTimeRequest(datetime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendUnixDateTimeResponse(context);
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendUnixDateTimeAsync(
            final LocalDateTime datetime) {
        return makeHttpCallAsync(() -> buildSendUnixDateTimeRequest(datetime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendUnixDateTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendUnixDateTime.
     */
    private HttpRequest buildSendUnixDateTimeRequest(
            final LocalDateTime datetime) {
        //validating required parameters
        if (null == datetime) {
            throw new NullPointerException("The parameter \"datetime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/unixdatetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = DateTimeHelper.toUnixTimestamp(datetime);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendUnixDateTime.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendUnixDateTimeResponse(
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
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc1123DateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        HttpRequest request = buildSendRfc1123DateTimeRequest(datetime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendRfc1123DateTimeResponse(context);
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc1123DateTimeAsync(
            final LocalDateTime datetime) {
        return makeHttpCallAsync(() -> buildSendRfc1123DateTimeRequest(datetime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendRfc1123DateTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendRfc1123DateTime.
     */
    private HttpRequest buildSendRfc1123DateTimeRequest(
            final LocalDateTime datetime) {
        //validating required parameters
        if (null == datetime) {
            throw new NullPointerException("The parameter \"datetime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/rfc1123datetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = DateTimeHelper.toRfc1123DateTime(datetime);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendRfc1123DateTime.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendRfc1123DateTimeResponse(
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
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc3339DateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        HttpRequest request = buildSendRfc3339DateTimeRequest(datetime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendRfc3339DateTimeResponse(context);
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc3339DateTimeAsync(
            final LocalDateTime datetime) {
        return makeHttpCallAsync(() -> buildSendRfc3339DateTimeRequest(datetime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendRfc3339DateTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendRfc3339DateTime.
     */
    private HttpRequest buildSendRfc3339DateTimeRequest(
            final LocalDateTime datetime) {
        //validating required parameters
        if (null == datetime) {
            throw new NullPointerException("The parameter \"datetime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/rfc3339datetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = DateTimeHelper.toRfc8601DateTime(datetime);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendRfc3339DateTime.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendRfc3339DateTimeResponse(
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
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendUnixDateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        HttpRequest request = buildSendUnixDateTimeArrayRequest(datetimes);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendUnixDateTimeArrayResponse(context);
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendUnixDateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        return makeHttpCallAsync(() -> buildSendUnixDateTimeArrayRequest(datetimes),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendUnixDateTimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendUnixDateTimeArray.
     */
    private HttpRequest buildSendUnixDateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws JsonProcessingException {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/unixdatetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = 
                ApiHelper.serialize(datetimes, new DateTimeHelper.UnixTimestampSerializer());
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendUnixDateTimeArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendUnixDateTimeArrayResponse(
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
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc1123DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        HttpRequest request = buildSendRfc1123DateTimeArrayRequest(datetimes);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendRfc1123DateTimeArrayResponse(context);
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc1123DateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        return makeHttpCallAsync(() -> buildSendRfc1123DateTimeArrayRequest(datetimes),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendRfc1123DateTimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendRfc1123DateTimeArray.
     */
    private HttpRequest buildSendRfc1123DateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws JsonProcessingException {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/rfc1123datetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = 
                ApiHelper.serialize(datetimes, new DateTimeHelper.Rfc1123DateTimeSerializer());
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendRfc1123DateTimeArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendRfc1123DateTimeArrayResponse(
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
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc3339DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        HttpRequest request = buildSendRfc3339DateTimeArrayRequest(datetimes);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendRfc3339DateTimeArrayResponse(context);
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc3339DateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        return makeHttpCallAsync(() -> buildSendRfc3339DateTimeArrayRequest(datetimes),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendRfc3339DateTimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendRfc3339DateTimeArray.
     */
    private HttpRequest buildSendRfc3339DateTimeArrayRequest(
            final List<LocalDateTime> datetimes) throws JsonProcessingException {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/rfc3339datetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = 
                ApiHelper.serialize(datetimes, new DateTimeHelper.Rfc8601DateTimeSerializer());
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendRfc3339DateTimeArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendRfc3339DateTimeArrayResponse(
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
     * sends a string body param.
     * @param  sarray  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringArray(
            final List<String> sarray) throws ApiException, IOException {
        HttpRequest request = buildSendStringArrayRequest(sarray);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringArrayResponse(context);
    }

    /**
     * sends a string body param.
     * @param  sarray  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringArrayAsync(
            final List<String> sarray) {
        return makeHttpCallAsync(() -> buildSendStringArrayRequest(sarray),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringArray.
     */
    private HttpRequest buildSendStringArrayRequest(
            final List<String> sarray) throws JsonProcessingException {
        //validating required parameters
        if (null == sarray) {
            throw new NullPointerException("The parameter \"sarray\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/string");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(sarray);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendStringArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringArrayResponse(
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
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateString(
            final String value) throws ApiException, IOException {
        HttpRequest request = buildUpdateStringRequest(value);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateStringResponse(context);
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateStringAsync(
            final String value) {
        return makeHttpCallAsync(() -> buildUpdateStringRequest(value),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateStringResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateString.
     */
    private HttpRequest buildUpdateStringRequest(
            final String value) {
        //validating required parameters
        if (null == value) {
            throw new NullPointerException("The parameter \"value\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/updateString");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = value;
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateString.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateStringResponse(
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
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIntegerArray(
            final List<Integer> integers) throws ApiException, IOException {
        HttpRequest request = buildSendIntegerArrayRequest(integers);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendIntegerArrayResponse(context);
    }

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIntegerArrayAsync(
            final List<Integer> integers) {
        return makeHttpCallAsync(() -> buildSendIntegerArrayRequest(integers),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendIntegerArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendIntegerArray.
     */
    private HttpRequest buildSendIntegerArrayRequest(
            final List<Integer> integers) throws JsonProcessingException {
        //validating required parameters
        if (null == integers) {
            throw new NullPointerException("The parameter \"integers\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/number");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(integers);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendIntegerArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendIntegerArrayResponse(
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
     * @param  field  Required parameter: Example:
     * @param  name  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse wrapBodyInObject(
            final String field,
            final String name) throws ApiException, IOException {
        HttpRequest request = buildWrapBodyInObjectRequest(field, name);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleWrapBodyInObjectResponse(context);
    }

    /**
     * @param  field  Required parameter: Example:
     * @param  name  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> wrapBodyInObjectAsync(
            final String field,
            final String name) {
        return makeHttpCallAsync(() -> buildWrapBodyInObjectRequest(field, name),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleWrapBodyInObjectResponse(context));
    }

    /**
     * Builds the HttpRequest object for wrapBodyInObject.
     */
    private HttpRequest buildWrapBodyInObjectRequest(
            final String field,
            final String name) throws JsonProcessingException {
        //validating required parameters
        if (null == field) {
            throw new NullPointerException("The parameter \"field\" is a required parameter and cannot be null.");
        }

        if (null == name) {
            throw new NullPointerException("The parameter \"name\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/wrapParamInObject");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //load all body parameters for the outgoing API request
        Map<String, String> bodyParameters = new HashMap<>();
        bodyParameters.put("field", field);
        bodyParameters.put("name", name);
        //remove null values from the map
        ApiHelper.removeNullValues(bodyParameters);

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(bodyParameters);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for wrapBodyInObject.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleWrapBodyInObjectResponse(
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
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse additionalModelParameters(
            final AdditionalModelParameters model) throws ApiException, IOException {
        HttpRequest request = buildAdditionalModelParametersRequest(model);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAdditionalModelParametersResponse(context);
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> additionalModelParametersAsync(
            final AdditionalModelParameters model) {
        return makeHttpCallAsync(() -> buildAdditionalModelParametersRequest(model),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleAdditionalModelParametersResponse(context));
    }

    /**
     * Builds the HttpRequest object for additionalModelParameters.
     */
    private HttpRequest buildAdditionalModelParametersRequest(
            final AdditionalModelParameters model) throws JsonProcessingException {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/additionalModelProperties");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(model);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for additionalModelParameters.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleAdditionalModelParametersResponse(
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
     * @param  model  Required parameter: Example:
     * @param  option  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse validateRequiredParameter(
            final Validate model,
            final String option) throws ApiException, IOException {
        HttpRequest request = buildValidateRequiredParameterRequest(model, option);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleValidateRequiredParameterResponse(context);
    }

    /**
     * @param  model  Required parameter: Example:
     * @param  option  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> validateRequiredParameterAsync(
            final Validate model,
            final String option) {
        return makeHttpCallAsync(() -> buildValidateRequiredParameterRequest(model, option),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleValidateRequiredParameterResponse(context));
    }

    /**
     * Builds the HttpRequest object for validateRequiredParameter.
     */
    private HttpRequest buildValidateRequiredParameterRequest(
            final Validate model,
            final String option) throws JsonProcessingException {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/validateRequiredParam");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("option", option);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(model);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for validateRequiredParameter.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleValidateRequiredParameterResponse(
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
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse additionalModelParameters1(
            final AdditionalModelParameters model) throws ApiException, IOException {
        HttpRequest request = buildAdditionalModelParameters1Request(model);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAdditionalModelParameters1Response(context);
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> additionalModelParameters1Async(
            final AdditionalModelParameters model) {
        return makeHttpCallAsync(() -> buildAdditionalModelParameters1Request(model),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleAdditionalModelParameters1Response(context));
    }

    /**
     * Builds the HttpRequest object for additionalModelParameters1.
     */
    private HttpRequest buildAdditionalModelParameters1Request(
            final AdditionalModelParameters model) throws JsonProcessingException {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/additionalModelProperties");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(model);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for additionalModelParameters1.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleAdditionalModelParameters1Response(
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
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendModel(
            final Employee model) throws ApiException, IOException {
        HttpRequest request = buildSendModelRequest(model);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendModelResponse(context);
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendModelAsync(
            final Employee model) {
        return makeHttpCallAsync(() -> buildSendModelRequest(model),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendModel.
     */
    private HttpRequest buildSendModelRequest(
            final Employee model) throws JsonProcessingException {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/model");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(model);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendModel.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendModelResponse(
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
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendModelArray(
            final List<Employee> models) throws ApiException, IOException {
        HttpRequest request = buildSendModelArrayRequest(models);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendModelArrayResponse(context);
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendModelArrayAsync(
            final List<Employee> models) {
        return makeHttpCallAsync(() -> buildSendModelArrayRequest(models),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendModelArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendModelArray.
     */
    private HttpRequest buildSendModelArrayRequest(
            final List<Employee> models) throws JsonProcessingException {
        //validating required parameters
        if (null == models) {
            throw new NullPointerException("The parameter \"models\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/model");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(models);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendModelArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendModelArrayResponse(
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
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendModelMap(
            final Map<String, Employee> models) throws ApiException, IOException {
        HttpRequest request = buildSendModelMapRequest(models);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendModelMapResponse(context);
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendModelMapAsync(
            final Map<String, Employee> models) {
        return makeHttpCallAsync(() -> buildSendModelMapRequest(models),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendModelMapResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendModelMap.
     */
    private HttpRequest buildSendModelMapRequest(
            final Map<String, Employee> models) throws JsonProcessingException {
        //validating required parameters
        if (null == models) {
            throw new NullPointerException("The parameter \"models\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/model");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("map", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(models);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendModelMap.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendModelMapResponse(
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
     * @param  dynamic  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDynamic(
            final Object dynamic) throws ApiException, IOException {
        HttpRequest request = buildSendDynamicRequest(dynamic);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDynamicResponse(context);
    }

    /**
     * @param  dynamic  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDynamicAsync(
            final Object dynamic) {
        return makeHttpCallAsync(() -> buildSendDynamicRequest(dynamic),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDynamicResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDynamic.
     */
    private HttpRequest buildSendDynamicRequest(
            final Object dynamic) throws JsonProcessingException {
        //validating required parameters
        if (null == dynamic) {
            throw new NullPointerException("The parameter \"dynamic\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/dynamic");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(dynamic);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDynamic.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDynamicResponse(
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
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendString(
            final String value) throws ApiException, IOException {
        HttpRequest request = buildSendStringRequest(value);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringResponse(context);
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringAsync(
            final String value) {
        return makeHttpCallAsync(() -> buildSendStringRequest(value),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendString.
     */
    private HttpRequest buildSendStringRequest(
            final String value) {
        //validating required parameters
        if (null == value) {
            throw new NullPointerException("The parameter \"value\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/string");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = value;
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendString.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringResponse(
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
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringEnumArray(
            final List<Days> days) throws ApiException, IOException {
        HttpRequest request = buildSendStringEnumArrayRequest(days);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringEnumArrayResponse(context);
    }

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringEnumArrayAsync(
            final List<Days> days) {
        return makeHttpCallAsync(() -> buildSendStringEnumArrayRequest(days),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringEnumArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringEnumArray.
     */
    private HttpRequest buildSendStringEnumArrayRequest(
            final List<Days> days) throws JsonProcessingException {
        //validating required parameters
        if (null == days) {
            throw new NullPointerException("The parameter \"days\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/stringenum");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(days);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendStringEnumArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringEnumArrayResponse(
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
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIntegerEnumArray(
            final List<SuiteCode> suites) throws ApiException, IOException {
        HttpRequest request = buildSendIntegerEnumArrayRequest(suites);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendIntegerEnumArrayResponse(context);
    }

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIntegerEnumArrayAsync(
            final List<SuiteCode> suites) {
        return makeHttpCallAsync(() -> buildSendIntegerEnumArrayRequest(suites),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendIntegerEnumArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendIntegerEnumArray.
     */
    private HttpRequest buildSendIntegerEnumArrayRequest(
            final List<SuiteCode> suites) throws JsonProcessingException {
        //validating required parameters
        if (null == suites) {
            throw new NullPointerException("The parameter \"suites\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/integerenum");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(suites);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendIntegerEnumArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendIntegerEnumArrayResponse(
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
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateModel(
            final Employee model) throws ApiException, IOException {
        HttpRequest request = buildUpdateModelRequest(model);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateModelResponse(context);
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateModelAsync(
            final Employee model) {
        return makeHttpCallAsync(() -> buildUpdateModelRequest(model),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateModel.
     */
    private HttpRequest buildUpdateModelRequest(
            final Employee model) throws JsonProcessingException {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/updateModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(model);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateModel.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateModelResponse(
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
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteBodyWithModel(
            final Employee model) throws ApiException, IOException {
        HttpRequest request = buildSendDeleteBodyWithModelRequest(model);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDeleteBodyWithModelResponse(context);
    }

    /**
     * @param  model  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteBodyWithModelAsync(
            final Employee model) {
        return makeHttpCallAsync(() -> buildSendDeleteBodyWithModelRequest(model),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDeleteBodyWithModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDeleteBodyWithModel.
     */
    private HttpRequest buildSendDeleteBodyWithModelRequest(
            final Employee model) throws JsonProcessingException {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/deleteBody1");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(model);
        HttpRequest request = getClientInstance().deleteBody(queryBuilder, headers, null,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDeleteBodyWithModel.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDeleteBodyWithModelResponse(
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
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteBodyWithModelArray(
            final List<Employee> models) throws ApiException, IOException {
        HttpRequest request = buildSendDeleteBodyWithModelArrayRequest(models);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDeleteBodyWithModelArrayResponse(context);
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteBodyWithModelArrayAsync(
            final List<Employee> models) {
        return makeHttpCallAsync(() -> buildSendDeleteBodyWithModelArrayRequest(models),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDeleteBodyWithModelArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDeleteBodyWithModelArray.
     */
    private HttpRequest buildSendDeleteBodyWithModelArrayRequest(
            final List<Employee> models) throws JsonProcessingException {
        //validating required parameters
        if (null == models) {
            throw new NullPointerException("The parameter \"models\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/deleteBody1");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(models);
        HttpRequest request = getClientInstance().deleteBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDeleteBodyWithModelArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDeleteBodyWithModelArrayResponse(
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
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateModelArray(
            final List<Employee> models) throws ApiException, IOException {
        HttpRequest request = buildUpdateModelArrayRequest(models);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateModelArrayResponse(context);
    }

    /**
     * @param  models  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateModelArrayAsync(
            final List<Employee> models) {
        return makeHttpCallAsync(() -> buildUpdateModelArrayRequest(models),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateModelArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateModelArray.
     */
    private HttpRequest buildUpdateModelArrayRequest(
            final List<Employee> models) throws JsonProcessingException {
        //validating required parameters
        if (null == models) {
            throw new NullPointerException("The parameter \"models\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/updateModel");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(models);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateModelArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateModelArrayResponse(
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
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateString1(
            final String value) throws ApiException, IOException {
        HttpRequest request = buildUpdateString1Request(value);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateString1Response(context);
    }

    /**
     * @param  value  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateString1Async(
            final String value) {
        return makeHttpCallAsync(() -> buildUpdateString1Request(value),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateString1Response(context));
    }

    /**
     * Builds the HttpRequest object for updateString1.
     */
    private HttpRequest buildUpdateString1Request(
            final String value) {
        //validating required parameters
        if (null == value) {
            throw new NullPointerException("The parameter \"value\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/updateString");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = value;
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateString1.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateString1Response(
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
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateStringArray(
            final List<String> strings) throws ApiException, IOException {
        HttpRequest request = buildUpdateStringArrayRequest(strings);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateStringArrayResponse(context);
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateStringArrayAsync(
            final List<String> strings) {
        return makeHttpCallAsync(() -> buildUpdateStringArrayRequest(strings),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateStringArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateStringArray.
     */
    private HttpRequest buildUpdateStringArrayRequest(
            final List<String> strings) throws JsonProcessingException {
        //validating required parameters
        if (null == strings) {
            throw new NullPointerException("The parameter \"strings\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/updateString");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(strings);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateStringArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateStringArrayResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringWithNewLine(
            final TestNstringEncoding body) throws ApiException, IOException {
        HttpRequest request = buildSendStringWithNewLineRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringWithNewLineResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringWithNewLineAsync(
            final TestNstringEncoding body) {
        return makeHttpCallAsync(() -> buildSendStringWithNewLineRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringWithNewLineResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringWithNewLine.
     */
    private HttpRequest buildSendStringWithNewLineRequest(
            final TestNstringEncoding body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/stringEncoding");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for sendStringWithNewLine.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringWithNewLineResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringWithR(
            final TestRstringEncoding body) throws ApiException, IOException {
        HttpRequest request = buildSendStringWithRRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringWithRResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringWithRAsync(
            final TestRstringEncoding body) {
        return makeHttpCallAsync(() -> buildSendStringWithRRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringWithRResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringWithR.
     */
    private HttpRequest buildSendStringWithRRequest(
            final TestRstringEncoding body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/stringEncoding");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for sendStringWithR.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringWithRResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringInBodyWithRN(
            final TestRNstringEncoding body) throws ApiException, IOException {
        HttpRequest request = buildSendStringInBodyWithRNRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringInBodyWithRNResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringInBodyWithRNAsync(
            final TestRNstringEncoding body) {
        return makeHttpCallAsync(() -> buildSendStringInBodyWithRNRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringInBodyWithRNResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringInBodyWithRN.
     */
    private HttpRequest buildSendStringInBodyWithRNRequest(
            final TestRNstringEncoding body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/stringEncoding");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for sendStringInBodyWithRN.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringInBodyWithRNResponse(
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
     * @param  dateTime  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalUnixDateTimeInBody(
            final LocalDateTime dateTime) throws ApiException, IOException {
        HttpRequest request = buildSendOptionalUnixDateTimeInBodyRequest(dateTime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendOptionalUnixDateTimeInBodyResponse(context);
    }

    /**
     * @param  dateTime  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalUnixDateTimeInBodyAsync(
            final LocalDateTime dateTime) {
        return makeHttpCallAsync(() -> buildSendOptionalUnixDateTimeInBodyRequest(dateTime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendOptionalUnixDateTimeInBodyResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendOptionalUnixDateTimeInBody.
     */
    private HttpRequest buildSendOptionalUnixDateTimeInBodyRequest(
            final LocalDateTime dateTime) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalUnixTimeStamp");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = DateTimeHelper.toUnixTimestamp(dateTime);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendOptionalUnixDateTimeInBody.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendOptionalUnixDateTimeInBodyResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalRfc1123InBody(
            final LocalDateTime body) throws ApiException, IOException {
        HttpRequest request = buildSendOptionalRfc1123InBodyRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendOptionalRfc1123InBodyResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalRfc1123InBodyAsync(
            final LocalDateTime body) {
        return makeHttpCallAsync(() -> buildSendOptionalRfc1123InBodyRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendOptionalRfc1123InBodyResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendOptionalRfc1123InBody.
     */
    private HttpRequest buildSendOptionalRfc1123InBodyRequest(
            final LocalDateTime body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionlRfc1123");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = DateTimeHelper.toRfc1123DateTime(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendOptionalRfc1123InBody.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendOptionalRfc1123InBodyResponse(
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
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDatetimeOptionalInEndpoint(
            final LocalDateTime body) throws ApiException, IOException {
        HttpRequest request = buildSendDatetimeOptionalInEndpointRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDatetimeOptionalInEndpointResponse(context);
    }

    /**
     * @param  body  Optional parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDatetimeOptionalInEndpointAsync(
            final LocalDateTime body) {
        return makeHttpCallAsync(() -> buildSendDatetimeOptionalInEndpointRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDatetimeOptionalInEndpointResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDatetimeOptionalInEndpoint.
     */
    private HttpRequest buildSendDatetimeOptionalInEndpointRequest(
            final LocalDateTime body) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalDateTime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        headers.add("content-type", "text/plain; charset=utf-8");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = DateTimeHelper.toRfc8601DateTime(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDatetimeOptionalInEndpoint.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDatetimeOptionalInEndpointResponse(
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
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalUnixTimeStampInModelBody(
            final UnixDateTime dateTime) throws ApiException, IOException {
        HttpRequest request = buildSendOptionalUnixTimeStampInModelBodyRequest(dateTime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendOptionalUnixTimeStampInModelBodyResponse(context);
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInModelBodyAsync(
            final UnixDateTime dateTime) {
        return makeHttpCallAsync(() -> buildSendOptionalUnixTimeStampInModelBodyRequest(dateTime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendOptionalUnixTimeStampInModelBodyResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendOptionalUnixTimeStampInModelBody.
     */
    private HttpRequest buildSendOptionalUnixTimeStampInModelBodyRequest(
            final UnixDateTime dateTime) throws JsonProcessingException {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalUnixDateTimeInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(dateTime);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendOptionalUnixTimeStampInModelBody.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendOptionalUnixTimeStampInModelBodyResponse(
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
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalUnixTimeStampInNestedModelBody(
            final SendUnixDateTime dateTime) throws ApiException, IOException {
        HttpRequest request = buildSendOptionalUnixTimeStampInNestedModelBodyRequest(dateTime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendOptionalUnixTimeStampInNestedModelBodyResponse(context);
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalUnixTimeStampInNestedModelBodyAsync(
            final SendUnixDateTime dateTime) {
        return makeHttpCallAsync(() -> buildSendOptionalUnixTimeStampInNestedModelBodyRequest(
                dateTime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendOptionalUnixTimeStampInNestedModelBodyResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendOptionalUnixTimeStampInNestedModelBody.
     */
    private HttpRequest buildSendOptionalUnixTimeStampInNestedModelBodyRequest(
            final SendUnixDateTime dateTime) throws JsonProcessingException {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalUnixTimeStampInNestedModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(dateTime);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendOptionalUnixTimeStampInNestedModelBody.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendOptionalUnixTimeStampInNestedModelBodyResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc1123DateTimeInNestedModel(
            final SendRfc1123DateTime body) throws ApiException, IOException {
        HttpRequest request = buildSendRfc1123DateTimeInNestedModelRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendRfc1123DateTimeInNestedModelResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc1123DateTimeInNestedModelAsync(
            final SendRfc1123DateTime body) {
        return makeHttpCallAsync(() -> buildSendRfc1123DateTimeInNestedModelRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendRfc1123DateTimeInNestedModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendRfc1123DateTimeInNestedModel.
     */
    private HttpRequest buildSendRfc1123DateTimeInNestedModelRequest(
            final SendRfc1123DateTime body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/rfc1123InNestedModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for sendRfc1123DateTimeInNestedModel.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendRfc1123DateTimeInNestedModelResponse(
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
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc1123DateTimeInModel(
            final ModelWithOptionalRfc1123DateTime dateTime) throws ApiException, IOException {
        HttpRequest request = buildSendRfc1123DateTimeInModelRequest(dateTime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendRfc1123DateTimeInModelResponse(context);
    }

    /**
     * @param  dateTime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc1123DateTimeInModelAsync(
            final ModelWithOptionalRfc1123DateTime dateTime) {
        return makeHttpCallAsync(() -> buildSendRfc1123DateTimeInModelRequest(dateTime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendRfc1123DateTimeInModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendRfc1123DateTimeInModel.
     */
    private HttpRequest buildSendRfc1123DateTimeInModelRequest(
            final ModelWithOptionalRfc1123DateTime dateTime) throws JsonProcessingException {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/OptionalRfc1123InModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(dateTime);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendRfc1123DateTimeInModel.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendRfc1123DateTimeInModelResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendOptionalDatetimeInModel(
            final ModelWithOptionalRfc3339DateTime body) throws ApiException, IOException {
        HttpRequest request = buildSendOptionalDatetimeInModelRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendOptionalDatetimeInModelResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendOptionalDatetimeInModelAsync(
            final ModelWithOptionalRfc3339DateTime body) {
        return makeHttpCallAsync(() -> buildSendOptionalDatetimeInModelRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendOptionalDatetimeInModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendOptionalDatetimeInModel.
     */
    private HttpRequest buildSendOptionalDatetimeInModelRequest(
            final ModelWithOptionalRfc3339DateTime body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalDateTimeInBody");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for sendOptionalDatetimeInModel.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendOptionalDatetimeInModelResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendRfc339DateTimeInNestedModels(
            final SendRfc339DateTime body) throws ApiException, IOException {
        HttpRequest request = buildSendRfc339DateTimeInNestedModelsRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendRfc339DateTimeInNestedModelsResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendRfc339DateTimeInNestedModelsAsync(
            final SendRfc339DateTime body) {
        return makeHttpCallAsync(() -> buildSendRfc339DateTimeInNestedModelsRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendRfc339DateTimeInNestedModelsResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendRfc339DateTimeInNestedModels.
     */
    private HttpRequest buildSendRfc339DateTimeInNestedModelsRequest(
            final SendRfc339DateTime body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/dateTimeInNestedModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for sendRfc339DateTimeInNestedModels.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendRfc339DateTimeInNestedModelsResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse uuidAsOptional(
            final UuidAsOptional body) throws ApiException, IOException {
        HttpRequest request = buildUuidAsOptionalRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUuidAsOptionalResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> uuidAsOptionalAsync(
            final UuidAsOptional body) {
        return makeHttpCallAsync(() -> buildUuidAsOptionalRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUuidAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for uuidAsOptional.
     */
    private HttpRequest buildUuidAsOptionalRequest(
            final UuidAsOptional body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalUUIDInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for uuidAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUuidAsOptionalResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse booleanAsOptional(
            final BooleanAsOptional body) throws ApiException, IOException {
        HttpRequest request = buildBooleanAsOptionalRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleBooleanAsOptionalResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> booleanAsOptionalAsync(
            final BooleanAsOptional body) {
        return makeHttpCallAsync(() -> buildBooleanAsOptionalRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleBooleanAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for booleanAsOptional.
     */
    private HttpRequest buildBooleanAsOptionalRequest(
            final BooleanAsOptional body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalBooleanInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for booleanAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleBooleanAsOptionalResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse dateAsOptional(
            final DateAsOptional body) throws ApiException, IOException {
        HttpRequest request = buildDateAsOptionalRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDateAsOptionalResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> dateAsOptionalAsync(
            final DateAsOptional body) {
        return makeHttpCallAsync(() -> buildDateAsOptionalRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDateAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for dateAsOptional.
     */
    private HttpRequest buildDateAsOptionalRequest(
            final DateAsOptional body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalDateInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for dateAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleDateAsOptionalResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse dynamicAsOptional(
            final DynamicAsOptional body) throws ApiException, IOException {
        HttpRequest request = buildDynamicAsOptionalRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDynamicAsOptionalResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> dynamicAsOptionalAsync(
            final DynamicAsOptional body) {
        return makeHttpCallAsync(() -> buildDynamicAsOptionalRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDynamicAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for dynamicAsOptional.
     */
    private HttpRequest buildDynamicAsOptionalRequest(
            final DynamicAsOptional body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalDynamicInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for dynamicAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleDynamicAsOptionalResponse(
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
     * @param  body  Required parameter: Example:
     * @param  option  Optional parameter: Example: empty
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse allOptionals(
            final AllOptionals body,
            final Optionals option) throws ApiException, IOException {
        HttpRequest request = buildAllOptionalsRequest(body, option);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAllOptionalsResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @param  option  Optional parameter: Example: empty
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> allOptionalsAsync(
            final AllOptionals body,
            final Optionals option) {
        return makeHttpCallAsync(() -> buildAllOptionalsRequest(body, option),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleAllOptionalsResponse(context));
    }

    /**
     * Builds the HttpRequest object for allOptionals.
     */
    private HttpRequest buildAllOptionalsRequest(
            final AllOptionals body,
            final Optionals option) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/alloptionals");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("option",
                (option != null) ? option.value() : "empty");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, queryParameters,
                bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for allOptionals.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleAllOptionalsResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse stringAsOptional(
            final StringAsOptional body) throws ApiException, IOException {
        HttpRequest request = buildStringAsOptionalRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleStringAsOptionalResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> stringAsOptionalAsync(
            final StringAsOptional body) {
        return makeHttpCallAsync(() -> buildStringAsOptionalRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleStringAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for stringAsOptional.
     */
    private HttpRequest buildStringAsOptionalRequest(
            final StringAsOptional body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalStringInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for stringAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleStringAsOptionalResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse precisionAsOptional(
            final PrecisionAsOptional body) throws ApiException, IOException {
        HttpRequest request = buildPrecisionAsOptionalRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handlePrecisionAsOptionalResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> precisionAsOptionalAsync(
            final PrecisionAsOptional body) {
        return makeHttpCallAsync(() -> buildPrecisionAsOptionalRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handlePrecisionAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for precisionAsOptional.
     */
    private HttpRequest buildPrecisionAsOptionalRequest(
            final PrecisionAsOptional body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalPrecisionInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for precisionAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handlePrecisionAsOptionalResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse longAsOptional(
            final LongAsOptional body) throws ApiException, IOException {
        HttpRequest request = buildLongAsOptionalRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleLongAsOptionalResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> longAsOptionalAsync(
            final LongAsOptional body) {
        return makeHttpCallAsync(() -> buildLongAsOptionalRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleLongAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for longAsOptional.
     */
    private HttpRequest buildLongAsOptionalRequest(
            final LongAsOptional body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalLongInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for longAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleLongAsOptionalResponse(
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
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendNumberAsOptional(
            final NumberAsOptional body) throws ApiException, IOException {
        HttpRequest request = buildSendNumberAsOptionalRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendNumberAsOptionalResponse(context);
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
            final NumberAsOptional body) {
        return makeHttpCallAsync(() -> buildSendNumberAsOptionalRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendNumberAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendNumberAsOptional.
     */
    private HttpRequest buildSendNumberAsOptionalRequest(
            final NumberAsOptional body) throws JsonProcessingException {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/body/optionalNumberInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
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
     * Processes the response for sendNumberAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendNumberAsOptionalResponse(
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