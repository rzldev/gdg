package life.genny.datagenerator.model;

public class AttributeCode {

    public enum DEF_ADDRESS implements BaseCode {
        ATT_LNK_SELECT_COUNTRY,
        ATT_PRI_ADDRESS_ADDRESS1,
        ATT_PRI_ADDRESS_ADDRESS2,
        ATT_PRI_ADDRESS_CITY,
        ATT_PRI_ADDRESS_COUNTRY,
        ATT_PRI_ADDRESS_EXTRA,
        ATT_PRI_ADDRESS_FULL,
        ATT_PRI_ADDRESS_JSON,
        ATT_PRI_ADDRESS_LATITUDE,
        ATT_PRI_ADDRESS_LONGITUDE,
        ATT_PRI_ADDRESS_POSTCODE,
        ATT_PRI_ADDRESS_STATE,
        ATT_PRI_ADDRESS_SUBURB,
        ATT_PRI_TIME_ZONE,
        ATT_PRI_TIMEZONE_ID,
        SER_LNK_SELECT_COUNTRY,
        SER_PRI_TIMEZONE_ID,
    }

    public enum DEF_AGENCY implements BaseCode {
        ATT_PRI_IS_AGENCY,
        DFT_PRI_IS_AGENCY,
        DFT_PRI_STATUS,
        LNK_INCLUDE,
    }

    public enum DEF_AGENT implements BaseCode {
        ATT_LNK_AGENCY,
        ATT_PRI_ADDED_BY,
        ATT_PRI_IS_AGENT,
        ATT_PRI_TERMS_ACCEPTED,
        DFT_PRI_IS_AGENT,
        DFT_PRI_PROFILE,
        DFT_PRI_STATUS,
        LNK_INCLUDE,
        SER_LNK_AGENCY,
    }

