/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.utilities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import localhost3000.ApiHelper;

/**
 * This is a wrapper class for JSON value.
 */
public class JsonValue {
    @com.fasterxml.jackson.annotation.JsonValue
    private JsonNode json;

    /**
     * Initialization constructor.
     * @param jsonNode The JSON of type JsonNode.
     */
    @JsonCreator
    private JsonValue(JsonNode jsonNode) {
        this.json = jsonNode;
    }

    /**
     * Provides singleton object of this class.
     * @param jsonString The JSON string.
     * @return The singleton JsonValue object.
     * @throws IOException signals that provided json string is not valid.
     */
    public static JsonValue fromJsonString(String jsonString) throws IOException {
        return new JsonValue(jsonString != null ? ApiHelper.mapper.readTree(jsonString) : null);
    }

    /**
     * Converts the json into string.
     * @return String representation of json
     */
    @Override
    public String toString() {
        try {
            return ApiHelper.mapper.writeValueAsString(json);
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}
