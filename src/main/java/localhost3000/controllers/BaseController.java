/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
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
import localhost3000.exceptions.GlobalTestException;
import localhost3000.exceptions.NestedModelException;
import localhost3000.exceptions.Rfc1123Exception;
import localhost3000.exceptions.SendBooleanInModelAsException;
import localhost3000.exceptions.SendDateInModelAsException;
import localhost3000.exceptions.SendDynamicInModelAsException;
import localhost3000.exceptions.SendLongInModelAsException;
import localhost3000.exceptions.SendNumberInModelAsException;
import localhost3000.exceptions.SendPrecisionInModelAsException;
import localhost3000.exceptions.SendRfc1123InModelAsException;
import localhost3000.exceptions.SendRfc3339InModelAsException;
import localhost3000.exceptions.SendStringInModelAsException;
import localhost3000.exceptions.SendUnixTimeStampInModelAsException;
import localhost3000.exceptions.SendUuidInModelAsException;
import localhost3000.exceptions.UnixTimeStampException;
import localhost3000.http.client.HttpCallback;
import localhost3000.http.client.HttpClient;
import localhost3000.http.client.HttpContext;
import localhost3000.http.request.HttpRequest;
import localhost3000.http.response.HttpResponse;

/**
 * Base class for all Controllers.
 */
public abstract class BaseController {

    /**
     * Protected variables to hold an instance of Configuration.
     */
    protected final Configuration config;

    /**
     * Protected variable to hold an instance of HttpCallback if the user provides it.
     */
    protected final HttpCallback httpCallback;

    protected Map<String, AuthManager> authManagers;

    private HttpClient httpClient;

