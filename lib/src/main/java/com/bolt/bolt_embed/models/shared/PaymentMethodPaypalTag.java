/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMethodPaypalTag {
    PAYPAL("paypal");

    @JsonValue
    public final String value;

    private PaymentMethodPaypalTag(String value) {
        this.value = value;
    }
}