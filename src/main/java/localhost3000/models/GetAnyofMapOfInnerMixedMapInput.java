/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetAnyofMapOfInnerMixedMapInput type.
 */
public class GetAnyofMapOfInnerMixedMapInput {
    private boolean isPrimitiveType;
    private boolean isAtEndpointLevel;
    private boolean hasDiscriminator;

    /**
     * Default constructor.
     */
    public GetAnyofMapOfInnerMixedMapInput() {
    }

    /**
     * Initialization constructor.
     * @param  isPrimitiveType  boolean value for isPrimitiveType.
     * @param  isAtEndpointLevel  boolean value for isAtEndpointLevel.
     * @param  hasDiscriminator  boolean value for hasDiscriminator.
     */
    public GetAnyofMapOfInnerMixedMapInput(
            boolean isPrimitiveType,
            boolean isAtEndpointLevel,
            boolean hasDiscriminator) {
        this.isPrimitiveType = isPrimitiveType;
        this.isAtEndpointLevel = isAtEndpointLevel;
        this.hasDiscriminator = hasDiscriminator;
    }

    /**
     * Getter for IsPrimitiveType.
     * @return Returns the boolean
     */
    @JsonGetter("isPrimitiveType")
    public boolean getIsPrimitiveType() {
        return isPrimitiveType;
    }

    /**
     * Setter for IsPrimitiveType.
     * @param isPrimitiveType Value for boolean
     */
    @JsonSetter("isPrimitiveType")
    public void setIsPrimitiveType(boolean isPrimitiveType) {
        this.isPrimitiveType = isPrimitiveType;
    }

    /**
     * Getter for IsAtEndpointLevel.
     * @return Returns the boolean
     */
    @JsonGetter("isAtEndpointLevel")
    public boolean getIsAtEndpointLevel() {
        return isAtEndpointLevel;
    }

    /**
     * Setter for IsAtEndpointLevel.
     * @param isAtEndpointLevel Value for boolean
     */
    @JsonSetter("isAtEndpointLevel")
    public void setIsAtEndpointLevel(boolean isAtEndpointLevel) {
        this.isAtEndpointLevel = isAtEndpointLevel;
    }

    /**
     * Getter for HasDiscriminator.
     * @return Returns the boolean
     */
    @JsonGetter("hasDiscriminator")
    public boolean getHasDiscriminator() {
        return hasDiscriminator;
    }

    /**
     * Setter for HasDiscriminator.
     * @param hasDiscriminator Value for boolean
     */
    @JsonSetter("hasDiscriminator")
    public void setHasDiscriminator(boolean hasDiscriminator) {
        this.hasDiscriminator = hasDiscriminator;
    }

    /**
     * Converts this GetAnyofMapOfInnerMixedMapInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAnyofMapOfInnerMixedMapInput [" + "isPrimitiveType=" + isPrimitiveType
                + ", isAtEndpointLevel=" + isAtEndpointLevel + ", hasDiscriminator="
                + hasDiscriminator + "]";
    }

    /**
     * Builds a new {@link GetAnyofMapOfInnerMixedMapInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAnyofMapOfInnerMixedMapInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(isPrimitiveType, isAtEndpointLevel, hasDiscriminator);
        return builder;
    }

    /**
     * Class to build instances of {@link GetAnyofMapOfInnerMixedMapInput}.
     */
    public static class Builder {
        private boolean isPrimitiveType;
        private boolean isAtEndpointLevel;
        private boolean hasDiscriminator;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  isPrimitiveType  boolean value for isPrimitiveType.
         * @param  isAtEndpointLevel  boolean value for isAtEndpointLevel.
         * @param  hasDiscriminator  boolean value for hasDiscriminator.
         */
        public Builder(boolean isPrimitiveType, boolean isAtEndpointLevel,
                boolean hasDiscriminator) {
            this.isPrimitiveType = isPrimitiveType;
            this.isAtEndpointLevel = isAtEndpointLevel;
            this.hasDiscriminator = hasDiscriminator;
        }

        /**
         * Setter for isPrimitiveType.
         * @param  isPrimitiveType  boolean value for isPrimitiveType.
         * @return Builder
         */
        public Builder isPrimitiveType(boolean isPrimitiveType) {
            this.isPrimitiveType = isPrimitiveType;
            return this;
        }

        /**
         * Setter for isAtEndpointLevel.
         * @param  isAtEndpointLevel  boolean value for isAtEndpointLevel.
         * @return Builder
         */
        public Builder isAtEndpointLevel(boolean isAtEndpointLevel) {
            this.isAtEndpointLevel = isAtEndpointLevel;
            return this;
        }

        /**
         * Setter for hasDiscriminator.
         * @param  hasDiscriminator  boolean value for hasDiscriminator.
         * @return Builder
         */
        public Builder hasDiscriminator(boolean hasDiscriminator) {
            this.hasDiscriminator = hasDiscriminator;
            return this;
        }

        /**
         * Builds a new {@link GetAnyofMapOfInnerMixedMapInput} object using the set fields.
         * @return {@link GetAnyofMapOfInnerMixedMapInput}
         */
        public GetAnyofMapOfInnerMixedMapInput build() {
            return new GetAnyofMapOfInnerMixedMapInput(isPrimitiveType, isAtEndpointLevel,
                    hasDiscriminator);
        }
    }
}
