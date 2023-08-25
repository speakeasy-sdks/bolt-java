/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class TestingAccountCreateResponse {
    
    public String contentType;

    public TestingAccountCreateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public TestingAccountCreateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public TestingAccountCreateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * The account was successfully created
     */
    
    public com.bolt.bolt_embed.models.shared.AccountTestCreationDataOutput accountTestCreationData;

    public TestingAccountCreateResponse withAccountTestCreationData(com.bolt.bolt_embed.models.shared.AccountTestCreationDataOutput accountTestCreationData) {
        this.accountTestCreationData = accountTestCreationData;
        return this;
    }
    
    public TestingAccountCreateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}