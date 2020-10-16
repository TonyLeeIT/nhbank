package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_VOUCHER_DTO {
    private String AC_IL;
    private String AC_BR;
    private String REF_NO;
    private int HIS_NO;
    private String OTHER_REF_NO;
    private String UPMU_CD;
    private String TR_CD;
    private String TRX_NAME;
    private String TRX_DT;
    private String CIX_NO;
    private String CIX_NAME;
    private String TELL_NO;
    private String BENEF;
    private String REMARK;
    private String FREE_TEXT1;
    private String FREE_TEXT2;
    private String FREE_TEXT3;
    private String FREE_TEXT4;
    private String FREE_TEXT5;
    private String FREE_TEXT6;
    private String FREE_TEXT7;
    private String FREE_TEXT8;
    private String PRT_GB;
    private String OP_NO;
    private String OP_NAME;
    private int VOUCHER_NO;
    private int PRT_SEQ;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COM_VOUCHER_DTO() {
    }
} 
