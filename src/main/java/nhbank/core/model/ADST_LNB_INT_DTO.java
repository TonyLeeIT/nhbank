package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_LNB_INT_DTO {
    private String REF_NO;
    private int HIS_NO;
    private int SEQ_NO;
    private String STS;
    private int ADJ_SEQ;
    private int SCH_SEQ;
    private int SCH_SUB_NO;
    private Date INT_RCV_IL;
    private String CCY;
    private int INT_AMT;
    private int INT_DS_AMT;
    private int USD_CVT_AMT;
    private int BBS_CVT_AMT;
    private String TR_CD;
    private String INT_GB;
    private String TR_GB;
    private String MISU_GB;
    private String ROLL_GB;
    private int INDEX_RT;
    private String SPREAD_GB;
    private int SPREAD_RT;
    private int INT_O_RT;
    private int INT_S_RT;
    private Date INT_FROM_IL;
    private Date INT_TO_IL;
    private int INT_DAYS;
    private int BIZ_SEQ;
    private int BIZ_SUBSEQ;
    private Date BF_JS_LISU_IL;
    private Date BF_PT_LISU_IL;
    private Date BF_YC_LISU_IL;
    private Date FST_IB_IL;
    private Date LST_DEAL_IL;
    private Date LST_IB_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_LNB_INT_DTO() {
    }
} 
