/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import localhost3000.ApiHelper;
import localhost3000.JsonValueTesterClient;
import localhost3000.exceptions.ApiException;
import localhost3000.models.CustomAttributeDefinition;
import localhost3000.models.CustomAttributeValue;
import localhost3000.models.ServerResponse;
import localhost3000.testing.TestHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class APIControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static JsonValueTesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static APIController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAPIController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for Send Custom Attribute Definition.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendCustomAttributeDefinitionWithOptionalNullableUnset() throws Exception {
        // Parameters for the API call
        CustomAttributeDefinition customAttributeDefinition = ApiHelper.deserialize(
                "{\"name\":\"a name\",\"id\":\"definition-123\",\"schema\":{\"$id\":\"https://examp"
                + "le.com/person.schema.json\",\"$schema\":\"https://json-schema.org/draft/2020-12/"
                + "schema\",\"title\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName\":"
                + "{\"type\":\"string\",\"description\":\"The person's first name.\"},\"lastName\":"
                + "{\"type\":\"string\",\"description\":\"The person's last name.\",\"test\":null},"
                + "\"age\":{\"type\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}}}}"
                + "",
                CustomAttributeDefinition.class);
        boolean setToNull = false;
        boolean unSet = true;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendCustomAttributeDefinition(customAttributeDefinition, setToNull, unSet);
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

    /**
     * Test case for Send Custom Attribute Definition.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendCustomAttributeDefinitionWithOptionalNullableSetToSomeValue() throws Exception {
        // Parameters for the API call
        CustomAttributeDefinition customAttributeDefinition = ApiHelper.deserialize(
                "{\"name\":\"a name\",\"id\":\"definition-123\",\"schema\":{\"$id\":\"https://examp"
                + "le.com/person.schema.json\",\"$schema\":\"https://json-schema.org/draft/2020-12/"
                + "schema\",\"title\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName\":"
                + "{\"type\":\"string\",\"description\":\"The person's first name.\"},\"lastName\":"
                + "{\"type\":\"string\",\"description\":\"The person's last name.\",\"test\":null},"
                + "\"age\":{\"type\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}}},"
                + "\"commentSchema\":{\"$id\":\"https://example.com/person.schema.json\",\"$schema"
                + "\":\"https://json-schema.org/draft/2020-12/schema\",\"title\":\"Person\",\"type"
                + "\":\"object\",\"properties\":{\"firstName\":{\"type\":\"string\",\"description"
                + "\":\"The person's first name.\"},\"lastName\":{\"type\":\"string\",\"description"
                + "\":\"The person's last name.\",\"test\":null},\"age\":{\"type\":\"integer\",\"de"
                + "scription\":\"Age in years\",\"minimum\":0}}}}",
                CustomAttributeDefinition.class);
        boolean setToNull = false;
        boolean unSet = false;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendCustomAttributeDefinition(customAttributeDefinition, setToNull, unSet);
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

    /**
     * Test case for Send Custom Attribute Definition.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendCustomAttributeDefinitionWithOptionalNullableSetToNull() throws Exception {
        // Parameters for the API call
        CustomAttributeDefinition customAttributeDefinition = ApiHelper.deserialize(
                "{\"name\":\"a name\",\"id\":\"definition-123\",\"schema\":{\"$id\":\"https://examp"
                + "le.com/person.schema.json\",\"$schema\":\"https://json-schema.org/draft/2020-12/"
                + "schema\",\"title\":\"Person\",\"type\":\"object\",\"properties\":{\"firstName\":"
                + "{\"type\":\"string\",\"description\":\"The person's first name.\"},\"lastName\":"
                + "{\"type\":\"string\",\"description\":\"The person's last name.\",\"test\":null},"
                + "\"age\":{\"type\":\"integer\",\"description\":\"Age in years\",\"minimum\":0}}},"
                + "\"commentSchema\":null}",
                CustomAttributeDefinition.class);
        boolean setToNull = true;
        boolean unSet = false;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendCustomAttributeDefinition(customAttributeDefinition, setToNull, unSet);
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

    /**
     * Test case for Send Custom Attribute Value.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendCustomAttributeValueWithOptionalNullableUnset() throws Exception {
        // Parameters for the API call
        CustomAttributeValue customAttributeValue = ApiHelper.deserialize(
                "{\"id\":\"value-456\",\"definitionId\":\"definition-123\",\"value\":{\"firstName"
                + "\":\"John\",\"lastName\":\"Doe\",\"age\":21,\"test\":null}}",
                CustomAttributeValue.class);
        boolean setToNull = false;
        boolean unSet = true;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendCustomAttributeValue(customAttributeValue, setToNull, unSet);
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

    /**
     * Test case for Send Custom Attribute Value.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendCustomAttributeValueWithOptionalNullableSetToSomeValue() throws Exception {
        // Parameters for the API call
        CustomAttributeValue customAttributeValue = ApiHelper.deserialize(
                "{\"id\":\"value-456\",\"definitionId\":\"definition-123\",\"value\":{\"firstName"
                + "\":\"John\",\"lastName\":\"Doe\",\"age\":21,\"test\":null},\"commentValue\":{\"f"
                + "irstName\":\"John\",\"lastName\":\"Doe\",\"age\":21,\"test\":null}}",
                CustomAttributeValue.class);
        boolean setToNull = false;
        boolean unSet = false;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendCustomAttributeValue(customAttributeValue, setToNull, unSet);
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

    /**
     * Test case for Send Custom Attribute Value.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSendCustomAttributeValueWithOptionalNullableSetToNull() throws Exception {
        // Parameters for the API call
        CustomAttributeValue customAttributeValue = ApiHelper.deserialize(
                "{\"id\":\"value-456\",\"definitionId\":\"definition-123\",\"value\":{\"firstName"
                + "\":\"John\",\"lastName\":\"Doe\",\"age\":21,\"test\":null},\"commentValue\":null"
                + "}",
                CustomAttributeValue.class);
        boolean setToNull = true;
        boolean unSet = false;

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.sendCustomAttributeValue(customAttributeValue, setToNull, unSet);
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
