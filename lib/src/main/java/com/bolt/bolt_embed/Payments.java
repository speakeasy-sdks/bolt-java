/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed;

import com.bolt.bolt_embed.utils.HTTPClient;
import com.bolt.bolt_embed.utils.HTTPRequest;
import com.bolt.bolt_embed.utils.JSON;
import com.bolt.bolt_embed.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * Use the Payments API to tokenize and process alternative payment methods including Paypal with Bolt. This API is for the Bolt
 * Accounts package.
 * 
 */
public class Payments {
	
	private SDKConfiguration sdkConfiguration;

	public Payments(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Initialize a Bolt payment for guest shoppers
     * Initialize a Bolt payment token that will be used to reference this payment to
     * Bolt when it is updated or finalized for guest shoppers.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeResponse initializeGuestPayment(com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeRequest request, com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeSecurity security) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/guest/payments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.bolt.bolt_embed.utils.Utils.serializeRequestBody(request, "guestPaymentMethodInitializeRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.Map<String, java.util.List<String>> headers = com.bolt.bolt_embed.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = com.bolt.bolt_embed.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeResponse res = new com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeResponse(contentType, httpRes.statusCode()) {{
            paymentMethodInitializeResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.PaymentMethodInitializeResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.PaymentMethodInitializeResponse.class);
                res.paymentMethodInitializeResponse = out;
            }
        }

        return res;
    }

    /**
     * Initialize a Bolt payment for logged in shoppers
     * Initialize a Bolt payment token that will be used to reference this payment to
     * Bolt when it is updated or finalized for logged in shoppers.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.PaymentsInitializeResponse initializeLoggedInPayment(com.bolt.bolt_embed.models.operations.PaymentsInitializeRequest request, com.bolt.bolt_embed.models.operations.PaymentsInitializeSecurity security) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/payments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.bolt.bolt_embed.utils.Utils.serializeRequestBody(request, "paymentMethodInitializeRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.Map<String, java.util.List<String>> headers = com.bolt.bolt_embed.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = com.bolt.bolt_embed.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.bolt.bolt_embed.models.operations.PaymentsInitializeResponse res = new com.bolt.bolt_embed.models.operations.PaymentsInitializeResponse(contentType, httpRes.statusCode()) {{
            paymentMethodInitializeResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.PaymentMethodInitializeResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.PaymentMethodInitializeResponse.class);
                res.paymentMethodInitializeResponse = out;
            }
        }

        return res;
    }
}