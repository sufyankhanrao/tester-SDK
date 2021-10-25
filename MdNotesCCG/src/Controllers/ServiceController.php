<?php

declare(strict_types=1);

/*
 * MdNotesCCGLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

namespace MdNotesCCGLib\Controllers;

use MdNotesCCGLib\Exceptions\ApiException;
use MdNotesCCGLib\ApiHelper;
use MdNotesCCGLib\ConfigurationInterface;
use MdNotesCCGLib\Http\HttpRequest;
use MdNotesCCGLib\Http\HttpResponse;
use MdNotesCCGLib\Http\HttpMethod;
use MdNotesCCGLib\Http\HttpContext;
use MdNotesCCGLib\Http\HttpCallBack;
use Unirest\Request;

class ServiceController extends BaseController
{
    public function __construct(ConfigurationInterface $config, array $authManagers, ?HttpCallBack $httpCallBack)
    {
        parent::__construct($config, $authManagers, $httpCallBack);
    }

    /**
     * @return \MdNotesCCGLib\Models\ServiceStatus Response from the API call
     *
     * @throws ApiException Thrown if API call fails
     */
    public function getStatus(): \MdNotesCCGLib\Models\ServiceStatus
    {
        //prepare query string for API call
        $_queryBuilder = '/status';

        //validate and preprocess url
        $_queryUrl = ApiHelper::cleanUrl($this->config->getBaseUri() . $_queryBuilder);

        //prepare headers
        $_headers = [
            'user-agent'    => BaseController::USER_AGENT,
            'Accept'        => 'application/json'
        ];

        $_httpRequest = new HttpRequest(HttpMethod::GET, $_headers, $_queryUrl);

        // Apply authorization to request
        $this->getAuthManager('global')->apply($_httpRequest);

        //call on-before Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnBeforeRequest($_httpRequest);
        }

        // Set request timeout
        Request::timeout($this->config->getTimeout());

        // and invoke the API call request to fetch the response
        try {
            $response = Request::get($_httpRequest->getQueryUrl(), $_httpRequest->getHeaders());
        } catch (\Unirest\Exception $ex) {
            throw new ApiException($ex->getMessage(), $_httpRequest);
        }


        $_httpResponse = new HttpResponse($response->code, $response->headers, $response->raw_body);
        $_httpContext = new HttpContext($_httpRequest, $_httpResponse);

        //call on-after Http callback
        if ($this->getHttpCallBack() != null) {
            $this->getHttpCallBack()->callOnAfterRequest($_httpContext);
        }

        //handle errors defined at the API level
        $this->validateResponse($_httpResponse, $_httpRequest);
        $mapper = $this->getJsonMapper();
        return $mapper->mapClass($response->body, 'MdNotesCCGLib\\Models\\ServiceStatus');
    }
}
