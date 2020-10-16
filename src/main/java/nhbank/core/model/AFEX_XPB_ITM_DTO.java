package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_XPB_ITM_DTO {
    private String REF_NO;
    private int HIS_NO;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String DR_GB;
    private String ITM_CD;
    private String BE_ITM;
    private String AF_ITM;
    private int BE_ITM1;
    private int AF_ITM1;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPB_ITM_DTO() {
    }
} 
