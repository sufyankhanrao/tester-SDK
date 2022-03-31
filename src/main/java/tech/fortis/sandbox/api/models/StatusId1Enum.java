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
 * StatusId1Enum to be used.
 */
public enum StatusId1Enum {
    ENUM_101,

    ENUM_102,

    ENUM_111,

    ENUM_121,

    ENUM_131,

    ENUM_132,

    ENUM_133,

    ENUM_134,

    ENUM_191,

    ENUM_201,

    ENUM_301,

    ENUM_331;


    private static TreeMap<Integer, StatusId1Enum> valueMap = new TreeMap<>();
    private Integer value;

    static {
        ENUM_101.value = 101;
        ENUM_102.value = 102;
        ENUM_111.value = 111;
        ENUM_121.value = 121;
        ENUM_131.value = 131;
        ENUM_132.value = 132;
        ENUM_133.value = 133;
        ENUM_134.value = 134;
        ENUM_191.value = 191;
        ENUM_201.value = 201;
        ENUM_301.value = 301;
        ENUM_331.value = 331;

        valueMap.put(101, ENUM_101);
        valueMap.put(102, ENUM_102);
        valueMap.put(111, ENUM_111);
        valueMap.put(121, ENUM_121);
        valueMap.put(131, ENUM_131);
        valueMap.put(132, ENUM_132);
        valueMap.put(133, ENUM_133);
        valueMap.put(134, ENUM_134);
        valueMap.put(191, ENUM_191);
        valueMap.put(201, ENUM_201);
        valueMap.put(301, ENUM_301);
        valueMap.put(331, ENUM_331);
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static StatusId1Enum fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member.
     * @return The integer value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public Integer value() {
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
     * Convert list of StatusId1Enum values to list of integer values.
     * @param toConvert The list of StatusId1Enum values to convert.
     * @return List of representative integer values.
     */
    public static List<Integer> toValue(List<StatusId1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<Integer> convertedValues = new ArrayList<>();
        for (StatusId1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 