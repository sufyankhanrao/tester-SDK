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
import localhost3000.http.request.MultipartFileWrapper;
import localhost3000.http.response.HttpResponse;
import localhost3000.http.response.HttpStringResponse;
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
import localhost3000.models.PrecisionAsOptional;
import localhost3000.models.SendMixedArrayInput;
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
import localhost3000.utilities.FileWrapper;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultFormParamsController extends BaseController implements FormParamsController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultFormParamsController(Configuration config, HttpClient httpClient,
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
    public DefaultFormParamsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @param  body  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteForm(
            final DeleteBody body) throws ApiException, IOException {
        HttpRequest request = buildSendDeleteFormRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDeleteFormResponse(context);
    }

    /**
     * @param  body  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteFormAsync(
            final DeleteBody body) {
        return makeHttpCallAsync(() -> buildSendDeleteFormRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDeleteFormResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDeleteForm.
     */
    private HttpRequest buildSendDeleteFormRequest(
            final DeleteBody body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/deleteForm");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDeleteForm.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDeleteFormResponse(
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
     * @param  file  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteMultipart(
            final FileWrapper file) throws ApiException, IOException {
        HttpRequest request = buildSendDeleteMultipartRequest(file);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDeleteMultipartResponse(context);
    }

    /**
     * @param  file  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteMultipartAsync(
            final FileWrapper file) {
        return makeHttpCallAsync(() -> buildSendDeleteMultipartRequest(file),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDeleteMultipartResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDeleteMultipart.
     */
    private HttpRequest buildSendDeleteMultipartRequest(
            final FileWrapper file) {
        //validating required parameters
        if (null == file) {
            throw new NullPointerException("The parameter \"file\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/deleteMultipart");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        Headers fileHeaders = new Headers();
        fileHeaders.add("content-type", "application/octect-stream");
        MultipartFileWrapper fileWrapper =
                new MultipartFileWrapper(file, fileHeaders);

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("file", fileWrapper);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDeleteMultipart.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDeleteMultipartResponse(
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
     * @param  dates  Required parameter: <testing>
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
     * @param  dates  Required parameter: <testing>
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
            final List<LocalDate> dates) {
        //validating required parameters
        if (null == dates) {
            throw new NullPointerException("The parameter \"dates\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/date");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("dates", DateTimeHelper.toSimpleDate(dates));

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * @param  date  Required parameter: <testing>
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
     * @param  date  Required parameter: <testing>
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
                + "/form/date");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("date", DateTimeHelper.toSimpleDate(date));

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
     * @param  datetime  Required parameter: <testing>
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
     * @param  datetime  Required parameter: <testing>
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
                + "/form/unixdatetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("datetime", DateTimeHelper.toUnixTimestamp(datetime));

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
     * @param  datetime  Required parameter: <testing>
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
     * @param  datetime  Required parameter: <testing>
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
                + "/form/rfc1123datetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("datetime", DateTimeHelper.toRfc1123DateTime(datetime));

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
     * @param  datetime  Required parameter: <testing>
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
     * @param  datetime  Required parameter: <testing>
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
                + "/form/rfc3339datetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("datetime", DateTimeHelper.toRfc8601DateTime(datetime));

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
     * @param  datetimes  Required parameter: <testing>
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
     * @param  datetimes  Required parameter: <testing>
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
            final List<LocalDateTime> datetimes) {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/unixdatetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("datetimes", DateTimeHelper.toUnixTimestamp(datetimes));

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * @param  datetimes  Required parameter: <testing>
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
     * @param  datetimes  Required parameter: <testing>
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
            final List<LocalDateTime> datetimes) {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/rfc1123datetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("datetimes", DateTimeHelper.toRfc1123DateTime(datetimes));

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * @param  value  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendLong(
            final long value) throws ApiException, IOException {
        HttpRequest request = buildSendLongRequest(value);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendLongResponse(context);
    }

    /**
     * @param  value  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendLongAsync(
            final long value) {
        return makeHttpCallAsync(() -> buildSendLongRequest(value),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendLongResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendLong.
     */
    private HttpRequest buildSendLongRequest(
            final long value) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/number");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
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
     * Processes the response for sendLong.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendLongResponse(
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
     * @param  integers  Required parameter: <testing>
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
     * @param  integers  Required parameter: <testing>
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
            final List<Integer> integers) {
        //validating required parameters
        if (null == integers) {
            throw new NullPointerException("The parameter \"integers\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/number");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("integers", integers);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * @param  strings  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringArray(
            final List<String> strings) throws ApiException, IOException {
        HttpRequest request = buildSendStringArrayRequest(strings);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringArrayResponse(context);
    }

    /**
     * @param  strings  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringArrayAsync(
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
                + "/form/string");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("strings", strings);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * @param  name  Required parameter: <testing>
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse allowDynamicFormFields(
            final String name,
            final Map<String, Object> fieldParameters) throws ApiException, IOException {
        HttpRequest request = buildAllowDynamicFormFieldsRequest(name, fieldParameters);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAllowDynamicFormFieldsResponse(context);
    }

    /**
     * @param  name  Required parameter: <testing>
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> allowDynamicFormFieldsAsync(
            final String name,
            final Map<String, Object> fieldParameters) {
        return makeHttpCallAsync(() -> buildAllowDynamicFormFieldsRequest(name, fieldParameters),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleAllowDynamicFormFieldsResponse(context));
    }

    /**
     * Builds the HttpRequest object for allowDynamicFormFields.
     */
    private HttpRequest buildAllowDynamicFormFieldsRequest(
            final String name,
            final Map<String, Object> fieldParameters) {
        //validating required parameters
        if (null == name) {
            throw new NullPointerException("The parameter \"name\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/allowDynamicFormFields");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("name", name);
        formParameters.putAll(fieldParameters);

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
     * Processes the response for allowDynamicFormFields.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleAllowDynamicFormFieldsResponse(
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
     * @param  model  Required parameter: <testing>
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
     * @param  model  Required parameter: <testing>
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
            final Employee model) {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/model");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("model", model);

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
     * @param  models  Required parameter: <testing>
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
     * @param  models  Required parameter: <testing>
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
            final List<Employee> models) {
        //validating required parameters
        if (null == models) {
            throw new NullPointerException("The parameter \"models\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/model");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("models", models);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * @param  file  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendFile(
            final FileWrapper file) throws ApiException, IOException {
        HttpRequest request = buildSendFileRequest(file);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendFileResponse(context);
    }

    /**
     * @param  file  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendFileAsync(
            final FileWrapper file) {
        return makeHttpCallAsync(() -> buildSendFileRequest(file),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendFileResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendFile.
     */
    private HttpRequest buildSendFileRequest(
            final FileWrapper file) {
        //validating required parameters
        if (null == file) {
            throw new NullPointerException("The parameter \"file\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/file");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        Headers fileHeaders = new Headers();
        fileHeaders.add("content-type", "application/octect-stream");
        MultipartFileWrapper fileWrapper =
                new MultipartFileWrapper(file, fileHeaders);

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("file", fileWrapper);

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
     * Processes the response for sendFile.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendFileResponse(
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
     * @param  file  Required parameter: <testing>
     * @param  file1  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendMultipleFiles(
            final FileWrapper file,
            final FileWrapper file1) throws ApiException, IOException {
        HttpRequest request = buildSendMultipleFilesRequest(file, file1);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendMultipleFilesResponse(context);
    }

    /**
     * @param  file  Required parameter: <testing>
     * @param  file1  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendMultipleFilesAsync(
            final FileWrapper file,
            final FileWrapper file1) {
        return makeHttpCallAsync(() -> buildSendMultipleFilesRequest(file, file1),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendMultipleFilesResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendMultipleFiles.
     */
    private HttpRequest buildSendMultipleFilesRequest(
            final FileWrapper file,
            final FileWrapper file1) {
        //validating required parameters
        if (null == file) {
            throw new NullPointerException("The parameter \"file\" is a required parameter and cannot be null.");
        }

        if (null == file1) {
            throw new NullPointerException("The parameter \"file1\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/multipleFiles");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        Headers fileHeaders = new Headers();
        fileHeaders.add("content-type", "application/octect-stream");
        MultipartFileWrapper fileWrapper =
                new MultipartFileWrapper(file, fileHeaders);
        Headers file1Headers = new Headers();
        file1Headers.add("content-type", "application/octect-stream");
        MultipartFileWrapper file1Wrapper =
                new MultipartFileWrapper(file1, file1Headers);

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("file", fileWrapper);
        formParameters.put("file1", file1Wrapper);

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
     * Processes the response for sendMultipleFiles.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendMultipleFilesResponse(
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
     * @param  value  Required parameter: <testing>
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
     * @param  value  Required parameter: <testing>
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
                + "/form/string");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
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
     * @param  datetimes  Required parameter: <testing>
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
     * @param  datetimes  Required parameter: <testing>
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
            final List<LocalDateTime> datetimes) {
        //validating required parameters
        if (null == datetimes) {
            throw new NullPointerException("The parameter \"datetimes\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/rfc3339datetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("datetimes", DateTimeHelper.toRfc8601DateTime(datetimes));

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * Send a variety for form params. Returns file count and body params.
     * @param  input  SendMixedArrayInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendMixedArray(
            final SendMixedArrayInput input) throws ApiException, IOException {
        HttpRequest request = buildSendMixedArrayRequest(input);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendMixedArrayResponse(context);
    }

    /**
     * Send a variety for form params. Returns file count and body params.
     * @param  input  SendMixedArrayInput object containing request parameters
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendMixedArrayAsync(
            final SendMixedArrayInput input) {
        return makeHttpCallAsync(() -> buildSendMixedArrayRequest(input),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendMixedArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendMixedArray.
     */
    private HttpRequest buildSendMixedArrayRequest(
            final SendMixedArrayInput input) {
        //validating required parameters
        if (null == input.getFile()) {
            throw new NullPointerException("The property \"File\" in the input object cannot be null.");
        }

        if (null == input.getIntegers()) {
            throw new NullPointerException("The property \"Integers\" in the input object cannot be null.");
        }

        if (null == input.getModels()) {
            throw new NullPointerException("The property \"Models\" in the input object cannot be null.");
        }

        if (null == input.getStrings()) {
            throw new NullPointerException("The property \"Strings\" in the input object cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/mixed");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");
        Headers fileHeaders = new Headers();
        fileHeaders.add("content-type", "application/octect-stream");
        MultipartFileWrapper fileWrapper =
                new MultipartFileWrapper(input.getFile(), fileHeaders);

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("file", fileWrapper);
        formParameters.put("integers", input.getIntegers());
        formParameters.put("models", input.getModels());
        formParameters.put("strings", input.getStrings());

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
     * Processes the response for sendMixedArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendMixedArrayResponse(
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
     * @param  model  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateModelWithForm(
            final Employee model) throws ApiException, IOException {
        HttpRequest request = buildUpdateModelWithFormRequest(model);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateModelWithFormResponse(context);
    }

    /**
     * @param  model  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateModelWithFormAsync(
            final Employee model) {
        return makeHttpCallAsync(() -> buildUpdateModelWithFormRequest(model),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateModelWithFormResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateModelWithForm.
     */
    private HttpRequest buildUpdateModelWithFormRequest(
            final Employee model) {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/updateModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("model", model);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().put(queryBuilder, headers, null,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateModelWithForm.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateModelWithFormResponse(
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
     * @param  model  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteForm1(
            final Employee model) throws ApiException, IOException {
        HttpRequest request = buildSendDeleteForm1Request(model);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDeleteForm1Response(context);
    }

    /**
     * @param  model  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteForm1Async(
            final Employee model) {
        return makeHttpCallAsync(() -> buildSendDeleteForm1Request(model),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDeleteForm1Response(context));
    }

    /**
     * Builds the HttpRequest object for sendDeleteForm1.
     */
    private HttpRequest buildSendDeleteForm1Request(
            final Employee model) {
        //validating required parameters
        if (null == model) {
            throw new NullPointerException("The parameter \"model\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/deleteForm1");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("model", model);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDeleteForm1.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDeleteForm1Response(
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
     * @param  models  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendDeleteFormWithModelArray(
            final List<Employee> models) throws ApiException, IOException {
        HttpRequest request = buildSendDeleteFormWithModelArrayRequest(models);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendDeleteFormWithModelArrayResponse(context);
    }

    /**
     * @param  models  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendDeleteFormWithModelArrayAsync(
            final List<Employee> models) {
        return makeHttpCallAsync(() -> buildSendDeleteFormWithModelArrayRequest(models),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendDeleteFormWithModelArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendDeleteFormWithModelArray.
     */
    private HttpRequest buildSendDeleteFormWithModelArrayRequest(
            final List<Employee> models) {
        //validating required parameters
        if (null == models) {
            throw new NullPointerException("The parameter \"models\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/deleteForm1");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("models", models);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for sendDeleteFormWithModelArray.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendDeleteFormWithModelArrayResponse(
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
     * @param  models  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateModelArrayWithForm(
            final List<Employee> models) throws ApiException, IOException {
        HttpRequest request = buildUpdateModelArrayWithFormRequest(models);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateModelArrayWithFormResponse(context);
    }

    /**
     * @param  models  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateModelArrayWithFormAsync(
            final List<Employee> models) {
        return makeHttpCallAsync(() -> buildUpdateModelArrayWithFormRequest(models),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateModelArrayWithFormResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateModelArrayWithForm.
     */
    private HttpRequest buildUpdateModelArrayWithFormRequest(
            final List<Employee> models) {
        //validating required parameters
        if (null == models) {
            throw new NullPointerException("The parameter \"models\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/updateModel");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("models", models);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().put(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateModelArrayWithForm.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateModelArrayWithFormResponse(
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
     * @param  value  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateStringWithForm(
            final String value) throws ApiException, IOException {
        HttpRequest request = buildUpdateStringWithFormRequest(value);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateStringWithFormResponse(context);
    }

    /**
     * @param  value  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateStringWithFormAsync(
            final String value) {
        return makeHttpCallAsync(() -> buildUpdateStringWithFormRequest(value),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateStringWithFormResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateStringWithForm.
     */
    private HttpRequest buildUpdateStringWithFormRequest(
            final String value) {
        //validating required parameters
        if (null == value) {
            throw new NullPointerException("The parameter \"value\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/updateString");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("value", value);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().put(queryBuilder, headers, null,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateStringWithForm.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateStringWithFormResponse(
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
     * @param  strings  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse updateStringArrayWithForm(
            final List<String> strings) throws ApiException, IOException {
        HttpRequest request = buildUpdateStringArrayWithFormRequest(strings);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateStringArrayWithFormResponse(context);
    }

    /**
     * @param  strings  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> updateStringArrayWithFormAsync(
            final List<String> strings) {
        return makeHttpCallAsync(() -> buildUpdateStringArrayWithFormRequest(strings),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateStringArrayWithFormResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateStringArrayWithForm.
     */
    private HttpRequest buildUpdateStringArrayWithFormRequest(
            final List<String> strings) {
        //validating required parameters
        if (null == strings) {
            throw new NullPointerException("The parameter \"strings\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/updateString");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("strings", strings);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().put(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateStringArrayWithForm.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleUpdateStringArrayWithFormResponse(
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
     * @param  suites  Required parameter: <testing>
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
     * @param  suites  Required parameter: <testing>
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
            final List<SuiteCode> suites) {
        //validating required parameters
        if (null == suites) {
            throw new NullPointerException("The parameter \"suites\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/integerenum");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("suites", SuiteCode.toValue(suites));

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * @param  days  Required parameter: <testing>
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
     * @param  days  Required parameter: <testing>
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
            final List<Days> days) {
        //validating required parameters
        if (null == days) {
            throw new NullPointerException("The parameter \"days\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/stringenum");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("days", Days.toValue(days));

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, queryParameters,
                ApiHelper.prepareFormFields(formParameters));

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
     * @param  body  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringInFormWithNewLine(
            final TestNstringEncoding body) throws ApiException, IOException {
        HttpRequest request = buildSendStringInFormWithNewLineRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringInFormWithNewLineResponse(context);
    }

    /**
     * @param  body  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringInFormWithNewLineAsync(
            final TestNstringEncoding body) {
        return makeHttpCallAsync(() -> buildSendStringInFormWithNewLineRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringInFormWithNewLineResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringInFormWithNewLine.
     */
    private HttpRequest buildSendStringInFormWithNewLineRequest(
            final TestNstringEncoding body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/stringEncoding");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * Processes the response for sendStringInFormWithNewLine.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringInFormWithNewLineResponse(
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
     * @param  body  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringInFormWithR(
            final TestRstringEncoding body) throws ApiException, IOException {
        HttpRequest request = buildSendStringInFormWithRRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringInFormWithRResponse(context);
    }

    /**
     * @param  body  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringInFormWithRAsync(
            final TestRstringEncoding body) {
        return makeHttpCallAsync(() -> buildSendStringInFormWithRRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringInFormWithRResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringInFormWithR.
     */
    private HttpRequest buildSendStringInFormWithRRequest(
            final TestRstringEncoding body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/stringEncoding");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * Processes the response for sendStringInFormWithR.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringInFormWithRResponse(
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
     * @param  body  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ServerResponse sendStringInFormWithRN(
            final TestRNstringEncoding body) throws ApiException, IOException {
        HttpRequest request = buildSendStringInFormWithRNRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleSendStringInFormWithRNResponse(context);
    }

    /**
     * @param  body  Required parameter: <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    public CompletableFuture<ServerResponse> sendStringInFormWithRNAsync(
            final TestRNstringEncoding body) {
        return makeHttpCallAsync(() -> buildSendStringInFormWithRNRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleSendStringInFormWithRNResponse(context));
    }

    /**
     * Builds the HttpRequest object for sendStringInFormWithRN.
     */
    private HttpRequest buildSendStringInFormWithRNRequest(
            final TestRNstringEncoding body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/stringEncoding");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * Processes the response for sendStringInFormWithRN.
     * @return An object of type ServerResponse
     */
    private ServerResponse handleSendStringInFormWithRNResponse(
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
     * @param  dateTime  Optional parameter: <testing>
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
     * @param  dateTime  Optional parameter: <testing>
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
                + "/form/optionalUnixTimeStamp");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        if (dateTime != null) {
            formParameters.put("dateTime", DateTimeHelper.toUnixTimestamp(dateTime));
        }

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
                + "/form/optionlRfc1123");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", DateTimeHelper.toRfc1123DateTime(body));

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
     * @param  body  Optional parameter: <testing>
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
     * @param  body  Optional parameter: <testing>
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
                + "/form/optionalDateTime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        if (body != null) {
            formParameters.put("body", DateTimeHelper.toRfc8601DateTime(body));
        }

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
     * @param  dateTime  Required parameter: <testing>
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
     * @param  dateTime  Required parameter: <testing>
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
            final UnixDateTime dateTime) {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalUnixDateTimeInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("dateTime", dateTime);

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
     * @param  dateTime  Required parameter: <testing>
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
     * @param  dateTime  Required parameter: <testing>
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
            final SendUnixDateTime dateTime) {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalUnixTimeStampInNestedModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("dateTime", dateTime);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final SendRfc1123DateTime body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/rfc1123InNestedModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  dateTime  Required parameter: <testing>
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
     * @param  dateTime  Required parameter: <testing>
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
            final ModelWithOptionalRfc1123DateTime dateTime) {
        //validating required parameters
        if (null == dateTime) {
            throw new NullPointerException("The parameter \"dateTime\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/OptionalRfc1123InModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("dateTime", dateTime);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final ModelWithOptionalRfc3339DateTime body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalDateTimeInBody");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final SendRfc339DateTime body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/dateTimeInNestedModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final UuidAsOptional body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalUUIDInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final BooleanAsOptional body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalBooleanInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final DateAsOptional body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalDateInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final DynamicAsOptional body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalDynamicInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final StringAsOptional body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalStringInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final PrecisionAsOptional body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalPrecisionInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final LongAsOptional body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalLongInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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
     * @param  body  Required parameter: <testing>
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
     * @param  body  Required parameter: <testing>
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
            final NumberAsOptional body) {
        //validating required parameters
        if (null == body) {
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");
        }

        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/form/optionalNumberInModel");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        formParameters.put("body", body);

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