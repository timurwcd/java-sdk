package com.plisio.api;

import com.plisio.invoker.ApiClient;

import com.plisio.model.CommissionApiResponseDto;
import com.plisio.model.ErrorResponseDto;
import com.plisio.model.FeeApiResponseDto;
import com.plisio.model.FeePlanApiResponseDto;
import com.plisio.model.OperationApiResponseDto;
import com.plisio.model.OperationsApiResponseDto;
import com.plisio.model.WithdrawApiResponseDto;

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
@Component("com.plisio.api.TransactionApi")
public class TransactionApi {
    private ApiClient apiClient;

    public TransactionApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Estimate cryptocurrency fee and Plisio commission
     * 
     * <p><b>200</b> - Returns CommissionApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param type operation type (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @return CommissionApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommissionApiResponseDto operationsCommissionPsysCidGet(String psysCid, String addresses, String amounts, String type, String feePlan) throws RestClientException {
        return operationsCommissionPsysCidGetWithHttpInfo(psysCid, addresses, amounts, type, feePlan).getBody();
    }

    /**
     * Estimate cryptocurrency fee and Plisio commission
     * 
     * <p><b>200</b> - Returns CommissionApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param type operation type (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @return ResponseEntity&lt;CommissionApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommissionApiResponseDto> operationsCommissionPsysCidGetWithHttpInfo(String psysCid, String addresses, String amounts, String type, String feePlan) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psysCid' when calling operationsCommissionPsysCidGet");
        }
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addresses' when calling operationsCommissionPsysCidGet");
        }
        // verify the required parameter 'amounts' is set
        if (amounts == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'amounts' when calling operationsCommissionPsysCidGet");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling operationsCommissionPsysCidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("psys_cid", psysCid);
        String path = UriComponentsBuilder.fromPath("/operations/commission/{psys_cid}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amounts", amounts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "feePlan", feePlan));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<CommissionApiResponseDto> returnType = new ParameterizedTypeReference<CommissionApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Plisio fee plans
     * 
     * <p><b>200</b> - Returns FeePlanApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @return FeePlanApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FeePlanApiResponseDto operationsFeePlanPsysCidGet(String psysCid) throws RestClientException {
        return operationsFeePlanPsysCidGetWithHttpInfo(psysCid).getBody();
    }

    /**
     * Get Plisio fee plans
     * 
     * <p><b>200</b> - Returns FeePlanApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @return ResponseEntity&lt;FeePlanApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FeePlanApiResponseDto> operationsFeePlanPsysCidGetWithHttpInfo(String psysCid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psysCid' when calling operationsFeePlanPsysCidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("psys_cid", psysCid);
        String path = UriComponentsBuilder.fromPath("/operations/fee-plan/{psys_cid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<FeePlanApiResponseDto> returnType = new ParameterizedTypeReference<FeePlanApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Estimate fee
     * 
     * <p><b>200</b> - Returns FeeApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @return FeeApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FeeApiResponseDto operationsFeePsysCidGet(String psysCid, String addresses, String amounts, String feePlan) throws RestClientException {
        return operationsFeePsysCidGetWithHttpInfo(psysCid, addresses, amounts, feePlan).getBody();
    }

    /**
     * Estimate fee
     * 
     * <p><b>200</b> - Returns FeeApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @param addresses wallet address or comma separated addresses when estimating fee for mass withdrawal (required)
     * @param amounts amount or comma separated amount that will be send in case of mass withdraw (required)
     * @param feePlan normal or priority (https://plisio.net/documentation/endpoints/fee-plans) (optional)
     * @return ResponseEntity&lt;FeeApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FeeApiResponseDto> operationsFeePsysCidGetWithHttpInfo(String psysCid, String addresses, String amounts, String feePlan) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psysCid' when calling operationsFeePsysCidGet");
        }
        // verify the required parameter 'addresses' is set
        if (addresses == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addresses' when calling operationsFeePsysCidGet");
        }
        // verify the required parameter 'amounts' is set
        if (amounts == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'amounts' when calling operationsFeePsysCidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("psys_cid", psysCid);
        String path = UriComponentsBuilder.fromPath("/operations/fee/{psys_cid}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addresses", addresses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amounts", amounts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "feePlan", feePlan));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<FeeApiResponseDto> returnType = new ParameterizedTypeReference<FeeApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List of all user transactions
     * 
     * <p><b>200</b> - Returns OperationsApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param page page number (optional)
     * @param limit number of elements on the page (optional)
     * @param shopId Filter operation by shop (optional)
     * @param type Transaction type (optional)
     * @param status Transaction status (optional)
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (optional)
     * @param search text search by the transaction id (txid), invoice’s order number or customer email from invoice (optional)
     * @return OperationsApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationsApiResponseDto operationsGet(Integer page, Integer limit, String shopId, String type, String status, String currency, String search) throws RestClientException {
        return operationsGetWithHttpInfo(page, limit, shopId, type, status, currency, search).getBody();
    }

    /**
     * List of all user transactions
     * 
     * <p><b>200</b> - Returns OperationsApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param page page number (optional)
     * @param limit number of elements on the page (optional)
     * @param shopId Filter operation by shop (optional)
     * @param type Transaction type (optional)
     * @param status Transaction status (optional)
     * @param currency one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (optional)
     * @param search text search by the transaction id (txid), invoice’s order number or customer email from invoice (optional)
     * @return ResponseEntity&lt;OperationsApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OperationsApiResponseDto> operationsGetWithHttpInfo(Integer page, Integer limit, String shopId, String type, String status, String currency, String search) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/operations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "shop_id", shopId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<OperationsApiResponseDto> returnType = new ParameterizedTypeReference<OperationsApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Transaction details
     * 
     * <p><b>200</b> - Returns OperationApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param id transactoion id (required)
     * @return OperationApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationApiResponseDto operationsIdGet(String id) throws RestClientException {
        return operationsIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Transaction details
     * 
     * <p><b>200</b> - Returns OperationApiResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param id transactoion id (required)
     * @return ResponseEntity&lt;OperationApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OperationApiResponseDto> operationsIdGetWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling operationsIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/operations/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<OperationApiResponseDto> returnType = new ParameterizedTypeReference<OperationApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create new invoice
     * 
     * <p><b>200</b> - Returns WithdrawApiResponseDto object 
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param to hash or multiple comma separated hashes pooled for the &#x27;mass_cash_out&#x27; (required)
     * @param amount any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter (required)
     * @param type &#x27;cash_out&#x27; or &#x27;mass_cash_out&#x27; to send to single or multiple comma separated hashes (required)
     * @param feePlan  normal or priority (https://plisio.net/documentation/endpoints/fee-plan) (optional)
     * @return WithdrawApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WithdrawApiResponseDto operationsWithdrawGet(String psysCid, String to, String amount, String type, String feePlan) throws RestClientException {
        return operationsWithdrawGetWithHttpInfo(psysCid, to, amount, type, feePlan).getBody();
    }

    /**
     * Create new invoice
     * 
     * <p><b>200</b> - Returns WithdrawApiResponseDto object 
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid one of the cryptocurrencies supported by Plisio (ID column from supported cryptocurrencies https://plisio.net/documentation/appendices/supported-cryptocurrencies) (required)
     * @param to hash or multiple comma separated hashes pooled for the &#x27;mass_cash_out&#x27; (required)
     * @param amount any comma separated float values for the “ mass_cash_out” in the order that hashes are in “to” parameter (required)
     * @param type &#x27;cash_out&#x27; or &#x27;mass_cash_out&#x27; to send to single or multiple comma separated hashes (required)
     * @param feePlan  normal or priority (https://plisio.net/documentation/endpoints/fee-plan) (optional)
     * @return ResponseEntity&lt;WithdrawApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<WithdrawApiResponseDto> operationsWithdrawGetWithHttpInfo(String psysCid, String to, String amount, String type, String feePlan) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psysCid' when calling operationsWithdrawGet");
        }
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling operationsWithdrawGet");
        }
        // verify the required parameter 'amount' is set
        if (amount == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'amount' when calling operationsWithdrawGet");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling operationsWithdrawGet");
        }
        String path = UriComponentsBuilder.fromPath("/operations/withdraw").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "psys_cid", psysCid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "amount", amount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "feePlan", feePlan));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<WithdrawApiResponseDto> returnType = new ParameterizedTypeReference<WithdrawApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
