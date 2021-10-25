<?php

declare(strict_types=1);

/*
 * MdNotesCCGLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MdNotesCCGLib\Models;

use stdClass;

class ServiceStatus implements \JsonSerializable
{
    /**
     * @var string|null
     */
    private $app;

    /**
     * @var string|null
     */
    private $moto;

    /**
     * @var int|null
     */
    private $notes;

    /**
     * @var int|null
     */
    private $users;

    /**
     * @var string|null
     */
    private $time;

    /**
     * @var string|null
     */
    private $os;

    /**
     * @var string|null
     */
    private $phpVersion;

    /**
     * @var string
     */
    private $status;

    /**
     * @param string $status
     */
    public function __construct(string $status)
    {
        $this->status = $status;
    }

    /**
     * Returns App.
     */
    public function getApp(): ?string
    {
        return $this->app;
    }

    /**
     * Sets App.
     *
     * @maps app
     */
    public function setApp(?string $app): void
    {
        $this->app = $app;
    }

    /**
     * Returns Moto.
     */
    public function getMoto(): ?string
    {
        return $this->moto;
    }

    /**
     * Sets Moto.
     *
     * @maps moto
     */
    public function setMoto(?string $moto): void
    {
        $this->moto = $moto;
    }

    /**
     * Returns Notes.
     */
    public function getNotes(): ?int
    {
        return $this->notes;
    }

    /**
     * Sets Notes.
     *
     * @maps notes
     */
    public function setNotes(?int $notes): void
    {
        $this->notes = $notes;
    }

    /**
     * Returns Users.
     */
    public function getUsers(): ?int
    {
        return $this->users;
    }

    /**
     * Sets Users.
     *
     * @maps users
     */
    public function setUsers(?int $users): void
    {
        $this->users = $users;
    }

    /**
     * Returns Time.
     */
    public function getTime(): ?string
    {
        return $this->time;
    }

    /**
     * Sets Time.
     *
     * @maps time
     */
    public function setTime(?string $time): void
    {
        $this->time = $time;
    }

    /**
     * Returns Os.
     */
    public function getOs(): ?string
    {
        return $this->os;
    }

    /**
     * Sets Os.
     *
     * @maps os
     */
    public function setOs(?string $os): void
    {
        $this->os = $os;
    }

    /**
     * Returns Php Version.
     */
    public function getPhpVersion(): ?string
    {
        return $this->phpVersion;
    }

    /**
     * Sets Php Version.
     *
     * @maps php_version
     */
    public function setPhpVersion(?string $phpVersion): void
    {
        $this->phpVersion = $phpVersion;
    }

    /**
     * Returns Status.
     */
    public function getStatus(): string
    {
        return $this->status;
    }

    /**
     * Sets Status.
     *
     * @required
     * @maps status
     */
    public function setStatus(string $status): void
    {
        $this->status = $status;
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
        if (isset($this->app)) {
            $json['app']         = $this->app;
        }
        if (isset($this->moto)) {
            $json['moto']        = $this->moto;
        }
        if (isset($this->notes)) {
            $json['notes']       = $this->notes;
        }
        if (isset($this->users)) {
            $json['users']       = $this->users;
        }
        if (isset($this->time)) {
            $json['time']        = $this->time;
        }
        if (isset($this->os)) {
            $json['os']          = $this->os;
        }
        if (isset($this->phpVersion)) {
            $json['php_version'] = $this->phpVersion;
        }
        $json['status']          = $this->status;
        $json = array_merge($json, $this->additionalProperties);

        return (!$asArrayWhenEmpty && empty($json)) ? new stdClass() : $json;
    }
}