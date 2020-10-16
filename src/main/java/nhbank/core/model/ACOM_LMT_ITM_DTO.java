package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_LMT_ITM_DTO {
    private String SNG_NO;
    private int SEQ;
    private String TR_GB;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String ITM_CD;
    private String BE_AITM01;
    private String BE_AITM02;
    private String BE_AITM03;
    private String BE_AITM04;
    private String BE_AITM05;
    private String BE_AITM06;
    private String BE_AITM07;
    private String BE_AITM08;
    private String BE_AITM09;
    private String BE_AITM10;
    private String AF_AITM01;
    private String AF_AITM02;
    private String AF_AITM03;
    private String AF_AITM04;
    private String AF_AITM05;
    private String AF_AITM06;
    private String AF_AITM07;
    private String AF_AITM08;
    private String AF_AITM09;
    private String AF_AITM10;
    private int BE_NITM;
    private int AF_NITM;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_LMT_ITM_DTO() {
    }
} 
