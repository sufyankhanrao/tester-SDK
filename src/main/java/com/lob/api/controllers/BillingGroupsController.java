/*
 * LobAPI20200211SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lob.api.ApiHelper;
import com.lob.api.AuthManager;
import com.lob.api.Configuration;
import com.lob.api.DateTimeHelper;
import com.lob.api.exceptions.ApiException;
import com.lob.api.exceptions.ErrorErrorException;
import com.lob.api.http.Headers;
import com.lob.api.http.client.HttpCallback;
import com.lob.api.http.client.HttpClient;
import com.lob.api.http.client.HttpContext;
import com.lob.api.http.request.HttpRequest;
import com.lob.api.http.response.HttpResponse;
import com.lob.api.http.response.HttpStringResponse;
import com.lob.api.models.BillingGroup;
import com.lob.api.models.BillingGroupEditable;
import com.lob.api.models.BillingGroupsResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class BillingGroupsController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public BillingGroupsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public BillingGroupsController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Retrieves the details of an existing billing_group. You need only supply the unique
     * billing_group identifier that was returned upon billing_group creation.
     * @param  bgId  Required parameter: id of the billing_group
     * @return    Returns the BillingGroup response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BillingGroup getBillingGroup(
            final String bgId) throws ApiException, IOException {
        HttpRequest request = buildGetBillingGroupRequest(bgId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetBillingGroupResponse(context);
    }

    /**
     * Retrieves the details of an existing billing_group. You need only supply the unique
     * billing_group identifier that was returned upon billing_group creation.
     * @param  bgId  Required parameter: id of the billing_group
     * @return    Returns the BillingGroup response from the API call
     */
    public CompletableFuture<BillingGroup> getBillingGroupAsync(
            final String bgId) {
        return makeHttpCallAsync(() -> buildGetBillingGroupRequest(bgId),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleGetBillingGroupResponse(context));
    }

    /**
     * Builds the HttpRequest object for getBillingGroup.
     */
    private HttpRequest buildGetBillingGroupRequest(
            final String bgId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/billing_groups/{bg_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("bg_id",
                new SimpleEntry<Object, Boolean>(bgId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for getBillingGroup.
     * @return An object of type BillingGroup
     */
    private BillingGroup handleGetBillingGroupResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BillingGroup result = ApiHelper.deserialize(responseBody,
                BillingGroup.class);

        return result;
    }

    /**
     * Updates all editable attributes of the billing_group with the given id.
     * @param  bgId  Required parameter: id of the billing_group
     * @param  description  Optional parameter: Description of the billing group.
     * @param  name  Optional parameter: Name of the billing group.
     * @return    Returns the BillingGroup response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BillingGroup updateBillingGroup(
            final String bgId,
            final String description,
            final String name) throws ApiException, IOException {
        HttpRequest request = buildUpdateBillingGroupRequest(bgId, description, name);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateBillingGroupResponse(context);
    }

    /**
     * Updates all editable attributes of the billing_group with the given id.
     * @param  bgId  Required parameter: id of the billing_group
     * @param  description  Optional parameter: Description of the billing group.
     * @param  name  Optional parameter: Name of the billing group.
     * @return    Returns the BillingGroup response from the API call
     */
    public CompletableFuture<BillingGroup> updateBillingGroupAsync(
            final String bgId,
            final String description,
            final String name) {
        return makeHttpCallAsync(() -> buildUpdateBillingGroupRequest(bgId, description, name),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleUpdateBillingGroupResponse(context));
    }

    /**
     * Builds the HttpRequest object for updateBillingGroup.
     */
    private HttpRequest buildUpdateBillingGroupRequest(
            final String bgId,
            final String description,
            final String name) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/billing_groups/{bg_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("bg_id",
                new SimpleEntry<Object, Boolean>(bgId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //load all fields for the outgoing API request
        Map<String, Object> formParameters = new HashMap<>();
        if (description != null) {
            formParameters.put("description", description);
        }
        if (name != null) {
            formParameters.put("name", name);
        }

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null,
                ApiHelper.prepareFormFields(formParameters));

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for updateBillingGroup.
     * @return An object of type BillingGroup
     */
    private BillingGroup handleUpdateBillingGroupResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BillingGroup result = ApiHelper.deserialize(responseBody,
                BillingGroup.class);

        return result;
    }

    /**
     * Returns a list of your billing_groups. The billing_groups are returned sorted by creation
     * date, with the most recently created billing_groups appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  offset  Optional parameter: An integer that designates the offset at which to begin
     *         returning results. Defaults to 0.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include[]=total_count`.
     * @param  dateCreated  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ gt:
     *         '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥,
     *         and `lte` is ≤.
     * @param  dateModified  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ gt:
     *         '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is ›, `lt` is ‹, `gte` is ≥,
     *         and `lte` is ≤.
     * @param  sortBy  Optional parameter: Sorts postcards by ascending or descending dates.
     * @return    Returns the BillingGroupsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BillingGroupsResponse listBillingGroups(
            final Integer limit,
            final Integer offset,
            final Object include,
            final LocalDateTime dateCreated,
            final LocalDateTime dateModified,
            final Object sortBy) throws ApiException, IOException {
        HttpRequest request = buildListBillingGroupsRequest(limit, offset, include, dateCreated,
                dateModified, sortBy);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListBillingGroupsResponse(context);
    }

    /**
     * Returns a list of your billing_groups. The billing_groups are returned sorted by creation
     * date, with the most recently created billing_groups appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  offset  Optional parameter: An integer that designates the offset at which to begin
     *         returning results. Defaults to 0.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include[]=total_count`.
     * @param  dateCreated  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ gt:
     *         '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥,
     *         and `lte` is ≤.
     * @param  dateModified  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ gt:
     *         '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is ›, `lt` is ‹, `gte` is ≥,
     *         and `lte` is ≤.
     * @param  sortBy  Optional parameter: Sorts postcards by ascending or descending dates.
     * @return    Returns the BillingGroupsResponse response from the API call
     */
    public CompletableFuture<BillingGroupsResponse> listBillingGroupsAsync(
            final Integer limit,
            final Integer offset,
            final Object include,
            final LocalDateTime dateCreated,
            final LocalDateTime dateModified,
            final Object sortBy) {
        return makeHttpCallAsync(() -> buildListBillingGroupsRequest(limit, offset, include,
                dateCreated, dateModified, sortBy),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleListBillingGroupsResponse(context));
    }

    /**
     * Builds the HttpRequest object for listBillingGroups.
     */
    private HttpRequest buildListBillingGroupsRequest(
            final Integer limit,
            final Integer offset,
            final Object include,
            final LocalDateTime dateCreated,
            final LocalDateTime dateModified,
            final Object sortBy) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/billing_groups");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("limit",
                (limit != null) ? limit : 10);
        queryParameters.put("offset",
                (offset != null) ? offset : 0);
        queryParameters.put("include", include);
        queryParameters.put("date_created", DateTimeHelper.toRfc8601DateTime(dateCreated));
        queryParameters.put("date_modified", DateTimeHelper.toRfc8601DateTime(dateModified));
        queryParameters.put("sort_by", sortBy);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for listBillingGroups.
     * @return An object of type BillingGroupsResponse
     */
    private BillingGroupsResponse handleListBillingGroupsResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BillingGroupsResponse result = ApiHelper.deserialize(responseBody,
                BillingGroupsResponse.class);

        return result;
    }

    /**
     * Creates a new billing_group with the provided properties.
     * @param  body  Required parameter: Example:
     * @return    Returns the BillingGroup response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BillingGroup createBillingGroup(
            final BillingGroupEditable body) throws ApiException, IOException {
        HttpRequest request = buildCreateBillingGroupRequest(body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreateBillingGroupResponse(context);
    }

    /**
     * Creates a new billing_group with the provided properties.
     * @param  body  Required parameter: Example:
     * @return    Returns the BillingGroup response from the API call
     */
    public CompletableFuture<BillingGroup> createBillingGroupAsync(
            final BillingGroupEditable body) {
        return makeHttpCallAsync(() -> buildCreateBillingGroupRequest(body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleCreateBillingGroupResponse(context));
    }

    /**
     * Builds the HttpRequest object for createBillingGroup.
     */
    private HttpRequest buildCreateBillingGroupRequest(
            final BillingGroupEditable body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/billing_groups");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for createBillingGroup.
     * @return An object of type BillingGroup
     */
    private BillingGroup handleCreateBillingGroupResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();

        if ((responseCode < 200) || (responseCode > 208)) {
            throw new ErrorErrorException("Error", context);
        }
        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        BillingGroup result = ApiHelper.deserialize(responseBody,
                BillingGroup.class);

        return result;
    }

}