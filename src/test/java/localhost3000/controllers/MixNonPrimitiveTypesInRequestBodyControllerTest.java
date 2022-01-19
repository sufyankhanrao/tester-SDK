/*
 * AnyOfNonScalarEndpointsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import localhost3000.AnyOfNonScalarEndpointsClient;
import localhost3000.ApiHelper;
import localhost3000.exceptions.ApiException;
import localhost3000.models.ServerResponse;
import localhost3000.models.containers.SendAnyofContainerOfOneofSession;
import localhost3000.testing.TestHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MixNonPrimitiveTypesInRequestBodyControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static AnyOfNonScalarEndpointsClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static MixNonPrimitiveTypesInRequestBodyController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getMixNonPrimitiveTypesInRequestBodyController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for send_anyof_container_of_oneof.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendAnyofContainerOfOneof() throws Exception {
        // Parameters for the API call
        boolean isPrimitiveType = false;
        boolean isAtEndpointLevel = true;
        boolean hasDiscriminator = false;
        SendAnyofContainerOfOneofSession session = ApiHelper.deserialize(
                "{\"startsAt\":\"08:00\",\"endsAt\":\"14:00\",\"offerTeaBreak\":true}", SendAnyofContainerOfOneofSession.class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendAnyofContainerOfOneof(isPrimitiveType, isAtEndpointLevel, hasDiscriminator, session);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys and/or values", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"passed\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}