    protected BaseController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        this(config, httpClient, authManagers, null);
    }
    
    protected BaseController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        this.config = config;
        this.httpClient = httpClient;
        this.authManagers = authManagers;
        this.httpCallback = httpCallback;
    }
    
    /**
     * Get httpCallback associated with this controller.
     * @return HttpCallback
     */
    public HttpCallback getHttpCallback() {
        return httpCallback;
    }
    
    /**
     * Shared instance of the Http client.
     * @return The shared instance of the http client 
     */
    public HttpClient getClientInstance() {
        return httpClient;
    }

    /**
     * Validates the response against HTTP errors defined at the API level.
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response
     * @throws    ApiException    Represents error response from the server.
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws ApiException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if (responseCode == 400) {
            throw new ApiException("400 Global", context);
        }

        if (responseCode == 402) {
            throw new ApiException("402 Global", context);
        }

        if (responseCode == 403) {
            throw new ApiException("403 Global", context);
        }

        if (responseCode == 404) {
            throw new ApiException("404 Global", context);
        }

        if (responseCode == 412) {
            throw new NestedModelException("Precondition Failed", context);
        }

        if (responseCode == 450) {
            throw new CustomErrorResponseException("caught global exception", context);
        }

        if (responseCode == 452) {
            throw new ExceptionWithStringException("global exception with string", context);
        }

        if (responseCode == 453) {
            throw new ExceptionWithBooleanException("boolean in global exception", context);
        }

        if (responseCode == 454) {
            throw new ExceptionWithDynamicException("dynamic in global exception", context);
        }

        if (responseCode == 455) {
            throw new ExceptionWithUUIDException("uuid in global exception", context);
        }

        if (responseCode == 456) {
            throw new ExceptionWithDateException("date in global exception", context);
        }

        if (responseCode == 457) {
            throw new ExceptionWithNumberException("number in global  exception", context);
        }

        if (responseCode == 458) {
            throw new ExceptionWithLongException("long in global exception", context);
        }

        if (responseCode == 459) {
            throw new ExceptionWithPrecisionException("precision in global  exception", context);
        }

        if (responseCode == 460) {
            throw new ExceptionWithRfc3339DateTimeException("rfc3339 in global exception", context);
        }

        if (responseCode == 461) {
            throw new UnixTimeStampException("unix time stamp in global exception", context);
        }

        if (responseCode == 462) {
            throw new Rfc1123Exception("rfc1123 in global exception", context);
        }

        if (responseCode == 463) {
            throw new SendBooleanInModelAsException("boolean in model as global exception",
                    context);
        }

        if (responseCode == 464) {
            throw new SendRfc3339InModelAsException("rfc3339 in model as global exception",
                    context);
        }

        if (responseCode == 465) {
            throw new SendRfc1123InModelAsException("rfc1123 in model as global exception",
                    context);
        }

        if (responseCode == 466) {
            throw new SendUnixTimeStampInModelAsException(
                    "unix time stamp in model as global exception", context);
        }

        if (responseCode == 467) {
            throw new SendDateInModelAsException("send date in model as global exception", context);
        }

        if (responseCode == 468) {
            throw new SendDynamicInModelAsException("send dynamic in model as global exception",
                    context);
        }

        if (responseCode == 469) {
            throw new SendStringInModelAsException("send string in model as global exception",
                    context);
        }

        if (responseCode == 470) {
            throw new SendLongInModelAsException("send long in model as global exception", context);
        }

        if (responseCode == 471) {
            throw new SendNumberInModelAsException("send number in model as global exception",
                    context);
        }

        if (responseCode == 472) {
            throw new SendPrecisionInModelAsException("send precision in model as global exception",
                    context);
        }

        if (responseCode == 473) {
            throw new SendUuidInModelAsException("send uuid in model as global exception", context);
        }

        if (responseCode == 500) {
            throw new GlobalTestException("500 Global", context);
        }

        if ((responseCode < 200) || (responseCode > 208)) { //[200,208] = HTTP OK
            throw new GlobalTestException("Invalid response.", context);
        }

    }

    /**
     * RequestSupplier.
     */
    protected interface RequestSupplier {
        
        /**
         * Supplies the HttpRequest object.
         * @return    An object of type HttpRequest
         * @throws    ApiException    Represents error response from the server.
         * @throws    IOException    Signals that an I/O exception of some sort has occurred.
        */
        HttpRequest supply() throws ApiException, IOException;
    }

    /**
     * RequestExecutor.
     */
    protected interface RequestExecutor {

        /**
         * Execute a given HttpRequest to get the response back.
         * @param   request    The given HttpRequest to execute
         * @return  CompletableFuture of HttpResponse after execution
         */
        CompletableFuture<HttpResponse> execute(HttpRequest request);
    }

    /**
     * ResponseHandler.
     */
    protected interface ResponseHandler<T> {
        
        /**
         * Handles the response for an endpoint.
         * @param   context    HttpContext of the request and the received response
         * @return   An object of type T .
         * @throws    ApiException    Represents error response from the server.
         * @throws    IOException    Signals that an I/O exception of some sort has occurred.
         */
        T handle(HttpContext context) throws ApiException, IOException;
    }
    
    /**
     * Make an asynchronous HTTP endpoint call.
     * @param   <T>    The type of the object for response
     * @param   requestSupplier    An object of RequestSupplier to supply an instance of HttpRequest
     * @param   requestExecutor    An object of RequestExecutor to execute the given request
     * @param   responseHandler    An object of ResponseHandler to handle the endpoint response
     * @return  An object of type CompletableFuture of T
     */
    public <T> CompletableFuture<T> makeHttpCallAsync(RequestSupplier requestSupplier,
            RequestExecutor requestExecutor, ResponseHandler<T> responseHandler) {
        final HttpRequest request;
        try {
            request = requestSupplier.supply();
        } catch (Exception e) {
            CompletableFuture<T> futureResponse = new CompletableFuture<>();
            futureResponse.completeExceptionally(e);
            return futureResponse;
        }

        // Invoke request and get response
        return requestExecutor.execute(request).thenApplyAsync(response -> {
            HttpContext context = new HttpContext(request, response);
            try {
                return responseHandler.handle(context);
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }
}
