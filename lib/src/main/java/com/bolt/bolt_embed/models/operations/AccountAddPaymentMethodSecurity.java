/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;


public class AccountAddPaymentMethodSecurity {
    @SpeakeasyMetadata("security:option=true")
    public AccountAddPaymentMethodSecurityOption1 option1;

    public AccountAddPaymentMethodSecurity withOption1(AccountAddPaymentMethodSecurityOption1 option1) {
        this.option1 = option1;
        return this;
    }
    
    @SpeakeasyMetadata("security:option=true")
    public AccountAddPaymentMethodSecurityOption2 option2;

    public AccountAddPaymentMethodSecurity withOption2(AccountAddPaymentMethodSecurityOption2 option2) {
        this.option2 = option2;
        return this;
    }
    
    public AccountAddPaymentMethodSecurity(){}
}
