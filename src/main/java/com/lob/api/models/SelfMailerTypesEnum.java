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
 * SelfMailerTypesEnum to be used.
 */
public enum SelfMailerTypesEnum {
    ENUM_SELF_MAILERCREATED,

    ENUM_SELF_MAILERRENDERED_PDF,

    ENUM_SELF_MAILERRENDERED_THUMBNAILS,

    ENUM_SELF_MAILERDELETED,

    ENUM_SELF_MAILERMAILED,

    ENUM_SELF_MAILERIN_TRANSIT,

    ENUM_SELF_MAILERIN_LOCAL_AREA,

    ENUM_SELF_MAILERPROCESSED_FOR_DELIVERY,

    ENUM_SELF_MAILERREROUTED,

    ENUM_SELF_MAILERRETURNED_TO_SENDER;


    private static TreeMap<String, SelfMailerTypesEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_SELF_MAILERCREATED.value = "self_mailer.created";
        ENUM_SELF_MAILERRENDERED_PDF.value = "self_mailer.rendered_pdf";
        ENUM_SELF_MAILERRENDERED_THUMBNAILS.value = "self_mailer.rendered_thumbnails";
        ENUM_SELF_MAILERDELETED.value = "self_mailer.deleted";
        ENUM_SELF_MAILERMAILED.value = "self_mailer.mailed";
        ENUM_SELF_MAILERIN_TRANSIT.value = "self_mailer.in_transit";
        ENUM_SELF_MAILERIN_LOCAL_AREA.value = "self_mailer.in_local_area";
        ENUM_SELF_MAILERPROCESSED_FOR_DELIVERY.value = "self_mailer.processed_for_delivery";
        ENUM_SELF_MAILERREROUTED.value = "self_mailer.re-routed";
        ENUM_SELF_MAILERRETURNED_TO_SENDER.value = "self_mailer.returned_to_sender";

        valueMap.put("self_mailer.created", ENUM_SELF_MAILERCREATED);
        valueMap.put("self_mailer.rendered_pdf", ENUM_SELF_MAILERRENDERED_PDF);
        valueMap.put("self_mailer.rendered_thumbnails", ENUM_SELF_MAILERRENDERED_THUMBNAILS);
        valueMap.put("self_mailer.deleted", ENUM_SELF_MAILERDELETED);
        valueMap.put("self_mailer.mailed", ENUM_SELF_MAILERMAILED);
        valueMap.put("self_mailer.in_transit", ENUM_SELF_MAILERIN_TRANSIT);
        valueMap.put("self_mailer.in_local_area", ENUM_SELF_MAILERIN_LOCAL_AREA);
        valueMap.put("self_mailer.processed_for_delivery", ENUM_SELF_MAILERPROCESSED_FOR_DELIVERY);
        valueMap.put("self_mailer.re-routed", ENUM_SELF_MAILERREROUTED);
        valueMap.put("self_mailer.returned_to_sender", ENUM_SELF_MAILERRETURNED_TO_SENDER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SelfMailerTypesEnum fromString(String toConvert) {
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
     * Convert list of SelfMailerTypesEnum values to list of string values.
     * @param toConvert The list of SelfMailerTypesEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SelfMailerTypesEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SelfMailerTypesEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 