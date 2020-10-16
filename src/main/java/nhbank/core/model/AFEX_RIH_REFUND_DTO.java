package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RIH_REFUND_DTO {
    private String REF_NO;
    private int SEQ_NO;
    private String STS;
    private String RT_CD;
    private String MONEY_CD;
    private String RCV_GB;
    private String RCV_BR;
    private String CIX_NO;
    private String CCY;
    private int FAMT;
    private int ORG_FAMT;
    private String THEIR_REF_NO;
    private String CH_GB;
    private int CH_AMT;
    private String MJ_GB;
    private int FEE_CNT;
    private String FEE_MSG;
    private String INMSG_GB;
    private String IN_MSG;
    private String CREDIT_CUR;
    private int CREDIT_AMT;
    private Date CREDIT_IL;
    private String APPL_NM;
    private String APPL_ADDR1;
    private String APPL_ADDR2;
    private String APPL_ADDR3;
    private String APLI_ACNO;
    private String JG_DEPO_CD;
    private String JG_DEPO_NM;
    private String JG_BKCD;
    private String JG_BK_ABANO;
    private String JG_BKNM;
    private String JG_BK_ADDR1;
    private String JG_BK_ADDR2;
    private String JG_BK_ADDR3;
    private String RCV_NM;
    private String RCV_ADDR1;
    private String RCV_ADDR2;
    private String RCV_ADDR3;
    private String RCV_ACCT_NO;
    private String DEPO_CODE;
    private String DEPO_NAME1;
    private String SBANK_BKCD;
    private String SBANK_BKNM;
    private String SBANK_ADDR1;
    private String SBANK_ADDR2;
    private String SBANK_ADDR3;
    private String CBANK_BKCD;
    private String CBANK_BKNM;
    private String CBANK_ADDR1;
    private String CBANK_ADDR2;
    private String CBANK_ADDR3;
    private Date VALUE_DATE;
    private String FEE_CUR;
    private int FEE_AMT;
    private String INFO70_NAME1;
    private String INFO70_NAME2;
    private String INFO70_NAME3;
    private String INFO70_NAME4;
    private String INFO_NAME1;
    private String INFO_NAME2;
    private String INFO_NAME3;
    private String INFO_NAME4;
    private String INFO_NAME5;
    private String INFO_NAME6;
    private String INT_BKCD;
    private String INT_BKNM;
    private String INT_BK_ADDR1;
    private String INT_BK_ADDR2;
    private String INT_BK_ADDR3;
    private String INT_BK_ACCT;
    private String JG_BK_ACCT;
    private String PROC_TYPE;
    private String IMAD;
    private String OMAD;
    private Date REQUEST_IL;
    private int REQUEST_HIS;
    private Date AMEND_IL;
    private int AMEND_HIS;
    private String OUTMSG_GB;
    private String REFUND_RECV_MTTYPE;
    private String REFUND_RECV_MSG;
    private Date REFUND_RECV_IL;
    private String QUES_SEND_MTTYPE;
    private String QUES_SEND_MSG;
    private Date QUES_SEND_IL;
    private String CNFM_RECV_MTTYPE;
    private String CNFM_RECV_MSG;
    private Date CNFM_RECV_IL;
    private String RFND_SEND_MTTYPE;
    private String RFND_SEND_MSG;
    private Date RFND_SEND_IL;
    private int REFUND_AMT;
    private int AMD_AMT;
    private int AMD_COMM;
    private int AMD_FEE;
    private String REFUND_THEIR_REF;
    private String REFUND_REMARK1;
    private String REFUND_REMARK2;
    private String REFUND_REMARK3;
    private String REFUND_REMARK4;
    private String REFUND_REMARK5;
    private String REFUND_REMARK6;
    private String REFUND_REMARK7;
    private String REFUND_REMARK8;
    private String MNG_BR;
    private String OPER_ID;
    private String MNGR_ID;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RIH_REFUND_DTO() {
    }
} 
