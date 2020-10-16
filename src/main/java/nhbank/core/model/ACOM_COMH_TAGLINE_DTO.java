package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COMH_TAGLINE_DTO {
    private String DOC_ID;
    private BigDecimal SEQ_NO;
    private String LINE_TYPE;
    private String TAG_NO;
    private BigDecimal SUB_NO;
    private String LINE_DATA;
    private String TAG_GB;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COMH_TAGLINE_DTO() {
    }
} 
