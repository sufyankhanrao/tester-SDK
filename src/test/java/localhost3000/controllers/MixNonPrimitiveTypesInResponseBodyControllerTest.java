/*
 * OneOfNonScalarEndpointsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import localhost3000.OneOfNonScalarEndpointsClient;
import localhost3000.exceptions.ApiException;
import localhost3000.models.containers.GetOneofContainerOfAnyofSession;
import localhost3000.testing.TestHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MixNonPrimitiveTypesInResponseBodyControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static OneOfNonScalarEndpointsClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static MixNonPrimitiveTypesInResponseBodyController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getMixNonPrimitiveTypesInResponseBodyController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for get_oneof_container_of_anyof.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGetOneofContainerOfAnyof() throws Exception {
        // Parameters for the API call
        boolean isPrimitiveType = false;
        boolean isAtEndpointLevel = true;
        boolean hasDiscriminator = false;

        // Set callback and perform API call
        GetOneofContainerOfAnyofSession result = null;
        try {
            result = controller.getOneofContainerOfAnyof(isPrimitiveType, isAtEndpointLevel, hasDiscriminator);
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
                TestHelper.isProperSubsetOf(
                "{\"startsAt\":\"12:00\",\"endsAt\":\"18:00\",\"offerLunch\":true}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                true, true, false));
    }

}