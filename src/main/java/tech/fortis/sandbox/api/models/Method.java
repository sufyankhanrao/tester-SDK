/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Method type.
 */
public class Method {
    private TypeEnum type;
    private String productTransactionId;

    /**
     * Default constructor.
     */
    public Method() {
    }

    /**
     * Initialization constructor.
     * @param  type  TypeEnum value for type.
     * @param  productTransactionId  String value for productTransactionId.
     */
    public Method(
            TypeEnum type,
            String productTransactionId) {
        this.type = type;
        this.productTransactionId = productTransactionId;
    }

    /**
     * Getter for Type.
     * Payment type. Must be unique.
     * @return Returns the TypeEnum
     */
    @JsonGetter("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Payment type. Must be unique.
     * @param type Value for TypeEnum
     */
    @JsonSetter("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Getter for ProductTransactionId.
     * The Product's method (cc/ach) has to match the type.
     * @return Returns the String
     */
    @JsonGetter("product_transaction_id")
    public String getProductTransactionId() {
        return productTransactionId;
    }

    /**
     * Setter for ProductTransactionId.
     * The Product's method (cc/ach) has to match the type.
     * @param productTransactionId Value for String
     */
    @JsonSetter("product_transaction_id")
    public void setProductTransactionId(String productTransactionId) {
        this.productTransactionId = productTransactionId;
    }

    /**
     * Converts this Method into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Method [" + "type=" + type + ", productTransactionId=" + productTransactionId + "]";
    }

    /**
     * Builds a new {@link Method.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Method.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, productTransactionId);
        return builder;
    }

    /**
     * Class to build instances of {@link Method}.
     */
    public static class Builder {
        private TypeEnum type;
        private String productTransactionId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  TypeEnum value for type.
         * @param  productTransactionId  String value for productTransactionId.
         */
        public Builder(TypeEnum type, String productTransactionId) {
            this.type = type;
            this.productTransactionId = productTransactionId;
        }

        /**
         * Setter for type.
         * @param  type  TypeEnum value for type.
         * @return Builder
         */
        public Builder type(TypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for productTransactionId.
         * @param  productTransactionId  String value for productTransactionId.
         * @return Builder
         */
        public Builder productTransactionId(String productTransactionId) {
            this.productTransactionId = productTransactionId;
            return this;
        }

        /**
         * Builds a new {@link Method} object using the set fields.
         * @return {@link Method}
         */
        public Method build() {
            return new Method(type, productTransactionId);
        }
    }
}