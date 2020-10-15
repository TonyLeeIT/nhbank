package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPB_DJB_DTO {
    private Date REG_DT;
    private Date GIS_IL;
    private String DJB_GB;
    private int HIS_NO;
    private Date LISU_IL;
    private String UPD_EMP_NO;
    private Date LST_IB_IL;
    private int KR_SEQ;
    private int BLK_SSEQ;
    private int DJH_GUN;
    private int EXP_GUN;
    private String STS;
    private Date AC_IL;
    private int SH_GUN;
    private Date UPD_DT;
    private int JAN;
    private String REF_NO;
    private String CCY;
    private int BAMT;
    private Date LST_HOI_IL;
    private String UPD_TM;
    private int SEQ;
    private String REG_EMP_NO;
    private String REG_TM;

    public AFEX_IPB_DJB_DTO() {
    }
} 
