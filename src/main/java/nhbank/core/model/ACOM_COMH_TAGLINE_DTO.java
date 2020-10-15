package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COMH_TAGLINE_DTO {
    private String DOC_ID;
    private Date REG_DT;
    private String LINE_TYPE;
    private String UPD_EMP_NO;
    private String TAG_NO;
    private String TAG_GB;
    private int SUB_NO;
    private String LINE_DATA;
    private int SEQ_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public ACOM_COMH_TAGLINE_DTO() {
    }
} 