    public enum DEF_APPLICATION implements BaseCode {
        ATT_LNK_AGENT,
        ATT_LNK_AGENT_REASON_FOR_REJECTION,
        ATT_LNK_ALL_EMAILS,
        ATT_LNK_BUSINESS_HOURS,
        ATT_LNK_COMP_INTERNSHIP,
        ATT_LNK_DAYS_PER_WEEK,
        ATT_LNK_DRESS_CODE,
        ATT_LNK_EDU_PROVIDER,
        ATT_LNK_HOST_COMPANY,
        ATT_LNK_INDUSTRY,
        ATT_LNK_INTERN,
        ATT_LNK_INTERN_SUPERVISOR,
        ATT_LNK_INTERNSHIP,
        ATT_LNK_INTERNSHIP_DURATION,
        ATT_LNK_INTERVIEW_TYPE,
        ATT_LNK_NO_OF_INTERNS,
        ATT_LNK_OCCUPATION,
        ATT_LNK_REASON_FOR_REJECTION,
        ATT_LNK_SOFTWARE,
        ATT_LNK_SUB_REASON_FOR_REJECTION,
        ATT_LNK_TRANSPORT,
        ATT_LNK_WHICH_DAYS,
        ATT_LNK_WORKSITE_SELECT,
        ATT_PRI_ABN,
        ATT_PRI_ADDRESS_FULL,
        ATT_PRI_AG_DOC_NOTES,
        ATT_PRI_AGENT_IMAGE,
        ATT_PRI_AGENT_NAME,
        ATT_PRI_AGR_DOC_HC_SIGN_DATE,
        ATT_PRI_AGR_DOC_HC_SIGNATURE,
        ATT_PRI_AGR_DOC_INT_SIGN_DATE,
        ATT_PRI_AGR_DOC_INT_SIGNATURE,
        ATT_PRI_AGR_DOC_OUTCOME_SIGN_DATE,
        ATT_PRI_AGR_DOC_OUTCOME_SIGNATURE,
        ATT_PRI_AGREEMENT_DOC,
        ATT_PRI_AGREEMENT_HTML,
        ATT_PRI_AGREEMENT_SIGNATURES,
        ATT_PRI_ANZCO,
        ATT_PRI_APPLICANT_CODE,
        ATT_PRI_APPLIED_BY,
        ATT_PRI_ASSOC_DURATION,
        ATT_PRI_ASSOC_EP,
        ATT_PRI_ASSOC_HC,
        ATT_PRI_ASSOC_INDUSTRY,
        ATT_PRI_ASSOC_NO_OF_INTERNS,
        ATT_PRI_ASSOC_OCCUPATION,
        ATT_PRI_ASSOC_SUPER,
        ATT_PRI_ASSOC_WORKSITE,
        ATT_PRI_BASE_LEARNING_OUTCOMES,
        ATT_PRI_BUSINESS_HOURS,
        ATT_PRI_DAYS_PER_WEEK,
        ATT_PRI_DISABLED,
        ATT_PRI_DRESS_CODE,
        ATT_PRI_END_DATE,
        ATT_PRI_HOURS_PER_WEEK,
        ATT_PRI_IMAGE_SECONDARY,
        ATT_PRI_INTERN_CODE,
        ATT_PRI_INTERN_EMAIL,
        ATT_PRI_INTERN_MOBILE,
        ATT_PRI_INTERN_NAME,
        ATT_PRI_INTERN_STUDENT_ID,
        ATT_PRI_INTERNSHIP_DETAILS,
        ATT_PRI_INTERVIEW_START_DATETIME,
        ATT_PRI_INTERVIEW_TYPE,
        ATT_PRI_IS_APPLICATION,
        ATT_PRI_JOURNAL_STATUS,
        ATT_PRI_NUM_JOURNALS,
        ATT_PRI_OUTCOME_LIFE_REP_NAME,
        ATT_PRI_PROCESS_ID,
        ATT_PRI_PROFILE,
        ATT_PRI_PROGRESS,
        ATT_PRI_REJECTED_BY,
        ATT_PRI_REJECTION_INFORMATION,
        ATT_PRI_ROLES_AND_RESPONSIBILITIES,
        ATT_PRI_SELECT_COUNTRY,
        ATT_PRI_SOFTWARE,
        ATT_PRI_SPECIFIC_LEARNING_OUTCOMES,
        ATT_PRI_STAGE,
        ATT_PRI_START_DATE,
        ATT_PRI_STATUS_COLOR,
        ATT_PRI_SUBMIT,
        ATT_PRI_SUPER_EMAIL,
        ATT_PRI_SUPER_JOB_TITLE,
        ATT_PRI_SUPER_MOBILE,
        ATT_PRI_SUPER_NAME,
        ATT_PRI_TITLE,
        ATT_PRI_TRANSPORT,
        ATT_PRI_VIDEO_URL,
        ATT_PRI_WHICH_DAYS_STRIPPED,
        ATT_PRI_WORD_START_DATE,
        DEP_LNK_INTERN_SUPERVISOR,
        DEP_LNK_INTERNSHIP,
        DEP_LNK_SUB_REASON_FOR_REJECTION,
        DFT_PRI_DISABLED,
        DFT_PRI_IS_APPLICATION,
        DFT_PRI_STAGE,
        DFT_PRI_STATUS,
        LNK_CACHED_SEARCHES,
        LNK_INCLUDE,
        PRI_PREFIX,
        SER_LNK_AGENT_REASON_FOR_REJECTION,
        SER_LNK_DAYS_PER_WEEK,
        SER_LNK_HOST_COMPANY,
        SER_LNK_INTERN_SUPERVISOR,
        SER_LNK_INTERNSHIP,
        SER_LNK_INTERNSHIP_DURATION,
        SER_LNK_INTERVIEW_TYPE,
        SER_LNK_REASON_FOR_REJECTION,
        SER_LNK_SUB_REASON_FOR_REJECTION,
        SER_LNK_WHICH_DAYS,
        SER_LNK_WORKSITE_SELECT,
        UNQ_LNK_INTERNSHIP,
    }

