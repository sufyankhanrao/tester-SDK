/*
 * TesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import localhost3000.DateTimeHelper;
import localhost3000.http.client.HttpContext;

/**
 * This is a model class for Rfc1123Exception type.
 */
public class Rfc1123Exception
        extends ApiException {
    private static final long serialVersionUID = -8472186716175804432L;
    private LocalDateTime dateTime;
    private LocalDateTime dateTime1;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public Rfc1123Exception(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for DateTime.
     * <testing>
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dateTime")
    @JsonSerialize(using = DateTimeHelper.Rfc1123DateTimeSerializer.class)
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    /**
     * Setter for DateTime.
     * <testing>
     * @param dateTime Value for LocalDateTime
     */
    @JsonSetter("dateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc1123DateTimeDeserializer.class)
    private void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Getter for DateTime1.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dateTime1")
    @JsonSerialize(using = DateTimeHelper.Rfc1123DateTimeSerializer.class)
    public LocalDateTime getDateTime1() {
        return this.dateTime1;
    }

    /**
     * Setter for DateTime1.
     * @param dateTime1 Value for LocalDateTime
     */
    @JsonSetter("dateTime1")
    @JsonDeserialize(using = DateTimeHelper.Rfc1123DateTimeDeserializer.class)
    private void setDateTime1(LocalDateTime dateTime1) {
        this.dateTime1 = dateTime1;
    }
}
