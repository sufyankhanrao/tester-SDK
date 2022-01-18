/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import localhost3000.models.containers.MultiLevelAnyOfValue;

/**
 * This is a model class for MultiLevelAnyOf type.
 */
public class MultiLevelAnyOf {
    private MultiLevelAnyOfValue value;

    /**
     * Default constructor.
     */
    public MultiLevelAnyOf() {
    }

    /**
     * Initialization constructor.
     * @param  value  MultiLevelAnyOfValue value for value.
     */
    public MultiLevelAnyOf(
            MultiLevelAnyOfValue value) {
        this.value = value;
    }

    /**
     * Getter for Value.
     * @return Returns the MultiLevelAnyOfValue
     */
    @JsonGetter("value")
    public MultiLevelAnyOfValue getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for MultiLevelAnyOfValue
     */
    @JsonSetter("value")
    public void setValue(MultiLevelAnyOfValue value) {
        this.value = value;
    }

    /**
     * Converts this MultiLevelAnyOf into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MultiLevelAnyOf [" + "value=" + value + "]";
    }

    /**
     * Builds a new {@link MultiLevelAnyOf.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MultiLevelAnyOf.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(value);
        return builder;
    }

    /**
     * Class to build instances of {@link MultiLevelAnyOf}.
     */
    public static class Builder {
        private MultiLevelAnyOfValue value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  value  MultiLevelAnyOfValue value for value.
         */
        public Builder(MultiLevelAnyOfValue value) {
            this.value = value;
        }

        /**
         * Setter for value.
         * @param  value  MultiLevelAnyOfValue value for value.
         * @return Builder
         */
        public Builder value(MultiLevelAnyOfValue value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link MultiLevelAnyOf} object using the set fields.
         * @return {@link MultiLevelAnyOf}
         */
        public MultiLevelAnyOf build() {
            return new MultiLevelAnyOf(value);
        }
    }
}
