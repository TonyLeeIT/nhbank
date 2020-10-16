package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_XPB_BDS_DTO {
    private String REF_NO;
    private int HIS_NO;
    private int BUDO_SEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private int AMT;
    private int HDC_AMT;
    private int BAMT;
    private int BDC_AMT;
    private int BD_IJA;
    private int HC_HIJA;
    private String H_JI_GB;
    private int CA_SUM_AMT;
    private String SONIK_GB;
    private int SONIK_AMT;
    private String NCU_CCY;
    private int NCU_AMT;
    private int NCU_HDC_AMT;
    private int NCU_CA_SUM_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPB_BDS_DTO() {
    }
} 
