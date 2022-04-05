/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api;

/**
 * Interface for defining the behavior of CustomHeader Authentication.
 */
public interface CustomHeaderAuthenticationCredentials {

    /**
     * String value for userId.
     * @return userId
     */
    String getUserId();

    /**
     * String value for userApiKey.
     * @return userApiKey
     */
    String getUserApiKey();

    /**
     * String value for developerId.
     * @return developerId
     */
    String getDeveloperId();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param userId String value for credentials.
     * @param userApiKey String value for credentials.
     * @param developerId String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String userId, String userApiKey, String developerId);
}