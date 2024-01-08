/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentMethodInitializeRequest {
    @JsonProperty("cart")
    public Cart cart;

    public PaymentMethodInitializeRequest withCart(Cart cart) {
        this.cart = cart;
        return this;
    }
    
    @JsonProperty("payment_method")
    public Object paymentMethod;

    public PaymentMethodInitializeRequest withPaymentMethod(Object paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
    
    public PaymentMethodInitializeRequest(@JsonProperty("cart") Cart cart, @JsonProperty("payment_method") Object paymentMethod) {
        this.cart = cart;
        this.paymentMethod = paymentMethod;
  }
}
