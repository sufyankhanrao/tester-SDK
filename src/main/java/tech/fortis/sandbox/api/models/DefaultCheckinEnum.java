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
 * DefaultCheckinEnum to be used.
 */
public enum DefaultCheckinEnum {
    ASC,

    DESC;


    private static TreeMap<String, DefaultCheckinEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ASC.value = "asc";
        DESC.value = "desc";

        valueMap.put("asc", ASC);
        valueMap.put("desc", DESC);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static DefaultCheckinEnum fromString(String toConvert) {
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
     * Convert list of DefaultCheckinEnum values to list of string values.
     * @param toConvert The list of DefaultCheckinEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DefaultCheckinEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DefaultCheckinEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 