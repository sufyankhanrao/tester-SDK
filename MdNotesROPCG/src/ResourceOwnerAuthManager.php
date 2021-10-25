<?php

declare(strict_types=1);

/*
 * MdNotesROPCGLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MdNotesROPCGLib;

use MdNotesROPCGLib\Http\HttpRequest;
use MdNotesROPCGLib\Models\OAuthToken;
use MdNotesROPCGLib\Controllers\OAuthAuthorizationController;

/**
 * Utility class for OAuth 2 authorization and token management
 */
class ResourceOwnerAuthManager implements AuthManagerInterface, ResourceOwnerAuth
{
    /**
     * Singleton instance of OAuth 2 API controller
     * @var OAuthAuthorizationController
     */
    private $oAuthApi;

    private $oAuthClientId;

    private $oAuthClientSecret;

    private $oAuthUsername;

    private $oAuthPassword;

    private $oAuthToken;

    /**
     * Returns an instance of this class.
     *
     * @param string $oAuthClientId OAuth 2 Client ID
     * @param string $oAuthClientSecret OAuth 2 Client Secret
     * @param string $oAuthUsername OAuth 2 Resource Owner Username
     * @param string $oAuthPassword OAuth 2 Resource Owner Password
     * @param OAuthToken|null $oAuthToken
     */
    public function __construct(
        string $oAuthClientId,
        string $oAuthClientSecret,
        string $oAuthUsername,
        string $oAuthPassword,
        ?OAuthToken $oAuthToken,
        ConfigurationInterface $config
    ) {
        $this->oAuthClientId = $oAuthClientId;
        $this->oAuthClientSecret = $oAuthClientSecret;
        $this->oAuthUsername = $oAuthUsername;
        $this->oAuthPassword = $oAuthPassword;
        $this->oAuthToken = $oAuthToken;
        $this->oAuthApi = new OAuthAuthorizationController($config, [], null);
    }

    /**
     * String value for oAuthClientId.
     */
    public function getOAuthClientId(): string
    {
        return $this->oAuthClientId;
    }

    /**
     * String value for oAuthClientSecret.
     */
    public function getOAuthClientSecret(): string
    {
        return $this->oAuthClientSecret;
    }

    /**
     * String value for oAuthUsername.
     */
    public function getOAuthUsername(): string
    {
        return $this->oAuthUsername;
    }

    /**
     * String value for oAuthPassword.
     */
    public function getOAuthPassword(): string
    {
        return $this->oAuthPassword;
    }

    /**
     * OAuthToken value for oAuthToken.
     */
    public function getOAuthToken(): ?OAuthToken
    {
        return $this->oAuthToken;
    }

    /**
     * Checks if provided credentials match with existing ones.
     *
     * @param string $oAuthClientId OAuth 2 Client ID
     * @param string $oAuthClientSecret OAuth 2 Client Secret
     * @param string $oAuthUsername OAuth 2 Resource Owner Username
     * @param string $oAuthPassword OAuth 2 Resource Owner Password
     */
    public function equals(
        string $oAuthClientId,
        string $oAuthClientSecret,
        string $oAuthUsername,
        string $oAuthPassword
    ): bool {
        return $oAuthClientId == $this->getOAuthClientId() &&
            $oAuthClientSecret == $this->getOAuthClientSecret() &&
            $oAuthUsername == $this->getOAuthUsername() &&
            $oAuthPassword == $this->getOAuthPassword();
    }

    /**
     * Fetch the OAuth token.
     * @param  array|null        $additionalParams  Additional parameters to send during authorization
     */
    public function fetchToken(?array $additionalParams = null): OAuthToken
    {
        //send request for access token
        $oAuthToken = $this->oAuthApi->requestToken(
            $this->buildBasicHeader(),
            $this->oAuthUsername ?? "",
            $this->oAuthPassword ?? "",
            $additionalParams
        );

        //add expiry
        if ($oAuthToken->getExpiresIn() != null && $oAuthToken->getExpiresIn() != 0) {
            $oAuthToken->setExpiry(time() + $oAuthToken->getExpiresIn());
        }

        return $oAuthToken;
    }

    /**
     * Refresh the OAuth token.
     * @param  array|null        $additionalParams Additional parameters to send during token refresh
     */
    public function refreshToken(?array $additionalParams = null): OAuthToken
    {
        //send request for token refresh
        $oAuthToken = $this->oAuthApi->refreshToken(
            $this->buildBasicHeader(),
            $this->oAuthToken->getRefreshToken() ?? "",
            $additionalParams
        );

        //add expiry
        if ($oAuthToken->getExpiresIn() != null && $oAuthToken->getExpiresIn() != 0) {
            $oAuthToken->setExpiry(time() + $oAuthToken->getExpiresIn());
        }

        return $oAuthToken;
    }

    /**
     * Has the OAuth token expired?
     */
    public function isTokenExpired(): bool
    {
        return $this->oAuthToken->getExpiry() == null ||
            $this->oAuthToken->getExpiry() < time();
    }

    /**
     * Check if client is authorized, throws exceptions when token is null or expired.
     */
    private function checkAuthorization(): void
    {
        if ($this->oAuthToken == null) {
            throw new \Exception('Client is not authorized. An OAuth token is needed to make API calls.');
        }

        if ($this->isTokenExpired()) {
            throw new \Exception('OAuth token is expired. A valid token is needed to make API calls.');
        }
    }

    /**
     * Build authorization header value for basic auth
     */
    private function buildBasicHeader(): string
    {
        return 'Basic ' . base64_encode(
            $this->oAuthClientId . ':' . $this->oAuthClientSecret
        );
    }

    /**
     * Adds authentication to the given HttpRequest.
     */
    public function apply(HttpRequest $httpRequest)
    {
        $this->checkAuthorization();
        $httpRequest->addHeader('Authorization', 'Bearer ' . $this->oAuthToken->getAccessToken());
    }
}
