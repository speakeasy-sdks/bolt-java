# Testing
(*testing*)

## Overview

Endpoints that allow you to generate and retrieve test data to verify certain
flows in non-production environments.


### Available Operations

* [createAccount](#createaccount) - Create a test account
* [createShipmentTracking](#createshipmenttracking) - Simulate a shipment tracking update
* [getCreditCard](#getcreditcard) - Retrieve a test credit card, including its token

## createAccount

Create a Bolt shopper account for testing purposes.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.TestingAccountCreateResponse;
import com.bolt.bolt_embed.models.shared.AccountTestCreationData;
import com.bolt.bolt_embed.models.shared.EmailState;
import com.bolt.bolt_embed.models.shared.PhoneState;
import com.bolt.bolt_embed.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .setSecurity(new Security(
                ){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.bolt.bolt_embed.models.shared.AccountTestCreationData req = new AccountTestCreationData(
                OffsetDateTime.parse("2017-07-21T17:32:28Z"),
                EmailState.UNVERIFIED,
                PhoneState.VERIFIED){{
                hasAddress = true;
                isMigrated = true;

            }};

            com.bolt.bolt_embed.models.operations.TestingAccountCreateResponse res = sdk.testing.createAccount(req);

            if (res.accountTestCreationData != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.bolt.bolt_embed.models.shared.AccountTestCreationData](../../models/shared/AccountTestCreationData.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.bolt.bolt_embed.models.operations.TestingAccountCreateResponse](../../models/operations/TestingAccountCreateResponse.md)**


## createShipmentTracking

Simulate a shipment tracking update, such as those that Bolt would ingest from
third-party shipping providers that would allow updating tracking and delivery
information to shipments associated with orders.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.TestingShipmentTrackingCreateResponse;
import com.bolt.bolt_embed.models.shared.Security;
import com.bolt.bolt_embed.models.shared.ShipmentTrackingUpdate;
import com.bolt.bolt_embed.models.shared.ShipmentTrackingUpdateSchemasStatus;
import com.bolt.bolt_embed.models.shared.ShipmentTrackingUpdateStatus;
import com.bolt.bolt_embed.models.shared.TrackingDetails;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .setSecurity(new Security(
                ){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            com.bolt.bolt_embed.models.shared.ShipmentTrackingUpdate req = new ShipmentTrackingUpdate(
                ShipmentTrackingUpdateStatus.IN_TRANSIT,
                new com.bolt.bolt_embed.models.shared.TrackingDetails[]{{
                    add(new TrackingDetails(
                    ){{
                        countryCode = "US";
                        eventDate = "2014-08-21:T14:24:00Z";
                        locality = "San Francisco";
                        message = "Billing information received";
                        postalCode = "94105";
                        region = "CA";
                        status = ShipmentTrackingUpdateSchemasStatus.PRE_TRANSIT;
                    }}),
                }},
                "MockBolt-143292"){{
                deliveryDate = OffsetDateTime.parse("2014-08-23:T06:00:00Z");

            }};

            com.bolt.bolt_embed.models.operations.TestingShipmentTrackingCreateResponse res = sdk.testing.createShipmentTracking(req);

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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.bolt.bolt_embed.models.shared.ShipmentTrackingUpdate](../../models/shared/ShipmentTrackingUpdate.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.bolt.bolt_embed.models.operations.TestingShipmentTrackingCreateResponse](../../models/operations/TestingShipmentTrackingCreateResponse.md)**


## getCreditCard

Retrieve test credit card information. This includes its token, which is
generated against the `4111 1111 1111 1004` test card.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.TestingCreditCardGetResponse;
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

            com.bolt.bolt_embed.models.operations.TestingCreditCardGetResponse res = sdk.testing.getCreditCard();

            if (res.creditCard != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.bolt.bolt_embed.models.operations.TestingCreditCardGetResponse](../../models/operations/TestingCreditCardGetResponse.md)**

