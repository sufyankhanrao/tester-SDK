/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import tech.fortis.sandbox.api.internal.OptionalNullable;

/**
 * This is a model class for UiPrefs type.
 */
public class UiPrefs {
    private String entryPage;
    private OptionalNullable<Integer> pageSize;
    private ReportExportTypeEnum reportExportType;
    private ProcessMethodEnum processMethod;
    private String defaultTerminal;

    /**
     * Default constructor.
     */
    public UiPrefs() {
    }

    /**
     * Initialization constructor.
     * @param  entryPage  String value for entryPage.
     * @param  pageSize  Integer value for pageSize.
     * @param  reportExportType  ReportExportTypeEnum value for reportExportType.
     * @param  processMethod  ProcessMethodEnum value for processMethod.
     * @param  defaultTerminal  String value for defaultTerminal.
     */
    public UiPrefs(
            String entryPage,
            Integer pageSize,
            ReportExportTypeEnum reportExportType,
            ProcessMethodEnum processMethod,
            String defaultTerminal) {
        this.entryPage = entryPage;
        this.pageSize = OptionalNullable.of(pageSize);
        this.reportExportType = reportExportType;
        this.processMethod = processMethod;
        this.defaultTerminal = defaultTerminal;
    }

    /**
     * Internal initialization constructor.
     */
    protected UiPrefs(String entryPage, OptionalNullable<Integer> pageSize,
            ReportExportTypeEnum reportExportType, ProcessMethodEnum processMethod,
            String defaultTerminal) {
        this.entryPage = entryPage;
        this.pageSize = pageSize;
        this.reportExportType = reportExportType;
        this.processMethod = processMethod;
        this.defaultTerminal = defaultTerminal;
    }

    /**
     * Getter for EntryPage.
     * Ui Prefs Entry Page
     * @return Returns the String
     */
    @JsonGetter("entry_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEntryPage() {
        return entryPage;
    }

    /**
     * Setter for EntryPage.
     * Ui Prefs Entry Page
     * @param entryPage Value for String
     */
    @JsonSetter("entry_page")
    public void setEntryPage(String entryPage) {
        this.entryPage = entryPage;
    }

    /**
     * Internal Getter for PageSize.
     * Ui Prefs Page Size
     * @return Returns the Internal Integer
     */
    @JsonGetter("page_size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPageSize() {
        return this.pageSize;
    }

    /**
     * Getter for PageSize.
     * Ui Prefs Page Size
     * @return Returns the Integer
     */
    public Integer getPageSize() {
        return OptionalNullable.getFrom(pageSize);
    }

    /**
     * Setter for PageSize.
     * Ui Prefs Page Size
     * @param pageSize Value for Integer
     */
    @JsonSetter("page_size")
    public void setPageSize(Integer pageSize) {
        this.pageSize = OptionalNullable.of(pageSize);
    }

    /**
     * UnSetter for PageSize.
     * Ui Prefs Page Size
     */
    public void unsetPageSize() {
        pageSize = null;
    }

    /**
     * Getter for ReportExportType.
     * Ui Prefs Export Type
     * @return Returns the ReportExportTypeEnum
     */
    @JsonGetter("report_export_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReportExportTypeEnum getReportExportType() {
        return reportExportType;
    }

    /**
     * Setter for ReportExportType.
     * Ui Prefs Export Type
     * @param reportExportType Value for ReportExportTypeEnum
     */
    @JsonSetter("report_export_type")
    public void setReportExportType(ReportExportTypeEnum reportExportType) {
        this.reportExportType = reportExportType;
    }

    /**
     * Getter for ProcessMethod.
     * Ui Prefs Process Method
     * @return Returns the ProcessMethodEnum
     */
    @JsonGetter("process_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessMethodEnum getProcessMethod() {
        return processMethod;
    }

    /**
     * Setter for ProcessMethod.
     * Ui Prefs Process Method
     * @param processMethod Value for ProcessMethodEnum
     */
    @JsonSetter("process_method")
    public void setProcessMethod(ProcessMethodEnum processMethod) {
        this.processMethod = processMethod;
    }

    /**
     * Getter for DefaultTerminal.
     * Ui Prefs Default Termianl
     * @return Returns the String
     */
    @JsonGetter("default_terminal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultTerminal() {
        return defaultTerminal;
    }

    /**
     * Setter for DefaultTerminal.
     * Ui Prefs Default Termianl
     * @param defaultTerminal Value for String
     */
    @JsonSetter("default_terminal")
    public void setDefaultTerminal(String defaultTerminal) {
        this.defaultTerminal = defaultTerminal;
    }

    /**
     * Converts this UiPrefs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UiPrefs [" + "entryPage=" + entryPage + ", pageSize=" + pageSize
                + ", reportExportType=" + reportExportType + ", processMethod=" + processMethod
                + ", defaultTerminal=" + defaultTerminal + "]";
    }

    /**
     * Builds a new {@link UiPrefs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UiPrefs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .entryPage(getEntryPage())
                .reportExportType(getReportExportType())
                .processMethod(getProcessMethod())
                .defaultTerminal(getDefaultTerminal());
        builder.pageSize = internalGetPageSize();
        return builder;
    }

    /**
     * Class to build instances of {@link UiPrefs}.
     */
    public static class Builder {
        private String entryPage;
        private OptionalNullable<Integer> pageSize;
        private ReportExportTypeEnum reportExportType;
        private ProcessMethodEnum processMethod;
        private String defaultTerminal;



        /**
         * Setter for entryPage.
         * @param  entryPage  String value for entryPage.
         * @return Builder
         */
        public Builder entryPage(String entryPage) {
            this.entryPage = entryPage;
            return this;
        }

        /**
         * Setter for pageSize.
         * @param  pageSize  Integer value for pageSize.
         * @return Builder
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = OptionalNullable.of(pageSize);
            return this;
        }

        /**
         * UnSetter for pageSize.
         * @return Builder
         */
        public Builder unsetPageSize() {
            pageSize = null;
            return this;
        }

        /**
         * Setter for reportExportType.
         * @param  reportExportType  ReportExportTypeEnum value for reportExportType.
         * @return Builder
         */
        public Builder reportExportType(ReportExportTypeEnum reportExportType) {
            this.reportExportType = reportExportType;
            return this;
        }

        /**
         * Setter for processMethod.
         * @param  processMethod  ProcessMethodEnum value for processMethod.
         * @return Builder
         */
        public Builder processMethod(ProcessMethodEnum processMethod) {
            this.processMethod = processMethod;
            return this;
        }

        /**
         * Setter for defaultTerminal.
         * @param  defaultTerminal  String value for defaultTerminal.
         * @return Builder
         */
        public Builder defaultTerminal(String defaultTerminal) {
            this.defaultTerminal = defaultTerminal;
            return this;
        }

        /**
         * Builds a new {@link UiPrefs} object using the set fields.
         * @return {@link UiPrefs}
         */
        public UiPrefs build() {
            return new UiPrefs(entryPage, pageSize, reportExportType, processMethod,
                    defaultTerminal);
        }
    }
}
