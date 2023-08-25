# PaymentMethodPaypal


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `dotTag`                                                                | [PaymentMethodPaypalTag](../../models/shared/PaymentMethodPaypalTag.md) | :heavy_check_mark:                                                      | N/A                                                                     | paypal                                                                  |
| `cancel`                                                                | *String*                                                                | :heavy_check_mark:                                                      | Redirect URL for canceled PayPal transaction.                           | www.example.com/handle_paypal_cancel                                    |
| `success`                                                               | *String*                                                                | :heavy_check_mark:                                                      | Redirect URL for successful PayPal transaction.                         | www.example.com/handle_paypal_success                                   |