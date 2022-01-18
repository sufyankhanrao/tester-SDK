/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import localhost3000.models.containers.InnerArrayCaseValue;

/**
 * This is a model class for InnerArrayCase type.
 */
public class InnerArrayCase {
    private InnerArrayCaseValue value;

    /**
     * Default constructor.
     */
    public InnerArrayCase() {
    }

    /**
     * Initialization constructor.
     * @param  value  InnerArrayCaseValue value for value.
     */
    public InnerArrayCase(
            InnerArrayCaseValue value) {
        this.value = value;
    }

    /**
     * Getter for Value.
     * @return Returns the InnerArrayCaseValue
     */
    @JsonGetter("value")
    public InnerArrayCaseValue getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for InnerArrayCaseValue
     */
    @JsonSetter("value")
    public void setValue(InnerArrayCaseValue value) {
        this.value = value;
    }

    /**
     * Converts this InnerArrayCase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InnerArrayCase [" + "value=" + value + "]";
    }

    /**
     * Builds a new {@link InnerArrayCase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InnerArrayCase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value);
        return builder;
    }

    /**
     * Class to build instances of {@link InnerArrayCase}.
     */
    public static class Builder {
        private InnerArrayCaseValue value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  InnerArrayCaseValue value for value.
         */
        public Builder(InnerArrayCaseValue value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  InnerArrayCaseValue value for value.
         * @return Builder
         */
        public Builder value(InnerArrayCaseValue value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link InnerArrayCase} object using the set fields.
         * @return {@link InnerArrayCase}
         */
        public InnerArrayCase build() {
            return new InnerArrayCase(value);
        }
    }
}