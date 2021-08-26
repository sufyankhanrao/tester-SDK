/*
 * TesterXMLLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import javax.xml.bind.annotation.XmlElement;

/**
 * This is a model class for ModelWithNestedAttributesModel type.
 */
public class ModelWithNestedAttributesModel {
    private SimpleAttributes simpleAttributes;
    private String simple;

    /**
     * Default constructor.
     */
    public ModelWithNestedAttributesModel() {
    }

    /**
     * Initialization constructor.
     * @param  simpleAttributes  SimpleAttributes value for simpleAttributes.
     * @param  simple  String value for simple.
     */
    public ModelWithNestedAttributesModel(
            SimpleAttributes simpleAttributes,
            String simple) {
        this.simpleAttributes = simpleAttributes;
        this.simple = simple;
    }

    /**
     * Getter for SimpleAttributes.
     * A model with only attributes (attributes can only be non-array primitive types)
     * @return Returns the SimpleAttributes
     */
    @JsonGetter("SimpleAttributes")
    @XmlElement(name = "Attributes")
    public SimpleAttributes getSimpleAttributes() {
        return simpleAttributes;
    }

    /**
     * Setter for SimpleAttributes.
     * A model with only attributes (attributes can only be non-array primitive types)
     * @param simpleAttributes Value for SimpleAttributes
     */
    @JsonSetter("SimpleAttributes")
    public void setSimpleAttributes(SimpleAttributes simpleAttributes) {
        this.simpleAttributes = simpleAttributes;
    }

    /**
     * Getter for Simple.
     * @return Returns the String
     */
    @JsonGetter("simple")
    @XmlElement(name = "simple")
    public String getSimple() {
        return simple;
    }

    /**
     * Setter for Simple.
     * @param simple Value for String
     */
    @JsonSetter("simple")
    public void setSimple(String simple) {
        this.simple = simple;
    }

    /**
     * Converts this ModelWithNestedAttributesModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ModelWithNestedAttributesModel [" + "simpleAttributes=" + simpleAttributes
                + ", simple=" + simple + "]";
    }

    /**
     * Builds a new {@link ModelWithNestedAttributesModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ModelWithNestedAttributesModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(simpleAttributes, simple);
        return builder;
    }

    /**
     * Class to build instances of {@link ModelWithNestedAttributesModel}.
     */
    public static class Builder {
        private SimpleAttributes simpleAttributes;
        private String simple;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  simpleAttributes  SimpleAttributes value for simpleAttributes.
         * @param  simple  String value for simple.
         */
        public Builder(SimpleAttributes simpleAttributes, String simple) {
            this.simpleAttributes = simpleAttributes;
            this.simple = simple;
        }

        /**
         * Setter for simpleAttributes.
         * @param  simpleAttributes  SimpleAttributes value for simpleAttributes.
         * @return Builder
         */
        public Builder simpleAttributes(SimpleAttributes simpleAttributes) {
            this.simpleAttributes = simpleAttributes;
            return this;
        }

        /**
         * Setter for simple.
         * @param  simple  String value for simple.
         * @return Builder
         */
        public Builder simple(String simple) {
            this.simple = simple;
            return this;
        }

        /**
         * Builds a new {@link ModelWithNestedAttributesModel} object using the set fields.
         * @return {@link ModelWithNestedAttributesModel}
         */
        public ModelWithNestedAttributesModel build() {
            return new ModelWithNestedAttributesModel(simpleAttributes, simple);
        }
    }
}
