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
 * Merchant configuration endpoints allow you to retrieve and configure merchant-level
 * configuration, such as callback URLs, identifiers, secrets, etc...
 * 
 */
public class Configuration {
	
	private SDKConfiguration sdkConfiguration;

	public Configuration(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Retrieve callback URLs for the merchant
     * Return callback URLs configured on the merchant such as OAuth URLs.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.MerchantCallbacksGetResponse getmerchantCallback(com.bolt.bolt_embed.models.operations.MerchantCallbacksGetRequest request) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/merchant/callbacks");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.Map<String, java.util.List<String>> headers = com.bolt.bolt_embed.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.bolt.bolt_embed.models.operations.MerchantCallbacksGetResponse res = new com.bolt.bolt_embed.models.operations.MerchantCallbacksGetResponse(contentType, httpRes.statusCode(), httpRes) {{
            callbackUrls = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.CallbackUrls out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.CallbackUrls.class);
                res.callbackUrls = out;
            }
        }

        return res;
    }

    /**
     * Retrieve identifiers for the merchant
     * Return several identifiers for the merchant, such as public IDs, publishable keys, signing secrets, etc...
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.MerchantIdentifiersGetResponse getmerchantIdenitfier() throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/merchant/identifiers");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.bolt.bolt_embed.models.operations.MerchantIdentifiersGetResponse res = new com.bolt.bolt_embed.models.operations.MerchantIdentifiersGetResponse(contentType, httpRes.statusCode(), httpRes) {{
            identifiers = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.Identifiers out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.Identifiers.class);
                res.identifiers = out;
            }
        }

        return res;
    }

    /**
     * Update callback URLs for the merchant
     * Update and configure callback URLs on the merchant such as OAuth URLs.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateResponse updatemerchantCallback(com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateRequest request) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/merchant/callbacks");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.bolt.bolt_embed.utils.Utils.serializeRequestBody(request, "callbackUrls", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.Map<String, java.util.List<String>> headers = com.bolt.bolt_embed.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateResponse res = new com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateResponse(contentType, httpRes.statusCode(), httpRes) {{
            callbackUrls = null;
            oneOf = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.CallbackUrls out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.CallbackUrls.class);
                res.callbackUrls = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.oneOf = out;
            }
        }

        return res;
    }
}