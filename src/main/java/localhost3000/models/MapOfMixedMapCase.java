/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.Map;
import localhost3000.models.containers.MapOfMixedMapCaseValue;

/**
 * This is a model class for MapOfMixedMapCase type.
 */
public class MapOfMixedMapCase {
    private Map<String, MapOfMixedMapCaseValue> value;

    /**
     * Default constructor.
     */
    public MapOfMixedMapCase() {
    }

    /**
     * Initialization constructor.
     * @param  value  Map of String, value for value.
     */
    public MapOfMixedMapCase(
            Map<String, MapOfMixedMapCaseValue> value) {
        this.value = value;
    }

    /**
     * Getter for Value.
     * @return Returns the Map of String, MapOfMixedMapCaseValue
     */
    @JsonGetter("value")
    public Map<String, MapOfMixedMapCaseValue> getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for Map of String, MapOfMixedMapCaseValue
     */
    @JsonSetter("value")
    public void setValue(Map<String, MapOfMixedMapCaseValue> value) {
        this.value = value;
    }

    /**
     * Converts this MapOfMixedMapCase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MapOfMixedMapCase [" + "value=" + value + "]";
    }

    /**
     * Builds a new {@link MapOfMixedMapCase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MapOfMixedMapCase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value);
        return builder;
    }

    /**
     * Class to build instances of {@link MapOfMixedMapCase}.
     */
    public static class Builder {
        private Map<String, MapOfMixedMapCaseValue> value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  Map of String, value for value.
         */
        public Builder(Map<String, MapOfMixedMapCaseValue> value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  Map of String, value for value.
         * @return Builder
         */
        public Builder value(Map<String, MapOfMixedMapCaseValue> value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link MapOfMixedMapCase} object using the set fields.
         * @return {@link MapOfMixedMapCase}
         */
        public MapOfMixedMapCase build() {
            return new MapOfMixedMapCase(value);
        }
    }
}