/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GuestPaymentsInitializeRequest {
    /**
     * The publicly viewable identifier used to identify a merchant division.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Publishable-Key")
    public String xPublishableKey;

    public GuestPaymentsInitializeRequest withXPublishableKey(String xPublishableKey) {
        this.xPublishableKey = xPublishableKey;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.bolt.bolt_embed.models.shared.GuestPaymentMethodInitializeRequest guestPaymentMethodInitializeRequest;

    public GuestPaymentsInitializeRequest withGuestPaymentMethodInitializeRequest(com.bolt.bolt_embed.models.shared.GuestPaymentMethodInitializeRequest guestPaymentMethodInitializeRequest) {
        this.guestPaymentMethodInitializeRequest = guestPaymentMethodInitializeRequest;
        return this;
    }
    
    public GuestPaymentsInitializeRequest(@JsonProperty("X-Publishable-Key") String xPublishableKey, @JsonProperty("guest-payment-method-initialize-request") com.bolt.bolt_embed.models.shared.GuestPaymentMethodInitializeRequest guestPaymentMethodInitializeRequest) {
        this.xPublishableKey = xPublishableKey;
        this.guestPaymentMethodInitializeRequest = guestPaymentMethodInitializeRequest;
  }
}
