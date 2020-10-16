package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_EPB_RPT_DTO {
    private String REF_NO;
    private String ACR_NO;
    private int HIS_NO;
    private String MNG_BR;
    private String TR_CCY;
    private int BG_DR_AMT;
    private int BG_CR_AMT;
    private int PL_DR_AMT;
    private int PL_CR_AMT;
    private String BUSI_CD;
    private String BUSI_GRP_CD;
    private String PL_CD;
    private String MNG_YR;
    private Date ACR_FM_DT;
    private Date ACR_TO_DT;
    private int ACR_AMT;
    private int TR_BAMT;
    private int BIZ_SEQ;
    private int BIZ_SUB_SEQ;
    private Date TR_DT;
    private String TR_GB;
    private String TR_CD;
    private String ACR_STS;
    private String DN_GB;
    private String REMARK;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_EPB_RPT_DTO() {
    }
} 
