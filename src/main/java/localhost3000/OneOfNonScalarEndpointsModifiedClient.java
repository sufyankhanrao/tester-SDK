/*
 * OneOfNonScalarEndpointsModifiedLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import localhost3000.controllers.Group1Controller;
import localhost3000.controllers.Group2Controller;
import localhost3000.http.client.HttpClient;
import localhost3000.http.client.HttpClientConfiguration;
import localhost3000.http.client.OkClient;
import localhost3000.http.client.ReadonlyHttpClientConfiguration;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class OneOfNonScalarEndpointsModifiedClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private Group1Controller group1;
    private Group2Controller group2;

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * version value.
     */
    private final String version;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * Map of authentication Managers.
     */
    private Map<String, AuthManager> authManagers;

    private OneOfNonScalarEndpointsModifiedClient(Environment environment, String version,
            HttpClient httpClient, ReadonlyHttpClientConfiguration httpClientConfig,
            Map<String, AuthManager> authManagers) {
        this.environment = environment;
        this.version = version;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;

        this.authManagers = (authManagers == null) ? new HashMap<>() : new HashMap<>(authManagers);


        group1 = new Group1Controller(this, this.httpClient, this.authManagers);
        group2 = new Group2Controller(this, this.httpClient, this.authManagers);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of Group1Controller.
     * @return group1
     */
    public Group1Controller getGroup1Controller() {
        return group1;
    }

    /**
     * Get the instance of Group2Controller.
     * @return group2
     */
    public Group2Controller getGroup2Controller() {
        return group2;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * version value.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        parameters.put("version",
                new SimpleEntry<Object, Boolean>(this.version, false));
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }

    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "http://example.com/{version}";
            }
        }
        if (environment.equals(Environment.TESTING)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "http://localhost:3000";
            }
        }
        return "http://localhost:3000";
    }

    /**
     * Converts this OneOfNonScalarEndpointsModifiedClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OneOfNonScalarEndpointsModifiedClient [" + "environment=" + environment
                + ", version=" + version + ", httpClientConfig=" + httpClientConfig
                + ", authManagers=" + authManagers + "]";
    }

    /**
     * Builds a new {@link OneOfNonScalarEndpointsModifiedClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link OneOfNonScalarEndpointsModifiedClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.version = getVersion();
        builder.httpClient = getHttpClient();
        builder.authManagers = authManagers;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link OneOfNonScalarEndpointsModifiedClient}.
     */
    public static class Builder {

        private Environment environment = Environment.TESTING;
        private String version = "v1";
        private HttpClient httpClient;
        private Map<String, AuthManager> authManagers = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * version value.
         * @param version The version for client.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new OneOfNonScalarEndpointsModifiedClient object using the set fields.
         * @return OneOfNonScalarEndpointsModifiedClient
         */
        public OneOfNonScalarEndpointsModifiedClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig);

            return new OneOfNonScalarEndpointsModifiedClient(environment, version, httpClient,
                    httpClientConfig, authManagers);
        }
    }
}