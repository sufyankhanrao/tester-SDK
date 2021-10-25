<?php

declare(strict_types=1);

/*
 * MdNotesCCGLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MdNotesCCGLib\Models;

use stdClass;

/**
 * OAuth 2 Authorization endpoint response
 */
class OAuthToken implements \JsonSerializable
{
    /**
     * @var string
     */
    private $accessToken;

    /**
     * @var string
     */
    private $tokenType;

    /**
     * @var int|null
     */
    private $expiresIn;

    /**
     * @var string|null
     */
    private $scope;

    /**
     * @var int|null
     */
    private $expiry;

    /**
     * @param string $accessToken
     * @param string $tokenType
     */
    public function __construct(string $accessToken, string $tokenType)
    {
        $this->accessToken = $accessToken;
        $this->tokenType = $tokenType;
    }

    /**
     * Returns Access Token.
     *
     * Access token
     */
    public function getAccessToken(): string
    {
        return $this->accessToken;
    }

    /**
     * Sets Access Token.
     *
     * Access token
     *
     * @required
     * @maps access_token
     */
    public function setAccessToken(string $accessToken): void
    {
        $this->accessToken = $accessToken;
    }

    /**
     * Returns Token Type.
     *
     * Type of access token
     */
    public function getTokenType(): string
    {
        return $this->tokenType;
    }

    /**
     * Sets Token Type.
     *
     * Type of access token
     *
     * @required
     * @maps token_type
     */
    public function setTokenType(string $tokenType): void
    {
        $this->tokenType = $tokenType;
    }

    /**
     * Returns Expires In.
     *
     * Time in seconds before the access token expires
     */
    public function getExpiresIn(): ?int
    {
        return $this->expiresIn;
    }

    /**
     * Sets Expires In.
     *
     * Time in seconds before the access token expires
     *
     * @maps expires_in
     */
    public function setExpiresIn(?int $expiresIn): void
    {
        $this->expiresIn = $expiresIn;
    }

    /**
     * Returns Scope.
     *
     * List of scopes granted
     * This is a space-delimited list of strings.
     */
    public function getScope(): ?string
    {
        return $this->scope;
    }

    /**
     * Sets Scope.
     *
     * List of scopes granted
     * This is a space-delimited list of strings.
     *
     * @maps scope
     */
    public function setScope(?string $scope): void
    {
        $this->scope = $scope;
    }

    /**
     * Returns Expiry.
     *
     * Time of token expiry as unix timestamp (UTC)
     */
    public function getExpiry(): ?int
    {
        return $this->expiry;
    }

    /**
     * Sets Expiry.
     *
     * Time of token expiry as unix timestamp (UTC)
     *
     * @maps expiry
     */
    public function setExpiry(?int $expiry): void
    {
        $this->expiry = $expiry;
    }

    private $additionalProperties = [];

    /**
     * Add an additional property to this model.
     *
     * @param string $name Name of property
     * @param mixed $value Value of property
     */
    public function addAdditionalProperty(string $name, $value)
    {
        $this->additionalProperties[$name] = $value;
    }

    /**
     * Encode this object to JSON
     *
     * @param bool $asArrayWhenEmpty Whether to serialize this model as an array whenever no fields
     *        are set. (default: false)
     *
     * @return mixed
     */
    public function jsonSerialize(bool $asArrayWhenEmpty = false)
    {
        $json = [];
        $json['access_token']   = $this->accessToken;
        $json['token_type']     = $this->tokenType;
        if (isset($this->expiresIn)) {
            $json['expires_in'] = $this->expiresIn;
        }
        if (isset($this->scope)) {
            $json['scope']      = $this->scope;
        }
        if (isset($this->expiry)) {
            $json['expiry']     = $this->expiry;
        }
        $json = array_merge($json, $this->additionalProperties);

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}
