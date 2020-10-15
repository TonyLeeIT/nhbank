package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_TRAN")
@Data
public class ADST_DPB_TRANInfo implements Serializable {
    @Id
    @GeneratedValue
    private String OLD_TRX_NO;
    private int DPT_RT;
    private int BOOK_HRT;
    private int TRX_NO;
    private String TR_CD;
    private int PJ_HRT;
    private String UPD_EMP_NO;
    private String YD_GB;
    private String REQ_CUST_ID;
    private int TAX3_AMT;
    private int CHECK3_AAMT;
    private String CASH_TR_GB;
    private String MECH_GB;
    private int TAX1_AMT;
    private int DPT_RT_SNG_NO;
    private Date TO_DT;
    private String STS;
    private Date UPD_DT;
    private String FX_TR_GB;
    private Date SELF_MNG_IL;
    private int ETC_FEE1;
    private Date FROM_DT;
    private String IBGM_SLIP_GB;
    private String NO_PBOOK_GB;
    private String IBJI_GB;
    private int TAX2_AMT;
    private int CHECK2_AAMT;
    private String REG_EMP_NO;
    private String OP_NO;
    private Date GIS_IL;
    private String YD_REF_NO;
    private int CHNL_HIS_NO;
    private int HIS_NO;
    private int EX_RT_SNG_NO;
    private String LST_TIME;
    private int INT_PAY_CNT;
    private int AF_JAN;
    private Date IB_IL;
    private int CHECK1_AAMT;
    private String TR_TIME;
    private String TSEQ_NO;
    private Date BF_INT_RCV_IL;
    private String SLIP_GB;
    private int TR_AAMT;
    private String MNG_BR;
    private int BASIC_HRT;
    private String TR_CCY;
    private String TAX_SLIP_GB;
    private String YD_THEIR_REF_NO;
    private String JIGB_YD_GB;
    private String CHK_YD_GB;
    private String SD_BK;
    private int TOT_FEE;
    private int APPL_HRT;
    private String ACCT_NO;
    private String INT_SLIP_GB;
    private String SUB_TR_CD;
    private Date AC_IL;
    private String NO_PRINT_GB;
    private int CHECK3_AMT;
    private String CHK_GB;
    private int GOSI_HRT;
    private int DEMI_HRT;
    private String REMARK;
    private Date REG_DT;
    private int TR_AMT;
    private int CHECK2_AMT;
    private Date LST_IB_IL;
    private String CHNL_REF_NO;
    private String PRINT_GB;
    private String TR_BK;
    private int YD_HIS_NO;
    private int CASH_FEE;
    private String CHK_NO;
    private String FED_DOC_ID;
    private int CHECK1_AMT;
    private String TR_BR;
    private int TAX4_AMT;
    private Date BF_INT_CAL_IL;
    private String UPD_TM;
    private String MUINJA_GB;
    private String FUND_GB;
    private String REG_TM;
} 
