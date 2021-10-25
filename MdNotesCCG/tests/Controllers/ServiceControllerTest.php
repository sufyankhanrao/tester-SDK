<?php
/*
 * MdNotesCCGLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MdNotesCCGLib\Tests;

use MdNotesCCGLib\Exceptions\ApiException;
use MdNotesCCGLib\Exceptions;
use MdNotesCCGLib\ApiHelper;
use MdNotesCCGLib\Models;
use PHPUnit\Framework\TestCase;

class ServiceControllerTest extends TestCase
{
    /**
     * @var \MdNotesCCGLib\Controllers\ServiceController Controller instance
     */
    protected static $controller;

    /**
     * @var HttpCallBackCatcher Callback
     */
    protected static $httpResponse;

    /**
     * Setup test class
     */
    public static function setUpBeforeClass(): void
    {
        self::$httpResponse = new HttpCallBackCatcher();
        self::$controller = ClientFactory::create(self::$httpResponse)->getServiceController();
    }


    /**
     * Todo Add description for test testCheckServiceStatus
     */
    public function testCheckServiceStatus()
    {

        // Set callback and perform API call
        $result = null;
        try {
            $result = self::$controller->getStatus();
        } catch (ApiException $e) {
        }

        // Test response code
        $this->assertEquals(
            200,
            self::$httpResponse->getResponse()->getStatusCode(),
            "Status is not 200"
        );
    }
}
