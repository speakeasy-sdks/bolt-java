/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.bolt.bolt_embed.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksGetAllResponseBody - All existing webhook information has been retrieved
 */

public class WebhooksGetAllResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("webhooks")
    public com.bolt.bolt_embed.models.shared.Webhook[] webhooks;

    public WebhooksGetAllResponseBody withWebhooks(com.bolt.bolt_embed.models.shared.Webhook[] webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    
    public WebhooksGetAllResponseBody(){}
}
