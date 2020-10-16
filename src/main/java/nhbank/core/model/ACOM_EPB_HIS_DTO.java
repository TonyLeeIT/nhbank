package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_EPB_HIS_DTO {
    private String REF_NO;
    private int HIS_NO;
    private String STS;
    private String TR_GB;
    private String TR_CD;
    private String DN_GB;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private int SD_HIS_NO;
    private String TR_CCY;
    private int TR_FAMT;
    private int TR_BAMT;
    private int AF_JAN;
    private String TR_BR;
    private String SD_BR;
    private String AUTO_YN;
    private String CPTY_NM;
    private String REMARK;
    private String SD_BUSI_CD;
    private String SD_REF_NO;
    private int SD_HIS;
    private String IB_TIME;
    private String OP_NO;
    private String MNG_NO;
    private String CD_SNG_NO;
    private int CD_SIL_SEQ;
    private int TR_TAX;
    private int ASSIGN_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String LINK_REF_NO;
    private String LINK_TYPE;
    private String PAY_REF_NO;
    private String TAX_CODE;
    private int TAX_RATE;

    public ACOM_EPB_HIS_DTO() {
    }
} 
