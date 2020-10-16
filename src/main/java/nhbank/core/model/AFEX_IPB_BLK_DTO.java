package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPB_BLK_DTO {
    private String REF_NO;
    private int SEQ;
    private int SSEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private int AMT;
    private int HIS_NO;
    private String JAGM_GB;
    private int JILC_BAMT;
    private int JILC_FAMT;
    private int JILG_BAMT;
    private int JILG_FAMT;
    private int SNG_SSEQ;
    private int DJB_SEQ;
    private String SET_BKCD;
    private String JUN_GB;
    private String FJN_NO;
    private String SET_GB;
    private int GT_AMT;
    private String AMT_GB;
    private String NCU_CCY;
    private int NCU_AMT;
    private int NCU_JILC_FAMT;
    private int NCU_JILG_FAMT;
    private int NCU_GT_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_BLK_DTO() {
    }
} 
