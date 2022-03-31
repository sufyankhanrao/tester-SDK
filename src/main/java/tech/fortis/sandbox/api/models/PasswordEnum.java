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
 * PasswordEnum to be used.
 */
public enum PasswordEnum {
    ASC,

    DESC;


    private static TreeMap<String, PasswordEnum> valueMap = new TreeMap<>();
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
    public static PasswordEnum fromString(String toConvert) {
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
     * Convert list of PasswordEnum values to list of string values.
     * @param toConvert The list of PasswordEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PasswordEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PasswordEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 