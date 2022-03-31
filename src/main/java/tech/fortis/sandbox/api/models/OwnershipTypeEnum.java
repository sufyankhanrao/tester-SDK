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
 * OwnershipTypeEnum to be used.
 */
public enum OwnershipTypeEnum {
    C,

    GOV,

    LLC,

    LLP,

    NP,

    P,

    PO,

    S,

    SP,

    TE;


    private static TreeMap<String, OwnershipTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        C.value = "c";
        GOV.value = "gov";
        LLC.value = "llc";
        LLP.value = "llp";
        NP.value = "np";
        P.value = "p";
        PO.value = "po";
        S.value = "s";
        SP.value = "sp";
        TE.value = "te";

        valueMap.put("c", C);
        valueMap.put("gov", GOV);
        valueMap.put("llc", LLC);
        valueMap.put("llp", LLP);
        valueMap.put("np", NP);
        valueMap.put("p", P);
        valueMap.put("po", PO);
        valueMap.put("s", S);
        valueMap.put("sp", SP);
        valueMap.put("te", TE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static OwnershipTypeEnum fromString(String toConvert) {
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
     * Convert list of OwnershipTypeEnum values to list of string values.
     * @param toConvert The list of OwnershipTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OwnershipTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OwnershipTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 