/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000;

import localhost3000.controllers.APIController;

/**
 * Gateway interface for the library.
 * This acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public interface JsonValueTesterClientInterface extends Configuration {
    
    /**
     * Provides access to Client controller.
     * @return Returns the APIController instance
     */
    APIController getAPIController();

}