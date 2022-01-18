/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import localhost3000.models.containers.SimpleCaseValue;

/**
 * This is a model class for SimpleCase type.
 */
public class SimpleCase {
    private SimpleCaseValue value;

    /**
     * Default constructor.
     */
    public SimpleCase() {
    }

    /**
     * Initialization constructor.
     * @param  value  SimpleCaseValue value for value.
     */
    public SimpleCase(
            SimpleCaseValue value) {
        this.value = value;
    }

    /**
     * Getter for Value.
     * @return Returns the SimpleCaseValue
     */
    @JsonGetter("value")
    public SimpleCaseValue getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for SimpleCaseValue
     */
    @JsonSetter("value")
    public void setValue(SimpleCaseValue value) {
        this.value = value;
    }

    /**
     * Converts this SimpleCase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SimpleCase [" + "value=" + value + "]";
    }

    /**
     * Builds a new {@link SimpleCase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SimpleCase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value);
        return builder;
    }

    /**
     * Class to build instances of {@link SimpleCase}.
     */
    public static class Builder {
        private SimpleCaseValue value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  SimpleCaseValue value for value.
         */
        public Builder(SimpleCaseValue value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  SimpleCaseValue value for value.
         * @return Builder
         */
        public Builder value(SimpleCaseValue value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link SimpleCase} object using the set fields.
         * @return {@link SimpleCase}
         */
        public SimpleCase build() {
            return new SimpleCase(value);
        }
    }
}