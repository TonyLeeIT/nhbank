package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPB_HIS")
@Data
public class AFEX_XPB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private int EDISND1_SEQ_NO;
    private String TR_CD;
    private String HIJA_GB;
    private String MNG_NO;
    private String UPD_EMP_NO;
    private String HC_GB;
    private int GITA_AMT;
    private String CD_SNG_NO;
    private String PL_CD;
    private String STS;
    private int BE_TERM;
    private int TR_BAMT;
    private Date UPD_DT;
    private int BE_HRT;
    private int TR_FAMT;
    private int EDISND4_SEQ_NO;
    private String IB_TIME;
    private int EDISND2_SEQ_NO;
    private int EDISND3_SEQ_NO;
    private int EDISND5_SEQ_NO;
    private String IJ_GB;
    private Date CAN_IL;
    private int FTP_SIL_SEQ;
    private String REG_EMP_NO;
    private String OP_NO;
    private String EDISND_DOC5_NM;
    private Date GIS_IL;
    private int SD_HIS_NO;
    private Date BE_YDC_IL;
    private int BE_FTP_RT;
    private int HIS_NO;
    private String YD_GUJA;
    private int AF_JAN;
    private Date IB_IL;
    private int SUSPAY_HIS_NO1;
    private String EDIRCV_DOC_NM;
    private int SUSPAY_HIS_NO2;
    private int ACTPAY_HIS_NO1;
    private Date BAESEO_IL;
    private Date BE_SH_IL;
    private String BE_PBRM_NO;
    private String TR_CCY;
    private int YD_SEQ;
    private String EDISND_DOC4_NM;
    private int BE_IKIS_IJ;
    private Date EDIRCV_IL;
    private int CA_SEQ;
    private String SD_BR;
    private int CD_SIL_SEQ;
    private Date BE_LISU_IL;
    private Date AC_IL;
    private Date BE_BUDO_IL;
    private int EDIRCV_SEQ_NO;
    private String REF_NO;
    private String FTP_SNG_NO;
    private String EDISND_DOC1_NM;
    private String JICHM_GB;
    private Date REG_DT;
    private String IBJI_MD;
    private String BIJA_GB;
    private String EDISND_DOC3_NM;
    private int BE_H_RT;
    private int BE_IKIS_HIS;
    private String JICH_GB;
    private int BOK_SEQ;
    private String CIX_NO;
    private int BE_HTERM;
    private String FEE_MD;
    private String TR_BR;
    private String TR_GB;
    private String EDISND_DOC2_NM;
    private String BE_HD_SNG_NO;
    private Date BE_YMAN_IL;
    private String UPD_TM;
    private int CR_BAMT;
    private String REG_TM;
} 
