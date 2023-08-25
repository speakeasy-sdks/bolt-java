/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.callbacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class WebhooksCreateWebhookEventResponse {
    
    public String contentType;

    public WebhooksCreateWebhookEventResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public WebhooksCreateWebhookEventResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public WebhooksCreateWebhookEventResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public WebhooksCreateWebhookEventResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}