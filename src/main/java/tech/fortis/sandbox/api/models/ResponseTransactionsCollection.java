/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ResponseTransactionsCollection type.
 */
public class ResponseTransactionsCollection {
    private String type;
    private List<List10> list;

    /**
     * Default constructor.
     */
    public ResponseTransactionsCollection() {
        type = "TransactionsCollection";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  list  List of List10 value for list.
     */
    public ResponseTransactionsCollection(
            String type,
            List<List10> list) {
        this.type = type;
        this.list = list;
    }

    /**
     * Getter for Type.
     * Resource Type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Resource Type
     * @param type Value for String
     */
    @JsonSetter("type")
    private void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for List.
     * Resource Members
     * @return Returns the List of List10
     */
    @JsonGetter("list")
    public List<List10> getList() {
        return list;
    }

    /**
     * Setter for List.
     * Resource Members
     * @param list Value for List of List10
     */
    @JsonSetter("list")
    public void setList(List<List10> list) {
        this.list = list;
    }

    /**
     * Converts this ResponseTransactionsCollection into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResponseTransactionsCollection [" + "type=" + type + ", list=" + list + "]";
    }

    /**
     * Builds a new {@link ResponseTransactionsCollection.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResponseTransactionsCollection.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, list);
        return builder;
    }

    /**
     * Class to build instances of {@link ResponseTransactionsCollection}.
     */
    public static class Builder {
        private String type = "TransactionsCollection";
        private List<List10> list;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  list  List of List10 value for list.
         */
        public Builder(String type, List<List10> list) {
            this.type = type;
            this.list = list;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for list.
         * @param  list  List of List10 value for list.
         * @return Builder
         */
        public Builder list(List<List10> list) {
            this.list = list;
            return this;
        }

        /**
         * Builds a new {@link ResponseTransactionsCollection} object using the set fields.
         * @return {@link ResponseTransactionsCollection}
         */
        public ResponseTransactionsCollection build() {
            return new ResponseTransactionsCollection(type, list);
        }
    }
}
