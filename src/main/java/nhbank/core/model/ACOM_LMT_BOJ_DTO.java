package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_LMT_BOJ_DTO {
    private String SNG_NO;
    private BigDecimal SEQ;
    private String STS;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private String TR_GWAM;
    private String TR_GEOR;
    private String CCY;
    private BigDecimal AMT;
    private String IBJI_GB;
    private String CCY_GB;
    private String BOJ_GB;
    private String IB_TIME;
    private String TR_BR;
    private String OP_NO;
    private String MNG_NO;
    private String IBJI_MD;
    private String GEOJU_GB;
    private String YD_GUJA;
    private String DAMBO_NO;
    private String CD_SNG_NO;
    private BigDecimal CD_SIL_SEQ;
    private String REL_REF_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private BigDecimal APPL_HRT;
    private String PAY_CCY;
    private BigDecimal PAY_AMT;
    private BigDecimal CAN_HIS_NO;
    private BigDecimal REL_HIS_NO;
    private BigDecimal CPTY_SEQ;
    private String LINK_REF_NO;
    private String REMARK;

    public ACOM_LMT_BOJ_DTO() {
    }
} 