    public enum DEF_COMPANY implements BaseCode {
        ATT_LNK_AGENCY,
        ATT_LNK_COMPANY_INC,
        ATT_LNK_COMPANY_INDUSTRY,
        ATT_LNK_NUMBER_STAFF,
        ATT_LNK_SPECIFY_ABN,
        ATT_PRI_ABN,
        ATT_PRI_ANZCO,
        ATT_PRI_BUSINESS_HOURS,
        ATT_PRI_COMPANY_DESCRIPTION,
        ATT_PRI_COMPANY_WEBSITE_URL,
        ATT_PRI_LEGAL_NAME,
        ATT_PRI_LINKEDIN_URL,
        ATT_PRI_NAME,
        ATT_PRI_NUMBER_STAFF,
        ATT_PRI_PROCESS_ID,
        ATT_PRI_SELECT_COUNTRY,
        ATT_PRI_SUBMIT,
        ATT_PRI_VIDEO_INTRO,
        LNK_INCLUDE,
        PRI_PREFIX,
        SER_LNK_COMPANY_INDUSTRY,
        SER_LNK_NUMBER_STAFF,
        SER_LNK_SPECIFY_ABN,
    }

    public enum DEF_CONTACT implements BaseCode {
        ATT_PRI_EMAIL,
        ATT_PRI_LANDLINE,
        ATT_PRI_LINKEDIN_URL,
        ATT_PRI_MOBILE,
        ATT_PRI_PHONE,
    }

    public enum DEF_EDU_PRO_REP implements BaseCode {
        ATT_LNK_EDU_PROVIDER,
        ATT_PRI_ADDED_BY,
        ATT_PRI_DEPARTMENT,
        ATT_PRI_IS_EDU_PRO_REP,
        DFT_PRI_IS_EDU_PRO_REP,
        DFT_PRI_PROFILE,
        DFT_PRI_STATUS,
        LNK_INCLUDE,
        SER_LNK_EDU_PROVIDER,
    }

    public enum DEF_EDU_PROVIDER implements BaseCode {
        ATT_PRI_IS_EDU_PROVIDER,
        ATT_PRI_PROFILE,
        ATT_PRI_PROVIDER_ID,
        DFT_PRI_IS_EDU_PROVIDER,
        DFT_PRI_STATUS,
        LNK_INCLUDE,
    }

    public enum DEF_HOST_CPY implements BaseCode {
        ATT_DOC_OHS_CODE,
        ATT_LNK_ALL_EMAILS,
        ATT_LNK_COMPANY_INC,
        ATT_LNK_DJP_DOC,
        ATT_LNK_EDU_PROVIDERS,
        ATT_LNK_HCV_DOC,
        ATT_LNK_HOST_COMPANY_REP,
        ATT_LNK_INTERNSHIPS,
        ATT_LNK_VIC_GOV_DIGITAL_JOBS,
        ATT_PRI_ASSOC_HC,
        ATT_PRI_ASSOC_INDUSTRY,
        ATT_PRI_CREATED_DATE,
        ATT_PRI_DETAILS_BUS,
        ATT_PRI_DJP_DOCUMENT_ACCEPTED,
        ATT_PRI_HC_SERVICES_AGREEMENT_HTML,
        ATT_PRI_HC_VALIDATION_DOC_URL,
        ATT_PRI_HCS_AGR_OUTCOME_SIGN_DATE,
        ATT_PRI_HCS_AGR_OUTCOME_SIGNATURE,
        ATT_PRI_HCS_AGR_SIGN_DATE,
        ATT_PRI_HCS_AGR_SIGNATURE,
        ATT_PRI_HOST_CPY_REP_SIGNING_DATE,
        ATT_PRI_IS_HOST_CPY,
        ATT_PRI_OHS_DOC,
        ATT_PRI_PROFILE,
        ATT_PRI_STATUS,
        ATT_PRI_SUBMIT,
        ATT_PRI_TC_DOC,
        ATT_PRI_VALIDATION,
        ATT_PRI_VIDEO_INTRO,
        ATT_PRI_VIDEO_URL,
        ATT_QQQ_QUESTION_GROUP_BUTTON_CANCEL_SUBMIT,
        DFT_PRI_IS_HOST_CPY,
        DFT_PRI_STATUS,
        DFT_PRI_VALIDATION,
        LNK_INCLUDE,
    }

