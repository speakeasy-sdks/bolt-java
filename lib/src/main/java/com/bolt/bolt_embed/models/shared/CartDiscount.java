/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CartDiscount {
    @JsonProperty("amounts")
    public Amounts amounts;

    public CartDiscount withAmounts(Amounts amounts) {
        this.amounts = amounts;
        return this;
    }
    
    /**
     * Discount code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;

    public CartDiscount withCode(String code) {
        this.code = code;
        return this;
    }
    
    /**
     * Used to provide a link to additional details, such as a landing page, associated with the discount offering.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details_url")
    public String detailsUrl;

    public CartDiscount withDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
        return this;
    }
    
    public CartDiscount(@JsonProperty("amounts") Amounts amounts) {
        this.amounts = amounts;
  }
}
