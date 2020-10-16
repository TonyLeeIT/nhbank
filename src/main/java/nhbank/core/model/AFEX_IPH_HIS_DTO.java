package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPH_HIS_DTO {
    private String REF_NO;
    private int SEQ_NO;
    private int HIS_NO;
    private String STS;
    private String TR_GB;
    private String GWAM_CD;
    private String TR_CD;
    private String DOC_ID1;
    private String DOC_ID2;
    private String DOC_ID3;
    private String DOC_ID4;
    private int AMD_SEQ;
    private Date IB_IL;
    private Date CAN_IL;
    private int SD_HIS_NO;
    private String TR_BR;
    private String IB_TIME;
    private String OP_NO;
    private String MNG_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPH_HIS_DTO() {
    }
} 
