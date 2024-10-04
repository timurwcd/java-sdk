package com.plisio.api;

import com.plisio.invoker.ApiClient;

import com.plisio.model.ErrorResponseDto;
import com.plisio.model.InvoiceDetailsApiResponseDto;
import com.plisio.model.InvoiceWhiteLabelResponseDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-10-04T15:20:38.886999298+03:00[Europe/Moscow]")
@Component("com.plisio.api.InvoiceApi")
public class InvoiceApi {
    private ApiClient apiClient;

    public InvoiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public InvoiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Invoice details
     * 
     * <p><b>200</b> - Returns InvoiceDetailsApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param id invoice id (required)
     * @param email payer&#x27;s email (required)
     * @return InvoiceDetailsApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceDetailsApiResponseDto invoicesEmailIdGet(String id, String email) throws RestClientException {
        return invoicesEmailIdGetWithHttpInfo(id, email).getBody();
    }

    /**
     * Invoice details
     * 
     * <p><b>200</b> - Returns InvoiceDetailsApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param id invoice id (required)
     * @param email payer&#x27;s email (required)
     * @return ResponseEntity&lt;InvoiceDetailsApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceDetailsApiResponseDto> invoicesEmailIdGetWithHttpInfo(String id, String email) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling invoicesEmailIdGet");
        }
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling invoicesEmailIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/email/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceDetailsApiResponseDto> returnType = new ParameterizedTypeReference<InvoiceDetailsApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Invoice details
     * 
     * <p><b>200</b> - Returns InvoiceDetailsApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param id invoice id (required)
     * @return InvoiceDetailsApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceDetailsApiResponseDto invoicesIdGet(String id) throws RestClientException {
        return invoicesIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Invoice details
     * 
     * <p><b>200</b> - Returns InvoiceDetailsApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param id invoice id (required)
     * @return ResponseEntity&lt;InvoiceDetailsApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceDetailsApiResponseDto> invoicesIdGetWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling invoicesIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceDetailsApiResponseDto> returnType = new ParameterizedTypeReference<InvoiceDetailsApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create new invoice
     * 
     * <p><b>200</b> - Returns InvoiceResponseDto object or InvoiceWhiteLabelResponseDto object if white-label is enabled
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param orderName merchant internal order name (required)
     * @param orderNumber merchant internal order number. Must be unique number in your store for each new store&#x60;s order!!! (required)
     * @param amount any cryptocurrency float value. !!! Please, skip this field If you want to convert a fiat currency and use source_currency and source_amount fields instead (optional)
     * @param sourceCurrency one of the 167 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (optional)
     * @param sourceAmount any float value (optional)
     * @param allowedPsysCids comma-separated list of cryptocurrencies that allowed for payment. Customer will be able to select one of them. Example: BTC,ETH,TZEC (optional)
     * @param description merchant invoice description (optional)
     * @param callbackUrl merchant full URL to get invoice updates. The “POST” request will be sent to this URL (example). If this parameter isn’t set, Plisio will send a callback to URL that can be set under profile API » API settings » ”Status URL” field (optional)
     * @param email an auto-fill invoice email. The customer will be asked to insert their email where a notification will be sent (optional)
     * @param language en_US (we support EN language only) (optional)
     * @param plugin Plisio’s internal field to determine integration plugin (optional)
     * @param version Plisio’s internal field to determine integration plugin version  (optional)
     * @param redirectToInvoice Instead of JSON response user will be redirected to the Plisio&#x27;s invoice page (is not working for a white-label shop) (optional)
     * @param expireMin Interval in minutes when invoice will be expired (optional)
     * @return InvoiceWhiteLabelResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceWhiteLabelResponseDto invoicesNewGet(String currency, String orderName, String orderNumber, String amount, String sourceCurrency, String sourceAmount, String allowedPsysCids, String description, String callbackUrl, String email, String language, String plugin, String version, Boolean redirectToInvoice, String expireMin) throws RestClientException {
        return invoicesNewGetWithHttpInfo(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin).getBody();
    }

    /**
     * Create new invoice
     * 
     * <p><b>200</b> - Returns InvoiceResponseDto object or InvoiceWhiteLabelResponseDto object if white-label is enabled
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param orderName merchant internal order name (required)
     * @param orderNumber merchant internal order number. Must be unique number in your store for each new store&#x60;s order!!! (required)
     * @param amount any cryptocurrency float value. !!! Please, skip this field If you want to convert a fiat currency and use source_currency and source_amount fields instead (optional)
     * @param sourceCurrency one of the 167 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (optional)
     * @param sourceAmount any float value (optional)
     * @param allowedPsysCids comma-separated list of cryptocurrencies that allowed for payment. Customer will be able to select one of them. Example: BTC,ETH,TZEC (optional)
     * @param description merchant invoice description (optional)
     * @param callbackUrl merchant full URL to get invoice updates. The “POST” request will be sent to this URL (example). If this parameter isn’t set, Plisio will send a callback to URL that can be set under profile API » API settings » ”Status URL” field (optional)
     * @param email an auto-fill invoice email. The customer will be asked to insert their email where a notification will be sent (optional)
     * @param language en_US (we support EN language only) (optional)
     * @param plugin Plisio’s internal field to determine integration plugin (optional)
     * @param version Plisio’s internal field to determine integration plugin version  (optional)
     * @param redirectToInvoice Instead of JSON response user will be redirected to the Plisio&#x27;s invoice page (is not working for a white-label shop) (optional)
     * @param expireMin Interval in minutes when invoice will be expired (optional)
     * @return ResponseEntity&lt;InvoiceWhiteLabelResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceWhiteLabelResponseDto> invoicesNewGetWithHttpInfo(String currency, String orderName, String orderNumber, String amount, String sourceCurrency, String sourceAmount, String allowedPsysCids, String description, String callbackUrl, String email, String language, String plugin, String version, Boolean redirectToInvoice, String expireMin) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currency' when calling invoicesNewGet");
        }
        // verify the required parameter 'orderName' is set
        if (orderName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderName' when calling invoicesNewGet");
        }
        // verify the required parameter 'orderNumber' is set
        if (orderNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderNumber' when calling invoicesNewGet");
        }
        String path = UriComponentsBuilder.fromPath("/invoices/new").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amount", amount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source_currency", sourceCurrency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source_amount", sourceAmount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allowed_psys_cids", allowedPsysCids));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_name", orderName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_number", orderNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "description", description));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "callback_url", callbackUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "plugin", plugin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "redirect_to_invoice", redirectToInvoice));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expire_min", expireMin));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoiceWhiteLabelResponseDto> returnType = new ParameterizedTypeReference<InvoiceWhiteLabelResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Invoice details
     * 
     * <p><b>200</b> - Returns InvoiceDetailsApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param id invoice id (required)
     * @param psysCid destination cryptocurrency id (required)
     * @return InvoiceDetailsApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoiceDetailsApiResponseDto invoicesSwitchIdGet(String id, String psysCid) throws RestClientException {
        return invoicesSwitchIdGetWithHttpInfo(id, psysCid).getBody();
    }

    /**
     * Invoice details
     * 
     * <p><b>200</b> - Returns InvoiceDetailsApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param id invoice id (required)
     * @param psysCid destination cryptocurrency id (required)
     * @return ResponseEntity&lt;InvoiceDetailsApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoiceDetailsApiResponseDto> invoicesSwitchIdGetWithHttpInfo(String id, String psysCid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling invoicesSwitchIdGet");
        }
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psysCid' when calling invoicesSwitchIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/invoices/switch/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "psys_cid", psysCid));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "view_key" };

        ParameterizedTypeReference<InvoiceDetailsApiResponseDto> returnType = new ParameterizedTypeReference<InvoiceDetailsApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
