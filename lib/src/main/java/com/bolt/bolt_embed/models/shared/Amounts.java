/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Amounts {
    @JsonProperty("currency")
    public String currency;

    public Amounts withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    /**
     * The total tax amount, in cents for all of the items associated with the cart.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax")
    public Long tax;

    public Amounts withTax(Long tax) {
        this.tax = tax;
        return this;
    }
    
    /**
     * The total amount, in cents, including its items and taxes (if applicable).
     */
    @JsonProperty("total")
    public Long total;

    public Amounts withTotal(Long total) {
        this.total = total;
        return this;
    }
    
    public Amounts(@JsonProperty("currency") String currency, @JsonProperty("total") Long total) {
        this.currency = currency;
        this.total = total;
  }
}
