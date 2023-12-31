# Webhooks
(*webhooks*)

## Overview

Set up webhooks to notify your backend of events within Bolt. These webhooks
can communicate with your OMS or other systems to keep them up to date with Bolt.


<https://help.bolt.com/get-started/during-checkout/webhooks/>
### Available Operations

* [create](#create) - Create a webhook to subscribe to certain events
* [delete](#delete) - Delete an existing webhook
* [get](#get) - Retrieve information for a specific webhook
* [getAll](#getall) - Retrieve information about all existing webhooks

## create

Create a new webhook to receive notifications from Bolt about various events, such as transaction status.

### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.callbacks.WebhooksCreateWebhookEventRequestBody;
import com.bolt.bolt_embed.models.callbacks.WebhooksCreateWebhookEventResponse;
import com.bolt.bolt_embed.models.operations.WebhooksCreateResponse;
import com.bolt.bolt_embed.models.shared.Security;
import com.bolt.bolt_embed.models.shared.WebhookInput;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .setSecurity(new Security(
                ){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.bolt.bolt_embed.models.shared.WebhookInput req = new WebhookInput(
                "string",
                "https://www.example.com/webhook");

            com.bolt.bolt_embed.models.operations.WebhooksCreateResponse res = sdk.webhooks.create(req);

            if (res.webhook != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [com.bolt.bolt_embed.models.shared.WebhookInput](../../models/shared/WebhookInput.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |


### Response

**[com.bolt.bolt_embed.models.operations.WebhooksCreateResponse](../../models/operations/WebhooksCreateResponse.md)**


## delete

Delete an existing webhook. You will no longer receive notifications from Bolt about its events.

### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.WebhooksDeleteRequest;
import com.bolt.bolt_embed.models.operations.WebhooksDeleteResponse;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .setSecurity(new Security(
                ){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.bolt.bolt_embed.models.operations.WebhooksDeleteRequest req = new WebhooksDeleteRequest(
                "wh_za7VbYcSQU2zRgGQXQAm-g");

            com.bolt.bolt_embed.models.operations.WebhooksDeleteResponse res = sdk.webhooks.delete(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.bolt.bolt_embed.models.operations.WebhooksDeleteRequest](../../models/operations/WebhooksDeleteRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.bolt.bolt_embed.models.operations.WebhooksDeleteResponse](../../models/operations/WebhooksDeleteResponse.md)**


## get

Retrieve information for an existing webhook.

### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.WebhooksGetRequest;
import com.bolt.bolt_embed.models.operations.WebhooksGetResponse;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .setSecurity(new Security(
                ){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.bolt.bolt_embed.models.operations.WebhooksGetRequest req = new WebhooksGetRequest(
                "wh_za7VbYcSQU2zRgGQXQAm-g");

            com.bolt.bolt_embed.models.operations.WebhooksGetResponse res = sdk.webhooks.get(req);

            if (res.webhook != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.bolt.bolt_embed.models.operations.WebhooksGetRequest](../../models/operations/WebhooksGetRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.bolt.bolt_embed.models.operations.WebhooksGetResponse](../../models/operations/WebhooksGetResponse.md)**


## getAll

Retrieve information about all existing webhooks.

### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.WebhooksGetAllRequest;
import com.bolt.bolt_embed.models.operations.WebhooksGetAllResponse;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .setSecurity(new Security(
                ){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.bolt.bolt_embed.models.operations.WebhooksGetAllRequest req = new WebhooksGetAllRequest(
                "string");

            com.bolt.bolt_embed.models.operations.WebhooksGetAllResponse res = sdk.webhooks.getAll(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.bolt.bolt_embed.models.operations.WebhooksGetAllRequest](../../models/operations/WebhooksGetAllRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.bolt.bolt_embed.models.operations.WebhooksGetAllResponse](../../models/operations/WebhooksGetAllResponse.md)**

