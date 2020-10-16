package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_BASE_DTO {
    private String CD;
    private String BKCD;
    private String CCY;
    private String ATTEN_NO;
    private String BKNM;
    private String DEPO_TYPE;
    private Date DEPO_IL;
    private String DEPO_56A;
    private String DEPO_57A;
    private String CTRY_CD;
    private String DEPO_ETC1;
    private String DEPO_ETC2;
    private String DEPO_ETC3;
    private String RECON_YN;
    private Date MAKE_IL;
    private Date CHNG_IL;
    private String OP_NO;
    private String MNGR_NO;
    private String STS;
    private String AF_CD;
    private String MNG_BR;
    private String CBS_CD;
    private String DBS_CD;
    private String VOSTRO_YN;
    private int MK950_SEQ;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RCH_BASE_DTO() {
    }
} 
