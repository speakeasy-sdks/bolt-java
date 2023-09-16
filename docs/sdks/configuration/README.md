# Configuration

## Overview

Merchant configuration endpoints allow you to retrieve and configure merchant-level
configuration, such as callback URLs, identifiers, secrets, etc...


### Available Operations

* [getmerchantCallback](#getmerchantcallback) - Retrieve callback URLs for the merchant
* [getmerchantIdenitfier](#getmerchantidenitfier) - Retrieve identifiers for the merchant
* [updatemerchantCallback](#updatemerchantcallback) - Update callback URLs for the merchant

## getmerchantCallback

Return callback URLs configured on the merchant such as OAuth URLs.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.MerchantCallbacksGetRequest;
import com.bolt.bolt_embed.models.operations.MerchantCallbacksGetResponse;
import com.bolt.bolt_embed.models.operations.MerchantCallbacksGetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            MerchantCallbacksGetRequest req = new MerchantCallbacksGetRequest("minus");            

            MerchantCallbacksGetResponse res = sdk.configuration.getmerchantCallback(req, new MerchantCallbacksGetSecurity("placeat") {{
                apiKey = "";
            }});

            if (res.callbackUrls != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.bolt.bolt_embed.models.operations.MerchantCallbacksGetRequest](../../models/operations/MerchantCallbacksGetRequest.md)   | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [com.bolt.bolt_embed.models.operations.MerchantCallbacksGetSecurity](../../models/operations/MerchantCallbacksGetSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |


### Response

**[com.bolt.bolt_embed.models.operations.MerchantCallbacksGetResponse](../../models/operations/MerchantCallbacksGetResponse.md)**


## getmerchantIdenitfier

Return several identifiers for the merchant, such as public IDs, publishable keys, signing secrets, etc...

### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.MerchantIdentifiersGetResponse;
import com.bolt.bolt_embed.models.operations.MerchantIdentifiersGetSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            MerchantIdentifiersGetResponse res = sdk.configuration.getmerchantIdenitfier(new MerchantIdentifiersGetSecurity("voluptatum") {{
                apiKey = "";
            }});

            if (res.identifiers != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [com.bolt.bolt_embed.models.operations.MerchantIdentifiersGetSecurity](../../models/operations/MerchantIdentifiersGetSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |


### Response

**[com.bolt.bolt_embed.models.operations.MerchantIdentifiersGetResponse](../../models/operations/MerchantIdentifiersGetResponse.md)**


## updatemerchantCallback

Update and configure callback URLs on the merchant such as OAuth URLs.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateRequest;
import com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateResponse;
import com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateSecurity;
import com.bolt.bolt_embed.models.shared.CallbackUrls;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            MerchantCallbacksUpdateRequest req = new MerchantCallbacksUpdateRequest("iusto",                 new CallbackUrls() {{
                                accountPage = "https://www.example.com/account";
                                baseDomain = "https://www.example.com/";
                                confirmationRedirect = "https://www.example.com/bolt/redirect";
                                createOrder = "https://www.example.com/bolt/order";
                                debug = "https://www.example.com/bolt/debug";
                                getAccount = "https://www.example.com/bolt/account";
                                mobileAppDomain = "https://m.example.com/";
                                oauthLogout = "https://www.example.com/bolt/logout";
                                oauthRedirect = "https://www.example.com/bolt/oauth";
                                privacyPolicy = "https://www.example.com/privacy-policy";
                                productInfo = "https://www.example.com/bolt/product";
                                remoteApi = "https://www.example.com/bolt/remote-api";
                                shipping = "https://www.example.com/bolt/shipping";
                                supportPage = "https://www.example.com/help";
                                tax = "https://www.example.com/bolt/tax";
                                termsOfService = "https://www.example.com/terms-of-service";
                                universalMerchantApi = "https://www.example.com/bolt/merchant-api";
                                updateCart = "https://www.example.com/bolt/cart";
                                validateAdditionalAccountData = "https://www.example.com/bolt/validate-account";
                            }};);            

            MerchantCallbacksUpdateResponse res = sdk.configuration.updatemerchantCallback(req, new MerchantCallbacksUpdateSecurity("excepturi") {{
                apiKey = "";
            }});

            if (res.callbackUrls != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateRequest](../../models/operations/MerchantCallbacksUpdateRequest.md)   | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |
| `security`                                                                                                                          | [com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateSecurity](../../models/operations/MerchantCallbacksUpdateSecurity.md) | :heavy_check_mark:                                                                                                                  | The security requirements to use for the request.                                                                                   |


### Response

**[com.bolt.bolt_embed.models.operations.MerchantCallbacksUpdateResponse](../../models/operations/MerchantCallbacksUpdateResponse.md)**

