/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for V1TransactionsLevel3MasterCardRequest type.
 */
public class V1TransactionsLevel3MasterCardRequest {
    private Level3Data level3Data;

    /**
     * Default constructor.
     */
    public V1TransactionsLevel3MasterCardRequest() {
    }

    /**
     * Initialization constructor.
     * @param  level3Data  Level3Data value for level3Data.
     */
    public V1TransactionsLevel3MasterCardRequest(
            Level3Data level3Data) {
        this.level3Data = level3Data;
    }

    /**
     * Getter for Level3Data.
     * @return Returns the Level3Data
     */
    @JsonGetter("level3_data")
    public Level3Data getLevel3Data() {
        return level3Data;
    }

    /**
     * Setter for Level3Data.
     * @param level3Data Value for Level3Data
     */
    @JsonSetter("level3_data")
    public void setLevel3Data(Level3Data level3Data) {
        this.level3Data = level3Data;
    }

    /**
     * Converts this V1TransactionsLevel3MasterCardRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V1TransactionsLevel3MasterCardRequest [" + "level3Data=" + level3Data + "]";
    }

    /**
     * Builds a new {@link V1TransactionsLevel3MasterCardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1TransactionsLevel3MasterCardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(level3Data);
        return builder;
    }

    /**
     * Class to build instances of {@link V1TransactionsLevel3MasterCardRequest}.
     */
    public static class Builder {
        private Level3Data level3Data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  level3Data  Level3Data value for level3Data.
         */
        public Builder(Level3Data level3Data) {
            this.level3Data = level3Data;
        }

        /**
         * Setter for level3Data.
         * @param  level3Data  Level3Data value for level3Data.
         * @return Builder
         */
        public Builder level3Data(Level3Data level3Data) {
            this.level3Data = level3Data;
            return this;
        }

        /**
         * Builds a new {@link V1TransactionsLevel3MasterCardRequest} object using the set fields.
         * @return {@link V1TransactionsLevel3MasterCardRequest}
         */
        public V1TransactionsLevel3MasterCardRequest build() {
            return new V1TransactionsLevel3MasterCardRequest(level3Data);
        }
    }
}