    public enum DEF_HOST_CPY_REP implements BaseCode {
        ATT_LNK_ALL_EMAILS,
        ATT_LNK_HOST_COMPANY,
        ATT_LNK_INTERNSHIPS,
        ATT_LNK_SEND_EMAIL,
        ATT_LNK_SPECIFY_HOST_CPY,
        ATT_PRI_ADDED_BY,
        ATT_PRI_ASSOC_HC,
        ATT_PRI_BIO,
        ATT_PRI_EMAIL_FLAG,
        ATT_PRI_IS_DELETED,
        ATT_PRI_IS_HOST_CPY_REP,
        ATT_PRI_JOB_TITLE,
        ATT_PRI_SELECT_COUNTRY,
        ATT_PRI_SUPER_QUALIFICATION,
        ATT_PRI_TERMS_ACCEPTED,
        DFT_PRI_IS_HOST_CPY_REP,
        DFT_PRI_PROFILE,
        DFT_PRI_STATUS,
        LNK_INCLUDE,
        SER_LNK_ALL_EMAILS,
        SER_LNK_HOST_COMPANY,
        SER_LNK_SELECT_COUNTRY,
        SER_LNK_SEND_EMAIL,
        SER_LNK_SPECIFY_HOST_CPY,
    }

    public enum DEF_INTERN implements BaseCode {
        ATT__LNK_CURRENT_SOFTWARE__PRI_NAME,
        ATT_LNK_AGENT,
        ATT_LNK_APPLICATIONS,
        ATT_LNK_BATCH,
        ATT_LNK_COMP_INTERNSHIP,
        ATT_LNK_CURRENT_COURSE,
        ATT_LNK_CURRENT_SOFTWARE,
        ATT_LNK_DAYS_PER_WEEK,
        ATT_LNK_EDU_PROVIDER,
        ATT_LNK_FUTURE_SOFTWARE,
        ATT_LNK_INDUSTRY,
        ATT_LNK_INTERN_PREV_INDUSTRY,
        ATT_LNK_INTERNSHIP_DURATION,
        ATT_LNK_OCCUPATION,
        ATT_LNK_PREV_PERIOD,
        ATT_LNK_SELECT_BATCH,
        ATT_LNK_SEND_EMAIL,
        ATT_LNK_TRANSPORT,
        ATT_LNK_WHICH_DAYS,
        ATT_PRI_ADDED_BY,
        ATT_PRI_AGENT_NAME,
        ATT_PRI_ANZCO,
        ATT_PRI_APPLIED_FOR_INTERNSHIPS,
        ATT_PRI_ASK_FOR_RECOMMENDATION,
        ATT_PRI_ASSOC_COMP_INTERNSHIP,
        ATT_PRI_ASSOC_CURRENT_SOFTWARE,
        ATT_PRI_ASSOC_DURATION,
        ATT_PRI_ASSOC_EP,
        ATT_PRI_ASSOC_FUTURE_SOFTWARE,
        ATT_PRI_ASSOC_INDUSTRY,
        ATT_PRI_ASSOC_OCCUPATION,
        ATT_PRI_BATCH,
        ATT_PRI_CAREER_OBJ,
        ATT_PRI_CURRENT_COURSE,
        ATT_PRI_CV,
        ATT_PRI_DAYS_PER_WEEK,
        ATT_PRI_DELETED,
        ATT_PRI_DISABLED,
        ATT_PRI_INDUCTION_COMPLETE,
        ATT_PRI_INTERVIEWS_STARTED,
        ATT_PRI_IS_DELETED,
        ATT_PRI_IS_INTERN,
        ATT_PRI_JOURNAL_STATUS,
        ATT_PRI_MATCHED_INTERNSHIPS,
        ATT_PRI_MATCHING_INTERNSHIPS_COUNT,
        ATT_PRI_NUM_JOURNALS,
        ATT_PRI_OFFER_ACCEPTED,
        ATT_PRI_PREV_DESCRIPTION,
        ATT_PRI_PREV_EMPLOYER,
        ATT_PRI_PREV_JOB_TITLE,
        ATT_PRI_PREV_PERIOD,
        ATT_PRI_PROFILE_COMPLETE,
        ATT_PRI_PROGRESS,
        ATT_PRI_PROGRESS_REPORTING,
        ATT_PRI_RECEIVE_CERTIFICATE,
        ATT_PRI_SEARCH_HISTORY,
        ATT_PRI_SELECT_COUNTRY,
        ATT_PRI_STAGE,
        ATT_PRI_STAR_RATING,
        ATT_PRI_START_DATE,
        ATT_PRI_STATUS_COLOR,
        ATT_PRI_STUDENT_ID,
        ATT_PRI_SUBMIT,
        ATT_PRI_TERMS_ACCEPTED,
        ATT_PRI_TIMELINE_JSON,
        ATT_PRI_TRANSPORT,
        ATT_PRI_UPDATE_LINKEDIN,
        ATT_PRI_VIDEO_RECORDED,
        ATT_PRI_VIDEO_URL,
        ATT_PRI_WHICH_DAYS_STRIPPED,
        DEP_LNK_OCCUPATION,
        DFT_PRI_DISABLED,
        DFT_PRI_IS_INTERN,
        DFT_PRI_NUM_JOURNALS,
        DFT_PRI_PROFILE,
        DFT_PRI_STATUS,
        DFT_PRI_STATUS_COLOR,
        LNK_CACHED_SEARCHES,
        LNK_INCLUDE,
        SER_LNK_AGENT,
        SER_LNK_COMP_INTERNSHIP,
        SER_LNK_CURRENT_COURSE,
        SER_LNK_CURRENT_SOFTWARE,
        SER_LNK_DAYS_PER_WEEK,
        SER_LNK_EDU_PROVIDER,
        SER_LNK_FUTURE_SOFTWARE,
        SER_LNK_INDUSTRY,
        SER_LNK_INTERN_PREV_INDUSTRY,
        SER_LNK_INTERNSHIP_DURATION,
        SER_LNK_OCCUPATION,
        SER_LNK_SELECT_BATCH,
        SER_LNK_SELECT_COUNTRY,
        SER_LNK_SEND_EMAIL,
        SER_LNK_TRANSPORT,
        SER_LNK_WHICH_DAYS,
    }

