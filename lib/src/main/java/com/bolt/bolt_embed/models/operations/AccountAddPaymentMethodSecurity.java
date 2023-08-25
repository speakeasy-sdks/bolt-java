/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountAddPaymentMethodSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=X-API-Key")
    public String apiKey;

    public AccountAddPaymentMethodSecurity withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    @SpeakeasyMetadata("security:scheme=true,type=oauth2,name=Authorization")
    public String oauth;

    public AccountAddPaymentMethodSecurity withOauth(String oauth) {
        this.oauth = oauth;
        return this;
    }
    
    public AccountAddPaymentMethodSecurity(@JsonProperty("api-key") String apiKey, @JsonProperty("oauth") String oauth) {
        this.apiKey = apiKey;
        this.oauth = oauth;
  }
}
