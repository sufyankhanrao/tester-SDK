/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.io.InputStream;
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
import localhost3000.Server;
import localhost3000.exceptions.ApiException;
import localhost3000.http.Headers;
import localhost3000.http.client.HttpCallback;
import localhost3000.http.client.HttpClient;
import localhost3000.http.client.HttpContext;
import localhost3000.http.request.HttpRequest;
import localhost3000.http.response.HttpResponse;
import localhost3000.http.response.HttpStringResponse;
import localhost3000.models.BossCompany;
import localhost3000.models.Company;
import localhost3000.models.Complex1;
import localhost3000.models.Complex2;
import localhost3000.models.Complex3;
import localhost3000.models.Days;
import localhost3000.models.Developer;
import localhost3000.models.DynamicResponse;
import localhost3000.models.EmployeeComp;
import localhost3000.models.Person;
import localhost3000.models.ResponseWithEnum;
import localhost3000.models.SoftwareTester;
import localhost3000.models.SuiteCode;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultResponseTypesController extends BaseController implements ResponseTypesController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultResponseTypesController(Configuration config, HttpClient httpClient,
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
    public DefaultResponseTypesController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * @return    Returns the List of LocalDate response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocalDate> getDateArray() throws ApiException, IOException {
        HttpRequest request = buildGetDateArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetDateArrayResponse(context);
    }

    /**
     * @return    Returns the List of LocalDate response from the API call
     */
    public CompletableFuture<List<LocalDate>> getDateArrayAsync() {
        return makeHttpCallAsync(() -> buildGetDateArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetDateArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for getDateArray.
     */
    private HttpRequest buildGetDateArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/date");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

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
     * Processes the response for getDateArray.
     * @return An object of type List of LocalDate
     */
    private List<LocalDate> handleGetDateArrayResponse(
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
        List<LocalDate> result = ApiHelper.deserialize(responseBody,
                new TypeReference<List<LocalDate>>(){},
                LocalDate.class,
                new DateTimeHelper.SimpleDateDeserializer());

        return result;
    }

    /**
     * @return    Returns the LocalDate response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LocalDate getDate() throws ApiException, IOException {
        HttpRequest request = buildGetDateRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetDateResponse(context);
    }

    /**
     * @return    Returns the LocalDate response from the API call
     */
    public CompletableFuture<LocalDate> getDateAsync() {
        return makeHttpCallAsync(() -> buildGetDateRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetDateResponse(context));
    }

    /**
     * Builds the HttpRequest object for getDate.
     */
    private HttpRequest buildGetDateRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/date");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getDate.
     * @return An object of type LocalDate
     */
    private LocalDate handleGetDateResponse(
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
        LocalDate result = DateTimeHelper.fromSimpleDate(responseBody);

        return result;
    }

    /**
     * @return    Returns the Company response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Company returnCompanyModel() throws ApiException, IOException {
        HttpRequest request = buildReturnCompanyModelRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnCompanyModelResponse(context);
    }

    /**
     * @return    Returns the Company response from the API call
     */
    public CompletableFuture<Company> returnCompanyModelAsync() {
        return makeHttpCallAsync(() -> buildReturnCompanyModelRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnCompanyModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnCompanyModel.
     */
    private HttpRequest buildReturnCompanyModelRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/company");

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
     * Processes the response for returnCompanyModel.
     * @return An object of type Company
     */
    private Company handleReturnCompanyModelResponse(
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
        Company result = ApiHelper.deserialize(responseBody,
                Company.class);

        return result;
    }

    /**
     * @return    Returns the BossCompany response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BossCompany returnBossModel() throws ApiException, IOException {
        HttpRequest request = buildReturnBossModelRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnBossModelResponse(context);
    }

    /**
     * @return    Returns the BossCompany response from the API call
     */
    public CompletableFuture<BossCompany> returnBossModelAsync() {
        return makeHttpCallAsync(() -> buildReturnBossModelRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnBossModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnBossModel.
     */
    private HttpRequest buildReturnBossModelRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/boss");

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
     * Processes the response for returnBossModel.
     * @return An object of type BossCompany
     */
    private BossCompany handleReturnBossModelResponse(
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
        BossCompany result = ApiHelper.deserialize(responseBody,
                BossCompany.class);

        return result;
    }

    /**
     * @return    Returns the EmployeeComp response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EmployeeComp returnEmployeeModel() throws ApiException, IOException {
        HttpRequest request = buildReturnEmployeeModelRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnEmployeeModelResponse(context);
    }

    /**
     * @return    Returns the EmployeeComp response from the API call
     */
    public CompletableFuture<EmployeeComp> returnEmployeeModelAsync() {
        return makeHttpCallAsync(() -> buildReturnEmployeeModelRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnEmployeeModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnEmployeeModel.
     */
    private HttpRequest buildReturnEmployeeModelRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/employee");

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
     * Processes the response for returnEmployeeModel.
     * @return An object of type EmployeeComp
     */
    private EmployeeComp handleReturnEmployeeModelResponse(
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
        EmployeeComp result = ApiHelper.deserialize(responseBody,
                EmployeeComp.class);

        return result;
    }

    /**
     * @return    Returns the Developer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Developer returnDeveloperModel() throws ApiException, IOException {
        HttpRequest request = buildReturnDeveloperModelRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnDeveloperModelResponse(context);
    }

    /**
     * @return    Returns the Developer response from the API call
     */
    public CompletableFuture<Developer> returnDeveloperModelAsync() {
        return makeHttpCallAsync(() -> buildReturnDeveloperModelRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnDeveloperModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnDeveloperModel.
     */
    private HttpRequest buildReturnDeveloperModelRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/developer");

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
     * Processes the response for returnDeveloperModel.
     * @return An object of type Developer
     */
    private Developer handleReturnDeveloperModelResponse(
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
        Developer result = ApiHelper.deserialize(responseBody,
                Developer.class);

        return result;
    }

    /**
     * @return    Returns the SoftwareTester response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SoftwareTester returnTesterModel() throws ApiException, IOException {
        HttpRequest request = buildReturnTesterModelRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnTesterModelResponse(context);
    }

    /**
     * @return    Returns the SoftwareTester response from the API call
     */
    public CompletableFuture<SoftwareTester> returnTesterModelAsync() {
        return makeHttpCallAsync(() -> buildReturnTesterModelRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnTesterModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnTesterModel.
     */
    private HttpRequest buildReturnTesterModelRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/tester");

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
     * Processes the response for returnTesterModel.
     * @return An object of type SoftwareTester
     */
    private SoftwareTester handleReturnTesterModelResponse(
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
        SoftwareTester result = ApiHelper.deserialize(responseBody,
                SoftwareTester.class);

        return result;
    }

    /**
     * @return    Returns the Complex1 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex1 returnComplex1Object() throws ApiException, IOException {
        HttpRequest request = buildReturnComplex1ObjectRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnComplex1ObjectResponse(context);
    }

    /**
     * @return    Returns the Complex1 response from the API call
     */
    public CompletableFuture<Complex1> returnComplex1ObjectAsync() {
        return makeHttpCallAsync(() -> buildReturnComplex1ObjectRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnComplex1ObjectResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnComplex1Object.
     */
    private HttpRequest buildReturnComplex1ObjectRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/complex1");

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
     * Processes the response for returnComplex1Object.
     * @return An object of type Complex1
     */
    private Complex1 handleReturnComplex1ObjectResponse(
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
        Complex1 result = ApiHelper.deserialize(responseBody,
                Complex1.class);

        return result;
    }

    /**
     * @return    Returns the ResponseWithEnum response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ResponseWithEnum returnResponseWithEnums() throws ApiException, IOException {
        HttpRequest request = buildReturnResponseWithEnumsRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnResponseWithEnumsResponse(context);
    }

    /**
     * @return    Returns the ResponseWithEnum response from the API call
     */
    public CompletableFuture<ResponseWithEnum> returnResponseWithEnumsAsync() {
        return makeHttpCallAsync(() -> buildReturnResponseWithEnumsRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnResponseWithEnumsResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnResponseWithEnums.
     */
    private HttpRequest buildReturnResponseWithEnumsRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/responseWitEnum");

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
     * Processes the response for returnResponseWithEnums.
     * @return An object of type ResponseWithEnum
     */
    private ResponseWithEnum handleReturnResponseWithEnumsResponse(
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
        ResponseWithEnum result = ApiHelper.deserialize(responseBody,
                ResponseWithEnum.class);

        return result;
    }

    /**
     * @return    Returns the Complex2 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex2 returnComplex2Object() throws ApiException, IOException {
        HttpRequest request = buildReturnComplex2ObjectRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnComplex2ObjectResponse(context);
    }

    /**
     * @return    Returns the Complex2 response from the API call
     */
    public CompletableFuture<Complex2> returnComplex2ObjectAsync() {
        return makeHttpCallAsync(() -> buildReturnComplex2ObjectRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnComplex2ObjectResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnComplex2Object.
     */
    private HttpRequest buildReturnComplex2ObjectRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/complex2");

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
     * Processes the response for returnComplex2Object.
     * @return An object of type Complex2
     */
    private Complex2 handleReturnComplex2ObjectResponse(
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
        Complex2 result = ApiHelper.deserialize(responseBody,
                Complex2.class);

        return result;
    }

    /**
     * @return    Returns the Complex3 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Complex3 returnComplex3Object() throws ApiException, IOException {
        HttpRequest request = buildReturnComplex3ObjectRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleReturnComplex3ObjectResponse(context);
    }

    /**
     * @return    Returns the Complex3 response from the API call
     */
    public CompletableFuture<Complex3> returnComplex3ObjectAsync() {
        return makeHttpCallAsync(() -> buildReturnComplex3ObjectRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleReturnComplex3ObjectResponse(context));
    }

    /**
     * Builds the HttpRequest object for returnComplex3Object.
     */
    private HttpRequest buildReturnComplex3ObjectRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/complex3");

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
     * Processes the response for returnComplex3Object.
     * @return An object of type Complex3
     */
    private Complex3 handleReturnComplex3ObjectResponse(
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
        Complex3 result = ApiHelper.deserialize(responseBody,
                Complex3.class);

        return result;
    }

    /**
     * @return    Returns the Long response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Long getLong() throws ApiException, IOException {
        HttpRequest request = buildGetLongRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetLongResponse(context);
    }

    /**
     * @return    Returns the Long response from the API call
     */
    public CompletableFuture<Long> getLongAsync() {
        return makeHttpCallAsync(() -> buildGetLongRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetLongResponse(context));
    }

    /**
     * Builds the HttpRequest object for getLong.
     */
    private HttpRequest buildGetLongRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri(Server.ENUM_DEFAULT);

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/long");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getLong.
     * @return An object of type long
     */
    private Long handleGetLongResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        long result = Long.parseLong(responseBody);

        return result;
    }

    /**
     * @return    Returns the Person response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Person getModel() throws ApiException, IOException {
        HttpRequest request = buildGetModelRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetModelResponse(context);
    }

    /**
     * @return    Returns the Person response from the API call
     */
    public CompletableFuture<Person> getModelAsync() {
        return makeHttpCallAsync(() -> buildGetModelRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetModelResponse(context));
    }

    /**
     * Builds the HttpRequest object for getModel.
     */
    private HttpRequest buildGetModelRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/model");

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
     * Processes the response for getModel.
     * @return An object of type Person
     */
    private Person handleGetModelResponse(
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
        Person result = ApiHelper.deserialize(responseBody,
                Person.class);

        return result;
    }

    /**
     * @return    Returns the List of Days response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Days> getStringEnumArray() throws ApiException, IOException {
        HttpRequest request = buildGetStringEnumArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetStringEnumArrayResponse(context);
    }

    /**
     * @return    Returns the List of Days response from the API call
     */
    public CompletableFuture<List<Days>> getStringEnumArrayAsync() {
        return makeHttpCallAsync(() -> buildGetStringEnumArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetStringEnumArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for getStringEnumArray.
     */
    private HttpRequest buildGetStringEnumArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/enum");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");
        queryParameters.put("type", "string");

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
     * Processes the response for getStringEnumArray.
     * @return An object of type List of Days
     */
    private List<Days> handleGetStringEnumArrayResponse(
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
        List<Days> result = ApiHelper.deserializeArray(responseBody,
                Days[].class);

        return result;
    }

    /**
     * @return    Returns the Days response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Days getStringEnum() throws ApiException, IOException {
        HttpRequest request = buildGetStringEnumRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetStringEnumResponse(context);
    }

    /**
     * @return    Returns the Days response from the API call
     */
    public CompletableFuture<Days> getStringEnumAsync() {
        return makeHttpCallAsync(() -> buildGetStringEnumRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetStringEnumResponse(context));
    }

    /**
     * Builds the HttpRequest object for getStringEnum.
     */
    private HttpRequest buildGetStringEnumRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/enum");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("type", "string");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


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
     * Processes the response for getStringEnum.
     * @return An object of type Days
     */
    private Days handleGetStringEnumResponse(
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
        Days result = Days.fromString(responseBody);

        return result;
    }

    /**
     * @return    Returns the List of Person response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Person> getModelArray() throws ApiException, IOException {
        HttpRequest request = buildGetModelArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetModelArrayResponse(context);
    }

    /**
     * @return    Returns the List of Person response from the API call
     */
    public CompletableFuture<List<Person>> getModelArrayAsync() {
        return makeHttpCallAsync(() -> buildGetModelArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetModelArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for getModelArray.
     */
    private HttpRequest buildGetModelArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/model");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

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
     * Processes the response for getModelArray.
     * @return An object of type List of Person
     */
    private List<Person> handleGetModelArrayResponse(
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
        List<Person> result = ApiHelper.deserializeArray(responseBody,
                Person[].class);
        return result;
    }

    /**
     * @return    Returns the SuiteCode response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SuiteCode getIntEnum() throws ApiException, IOException {
        HttpRequest request = buildGetIntEnumRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetIntEnumResponse(context);
    }

    /**
     * @return    Returns the SuiteCode response from the API call
     */
    public CompletableFuture<SuiteCode> getIntEnumAsync() {
        return makeHttpCallAsync(() -> buildGetIntEnumRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetIntEnumResponse(context));
    }

    /**
     * Builds the HttpRequest object for getIntEnum.
     */
    private HttpRequest buildGetIntEnumRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/enum");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("type", "int");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


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
     * Processes the response for getIntEnum.
     * @return An object of type SuiteCode
     */
    private SuiteCode handleGetIntEnumResponse(
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
        SuiteCode result = SuiteCode.fromInteger(Integer.parseInt(responseBody));

        return result;
    }

    /**
     * @return    Returns the List of SuiteCode response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<SuiteCode> getIntEnumArray() throws ApiException, IOException {
        HttpRequest request = buildGetIntEnumArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetIntEnumArrayResponse(context);
    }

    /**
     * @return    Returns the List of SuiteCode response from the API call
     */
    public CompletableFuture<List<SuiteCode>> getIntEnumArrayAsync() {
        return makeHttpCallAsync(() -> buildGetIntEnumArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetIntEnumArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for getIntEnumArray.
     */
    private HttpRequest buildGetIntEnumArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/enum");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");
        queryParameters.put("type", "int");

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
     * Processes the response for getIntEnumArray.
     * @return An object of type List of SuiteCode
     */
    private List<SuiteCode> handleGetIntEnumArrayResponse(
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
        List<SuiteCode> result = ApiHelper.deserializeArray(responseBody,
                SuiteCode[].class);

        return result;
    }

    /**
     * @return    Returns the Double response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Double getPrecision() throws ApiException, IOException {
        HttpRequest request = buildGetPrecisionRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetPrecisionResponse(context);
    }

    /**
     * @return    Returns the Double response from the API call
     */
    public CompletableFuture<Double> getPrecisionAsync() {
        return makeHttpCallAsync(() -> buildGetPrecisionRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetPrecisionResponse(context));
    }

    /**
     * Builds the HttpRequest object for getPrecision.
     */
    private HttpRequest buildGetPrecisionRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/precision");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getPrecision.
     * @return An object of type double
     */
    private Double handleGetPrecisionResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        double result = Double.parseDouble(responseBody);

        return result;
    }

    /**
     * <testing> gets a binary object.
     * @return    Returns the InputStream response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InputStream getBinary() throws ApiException, IOException {
        HttpRequest request = buildGetBinaryRequest();
        HttpResponse response = getClientInstance().execute(request, true);
        HttpContext context = new HttpContext(request, response);

        return handleGetBinaryResponse(context);
    }

    /**
     * <testing> gets a binary object.
     * @return    Returns the InputStream response from the API call
     */
    public CompletableFuture<InputStream> getBinaryAsync() {
        return makeHttpCallAsync(() -> buildGetBinaryRequest(),
            request -> getClientInstance().executeAsync(request, true),
            context -> handleGetBinaryResponse(context));
    }

    /**
     * Builds the HttpRequest object for getBinary.
     */
    private HttpRequest buildGetBinaryRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/binary");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getBinary.
     * @return An object of type InputStream
     */
    private InputStream handleGetBinaryResponse(
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
        InputStream result = response.getRawBody();
        return result;
    }

    /**
     * <testing> Gets a integer response.
     * @return    Returns the Integer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Integer getInteger() throws ApiException, IOException {
        HttpRequest request = buildGetIntegerRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetIntegerResponse(context);
    }

    /**
     * <testing> Gets a integer response.
     * @return    Returns the Integer response from the API call
     */
    public CompletableFuture<Integer> getIntegerAsync() {
        return makeHttpCallAsync(() -> buildGetIntegerRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetIntegerResponse(context));
    }

    /**
     * Builds the HttpRequest object for getInteger.
     */
    private HttpRequest buildGetIntegerRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/integer");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getInteger.
     * @return An object of type int
     */
    private Integer handleGetIntegerResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        int result = Integer.parseInt(responseBody);

        return result;
    }

    /**
     * <testing> Get an array of integers.
     * @return    Returns the List of Integer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Integer> getIntegerArray() throws ApiException, IOException {
        HttpRequest request = buildGetIntegerArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetIntegerArrayResponse(context);
    }

    /**
     * <testing> Get an array of integers.
     * @return    Returns the List of Integer response from the API call
     */
    public CompletableFuture<List<Integer>> getIntegerArrayAsync() {
        return makeHttpCallAsync(() -> buildGetIntegerArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetIntegerArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for getIntegerArray.
     */
    private HttpRequest buildGetIntegerArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/integer");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

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
     * Processes the response for getIntegerArray.
     * @return An object of type List of Integer
     */
    private List<Integer> handleGetIntegerArrayResponse(
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
        List<Integer> result = ApiHelper.deserializeArray(responseBody,
                Integer[].class);

        return result;
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DynamicResponse getDynamic() throws ApiException, IOException {
        HttpRequest request = buildGetDynamicRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetDynamicResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> getDynamicAsync() {
        return makeHttpCallAsync(() -> buildGetDynamicRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetDynamicResponse(context));
    }

    /**
     * Builds the HttpRequest object for getDynamic.
     */
    private HttpRequest buildGetDynamicRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/dynamic");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("echo", "true");

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
     * Processes the response for getDynamic.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleGetDynamicResponse(
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
    public DynamicResponse getDynamicArray() throws ApiException, IOException {
        HttpRequest request = buildGetDynamicArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetDynamicArrayResponse(context);
    }

    /**
     * @return    Returns the DynamicResponse response from the API call
     */
    public CompletableFuture<DynamicResponse> getDynamicArrayAsync() {
        return makeHttpCallAsync(() -> buildGetDynamicArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetDynamicArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for getDynamicArray.
     */
    private HttpRequest buildGetDynamicArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/dynamic");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");
        queryParameters.put("echo", "true");

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
     * Processes the response for getDynamicArray.
     * @return An object of type DynamicResponse
     */
    private DynamicResponse handleGetDynamicArrayResponse(
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
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LocalDateTime get3339Datetime() throws ApiException, IOException {
        HttpRequest request = buildGet3339DatetimeRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGet3339DatetimeResponse(context);
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    public CompletableFuture<LocalDateTime> get3339DatetimeAsync() {
        return makeHttpCallAsync(() -> buildGet3339DatetimeRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGet3339DatetimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for get3339Datetime.
     */
    private HttpRequest buildGet3339DatetimeRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/3339datetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for get3339Datetime.
     * @return An object of type LocalDateTime
     */
    private LocalDateTime handleGet3339DatetimeResponse(
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
        LocalDateTime result = DateTimeHelper.fromRfc8601DateTime(responseBody);

        return result;
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocalDateTime> get3339DatetimeArray() throws ApiException, IOException {
        HttpRequest request = buildGet3339DatetimeArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGet3339DatetimeArrayResponse(context);
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    public CompletableFuture<List<LocalDateTime>> get3339DatetimeArrayAsync() {
        return makeHttpCallAsync(() -> buildGet3339DatetimeArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGet3339DatetimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for get3339DatetimeArray.
     */
    private HttpRequest buildGet3339DatetimeArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/3339datetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

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
     * Processes the response for get3339DatetimeArray.
     * @return An object of type List of LocalDateTime
     */
    private List<LocalDateTime> handleGet3339DatetimeArrayResponse(
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
        List<LocalDateTime> result = ApiHelper.deserialize(responseBody,
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.Rfc8601DateTimeDeserializer());

        return result;
    }

    /**
     * @return    Returns the Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Boolean getBoolean() throws ApiException, IOException {
        HttpRequest request = buildGetBooleanRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetBooleanResponse(context);
    }

    /**
     * @return    Returns the Boolean response from the API call
     */
    public CompletableFuture<Boolean> getBooleanAsync() {
        return makeHttpCallAsync(() -> buildGetBooleanRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetBooleanResponse(context));
    }

    /**
     * Builds the HttpRequest object for getBoolean.
     */
    private HttpRequest buildGetBooleanRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/boolean");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getBoolean.
     * @return An object of type boolean
     */
    private Boolean handleGetBooleanResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        boolean result = Boolean.parseBoolean(responseBody);

        return result;
    }

    /**
     * @return    Returns the List of Boolean response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<Boolean> getBooleanArray() throws ApiException, IOException {
        HttpRequest request = buildGetBooleanArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetBooleanArrayResponse(context);
    }

    /**
     * @return    Returns the List of Boolean response from the API call
     */
    public CompletableFuture<List<Boolean>> getBooleanArrayAsync() {
        return makeHttpCallAsync(() -> buildGetBooleanArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetBooleanArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for getBooleanArray.
     */
    private HttpRequest buildGetBooleanArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/boolean");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

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
     * Processes the response for getBooleanArray.
     * @return An object of type List of Boolean
     */
    private List<Boolean> handleGetBooleanArrayResponse(
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
        List<Boolean> result = ApiHelper.deserializeArray(responseBody,
                Boolean[].class);

        return result;
    }

    /**
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void getHeaders() throws ApiException, IOException {
        HttpRequest request = buildGetHeadersRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleGetHeadersResponse(context);
    }

    /**
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> getHeadersAsync() {
        return makeHttpCallAsync(() -> buildGetHeadersRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetHeadersResponse(context));
    }

    /**
     * Builds the HttpRequest object for getHeaders.
     */
    private HttpRequest buildGetHeadersRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/headers");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getHeaders.
     * @return An object of type void
     */
    private Void handleGetHeadersResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        return null;
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LocalDateTime get1123DateTime() throws ApiException, IOException {
        HttpRequest request = buildGet1123DateTimeRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGet1123DateTimeResponse(context);
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    public CompletableFuture<LocalDateTime> get1123DateTimeAsync() {
        return makeHttpCallAsync(() -> buildGet1123DateTimeRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGet1123DateTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for get1123DateTime.
     */
    private HttpRequest buildGet1123DateTimeRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/1123datetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for get1123DateTime.
     * @return An object of type LocalDateTime
     */
    private LocalDateTime handleGet1123DateTimeResponse(
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
        LocalDateTime result = DateTimeHelper.fromRfc1123DateTime(responseBody);

        return result;
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LocalDateTime getUnixDateTime() throws ApiException, IOException {
        HttpRequest request = buildGetUnixDateTimeRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetUnixDateTimeResponse(context);
    }

    /**
     * @return    Returns the LocalDateTime response from the API call
     */
    public CompletableFuture<LocalDateTime> getUnixDateTimeAsync() {
        return makeHttpCallAsync(() -> buildGetUnixDateTimeRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetUnixDateTimeResponse(context));
    }

    /**
     * Builds the HttpRequest object for getUnixDateTime.
     */
    private HttpRequest buildGetUnixDateTimeRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/unixdatetime");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getUnixDateTime.
     * @return An object of type LocalDateTime
     */
    private LocalDateTime handleGetUnixDateTimeResponse(
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
        LocalDateTime result = DateTimeHelper.fromUnixTimestamp(responseBody);

        return result;
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocalDateTime> get1123DateTimeArray() throws ApiException, IOException {
        HttpRequest request = buildGet1123DateTimeArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGet1123DateTimeArrayResponse(context);
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    public CompletableFuture<List<LocalDateTime>> get1123DateTimeArrayAsync() {
        return makeHttpCallAsync(() -> buildGet1123DateTimeArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGet1123DateTimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for get1123DateTimeArray.
     */
    private HttpRequest buildGet1123DateTimeArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/1123datetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

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
     * Processes the response for get1123DateTimeArray.
     * @return An object of type List of LocalDateTime
     */
    private List<LocalDateTime> handleGet1123DateTimeArrayResponse(
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
        List<LocalDateTime> result = ApiHelper.deserialize(responseBody,
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.Rfc1123DateTimeDeserializer());

        return result;
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<LocalDateTime> getUnixDateTimeArray() throws ApiException, IOException {
        HttpRequest request = buildGetUnixDateTimeArrayRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetUnixDateTimeArrayResponse(context);
    }

    /**
     * @return    Returns the List of LocalDateTime response from the API call
     */
    public CompletableFuture<List<LocalDateTime>> getUnixDateTimeArrayAsync() {
        return makeHttpCallAsync(() -> buildGetUnixDateTimeArrayRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetUnixDateTimeArrayResponse(context));
    }

    /**
     * Builds the HttpRequest object for getUnixDateTimeArray.
     */
    private HttpRequest buildGetUnixDateTimeArrayRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/unixdatetime");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("array", "true");

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
     * Processes the response for getUnixDateTimeArray.
     * @return An object of type List of LocalDateTime
     */
    private List<LocalDateTime> handleGetUnixDateTimeArrayResponse(
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
        List<LocalDateTime> result = ApiHelper.deserialize(responseBody,
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.UnixTimestampDeserializer());

        return result;
    }

    /**
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void getContentTypeHeaders() throws ApiException, IOException {
        HttpRequest request = buildGetContentTypeHeadersRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        handleGetContentTypeHeadersResponse(context);
    }

    /**
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> getContentTypeHeadersAsync() {
        return makeHttpCallAsync(() -> buildGetContentTypeHeadersRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleGetContentTypeHeadersResponse(context));
    }

    /**
     * Builds the HttpRequest object for getContentTypeHeaders.
     */
    private HttpRequest buildGetContentTypeHeadersRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/response/getContentType");

        //load all headers for the outgoing API request
        Headers headers = new Headers();


        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getContentTypeHeaders.
     * @return An object of type void
     */
    private Void handleGetContentTypeHeadersResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        return null;
    }

}