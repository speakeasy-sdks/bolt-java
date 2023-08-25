/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GuestPaymentsInitializeSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=X-API-Key")
    public String apiKey;

    public GuestPaymentsInitializeSecurity withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    public GuestPaymentsInitializeSecurity(@JsonProperty("api-key") String apiKey) {
        this.apiKey = apiKey;
  }
}
