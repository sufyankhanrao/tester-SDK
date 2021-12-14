/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
import localhost3000.http.request.HttpRequest;

/**
 * Interface for defining the behavior of Authentication Classes.
 */
public interface AuthManager {

    /**
     * Adds authentication to the given HttpRequest.
     * @param httpRequest   HttpRequest object for authentication
     * @return Returns the object of HttpRequest
     * @throws ApiException   Represents error response from the server.
     * @throws IOException   Signals that an I/O exception of some sort has occurred.
     */
    HttpRequest apply(HttpRequest httpRequest) throws ApiException, IOException;

    /**
     * Asynchronously adds authentication to the given HttpRequest.
     * @param httpRequest   HttpRequest object for authentication
     * @return Returns the completable future of HttpRequest
     */
    CompletableFuture<HttpRequest> applyAsync(HttpRequest httpRequest);
}
