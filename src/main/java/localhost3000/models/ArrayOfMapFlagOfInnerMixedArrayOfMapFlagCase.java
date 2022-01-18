/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.util.Map;
import localhost3000.models.containers.ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue;

/**
 * This is a model class for ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase type.
 */
public class ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase {
    private List<Map<String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue>> value;

    /**
     * Default constructor.
     */
    public ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase() {
    }

    /**
     * Initialization constructor.
     * @param  value  List of String, value for value.
     */
    public ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase(
            List<Map<String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue>> value) {
        this.value = value;
    }

    /**
     * Getter for Value.
     * @return Returns the List of String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue
     */
    @JsonGetter("value")
    public List<Map<String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue>> getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for List of String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue
     */
    @JsonSetter("value")
    public void setValue(List<Map<String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue>> value) {
        this.value = value;
    }

    /**
     * Converts this ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase [" + "value=" + value + "]";
    }

    /**
     * Builds a new {@link ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value);
        return builder;
    }

    /**
     * Class to build instances of {@link ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase}.
     */
    public static class Builder {
        private List<Map<String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue>> value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  List of String, value for value.
         */
        public Builder(List<Map<String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue>> value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  List of String, value for value.
         * @return Builder
         */
        public Builder value(
                List<Map<String, ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCaseValue>> value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase} object using the set
         * fields.
         * @return {@link ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase}
         */
        public ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase build() {
            return new ArrayOfMapFlagOfInnerMixedArrayOfMapFlagCase(value);
        }
    }
}
