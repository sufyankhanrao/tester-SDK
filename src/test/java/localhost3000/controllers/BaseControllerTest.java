/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import localhost3000.Environment;
import localhost3000.JsonValueTesterClient;
import localhost3000.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 60;

    public static final double ASSERT_PRECISION = 0.1;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static JsonValueTesterClient createConfigurationFromEnvironment() {
        JsonValueTesterClient.Builder builder = new JsonValueTesterClient.Builder();

        final String environment = System.getenv("JSON_VALUE_TESTER_LIB_ENVIRONMENT");
        final String timeout = System.getenv("JSON_VALUE_TESTER_LIB_TIMEOUT");

        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static JsonValueTesterClient createConfiguration() {
        // Set Configuration parameters for test execution
        JsonValueTesterClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .environment(Environment.TESTING)
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
