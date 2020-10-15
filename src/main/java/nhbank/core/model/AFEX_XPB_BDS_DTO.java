package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_XPB_BDS_DTO {
    private String UPD_EMP_NO;
    private int BD_IJA;
    private int SONIK_AMT;
    private int HC_HIJA;
    private int BUDO_SEQ;
    private String STS;
    private Date AC_IL;
    private Date UPD_DT;
    private int HDC_AMT;
    private String REF_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private Date GIS_IL;
    private int HIS_NO;
    private int NCU_HDC_AMT;
    private int AMT;
    private Date LST_IB_IL;
    private int NCU_CA_SUM_AMT;
    private int BDC_AMT;
    private String NCU_CCY;
    private int CA_SUM_AMT;
    private String H_JI_GB;
    private String SONIK_GB;
    private String CCY;
    private int BAMT;
    private String UPD_TM;
    private int NCU_AMT;
    private String REG_TM;

    public AFEX_XPB_BDS_DTO() {
    }
} 
