package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_DTG_NAPAS_HIS")
@Data
public class ACOM_DTG_NAPAS_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String MTI;
    private String DE042_CRD_ACPT_ID;
    private String DE060_CNL_TP;
    private String DE052_PIN;
    private String UPD_EMP_NO;
    private String DE011_TRACE_NO;
    private String DE038_AUTH_ID_RES;
    private String DE055_EMV_DAT;
    private String DE104_TRN_CONT;
    private String DE062_NAP_SVC_CD;
    private String DE002_PAN;
    private String DE023_CRD_SEQ_NO;
    private int DE010_BIL_CONV_RT;
    private Date UPD_DT;
    private String DE070_NET_MGT_CD;
    private Date RCV_IL;
    private String DE105_NEW_PIN;
    private String REG_EMP_NO;
    private int DE005_STL_AMT;
    private String DE039_RES_CD;
    private int HIS_NO;
    private String DE063_TRN_REF_NO;
    private String DE049_TRN_CCY;
    private String DE018_MER_CAT_CD;
    private String DE050_STL_CCY;
    private String DE048_ADD_SND_ADDR;
    private int DE009_STL_CONV_RT;
    private String DE035_TRK2_DAT;
    private int DE006_BIL_AMT;
    private String DE051_BIL_CCY;
    private String DE013_LOC_TRN_DATE;
    private String DE036_TRK3_DAT;
    private String DE032_ACQ_CD;
    private String DE043_CRD_ACPT_LOC;
    private String DE103_RCV_ACC_INF;
    private String DE014_EXP_DATE;
    private String BK_CD;
    private String DE012_LOC_TRN_TIME;
    private int SEQ_NO;
    private String DE007_TRN_DT;
    private String DE019_ACQ_CTRY_CD;
    private String REF_NO;
    private String DE045_TRK1_DAT;
    private String DE003_PROC_CD;
    private Date REG_DT;
    private String DE022_POS_MODE;
    private String DE128_MAC_DAT;
    private String DE037_REL_REF_NO;
    private String DE025_POS_COND_CD;
    private String TRN_DATE;
    private String DE048_ADD_SND_NM;
    private String DE015_STL_DATE;
    private String INOUT_GB;
    private int DE004_TRN_AMT;
    private String DE102_SND_ACC_INF;
    private String DE026_PIN_CAP_CD;
    private String ERR_CD;
    private String DE100_BEN_CD;
    private String DE041_CRD_ACPT_TRM;
    private String DE090_ORG_TRN_KEY;
    private String UPD_TM;
    private String DE054_ADD_AMT;
    private String DE120_BEN_INF;
    private String REG_TM;
} 
