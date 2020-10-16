package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_CIX_LOCAL_DTO {
    private String CIX_NO;
    private String ITEM_NM;
    private String ITEM_CTT;
    private String REG_DV_CD;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_CIX_LOCAL_DTO() {
    }
} 
