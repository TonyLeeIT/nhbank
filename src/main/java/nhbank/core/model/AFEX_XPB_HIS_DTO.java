package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPB_HIS_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private String STS;
    private String TR_GB;
    private String TR_CD;
    private String CIX_NO;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private BigDecimal SD_HIS_NO;
    private String TR_CCY;
    private BigDecimal TR_FAMT;
    private BigDecimal TR_BAMT;
    private BigDecimal AF_JAN;
    private String FEE_MD;
    private String TR_BR;
    private String SD_BR;
    private String IB_TIME;
    private String OP_NO;
    private String MNG_NO;
    private String IBJI_MD;
    private BigDecimal YD_SEQ;
    private String YD_GUJA;
    private String EDIRCV_DOC_NM;
    private Date EDIRCV_IL;
    private BigDecimal EDIRCV_SEQ_NO;
    private String EDISND_DOC1_NM;
    private BigDecimal EDISND1_SEQ_NO;
    private String EDISND_DOC2_NM;
    private BigDecimal EDISND2_SEQ_NO;
    private String EDISND_DOC3_NM;
    private BigDecimal EDISND3_SEQ_NO;
    private String EDISND_DOC4_NM;
    private BigDecimal EDISND4_SEQ_NO;
    private String EDISND_DOC5_NM;
    private BigDecimal EDISND5_SEQ_NO;
    private BigDecimal BOK_SEQ;
    private String CD_SNG_NO;
    private BigDecimal CD_SIL_SEQ;
    private String FTP_SNG_NO;
    private BigDecimal FTP_SIL_SEQ;
    private String IJ_GB;
    private String JICH_GB;
    private String HIJA_GB;
    private String PL_CD;
    private String JICHM_GB;
    private String HC_GB;
    private String BIJA_GB;
    private BigDecimal BE_TERM;
    private BigDecimal BE_HTERM;
    private BigDecimal CR_BAMT;
    private Date BE_LISU_IL;
    private BigDecimal BE_HRT;
    private BigDecimal BE_H_RT;
    private Date BE_YMAN_IL;
    private Date BE_YDC_IL;
    private Date BE_SH_IL;
    private Date BE_BUDO_IL;
    private BigDecimal BE_FTP_RT;
    private BigDecimal BE_IKIS_HIS;
    private BigDecimal BE_IKIS_IJ;
    private String BE_HD_SNG_NO;
    private String BE_PBRM_NO;
    private BigDecimal GITA_AMT;
    private BigDecimal CA_SEQ;
    private Date BAESEO_IL;
    private BigDecimal ACTPAY_HIS_NO1;
    private BigDecimal SUSPAY_HIS_NO1;
    private BigDecimal SUSPAY_HIS_NO2;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPB_HIS_DTO() {
    }
} 
