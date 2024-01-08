/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WebhooksGetAllRequest {
    /**
     * The publicly viewable identifier used to identify a merchant division.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Publishable-Key")
    public String xPublishableKey;

    public WebhooksGetAllRequest withXPublishableKey(String xPublishableKey) {
        this.xPublishableKey = xPublishableKey;
        return this;
    }
    
    public WebhooksGetAllRequest(@JsonProperty("X-Publishable-Key") String xPublishableKey) {
        this.xPublishableKey = xPublishableKey;
  }
}
