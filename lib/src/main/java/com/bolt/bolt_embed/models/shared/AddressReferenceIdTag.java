/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AddressReferenceIdTag - The type of address reference
 */
public enum AddressReferenceIdTag {
    ID("id");

    @JsonValue
    public final String value;

    private AddressReferenceIdTag(String value) {
        this.value = value;
    }
}