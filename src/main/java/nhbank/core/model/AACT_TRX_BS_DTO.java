package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AACT_TRX_BS_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private BigDecimal SEG_SEQ;
    private String REF_NO2;
    private String ORG_GB;
    private String ILGE_GB;
    private String YD_GB;
    private String PST_GB;
    private String IBF_GB;
    private String POS_GB;
    private Date ACT_IL;
    private String ACT_BR;
    private String BS_CCY;
    private String FBS_CD;
    private String BBS_CD;
    private String MBS_BSPL;
    private String MBS_CD;
    private String IBJI_CD;
    private String SLIP_GB;
    private String JUKI_GB;
    private BigDecimal FAMT;
    private BigDecimal BAMT;
    private BigDecimal APPL_HRT;
    private BigDecimal BASIC_HRT;
    private BigDecimal BOOK_HRT;
    private BigDecimal DEMI_HRT;
    private BigDecimal GOSI_HRT;
    private BigDecimal FTP_RT;
    private String CD_SNG_NO;
    private String YD_DSFG;
    private String YD_REFNO;
    private BigDecimal YD_HISNO;
    private String DOC_ID;
    private String REMARK;
    private String MSG_TYPE;
    private String DP_NO;
    private String DEPO_CD;
    private Date VALUE_IL;
    private String SNG_NO;
    private String ABA_NO;
    private String CHECK_NO;
    private String THEIR_REFNO;
    private String IFRS_DV_CD;
    private String DTLS_BAL_DV_CD;
    private BigDecimal BAL_AMT;
    private String ID_NO;
    private String CIX_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AACT_TRX_BS_DTO() {
    }
} 
