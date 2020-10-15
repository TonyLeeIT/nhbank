package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_FPHEAD_DTO {
    private String OP_NO;
    private Date REG_DT;
    private String OP_NM;
    private String TR_CD;
    private int HIS_NO;
    private String UPMU_CD;
    private String UPD_EMP_NO;
    private String HEAD_TXT;
    private String CIX_NO;
    private String TELL_NM;
    private String PRT_KIND;
    private String TELL_NO;
    private Date UPD_DT;
    private String REF_NO;
    private String TITLE_TXT;
    private Date TX_DATE;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public ACOM_COM_FPHEAD_DTO() {
    }
} 
