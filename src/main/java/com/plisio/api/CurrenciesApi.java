package com.plisio.api;

import com.plisio.invoker.ApiClient;

import com.plisio.model.CryptocurrencyApiResponseDto;
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
@Component("com.plisio.api.CurrenciesApi")
public class CurrenciesApi {
    private ApiClient apiClient;

    public CurrenciesApi() {
        this(new ApiClient());
    }

    @Autowired
    public CurrenciesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List of supported cryptocurrencies
     * 
     * <p><b>200</b> - Returns CryptocurrencyApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param fiat one of the 168 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (required)
     * @return CryptocurrencyApiResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CryptocurrencyApiResponseDto currenciesFiatGet(String fiat) throws RestClientException {
        return currenciesFiatGetWithHttpInfo(fiat).getBody();
    }

    /**
     * List of supported cryptocurrencies
     * 
     * <p><b>200</b> - Returns CryptocurrencyApiResponseDto object
     * <p><b>422</b> - Returns error
     * <p><b>500</b> - Returns error
     * @param fiat one of the 168 fiat currencies https://plisio.net/documentation/appendices/supported-fiat-currencies (required)
     * @return ResponseEntity&lt;CryptocurrencyApiResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CryptocurrencyApiResponseDto> currenciesFiatGetWithHttpInfo(String fiat) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fiat' is set
        if (fiat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fiat' when calling currenciesFiatGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fiat", fiat);
        String path = UriComponentsBuilder.fromPath("/currencies/{fiat}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CryptocurrencyApiResponseDto> returnType = new ParameterizedTypeReference<CryptocurrencyApiResponseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
