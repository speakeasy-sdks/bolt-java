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
import java.time.OffsetDateTime;

/**
 * Endpoints that allow you to generate and retrieve test data to verify certain
 * flows in non-production environments.
 * 
 */
public class Testing {
	
	private SDKConfiguration sdkConfiguration;

	public Testing(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a test account
     * Create a Bolt shopper account for testing purposes.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.TestingAccountCreateResponse createAccount(com.bolt.bolt_embed.models.shared.AccountTestCreationData request) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/testing/accounts");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.bolt.bolt_embed.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.bolt.bolt_embed.models.operations.TestingAccountCreateResponse res = new com.bolt.bolt_embed.models.operations.TestingAccountCreateResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountTestCreationData = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.AccountTestCreationDataOutput out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.AccountTestCreationDataOutput.class);
                res.accountTestCreationData = out;
            }
        }

        return res;
    }

    /**
     * Simulate a shipment tracking update
     * Simulate a shipment tracking update, such as those that Bolt would ingest from
     * third-party shipping providers that would allow updating tracking and delivery
     * information to shipments associated with orders.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.TestingShipmentTrackingCreateResponse createShipmentTracking(com.bolt.bolt_embed.models.shared.ShipmentTrackingUpdate request) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/testing/shipments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.bolt.bolt_embed.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.bolt.bolt_embed.models.operations.TestingShipmentTrackingCreateResponse res = new com.bolt.bolt_embed.models.operations.TestingShipmentTrackingCreateResponse(contentType, httpRes.statusCode(), httpRes) {{
        }};
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }

    /**
     * Retrieve a test credit card, including its token
     * Retrieve test credit card information. This includes its token, which is
     * generated against the `4111 1111 1111 1004` test card.
     * 
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.TestingCreditCardGetResponse getCreditCard() throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/testing/credit-cards");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.bolt.bolt_embed.models.operations.TestingCreditCardGetResponse res = new com.bolt.bolt_embed.models.operations.TestingCreditCardGetResponse(contentType, httpRes.statusCode(), httpRes) {{
            creditCard = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.CreditCard out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.CreditCard.class);
                res.creditCard = out;
            }
        }

        return res;
    }
}