/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.UUID;

/**
 * This is a model class for Async type.
 */
public class Async {
    private UUID code;
    private String link;

    /**
     * Default constructor.
     */
    public Async() {
    }

    /**
     * Initialization constructor.
     * @param  code  UUID value for code.
     * @param  link  String value for link.
     */
    public Async(
            UUID code,
            String link) {
        this.code = code;
        this.link = link;
    }

    /**
     * Getter for Code.
     * A [UUID v4](https://datatracker.ietf.org/doc/html/rfc4122) that's unique for the Async
     * Request
     * @return Returns the UUID
     */
    @JsonGetter("code")
    public UUID getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * A [UUID v4](https://datatracker.ietf.org/doc/html/rfc4122) that's unique for the Async
     * Request
     * @param code Value for UUID
     */
    @JsonSetter("code")
    public void setCode(UUID code) {
        this.code = code;
    }

    /**
     * Getter for Link.
     * Link to the status check endpoint
     * @return Returns the String
     */
    @JsonGetter("link")
    public String getLink() {
        return link;
    }

    /**
     * Setter for Link.
     * Link to the status check endpoint
     * @param link Value for String
     */
    @JsonSetter("link")
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Converts this Async into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Async [" + "code=" + code + ", link=" + link + "]";
    }

    /**
     * Builds a new {@link Async.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Async.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(code, link);
        return builder;
    }

    /**
     * Class to build instances of {@link Async}.
     */
    public static class Builder {
        private UUID code;
        private String link;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  code  UUID value for code.
         * @param  link  String value for link.
         */
        public Builder(UUID code, String link) {
            this.code = code;
            this.link = link;
        }

        /**
         * Setter for code.
         * @param  code  UUID value for code.
         * @return Builder
         */
        public Builder code(UUID code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for link.
         * @param  link  String value for link.
         * @return Builder
         */
        public Builder link(String link) {
            this.link = link;
            return this;
        }

        /**
         * Builds a new {@link Async} object using the set fields.
         * @return {@link Async}
         */
        public Async build() {
            return new Async(code, link);
        }
    }
}
