
# Filter

You can use any `field_name` from this endpoint results as a filter, and you can also use more than one field to create AND conditions. You can use one of the following methods:

> /endpoint?filter={ "field_name": "Value" }
> 
> /endpoint?filter[field_name]=Value

## Structure

`Filter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `CreatedTs` | `String` | Optional | - | String getCreatedTs() | setCreatedTs(String createdTs) |
| `ModifiedTs` | `String` | Optional | - | String getModifiedTs() | setModifiedTs(String modifiedTs) |
| `ProductTransactionId` | `String` | Optional | - | String getProductTransactionId() | setProductTransactionId(String productTransactionId) |
| `ProcessingStatusId` | `String` | Optional | - | String getProcessingStatusId() | setProcessingStatusId(String processingStatusId) |
| `BatchNum` | `String` | Optional | - | String getBatchNum() | setBatchNum(String batchNum) |
| `IsOpen` | `String` | Optional | - | String getIsOpen() | setIsOpen(String isOpen) |
| `SettlementFileName` | `String` | Optional | - | String getSettlementFileName() | setSettlementFileName(String settlementFileName) |
| `BatchCloseTs` | `String` | Optional | - | String getBatchCloseTs() | setBatchCloseTs(String batchCloseTs) |
| `BatchCloseDetail` | `String` | Optional | - | String getBatchCloseDetail() | setBatchCloseDetail(String batchCloseDetail) |
| `TotalSaleAmount` | `String` | Optional | - | String getTotalSaleAmount() | setTotalSaleAmount(String totalSaleAmount) |
| `TotalSaleCount` | `String` | Optional | - | String getTotalSaleCount() | setTotalSaleCount(String totalSaleCount) |
| `TotalRefundAmount` | `String` | Optional | - | String getTotalRefundAmount() | setTotalRefundAmount(String totalRefundAmount) |
| `TotalRefundCount` | `String` | Optional | - | String getTotalRefundCount() | setTotalRefundCount(String totalRefundCount) |
| `TotalVoidAmount` | `String` | Optional | - | String getTotalVoidAmount() | setTotalVoidAmount(String totalVoidAmount) |
| `TotalVoidCount` | `String` | Optional | - | String getTotalVoidCount() | setTotalVoidCount(String totalVoidCount) |

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

