/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountAddressEditSecurityOption2 {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=X-API-Key")
    public String apiKey;

    public AccountAddressEditSecurityOption2 withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String oauthBearer;

    public AccountAddressEditSecurityOption2 withOauthBearer(String oauthBearer) {
        this.oauthBearer = oauthBearer;
        return this;
    }
    
    public AccountAddressEditSecurityOption2(@JsonProperty("api-key") String apiKey, @JsonProperty("oauth-bearer") String oauthBearer) {
        this.apiKey = apiKey;
        this.oauthBearer = oauthBearer;
  }
}
