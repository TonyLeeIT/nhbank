package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_EPB_RPT_DTO {
    private String REF_NO;
    private String ACR_NO;
    private BigDecimal HIS_NO;
    private String MNG_BR;
    private String TR_CCY;
    private BigDecimal BG_DR_AMT;
    private BigDecimal BG_CR_AMT;
    private BigDecimal PL_DR_AMT;
    private BigDecimal PL_CR_AMT;
    private String BUSI_CD;
    private String BUSI_GRP_CD;
    private String PL_CD;
    private String MNG_YR;
    private Date ACR_FM_DT;
    private Date ACR_TO_DT;
    private BigDecimal ACR_AMT;
    private BigDecimal TR_BAMT;
    private BigDecimal BIZ_SEQ;
    private BigDecimal BIZ_SUB_SEQ;
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
