
# List

## Structure

`List`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Batch ID<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getId() | setId(String id) |
| `CreatedTs` | `LocalDateTime` | Required | Created Time Stamp | LocalDateTime getCreatedTs() | setCreatedTs(LocalDateTime createdTs) |
| `ModifiedTs` | `LocalDateTime` | Required | Modified Time Stamp | LocalDateTime getModifiedTs() | setModifiedTs(LocalDateTime modifiedTs) |
| `ProductTransactionId` | `String` | Optional | Product Transaction Id<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getProductTransactionId() | setProductTransactionId(String productTransactionId) |
| `ProcessingStatusId` | `double` | Required | Processing Status Id<br>**Constraints**: `>= 1`, `<= 5` | double getProcessingStatusId() | setProcessingStatusId(double processingStatusId) |
| `BatchNum` | `Double` | Optional | Batch Number | Double getBatchNum() | setBatchNum(Double batchNum) |
| `IsOpen` | `Double` | Optional | Is Open<br>**Constraints**: `>= 0`, `<= 1` | Double getIsOpen() | setIsOpen(Double isOpen) |
| `SettlementFileName` | `String` | Optional | Settlement File Name | String getSettlementFileName() | setSettlementFileName(String settlementFileName) |
| `BatchCloseTs` | `Double` | Optional | Batch Close Ts | Double getBatchCloseTs() | setBatchCloseTs(Double batchCloseTs) |
| `BatchCloseDetail` | `String` | Optional | Batch Close Detail | String getBatchCloseDetail() | setBatchCloseDetail(String batchCloseDetail) |
| `TotalSaleAmount` | `Double` | Optional | Total Sale Amount | Double getTotalSaleAmount() | setTotalSaleAmount(Double totalSaleAmount) |
| `TotalSaleCount` | `Double` | Optional | Total Sale Count | Double getTotalSaleCount() | setTotalSaleCount(Double totalSaleCount) |
| `TotalRefundAmount` | `Double` | Optional | Total Refund Amount | Double getTotalRefundAmount() | setTotalRefundAmount(Double totalRefundAmount) |
| `TotalRefundCount` | `Double` | Optional | Total Refund Count | Double getTotalRefundCount() | setTotalRefundCount(Double totalRefundCount) |
| `TotalVoidAmount` | `Double` | Optional | Total Void Amount | Double getTotalVoidAmount() | setTotalVoidAmount(Double totalVoidAmount) |
| `TotalVoidCount` | `Double` | Optional | Total Void Count | Double getTotalVoidCount() | setTotalVoidCount(Double totalVoidCount) |

## Example (as JSON)

```json
{
  "id": "11e95f8ec39de8fbdb0a4f1a",
  "created_ts": null,
  "modified_ts": null,
  "processing_status_id": 2
}
```

