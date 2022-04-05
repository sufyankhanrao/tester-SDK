/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * ResourceEnum to be used.
 */
public enum ResourceEnum {
    RECURRING,

    TRANSACTION,

    ACCOUNTVAULT,

    DEVICETERM;


    private static TreeMap<String, ResourceEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        RECURRING.value = "Recurring";
        TRANSACTION.value = "Transaction";
        ACCOUNTVAULT.value = "AccountVault";
        DEVICETERM.value = "DeviceTerm";

        valueMap.put("Recurring", RECURRING);
        valueMap.put("Transaction", TRANSACTION);
        valueMap.put("AccountVault", ACCOUNTVAULT);
        valueMap.put("DeviceTerm", DEVICETERM);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ResourceEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of ResourceEnum values to list of string values.
     * @param toConvert The list of ResourceEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ResourceEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ResourceEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 