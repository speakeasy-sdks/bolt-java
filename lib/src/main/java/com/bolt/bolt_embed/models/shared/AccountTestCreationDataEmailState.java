/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountTestCreationDataEmailState {
    MISSING("missing"),
    UNVERIFIED("unverified"),
    VERIFIED("verified");

    @JsonValue
    public final String value;

    private AccountTestCreationDataEmailState(String value) {
        this.value = value;
    }
}
