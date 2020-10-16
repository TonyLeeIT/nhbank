package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFIF_MTH_HIS_DTO {
    private String REF_NO;
    private int HIS_NO;
    private String STS;
    private String TR_GB;
    private String TR_CD;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private int SD_HIS_NO;
    private String TR_CCY;
    private int TR_FAMT;
    private int TR_BAMT;
    private int AF_JAN;
    private String SND_DOC_NO;
    private String TR_BR;
    private String SD_BR;
    private String TR_TIME;
    private String USER_ID;
    private String MANAGER_ID;
    private String IBJI_MD;
    private String CD_SNG_NO;
    private int CD_SIL_SEQ;
    private String FTP_SNG_NO;
    private int FTP_SIL_SEQ;
    private Date LST_IB_IL;
    private String FRONT_SND_GB;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFIF_MTH_HIS_DTO() {
    }
} 
