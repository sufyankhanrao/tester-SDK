/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
import localhost3000.models.CustomAttributeDefinition;
import localhost3000.models.CustomAttributeValue;
import localhost3000.models.ServerResponse;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface APIController {
    /**
     * @param  customAttributeDefinition  Required parameter: Example:
     * @param  setToNull  Required parameter: Example:
     * @param  unSet  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendCustomAttributeDefinition(
            final CustomAttributeDefinition customAttributeDefinition,
            final boolean setToNull,
            final boolean unSet) throws ApiException, IOException;

    /**
     * @param  customAttributeDefinition  Required parameter: Example:
     * @param  setToNull  Required parameter: Example:
     * @param  unSet  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendCustomAttributeDefinitionAsync(
            final CustomAttributeDefinition customAttributeDefinition,
            final boolean setToNull,
            final boolean unSet);

    /**
     * @param  customAttributeValue  Required parameter: Example:
     * @param  setToNull  Required parameter: Example:
     * @param  unSet  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendCustomAttributeValue(
            final CustomAttributeValue customAttributeValue,
            final boolean setToNull,
            final boolean unSet) throws ApiException, IOException;

    /**
     * @param  customAttributeValue  Required parameter: Example:
     * @param  setToNull  Required parameter: Example:
     * @param  unSet  Required parameter: Example:
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendCustomAttributeValueAsync(
            final CustomAttributeValue customAttributeValue,
            final boolean setToNull,
            final boolean unSet);

}