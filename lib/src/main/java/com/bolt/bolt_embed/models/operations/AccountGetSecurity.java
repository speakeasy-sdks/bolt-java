/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;


public class AccountGetSecurity {
    @SpeakeasyMetadata("security:option=true")
    public AccountGetSecurityOption1 option1;

    public AccountGetSecurity withOption1(AccountGetSecurityOption1 option1) {
        this.option1 = option1;
        return this;
    }
    
    @SpeakeasyMetadata("security:option=true")
    public AccountGetSecurityOption2 option2;

    public AccountGetSecurity withOption2(AccountGetSecurityOption2 option2) {
        this.option2 = option2;
        return this;
    }
    
    public AccountGetSecurity(){}
}
