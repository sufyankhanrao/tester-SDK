/*
 * FortisAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package tech.fortis.sandbox.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Sort4 type.
 */
public class Sort4 {
    private BrandingDomainUrlEnum brandingDomainUrl;
    private CreatedTsEnum createdTs;
    private IdEnum id;
    private ModifiedTsEnum modifiedTs;
    private AbaEnum aba;
    private AccountNumberEnum accountNumber;
    private AddressEnum address1;
    private AddressEnum address2;
    private BrandingDomainIdEnum brandingDomainId;
    private CityEnum city;
    private ContactEmailTrxReceiptDefaultEnum contactEmailTrxReceiptDefault;
    private DdaEnum dda;
    private DefaultAchEnum defaultAch;
    private DefaultCcEnum defaultCc;
    private DeveloperCompanyIdEnum developerCompanyId;
    private EmailReplyToEnum emailReplyTo;
    private FaxEnum fax;
    private LocationApiIdEnum locationApiId;
    private LocationApiKeyEnum locationApiKey;
    private LocationC1Enum locationC1;
    private LocationC1Enum locationC2;
    private LocationC1Enum locationC3;
    private NameEnum name;
    private OfficePhoneEnum officePhone;
    private OfficeExtPhoneEnum officeExtPhone;
    private ParentIdEnum parentId;
    private RecurringNotificationDaysDefaultEnum recurringNotificationDaysDefault;
    private ShowContactFilesEnum showContactFiles;
    private ShowContactNotesEnum showContactNotes;
    private StateEnum state;
    private TicketHashKeyEnum ticketHashKey;
    private TzEnum tz;
    private ZipCodeEnum zipCode;

    /**
     * Default constructor.
     */
    public Sort4() {
    }

    /**
     * Initialization constructor.
     * @param  brandingDomainUrl  BrandingDomainUrlEnum value for brandingDomainUrl.
     * @param  createdTs  CreatedTsEnum value for createdTs.
     * @param  id  IdEnum value for id.
     * @param  modifiedTs  ModifiedTsEnum value for modifiedTs.
     * @param  aba  AbaEnum value for aba.
     * @param  accountNumber  AccountNumberEnum value for accountNumber.
     * @param  address1  AddressEnum value for address1.
     * @param  address2  AddressEnum value for address2.
     * @param  brandingDomainId  BrandingDomainIdEnum value for brandingDomainId.
     * @param  city  CityEnum value for city.
     * @param  contactEmailTrxReceiptDefault  ContactEmailTrxReceiptDefaultEnum value for
     *         contactEmailTrxReceiptDefault.
     * @param  dda  DdaEnum value for dda.
     * @param  defaultAch  DefaultAchEnum value for defaultAch.
     * @param  defaultCc  DefaultCcEnum value for defaultCc.
     * @param  developerCompanyId  DeveloperCompanyIdEnum value for developerCompanyId.
     * @param  emailReplyTo  EmailReplyToEnum value for emailReplyTo.
     * @param  fax  FaxEnum value for fax.
     * @param  locationApiId  LocationApiIdEnum value for locationApiId.
     * @param  locationApiKey  LocationApiKeyEnum value for locationApiKey.
     * @param  locationC1  LocationC1Enum value for locationC1.
     * @param  locationC2  LocationC1Enum value for locationC2.
     * @param  locationC3  LocationC1Enum value for locationC3.
     * @param  name  NameEnum value for name.
     * @param  officePhone  OfficePhoneEnum value for officePhone.
     * @param  officeExtPhone  OfficeExtPhoneEnum value for officeExtPhone.
     * @param  parentId  ParentIdEnum value for parentId.
     * @param  recurringNotificationDaysDefault  RecurringNotificationDaysDefaultEnum value for
     *         recurringNotificationDaysDefault.
     * @param  showContactFiles  ShowContactFilesEnum value for showContactFiles.
     * @param  showContactNotes  ShowContactNotesEnum value for showContactNotes.
     * @param  state  StateEnum value for state.
     * @param  ticketHashKey  TicketHashKeyEnum value for ticketHashKey.
     * @param  tz  TzEnum value for tz.
     * @param  zipCode  ZipCodeEnum value for zipCode.
     */
    public Sort4(
            BrandingDomainUrlEnum brandingDomainUrl,
            CreatedTsEnum createdTs,
            IdEnum id,
            ModifiedTsEnum modifiedTs,
            AbaEnum aba,
            AccountNumberEnum accountNumber,
            AddressEnum address1,
            AddressEnum address2,
            BrandingDomainIdEnum brandingDomainId,
            CityEnum city,
            ContactEmailTrxReceiptDefaultEnum contactEmailTrxReceiptDefault,
            DdaEnum dda,
            DefaultAchEnum defaultAch,
            DefaultCcEnum defaultCc,
            DeveloperCompanyIdEnum developerCompanyId,
            EmailReplyToEnum emailReplyTo,
            FaxEnum fax,
            LocationApiIdEnum locationApiId,
            LocationApiKeyEnum locationApiKey,
            LocationC1Enum locationC1,
            LocationC1Enum locationC2,
            LocationC1Enum locationC3,
            NameEnum name,
            OfficePhoneEnum officePhone,
            OfficeExtPhoneEnum officeExtPhone,
            ParentIdEnum parentId,
            RecurringNotificationDaysDefaultEnum recurringNotificationDaysDefault,
            ShowContactFilesEnum showContactFiles,
            ShowContactNotesEnum showContactNotes,
            StateEnum state,
            TicketHashKeyEnum ticketHashKey,
            TzEnum tz,
            ZipCodeEnum zipCode) {
        this.brandingDomainUrl = brandingDomainUrl;
        this.createdTs = createdTs;
        this.id = id;
        this.modifiedTs = modifiedTs;
        this.aba = aba;
        this.accountNumber = accountNumber;
        this.address1 = address1;
        this.address2 = address2;
        this.brandingDomainId = brandingDomainId;
        this.city = city;
        this.contactEmailTrxReceiptDefault = contactEmailTrxReceiptDefault;
        this.dda = dda;
        this.defaultAch = defaultAch;
        this.defaultCc = defaultCc;
        this.developerCompanyId = developerCompanyId;
        this.emailReplyTo = emailReplyTo;
        this.fax = fax;
        this.locationApiId = locationApiId;
        this.locationApiKey = locationApiKey;
        this.locationC1 = locationC1;
        this.locationC2 = locationC2;
        this.locationC3 = locationC3;
        this.name = name;
        this.officePhone = officePhone;
        this.officeExtPhone = officeExtPhone;
        this.parentId = parentId;
        this.recurringNotificationDaysDefault = recurringNotificationDaysDefault;
        this.showContactFiles = showContactFiles;
        this.showContactNotes = showContactNotes;
        this.state = state;
        this.ticketHashKey = ticketHashKey;
        this.tz = tz;
        this.zipCode = zipCode;
    }

