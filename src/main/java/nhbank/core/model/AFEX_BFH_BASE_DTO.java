package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_BFH_BASE_DTO {
    private Date RECV_IL;
    private BigDecimal SEQ_NO;
    private Date MAKE_IL;
    private String REF_NO;
    private String COND_STS;
    private String RECV_GB;
    private String RECV_BR;
    private String CIX_NO;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IL;
    private Date LST_IB_IL;
    private String BFT_GB;
    private String IGNORE_YN;
    private String RECV_DOCID;
    private BigDecimal PAY_CNT;
    private String MSG_TYPE;
    private Date VALUE_IL;
    private String RECV_CCY;
    private BigDecimal RECV_AMT;
    private String CUR_CCY;
    private BigDecimal CUR_AMT;
    private String SEND_REF_NO;
    private String RECV_REF_NO;
    private String SEND_DEPO;
    private String SEND_BKCD;
    private String SEND_BKNM;
    private String SEND_ADDR1;
    private String SEND_ADDR2;
    private String SEND_ADDR3;
    private String JG_BKCD;
    private String JG_BKNM;
    private String JG_BK_ADDR1;
    private String JG_BK_ADDR2;
    private String JG_BK_ADDR3;
    private String JG_BK_ACCT;
    private String BENE_BKCD;
    private String BENE_BKNM;
    private String BENE_ADDR1;
    private String BENE_ADDR2;
    private String BENE_ADDR3;
    private String BENE_ACCT;
    private String TAG72_INFO1;
    private String TAG72_INFO2;
    private String TAG72_INFO3;
    private String TAG72_INFO4;
    private String TAG72_INFO5;
    private String TAG72_INFO6;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String INT_BKCD;
    private String INT_BKNM;
    private String INT_ADDR1;
    private String INT_ADDR2;
    private String INT_ADDR3;
    private String NODDCT_YN;

    public AFEX_BFH_BASE_DTO() {
    }
} 
