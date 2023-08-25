# AccountTestCreationDataInput


## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `deactivateAt`                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)     | :heavy_check_mark:                                                                            | N/A                                                                                           | 2017-07-21T17:32:28Z                                                                          |
| `emailState`                                                                                  | [AccountTestCreationDataEmailState](../../models/shared/AccountTestCreationDataEmailState.md) | :heavy_check_mark:                                                                            | N/A                                                                                           | unverified                                                                                    |
| `hasAddress`                                                                                  | *Boolean*                                                                                     | :heavy_minus_sign:                                                                            | N/A                                                                                           | true                                                                                          |
| `isMigrated`                                                                                  | *Boolean*                                                                                     | :heavy_minus_sign:                                                                            | N/A                                                                                           | true                                                                                          |
| `phoneState`                                                                                  | [AccountTestCreationDataPhoneState](../../models/shared/AccountTestCreationDataPhoneState.md) | :heavy_check_mark:                                                                            | N/A                                                                                           | verified                                                                                      |