/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AdditionalAmount type.
 */
public class AdditionalAmount {
    private Type1Enum type;
    private String amount;
    private AccountTypeEnum accountType;
    private Double currency;

    /**
     * Default constructor.
     */
    public AdditionalAmount() {
    }

    /**
     * Initialization constructor.
     * @param  type  Type1Enum value for type.
     * @param  amount  String value for amount.
     * @param  accountType  AccountTypeEnum value for accountType.
     * @param  currency  Double value for currency.
     */
    public AdditionalAmount(
            Type1Enum type,
            String amount,
            AccountTypeEnum accountType,
            Double currency) {
        this.type = type;
        this.amount = amount;
        this.accountType = accountType;
        this.currency = currency;
    }

    /**
     * Getter for Type.
     * type of the amount [4S-Healthcare(Visa and MC Only), 4U-Prescription/Rx(Visa and MC Only),
     * 4V-Vision/Optical(Visa Only), 4W-clinic/other qualified medical(Visa Only) ,4X-Dental(Visa
     * Only)].
     * @return Returns the Type1Enum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Type1Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * type of the amount [4S-Healthcare(Visa and MC Only), 4U-Prescription/Rx(Visa and MC Only),
     * 4V-Vision/Optical(Visa Only), 4W-clinic/other qualified medical(Visa Only) ,4X-Dental(Visa
     * Only)].
     * @param type Value for Type1Enum
     */
    @JsonSetter("type")
    public void setType(Type1Enum type) {
        this.type = type;
    }

    /**
     * Getter for Amount.
     * The amount of additional amount.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The amount of additional amount.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter for AccountType.
     * Account Type
     * @return Returns the AccountTypeEnum
     */
    @JsonGetter("account_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    /**
     * Setter for AccountType.
     * Account Type
     * @param accountType Value for AccountTypeEnum
     */
    @JsonSetter("account_type")
    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    /**
     * Getter for Currency.
     * Currency Code
     * @return Returns the Double
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Currency Code
     * @param currency Value for Double
     */
    @JsonSetter("currency")
    public void setCurrency(Double currency) {
        this.currency = currency;
    }

    /**
     * Converts this AdditionalAmount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AdditionalAmount [" + "type=" + type + ", amount=" + amount + ", accountType="
                + accountType + ", currency=" + currency + "]";
    }

    /**
     * Builds a new {@link AdditionalAmount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AdditionalAmount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .amount(getAmount())
                .accountType(getAccountType())
                .currency(getCurrency());
        return builder;
    }

    /**
     * Class to build instances of {@link AdditionalAmount}.
     */
    public static class Builder {
        private Type1Enum type;
        private String amount;
        private AccountTypeEnum accountType;
        private Double currency;



        /**
         * Setter for type.
         * @param  type  Type1Enum value for type.
         * @return Builder
         */
        public Builder type(Type1Enum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for accountType.
         * @param  accountType  AccountTypeEnum value for accountType.
         * @return Builder
         */
        public Builder accountType(AccountTypeEnum accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  Double value for currency.
         * @return Builder
         */
        public Builder currency(Double currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Builds a new {@link AdditionalAmount} object using the set fields.
         * @return {@link AdditionalAmount}
         */
        public AdditionalAmount build() {
            return new AdditionalAmount(type, amount, accountType, currency);
        }
    }
}
