/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GuestPaymentsInitializeResponse {
    
    public String contentType;

    public GuestPaymentsInitializeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GuestPaymentsInitializeResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GuestPaymentsInitializeResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Payment token retrieved
     */
    
    public com.bolt.bolt_embed.models.shared.PaymentMethodInitializeResponse paymentMethodInitializeResponse;

    public GuestPaymentsInitializeResponse withPaymentMethodInitializeResponse(com.bolt.bolt_embed.models.shared.PaymentMethodInitializeResponse paymentMethodInitializeResponse) {
        this.paymentMethodInitializeResponse = paymentMethodInitializeResponse;
        return this;
    }
    
    public GuestPaymentsInitializeResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
