
# Ui Prefs

Ui Prefs

## Structure

`UiPrefs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EntryPage` | `String` | Optional | Ui Prefs Entry Page | String getEntryPage() | setEntryPage(String entryPage) |
| `PageSize` | `Integer` | Optional | Ui Prefs Page Size<br>**Constraints**: `>= 0`, `<= 99` | Integer getPageSize() | setPageSize(Integer pageSize) |
| `ReportExportType` | [`ReportExportTypeEnum`](../../doc/models/report-export-type-enum.md) | Optional | Ui Prefs Export Type | ReportExportTypeEnum getReportExportType() | setReportExportType(ReportExportTypeEnum reportExportType) |
| `ProcessMethod` | [`ProcessMethodEnum`](../../doc/models/process-method-enum.md) | Optional | Ui Prefs Process Method | ProcessMethodEnum getProcessMethod() | setProcessMethod(ProcessMethodEnum processMethod) |
| `DefaultTerminal` | `String` | Optional | Ui Prefs Default Termianl<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getDefaultTerminal() | setDefaultTerminal(String defaultTerminal) |

## Example (as JSON)

```json
{
  "entry_page": null,
  "page_size": null,
  "report_export_type": null,
  "process_method": null,
  "default_terminal": null
}
```

