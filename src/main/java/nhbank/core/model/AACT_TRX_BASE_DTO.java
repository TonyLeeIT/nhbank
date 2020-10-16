package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AACT_TRX_BASE_DTO {
    private Date TRX_IL;
    private String TRX_BR;
    private BigDecimal TRX_SEQ;
    private String REF_NO;
    private BigDecimal HIS_NO;
    private String IBF_GB;
    private String ID_NO;
    private String CIX_NO;
    private String BUSEO_NO;
    private String UPMU_CD;
    private String GEOR_CD;
    private String DPYD_GB;
    private String STS;
    private BigDecimal CAN_HISNO;
    private String ACT_MACH;
    private String ACT_DTYP;
    private String ACT_DSEQ;
    private String ACT_TELL;
    private String ACT_SJUM;
    private String ACT_CJUM;
    private String ACT_MODE;
    private BigDecimal CCY_CNT;
    private String ACT_BSPL_GB;
    private String ACT_CD;
    private String ACT_CCY;
    private BigDecimal ACT_AMT;
    private BigDecimal USD_AMT;
    private BigDecimal FDC_AMT;
    private BigDecimal FDC_HDAMT;
    private BigDecimal APPL_HRT;
    private BigDecimal BASIC_HRT;
    private BigDecimal BOOK_HRT;
    private BigDecimal DEMI_HRT;
    private BigDecimal GOSI_HRT;
    private String IBJI_MD;
    private BigDecimal JAKI_AMT;
    private BigDecimal ETC1_AMT;
    private BigDecimal ETC2_AMT;
    private BigDecimal ETC3_AMT;
    private Date AC_IL;
    private Date IB_IL;
    private String IB_TIME;
    private Date GIS_IL;
    private Date CAN_IL;
    private String ILGE_GB;
    private String OP_NO;
    private String MGR_NO;
    private String RM_NO;
    private BigDecimal BS_CNT;
    private BigDecimal PL_CNT;
    private String CDSNG_NO;
    private String VIP_GB;
    private String THEIR_REFNO;
    private String PL_ADD_YN;
    private BigDecimal VOUCHER_NO;
    private String POS_KIND;
    private String GLOB_ID;
    private String IFRS_DV_CD;
    private String ACT_EVNT_CD_CTT;
    private String ACT_APLY_DV_CD;
    private String ACT_OVRD_APLY_CD;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AACT_TRX_BASE_DTO() {
    }
} 
