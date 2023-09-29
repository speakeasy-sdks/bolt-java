# Payments
(*payments*)

## Overview

Use the Payments API to tokenize and process alternative payment methods including Paypal with Bolt. This API is for the Bolt
Accounts package.


### Available Operations

* [initializeGuestPayment](#initializeguestpayment) - Initialize a Bolt payment for guest shoppers
* [initializeLoggedInPayment](#initializeloggedinpayment) - Initialize a Bolt payment for logged in shoppers

## initializeGuestPayment

Initialize a Bolt payment token that will be used to reference this payment to
Bolt when it is updated or finalized for guest shoppers.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeRequest;
import com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeResponse;
import com.bolt.bolt_embed.models.shared.AddressReferenceExplicit;
import com.bolt.bolt_embed.models.shared.AddressReferenceExplicitTag;
import com.bolt.bolt_embed.models.shared.AddressReferenceId;
import com.bolt.bolt_embed.models.shared.AddressReferenceIdTag;
import com.bolt.bolt_embed.models.shared.Amounts;
import com.bolt.bolt_embed.models.shared.Cart;
import com.bolt.bolt_embed.models.shared.CartDiscount;
import com.bolt.bolt_embed.models.shared.CartItem;
import com.bolt.bolt_embed.models.shared.CartShipment;
import com.bolt.bolt_embed.models.shared.GuestPaymentMethodInitializeRequest;
import com.bolt.bolt_embed.models.shared.PaymentMethodPaypal;
import com.bolt.bolt_embed.models.shared.PaymentMethodPaypalTag;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .setSecurity(new Security("Shirt") {{
                    apiKey = "";
                }})
                .build();

            GuestPaymentsInitializeRequest req = new GuestPaymentsInitializeRequest("Grocery",                 new GuestPaymentMethodInitializeRequest(                new Cart(                new Amounts("USD", 900L) {{
                                                                tax = 900L;
                                                            }};, "order_100") {{
                                                discounts = new com.bolt.bolt_embed.models.shared.CartDiscount[]{{
                                                    add(new CartDiscount(                new Amounts("USD", 900L) {{
                                                                        tax = 900L;
                                                                    }};) {{
                                                        amounts = new Amounts("USD", 900L) {{
                                                            currency = "USD";
                                                            tax = 900L;
                                                            total = 900L;
                                                        }};
                                                        code = "SUMMER10DISCOUNT";
                                                        detailsUrl = "https://www.example.com/SUMMER-SALE";
                                                    }}),
                                                }};
                                                displayId = "215614191";
                                                items = new com.bolt.bolt_embed.models.shared.CartItem[]{{
                                                    add(new CartItem("Bolt Swag Bag", 1L, "item_100", 1000L, 1000L) {{
                                                        description = "Large tote with Bolt logo.";
                                                        imageUrl = "https://www.example.com/products/123456/images/1.png";
                                                        name = "Bolt Swag Bag";
                                                        quantity = 1L;
                                                        reference = "item_100";
                                                        totalAmount = 1000L;
                                                        unitPrice = 1000L;
                                                    }}),
                                                }};
                                                orderDescription = "Order #1234567890";
                                                shipments = new com.bolt.bolt_embed.models.shared.CartShipment[]{{
                                                    add(new CartShipment() {{
                                                        address = new AddressReferenceId(AddressReferenceIdTag.ID, "D4g3h5tBuVYK9") {{
                                                            dotTag = AddressReferenceIdTag.ID;
                                                            id = "D4g3h5tBuVYK9";
                                                        }};
                                                        carrier = "FedEx";
                                                        cost = new Amounts("USD", 900L) {{
                                                            currency = "USD";
                                                            tax = 900L;
                                                            total = 900L;
                                                        }};
                                                    }}),
                                                }};
                                            }};,                 new PaymentMethodPaypal(PaymentMethodPaypalTag.PAYPAL, "www.example.com/handle_paypal_cancel", "www.example.com/handle_paypal_success");););            

            GuestPaymentsInitializeResponse res = sdk.payments.initializeGuestPayment(req);

            if (res.paymentMethodInitializeResponse != null) {
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
| `request`                                                                                                                         | [com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeRequest](../../models/operations/GuestPaymentsInitializeRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[com.bolt.bolt_embed.models.operations.GuestPaymentsInitializeResponse](../../models/operations/GuestPaymentsInitializeResponse.md)**


## initializeLoggedInPayment

Initialize a Bolt payment token that will be used to reference this payment to
Bolt when it is updated or finalized for logged in shoppers.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.PaymentsInitializeRequest;
import com.bolt.bolt_embed.models.operations.PaymentsInitializeResponse;
import com.bolt.bolt_embed.models.operations.PaymentsInitializeSecurity;
import com.bolt.bolt_embed.models.operations.PaymentsInitializeSecurityOption1;
import com.bolt.bolt_embed.models.operations.PaymentsInitializeSecurityOption2;
import com.bolt.bolt_embed.models.shared.AddressReferenceExplicit;
import com.bolt.bolt_embed.models.shared.AddressReferenceExplicitTag;
import com.bolt.bolt_embed.models.shared.AddressReferenceId;
import com.bolt.bolt_embed.models.shared.AddressReferenceIdTag;
import com.bolt.bolt_embed.models.shared.Amounts;
import com.bolt.bolt_embed.models.shared.Cart;
import com.bolt.bolt_embed.models.shared.CartDiscount;
import com.bolt.bolt_embed.models.shared.CartItem;
import com.bolt.bolt_embed.models.shared.CartShipment;
import com.bolt.bolt_embed.models.shared.PaymentMethodInitializeRequest;
import com.bolt.bolt_embed.models.shared.PaymentMethodSavedPaymentMethod;
import com.bolt.bolt_embed.models.shared.PaymentMethodSavedPaymentMethodTag;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            PaymentsInitializeRequest req = new PaymentsInitializeRequest("Dam",                 new PaymentMethodInitializeRequest(                new Cart(                new Amounts("USD", 900L) {{
                                                                tax = 900L;
                                                            }};, "order_100") {{
                                                discounts = new com.bolt.bolt_embed.models.shared.CartDiscount[]{{
                                                    add(new CartDiscount(                new Amounts("USD", 900L) {{
                                                                        tax = 900L;
                                                                    }};) {{
                                                        amounts = new Amounts("USD", 900L) {{
                                                            currency = "USD";
                                                            tax = 900L;
                                                            total = 900L;
                                                        }};
                                                        code = "SUMMER10DISCOUNT";
                                                        detailsUrl = "https://www.example.com/SUMMER-SALE";
                                                    }}),
                                                }};
                                                displayId = "215614191";
                                                items = new com.bolt.bolt_embed.models.shared.CartItem[]{{
                                                    add(new CartItem("Bolt Swag Bag", 1L, "item_100", 1000L, 1000L) {{
                                                        description = "Large tote with Bolt logo.";
                                                        imageUrl = "https://www.example.com/products/123456/images/1.png";
                                                        name = "Bolt Swag Bag";
                                                        quantity = 1L;
                                                        reference = "item_100";
                                                        totalAmount = 1000L;
                                                        unitPrice = 1000L;
                                                    }}),
                                                }};
                                                orderDescription = "Order #1234567890";
                                                shipments = new com.bolt.bolt_embed.models.shared.CartShipment[]{{
                                                    add(new CartShipment() {{
                                                        address = new AddressReferenceExplicit(AddressReferenceExplicitTag.EXPLICIT, "US", "Alice", "Baker", "San Francisco", "94105", "535 Mission St, Ste 1401") {{
                                                            dotTag = AddressReferenceExplicitTag.EXPLICIT;
                                                            company = "ACME Corporation";
                                                            countryCode = "US";
                                                            email = "alice@example.com";
                                                            firstName = "Alice";
                                                            id = "D4g3h5tBuVYK9";
                                                            lastName = "Baker";
                                                            locality = "San Francisco";
                                                            phone = "+14155550199";
                                                            postalCode = "94105";
                                                            region = "CA";
                                                            streetAddress1 = "535 Mission St, Ste 1401";
                                                            streetAddress2 = "c/o Shipping Department";
                                                        }};
                                                        carrier = "FedEx";
                                                        cost = new Amounts("USD", 900L) {{
                                                            currency = "USD";
                                                            tax = 900L;
                                                            total = 900L;
                                                        }};
                                                    }}),
                                                }};
                                            }};,                 new PaymentMethodSavedPaymentMethod(PaymentMethodSavedPaymentMethodTag.SAVED_PAYMENT_METHOD, "id");););            

            PaymentsInitializeResponse res = sdk.payments.initializeLoggedInPayment(req, new PaymentsInitializeSecurity() {{
                option1 = new PaymentsInitializeSecurityOption1("Saint", "invoice") {{
                    apiKey = "";
                    oauth = "";
                }};
            }});

            if (res.paymentMethodInitializeResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.bolt.bolt_embed.models.operations.PaymentsInitializeRequest](../../models/operations/PaymentsInitializeRequest.md)   | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [com.bolt.bolt_embed.models.operations.PaymentsInitializeSecurity](../../models/operations/PaymentsInitializeSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |


### Response

**[com.bolt.bolt_embed.models.operations.PaymentsInitializeResponse](../../models/operations/PaymentsInitializeResponse.md)**

