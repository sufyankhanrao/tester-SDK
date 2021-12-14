/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000;

import localhost3000.http.client.ReadonlyHttpClientConfiguration;
import localhost3000.http.client.ReadonlyLoggingConfiguration;
import localhost3000.models.SuiteCode;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * port value.
     * @return a copy of port
     */
    String getPort();

    /**
     * suites value.
     * @return a copy of suites
     */
    SuiteCode getSuites();

    /**
     * Http Client Configuration instance. 
     * See available [builder methods here](__HttpClientConfiguration.Builder).
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * Logging Configuration instance.
     * @return a copy of loggingConfig
     */
    ReadonlyLoggingConfiguration getLoggingConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}
