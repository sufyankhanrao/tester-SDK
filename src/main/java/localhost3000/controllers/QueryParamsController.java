/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import localhost3000.exceptions.ApiException;
import localhost3000.models.ServerResponse;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface QueryParamsController {
    /**
     * @param  number  Required parameter: <testing> <testing>
     * @param  number1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendNumberAsOptional(
            final int number,
            final Integer number1) throws ApiException, IOException;

    /**
     * @param  number  Required parameter: <testing> <testing>
     * @param  number1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendNumberAsOptionalAsync(
            final int number,
            final Integer number1);

    /**
     * @param  mLong  Required parameter: <testing> <testing>
     * @param  long1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendLongAsOptional(
            final long mLong,
            final Long long1) throws ApiException, IOException;

    /**
     * @param  mLong  Required parameter: <testing> <testing>
     * @param  long1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendLongAsOptionalAsync(
            final long mLong,
            final Long long1);

    /**
     * @param  precision  Required parameter: <testing> <testing>
     * @param  precision1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse precisionAsOptional(
            final double precision,
            final Double precision1) throws ApiException, IOException;

    /**
     * @param  precision  Required parameter: <testing> <testing>
     * @param  precision1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> precisionAsOptionalAsync(
            final double precision,
            final Double precision1);

    /**
     * @param  mBoolean  Required parameter: <testing> <testing>
     * @param  boolean1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse booleanAsOptional(
            final boolean mBoolean,
            final Boolean boolean1) throws ApiException, IOException;

    /**
     * @param  mBoolean  Required parameter: <testing> <testing>
     * @param  boolean1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> booleanAsOptionalAsync(
            final boolean mBoolean,
            final Boolean boolean1);

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse rfc1123DatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException;

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> rfc1123DatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1);

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse rfc3339DatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException;

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> rfc3339DatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1);

    /**
     * @param  date  Required parameter: <testing> <testing>
     * @param  date1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendDateAsOptional(
            final LocalDate date,
            final LocalDate date1) throws ApiException, IOException;

    /**
     * @param  date  Required parameter: <testing> <testing>
     * @param  date1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendDateAsOptionalAsync(
            final LocalDate date,
            final LocalDate date1);

    /**
     * @param  string  Required parameter: <testing> <testing>
     * @param  string1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse sendStringAsOptional(
            final String string,
            final String string1) throws ApiException, IOException;

    /**
     * @param  string  Required parameter: <testing> <testing>
     * @param  string1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> sendStringAsOptionalAsync(
            final String string,
            final String string1);

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ServerResponse unixdatetimeAsOptional(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1) throws ApiException, IOException;

    /**
     * @param  dateTime  Required parameter: <testing> <testing>
     * @param  dateTime1  Optional parameter: <testing> <testing>
     * @return    Returns the ServerResponse response from the API call
     */
    CompletableFuture<ServerResponse> unixdatetimeAsOptionalAsync(
            final LocalDateTime dateTime,
            final LocalDateTime dateTime1);

}