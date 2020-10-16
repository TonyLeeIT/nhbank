package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPB_DJH_DTO {
    private String REF_NO;
    private int SEQ;
    private int SSEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private int BAMT;
    private int IJA_BAMT;
    private int HIS_NO;
    private String HOI_GB;
    private int DS_AMT;
    private int IJA_FRT;
    private int IJA_DS_TERM;
    private Date IJA_FR_IL;
    private Date IJA_TO_IL;
    private Date BE_LST_HOI_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_DJH_DTO() {
    }
} 
