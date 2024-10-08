/*
 * Plisio API
 * Plisio payment gateway API
 *
 * OpenAPI spec version: 1.0
 * Contact: lead@plisio.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.plisio.api;

import com.plisio.model.ErrorResponseDto;
import com.plisio.model.InvoiceDetailsApiResponseDto;
import com.plisio.model.InvoiceWhiteLabelResponseDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceApi
 */
@Ignore
public class InvoiceApiTest {

    private final InvoiceApi api = new InvoiceApi();

    /**
     * Invoice details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoicesEmailIdGetTest() {
        String id = null;
        String email = null;
        InvoiceDetailsApiResponseDto response = api.invoicesEmailIdGet(id, email);

        // TODO: test validations
    }
    /**
     * Invoice details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoicesIdGetTest() {
        String id = null;
        InvoiceDetailsApiResponseDto response = api.invoicesIdGet(id);

        // TODO: test validations
    }
    /**
     * Create new invoice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoicesNewGetTest() {
        String currency = null;
        String orderName = null;
        String orderNumber = null;
        String amount = null;
        String sourceCurrency = null;
        String sourceAmount = null;
        String allowedPsysCids = null;
        String description = null;
        String callbackUrl = null;
        String email = null;
        String language = null;
        String plugin = null;
        String version = null;
        Boolean redirectToInvoice = null;
        String expireMin = null;
        InvoiceWhiteLabelResponseDto response = api.invoicesNewGet(currency, orderName, orderNumber, amount, sourceCurrency, sourceAmount, allowedPsysCids, description, callbackUrl, email, language, plugin, version, redirectToInvoice, expireMin);

        // TODO: test validations
    }
    /**
     * Invoice details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoicesSwitchIdGetTest() {
        String id = null;
        String psysCid = null;
        InvoiceDetailsApiResponseDto response = api.invoicesSwitchIdGet(id, psysCid);

        // TODO: test validations
    }
}
