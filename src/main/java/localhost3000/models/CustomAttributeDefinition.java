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
 * This is a model class for CustomAttributeDefinition type.
 */
public class CustomAttributeDefinition
        extends BaseModel {
    private String name;
    private String id;
    private JsonValue schema;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<JsonValue> commentSchema;

    /**
     * Default constructor.
     */
    public CustomAttributeDefinition() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  schema  JsonValue value for schema.
     * @param  commentSchema  JsonValue value for commentSchema.
     */
    public CustomAttributeDefinition(
            String name,
            String id,
            JsonValue schema,
            JsonValue commentSchema) {
        this.name = name;
        this.id = id;
        this.schema = schema;
        this.commentSchema = OptionalNullable.of(commentSchema);
    }

    /**
     * Internal initialization constructor.
     */
    protected CustomAttributeDefinition(String name, String id, JsonValue schema,
            OptionalNullable<JsonValue> commentSchema) {
        this.name = name;
        this.id = id;
        this.schema = schema;
        this.commentSchema = commentSchema;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for Schema.
     * @return Returns the JsonValue
     */
    @JsonGetter("schema")
    public JsonValue getSchema() {
        return schema;
    }

    /**
     * Setter for Schema.
     * @param schema Value for JsonValue
     */
    @JsonSetter("schema")
    public void setSchema(JsonValue schema) {
        this.schema = schema;
    }

    /**
     * Internal Getter for CommentSchema.
     * @return Returns the Internal JsonValue
     */
    @JsonGetter("commentSchema")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<JsonValue> internalGetCommentSchema() {
        return this.commentSchema;
    }

    /**
     * Getter for CommentSchema.
     * @return Returns the JsonValue
     */
    public JsonValue getCommentSchema() {
        return OptionalNullable.getFrom(commentSchema);
    }

    /**
     * Setter for CommentSchema.
     * @param commentSchema Value for JsonValue
     */
    @JsonSetter("commentSchema")
    public void setCommentSchema(JsonValue commentSchema) {
        this.commentSchema = OptionalNullable.of(commentSchema);
    }

    /**
     * UnSetter for CommentSchema.
     */
    public void unsetCommentSchema() {
        commentSchema = null;
    }

    /**
     * Converts this CustomAttributeDefinition into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomAttributeDefinition [" + "name=" + name + ", id=" + id + ", schema=" + schema
                + ", commentSchema=" + commentSchema + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CustomAttributeDefinition.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomAttributeDefinition.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, id, schema);
        builder.commentSchema = internalGetCommentSchema();
        return builder;
    }

    /**
     * Class to build instances of {@link CustomAttributeDefinition}.
     */
    public static class Builder {
        private String name;
        private String id;
        private JsonValue schema;
        private OptionalNullable<JsonValue> commentSchema;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  id  String value for id.
         * @param  schema  JsonValue value for schema.
         */
        public Builder(String name, String id, JsonValue schema) {
            this.name = name;
            this.id = id;
            this.schema = schema;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
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
         * Setter for schema.
         * @param  schema  JsonValue value for schema.
         * @return Builder
         */
        public Builder schema(JsonValue schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Setter for commentSchema.
         * @param  commentSchema  JsonValue value for commentSchema.
         * @return Builder
         */
        public Builder commentSchema(JsonValue commentSchema) {
            this.commentSchema = OptionalNullable.of(commentSchema);
            return this;
        }

        /**
         * UnSetter for commentSchema.
         * @return Builder
         */
        public Builder unsetCommentSchema() {
            commentSchema = null;
            return this;
        }

        /**
         * Builds a new {@link CustomAttributeDefinition} object using the set fields.
         * @return {@link CustomAttributeDefinition}
         */
        public CustomAttributeDefinition build() {
            return new CustomAttributeDefinition(name, id, schema, commentSchema);
        }
    }
}
