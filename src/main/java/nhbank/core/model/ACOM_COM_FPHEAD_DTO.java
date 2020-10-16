package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_FPHEAD_DTO {
    private String REF_NO;
    private int HIS_NO;
    private String PRT_KIND;
    private String UPMU_CD;
    private String TR_CD;
    private Date TX_DATE;
    private String CIX_NO;
    private String TITLE_TXT;
    private String HEAD_TXT;
    private String TELL_NO;
    private String TELL_NM;
    private String OP_NO;
    private String OP_NM;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COM_FPHEAD_DTO() {
    }
} 
