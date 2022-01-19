/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SendAnyofOuterMapOfArrayInput type.
 */
public class SendAnyofOuterMapOfArrayInput {
    private boolean isPrimitiveType;
    private boolean isAtEndpointLevel;
    private boolean hasDiscriminator;
    private OuterMapOfArrayCase outerMapOfArrayCase;

    /**
     * Default constructor.
     */
    public SendAnyofOuterMapOfArrayInput() {
    }

    /**
     * Initialization constructor.
     * @param  isPrimitiveType  boolean value for isPrimitiveType.
     * @param  isAtEndpointLevel  boolean value for isAtEndpointLevel.
     * @param  hasDiscriminator  boolean value for hasDiscriminator.
     * @param  outerMapOfArrayCase  OuterMapOfArrayCase value for outerMapOfArrayCase.
     */
    public SendAnyofOuterMapOfArrayInput(
            boolean isPrimitiveType,
            boolean isAtEndpointLevel,
            boolean hasDiscriminator,
            OuterMapOfArrayCase outerMapOfArrayCase) {
        this.isPrimitiveType = isPrimitiveType;
        this.isAtEndpointLevel = isAtEndpointLevel;
        this.hasDiscriminator = hasDiscriminator;
        this.outerMapOfArrayCase = outerMapOfArrayCase;
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
     * Getter for OuterMapOfArrayCase.
     * @return Returns the OuterMapOfArrayCase
     */
    @JsonGetter("outerMapOfArrayCase")
    public OuterMapOfArrayCase getOuterMapOfArrayCase() {
        return outerMapOfArrayCase;
    }

    /**
     * Setter for OuterMapOfArrayCase.
     * @param outerMapOfArrayCase Value for OuterMapOfArrayCase
     */
    @JsonSetter("outerMapOfArrayCase")
    public void setOuterMapOfArrayCase(OuterMapOfArrayCase outerMapOfArrayCase) {
        this.outerMapOfArrayCase = outerMapOfArrayCase;
    }

    /**
     * Converts this SendAnyofOuterMapOfArrayInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendAnyofOuterMapOfArrayInput [" + "isPrimitiveType=" + isPrimitiveType
                + ", isAtEndpointLevel=" + isAtEndpointLevel + ", hasDiscriminator="
                + hasDiscriminator + ", outerMapOfArrayCase=" + outerMapOfArrayCase + "]";
    }

    /**
     * Builds a new {@link SendAnyofOuterMapOfArrayInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendAnyofOuterMapOfArrayInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(isPrimitiveType, isAtEndpointLevel, hasDiscriminator,
                outerMapOfArrayCase);
        return builder;
    }

    /**
     * Class to build instances of {@link SendAnyofOuterMapOfArrayInput}.
     */
    public static class Builder {
        private boolean isPrimitiveType;
        private boolean isAtEndpointLevel;
        private boolean hasDiscriminator;
        private OuterMapOfArrayCase outerMapOfArrayCase;

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
         * @param  outerMapOfArrayCase  OuterMapOfArrayCase value for outerMapOfArrayCase.
         */
        public Builder(boolean isPrimitiveType, boolean isAtEndpointLevel, boolean hasDiscriminator,
                OuterMapOfArrayCase outerMapOfArrayCase) {
            this.isPrimitiveType = isPrimitiveType;
            this.isAtEndpointLevel = isAtEndpointLevel;
            this.hasDiscriminator = hasDiscriminator;
            this.outerMapOfArrayCase = outerMapOfArrayCase;
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
         * Setter for outerMapOfArrayCase.
         * @param  outerMapOfArrayCase  OuterMapOfArrayCase value for outerMapOfArrayCase.
         * @return Builder
         */
        public Builder outerMapOfArrayCase(OuterMapOfArrayCase outerMapOfArrayCase) {
            this.outerMapOfArrayCase = outerMapOfArrayCase;
            return this;
        }

        /**
         * Builds a new {@link SendAnyofOuterMapOfArrayInput} object using the set fields.
         * @return {@link SendAnyofOuterMapOfArrayInput}
         */
        public SendAnyofOuterMapOfArrayInput build() {
            return new SendAnyofOuterMapOfArrayInput(isPrimitiveType, isAtEndpointLevel,
                    hasDiscriminator, outerMapOfArrayCase);
        }
    }
}
