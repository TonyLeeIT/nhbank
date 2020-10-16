package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_TRAN_DTO {
    private String ACCT_NO;
    private Date IB_IL;
    private BigDecimal TRX_NO;
    private String MNG_BR;
    private String PRINT_GB;
    private String NO_PBOOK_GB;
    private String NO_PRINT_GB;
    private String STS;
    private String YD_GB;
    private String SLIP_GB;
    private String MUINJA_GB;
    private String IBGM_SLIP_GB;
    private String INT_SLIP_GB;
    private String TAX_SLIP_GB;
    private String JIGB_YD_GB;
    private String CHK_YD_GB;
    private String CASH_TR_GB;
    private String FX_TR_GB;
    private String IBJI_GB;
    private String TR_CD;
    private String SUB_TR_CD;
    private String MECH_GB;
    private String FUND_GB;
    private String TR_CCY;
    private BigDecimal TR_AMT;
    private BigDecimal TR_AAMT;
    private BigDecimal AF_JAN;
    private String CHK_GB;
    private String CHK_NO;
    private Date AC_IL;
    private Date GIS_IL;
    private String OP_NO;
    private String TR_BR;
    private String TSEQ_NO;
    private String TR_BK;
    private String TR_TIME;
    private String REMARK;
    private String REQ_CUST_ID;
    private String YD_REF_NO;
    private String YD_THEIR_REF_NO;
    private BigDecimal YD_HIS_NO;
    private String SD_BK;
    private BigDecimal TOT_FEE;
    private BigDecimal TAX1_AMT;
    private BigDecimal TAX2_AMT;
    private BigDecimal TAX3_AMT;
    private int TAX4_AMT;
    private int INT_PAY_CNT;
    private Date BF_INT_CAL_IL;
    private Date BF_INT_RCV_IL;
    private int DPT_RT;
    private int APPL_HRT;
    private int PJ_HRT;
    private int BOOK_HRT;
    private int BASIC_HRT;
    private int GOSI_HRT;
    private int DEMI_HRT;
    private int EX_RT_SNG_NO;
    private int DPT_RT_SNG_NO;
    private int CASH_FEE;
    private String FED_DOC_ID;
    private int HIS_NO;
    private Date LST_IB_IL;
    private String LST_TIME;
    private Date SELF_MNG_IL;
    private int CHECK1_AMT;
    private int CHECK2_AMT;
    private int CHECK3_AMT;
    private int CHECK1_AAMT;
    private int CHECK2_AAMT;
    private int CHECK3_AAMT;
    private String CHNL_REF_NO;
    private int CHNL_HIS_NO;
    private int ETC_FEE1;
    private String OLD_TRX_NO;
    private Date FROM_DT;
    private Date TO_DT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_TRAN_DTO() {
    }
} 
