/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.bolt.bolt_embed.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Identifier {
    /**
     * The type of identifier
     */
    @SpeakeasyMetadata("queryParam:name=identifier_type")
    public IdentifierType identifierType;

    public Identifier withIdentifierType(IdentifierType identifierType) {
        this.identifierType = identifierType;
        return this;
    }
    
    /**
     * The value of the identifier. The value must be valid for the specified `identifier_type`
     */
    @SpeakeasyMetadata("queryParam:name=identifier_value")
    public String identifierValue;

    public Identifier withIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
        return this;
    }
    
    public Identifier(@JsonProperty("identifier_type") IdentifierType identifierType, @JsonProperty("identifier_value") String identifierValue) {
        this.identifierType = identifierType;
        this.identifierValue = identifierValue;
  }
}
