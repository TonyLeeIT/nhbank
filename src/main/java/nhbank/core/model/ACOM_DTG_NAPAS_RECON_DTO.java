package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_DTG_NAPAS_RECON_DTO {
    private String BK_CD;
    private String TRN_DATE;
    private String RECON_TYPE;
    private String DE032_ACQ_CD;
    private String DE041_CRD_ACPT_TRM;
    private String DE011_TRACE_NO;
    private String DE002_PAN;
    private String DE003_PROC_CD;
    private int DE004_TRN_AMT;
    private int DE005_STL_AMT;
    private int DE006_BIL_AMT;
    private int DE009_STL_CONV_RT;
    private int DE010_BIL_CONV_RT;
    private String DE012_LOC_TRN_TIME;
    private String DE013_LOC_TRN_DATE;
    private String DE015_STL_DATE;
    private String DE018_MER_CAT_CD;
    private String DE022_POS_MODE;
    private String DE025_POS_COND_CD;
    private String DE037_REL_REF_NO;
    private String DE038_AUTH_ID_RES;
    private String DE042_CRD_ACPT_ID;
    private String DE049_TRN_CCY;
    private String DE050_STL_CCY;
    private String DE051_BIL_CCY;
    private String DE060_CNL_TP;
    private String DE062_NAP_SVC_CD;
    private String DE063_TRN_REF_NO;
    private String DE100_BEN_CD;
    private String DE102_SND_ACC_INF;
    private String DE103_RCV_ACC_INF;
    private String PROCESS;
    private String MTI;
    private int RTA;
    private int RCA;
    private String ISS;
    private int SVFISSNP;
    private int IRFISSACQ;
    private int IRFISSBNB;
    private int SVFACQNP;
    private int IRFACQISS;
    private int IRFACQBNB;
    private int SVFBNBNP;
    private int IRFBNBISS;
    private int IRFBNBACQ;
    private String RRC;
    private String RSV1;
    private String RSV2;
    private String RSV3;
    private String TRN_STS;
    private String NEW_STS;
    private String REMARK;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String STL_DATE;

    public ACOM_DTG_NAPAS_RECON_DTO() {
    }
} 
