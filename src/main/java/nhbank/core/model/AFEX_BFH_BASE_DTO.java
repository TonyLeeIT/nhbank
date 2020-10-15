package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_BFH_BASE_DTO {
    private String RECV_GB;
    private String JG_BKNM;
    private String UPD_EMP_NO;
    private String INT_ADDR3;
    private String COND_STS;
    private String INT_ADDR2;
    private String INT_ADDR1;
    private String TAG72_INFO1;
    private String TAG72_INFO2;
    private String TAG72_INFO3;
    private String TAG72_INFO4;
    private String TAG72_INFO5;
    private Date UPD_DT;
    private String TAG72_INFO6;
    private Date LST_IL;
    private String JG_BK_ADDR1;
    private String JG_BK_ADDR2;
    private String NODDCT_YN;
    private String JG_BK_ADDR3;
    private String RECV_BR;
    private String REG_EMP_NO;
    private Date GIS_IL;
    private String JG_BKCD;
    private String RECV_DOCID;
    private int RECV_AMT;
    private String CUR_CCY;
    private String SEND_BKCD;
    private String IGNORE_YN;
    private String MSG_TYPE;
    private String JG_BK_ACCT;
    private String INT_BKNM;
    private String BENE_BKNM;
    private String SEND_ADDR1;
    private String SEND_ADDR3;
    private String SEND_ADDR2;
    private String BENE_ADDR1;
    private String SEND_REF_NO;
    private String BENE_ADDR3;
    private String BENE_ADDR2;
    private Date VALUE_IL;
    private Date RECV_IL;
    private String BFT_GB;
    private String RECV_CCY;
    private Date AC_IL;
    private int SEQ_NO;
    private String INT_BKCD;
    private String REF_NO;
    private String BENE_BKCD;
    private Date REG_DT;
    private String RECV_REF_NO;
    private Date LST_IB_IL;
    private String BENE_ACCT;
    private String CIX_NO;
    private int CUR_AMT;
    private String SEND_BKNM;
    private Date MAKE_IL;
    private String SEND_DEPO;
    private String UPD_TM;
    private int PAY_CNT;
    private String REG_TM;

    public AFEX_BFH_BASE_DTO() {
    }
} 
