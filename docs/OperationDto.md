# OperationDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | Profile ID |  [optional]
**shopId** | **String** | Shop ID |  [optional]
**type** | **String** | cash_in, cash_out, mass_cash_out, invoice |  [optional]
**status** | **String** | pending, completed, error, new, expired, mismatch, cancelled |  [optional]
**pendingSum** | **String** | unconfirmed amount (mempool) |  [optional]
**psysCid** | **String** | ID column from https://plisio.net/documentation/appendices/supported-cryptocurrencies |  [optional]
**currency** | **String** | Code column from https://plisio.net/documentation/appendices/supported-cryptocurrencies |  [optional]
**sourceCurrency** | **String** | fiat currency - USD by default or source_currency was set |  [optional]
**sourceRate** | **String** | Exchange rate from the “psys_cid” to the “source_currency” at the moment of transfer |  [optional]
**fee** | **String** | transaction fee stated in the transfer |  [optional]
**walletHash** | **String** | destination hash (type&#x3D;cash_out) or invoice hash |  [optional]
**sendmany** | **List&lt;String&gt;** | Pairs of hashes and values (type&#x3D;mass_cash_out) |  [optional]
**params** | [**OperationParamsDto**](OperationParamsDto.md) |  |  [optional]
**expireAtUtc** | **Integer** | timestamp in UTC timezone; it may need to be divided by 1000 |  [optional]
**createdAtUtc** | **Integer** | timestamp in the UTC timezone; it may need to be divided by 1000 |  [optional]
**amount** | **String** | amount received/transferred by an operation (invoice, cash-in/cash-out) |  [optional]
**sum** | **String** | Invoice: params.amount + Plisio commission (if customer pays commission) or params.amount (if merchant pays commission) Cash-out: transfer amount + network fee Cash-in: received amount |  [optional]
**commission** | **String** | Plisio commission |  [optional]
**txUrl** | **String** | link to the cryptocurrency block explorer |  [optional]
**txId** | **List&lt;String&gt;** | array of transaction ids |  [optional]
**id** | **String** | internal Plisio operation ID |  [optional]
**actualSum** | **String** | Real incoming amount |  [optional]
**actualCommission** | **String** | Plisio commission taken |  [optional]
**actualFee** | **String** | Network fee (move invoice to wallet) |  [optional]
**actualInvoiceSum** | **String** | actual_sum - actual_commis_sim - actual_fee |  [optional]
**tx** | **List&lt;Object&gt;** | array of transaction payment items |  [optional]
**confirmations** | **Integer** | Number of confirmations of this transaction. We don&#x27;t update confirmation after operation is confirmed |  [optional]
**statusCode** | **Integer** | Status code |  [optional]
**parentId** | **String** | ID of parent invoice |  [optional]
