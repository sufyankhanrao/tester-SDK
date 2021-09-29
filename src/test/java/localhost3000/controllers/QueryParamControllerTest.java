/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import localhost3000.ApiHelper;
import localhost3000.DateTimeHelper;
import localhost3000.TesterClient;
import localhost3000.exceptions.ApiException;
import localhost3000.models.Days;
import localhost3000.models.ServerResponse;
import localhost3000.models.SuiteCode;
import localhost3000.testing.TestHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueryParamControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static TesterClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static QueryParamController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getQueryParamController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for Date Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDateArray() throws Exception {
        // Parameters for the API call
        List<LocalDate> dates = ApiHelper.deserialize(
                "[\"1994-02-13\",\"1994-02-13\"]",
                new TypeReference<List<LocalDate>>(){},
                LocalDate.class,
                new DateTimeHelper.SimpleDateDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.dateArray(dates);
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testOptionalDynamicQueryParam() throws Exception {
        // Parameters for the API call
        String name = 
                "farhan";
        // key-value map for optional query parameters
        Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
        queryParams.put("field", "QA");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.optionalDynamicQueryParam(name, queryParams);
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
     * Test case for Date.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testDate() throws Exception {
        // Parameters for the API call
        LocalDate date = DateTimeHelper.fromSimpleDate(
                "1994-02-13");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.date(date);
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
     * Test case for Unix DateTime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUnixDateTimeArray() throws Exception {
        // Parameters for the API call
        List<LocalDateTime> datetimes = ApiHelper.deserialize(
                "[1484719381,1484719381]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.UnixTimestampDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.unixDateTimeArray(datetimes);
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
     * Test case for Unix DateTime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUnixDateTime() throws Exception {
        // Parameters for the API call
        LocalDateTime datetime = DateTimeHelper.fromUnixTimestamp(1484719381L);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.unixDateTime(datetime);
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
     * Test case for Rfc1123 DateTime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testRfc1123DateTime() throws Exception {
        // Parameters for the API call
        LocalDateTime datetime = DateTimeHelper.fromRfc1123DateTime(
                "Sun, 06 Nov 1994 08:49:37 GMT");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.rfc1123DateTime(datetime);
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
     * Test case for Rfc1123 DateTime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testRfc1123DateTimeArray() throws Exception {
        // Parameters for the API call
        List<LocalDateTime> datetimes = ApiHelper.deserialize(
                "[\"Sun, 06 Nov 1994 08:49:37 GMT\",\"Sun, 06 Nov 1994 08:49:37 GMT\"]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.Rfc1123DateTimeDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.rfc1123DateTimeArray(datetimes);
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
     * Test case for Rfc3339 DateTime Array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testRfc3339DateTimeArray() throws Exception {
        // Parameters for the API call
        List<LocalDateTime> datetimes = ApiHelper.deserialize(
                "[\"1994-02-13T14:01:54.9571247Z\",\"1994-02-13T14:01:54.9571247Z\"]",
                new TypeReference<List<LocalDateTime>>(){},
                LocalDateTime.class,
                new DateTimeHelper.Rfc8601DateTimeDeserializer());

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.rfc3339DateTimeArray(datetimes);
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
     * Test case for Rfc3339 DateTime.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testRfc3339DateTime() throws Exception {
        // Parameters for the API call
        LocalDateTime datetime = DateTimeHelper.fromRfc8601DateTime(
                "1994-02-13T14:01:54.9571247Z");

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.rfc3339DateTime(datetime);
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testNoParams() throws Exception {

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.noParams();
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testStringParam() throws Exception {
        // Parameters for the API call
        String string = 
                "l;asd;asdwe[2304&&;'.d??\\a\\\\\\;sd//";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.stringParam(string);
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testUrlParam() throws Exception {
        // Parameters for the API call
        String url = 
                "https://www.shahidisawesome.com/and/also/a/narcissist?thisis=aparameter&another=on"
                + "e";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.urlParam(url);
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testNumberArray() throws Exception {
        // Parameters for the API call
        List<Integer> integers = ApiHelper.deserializeArray(
                "[1,2,3,4,5]",
                Integer[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.numberArray(integers);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertTrue("Status is not between 200 and 208", 
                httpResponse.getResponse().getStatusCode() >= 200 
                && httpResponse.getResponse().getStatusCode() <= 208);

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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testStringArray() throws Exception {
        // Parameters for the API call
        List<String> strings = ApiHelper.deserializeArray(
                "[\"abc\", \"def\"]",
                String[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.stringArray(strings);
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testSimpleQuery() throws Exception {
        // Parameters for the API call
        boolean mBoolean = true;
        int number = 4;
        String string = 
                "TestString";
        // key-value map for optional query parameters
        Map<String, Object> queryParams = new LinkedHashMap<String, Object>();

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.simpleQuery(mBoolean, number, string, queryParams);
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testStringEnumArray() throws Exception {
        // Parameters for the API call
        List<Days> days = ApiHelper.deserializeArray(
                "[\"Tuesday\", \"Saturday\", \"Wednesday\", \"Monday\", \"Sunday\"]",
                Days[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.stringEnumArray(days);
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testMultipleParams() throws Exception {
        // Parameters for the API call
        int number = 123412312;
        double precision = 1112.34d;
        String string = 
                "\"\"test./;\";12&&3asl\"\";\"qw1&34\"///..//.";
        String url = 
                "http://www.abc.com/test?a=b&c=\"http://lolol.com?param=no&another=lol\"";

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.multipleParams(number, precision, string, url);
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
     * <testing> <testing>.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testIntegerEnumArray() throws Exception {
        // Parameters for the API call
        List<SuiteCode> suites = ApiHelper.deserializeArray(
                "[1, 3, 4, 2, 3]",
                SuiteCode[].class);

        // Set callback and perform API call
        ServerResponse result = null;
        try {
            result = controller.integerEnumArray(suites);
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
