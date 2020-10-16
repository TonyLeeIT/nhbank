package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_XPB_LGM_DTO {
    private String REF_NO;
    private int HIS_NO;
    private String STS;
    private String TR_BR;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String HAJA_CD;
    private String HAJA_MNG_INFO;
    private String MJ_GB;
    private String TR_TIME;
    private int OP_NO;
    private String HAJA_SAYU;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPB_LGM_DTO() {
    }
} 
