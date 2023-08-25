/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PaymentMethodCreditCardNetwork - The credit card network.
 */
public enum PaymentMethodCreditCardNetwork {
    VISA("visa"),
    MASTERCARD("mastercard"),
    AMEX("amex"),
    DISCOVER("discover"),
    JCB("jcb"),
    UNIONPAY("unionpay"),
    ALLIANCEDATA("alliancedata"),
    CITIPLCC("citiplcc");

    @JsonValue
    public final String value;

    private PaymentMethodCreditCardNetwork(String value) {
        this.value = value;
    }
}