    /**
     * Getter for BrandingDomainUrl.
     * @return Returns the BrandingDomainUrlEnum
     */
    @JsonGetter("branding_domain_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BrandingDomainUrlEnum getBrandingDomainUrl() {
        return brandingDomainUrl;
    }

    /**
     * Setter for BrandingDomainUrl.
     * @param brandingDomainUrl Value for BrandingDomainUrlEnum
     */
    @JsonSetter("branding_domain_url")
    public void setBrandingDomainUrl(BrandingDomainUrlEnum brandingDomainUrl) {
        this.brandingDomainUrl = brandingDomainUrl;
    }

    /**
     * Getter for CreatedTs.
     * @return Returns the CreatedTsEnum
     */
    @JsonGetter("created_ts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatedTsEnum getCreatedTs() {
        return createdTs;
    }

    /**
     * Setter for CreatedTs.
     * @param createdTs Value for CreatedTsEnum
     */
    @JsonSetter("created_ts")
    public void setCreatedTs(CreatedTsEnum createdTs) {
        this.createdTs = createdTs;
    }

    /**
     * Getter for Id.
     * @return Returns the IdEnum
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IdEnum getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for IdEnum
     */
    @JsonSetter("id")
    public void setId(IdEnum id) {
        this.id = id;
    }

    /**
     * Getter for ModifiedTs.
     * @return Returns the ModifiedTsEnum
     */
    @JsonGetter("modified_ts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ModifiedTsEnum getModifiedTs() {
        return modifiedTs;
    }

