/*
 * AnyOfScalarModelsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SendAnyofInnerMixedMapInput type.
 */
public class SendAnyofInnerMixedMapInput {
    private boolean isPrimitiveType;
    private boolean isAtEndpointLevel;
    private boolean hasDiscriminator;
    private InnerMixedMapCase innerMixedMapCase;

    /**
     * Default constructor.
     */
    public SendAnyofInnerMixedMapInput() {
    }

    /**
     * Initialization constructor.
     * @param  isPrimitiveType  boolean value for isPrimitiveType.
     * @param  isAtEndpointLevel  boolean value for isAtEndpointLevel.
     * @param  hasDiscriminator  boolean value for hasDiscriminator.
     * @param  innerMixedMapCase  InnerMixedMapCase value for innerMixedMapCase.
     */
    public SendAnyofInnerMixedMapInput(
            boolean isPrimitiveType,
            boolean isAtEndpointLevel,
            boolean hasDiscriminator,
            InnerMixedMapCase innerMixedMapCase) {
        this.isPrimitiveType = isPrimitiveType;
        this.isAtEndpointLevel = isAtEndpointLevel;
        this.hasDiscriminator = hasDiscriminator;
        this.innerMixedMapCase = innerMixedMapCase;
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
     * Getter for InnerMixedMapCase.
     * @return Returns the InnerMixedMapCase
     */
    @JsonGetter("innerMixedMapCase")
    public InnerMixedMapCase getInnerMixedMapCase() {
        return innerMixedMapCase;
    }

    /**
     * Setter for InnerMixedMapCase.
     * @param innerMixedMapCase Value for InnerMixedMapCase
     */
    @JsonSetter("innerMixedMapCase")
    public void setInnerMixedMapCase(InnerMixedMapCase innerMixedMapCase) {
        this.innerMixedMapCase = innerMixedMapCase;
    }

    /**
     * Converts this SendAnyofInnerMixedMapInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendAnyofInnerMixedMapInput [" + "isPrimitiveType=" + isPrimitiveType
                + ", isAtEndpointLevel=" + isAtEndpointLevel + ", hasDiscriminator="
                + hasDiscriminator + ", innerMixedMapCase=" + innerMixedMapCase + "]";
    }

    /**
     * Builds a new {@link SendAnyofInnerMixedMapInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendAnyofInnerMixedMapInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(isPrimitiveType, isAtEndpointLevel, hasDiscriminator,
                innerMixedMapCase);
        return builder;
    }

    /**
     * Class to build instances of {@link SendAnyofInnerMixedMapInput}.
     */
    public static class Builder {
        private boolean isPrimitiveType;
        private boolean isAtEndpointLevel;
        private boolean hasDiscriminator;
        private InnerMixedMapCase innerMixedMapCase;

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
         * @param  innerMixedMapCase  InnerMixedMapCase value for innerMixedMapCase.
         */
        public Builder(boolean isPrimitiveType, boolean isAtEndpointLevel, boolean hasDiscriminator,
                InnerMixedMapCase innerMixedMapCase) {
            this.isPrimitiveType = isPrimitiveType;
            this.isAtEndpointLevel = isAtEndpointLevel;
            this.hasDiscriminator = hasDiscriminator;
            this.innerMixedMapCase = innerMixedMapCase;
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
         * Setter for innerMixedMapCase.
         * @param  innerMixedMapCase  InnerMixedMapCase value for innerMixedMapCase.
         * @return Builder
         */
        public Builder innerMixedMapCase(InnerMixedMapCase innerMixedMapCase) {
            this.innerMixedMapCase = innerMixedMapCase;
            return this;
        }

        /**
         * Builds a new {@link SendAnyofInnerMixedMapInput} object using the set fields.
         * @return {@link SendAnyofInnerMixedMapInput}
         */
        public SendAnyofInnerMixedMapInput build() {
            return new SendAnyofInnerMixedMapInput(isPrimitiveType, isAtEndpointLevel,
                    hasDiscriminator, innerMixedMapCase);
        }
    }
}
