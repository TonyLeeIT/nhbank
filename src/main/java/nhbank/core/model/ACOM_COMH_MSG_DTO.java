package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_COMH_MSG_DTO {
    private String DOC_ID;
    private Date MAKE_IL;
    private String IO_GB;
    private String UPMU_GB;
    private String NETW_GB;
    private BigDecimal SEQ_NO;
    private String MSG_GB;
    private String COND_STS;
    private String BR_NO;
    private String TYPE_GB;
    private String MSG_TYPE;
    private String CO_BKCD;
    private String CO_BKNM1;
    private String CO_BKNM2;
    private String CO_BKNM3;
    private String CO_BKNM4;
    private String OUR_REF;
    private String THEIR_REF;
    private String MSG_CCY;
    private BigDecimal MSG_AMT;
    private String OP_NO;
    private Date AP_IL;
    private String AP_TIME;
    private String AP_MNG_NO;
    private Date INOUT_IL;
    private String INOUT_TIME;
    private Date DONE_IL;
    private String DONE_TIME;
    private String ANS_BACK;
    private String TRAIL_GB;
    private String TELEX_NO;
    private String TKEY_YN;
    private String TKEY_BKCD;
    private Date TKEY_IL;
    private String TKEY_PREF;
    private String TKEY_VAR;
    private String TKEY_VAL;
    private String TKEY_LINE;
    private String TKEY_CNI1;
    private String TKEY_CNI2;
    private String ERR_MSG;
    private String HEAD_PRINT;
    private String BRAN_PRINT;
    private String TLX_MNG_NO;
    private String PRIO_YN;
    private String DUP_YN;
    private String PHYS_DIVI;
    private String BE_DOC;
    private String AF_DOC;
    private String USER_KEY;
    private String TS_KEY;
    private String MIR_NO;
    private String MOR_NO;
    private String PREV_TS;
    private Date PREV_IL;
    private String PREV_MIR;
    private String PREV_MOR;
    private String FLAG_1;
    private String FLAG_2;
    private String FLAG_3;
    private String GLOB_ID;
    private String MSG_FILE_NM;
    private Date LST_IL;
    private String LST_TIME;
    private String LST_TTY;
    private String LST_OP_NO;
    private String REL_DOC;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COMH_MSG_DTO() {
    }
} 
