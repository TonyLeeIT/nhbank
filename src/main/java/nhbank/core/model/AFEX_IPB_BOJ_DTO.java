package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPB_BOJ_DTO {
    private int LGM_SSEQ;
    private int NCU_BE_LGCOM_DS_AMT;
    private String JUNHWAN_GB;
    private String UPD_EMP_NO;
    private int BLD_SEQ;
    private String STS;
    private Date AC_IL;
    private int BE_JUNHWAN_WAMT;
    private Date UPD_DT;
    private String REF_NO;
    private int LGM_SEQ;
    private String IBJI_GB;
    private String REG_EMP_NO;
    private int CHD_AMT;
    private Date REG_DT;
    private String BOJ_GB;
    private Date GIS_IL;
    private int HIS_NO;
    private int BE_LGCOM_DS_AMT;
    private int AMT;
    private Date LST_IB_IL;
    private String NCU_CCY;
    private String CCY;
    private String UPD_TM;
    private int NCU_AMT;
    private int SEQ;
    private String REG_TM;

    public AFEX_IPB_BOJ_DTO() {
    }
} 
