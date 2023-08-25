/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MerchantCallbacksGetRequest {
    /**
     * The publicly viewable identifier used to identify a merchant division.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Publishable-Key")
    public String xPublishableKey;

    public MerchantCallbacksGetRequest withXPublishableKey(String xPublishableKey) {
        this.xPublishableKey = xPublishableKey;
        return this;
    }
    
    public MerchantCallbacksGetRequest(@JsonProperty("X-Publishable-Key") String xPublishableKey) {
        this.xPublishableKey = xPublishableKey;
  }
}