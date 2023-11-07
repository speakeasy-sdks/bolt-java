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
 * Set up webhooks to notify your backend of events within Bolt. These webhooks
 * can communicate with your OMS or other systems to keep them up to date with Bolt.
 * 
 * https://help.bolt.com/get-started/during-checkout/webhooks/
 */
public class Webhooks {
	
	private SDKConfiguration sdkConfiguration;

	public Webhooks(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a webhook to subscribe to certain events
     * Create a new webhook to receive notifications from Bolt about various events, such as transaction status.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.WebhooksCreateResponse create(com.bolt.bolt_embed.models.shared.WebhookInput request) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/webhooks");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
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

        com.bolt.bolt_embed.models.operations.WebhooksCreateResponse res = new com.bolt.bolt_embed.models.operations.WebhooksCreateResponse(contentType, httpRes.statusCode()) {{
            webhook = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.Webhook out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.Webhook.class);
                res.webhook = out;
            }
        }

        return res;
    }

    /**
     * Delete an existing webhook
     * Delete an existing webhook. You will no longer receive notifications from Bolt about its events.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.WebhooksDeleteResponse delete(com.bolt.bolt_embed.models.operations.WebhooksDeleteRequest request) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(com.bolt.bolt_embed.models.operations.WebhooksDeleteRequest.class, baseUrl, "/webhooks/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.bolt.bolt_embed.models.operations.WebhooksDeleteResponse res = new com.bolt.bolt_embed.models.operations.WebhooksDeleteResponse(contentType, httpRes.statusCode()) {{
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 422) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Retrieve information for a specific webhook
     * Retrieve information for an existing webhook.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.WebhooksGetResponse get(com.bolt.bolt_embed.models.operations.WebhooksGetRequest request) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(com.bolt.bolt_embed.models.operations.WebhooksGetRequest.class, baseUrl, "/webhooks/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.bolt.bolt_embed.models.operations.WebhooksGetResponse res = new com.bolt.bolt_embed.models.operations.WebhooksGetResponse(contentType, httpRes.statusCode()) {{
            webhook = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.Webhook out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.Webhook.class);
                res.webhook = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Retrieve information about all existing webhooks
     * Retrieve information about all existing webhooks.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.bolt.bolt_embed.models.operations.WebhooksGetAllResponse getAll(com.bolt.bolt_embed.models.operations.WebhooksGetAllRequest request) throws Exception {
        String baseUrl = com.bolt.bolt_embed.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = com.bolt.bolt_embed.utils.Utils.generateURL(baseUrl, "/webhooks");
        
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

        com.bolt.bolt_embed.models.operations.WebhooksGetAllResponse res = new com.bolt.bolt_embed.models.operations.WebhooksGetAllResponse(contentType, httpRes.statusCode()) {{
            object = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.bolt.bolt_embed.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.bolt.bolt_embed.models.operations.WebhooksGetAllResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.bolt.bolt_embed.models.operations.WebhooksGetAllResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}