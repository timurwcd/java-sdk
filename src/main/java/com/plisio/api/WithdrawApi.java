package com.plisio.api;

import com.plisio.invoker.ApiClient;

import com.plisio.model.ErrorResponseDto;
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
@Component("com.plisio.api.WithdrawApi")
public class WithdrawApi {
    private ApiClient apiClient;

    public WithdrawApi() {
        this(new ApiClient());
    }

    @Autowired
    public WithdrawApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
