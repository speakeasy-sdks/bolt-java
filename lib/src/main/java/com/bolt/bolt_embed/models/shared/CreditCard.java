/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreditCard {
    /**
     * The Bank Identification Number for the credit card. This is typically the first 4-6 digits of the credit card number.
     */
    @JsonProperty("bin")
    public String bin;

    public CreditCard withBin(String bin) {
        this.bin = bin;
        return this;
    }
    
    /**
     * The expiration date of the credit card. TODO TO MAKE EXPIRATION REUSABLE
     */
    @JsonProperty("expiration")
    public String expiration;

    public CreditCard withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    
    /**
     * The last 4 digits of the credit card number.
     */
    @JsonProperty("last4")
    public String last4;

    public CreditCard withLast4(String last4) {
        this.last4 = last4;
        return this;
    }
    
    /**
     * The credit card network.
     */
    @JsonProperty("network")
    public Network network;

    public CreditCard withNetwork(Network network) {
        this.network = network;
        return this;
    }
    
    /**
     * The Bolt token associated to the credit card.
     */
    @JsonProperty("token")
    public String token;

    public CreditCard withToken(String token) {
        this.token = token;
        return this;
    }
    
    public CreditCard(@JsonProperty("bin") String bin, @JsonProperty("expiration") String expiration, @JsonProperty("last4") String last4, @JsonProperty("network") Network network, @JsonProperty("token") String token) {
        this.bin = bin;
        this.expiration = expiration;
        this.last4 = last4;
        this.network = network;
        this.token = token;
  }
}
