<!-- Start SDK Example Usage -->


```java
package hello.world;

import com.bolt.bolt_embed.BoltEmbed;
import com.bolt.bolt_embed.models.operations.AccountAddressCreateRequest;
import com.bolt.bolt_embed.models.operations.AccountAddressCreateResponse;
import com.bolt.bolt_embed.models.operations.AccountAddressCreateSecurity;
import com.bolt.bolt_embed.models.shared.AddressListing;

public class Application {
    public static void main(String[] args) {
        try {
            BoltEmbed sdk = BoltEmbed.builder()
                .build();

            AccountAddressCreateRequest req = new AccountAddressCreateRequest("corrupti",                 new AddressListing("US", "Alice", "Baker", "San Francisco", "94105", "535 Mission St, Ste 1401") {{
                                company = "ACME Corporation";
                                email = "alice@example.com";
                                id = "D4g3h5tBuVYK9";
                                isDefault = true;
                                phone = "+14155550199";
                                region = "CA";
                                streetAddress2 = "c/o Shipping Department";
                            }};);            

            AccountAddressCreateResponse res = sdk.account.addAddress(req, new AccountAddressCreateSecurity("provident", "distinctio") {{
                apiKey = "";
                oauth = "";
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