/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountExistsRequest {
    /**
     * The publicly viewable identifier used to identify a merchant division.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Publishable-Key")
    public String xPublishableKey;

    public AccountExistsRequest withXPublishableKey(String xPublishableKey) {
        this.xPublishableKey = xPublishableKey;
        return this;
    }
    
    /**
     * A type and value combination that defines the identifier used to detect
     * the existence of an account.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=identifier")
    public com.bolt.bolt_embed.models.shared.Identifier identifier;

    public AccountExistsRequest withIdentifier(com.bolt.bolt_embed.models.shared.Identifier identifier) {
        this.identifier = identifier;
        return this;
    }
    
    public AccountExistsRequest(@JsonProperty("X-Publishable-Key") String xPublishableKey, @JsonProperty("identifier") com.bolt.bolt_embed.models.shared.Identifier identifier) {
        this.xPublishableKey = xPublishableKey;
        this.identifier = identifier;
  }
}
