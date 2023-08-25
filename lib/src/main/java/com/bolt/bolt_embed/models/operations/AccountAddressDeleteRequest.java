/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountAddressDeleteRequest {
    /**
     * The publicly viewable identifier used to identify a merchant division.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Publishable-Key")
    public String xPublishableKey;

    public AccountAddressDeleteRequest withXPublishableKey(String xPublishableKey) {
        this.xPublishableKey = xPublishableKey;
        return this;
    }
    
    /**
     * The ID of the address to delete
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public AccountAddressDeleteRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public AccountAddressDeleteRequest(@JsonProperty("X-Publishable-Key") String xPublishableKey, @JsonProperty("id") String id) {
        this.xPublishableKey = xPublishableKey;
        this.id = id;
  }
}