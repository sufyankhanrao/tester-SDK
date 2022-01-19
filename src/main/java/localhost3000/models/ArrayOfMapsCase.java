/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import localhost3000.models.containers.ArrayOfMapsCaseValue;

/**
 * This is a model class for ArrayOfMapsCase type.
 */
public class ArrayOfMapsCase {
    private List<ArrayOfMapsCaseValue> value;

    /**
     * Default constructor.
     */
    public ArrayOfMapsCase() {
    }

    /**
     * Initialization constructor.
     * @param  value  List of ArrayOfMapsCaseValue value for value.
     */
    public ArrayOfMapsCase(
            List<ArrayOfMapsCaseValue> value) {
        this.value = value;
    }

    /**
     * Getter for Value.
     * @return Returns the List of ArrayOfMapsCaseValue
     */
    @JsonGetter("value")
    public List<ArrayOfMapsCaseValue> getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for List of ArrayOfMapsCaseValue
     */
    @JsonSetter("value")
    public void setValue(List<ArrayOfMapsCaseValue> value) {
        this.value = value;
    }

    /**
     * Converts this ArrayOfMapsCase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArrayOfMapsCase [" + "value=" + value + "]";
    }

    /**
     * Builds a new {@link ArrayOfMapsCase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArrayOfMapsCase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value);
        return builder;
    }

    /**
     * Class to build instances of {@link ArrayOfMapsCase}.
     */
    public static class Builder {
        private List<ArrayOfMapsCaseValue> value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  List of ArrayOfMapsCaseValue value for value.
         */
        public Builder(List<ArrayOfMapsCaseValue> value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  List of ArrayOfMapsCaseValue value for value.
         * @return Builder
         */
        public Builder value(List<ArrayOfMapsCaseValue> value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link ArrayOfMapsCase} object using the set fields.
         * @return {@link ArrayOfMapsCase}
         */
        public ArrayOfMapsCase build() {
            return new ArrayOfMapsCase(value);
        }
    }
}
