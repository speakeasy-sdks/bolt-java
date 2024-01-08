/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentMethodInitializeResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action")
    public Action action;

    public PaymentMethodInitializeResponse withAction(Action action) {
        this.action = action;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public PaymentMethodInitializeResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public Status status;

    public PaymentMethodInitializeResponse withStatus(Status status) {
        this.status = status;
        return this;
    }
    
    public PaymentMethodInitializeResponse(){}
}
