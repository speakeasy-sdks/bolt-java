# Account
(*account*)

## Overview

Account endpoints allow you to view and manage shoppers' accounts. For example,
you can add or remove addresses and payment information.


### Available Operations

* [addAddress](#addaddress) - Add an address
* [addPaymentMethod](#addpaymentmethod) - Add a payment method to a shopper's Bolt account Wallet.
* [deleteAddress](#deleteaddress) - Delete an existing address
* [editAddress](#editaddress) - Edit an existing address
* [exists](#exists) - Determine the existence of a Bolt account
* [get](#get) - Retrieve account details

## addAddress

Add an address to the shopper's account

### Example Usage

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

            AccountAddressCreateRequest req = new AccountAddressCreateRequest("string", new AddressListing("US", "Alice", "Baker", "San Francisco", "94105", "535 Mission St, Ste 1401"){{
company = "ACME Corporation";
email = "alice@example.com";
id = "D4g3h5tBuVYK9";
isDefault = true;
phone = "+14155550199";
region = "CA";
streetAddress2 = "c/o Shipping Department";
}});            

            AccountAddressCreateResponse res = sdk.account.addAddress(req, new AccountAddressCreateSecurity(){{
                option1 = new AccountAddressCreateSecurityOption1("string", "string"){{
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

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.bolt.bolt_embed.models.operations.AccountAddressCreateRequest](../../models/operations/AccountAddressCreateRequest.md)   | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [com.bolt.bolt_embed.models.operations.AccountAddressCreateSecurity](../../models/operations/AccountAddressCreateSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |


### Response

**[com.bolt.bolt_embed.models.operations.AccountAddressCreateResponse](../../models/operations/AccountAddressCreateResponse.md)**


## addPaymentMethod

Add a payment method to a shopper's Bolt account Wallet. For security purposes, this request must come from
your backend because authentication requires the use of your private key.<br />
**Note**: Before using this API, the credit card details must be tokenized using Bolt's JavaScript library function,
which is documented in [Install the Bolt Tokenizer](https://help.bolt.com/developers/references/bolt-tokenizer).


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.AccountAddPaymentMethodRequest;
import com.bolt.bolt_embed.models.operations.AccountAddPaymentMethodResponse;
import com.bolt.bolt_embed.models.operations.AccountAddPaymentMethodSecurity;
import com.bolt.bolt_embed.models.operations.AccountAddPaymentMethodSecurityOption1;
import com.bolt.bolt_embed.models.operations.AccountAddPaymentMethodSecurityOption2;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            AccountAddPaymentMethodRequest req = new AccountAddPaymentMethodRequest("string", "string");            

            AccountAddPaymentMethodResponse res = sdk.account.addPaymentMethod(req, new AccountAddPaymentMethodSecurity(){{
                option1 = new AccountAddPaymentMethodSecurityOption1("string", "string"){{
                    apiKey = "";
                    oauth = "";
                }};
            }});

            if (res.paymentMethod != null) {
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
| `request`                                                                                                                           | [com.bolt.bolt_embed.models.operations.AccountAddPaymentMethodRequest](../../models/operations/AccountAddPaymentMethodRequest.md)   | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |
| `security`                                                                                                                          | [com.bolt.bolt_embed.models.operations.AccountAddPaymentMethodSecurity](../../models/operations/AccountAddPaymentMethodSecurity.md) | :heavy_check_mark:                                                                                                                  | The security requirements to use for the request.                                                                                   |


### Response

**[com.bolt.bolt_embed.models.operations.AccountAddPaymentMethodResponse](../../models/operations/AccountAddPaymentMethodResponse.md)**


## deleteAddress

Delete an existing address. Deleting an address does not invalidate transactions or
shipments that are associated with it.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.AccountAddressDeleteRequest;
import com.bolt.bolt_embed.models.operations.AccountAddressDeleteResponse;
import com.bolt.bolt_embed.models.operations.AccountAddressDeleteSecurity;
import com.bolt.bolt_embed.models.operations.AccountAddressDeleteSecurityOption1;
import com.bolt.bolt_embed.models.operations.AccountAddressDeleteSecurityOption2;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            AccountAddressDeleteRequest req = new AccountAddressDeleteRequest("string", "D4g3h5tBuVYK9");            

            AccountAddressDeleteResponse res = sdk.account.deleteAddress(req, new AccountAddressDeleteSecurity(){{
                option1 = new AccountAddressDeleteSecurityOption1("string", "string"){{
                    apiKey = "";
                    oauth = "";
                }};
            }});

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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.bolt.bolt_embed.models.operations.AccountAddressDeleteRequest](../../models/operations/AccountAddressDeleteRequest.md)   | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [com.bolt.bolt_embed.models.operations.AccountAddressDeleteSecurity](../../models/operations/AccountAddressDeleteSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |


### Response

**[com.bolt.bolt_embed.models.operations.AccountAddressDeleteResponse](../../models/operations/AccountAddressDeleteResponse.md)**


## editAddress

Edit an existing address on the shopper's account. This does not edit addresses
that are already associated with other resources, such as transactions or
shipments.


### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.AccountAddressEditRequest;
import com.bolt.bolt_embed.models.operations.AccountAddressEditResponse;
import com.bolt.bolt_embed.models.operations.AccountAddressEditSecurity;
import com.bolt.bolt_embed.models.operations.AccountAddressEditSecurityOption1;
import com.bolt.bolt_embed.models.operations.AccountAddressEditSecurityOption2;
import com.bolt.bolt_embed.models.shared.AddressListing;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            AccountAddressEditRequest req = new AccountAddressEditRequest("string", new AddressListing("US", "Alice", "Baker", "San Francisco", "94105", "535 Mission St, Ste 1401"){{
company = "ACME Corporation";
email = "alice@example.com";
id = "D4g3h5tBuVYK9";
isDefault = true;
phone = "+14155550199";
region = "CA";
streetAddress2 = "c/o Shipping Department";
}}, "D4g3h5tBuVYK9");            

            AccountAddressEditResponse res = sdk.account.editAddress(req, new AccountAddressEditSecurity(){{
                option1 = new AccountAddressEditSecurityOption1("string", "string"){{
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

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.bolt.bolt_embed.models.operations.AccountAddressEditRequest](../../models/operations/AccountAddressEditRequest.md)   | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [com.bolt.bolt_embed.models.operations.AccountAddressEditSecurity](../../models/operations/AccountAddressEditSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |


### Response

**[com.bolt.bolt_embed.models.operations.AccountAddressEditResponse](../../models/operations/AccountAddressEditResponse.md)**


## exists

Determine whether or not an identifier is associated with an existing Bolt account.

### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.AccountExistsRequest;
import com.bolt.bolt_embed.models.operations.AccountExistsResponse;
import com.bolt.bolt_embed.models.shared.Identifier;
import com.bolt.bolt_embed.models.shared.IdentifierIdentifierType;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .build();

            AccountExistsRequest req = new AccountExistsRequest("string", new Identifier(IdentifierIdentifierType.EMAIL, "alice@example.com"));            

            AccountExistsResponse res = sdk.account.exists(req);

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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.bolt.bolt_embed.models.operations.AccountExistsRequest](../../models/operations/AccountExistsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.bolt.bolt_embed.models.operations.AccountExistsResponse](../../models/operations/AccountExistsResponse.md)**


## get

Retrieve a shopper's account details, such as addresses and payment information

### Example Usage

```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.AccountGetRequest;
import com.bolt.bolt_embed.models.operations.AccountGetResponse;
import com.bolt.bolt_embed.models.operations.AccountGetSecurity;
import com.bolt.bolt_embed.models.operations.AccountGetSecurityOption1;
import com.bolt.bolt_embed.models.operations.AccountGetSecurityOption2;
import com.bolt.bolt_embed.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            AccountGetRequest req = new AccountGetRequest("string");            

            AccountGetResponse res = sdk.account.get(req, new AccountGetSecurity(){{
                option1 = new AccountGetSecurityOption1("string", "string"){{
                    apiKey = "";
                    oauth = "";
                }};
            }});

            if (res.account != null) {
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
| `request`                                                                                                 | [com.bolt.bolt_embed.models.operations.AccountGetRequest](../../models/operations/AccountGetRequest.md)   | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [com.bolt.bolt_embed.models.operations.AccountGetSecurity](../../models/operations/AccountGetSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |


### Response

**[com.bolt.bolt_embed.models.operations.AccountGetResponse](../../models/operations/AccountGetResponse.md)**

