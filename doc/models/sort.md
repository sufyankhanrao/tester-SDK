
# Sort

You can use any `field_name` from this endpoint results, and you can combine more than one field for more complex sorting. You can use one of the following methods:

> /endpoint?sort={ "field_name": "asc", "field_name2": "desc" }
> 
> /endpoint?sort[field_name]=asc&sort[field_name2]=desc

## Structure

`Sort`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | [`IdEnum`](../../doc/models/id-enum.md) | Optional | - | IdEnum getId() | setId(IdEnum id) |
| `CreatedTs` | [`CreatedTsEnum`](../../doc/models/created-ts-enum.md) | Optional | - | CreatedTsEnum getCreatedTs() | setCreatedTs(CreatedTsEnum createdTs) |
| `ModifiedTs` | [`ModifiedTsEnum`](../../doc/models/modified-ts-enum.md) | Optional | - | ModifiedTsEnum getModifiedTs() | setModifiedTs(ModifiedTsEnum modifiedTs) |
| `ProductTransactionId` | [`ProductTransactionIdEnum`](../../doc/models/product-transaction-id-enum.md) | Optional | - | ProductTransactionIdEnum getProductTransactionId() | setProductTransactionId(ProductTransactionIdEnum productTransactionId) |
| `ProcessingStatusId` | [`ProcessingStatusIdEnum`](../../doc/models/processing-status-id-enum.md) | Optional | - | ProcessingStatusIdEnum getProcessingStatusId() | setProcessingStatusId(ProcessingStatusIdEnum processingStatusId) |
| `BatchNum` | [`BatchNumEnum`](../../doc/models/batch-num-enum.md) | Optional | - | BatchNumEnum getBatchNum() | setBatchNum(BatchNumEnum batchNum) |
| `IsOpen` | [`IsOpenEnum`](../../doc/models/is-open-enum.md) | Optional | - | IsOpenEnum getIsOpen() | setIsOpen(IsOpenEnum isOpen) |
| `SettlementFileName` | [`SettlementFileNameEnum`](../../doc/models/settlement-file-name-enum.md) | Optional | - | SettlementFileNameEnum getSettlementFileName() | setSettlementFileName(SettlementFileNameEnum settlementFileName) |
| `BatchCloseTs` | [`BatchCloseTsEnum`](../../doc/models/batch-close-ts-enum.md) | Optional | - | BatchCloseTsEnum getBatchCloseTs() | setBatchCloseTs(BatchCloseTsEnum batchCloseTs) |
| `BatchCloseDetail` | [`BatchCloseDetailEnum`](../../doc/models/batch-close-detail-enum.md) | Optional | - | BatchCloseDetailEnum getBatchCloseDetail() | setBatchCloseDetail(BatchCloseDetailEnum batchCloseDetail) |
| `TotalSaleAmount` | [`TotalSaleAmountEnum`](../../doc/models/total-sale-amount-enum.md) | Optional | - | TotalSaleAmountEnum getTotalSaleAmount() | setTotalSaleAmount(TotalSaleAmountEnum totalSaleAmount) |
| `TotalSaleCount` | [`TotalSaleCountEnum`](../../doc/models/total-sale-count-enum.md) | Optional | - | TotalSaleCountEnum getTotalSaleCount() | setTotalSaleCount(TotalSaleCountEnum totalSaleCount) |
| `TotalRefundAmount` | [`TotalRefundAmountEnum`](../../doc/models/total-refund-amount-enum.md) | Optional | - | TotalRefundAmountEnum getTotalRefundAmount() | setTotalRefundAmount(TotalRefundAmountEnum totalRefundAmount) |
| `TotalRefundCount` | [`TotalRefundCountEnum`](../../doc/models/total-refund-count-enum.md) | Optional | - | TotalRefundCountEnum getTotalRefundCount() | setTotalRefundCount(TotalRefundCountEnum totalRefundCount) |
| `TotalVoidAmount` | [`TotalVoidAmountEnum`](../../doc/models/total-void-amount-enum.md) | Optional | - | TotalVoidAmountEnum getTotalVoidAmount() | setTotalVoidAmount(TotalVoidAmountEnum totalVoidAmount) |
| `TotalVoidCount` | [`TotalVoidCountEnum`](../../doc/models/total-void-count-enum.md) | Optional | - | TotalVoidCountEnum getTotalVoidCount() | setTotalVoidCount(TotalVoidCountEnum totalVoidCount) |

## Example (as JSON)

```json
{
  "id": null,
  "created_ts": null,
  "modified_ts": null,
  "product_transaction_id": null,
  "processing_status_id": null,
  "batch_num": null,
  "is_open": null,
  "settlement_file_name": null,
  "batch_close_ts": null,
  "batch_close_detail": null,
  "total_sale_amount": null,
  "total_sale_count": null,
  "total_refund_amount": null,
  "total_refund_count": null,
  "total_void_amount": null,
  "total_void_count": null
}
```

