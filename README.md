<div align="center">
    <img src="https://github.com/speakeasy-sdks/bolt-java/assets/6267663/3e741d7f-a84e-4cce-b60b-4f3a98fe48f4" width="300">
    <h1>Java SDK</h1>
   <p>Shockingly simple Checkout</p>
   <a href="https://help.bolt.com/api-bolt/"><img src="https://img.shields.io/static/v1?label=Docs&message=API Ref&color=000&style=for-the-badge" /></a>
   <a href="https://github.com/speakeasy-sdks/bolt-java/actions"><img src="https://img.shields.io/github/actions/workflow/status/speakeasy-sdks/bolt-java/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" /></a>
</div>


<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'com.bolt.bolt_embed:bolt-embed:0.10.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.AccountAddressCreateRequest;
import com.bolt.bolt_embed.models.operations.AccountAddressCreateResponse;
import com.bolt.bolt_embed.models.operations.AccountAddressCreateSecurity;
import com.bolt.bolt_embed.models.operations.AccountAddressCreateSecurityOption1;
import com.bolt.bolt_embed.models.operations.AccountAddressCreateSecurityOption2;
import com.bolt.bolt_embed.models.shared.AddressListing;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            AccountAddressCreateRequest req = new AccountAddressCreateRequest("Sedan", new AddressListing("US", "Alice", "Baker", "San Francisco", "94105", "535 Mission St, Ste 1401"){{
company = "ACME Corporation";
email = "alice@example.com";
id = "D4g3h5tBuVYK9";
isDefault = true;
phone = "+14155550199";
region = "CA";
streetAddress2 = "c/o Shipping Department";
}});            

            AccountAddressCreateResponse res = sdk.account.addAddress(req, new AccountAddressCreateSecurity(){{
                option1 = new AccountAddressCreateSecurityOption1("F2M", "placeat"){{
                    apiKey = "";
                    oauth = "";
                }};
            }});

            if (res.addressListing != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [account](docs/sdks/account/README.md)

* [addAddress](docs/sdks/account/README.md#addaddress) - Add an address
* [addPaymentMethod](docs/sdks/account/README.md#addpaymentmethod) - Add a payment method to a shopper's Bolt account Wallet.
* [deleteAddress](docs/sdks/account/README.md#deleteaddress) - Delete an existing address
* [editAddress](docs/sdks/account/README.md#editaddress) - Edit an existing address
* [exists](docs/sdks/account/README.md#exists) - Determine the existence of a Bolt account
* [get](docs/sdks/account/README.md#get) - Retrieve account details

### [configuration](docs/sdks/configuration/README.md)

* [getmerchantCallback](docs/sdks/configuration/README.md#getmerchantcallback) - Retrieve callback URLs for the merchant
* [getmerchantIdenitfier](docs/sdks/configuration/README.md#getmerchantidenitfier) - Retrieve identifiers for the merchant
* [updatemerchantCallback](docs/sdks/configuration/README.md#updatemerchantcallback) - Update callback URLs for the merchant

### [payments](docs/sdks/payments/README.md)

* [initializeGuestPayment](docs/sdks/payments/README.md#initializeguestpayment) - Initialize a Bolt payment for guest shoppers
* [initializeLoggedInPayment](docs/sdks/payments/README.md#initializeloggedinpayment) - Initialize a Bolt payment for logged in shoppers

### [testing](docs/sdks/testing/README.md)

* [createAccount](docs/sdks/testing/README.md#createaccount) - Create a test account
* [createShipmentTracking](docs/sdks/testing/README.md#createshipmenttracking) - Simulate a shipment tracking update
* [getCreditCard](docs/sdks/testing/README.md#getcreditcard) - Retrieve a test credit card, including its token

### [webhooks](docs/sdks/webhooks/README.md)

* [create](docs/sdks/webhooks/README.md#create) - Create a webhook to subscribe to certain events
* [delete](docs/sdks/webhooks/README.md#delete) - Delete an existing webhook
* [get](docs/sdks/webhooks/README.md#get) - Retrieve information for a specific webhook
* [getAll](docs/sdks/webhooks/README.md#getall) - Retrieve information about all existing webhooks
<!-- End SDK Available Operations -->



<!-- Start Dev Containers -->

<!-- End Dev Containers -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
