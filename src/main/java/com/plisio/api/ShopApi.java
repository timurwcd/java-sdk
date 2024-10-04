package com.plisio.api;

import com.plisio.invoker.ApiClient;

import com.plisio.model.ErrorResponseDto;
import com.plisio.model.ShopResponseDto;

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
@Component("com.plisio.api.ShopApi")
public class ShopApi {
    private ApiClient apiClient;

    public ShopApi() {
        this(new ApiClient());
    }

    @Autowired
    public ShopApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get shop info by api_key
     * 
     * <p><b>200</b> - Returns ShopResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @return ShopResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ShopResponseDto shopsGet() throws RestClientException {
        return shopsGetWithHttpInfo().getBody();
    }

    /**
     * Get shop info by api_key
     * 
     * <p><b>200</b> - Returns ShopResponseDto object
     * <p><b>401</b> - Returns error
     * <p><b>404</b> - Returns error
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @return ResponseEntity&lt;ShopResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ShopResponseDto> shopsGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/shops").build().toUriString();
        
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

        ParameterizedTypeReference<ShopResponseDto> returnType = new ParameterizedTypeReference<ShopResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
