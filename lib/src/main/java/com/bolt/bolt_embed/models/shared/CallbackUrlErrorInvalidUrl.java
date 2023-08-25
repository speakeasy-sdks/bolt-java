/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CallbackUrlErrorInvalidUrl {
    /**
     * The type of error returned
     */
    @JsonProperty(".tag")
    public CallbackUrlErrorInvalidUrlTag dotTag;

    public CallbackUrlErrorInvalidUrl withDotTag(CallbackUrlErrorInvalidUrlTag dotTag) {
        this.dotTag = dotTag;
        return this;
    }
    
    /**
     * A human-readable error message, which might include information specific to
     * the request that was made.
     * 
     */
    @JsonProperty("message")
    public String message;

    public CallbackUrlErrorInvalidUrl withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public CallbackUrlErrorInvalidUrl(@JsonProperty(".tag") CallbackUrlErrorInvalidUrlTag dotTag, @JsonProperty("message") String message) {
        this.dotTag = dotTag;
        this.message = message;
  }
}