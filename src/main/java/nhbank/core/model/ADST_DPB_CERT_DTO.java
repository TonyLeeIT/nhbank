package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_CERT_DTO {
    private String ACCT_NO;
    private Date IB_IL;
    private int TX_TRX_NO;
    private String STS;
    private String PRT_KIND;
    private String DR_OPNO;
    private String DR_TIME;
    private String REMARK;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_CERT_DTO() {
    }
} 
