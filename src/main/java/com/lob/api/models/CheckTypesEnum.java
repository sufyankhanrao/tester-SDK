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
 * CheckTypesEnum to be used.
 */
public enum CheckTypesEnum {
    ENUM_CHECKCREATED,

    ENUM_CHECKRENDERED_PDF,

    ENUM_CHECKRENDERED_THUMBNAILS,

    ENUM_CHECKDELETED,

    ENUM_CHECKMAILED,

    ENUM_CHECKIN_TRANSIT,

    ENUM_CHECKIN_LOCAL_AREA,

    ENUM_CHECKPROCESSED_FOR_DELIVERY,

    ENUM_CHECKREROUTED,

    ENUM_CHECKRETURNED_TO_SENDER;


    private static TreeMap<String, CheckTypesEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_CHECKCREATED.value = "check.created";
        ENUM_CHECKRENDERED_PDF.value = "check.rendered_pdf";
        ENUM_CHECKRENDERED_THUMBNAILS.value = "check.rendered_thumbnails";
        ENUM_CHECKDELETED.value = "check.deleted";
        ENUM_CHECKMAILED.value = "check.mailed";
        ENUM_CHECKIN_TRANSIT.value = "check.in_transit";
        ENUM_CHECKIN_LOCAL_AREA.value = "check.in_local_area";
        ENUM_CHECKPROCESSED_FOR_DELIVERY.value = "check.processed_for_delivery";
        ENUM_CHECKREROUTED.value = "check.re-routed";
        ENUM_CHECKRETURNED_TO_SENDER.value = "check.returned_to_sender";

        valueMap.put("check.created", ENUM_CHECKCREATED);
        valueMap.put("check.rendered_pdf", ENUM_CHECKRENDERED_PDF);
        valueMap.put("check.rendered_thumbnails", ENUM_CHECKRENDERED_THUMBNAILS);
        valueMap.put("check.deleted", ENUM_CHECKDELETED);
        valueMap.put("check.mailed", ENUM_CHECKMAILED);
        valueMap.put("check.in_transit", ENUM_CHECKIN_TRANSIT);
        valueMap.put("check.in_local_area", ENUM_CHECKIN_LOCAL_AREA);
        valueMap.put("check.processed_for_delivery", ENUM_CHECKPROCESSED_FOR_DELIVERY);
        valueMap.put("check.re-routed", ENUM_CHECKREROUTED);
        valueMap.put("check.returned_to_sender", ENUM_CHECKRETURNED_TO_SENDER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static CheckTypesEnum fromString(String toConvert) {
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
     * Convert list of CheckTypesEnum values to list of string values.
     * @param toConvert The list of CheckTypesEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CheckTypesEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CheckTypesEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 