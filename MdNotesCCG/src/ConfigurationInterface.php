<?php

declare(strict_types=1);

/*
 * MdNotesCCGLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MdNotesCCGLib;

/**
 * An interface for all configuration parameters required by the SDK.
 */
interface ConfigurationInterface
{
    /**
     * Get timeout for API calls
     */
    public function getTimeout(): int;

    /**
     * Get current API environment
     */
    public function getEnvironment(): string;

    /**
     * Get the credentials to use with ClientCredentialsAuth
     */
    public function getClientCredentialsAuth(): ?ClientCredentialsAuth;

    /**
     * Get the base uri for a given server in the current environment.
     *
     * @param string $server Server name
     *
     * @return string Base URI
     */
    public function getBaseUri(string $server = Server::DEFAULT_): string;
}