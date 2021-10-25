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
 * LacsIndicatorEnum to be used.
 */
public enum LacsIndicatorEnum {
    ENUM_0,

    ENUM_1;


    private static TreeMap<String, LacsIndicatorEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_0.value = "Y";
        ENUM_1.value = "N";

        valueMap.put("Y", ENUM_0);
        valueMap.put("N", ENUM_1);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static LacsIndicatorEnum fromString(String toConvert) {
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
     * Convert list of LacsIndicatorEnum values to list of string values.
     * @param toConvert The list of LacsIndicatorEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LacsIndicatorEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LacsIndicatorEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 