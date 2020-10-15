package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_DTG_CONT_STS_DTO {
    private Date REG_DT;
    private String UPD_EMP_NO;
    private String ACCT_NO;
    private Date TRX_DT;
    private String BF_CONT_STS;
    private String AF_CONT_STS;
    private int SEQ_NO;
    private Date UPD_DT;
    private String REF_NO;
    private String BR_NO;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public ACOM_DTG_CONT_STS_DTO() {
    }
} 
