package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPB_BOJ_DTO {
    private String REF_NO;
    private int SEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private int AMT;
    private int HIS_NO;
    private String IBJI_GB;
    private String BOJ_GB;
    private int BE_LGCOM_DS_AMT;
    private int LGM_SEQ;
    private int LGM_SSEQ;
    private int BLD_SEQ;
    private String NCU_CCY;
    private int NCU_AMT;
    private int NCU_BE_LGCOM_DS_AMT;
    private int CHD_AMT;
    private String JUNHWAN_GB;
    private int BE_JUNHWAN_WAMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_BOJ_DTO() {
    }
} 
