package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_LNB_HIS_DTO {
    private String REF_NO;
    private int HIS_NO;
    private String STS;
    private String TR_GB;
    private String TR_CD;
    private String CIX_NO;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private int SD_HIS_NO;
    private String TR_CCY;
    private int TR_FAMT;
    private int TR_BAMT;
    private int AF_JAN;
    private String FEE_MD;
    private String SND_DOC_NO;
    private String TR_BR;
    private String SD_BR;
    private String TR_TIME;
    private String USER_ID;
    private String MANAGER_ID;
    private String IBJI_MD;
    private String YD_GUJA;
    private String CD_SNG_NO;
    private int CD_SIL_SEQ;
    private String FTP_SNG_NO;
    private int FTP_SIL_SEQ;
    private Date LST_IB_IL;
    private Date BF_LREPAY_IL;
    private Date BF_NREPAY_IL;
    private Date BF_LISU_IL;
    private Date BF_LIIB_IL;
    private Date BF_NISU_IL;
    private Date BF_NROLL_IL;
    private Date BF_PYC_IL;
    private Date BF_IYC_IL;
    private int BF_REPAY_SEQ;
    private int BF_INT_SEQ;
    private int BF_MSB_SEQ;
    private int BF_LST_RT;
    private int BF_MISU_AMT;
    private String SH_JAGUM_GB;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_LNB_HIS_DTO() {
    }
} 
