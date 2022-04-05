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
 * PaymentMethod4Enum to be used.
 */
public enum PaymentMethod4Enum {
    CC,

    ACH;


    private static TreeMap<String, PaymentMethod4Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        CC.value = "cc";
        ACH.value = "ach";

        valueMap.put("cc", CC);
        valueMap.put("ach", ACH);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PaymentMethod4Enum fromString(String toConvert) {
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
     * Convert list of PaymentMethod4Enum values to list of string values.
     * @param toConvert The list of PaymentMethod4Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaymentMethod4Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaymentMethod4Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 