package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_DTG_NAPAS_HIS_DTO {
    private String TRN_DATE;
    private String DE032_ACQ_CD;
    private String DE041_CRD_ACPT_TRM;
    private String DE011_TRACE_NO;
    private BigDecimal HIS_NO;
    private String INOUT_GB;
    private String BK_CD;
    private String MTI;
    private String DE002_PAN;
    private String DE003_PROC_CD;
    private BigDecimal DE004_TRN_AMT;
    private BigDecimal DE005_STL_AMT;
    private BigDecimal DE006_BIL_AMT;
    private String DE007_TRN_DT;
    private BigDecimal DE009_STL_CONV_RT;
    private BigDecimal DE010_BIL_CONV_RT;
    private String DE012_LOC_TRN_TIME;
    private String DE013_LOC_TRN_DATE;
    private String DE014_EXP_DATE;
    private String DE015_STL_DATE;
    private String DE019_ACQ_CTRY_CD;
    private String DE018_MER_CAT_CD;
    private String DE022_POS_MODE;
    private String DE023_CRD_SEQ_NO;
    private String DE025_POS_COND_CD;
    private String DE026_PIN_CAP_CD;
    private String DE035_TRK2_DAT;
    private String DE036_TRK3_DAT;
    private String DE037_REL_REF_NO;
    private String DE038_AUTH_ID_RES;
    private String DE039_RES_CD;
    private String DE042_CRD_ACPT_ID;
    private String DE043_CRD_ACPT_LOC;
    private String DE045_TRK1_DAT;
    private String DE048_ADD_SND_NM;
    private String DE048_ADD_SND_ADDR;
    private String DE049_TRN_CCY;
    private String DE050_STL_CCY;
    private String DE051_BIL_CCY;
    private String DE052_PIN;
    private String DE054_ADD_AMT;
    private String DE055_EMV_DAT;
    private String DE060_CNL_TP;
    private String DE062_NAP_SVC_CD;
    private String DE063_TRN_REF_NO;
    private String DE070_NET_MGT_CD;
    private String DE090_ORG_TRN_KEY;
    private String DE100_BEN_CD;
    private String DE102_SND_ACC_INF;
    private String DE103_RCV_ACC_INF;
    private String DE104_TRN_CONT;
    private String DE105_NEW_PIN;
    private String DE120_BEN_INF;
    private String DE128_MAC_DAT;
    private String ERR_CD;
    private String REF_NO;
    private Date RCV_IL;
    private BigDecimal SEQ_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_DTG_NAPAS_HIS_DTO() {
    }
} 
