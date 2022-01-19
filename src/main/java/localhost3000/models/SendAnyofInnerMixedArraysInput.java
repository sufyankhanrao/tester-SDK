/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SendAnyofInnerMixedArraysInput type.
 */
public class SendAnyofInnerMixedArraysInput {
    private boolean isPrimitiveType;
    private boolean isAtEndpointLevel;
    private boolean hasDiscriminator;
    private InnerMixedArrayCase innerMixedArrayCase;

    /**
     * Default constructor.
     */
    public SendAnyofInnerMixedArraysInput() {
    }

    /**
     * Initialization constructor.
     * @param  isPrimitiveType  boolean value for isPrimitiveType.
     * @param  isAtEndpointLevel  boolean value for isAtEndpointLevel.
     * @param  hasDiscriminator  boolean value for hasDiscriminator.
     * @param  innerMixedArrayCase  InnerMixedArrayCase value for innerMixedArrayCase.
     */
    public SendAnyofInnerMixedArraysInput(
            boolean isPrimitiveType,
            boolean isAtEndpointLevel,
            boolean hasDiscriminator,
            InnerMixedArrayCase innerMixedArrayCase) {
        this.isPrimitiveType = isPrimitiveType;
        this.isAtEndpointLevel = isAtEndpointLevel;
        this.hasDiscriminator = hasDiscriminator;
        this.innerMixedArrayCase = innerMixedArrayCase;
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
     * Getter for InnerMixedArrayCase.
     * @return Returns the InnerMixedArrayCase
     */
    @JsonGetter("innerMixedArrayCase")
    public InnerMixedArrayCase getInnerMixedArrayCase() {
        return innerMixedArrayCase;
    }

    /**
     * Setter for InnerMixedArrayCase.
     * @param innerMixedArrayCase Value for InnerMixedArrayCase
     */
    @JsonSetter("innerMixedArrayCase")
    public void setInnerMixedArrayCase(InnerMixedArrayCase innerMixedArrayCase) {
        this.innerMixedArrayCase = innerMixedArrayCase;
    }

    /**
     * Converts this SendAnyofInnerMixedArraysInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendAnyofInnerMixedArraysInput [" + "isPrimitiveType=" + isPrimitiveType
                + ", isAtEndpointLevel=" + isAtEndpointLevel + ", hasDiscriminator="
                + hasDiscriminator + ", innerMixedArrayCase=" + innerMixedArrayCase + "]";
    }

    /**
     * Builds a new {@link SendAnyofInnerMixedArraysInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendAnyofInnerMixedArraysInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(isPrimitiveType, isAtEndpointLevel, hasDiscriminator,
                innerMixedArrayCase);
        return builder;
    }

    /**
     * Class to build instances of {@link SendAnyofInnerMixedArraysInput}.
     */
    public static class Builder {
        private boolean isPrimitiveType;
        private boolean isAtEndpointLevel;
        private boolean hasDiscriminator;
        private InnerMixedArrayCase innerMixedArrayCase;

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
         * @param  innerMixedArrayCase  InnerMixedArrayCase value for innerMixedArrayCase.
         */
        public Builder(boolean isPrimitiveType, boolean isAtEndpointLevel, boolean hasDiscriminator,
                InnerMixedArrayCase innerMixedArrayCase) {
            this.isPrimitiveType = isPrimitiveType;
            this.isAtEndpointLevel = isAtEndpointLevel;
            this.hasDiscriminator = hasDiscriminator;
            this.innerMixedArrayCase = innerMixedArrayCase;
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
         * Setter for innerMixedArrayCase.
         * @param  innerMixedArrayCase  InnerMixedArrayCase value for innerMixedArrayCase.
         * @return Builder
         */
        public Builder innerMixedArrayCase(InnerMixedArrayCase innerMixedArrayCase) {
            this.innerMixedArrayCase = innerMixedArrayCase;
            return this;
        }

        /**
         * Builds a new {@link SendAnyofInnerMixedArraysInput} object using the set fields.
         * @return {@link SendAnyofInnerMixedArraysInput}
         */
        public SendAnyofInnerMixedArraysInput build() {
            return new SendAnyofInnerMixedArraysInput(isPrimitiveType, isAtEndpointLevel,
                    hasDiscriminator, innerMixedArrayCase);
        }
    }
}