    /**
     * Setter for ModifiedTs.
     * @param modifiedTs Value for ModifiedTsEnum
     */
    @JsonSetter("modified_ts")
    public void setModifiedTs(ModifiedTsEnum modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    /**
     * Getter for Aba.
     * @return Returns the AbaEnum
     */
    @JsonGetter("aba")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AbaEnum getAba() {
        return aba;
    }

    /**
     * Setter for Aba.
     * @param aba Value for AbaEnum
     */
    @JsonSetter("aba")
    public void setAba(AbaEnum aba) {
        this.aba = aba;
    }

    /**
     * Getter for AccountNumber.
     * @return Returns the AccountNumberEnum
     */
    @JsonGetter("account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountNumberEnum getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * @param accountNumber Value for AccountNumberEnum
     */
    @JsonSetter("account_number")
    public void setAccountNumber(AccountNumberEnum accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for Address1.
     * @return Returns the AddressEnum
     */
    @JsonGetter("address1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddressEnum getAddress1() {
        return address1;
    }

    /**
     * Setter for Address1.
     * @param address1 Value for AddressEnum
     */
    @JsonSetter("address1")
    public void setAddress1(AddressEnum address1) {
        this.address1 = address1;
    }

    /**
     * Getter for Address2.
     * @return Returns the AddressEnum
     */
    @JsonGetter("address2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddressEnum getAddress2() {
        return address2;
    }

    /**
     * Setter for Address2.
     * @param address2 Value for AddressEnum
     */
    @JsonSetter("address2")
    public void setAddress2(AddressEnum address2) {
        this.address2 = address2;
    }

    /**
     * Getter for BrandingDomainId.
     * @return Returns the BrandingDomainIdEnum
     */
    @JsonGetter("branding_domain_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BrandingDomainIdEnum getBrandingDomainId() {
        return brandingDomainId;
    }

    /**
     * Setter for BrandingDomainId.
     * @param brandingDomainId Value for BrandingDomainIdEnum
     */
    @JsonSetter("branding_domain_id")
    public void setBrandingDomainId(BrandingDomainIdEnum brandingDomainId) {
        this.brandingDomainId = brandingDomainId;
    }

    /**
     * Getter for City.
     * @return Returns the CityEnum
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CityEnum getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for CityEnum
     */
    @JsonSetter("city")
    public void setCity(CityEnum city) {
        this.city = city;
    }

    /**
     * Getter for ContactEmailTrxReceiptDefault.
     * @return Returns the ContactEmailTrxReceiptDefaultEnum
     */
    @JsonGetter("contact_email_trx_receipt_default")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ContactEmailTrxReceiptDefaultEnum getContactEmailTrxReceiptDefault() {
        return contactEmailTrxReceiptDefault;
    }

    /**
     * Setter for ContactEmailTrxReceiptDefault.
     * @param contactEmailTrxReceiptDefault Value for ContactEmailTrxReceiptDefaultEnum
     */
    @JsonSetter("contact_email_trx_receipt_default")
    public void setContactEmailTrxReceiptDefault(ContactEmailTrxReceiptDefaultEnum contactEmailTrxReceiptDefault) {
        this.contactEmailTrxReceiptDefault = contactEmailTrxReceiptDefault;
    }

    /**
     * Getter for Dda.
     * @return Returns the DdaEnum
     */
    @JsonGetter("dda")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DdaEnum getDda() {
        return dda;
    }

    /**
     * Setter for Dda.
     * @param dda Value for DdaEnum
     */
    @JsonSetter("dda")
    public void setDda(DdaEnum dda) {
        this.dda = dda;
    }

    /**
     * Getter for DefaultAch.
     * @return Returns the DefaultAchEnum
     */
    @JsonGetter("default_ach")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DefaultAchEnum getDefaultAch() {
        return defaultAch;
    }

    /**
     * Setter for DefaultAch.
     * @param defaultAch Value for DefaultAchEnum
     */
    @JsonSetter("default_ach")
    public void setDefaultAch(DefaultAchEnum defaultAch) {
        this.defaultAch = defaultAch;
    }

    /**
     * Getter for DefaultCc.
     * @return Returns the DefaultCcEnum
     */
    @JsonGetter("default_cc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DefaultCcEnum getDefaultCc() {
        return defaultCc;
    }

    /**
     * Setter for DefaultCc.
     * @param defaultCc Value for DefaultCcEnum
     */
    @JsonSetter("default_cc")
    public void setDefaultCc(DefaultCcEnum defaultCc) {
        this.defaultCc = defaultCc;
    }

    /**
     * Getter for DeveloperCompanyId.
     * @return Returns the DeveloperCompanyIdEnum
     */
    @JsonGetter("developer_company_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeveloperCompanyIdEnum getDeveloperCompanyId() {
        return developerCompanyId;
    }

    /**
     * Setter for DeveloperCompanyId.
     * @param developerCompanyId Value for DeveloperCompanyIdEnum
     */
    @JsonSetter("developer_company_id")
    public void setDeveloperCompanyId(DeveloperCompanyIdEnum developerCompanyId) {
        this.developerCompanyId = developerCompanyId;
    }

    /**
     * Getter for EmailReplyTo.
     * @return Returns the EmailReplyToEnum
     */
    @JsonGetter("email_reply_to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EmailReplyToEnum getEmailReplyTo() {
        return emailReplyTo;
    }

    /**
     * Setter for EmailReplyTo.
     * @param emailReplyTo Value for EmailReplyToEnum
     */
    @JsonSetter("email_reply_to")
    public void setEmailReplyTo(EmailReplyToEnum emailReplyTo) {
        this.emailReplyTo = emailReplyTo;
    }

    /**
     * Getter for Fax.
     * @return Returns the FaxEnum
     */
    @JsonGetter("fax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FaxEnum getFax() {
        return fax;
    }

    /**
     * Setter for Fax.
     * @param fax Value for FaxEnum
     */
    @JsonSetter("fax")
    public void setFax(FaxEnum fax) {
        this.fax = fax;
    }

    /**
     * Getter for LocationApiId.
     * @return Returns the LocationApiIdEnum
     */
    @JsonGetter("location_api_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocationApiIdEnum getLocationApiId() {
        return locationApiId;
    }

    /**
     * Setter for LocationApiId.
     * @param locationApiId Value for LocationApiIdEnum
     */
    @JsonSetter("location_api_id")
    public void setLocationApiId(LocationApiIdEnum locationApiId) {
        this.locationApiId = locationApiId;
    }

    /**
     * Getter for LocationApiKey.
     * @return Returns the LocationApiKeyEnum
     */
    @JsonGetter("location_api_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocationApiKeyEnum getLocationApiKey() {
        return locationApiKey;
    }

    /**
     * Setter for LocationApiKey.
     * @param locationApiKey Value for LocationApiKeyEnum
     */
    @JsonSetter("location_api_key")
    public void setLocationApiKey(LocationApiKeyEnum locationApiKey) {
        this.locationApiKey = locationApiKey;
    }

    /**
     * Getter for LocationC1.
     * @return Returns the LocationC1Enum
     */
    @JsonGetter("location_c1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocationC1Enum getLocationC1() {
        return locationC1;
    }

    /**
     * Setter for LocationC1.
     * @param locationC1 Value for LocationC1Enum
     */
    @JsonSetter("location_c1")
    public void setLocationC1(LocationC1Enum locationC1) {
        this.locationC1 = locationC1;
    }

    /**
     * Getter for LocationC2.
     * @return Returns the LocationC1Enum
     */
    @JsonGetter("location_c2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocationC1Enum getLocationC2() {
        return locationC2;
    }

    /**
     * Setter for LocationC2.
     * @param locationC2 Value for LocationC1Enum
     */
    @JsonSetter("location_c2")
    public void setLocationC2(LocationC1Enum locationC2) {
        this.locationC2 = locationC2;
    }

    /**
     * Getter for LocationC3.
     * @return Returns the LocationC1Enum
     */
    @JsonGetter("location_c3")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocationC1Enum getLocationC3() {
        return locationC3;
    }

    /**
     * Setter for LocationC3.
     * @param locationC3 Value for LocationC1Enum
     */
    @JsonSetter("location_c3")
    public void setLocationC3(LocationC1Enum locationC3) {
        this.locationC3 = locationC3;
    }

    /**
     * Getter for Name.
     * @return Returns the NameEnum
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NameEnum getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for NameEnum
     */
    @JsonSetter("name")
    public void setName(NameEnum name) {
        this.name = name;
    }

    /**
     * Getter for OfficePhone.
     * @return Returns the OfficePhoneEnum
     */
    @JsonGetter("office_phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OfficePhoneEnum getOfficePhone() {
        return officePhone;
    }

    /**
     * Setter for OfficePhone.
     * @param officePhone Value for OfficePhoneEnum
     */
    @JsonSetter("office_phone")
    public void setOfficePhone(OfficePhoneEnum officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * Getter for OfficeExtPhone.
     * @return Returns the OfficeExtPhoneEnum
     */
    @JsonGetter("office_ext_phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OfficeExtPhoneEnum getOfficeExtPhone() {
        return officeExtPhone;
    }

    /**
     * Setter for OfficeExtPhone.
     * @param officeExtPhone Value for OfficeExtPhoneEnum
     */
    @JsonSetter("office_ext_phone")
    public void setOfficeExtPhone(OfficeExtPhoneEnum officeExtPhone) {
        this.officeExtPhone = officeExtPhone;
    }

    /**
     * Getter for ParentId.
     * @return Returns the ParentIdEnum
     */
    @JsonGetter("parent_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ParentIdEnum getParentId() {
        return parentId;
    }

    /**
     * Setter for ParentId.
     * @param parentId Value for ParentIdEnum
     */
    @JsonSetter("parent_id")
    public void setParentId(ParentIdEnum parentId) {
        this.parentId = parentId;
    }

    /**
     * Getter for RecurringNotificationDaysDefault.
     * @return Returns the RecurringNotificationDaysDefaultEnum
     */
    @JsonGetter("recurring_notification_days_default")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RecurringNotificationDaysDefaultEnum getRecurringNotificationDaysDefault() {
        return recurringNotificationDaysDefault;
    }

    /**
     * Setter for RecurringNotificationDaysDefault.
     * @param recurringNotificationDaysDefault Value for RecurringNotificationDaysDefaultEnum
     */
    @JsonSetter("recurring_notification_days_default")
    public void setRecurringNotificationDaysDefault(RecurringNotificationDaysDefaultEnum recurringNotificationDaysDefault) {
        this.recurringNotificationDaysDefault = recurringNotificationDaysDefault;
    }

    /**
     * Getter for ShowContactFiles.
     * @return Returns the ShowContactFilesEnum
     */
    @JsonGetter("show_contact_files")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShowContactFilesEnum getShowContactFiles() {
        return showContactFiles;
    }

    /**
     * Setter for ShowContactFiles.
     * @param showContactFiles Value for ShowContactFilesEnum
     */
    @JsonSetter("show_contact_files")
    public void setShowContactFiles(ShowContactFilesEnum showContactFiles) {
        this.showContactFiles = showContactFiles;
    }

    /**
     * Getter for ShowContactNotes.
     * @return Returns the ShowContactNotesEnum
     */
    @JsonGetter("show_contact_notes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShowContactNotesEnum getShowContactNotes() {
        return showContactNotes;
    }

    /**
     * Setter for ShowContactNotes.
     * @param showContactNotes Value for ShowContactNotesEnum
     */
    @JsonSetter("show_contact_notes")
    public void setShowContactNotes(ShowContactNotesEnum showContactNotes) {
        this.showContactNotes = showContactNotes;
    }

    /**
     * Getter for State.
     * @return Returns the StateEnum
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StateEnum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for StateEnum
     */
    @JsonSetter("state")
    public void setState(StateEnum state) {
        this.state = state;
    }

    /**
     * Getter for TicketHashKey.
     * @return Returns the TicketHashKeyEnum
     */
    @JsonGetter("ticket_hash_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TicketHashKeyEnum getTicketHashKey() {
        return ticketHashKey;
    }

    /**
     * Setter for TicketHashKey.
     * @param ticketHashKey Value for TicketHashKeyEnum
     */
    @JsonSetter("ticket_hash_key")
    public void setTicketHashKey(TicketHashKeyEnum ticketHashKey) {
        this.ticketHashKey = ticketHashKey;
    }

    /**
     * Getter for Tz.
     * @return Returns the TzEnum
     */
    @JsonGetter("tz")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TzEnum getTz() {
        return tz;
    }

    /**
     * Setter for Tz.
     * @param tz Value for TzEnum
     */
    @JsonSetter("tz")
    public void setTz(TzEnum tz) {
        this.tz = tz;
    }

    /**
     * Getter for ZipCode.
     * @return Returns the ZipCodeEnum
     */
    @JsonGetter("zip_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ZipCodeEnum getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * @param zipCode Value for ZipCodeEnum
     */
    @JsonSetter("zip_code")
    public void setZipCode(ZipCodeEnum zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Converts this Sort4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Sort4 [" + "brandingDomainUrl=" + brandingDomainUrl + ", createdTs=" + createdTs
                + ", id=" + id + ", modifiedTs=" + modifiedTs + ", aba=" + aba + ", accountNumber="
                + accountNumber + ", address1=" + address1 + ", address2=" + address2
                + ", brandingDomainId=" + brandingDomainId + ", city=" + city
                + ", contactEmailTrxReceiptDefault=" + contactEmailTrxReceiptDefault + ", dda="
                + dda + ", defaultAch=" + defaultAch + ", defaultCc=" + defaultCc
                + ", developerCompanyId=" + developerCompanyId + ", emailReplyTo=" + emailReplyTo
                + ", fax=" + fax + ", locationApiId=" + locationApiId + ", locationApiKey="
                + locationApiKey + ", locationC1=" + locationC1 + ", locationC2=" + locationC2
                + ", locationC3=" + locationC3 + ", name=" + name + ", officePhone=" + officePhone
                + ", officeExtPhone=" + officeExtPhone + ", parentId=" + parentId
                + ", recurringNotificationDaysDefault=" + recurringNotificationDaysDefault
                + ", showContactFiles=" + showContactFiles + ", showContactNotes="
                + showContactNotes + ", state=" + state + ", ticketHashKey=" + ticketHashKey
                + ", tz=" + tz + ", zipCode=" + zipCode + "]";
    }

    /**
     * Builds a new {@link Sort4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Sort4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandingDomainUrl(getBrandingDomainUrl())
                .createdTs(getCreatedTs())
                .id(getId())
                .modifiedTs(getModifiedTs())
                .aba(getAba())
                .accountNumber(getAccountNumber())
                .address1(getAddress1())
                .address2(getAddress2())
                .brandingDomainId(getBrandingDomainId())
                .city(getCity())
                .contactEmailTrxReceiptDefault(getContactEmailTrxReceiptDefault())
                .dda(getDda())
                .defaultAch(getDefaultAch())
                .defaultCc(getDefaultCc())
                .developerCompanyId(getDeveloperCompanyId())
                .emailReplyTo(getEmailReplyTo())
                .fax(getFax())
                .locationApiId(getLocationApiId())
                .locationApiKey(getLocationApiKey())
                .locationC1(getLocationC1())
                .locationC2(getLocationC2())
                .locationC3(getLocationC3())
                .name(getName())
                .officePhone(getOfficePhone())
                .officeExtPhone(getOfficeExtPhone())
                .parentId(getParentId())
                .recurringNotificationDaysDefault(getRecurringNotificationDaysDefault())
                .showContactFiles(getShowContactFiles())
                .showContactNotes(getShowContactNotes())
                .state(getState())
                .ticketHashKey(getTicketHashKey())
                .tz(getTz())
                .zipCode(getZipCode());
        return builder;
    }

    /**
     * Class to build instances of {@link Sort4}.
     */
    public static class Builder {
        private BrandingDomainUrlEnum brandingDomainUrl;
        private CreatedTsEnum createdTs;
        private IdEnum id;
        private ModifiedTsEnum modifiedTs;
        private AbaEnum aba;
        private AccountNumberEnum accountNumber;
        private AddressEnum address1;
        private AddressEnum address2;
        private BrandingDomainIdEnum brandingDomainId;
        private CityEnum city;
        private ContactEmailTrxReceiptDefaultEnum contactEmailTrxReceiptDefault;
        private DdaEnum dda;
        private DefaultAchEnum defaultAch;
        private DefaultCcEnum defaultCc;
        private DeveloperCompanyIdEnum developerCompanyId;
        private EmailReplyToEnum emailReplyTo;
        private FaxEnum fax;
        private LocationApiIdEnum locationApiId;
        private LocationApiKeyEnum locationApiKey;
        private LocationC1Enum locationC1;
        private LocationC1Enum locationC2;
        private LocationC1Enum locationC3;
        private NameEnum name;
        private OfficePhoneEnum officePhone;
        private OfficeExtPhoneEnum officeExtPhone;
        private ParentIdEnum parentId;
        private RecurringNotificationDaysDefaultEnum recurringNotificationDaysDefault;
        private ShowContactFilesEnum showContactFiles;
        private ShowContactNotesEnum showContactNotes;
        private StateEnum state;
        private TicketHashKeyEnum ticketHashKey;
        private TzEnum tz;
        private ZipCodeEnum zipCode;



        /**
         * Setter for brandingDomainUrl.
         * @param  brandingDomainUrl  BrandingDomainUrlEnum value for brandingDomainUrl.
         * @return Builder
         */
        public Builder brandingDomainUrl(BrandingDomainUrlEnum brandingDomainUrl) {
            this.brandingDomainUrl = brandingDomainUrl;
            return this;
        }

        /**
         * Setter for createdTs.
         * @param  createdTs  CreatedTsEnum value for createdTs.
         * @return Builder
         */
        public Builder createdTs(CreatedTsEnum createdTs) {
            this.createdTs = createdTs;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  IdEnum value for id.
         * @return Builder
         */
        public Builder id(IdEnum id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for modifiedTs.
         * @param  modifiedTs  ModifiedTsEnum value for modifiedTs.
         * @return Builder
         */
        public Builder modifiedTs(ModifiedTsEnum modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }

        /**
         * Setter for aba.
         * @param  aba  AbaEnum value for aba.
         * @return Builder
         */
        public Builder aba(AbaEnum aba) {
            this.aba = aba;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  AccountNumberEnum value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(AccountNumberEnum accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Setter for address1.
         * @param  address1  AddressEnum value for address1.
         * @return Builder
         */
        public Builder address1(AddressEnum address1) {
            this.address1 = address1;
            return this;
        }

        /**
         * Setter for address2.
         * @param  address2  AddressEnum value for address2.
         * @return Builder
         */
        public Builder address2(AddressEnum address2) {
            this.address2 = address2;
            return this;
        }

        /**
         * Setter for brandingDomainId.
         * @param  brandingDomainId  BrandingDomainIdEnum value for brandingDomainId.
         * @return Builder
         */
        public Builder brandingDomainId(BrandingDomainIdEnum brandingDomainId) {
            this.brandingDomainId = brandingDomainId;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  CityEnum value for city.
         * @return Builder
         */
        public Builder city(CityEnum city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for contactEmailTrxReceiptDefault.
         * @param  contactEmailTrxReceiptDefault  ContactEmailTrxReceiptDefaultEnum value for
         *         contactEmailTrxReceiptDefault.
         * @return Builder
         */
        public Builder contactEmailTrxReceiptDefault(
                ContactEmailTrxReceiptDefaultEnum contactEmailTrxReceiptDefault) {
            this.contactEmailTrxReceiptDefault = contactEmailTrxReceiptDefault;
            return this;
        }

        /**
         * Setter for dda.
         * @param  dda  DdaEnum value for dda.
         * @return Builder
         */
        public Builder dda(DdaEnum dda) {
            this.dda = dda;
            return this;
        }

        /**
         * Setter for defaultAch.
         * @param  defaultAch  DefaultAchEnum value for defaultAch.
         * @return Builder
         */
        public Builder defaultAch(DefaultAchEnum defaultAch) {
            this.defaultAch = defaultAch;
            return this;
        }

        /**
         * Setter for defaultCc.
         * @param  defaultCc  DefaultCcEnum value for defaultCc.
         * @return Builder
         */
        public Builder defaultCc(DefaultCcEnum defaultCc) {
            this.defaultCc = defaultCc;
            return this;
        }

        /**
         * Setter for developerCompanyId.
         * @param  developerCompanyId  DeveloperCompanyIdEnum value for developerCompanyId.
         * @return Builder
         */
        public Builder developerCompanyId(DeveloperCompanyIdEnum developerCompanyId) {
            this.developerCompanyId = developerCompanyId;
            return this;
        }

        /**
         * Setter for emailReplyTo.
         * @param  emailReplyTo  EmailReplyToEnum value for emailReplyTo.
         * @return Builder
         */
        public Builder emailReplyTo(EmailReplyToEnum emailReplyTo) {
            this.emailReplyTo = emailReplyTo;
            return this;
        }

        /**
         * Setter for fax.
         * @param  fax  FaxEnum value for fax.
         * @return Builder
         */
        public Builder fax(FaxEnum fax) {
            this.fax = fax;
            return this;
        }

        /**
         * Setter for locationApiId.
         * @param  locationApiId  LocationApiIdEnum value for locationApiId.
         * @return Builder
         */
        public Builder locationApiId(LocationApiIdEnum locationApiId) {
            this.locationApiId = locationApiId;
            return this;
        }

        /**
         * Setter for locationApiKey.
         * @param  locationApiKey  LocationApiKeyEnum value for locationApiKey.
         * @return Builder
         */
        public Builder locationApiKey(LocationApiKeyEnum locationApiKey) {
            this.locationApiKey = locationApiKey;
            return this;
        }

        /**
         * Setter for locationC1.
         * @param  locationC1  LocationC1Enum value for locationC1.
         * @return Builder
         */
        public Builder locationC1(LocationC1Enum locationC1) {
            this.locationC1 = locationC1;
            return this;
        }

        /**
         * Setter for locationC2.
         * @param  locationC2  LocationC1Enum value for locationC2.
         * @return Builder
         */
        public Builder locationC2(LocationC1Enum locationC2) {
            this.locationC2 = locationC2;
            return this;
        }

        /**
         * Setter for locationC3.
         * @param  locationC3  LocationC1Enum value for locationC3.
         * @return Builder
         */
        public Builder locationC3(LocationC1Enum locationC3) {
            this.locationC3 = locationC3;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  NameEnum value for name.
         * @return Builder
         */
        public Builder name(NameEnum name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for officePhone.
         * @param  officePhone  OfficePhoneEnum value for officePhone.
         * @return Builder
         */
        public Builder officePhone(OfficePhoneEnum officePhone) {
            this.officePhone = officePhone;
            return this;
        }

        /**
         * Setter for officeExtPhone.
         * @param  officeExtPhone  OfficeExtPhoneEnum value for officeExtPhone.
         * @return Builder
         */
        public Builder officeExtPhone(OfficeExtPhoneEnum officeExtPhone) {
            this.officeExtPhone = officeExtPhone;
            return this;
        }

        /**
         * Setter for parentId.
         * @param  parentId  ParentIdEnum value for parentId.
         * @return Builder
         */
        public Builder parentId(ParentIdEnum parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * Setter for recurringNotificationDaysDefault.
         * @param  recurringNotificationDaysDefault  RecurringNotificationDaysDefaultEnum value for
         *         recurringNotificationDaysDefault.
         * @return Builder
         */
        public Builder recurringNotificationDaysDefault(
                RecurringNotificationDaysDefaultEnum recurringNotificationDaysDefault) {
            this.recurringNotificationDaysDefault = recurringNotificationDaysDefault;
            return this;
        }

        /**
         * Setter for showContactFiles.
         * @param  showContactFiles  ShowContactFilesEnum value for showContactFiles.
         * @return Builder
         */
        public Builder showContactFiles(ShowContactFilesEnum showContactFiles) {
            this.showContactFiles = showContactFiles;
            return this;
        }

        /**
         * Setter for showContactNotes.
         * @param  showContactNotes  ShowContactNotesEnum value for showContactNotes.
         * @return Builder
         */
        public Builder showContactNotes(ShowContactNotesEnum showContactNotes) {
            this.showContactNotes = showContactNotes;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  StateEnum value for state.
         * @return Builder
         */
        public Builder state(StateEnum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for ticketHashKey.
         * @param  ticketHashKey  TicketHashKeyEnum value for ticketHashKey.
         * @return Builder
         */
        public Builder ticketHashKey(TicketHashKeyEnum ticketHashKey) {
            this.ticketHashKey = ticketHashKey;
            return this;
        }

        /**
         * Setter for tz.
         * @param  tz  TzEnum value for tz.
         * @return Builder
         */
        public Builder tz(TzEnum tz) {
            this.tz = tz;
            return this;
        }

        /**
         * Setter for zipCode.
         * @param  zipCode  ZipCodeEnum value for zipCode.
         * @return Builder
         */
        public Builder zipCode(ZipCodeEnum zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        /**
         * Builds a new {@link Sort4} object using the set fields.
         * @return {@link Sort4}
         */
        public Sort4 build() {
            return new Sort4(brandingDomainUrl, createdTs, id, modifiedTs, aba, accountNumber,
                    address1, address2, brandingDomainId, city, contactEmailTrxReceiptDefault, dda,
                    defaultAch, defaultCc, developerCompanyId, emailReplyTo, fax, locationApiId,
                    locationApiKey, locationC1, locationC2, locationC3, name, officePhone,
                    officeExtPhone, parentId, recurringNotificationDaysDefault, showContactFiles,
                    showContactNotes, state, ticketHashKey, tz, zipCode);
        }
    }
}
