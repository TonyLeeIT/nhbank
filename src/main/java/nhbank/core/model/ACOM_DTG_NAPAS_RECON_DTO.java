package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_DTG_NAPAS_RECON_DTO {
    private int IRFISSACQ;
    private String RRC;
    private String DE042_CRD_ACPT_ID;
    private String MTI;
    private String DE060_CNL_TP;
    private int IRFISSBNB;
    private String UPD_EMP_NO;
    private String NEW_STS;
    private String DE011_TRACE_NO;
    private String DE038_AUTH_ID_RES;
    private int SVFACQNP;
    private String DE062_NAP_SVC_CD;
    private String DE002_PAN;
    private int DE010_BIL_CONV_RT;
    private int IRFBNBISS;
    private Date STL_;
    private String TRN_STS;
    private int IRFBNBACQ;
    private Date UPD_DT;
    private String PROCESS;
    private Date COMMENT
    ON COLUMN
    FXVN.ACOM_DTG_NAPAS_RECON.TRN_;
    private String REG_EMP_NO;
    private int DE005_STL_AMT;
    private String DE063_TRN_REF_NO;
    private String DE049_TRN_CCY;
    private String DE018_MER_CAT_CD;
    private Date COMMENT
    ON COLUMN
    FXVN.ACOM_DTG_NAPAS_RECON.STL_;
    private Date DE013_LOC_TRN_;
    private Date ADD
    CONSTRAINT ACOM_DTG_NAPAS_RECON_PK

    PRIMARY KEY(BK_CD, TRN_;
            private String DE050_STL_CCY;
            private int RCA;
            private int DE009_STL_CONV_RT;
            private String RSV3;
            private int DE006_BIL_AMT;
            private Date COMMENT ON COLUMN FXVN.ACOM_DTG_NAPAS_RECON.DE013_LOC_TRN_;
            private String RSV1;
            private String RSV2;
            private String DE051_BIL_CCY;
            private String DE013_LOC_TRN_DATE;
            private int RTA;
            private String RECON_TYPE;
            private String DE032_ACQ_CD;
            private String DE103_RCV_ACC_INF;
            private int SVFBNBNP;
            private int IRFACQISS;
            private Date DE015_STL_;
            private String BK_CD;
            private String DE012_LOC_TRN_TIME;
            private String DE003_PROC_CD;
            private String REMARK;
            private Date REG_DT;
            private Date COMMENT ON COLUMN FXVN.ACOM_DTG_NAPAS_RECON.DE015_STL_;
            private String DE022_POS_MODE;
            private Date TRN_;
            private String DE037_REL_REF_NO;
            private String ISS;
            private String DE025_POS_COND_CD;
            private String TRN_DATE;
            private String DE015_STL_DATE;
            private int SVFISSNP;
            private int DE004_TRN_AMT;
            private String DE102_SND_ACC_INF;
            private String DE100_BEN_CD;
            private String STL_DATE;
            private String DE041_CRD_ACPT_TRM;
            private String UPD_TM;
            private int IRFACQBNB;
            private String REG_TM;

            public ACOM_DTG_NAPAS_RECON_DTO() {
    }
} 
