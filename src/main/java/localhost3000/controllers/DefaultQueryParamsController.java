/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
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
import localhost3000.models.ServerResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultQueryParamsController extends BaseController implements QueryParamsController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultQueryParamsController(Configuration config, HttpClient httpClient,
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
    public DefaultQueryParamsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @param  number  Required parameter: <testing> <testing>
     * @param  number1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendNumberAsOptional(
            final int number,
            final Integer number1) throws ApiException, IOException {
        HttpRequest request = buildSendNumberAsOptionalRequest(number, number1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendNumberAsOptionalResponse(context);
    }

    /**
     * @param  number  Required parameter: <testing> <testing>
     * @param  number1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
            final int number,
            final Integer number1) {
        return makeHttpCallAsync(() -> buildSendNumberAsOptionalRequest(number, number1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendNumberAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendNumberAsOptional.
     */
    private HttpRequest buildSendNumberAsOptionalRequest(
            final int number,
            final Integer number1) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/numberAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("number", number);
        queryParameters.put("number1", number1);

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

    /**
     * @param  mLong  Required parameter: <testing> <testing>
     * @param  long1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendLongAsOptional(
            final long mLong,
            final Long long1) throws ApiException, IOException {
        HttpRequest request = buildSendLongAsOptionalRequest(mLong, long1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendLongAsOptionalResponse(context);
    }

    /**
     * @param  mLong  Required parameter: <testing> <testing>
     * @param  long1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendLongAsOptionalAsync(
            final long mLong,
            final Long long1) {
        return makeHttpCallAsync(() -> buildSendLongAsOptionalRequest(mLong, long1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendLongAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendLongAsOptional.
     */
    private HttpRequest buildSendLongAsOptionalRequest(
            final long mLong,
            final Long long1) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/longAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("long", mLong);
        queryParameters.put("long1", long1);

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
     * Processes the response for sendLongAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendLongAsOptionalResponse(
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
     * @param  precision  Required parameter: <testing> <testing>
     * @param  precision1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse precisionAsOptional(
            final double precision,
            final Double precision1) throws ApiException, IOException {
        HttpRequest request = buildPrecisionAsOptionalRequest(precision, precision1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handlePrecisionAsOptionalResponse(context);
    }

    /**
     * @param  precision  Required parameter: <testing> <testing>
     * @param  precision1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> precisionAsOptionalAsync(
            final double precision,
            final Double precision1) {
        return makeHttpCallAsync(() -> buildPrecisionAsOptionalRequest(precision, precision1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handlePrecisionAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for precisionAsOptional.
     */
    private HttpRequest buildPrecisionAsOptionalRequest(
            final double precision,
            final Double precision1) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/precisionAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("precision", precision);
        queryParameters.put("precision1", precision1);

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
     * @param  mBoolean  Required parameter: <testing> <testing>
     * @param  boolean1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse booleanAsOptional(
            final boolean mBoolean,
            final Boolean boolean1) throws ApiException, IOException {
        HttpRequest request = buildBooleanAsOptionalRequest(mBoolean, boolean1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleBooleanAsOptionalResponse(context);
    }

    /**
     * @param  mBoolean  Required parameter: <testing> <testing>
     * @param  boolean1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> booleanAsOptionalAsync(
            final boolean mBoolean,
            final Boolean boolean1) {
        return makeHttpCallAsync(() -> buildBooleanAsOptionalRequest(mBoolean, boolean1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleBooleanAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for booleanAsOptional.
     */
    private HttpRequest buildBooleanAsOptionalRequest(
            final boolean mBoolean,
            final Boolean boolean1) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/booleanAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("boolean", mBoolean);
        queryParameters.put("boolean1", boolean1);

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
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse rfc1123DatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException {
        HttpRequest request = buildRfc1123DatetimeAsOptionalRequest(dateTime, dateTime1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRfc1123DatetimeAsOptionalResponse(context);
    }

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc1123DatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        return makeHttpCallAsync(() -> buildRfc1123DatetimeAsOptionalRequest(dateTime, dateTime1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRfc1123DatetimeAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for rfc1123DatetimeAsOptional.
     */
    private HttpRequest buildRfc1123DatetimeAsOptionalRequest(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/rfc1123dateTimeAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("dateTime", DateTimeHelper.toRfc1123DateTime(dateTime));
        queryParameters.put("dateTime1", DateTimeHelper.toRfc1123DateTime(dateTime1));

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
     * Processes the response for rfc1123DatetimeAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleRfc1123DatetimeAsOptionalResponse(
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
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse rfc3339DatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException {
        HttpRequest request = buildRfc3339DatetimeAsOptionalRequest(dateTime, dateTime1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRfc3339DatetimeAsOptionalResponse(context);
    }

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc3339DatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        return makeHttpCallAsync(() -> buildRfc3339DatetimeAsOptionalRequest(dateTime, dateTime1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRfc3339DatetimeAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for rfc3339DatetimeAsOptional.
     */
    private HttpRequest buildRfc3339DatetimeAsOptionalRequest(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/rfc3339dateTimeAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("dateTime", DateTimeHelper.toRfc8601DateTime(dateTime));
        queryParameters.put("dateTime1", DateTimeHelper.toRfc8601DateTime(dateTime1));

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
     * Processes the response for rfc3339DatetimeAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleRfc3339DatetimeAsOptionalResponse(
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
     * @param  date  Required parameter: <testing> <testing>
     * @param  date1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDateAsOptional(
            final LocalDate date,
            final LocalDate date1) throws ApiException, IOException {
        HttpRequest request = buildSendDateAsOptionalRequest(date, date1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDateAsOptionalResponse(context);
    }

    /**
     * @param  date  Required parameter: <testing> <testing>
     * @param  date1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDateAsOptionalAsync(
            final LocalDate date,
            final LocalDate date1) {
        return makeHttpCallAsync(() -> buildSendDateAsOptionalRequest(date, date1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDateAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDateAsOptional.
     */
    private HttpRequest buildSendDateAsOptionalRequest(
            final LocalDate date,
            final LocalDate date1) {
        //validating required parameters
        if (null == date) {
            throw new NullPointerException("The parameter \"date\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/dateAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("date", DateTimeHelper.toSimpleDate(date));
        queryParameters.put("date1", DateTimeHelper.toSimpleDate(date1));

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
     * Processes the response for sendDateAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDateAsOptionalResponse(
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
     * @param  string  Required parameter: <testing> <testing>
     * @param  string1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringAsOptional(
            final String string,
            final String string1) throws ApiException, IOException {
        HttpRequest request = buildSendStringAsOptionalRequest(string, string1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringAsOptionalResponse(context);
    }

    /**
     * @param  string  Required parameter: <testing> <testing>
     * @param  string1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringAsOptionalAsync(
            final String string,
            final String string1) {
        return makeHttpCallAsync(() -> buildSendStringAsOptionalRequest(string, string1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringAsOptional.
     */
    private HttpRequest buildSendStringAsOptionalRequest(
            final String string,
            final String string1) {
        //validating required parameters
        if (null == string) {
            throw new NullPointerException("The parameter \"string\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/stringAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("string", string);
        queryParameters.put("string1", string1);

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
     * Processes the response for sendStringAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringAsOptionalResponse(
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
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse unixdatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException {
        HttpRequest request = buildUnixdatetimeAsOptionalRequest(dateTime, dateTime1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUnixdatetimeAsOptionalResponse(context);
    }

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> unixdatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        return makeHttpCallAsync(() -> buildUnixdatetimeAsOptionalRequest(dateTime, dateTime1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUnixdatetimeAsOptionalResponse(context));
    }

    /**
     * Builds the HttpRequest object for unixdatetimeAsOptional.
     */
    private HttpRequest buildUnixdatetimeAsOptionalRequest(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/unixdateTimeAsOptional");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("dateTime", DateTimeHelper.toUnixTimestamp(dateTime));
        queryParameters.put("dateTime1", DateTimeHelper.toUnixTimestamp(dateTime1));

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
     * Processes the response for unixdatetimeAsOptional.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUnixdatetimeAsOptionalResponse(
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