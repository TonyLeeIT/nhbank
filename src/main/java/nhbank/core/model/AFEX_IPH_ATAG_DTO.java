package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPH_ATAG_DTO {
    private String REF_NO;
    private String AMD_SEQ;
    private String TAG_CD;
    private int SEQ;
    private String TEXT01;
    private String TEXT02;
    private String TEXT03;
    private String TEXT04;
    private String TEXT05;
    private String TEXT06;
    private String TEXT07;
    private String TEXT08;
    private String TEXT09;
    private String TEXT10;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPH_ATAG_DTO() {
    }
} 
