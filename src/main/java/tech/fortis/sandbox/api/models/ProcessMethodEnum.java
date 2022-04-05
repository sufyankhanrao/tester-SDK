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
 * ProcessMethodEnum to be used.
 */
public enum ProcessMethodEnum {
    VIRTUAL_TERMINAL,

    PHYSICAL_TERMINAL;


    private static TreeMap<String, ProcessMethodEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        VIRTUAL_TERMINAL.value = "virtual_terminal";
        PHYSICAL_TERMINAL.value = "physical_terminal";

        valueMap.put("virtual_terminal", VIRTUAL_TERMINAL);
        valueMap.put("physical_terminal", PHYSICAL_TERMINAL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ProcessMethodEnum fromString(String toConvert) {
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
     * Convert list of ProcessMethodEnum values to list of string values.
     * @param toConvert The list of ProcessMethodEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProcessMethodEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProcessMethodEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 