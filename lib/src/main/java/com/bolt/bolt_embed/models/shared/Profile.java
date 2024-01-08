/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Profile {
    /**
     * An email address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;

    public Profile withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * The given name of the person associated with this record.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    public String firstName;

    public Profile withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    /**
     * The last name of the person associated with this record.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    public String lastName;

    public Profile withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    /**
     * A phone number following E164 standards, in its globalized format, i.e. prepended with a plus sign.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    public String phone;

    public Profile withPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    public Profile(){}
}
