package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPB_DJB_DTO {
    private String REF_NO;
    private int SEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private int BAMT;
    private int HIS_NO;
    private String DJB_GB;
    private int JAN;
    private Date LISU_IL;
    private int DJH_GUN;
    private int EXP_GUN;
    private int SH_GUN;
    private int KR_SEQ;
    private int BLK_SSEQ;
    private Date LST_HOI_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_DJB_DTO() {
    }
} 
