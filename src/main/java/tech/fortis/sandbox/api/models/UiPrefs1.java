/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UiPrefs1 type.
 */
public class UiPrefs1 {
    private String entryPage;
    private Integer pageSize;
    private Integer reportExportType;
    private Integer processMethod;
    private String defaultTerminal;

    /**
     * Default constructor.
     */
    public UiPrefs1() {
    }

    /**
     * Initialization constructor.
     * @param  entryPage  String value for entryPage.
     * @param  pageSize  Integer value for pageSize.
     * @param  reportExportType  Integer value for reportExportType.
     * @param  processMethod  Integer value for processMethod.
     * @param  defaultTerminal  String value for defaultTerminal.
     */
    public UiPrefs1(
            String entryPage,
            Integer pageSize,
            Integer reportExportType,
            Integer processMethod,
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
     * Getter for PageSize.
     * Ui Prefs Page Size
     * @return Returns the Integer
     */
    @JsonGetter("page_size")
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Setter for PageSize.
     * Ui Prefs Page Size
     * @param pageSize Value for Integer
     */
    @JsonSetter("page_size")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter for ReportExportType.
     * Ui Prefs Export Type
     * @return Returns the Integer
     */
    @JsonGetter("report_export_type")
    public Integer getReportExportType() {
        return reportExportType;
    }

    /**
     * Setter for ReportExportType.
     * Ui Prefs Export Type
     * @param reportExportType Value for Integer
     */
    @JsonSetter("report_export_type")
    public void setReportExportType(Integer reportExportType) {
        this.reportExportType = reportExportType;
    }

    /**
     * Getter for ProcessMethod.
     * Ui Prefs Process Method
     * @return Returns the Integer
     */
    @JsonGetter("process_method")
    public Integer getProcessMethod() {
        return processMethod;
    }

    /**
     * Setter for ProcessMethod.
     * Ui Prefs Process Method
     * @param processMethod Value for Integer
     */
    @JsonSetter("process_method")
    public void setProcessMethod(Integer processMethod) {
        this.processMethod = processMethod;
    }

    /**
     * Getter for DefaultTerminal.
     * Ui Prefs Default Termianl
     * @return Returns the String
     */
    @JsonGetter("default_terminal")
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
     * Converts this UiPrefs1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UiPrefs1 [" + "entryPage=" + entryPage + ", pageSize=" + pageSize
                + ", reportExportType=" + reportExportType + ", processMethod=" + processMethod
                + ", defaultTerminal=" + defaultTerminal + "]";
    }

    /**
     * Builds a new {@link UiPrefs1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UiPrefs1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(entryPage, pageSize, reportExportType, processMethod,
                defaultTerminal);
        return builder;
    }

    /**
     * Class to build instances of {@link UiPrefs1}.
     */
    public static class Builder {
        private String entryPage;
        private Integer pageSize;
        private Integer reportExportType;
        private Integer processMethod;
        private String defaultTerminal;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  entryPage  String value for entryPage.
         * @param  pageSize  Integer value for pageSize.
         * @param  reportExportType  Integer value for reportExportType.
         * @param  processMethod  Integer value for processMethod.
         * @param  defaultTerminal  String value for defaultTerminal.
         */
        public Builder(String entryPage, Integer pageSize, Integer reportExportType,
                Integer processMethod, String defaultTerminal) {
            this.entryPage = entryPage;
            this.pageSize = pageSize;
            this.reportExportType = reportExportType;
            this.processMethod = processMethod;
            this.defaultTerminal = defaultTerminal;
        }

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
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Setter for reportExportType.
         * @param  reportExportType  Integer value for reportExportType.
         * @return Builder
         */
        public Builder reportExportType(Integer reportExportType) {
            this.reportExportType = reportExportType;
            return this;
        }

        /**
         * Setter for processMethod.
         * @param  processMethod  Integer value for processMethod.
         * @return Builder
         */
        public Builder processMethod(Integer processMethod) {
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
         * Builds a new {@link UiPrefs1} object using the set fields.
         * @return {@link UiPrefs1}
         */
        public UiPrefs1 build() {
            return new UiPrefs1(entryPage, pageSize, reportExportType, processMethod,
                    defaultTerminal);
        }
    }
}