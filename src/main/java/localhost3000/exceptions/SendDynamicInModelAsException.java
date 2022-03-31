/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import localhost3000.http.client.HttpContext;
import localhost3000.models.AddDynamicInException;

/**
 * This is a model class for SendDynamicInModelAsException type.
 */
public class SendDynamicInModelAsException
        extends ApiException {
    private static final long serialVersionUID = -23089121601383216L;
    private AddDynamicInException body;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public SendDynamicInModelAsException(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for Body.
     * @return Returns the AddDynamicInException
     */
    @JsonGetter("body")
    public AddDynamicInException getBody() {
        return this.body;
    }

    /**
     * Setter for Body.
     * @param body Value for AddDynamicInException
     */
    @JsonSetter("body")
    private void setBody(AddDynamicInException body) {
        this.body = body;
    }
}
