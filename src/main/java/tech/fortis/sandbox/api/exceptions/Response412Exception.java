/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import tech.fortis.sandbox.api.http.client.HttpContext;
import tech.fortis.sandbox.api.models.Detail;

/**
 * This is a model class for Response412Exception type.
 */
public class Response412Exception
        extends ApiException {
    private static final long serialVersionUID = 7118865112500980829L;
    private Integer statusCode;
    private String error;
    private String message;
    private List<Detail> details;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public Response412Exception(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for StatusCode.
     * Response code
     * @return Returns the Integer
     */
    @JsonGetter("statusCode")
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * Setter for StatusCode.
     * Response code
     * @param statusCode Value for Integer
     */
    @JsonSetter("statusCode")
    private void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Getter for Error.
     * Error description
     * @return Returns the String
     */
    @JsonGetter("error")
    public String getError() {
        return this.error;
    }

    /**
     * Setter for Error.
     * Error description
     * @param error Value for String
     */
    @JsonSetter("error")
    private void setError(String error) {
        this.error = error;
    }

    /**
     * Getter for Message.
     * Error message
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for Message.
     * Error message
     * @param message Value for String
     */
    @JsonSetter("message")
    private void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Details.
     * Error detail
     * @return Returns the List of Detail
     */
    @JsonGetter("details")
    public List<Detail> getDetails() {
        return this.details;
    }

    /**
     * Setter for Details.
     * Error detail
     * @param details Value for List of Detail
     */
    @JsonSetter("details")
    private void setDetails(List<Detail> details) {
        this.details = details;
    }
}
