package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AACT_TRX_PL_DTO {
    private String REF_NO;
    private int HIS_NO;
    private int SEG_SEQ;
    private String REF_NO2;
    private String ORG_GB;
    private String ILGE_GB;
    private String YD_GB;
    private String PST_GB;
    private String IBF_GB;
    private String POS_GB;
    private Date ACT_IL;
    private String ACT_BR;
    private String PL_CCY;
    private String PL_CD;
    private String IBJI_CD;
    private String SLIP_GB;
    private String JUKI_GB;
    private String UPMU_CD;
    private String GEOR_CD;
    private String FEE_CD;
    private String GAM_GB;
    private String O_DS_CCY;
    private int O_DS_AMT;
    private int O_INT_RT;
    private Date O_FROM_IL;
    private Date O_TO_IL;
    private int O_ILSU;
    private int O_FEE_FAMT;
    private int O_FEE_BAMT;
    private int O_APPL_HRT;
    private int O_FTP_RT;
    private String S_DS_CCY;
    private int S_DS_AMT;
    private int S_INT_RT;
    private Date S_FROM_IL;
    private Date S_TO_IL;
    private int S_ILSU;
    private int S_FEE_FAMT;
    private int S_FEE_BAMT;
    private int S_APPL_HRT;
    private int S_BASIC_HRT;
    private int S_BOOK_HRT;
    private int S_DEMI_HRT;
    private int S_GOSI_HRT;
    private int S_FTP_RT;
    private String P_CCY;
    private int P_FAMT;
    private int P_BAMT;
    private int P_APPL_HRT;
    private int P_BASIC_HRT;
    private int P_BOOK_HRT;
    private int P_DEMI_HRT;
    private int P_GOSI_HRT;
    private int P_FTP_RT;
    private String YD_REFNO;
    private int YD_HISNO;
    private String DOC_ID;
    private String REMARK;
    private String THEIR_REFNO;
    private String IFRS_DV_CD;
    private String ID_NO;
    private String CIX_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AACT_TRX_PL_DTO() {
    }
} 
