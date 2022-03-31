
# Ui Prefs 1

Ui Prefs

## Structure

`UiPrefs1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EntryPage` | `String` | Required | Ui Prefs Entry Page | String getEntryPage() | setEntryPage(String entryPage) |
| `PageSize` | `Integer` | Required | Ui Prefs Page Size<br>**Constraints**: `>= 0`, `<= 99` | Integer getPageSize() | setPageSize(Integer pageSize) |
| `ReportExportType` | `Integer` | Required | Ui Prefs Export Type<br>**Constraints**: `>= 0`, `<= 99` | Integer getReportExportType() | setReportExportType(Integer reportExportType) |
| `ProcessMethod` | `Integer` | Required | Ui Prefs Process Method<br>**Constraints**: `>= 0`, `<= 99` | Integer getProcessMethod() | setProcessMethod(Integer processMethod) |
| `DefaultTerminal` | `String` | Required | Ui Prefs Default Termianl<br>**Constraints**: *Pattern*: `^(([0-9a-fA-F]{24})\|(([0-9a-fA-F]{8})-(([0-9a-fA-F]{4}\-){3})([0-9a-fA-F]{12})))$` | String getDefaultTerminal() | setDefaultTerminal(String defaultTerminal) |

## Example (as JSON)

```json
{
  "entry_page": "dashboard",
  "page_size": 2,
  "report_export_type": 99,
  "process_method": 99,
  "default_terminal": "11e95f8ec39de8fbdb0a4f1a"
}
```

