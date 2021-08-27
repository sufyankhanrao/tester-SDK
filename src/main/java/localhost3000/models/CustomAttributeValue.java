/*
 * JsonValueTesterLib
 *
 * This file was automatically generated for Stamplay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import localhost3000.internal.OptionalNullable;
import localhost3000.utilities.JsonValue;

/**
 * This is a model class for CustomAttributeValue type.
 */
public class CustomAttributeValue
        extends BaseModel {
    private String id;
    private String definitionId;
    private JsonValue value;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<JsonValue> commentValue;

    /**
     * Default constructor.
     */
    public CustomAttributeValue() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  definitionId  String value for definitionId.
     * @param  value  JsonValue value for value.
     * @param  commentValue  JsonValue value for commentValue.
     */
    public CustomAttributeValue(
            String id,
            String definitionId,
            JsonValue value,
            JsonValue commentValue) {
        this.id = id;
        this.definitionId = definitionId;
        this.value = value;
        this.commentValue = OptionalNullable.of(commentValue);
    }

    /**
     * Internal initialization constructor.
     */
    protected CustomAttributeValue(String id, String definitionId, JsonValue value,
            OptionalNullable<JsonValue> commentValue) {
        this.id = id;
        this.definitionId = definitionId;
        this.value = value;
        this.commentValue = commentValue;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for DefinitionId.
     * @return Returns the String
     */
    @JsonGetter("definitionId")
    public String getDefinitionId() {
        return definitionId;
    }

    /**
     * Setter for DefinitionId.
     * @param definitionId Value for String
     */
    @JsonSetter("definitionId")
    public void setDefinitionId(String definitionId) {
        this.definitionId = definitionId;
    }

    /**
     * Getter for Value.
     * @return Returns the JsonValue
     */
    @JsonGetter("value")
    public JsonValue getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * @param value Value for JsonValue
     */
    @JsonSetter("value")
    public void setValue(JsonValue value) {
        this.value = value;
    }

    /**
     * Internal Getter for CommentValue.
     * @return Returns the Internal JsonValue
     */
    @JsonGetter("commentValue")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<JsonValue> internalGetCommentValue() {
        return this.commentValue;
    }

    /**
     * Getter for CommentValue.
     * @return Returns the JsonValue
     */
    public JsonValue getCommentValue() {
        return OptionalNullable.getFrom(commentValue);
    }

    /**
     * Setter for CommentValue.
     * @param commentValue Value for JsonValue
     */
    @JsonSetter("commentValue")
    public void setCommentValue(JsonValue commentValue) {
        this.commentValue = OptionalNullable.of(commentValue);
    }

    /**
     * UnSetter for CommentValue.
     */
    public void unsetCommentValue() {
        commentValue = null;
    }

    /**
     * Converts this CustomAttributeValue into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomAttributeValue [" + "id=" + id + ", definitionId=" + definitionId + ", value="
                + value + ", commentValue=" + commentValue + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CustomAttributeValue.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomAttributeValue.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, definitionId, value);
        builder.commentValue = internalGetCommentValue();
        return builder;
    }

    /**
     * Class to build instances of {@link CustomAttributeValue}.
     */
    public static class Builder {
        private String id;
        private String definitionId;
        private JsonValue value;
        private OptionalNullable<JsonValue> commentValue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  definitionId  String value for definitionId.
         * @param  value  JsonValue value for value.
         */
        public Builder(String id, String definitionId, JsonValue value) {
            this.id = id;
            this.definitionId = definitionId;
            this.value = value;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for definitionId.
         * @param  definitionId  String value for definitionId.
         * @return Builder
         */
        public Builder definitionId(String definitionId) {
            this.definitionId = definitionId;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  JsonValue value for value.
         * @return Builder
         */
        public Builder value(JsonValue value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for commentValue.
         * @param  commentValue  JsonValue value for commentValue.
         * @return Builder
         */
        public Builder commentValue(JsonValue commentValue) {
            this.commentValue = OptionalNullable.of(commentValue);
            return this;
        }

        /**
         * UnSetter for commentValue.
         * @return Builder
         */
        public Builder unsetCommentValue() {
            commentValue = null;
            return this;
        }

        /**
         * Builds a new {@link CustomAttributeValue} object using the set fields.
         * @return {@link CustomAttributeValue}
         */
        public CustomAttributeValue build() {
            return new CustomAttributeValue(id, definitionId, value, commentValue);
        }
    }
}
