/*
 * LobAPI20200211SpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * ExtraService1Enum to be used.
 */
public enum ExtraService1Enum {
    CERTIFIED,

    CERTIFIED_RETURN_RECEIPT,

    REGISTERED;


    private static TreeMap<String, ExtraService1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        CERTIFIED.value = "certified";
        CERTIFIED_RETURN_RECEIPT.value = "certified_return_receipt";
        REGISTERED.value = "registered";

        valueMap.put("certified", CERTIFIED);
        valueMap.put("certified_return_receipt", CERTIFIED_RETURN_RECEIPT);
        valueMap.put("registered", REGISTERED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExtraService1Enum fromString(String toConvert) {
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
     * Convert list of ExtraService1Enum values to list of string values.
     * @param toConvert The list of ExtraService1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ExtraService1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ExtraService1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 