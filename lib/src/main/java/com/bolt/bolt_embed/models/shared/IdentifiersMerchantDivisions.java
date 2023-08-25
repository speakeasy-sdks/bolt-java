/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class IdentifiersMerchantDivisions {
    @JsonProperty("publishable_key")
    public String publishableKey;

    public IdentifiersMerchantDivisions withPublishableKey(String publishableKey) {
        this.publishableKey = publishableKey;
        return this;
    }
    
    public IdentifiersMerchantDivisions(@JsonProperty("publishable_key") String publishableKey) {
        this.publishableKey = publishableKey;
  }
}
