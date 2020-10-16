package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_BFH_PAY_DTO {
    private String REF_NO;
    private BigDecimal PAY_CNT;
    private Date MAKE_IL;
    private String COND_STS;
    private BigDecimal HIS_NO;
    private String PAY_GB;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IL;
    private Date LST_IB_IL;
    private String PAY_DOCID;
    private String MSG_TYPE;
    private Date VALUE_IL;
    private String SEND_REF_NO;
    private String RECV_REF_NO;
    private String SETL_DEPO;
    private String SETL_BKCD;
    private String SETL_BKNM;
    private String SETL_ADDR1;
    private String SETL_ADDR2;
    private String SETL_ADDR3;
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
    private String TRAN_CCY;
    private BigDecimal TRAN_AMT;
    private String FEE_CCY;
    private BigDecimal FEE_AMT;
    private String FEE_GB;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String NODDCT_YN;
    private String REMARK1;
    private String REMARK2;
    private String REMARK3;
    private String REMARK4;
    private String REMARK5;
    private String REMARK6;
    private Date REFUND_IL;
    private Date CONFIRM_IL;
    private String PROC_TYPE;
    private BigDecimal REFUND_AMT;
    private String VCB_DOWN_YN;

    public AFEX_BFH_PAY_DTO() {
    }
} 
