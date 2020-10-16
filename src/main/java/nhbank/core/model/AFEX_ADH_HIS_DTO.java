package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_ADH_HIS_DTO {
    private String ADV_NO;
    private int HIS_NO;
    private int BASE_SEQ;
    private int AMEND_SEQ;
    private int EDI_SEQ;
    private String STS;
    private String TR_GB;
    private String TR_CD;
    private String TR_BR;
    private String BR_NO;
    private int AMD_CNT;
    private String CIX_NO;
    private String BUSEO_NO;
    private String IBGM_MD;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private String EDI_FNM;
    private Date EDI_IL;
    private String OPEN_CCY;
    private int OPEN_AMT;
    private int BR_CHARGE;
    private int CHARGE_AMT;
    private String CHARGE_GB;
    private String MNG_NO;
    private String OP_NO;
    private String IB_TIME;
    private String RE_ISSUE;
    private int YD_SEQ;
    private String YD_GUJA;
    private String SD_REF_NO;
    private int SD_HIS_NO;
    private Date ADV_MAKE_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_ADH_HIS_DTO() {
    }
} 
