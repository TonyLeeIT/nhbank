package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_BFH_HIS_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private String STS;
    private String TR_GB;
    private String TR_CD;
    private Date IB_IL;
    private Date AC_IL;
    private Date CAN_IL;
    private BigDecimal BEFORE_AMT;
    private BigDecimal AFTER_AMT;
    private String OP_NO;
    private String CIX_NO;
    private BigDecimal SD_HIS_NO;
    private Date GIS_IL;
    private String MNG_BR;
    private String BF_RECV_REF_NO;
    private BigDecimal BF_CH_AMT;
    private String BF_RECV_BKCD;
    private String BF_RECV_DEPO;
    private String BF_BASE_STS;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_BFH_HIS_DTO() {
    }
} 
