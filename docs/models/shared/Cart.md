# Cart


## Fields

| Field                                                                                                                           | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `amounts`                                                                                                                       | [Amounts](../../models/shared/Amounts.md)                                                                                       | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |
| `discounts`                                                                                                                     | List<[CartDiscount](../../models/shared/CartDiscount.md)>                                                                       | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |
| `displayId`                                                                                                                     | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | This field corresponds to the merchant's order reference associated with this Bolt transaction.                                 | 215614191                                                                                                                       |
| `items`                                                                                                                         | List<[CartItem](../../models/shared/CartItem.md)>                                                                               | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |
| `orderDescription`                                                                                                              | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | Used optionally to pass additional information like order numbers or other IDs as needed.                                       | Order #1234567890                                                                                                               |
| `orderReference`                                                                                                                | *String*                                                                                                                        | :heavy_check_mark:                                                                                                              | This value is used by Bolt as an external reference to a given order. This reference must be unique per successful transaction. | order_100                                                                                                                       |
| `shipments`                                                                                                                     | List<[CartShipment](../../models/shared/CartShipment.md)>                                                                       | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |