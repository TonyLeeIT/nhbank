package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RTB_BASE_DTO {
    private String REF_NO;
    private String CIX_NO;
    private String CIX_NM;
    private String BUY_CCY;
    private int BUY_FAMT;
    private String SEL_CCY;
    private int SEL_FAMT;
    private int EX_HRT;
    private String RATE_AMT_GB;
    private String FRT_GB;
    private int FRT_RT;
    private int FRT_AMT;
    private Date AC_IL;
    private Date LST_IB_IL;
    private String ID_NO;
    private String NATION_CD;
    private String REMARK;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String SAYU_CD;

    public AFEX_RTB_BASE_DTO() {
    }
} 
