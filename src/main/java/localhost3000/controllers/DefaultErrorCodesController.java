/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost3000.ApiHelper;
import localhost3000.AuthManager;
import localhost3000.Configuration;
import localhost3000.exceptions.ApiException;
import localhost3000.exceptions.CustomErrorResponseException;
import localhost3000.exceptions.ExceptionWithBooleanException;
import localhost3000.exceptions.ExceptionWithDateException;
import localhost3000.exceptions.ExceptionWithDynamicException;
import localhost3000.exceptions.ExceptionWithLongException;
import localhost3000.exceptions.ExceptionWithNumberException;
import localhost3000.exceptions.ExceptionWithPrecisionException;
import localhost3000.exceptions.ExceptionWithRfc3339DateTimeException;
import localhost3000.exceptions.ExceptionWithStringException;
import localhost3000.exceptions.ExceptionWithUUIDException;
import localhost3000.exceptions.LocalTestException;
import localhost3000.exceptions.NestedModelException;
import localhost3000.exceptions.Rfc1123Exception;
import localhost3000.exceptions.UnixTimeStampException;
import localhost3000.http.Headers;
import localhost3000.http.client.HttpCallback;
import localhost3000.http.client.HttpClient;
import localhost3000.http.client.HttpContext;
import localhost3000.http.request.HttpRequest;
import localhost3000.http.response.HttpResponse;
import localhost3000.http.response.HttpStringResponse;
import localhost3000.models.Complex5;
import localhost3000.models.DynamicResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultErrorCodesController extends BaseController implements ErrorCodesController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultErrorCodesController(Configuration config, HttpClient httpClient,
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
    public DefaultErrorCodesController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse catch412GlobalError() throws ApiException, IOException {
        HttpRequest request = buildCatch412GlobalErrorRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCatch412GlobalErrorResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> catch412GlobalErrorAsync() {
        return makeHttpCallAsync(() -> buildCatch412GlobalErrorRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCatch412GlobalErrorResponse(context));
    }

    /**
     * Builds the HttpRequest object for catch412GlobalError.
     */
    private HttpRequest buildCatch412GlobalErrorRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/412");

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
     * Processes the response for catch412GlobalError.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleCatch412GlobalErrorResponse(
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
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse get501() throws ApiException, IOException {
        HttpRequest request = buildGet501Request();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGet501Response(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> get501Async() {
        return makeHttpCallAsync(() -> buildGet501Request(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGet501Response(context));
    }

    /**
     * Builds the HttpRequest object for get501.
     */
    private HttpRequest buildGet501Request() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/501");

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
     * Processes the response for get501.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleGet501Response(
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

        if (responseCode == 501) {
            throw new NestedModelException("error 501", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse get400() throws ApiException, IOException {
        HttpRequest request = buildGet400Request();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGet400Response(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> get400Async() {
        return makeHttpCallAsync(() -> buildGet400Request(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGet400Response(context));
    }

    /**
     * Builds the HttpRequest object for get400.
     */
    private HttpRequest buildGet400Request() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/400");

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
     * Processes the response for get400.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleGet400Response(
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
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse get500() throws ApiException, IOException {
        HttpRequest request = buildGet500Request();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGet500Response(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> get500Async() {
        return makeHttpCallAsync(() -> buildGet500Request(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGet500Response(context));
    }

    /**
     * Builds the HttpRequest object for get500.
     */
    private HttpRequest buildGet500Request() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/500");

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
     * Processes the response for get500.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleGet500Response(
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
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse get401() throws ApiException, IOException {
        HttpRequest request = buildGet401Request();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGet401Response(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> get401Async() {
        return makeHttpCallAsync(() -> buildGet401Request(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGet401Response(context));
    }

    /**
     * Builds the HttpRequest object for get401.
     */
    private HttpRequest buildGet401Request() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/401");

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
     * Processes the response for get401.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleGet401Response(
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

        if (responseCode == 401) {
            throw new LocalTestException("401 Local", context);
        }
        if (responseCode == 421) {
            throw new LocalTestException("Default", context);
        }
        if (responseCode == 431) {
            throw new LocalTestException("Default", context);
        }
        if (responseCode == 432) {
            throw new LocalTestException("Default", context);
        }
        if (responseCode == 441) {
            throw new LocalTestException("Default", context);
        }
        if ((responseCode < 200) || (responseCode > 208)) {
            throw new LocalTestException("Invalid response.", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse receiveExceptionWithUnixtimestampException() throws ApiException, IOException {
        HttpRequest request = buildReceiveExceptionWithUnixtimestampExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReceiveExceptionWithUnixtimestampExceptionResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> receiveExceptionWithUnixtimestampExceptionAsync() {
        return makeHttpCallAsync(() -> buildReceiveExceptionWithUnixtimestampExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReceiveExceptionWithUnixtimestampExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for receiveExceptionWithUnixtimestampException.
     */
    private HttpRequest buildReceiveExceptionWithUnixtimestampExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/unixTimeStampException");

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
     * Processes the response for receiveExceptionWithUnixtimestampException.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReceiveExceptionWithUnixtimestampExceptionResponse(
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

        if (responseCode == 444) {
            throw new UnixTimeStampException("unixtimestamp exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse receiveExceptionWithRfc1123Datetime() throws ApiException, IOException {
        HttpRequest request = buildReceiveExceptionWithRfc1123DatetimeRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReceiveExceptionWithRfc1123DatetimeResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> receiveExceptionWithRfc1123DatetimeAsync() {
        return makeHttpCallAsync(() -> buildReceiveExceptionWithRfc1123DatetimeRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReceiveExceptionWithRfc1123DatetimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for receiveExceptionWithRfc1123Datetime.
     */
    private HttpRequest buildReceiveExceptionWithRfc1123DatetimeRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/rfc1123Exception");

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
     * Processes the response for receiveExceptionWithRfc1123Datetime.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReceiveExceptionWithRfc1123DatetimeResponse(
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

        if (responseCode == 444) {
            throw new Rfc1123Exception("Rfc1123 Exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse receiveExceptionWithRfc3339Datetime() throws ApiException, IOException {
        HttpRequest request = buildReceiveExceptionWithRfc3339DatetimeRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReceiveExceptionWithRfc3339DatetimeResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> receiveExceptionWithRfc3339DatetimeAsync() {
        return makeHttpCallAsync(() -> buildReceiveExceptionWithRfc3339DatetimeRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReceiveExceptionWithRfc3339DatetimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for receiveExceptionWithRfc3339Datetime.
     */
    private HttpRequest buildReceiveExceptionWithRfc3339DatetimeRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/Rfc3339InException");

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
     * Processes the response for receiveExceptionWithRfc3339Datetime.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleReceiveExceptionWithRfc3339DatetimeResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithRfc3339DateTimeException("DateTime Exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the Complex5 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex5 receiveEndpointLevelException() throws ApiException, IOException {
        HttpRequest request = buildReceiveEndpointLevelExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReceiveEndpointLevelExceptionResponse(context);
    }

    /**
     * @return    Returns the Complex5 response from the API call
     */
    public CompletableFuture<Complex5> receiveEndpointLevelExceptionAsync() {
        return makeHttpCallAsync(() -> buildReceiveEndpointLevelExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReceiveEndpointLevelExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for receiveEndpointLevelException.
     */
    private HttpRequest buildReceiveEndpointLevelExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/451");

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
     * Processes the response for receiveEndpointLevelException.
     * @return An object of type Complex5
     */
    private Complex5 handleReceiveEndpointLevelExceptionResponse(
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

        if (responseCode == 451) {
            throw new CustomErrorResponseException("caught endpoint exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        Complex5 result = ApiHelper.deserialize(responseBody,
                Complex5.class);

        return result;
    }

    /**
     * @return    Returns the Complex5 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex5 receiveGlobalLevelException() throws ApiException, IOException {
        HttpRequest request = buildReceiveGlobalLevelExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReceiveGlobalLevelExceptionResponse(context);
    }

    /**
     * @return    Returns the Complex5 response from the API call
     */
    public CompletableFuture<Complex5> receiveGlobalLevelExceptionAsync() {
        return makeHttpCallAsync(() -> buildReceiveGlobalLevelExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReceiveGlobalLevelExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for receiveGlobalLevelException.
     */
    private HttpRequest buildReceiveGlobalLevelExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/450");

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
     * Processes the response for receiveGlobalLevelException.
     * @return An object of type Complex5
     */
    private Complex5 handleReceiveGlobalLevelExceptionResponse(
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
        Complex5 result = ApiHelper.deserialize(responseBody,
                Complex5.class);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse dateInException() throws ApiException, IOException {
        HttpRequest request = buildDateInExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDateInExceptionResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> dateInExceptionAsync() {
        return makeHttpCallAsync(() -> buildDateInExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDateInExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for dateInException.
     */
    private HttpRequest buildDateInExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/dateInException");

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
     * Processes the response for dateInException.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleDateInExceptionResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithDateException("date in exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse uUIDInException() throws ApiException, IOException {
        HttpRequest request = buildUUIDInExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUUIDInExceptionResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> uUIDInExceptionAsync() {
        return makeHttpCallAsync(() -> buildUUIDInExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUUIDInExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for uUIDInException.
     */
    private HttpRequest buildUUIDInExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/uuidInException");

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
     * Processes the response for uUIDInException.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleUUIDInExceptionResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithUUIDException("uuid in exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse dynamicInException() throws ApiException, IOException {
        HttpRequest request = buildDynamicInExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDynamicInExceptionResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> dynamicInExceptionAsync() {
        return makeHttpCallAsync(() -> buildDynamicInExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleDynamicInExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for dynamicInException.
     */
    private HttpRequest buildDynamicInExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/dynamicInException");

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
     * Processes the response for dynamicInException.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleDynamicInExceptionResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithDynamicException("dynamic in Exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse precisionInException() throws ApiException, IOException {
        HttpRequest request = buildPrecisionInExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handlePrecisionInExceptionResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> precisionInExceptionAsync() {
        return makeHttpCallAsync(() -> buildPrecisionInExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handlePrecisionInExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for precisionInException.
     */
    private HttpRequest buildPrecisionInExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/precisionInException");

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
     * Processes the response for precisionInException.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handlePrecisionInExceptionResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithPrecisionException("precision in Exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse booleanInException() throws ApiException, IOException {
        HttpRequest request = buildBooleanInExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleBooleanInExceptionResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> booleanInExceptionAsync() {
        return makeHttpCallAsync(() -> buildBooleanInExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleBooleanInExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for booleanInException.
     */
    private HttpRequest buildBooleanInExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/booleanInException");

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
     * Processes the response for booleanInException.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleBooleanInExceptionResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithBooleanException("Boolean in Exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse longInException() throws ApiException, IOException {
        HttpRequest request = buildLongInExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleLongInExceptionResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> longInExceptionAsync() {
        return makeHttpCallAsync(() -> buildLongInExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleLongInExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for longInException.
     */
    private HttpRequest buildLongInExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/longInException");

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
     * Processes the response for longInException.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleLongInExceptionResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithLongException("long in exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse numberInException() throws ApiException, IOException {
        HttpRequest request = buildNumberInExceptionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleNumberInExceptionResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> numberInExceptionAsync() {
        return makeHttpCallAsync(() -> buildNumberInExceptionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleNumberInExceptionResponse(context));
    }

    /**
     * Builds the HttpRequest object for numberInException.
     */
    private HttpRequest buildNumberInExceptionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/numberInException");

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
     * Processes the response for numberInException.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleNumberInExceptionResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithNumberException("number in exception", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse getExceptionWithString() throws ApiException, IOException {
        HttpRequest request = buildGetExceptionWithStringRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetExceptionWithStringResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> getExceptionWithStringAsync() {
        return makeHttpCallAsync(() -> buildGetExceptionWithStringRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetExceptionWithStringResponse(context));
    }

    /**
     * Builds the HttpRequest object for getExceptionWithString.
     */
    private HttpRequest buildGetExceptionWithStringRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/error/stringInException");

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
     * Processes the response for getExceptionWithString.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleGetExceptionWithStringResponse(
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

        if (responseCode == 444) {
            throw new ExceptionWithStringException("exception with string", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        DynamicResponse result = new DynamicResponse(response);

        return result;
    }

}