    public enum DEF_INTERNSHIP implements BaseCode {
        ATT_LNK_APPLICATIONS,
        ATT_LNK_BUSINESS_HOURS,
        ATT_LNK_DAYS_PER_WEEK,
        ATT_LNK_DRESS_CODE,
        ATT_LNK_HOST_COMPANY,
        ATT_LNK_HOST_COMPANY_REP,
        ATT_LNK_INDUSTRY,
        ATT_LNK_INTERN_SUPERVISOR,
        ATT_LNK_INTERVIEW_TYPE,
        ATT_LNK_NO_OF_INTERNS,
        ATT_LNK_OCCUPATION,
        ATT_LNK_SOFTWARE,
        ATT_LNK_WHICH_DAYS,
        ATT_LNK_WORKSITE_SELECT,
        ATT_PRI_ASSOC_HC,
        ATT_PRI_ASSOC_INDUSTRY,
        ATT_PRI_ASSOC_NUM_INTERNS,
        ATT_PRI_ASSOC_OCCUPATION,
        ATT_PRI_ASSOC_SUPERVISOR,
        ATT_PRI_BASE_LEARNING_OUTCOMES,
        ATT_PRI_BUSINESS_HOURS,
        ATT_PRI_CAREER_OBJ,
        ATT_PRI_COMPANY_DESCRIPTION,
        ATT_PRI_CURRENT_INTERNS,
        ATT_PRI_DAYS_PER_WEEK,
        ATT_PRI_DRESS_CODE,
        ATT_PRI_INTERNSHIP_DETAILS,
        ATT_PRI_INTERNSHIP_START_DATE,
        ATT_PRI_INTERNSHIP_TITLE,
        ATT_PRI_INTERVIEW_START_DATETIME,
        ATT_PRI_IS_INTERNSHIP,
        ATT_PRI_LOOM_URL,
        ATT_PRI_NAME,
        ATT_PRI_NO_OF_INTERNS,
        ATT_PRI_PROCESS_ID,
        ATT_PRI_PROFILE,
        ATT_PRI_ROLES_AND_RESPONSIBILITIES,
        ATT_PRI_SOFTWARE,
        ATT_PRI_SPECIFIC_LEARNING_OUTCOMES,
        ATT_PRI_STAR_RATING,
        ATT_PRI_SUBMIT,
        ATT_PRI_SUPER_EMAIL,
        ATT_PRI_SUPER_MOBILE,
        ATT_PRI_SUPER_NAME,
        ATT_PRI_TIME_ZONE,
        ATT_PRI_TIMEZONE_ID,
        ATT_PRI_TITLE,
        ATT_PRI_VIDEO_URL,
        ATT_PRI_WHICH_DAYS_STRIPPED,
        DEP_LNK_HOST_COMPANY_REP,
        DEP_LNK_INTERN_SUPERVISOR,
        DEP_LNK_OCCUPATION,
        DFT_PRI_CURRENT_INTERNS,
        DFT_PRI_IS_FULL,
        DFT_PRI_IS_INTERNSHIP,
        DFT_PRI_STATUS,
        LNK_INCLUDE,
        PRI_PREFIX,
        SER_LNK_DAYS_PER_WEEK,
        SER_LNK_DRESS_CODE,
        SER_LNK_HOST_COMPANY,
        SER_LNK_HOST_COMPANY_REP,
        SER_LNK_INDUSTRY,
        SER_LNK_INTERN_SUPERVISOR,
        SER_LNK_NO_OF_INTERNS,
        SER_LNK_OCCUPATION,
        SER_LNK_SOFTWARE,
        SER_LNK_WHICH_DAYS,
        SER_LNK_WORKSITE_SELECT,
    }

