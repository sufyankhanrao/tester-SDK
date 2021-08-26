/*
 * TesterXMLLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * This is a model class for BaseForDiscriminatorInAttribute type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "discriminator",
        defaultImpl = BaseForDiscriminatorInAttribute.class,
        visible = true)
@JsonSubTypes({
    @Type(value = DiscriminatorInAttribute.class, name = "Kylo Ren")
})
@JsonInclude(Include.ALWAYS)
public class BaseForDiscriminatorInAttribute {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String discriminator;
    private String baseField;

    /**
     * Default constructor.
     */
    public BaseForDiscriminatorInAttribute() {
        setDiscriminator("Darth Vader");
    }

    /**
     * Initialization constructor.
     * @param  baseField  String value for baseField.
     * @param  discriminator  String value for discriminator.
     */
    public BaseForDiscriminatorInAttribute(
            String baseField,
            String discriminator) {
        this.discriminator = discriminator;
        this.baseField = baseField;
    }

    /**
     * Getter for Discriminator.
     * The discriminator attribute.
     * @return Returns the String
     */
    @JsonGetter("discriminator")
    @XmlAttribute(name = "discrim")
    public String getDiscriminator() {
        return discriminator;
    }

    /**
     * Setter for Discriminator.
     * The discriminator attribute.
     * @param discriminator Value for String
     */
    @JsonSetter("discriminator")
    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    /**
     * Getter for BaseField.
     * String element in parent model.
     * @return Returns the String
     */
    @JsonGetter("Base Field")
    @XmlElement(name = "inherited")
    public String getBaseField() {
        return baseField;
    }

    /**
     * Setter for BaseField.
     * String element in parent model.
     * @param baseField Value for String
     */
    @JsonSetter("Base Field")
    public void setBaseField(String baseField) {
        this.baseField = baseField;
    }

    /**
     * Converts this BaseForDiscriminatorInAttribute into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BaseForDiscriminatorInAttribute [" + "baseField=" + baseField + ", discriminator="
                + discriminator + "]";
    }

    /**
     * Builds a new {@link BaseForDiscriminatorInAttribute.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BaseForDiscriminatorInAttribute.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(baseField)
                .discriminator(getDiscriminator());
        return builder;
    }

    /**
     * Class to build instances of {@link BaseForDiscriminatorInAttribute}.
     */
    public static class Builder {
        private String baseField;
        private String discriminator = "Darth Vader";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  baseField  String value for baseField.
         */
        public Builder(String baseField) {
            this.baseField = baseField;
        }

        /**
         * Setter for baseField.
         * @param  baseField  String value for baseField.
         * @return Builder
         */
        public Builder baseField(String baseField) {
            this.baseField = baseField;
            return this;
        }

        /**
         * Setter for discriminator.
         * @param  discriminator  String value for discriminator.
         * @return Builder
         */
        public Builder discriminator(String discriminator) {
            this.discriminator = discriminator;
            return this;
        }

        /**
         * Builds a new {@link BaseForDiscriminatorInAttribute} object using the set fields.
         * @return {@link BaseForDiscriminatorInAttribute}
         */
        public BaseForDiscriminatorInAttribute build() {
            return new BaseForDiscriminatorInAttribute(baseField, discriminator);
        }
    }
}
