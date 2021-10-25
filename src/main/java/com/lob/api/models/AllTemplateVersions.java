/*
 * LobAPI20200211SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.internal.OptionalNullable;
import java.util.List;

/**
 * This is a model class for AllTemplateVersions type.
 */
public class AllTemplateVersions {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<TemplateVersion> data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String object;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> nextUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> previousUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer count;

    /**
     * Default constructor.
     */
    public AllTemplateVersions() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of TemplateVersion value for data.
     * @param  object  String value for object.
     * @param  nextUrl  String value for nextUrl.
     * @param  previousUrl  String value for previousUrl.
     * @param  count  Integer value for count.
     */
    public AllTemplateVersions(
            List<TemplateVersion> data,
            String object,
            String nextUrl,
            String previousUrl,
            Integer count) {
        this.data = data;
        this.object = object;
        this.nextUrl = OptionalNullable.of(nextUrl);
        this.previousUrl = OptionalNullable.of(previousUrl);
        this.count = count;
    }

    /**
     * Internal initialization constructor.
     */
    protected AllTemplateVersions(List<TemplateVersion> data, String object,
            OptionalNullable<String> nextUrl, OptionalNullable<String> previousUrl,
            Integer count) {
        this.data = data;
        this.object = object;
        this.nextUrl = nextUrl;
        this.previousUrl = previousUrl;
        this.count = count;
    }

    /**
     * Getter for Data.
     * list of template versions
     * @return Returns the List of TemplateVersion
     */
    @JsonGetter("data")
    public List<TemplateVersion> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * list of template versions
     * @param data Value for List of TemplateVersion
     */
    @JsonSetter("data")
    public void setData(List<TemplateVersion> data) {
        this.data = data;
    }

    /**
     * Getter for Object.
     * Value is type of resource.
     * @return Returns the String
     */
    @JsonGetter("object")
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * Value is type of resource.
     * @param object Value for String
     */
    @JsonSetter("object")
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * Internal Getter for NextUrl.
     * Url of next page of items in list.
     * @return Returns the Internal String
     */
    @JsonGetter("next_url")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNextUrl() {
        return this.nextUrl;
    }

    /**
     * Getter for NextUrl.
     * Url of next page of items in list.
     * @return Returns the String
     */
    public String getNextUrl() {
        return OptionalNullable.getFrom(nextUrl);
    }

    /**
     * Setter for NextUrl.
     * Url of next page of items in list.
     * @param nextUrl Value for String
     */
    @JsonSetter("next_url")
    public void setNextUrl(String nextUrl) {
        this.nextUrl = OptionalNullable.of(nextUrl);
    }

    /**
     * UnSetter for NextUrl.
     * Url of next page of items in list.
     */
    public void unsetNextUrl() {
        nextUrl = null;
    }

    /**
     * Internal Getter for PreviousUrl.
     * Url of previous page of items in list.
     * @return Returns the Internal String
     */
    @JsonGetter("previous_url")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPreviousUrl() {
        return this.previousUrl;
    }

    /**
     * Getter for PreviousUrl.
     * Url of previous page of items in list.
     * @return Returns the String
     */
    public String getPreviousUrl() {
        return OptionalNullable.getFrom(previousUrl);
    }

    /**
     * Setter for PreviousUrl.
     * Url of previous page of items in list.
     * @param previousUrl Value for String
     */
    @JsonSetter("previous_url")
    public void setPreviousUrl(String previousUrl) {
        this.previousUrl = OptionalNullable.of(previousUrl);
    }

    /**
     * UnSetter for PreviousUrl.
     * Url of previous page of items in list.
     */
    public void unsetPreviousUrl() {
        previousUrl = null;
    }

    /**
     * Getter for Count.
     * number of resources in a set
     * @return Returns the Integer
     */
    @JsonGetter("count")
    public Integer getCount() {
        return count;
    }

    /**
     * Setter for Count.
     * number of resources in a set
     * @param count Value for Integer
     */
    @JsonSetter("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Converts this AllTemplateVersions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllTemplateVersions [" + "data=" + data + ", object=" + object + ", nextUrl="
                + nextUrl + ", previousUrl=" + previousUrl + ", count=" + count + "]";
    }

    /**
     * Builds a new {@link AllTemplateVersions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllTemplateVersions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .data(getData())
                .object(getObject())
                .count(getCount());
        builder.nextUrl = internalGetNextUrl();
        builder.previousUrl = internalGetPreviousUrl();
        return builder;
    }

    /**
     * Class to build instances of {@link AllTemplateVersions}.
     */
    public static class Builder {
        private List<TemplateVersion> data;
        private String object;
        private OptionalNullable<String> nextUrl;
        private OptionalNullable<String> previousUrl;
        private Integer count;



        /**
         * Setter for data.
         * @param  data  List of TemplateVersion value for data.
         * @return Builder
         */
        public Builder data(List<TemplateVersion> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for object.
         * @param  object  String value for object.
         * @return Builder
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * Setter for nextUrl.
         * @param  nextUrl  String value for nextUrl.
         * @return Builder
         */
        public Builder nextUrl(String nextUrl) {
            this.nextUrl = OptionalNullable.of(nextUrl);
            return this;
        }

        /**
         * UnSetter for nextUrl.
         * @return Builder
         */
        public Builder unsetNextUrl() {
            nextUrl = null;
            return this;
        }

        /**
         * Setter for previousUrl.
         * @param  previousUrl  String value for previousUrl.
         * @return Builder
         */
        public Builder previousUrl(String previousUrl) {
            this.previousUrl = OptionalNullable.of(previousUrl);
            return this;
        }

        /**
         * UnSetter for previousUrl.
         * @return Builder
         */
        public Builder unsetPreviousUrl() {
            previousUrl = null;
            return this;
        }

        /**
         * Setter for count.
         * @param  count  Integer value for count.
         * @return Builder
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Builds a new {@link AllTemplateVersions} object using the set fields.
         * @return {@link AllTemplateVersions}
         */
        public AllTemplateVersions build() {
            return new AllTemplateVersions(data, object, nextUrl, previousUrl, count);
        }
    }
}
