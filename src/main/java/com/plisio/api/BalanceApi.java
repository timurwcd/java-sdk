package com.plisio.api;

import com.plisio.invoker.ApiClient;

import com.plisio.model.BalanceApiResponseDto;
import com.plisio.model.ErrorResponseDto;

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
@Component("com.plisio.api.BalanceApi")
public class BalanceApi {
    private ApiClient apiClient;

    public BalanceApi() {
        this(new ApiClient());
    }

    @Autowired
    public BalanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get cryptocurrency balance
     * 
     * <p><b>200</b> - Returns BalanceApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @return BalanceApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BalanceApiResponseDto balancesPsysCidGet(String psysCid) throws RestClientException {
        return balancesPsysCidGetWithHttpInfo(psysCid).getBody();
    }

    /**
     * Get cryptocurrency balance
     * 
     * <p><b>200</b> - Returns BalanceApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param psysCid ID column from one of the supported cryptocurrencies supported by Plisio (required)
     * @return ResponseEntity&lt;BalanceApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BalanceApiResponseDto> balancesPsysCidGetWithHttpInfo(String psysCid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'psysCid' is set
        if (psysCid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'psysCid' when calling balancesPsysCidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("psys_cid", psysCid);
        String path = UriComponentsBuilder.fromPath("/balances/{psys_cid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<BalanceApiResponseDto> returnType = new ParameterizedTypeReference<BalanceApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