    public enum DEF_ORGANISATION {
        LINK_INCLUDE,
    }

    public enum DEF_PERSON implements BaseCode {
        ATT_LNK_ALL_EMAILS,
        ATT_LNK_GENDER_SELECT,
        ATT_LNK_SEND_EMAIL,
        ATT_PRI_ADDED_BY,
        ATT_PRI_DEFAULT_STATUS,
        ATT_PRI_DOB,
        ATT_PRI_EMAIL,
        ATT_PRI_EMAIL_FLAG,
        ATT_PRI_FIRSTNAME,
        ATT_PRI_GENDER,
        ATT_PRI_INITIALS,
        ATT_PRI_LASTNAME,
        ATT_PRI_LINKEDIN_URL,
        ATT_PRI_PROCESS_ID,
        ATT_PRI_PROFILE,
        ATT_PRI_SUBMIT,
        LNK_INCLUDE,
        PRI_PREFIX,
        SER_LNK_ALL_EMAILS,
        SER_LNK_GENDER_SELECT,
        SER_LNK_SEND_EMAIL,
        SER_LNK_SPECIFY_HOST_CPY,
        TEMP_STREET,
        TEMP_COUNTRY,
        TEMP_ZIPCODE,
        TEMP_PHONE_NUMBER,
        TEMP_DOB,
    }

    public enum DEF_SUPERVISOR implements BaseCode {
        LNK_INCLUDE,
        SER_PRI_IS_SUPERVISOR,
    }

    public enum DEF_USER implements BaseCode {
        ATT_PRI_ASSEMBLY_USER_ID,
        ATT_PRI_ASSOC_ENTITY_NAME,
        ATT_PRI_DEFAULT_REDIRECT,
        ATT_PRI_HAS_LOGGED_IN,
        ATT_PRI_IMAGE_URL,
        ATT_PRI_INITIALS,
        ATT_PRI_IS_DEV,
        ATT_PRI_KEYCLOAK_UUID,
        ATT_PRI_PREFERRED_NAME,
        ATT_PRI_PROFILE,
        ATT_PRI_PROGRESS,
        ATT_PRI_STATUS,
        ATT_PRI_TERMS_AND_CONDITIONS_HTML,
        ATT_PRI_USER_PAYMENT_METHODS,
        ATT_PRI_USER_PROFILE_PICTURE,
        ATT_PRI_USERCODE,
        ATT_PRI_USERNAME,
        ATT_PRI_UUID,
        LNK_INCLUDE,
        UNQ_PRI_EMAIL,
    }

}
