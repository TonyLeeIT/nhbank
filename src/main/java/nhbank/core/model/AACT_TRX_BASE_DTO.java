package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AACT_TRX_BASE_DTO {
    private Date TRX_IL;
    private String TRX_BR;
    private int TRX_SEQ;
    private String REF_NO;
    private int HIS_NO;
    private String IBF_GB;
    private String ID_NO;
    private String CIX_NO;
    private String BUSEO_NO;
    private String UPMU_CD;
    private String GEOR_CD;
    private String DPYD_GB;
    private String STS;
    private int CAN_HISNO;
    private String ACT_MACH;
    private String ACT_DTYP;
    private String ACT_DSEQ;
    private String ACT_TELL;
    private String ACT_SJUM;
    private String ACT_CJUM;
    private String ACT_MODE;
    private int CCY_CNT;
    private String ACT_BSPL_GB;
    private String ACT_CD;
    private String ACT_CCY;
    private int ACT_AMT;
    private int USD_AMT;
    private int FDC_AMT;
    private int FDC_HDAMT;
    private int APPL_HRT;
    private int BASIC_HRT;
    private int BOOK_HRT;
    private int DEMI_HRT;
    private int GOSI_HRT;
    private String IBJI_MD;
    private int JAKI_AMT;
    private int ETC1_AMT;
    private int ETC2_AMT;
    private int ETC3_AMT;
    private Date AC_IL;
    private Date IB_IL;
    private String IB_TIME;
    private Date GIS_IL;
    private Date CAN_IL;
    private String ILGE_GB;
    private String OP_NO;
    private String MGR_NO;
    private String RM_NO;
    private int BS_CNT;
    private int PL_CNT;
    private String CDSNG_NO;
    private String VIP_GB;
    private String THEIR_REFNO;
    private String PL_ADD_YN;
    private int VOUCHER_NO;
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
