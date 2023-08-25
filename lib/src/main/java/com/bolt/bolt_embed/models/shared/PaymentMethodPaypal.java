/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentMethodPaypal {
    @JsonProperty(".tag")
    public PaymentMethodPaypalTag dotTag;

    public PaymentMethodPaypal withDotTag(PaymentMethodPaypalTag dotTag) {
        this.dotTag = dotTag;
        return this;
    }
    
    /**
     * Redirect URL for canceled PayPal transaction.
     */
    @JsonProperty("cancel")
    public String cancel;

    public PaymentMethodPaypal withCancel(String cancel) {
        this.cancel = cancel;
        return this;
    }
    
    /**
     * Redirect URL for successful PayPal transaction.
     */
    @JsonProperty("success")
    public String success;

    public PaymentMethodPaypal withSuccess(String success) {
        this.success = success;
        return this;
    }
    
    public PaymentMethodPaypal(@JsonProperty(".tag") PaymentMethodPaypalTag dotTag, @JsonProperty("cancel") String cancel, @JsonProperty("success") String success) {
        this.dotTag = dotTag;
        this.cancel = cancel;
        this.success = success;
  }
}