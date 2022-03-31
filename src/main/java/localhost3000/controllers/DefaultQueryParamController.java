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
import localhost3000.models.ComplexType;
import localhost3000.models.Days;
import localhost3000.models.ServerResponse;
import localhost3000.models.SuiteCode;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultQueryParamController extends BaseController implements QueryParamController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultQueryParamController(Configuration config, HttpClient httpClient,
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
    public DefaultQueryParamController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse dateArray(
            final List<LocalDate> dates) throws ApiException, IOException {
        HttpRequest request = buildDateArrayRequest(dates);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDateArrayResponse(context);
    }

    /**
     * @param  dates  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> dateArrayAsync(
            final List<LocalDate> dates) {
        return makeHttpCallAsync(() -> buildDateArrayRequest(dates),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDateArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for dateArray.
     */
    private HttpRequest buildDateArrayRequest(
            final List<LocalDate> dates) {
        //validating required parameters
        if (null == dates) {
            throw new NullPointerException("The parameter \"dates\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/datearray");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("dates", DateTimeHelper.toSimpleDate(dates));

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
     * Processes the response for dateArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleDateArrayResponse(
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
     * get optional dynamic query parameter.
     * @param  name  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse optionalDynamicQueryParam(
            final String name,
            final Map<String, Object> filter,
            final Map<String, Object> sort) throws ApiException, IOException {
        HttpRequest request = buildOptionalDynamicQueryParamRequest(name, filter, sort);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleOptionalDynamicQueryParamResponse(context);
    }

    /**
     * get optional dynamic query parameter.
     * @param  name  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> optionalDynamicQueryParamAsync(
            final String name,
            final Map<String, Object> queryParameters) {
//        return makeHttpCallAsync(() -> buildOptionalDynamicQueryParamRequest(name, queryParameters),
//            request -> getClientInstance().executeAsync(request, false),
//            context -> handleOptionalDynamicQueryParamResponse(context));
        return null;
    }

    /**
     * Builds the HttpRequest object for optionalDynamicQueryParam.
     */
    private HttpRequest buildOptionalDynamicQueryParamRequest(
            final String name,
            final Map<String, Object> filter,
            final Map<String, Object> sort) {
        //validating required parameters
        if (null == name) {
            throw new NullPointerException("The parameter \"name\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/optionalQueryParam");

        //load all query parameters
        Map<String, Object> internalQueryParameters = new HashMap<>();
        internalQueryParameters.put("filter",filter);
        internalQueryParameters.put("sort", sort);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers,
                internalQueryParameters, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for optionalDynamicQueryParam.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleOptionalDynamicQueryParamResponse(
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
    public ServerResponse date(
            final LocalDate date) throws ApiException, IOException {
        HttpRequest request = buildDateRequest(date);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDateResponse(context);
    }

    /**
     * @param  date  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> dateAsync(
            final LocalDate date) {
        return makeHttpCallAsync(() -> buildDateRequest(date),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDateResponse(context));
    }

    /**
     * Builds the HttpRequest object for date.
     */
    private HttpRequest buildDateRequest(
            final LocalDate date) {
        //validating required parameters
        if (null == date) {
            throw new NullPointerException("The parameter \"date\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/date");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("date", DateTimeHelper.toSimpleDate(date));

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
     * Processes the response for date.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleDateResponse(
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
    public ServerResponse unixDateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        HttpRequest request = buildUnixDateTimeArrayRequest(datetimes);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUnixDateTimeArrayResponse(context);
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> unixDateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        return makeHttpCallAsync(() -> buildUnixDateTimeArrayRequest(datetimes),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUnixDateTimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for unixDateTimeArray.
     */
    private HttpRequest buildUnixDateTimeArrayRequest(
            final List<LocalDateTime> datetimes) {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/unixdatetimearray");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("datetimes", DateTimeHelper.toUnixTimestamp(datetimes));

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
     * Processes the response for unixDateTimeArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUnixDateTimeArrayResponse(
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
    public ServerResponse unixDateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        HttpRequest request = buildUnixDateTimeRequest(datetime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUnixDateTimeResponse(context);
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> unixDateTimeAsync(
            final LocalDateTime datetime) {
        return makeHttpCallAsync(() -> buildUnixDateTimeRequest(datetime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUnixDateTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for unixDateTime.
     */
    private HttpRequest buildUnixDateTimeRequest(
            final LocalDateTime datetime) {
        //validating required parameters
        if (null == datetime) {
            throw new NullPointerException("The parameter \"datetime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/unixdatetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("datetime", DateTimeHelper.toUnixTimestamp(datetime));

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
     * Processes the response for unixDateTime.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUnixDateTimeResponse(
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
    public ServerResponse rfc1123DateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        HttpRequest request = buildRfc1123DateTimeRequest(datetime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRfc1123DateTimeResponse(context);
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc1123DateTimeAsync(
            final LocalDateTime datetime) {
        return makeHttpCallAsync(() -> buildRfc1123DateTimeRequest(datetime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRfc1123DateTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for rfc1123DateTime.
     */
    private HttpRequest buildRfc1123DateTimeRequest(
            final LocalDateTime datetime) {
        //validating required parameters
        if (null == datetime) {
            throw new NullPointerException("The parameter \"datetime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/rfc1123datetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("datetime", DateTimeHelper.toRfc1123DateTime(datetime));

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
     * Processes the response for rfc1123DateTime.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleRfc1123DateTimeResponse(
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
    public ServerResponse rfc1123DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        HttpRequest request = buildRfc1123DateTimeArrayRequest(datetimes);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRfc1123DateTimeArrayResponse(context);
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc1123DateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        return makeHttpCallAsync(() -> buildRfc1123DateTimeArrayRequest(datetimes),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRfc1123DateTimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for rfc1123DateTimeArray.
     */
    private HttpRequest buildRfc1123DateTimeArrayRequest(
            final List<LocalDateTime> datetimes) {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/rfc1123datetimearray");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("datetimes", DateTimeHelper.toRfc1123DateTime(datetimes));

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
     * Processes the response for rfc1123DateTimeArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleRfc1123DateTimeArrayResponse(
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
    public ServerResponse rfc3339DateTimeArray(
            final List<LocalDateTime> datetimes) throws ApiException, IOException {
        HttpRequest request = buildRfc3339DateTimeArrayRequest(datetimes);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRfc3339DateTimeArrayResponse(context);
    }

    /**
     * @param  datetimes  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc3339DateTimeArrayAsync(
            final List<LocalDateTime> datetimes) {
        return makeHttpCallAsync(() -> buildRfc3339DateTimeArrayRequest(datetimes),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRfc3339DateTimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for rfc3339DateTimeArray.
     */
    private HttpRequest buildRfc3339DateTimeArrayRequest(
            final List<LocalDateTime> datetimes) {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/rfc3339datetimearray");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("datetimes", DateTimeHelper.toRfc8601DateTime(datetimes));

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
     * Processes the response for rfc3339DateTimeArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleRfc3339DateTimeArrayResponse(
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
    public ServerResponse rfc3339DateTime(
            final LocalDateTime datetime) throws ApiException, IOException {
        HttpRequest request = buildRfc3339DateTimeRequest(datetime);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRfc3339DateTimeResponse(context);
    }

    /**
     * @param  datetime  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> rfc3339DateTimeAsync(
            final LocalDateTime datetime) {
        return makeHttpCallAsync(() -> buildRfc3339DateTimeRequest(datetime),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRfc3339DateTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for rfc3339DateTime.
     */
    private HttpRequest buildRfc3339DateTimeRequest(
            final LocalDateTime datetime) {
        //validating required parameters
        if (null == datetime) {
            throw new NullPointerException("The parameter \"datetime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/rfc3339datetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("datetime", DateTimeHelper.toRfc8601DateTime(datetime));

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
     * Processes the response for rfc3339DateTime.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleRfc3339DateTimeResponse(
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
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse noParams() throws ApiException, IOException {
        HttpRequest request = buildNoParamsRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleNoParamsResponse(context);
    }

    /**
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> noParamsAsync() {
        return makeHttpCallAsync(() -> buildNoParamsRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleNoParamsResponse(context));
    }

    /**
     * Builds the HttpRequest object for noParams.
     */
    private HttpRequest buildNoParamsRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/noparams");

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
     * Processes the response for noParams.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleNoParamsResponse(
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
     * @param  string  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse stringParam(
            final String string) throws ApiException, IOException {
        HttpRequest request = buildStringParamRequest(string);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleStringParamResponse(context);
    }

    /**
     * @param  string  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> stringParamAsync(
            final String string) {
        return makeHttpCallAsync(() -> buildStringParamRequest(string),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleStringParamResponse(context));
    }

    /**
     * Builds the HttpRequest object for stringParam.
     */
    private HttpRequest buildStringParamRequest(
            final String string) {
        //validating required parameters
        if (null == string) {
            throw new NullPointerException("The parameter \"string\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/stringparam");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("string", string);

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
     * Processes the response for stringParam.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleStringParamResponse(
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
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse urlParam(
            final String url) throws ApiException, IOException {
        HttpRequest request = buildUrlParamRequest(url);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUrlParamResponse(context);
    }

    /**
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> urlParamAsync(
            final String url) {
        return makeHttpCallAsync(() -> buildUrlParamRequest(url),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUrlParamResponse(context));
    }

    /**
     * Builds the HttpRequest object for urlParam.
     */
    private HttpRequest buildUrlParamRequest(
            final String url) {
        //validating required parameters
        if (null == url) {
            throw new NullPointerException("The parameter \"url\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/urlparam");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("url", url);

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
     * Processes the response for urlParam.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUrlParamResponse(
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
    public ServerResponse numberArray(
            final List<Integer> integers) throws ApiException, IOException {
        HttpRequest request = buildNumberArrayRequest(integers);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleNumberArrayResponse(context);
    }

    /**
     * @param  integers  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> numberArrayAsync(
            final List<Integer> integers) {
        return makeHttpCallAsync(() -> buildNumberArrayRequest(integers),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleNumberArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for numberArray.
     */
    private HttpRequest buildNumberArrayRequest(
            final List<Integer> integers) {
        //validating required parameters
        if (null == integers) {
            throw new NullPointerException("The parameter \"integers\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/numberarray");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("integers", integers);

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
     * Processes the response for numberArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleNumberArrayResponse(
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
    public ServerResponse stringArray(
            final List<String> strings) throws ApiException, IOException {
        HttpRequest request = buildStringArrayRequest(strings);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleStringArrayResponse(context);
    }

    /**
     * @param  strings  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> stringArrayAsync(
            final List<String> strings) {
        return makeHttpCallAsync(() -> buildStringArrayRequest(strings),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleStringArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for stringArray.
     */
    private HttpRequest buildStringArrayRequest(
            final List<String> strings) {
        //validating required parameters
        if (null == strings) {
            throw new NullPointerException("The parameter \"strings\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/stringarray");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("strings", strings);

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
     * Processes the response for stringArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleStringArrayResponse(
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
     * @param  mBoolean  Required parameter: Example:
     * @param  number  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse simpleQuery(
            final boolean mBoolean,
            final int number,
            final String string,
            final Map<String, Object> queryParameters) throws ApiException, IOException {
        HttpRequest request = buildSimpleQueryRequest(mBoolean, number, string, queryParameters);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSimpleQueryResponse(context);
    }

    /**
     * @param  mBoolean  Required parameter: Example:
     * @param  number  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param    queryParameters    Additional optional query parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> simpleQueryAsync(
            final boolean mBoolean,
            final int number,
            final String string,
            final Map<String, Object> queryParameters) {
        return makeHttpCallAsync(() -> buildSimpleQueryRequest(mBoolean, number, string,
                queryParameters),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSimpleQueryResponse(context));
    }

    /**
     * Builds the HttpRequest object for simpleQuery.
     */
    private HttpRequest buildSimpleQueryRequest(
            final boolean mBoolean,
            final int number,
            final String string,
            final Map<String, Object> queryParameters) {
        //validating required parameters
        if (null == string) {
            throw new NullPointerException("The parameter \"string\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query");

        //load all query parameters
        Map<String, Object> internalQueryParameters = new HashMap<>();
        internalQueryParameters.put("boolean", mBoolean);
        internalQueryParameters.put("number", number);
        internalQueryParameters.put("string", string);
        internalQueryParameters.putAll(queryParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers,
                internalQueryParameters, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for simpleQuery.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSimpleQueryResponse(
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
    public ServerResponse stringEnumArray(
            final List<Days> days) throws ApiException, IOException {
        HttpRequest request = buildStringEnumArrayRequest(days);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleStringEnumArrayResponse(context);
    }

    /**
     * @param  days  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> stringEnumArrayAsync(
            final List<Days> days) {
        return makeHttpCallAsync(() -> buildStringEnumArrayRequest(days),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleStringEnumArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for stringEnumArray.
     */
    private HttpRequest buildStringEnumArrayRequest(
            final List<Days> days) {
        //validating required parameters
        if (null == days) {
            throw new NullPointerException("The parameter \"days\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/stringenumarray");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("days", Days.toValue(days));

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
     * Processes the response for stringEnumArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleStringEnumArrayResponse(
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
     * @param  number  Required parameter: Example:
     * @param  precision  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse multipleParams(
            final int number,
            final double precision,
            final String string,
            final String url) throws ApiException, IOException {
        HttpRequest request = buildMultipleParamsRequest(number, precision, string, url);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleMultipleParamsResponse(context);
    }

    /**
     * @param  number  Required parameter: Example:
     * @param  precision  Required parameter: Example:
     * @param  string  Required parameter: Example:
     * @param  url  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> multipleParamsAsync(
            final int number,
            final double precision,
            final String string,
            final String url) {
        return makeHttpCallAsync(() -> buildMultipleParamsRequest(number, precision, string, url),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleMultipleParamsResponse(context));
    }

    /**
     * Builds the HttpRequest object for multipleParams.
     */
    private HttpRequest buildMultipleParamsRequest(
            final int number,
            final double precision,
            final String string,
            final String url) {
        //validating required parameters
        if (null == string) {
            throw new NullPointerException("The parameter \"string\" is a required parameter and cannot be null.");
        }

        if (null == url) {
            throw new NullPointerException("The parameter \"url\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/multipleparams");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("number", number);
        queryParameters.put("precision", precision);
        queryParameters.put("string", string);
        queryParameters.put("url", url);

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
     * Processes the response for multipleParams.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleMultipleParamsResponse(
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
    public ServerResponse integerEnumArray(
            final List<SuiteCode> suites) throws ApiException, IOException {
        HttpRequest request = buildIntegerEnumArrayRequest(suites);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleIntegerEnumArrayResponse(context);
    }

    /**
     * @param  suites  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> integerEnumArrayAsync(
            final List<SuiteCode> suites) {
        return makeHttpCallAsync(() -> buildIntegerEnumArrayRequest(suites),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleIntegerEnumArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for integerEnumArray.
     */
    private HttpRequest buildIntegerEnumArrayRequest(
            final List<SuiteCode> suites) {
        //validating required parameters
        if (null == suites) {
            throw new NullPointerException("The parameter \"suites\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/integerenumarray");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("suites", SuiteCode.toValue(suites));

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
     * Processes the response for integerEnumArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleIntegerEnumArrayResponse(
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
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIndexedComplexTypeInQuery(
            final ComplexType complexType) throws ApiException, IOException {
        HttpRequest request = buildSendIndexedComplexTypeInQueryRequest(complexType);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendIndexedComplexTypeInQueryResponse(context);
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIndexedComplexTypeInQueryAsync(
            final ComplexType complexType) {
        return makeHttpCallAsync(() -> buildSendIndexedComplexTypeInQueryRequest(complexType),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendIndexedComplexTypeInQueryResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendIndexedComplexTypeInQuery.
     */
    private HttpRequest buildSendIndexedComplexTypeInQueryRequest(
            final ComplexType complexType) {
        //validating required parameters
        if (null == complexType) {
            throw new NullPointerException("The parameter \"complexType\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/complex/indexed");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("complexType", complexType);
        queryParameters.put("content", "SIMPLE");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendIndexedComplexTypeInQuery.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendIndexedComplexTypeInQueryResponse(
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
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIndexedListOfComplexTypeInQuery(
            final List<ComplexType> complexType) throws ApiException, IOException {
        HttpRequest request = buildSendIndexedListOfComplexTypeInQueryRequest(complexType);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendIndexedListOfComplexTypeInQueryResponse(context);
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIndexedListOfComplexTypeInQueryAsync(
            final List<ComplexType> complexType) {
        return makeHttpCallAsync(() -> buildSendIndexedListOfComplexTypeInQueryRequest(complexType),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendIndexedListOfComplexTypeInQueryResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendIndexedListOfComplexTypeInQuery.
     */
    private HttpRequest buildSendIndexedListOfComplexTypeInQueryRequest(
            final List<ComplexType> complexType) {
        //validating required parameters
        if (null == complexType) {
            throw new NullPointerException("The parameter \"complexType\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/complex/indexed");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("complexType", complexType);
        queryParameters.put("content", "ARRAY");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendIndexedListOfComplexTypeInQuery.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendIndexedListOfComplexTypeInQueryResponse(
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
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIndexedMapOfComplexTypeInQuery(
            final Map<String, ComplexType> complexType) throws ApiException, IOException {
        HttpRequest request = buildSendIndexedMapOfComplexTypeInQueryRequest(complexType);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendIndexedMapOfComplexTypeInQueryResponse(context);
    }

    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendIndexedMapInQuery(
            final Map<String, ComplexType> complexType) throws ApiException, IOException {
        HttpRequest request = buildSendIndexedMapOfComplexTypeInQueryRequest(complexType);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendIndexedMapOfComplexTypeInQueryResponse(context);
    }
    
    /**
     * @param  complexType  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendIndexedMapOfComplexTypeInQueryAsync(
            final Map<String, ComplexType> complexType) {
        return makeHttpCallAsync(() -> buildSendIndexedMapOfComplexTypeInQueryRequest(complexType),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendIndexedMapOfComplexTypeInQueryResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendIndexedMapOfComplexTypeInQuery.
     */
    private HttpRequest buildSendIndexedMapOfComplexTypeInQueryRequest(
            final Map<String, ComplexType> complexType) {
        //validating required parameters
        if (null == complexType) {
            throw new NullPointerException("The parameter \"complexType\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/query/complex/indexed");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("complexType", complexType);
        queryParameters.put("content", "MAP");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendIndexedMapOfComplexTypeInQuery.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendIndexedMapOfComplexTypeInQueryResponse(
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