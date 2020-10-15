package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_LMT_ITM")
@Data
public class ACOM_LMT_ITMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String BE_AITM01;
    private String BE_AITM02;
    private String AF_AITM02;
    private String AF_AITM01;
    private String AF_AITM04;
    private String AF_AITM03;
    private int BE_NITM;
    private String UPD_EMP_NO;
    private int AF_NITM;
    private Date AC_IL;
    private Date UPD_DT;
    private String SNG_NO;
    private String REG_EMP_NO;
    private String BE_AITM10;
    private Date REG_DT;
    private Date GIS_IL;
    private String AF_AITM10;
    private Date LST_IB_IL;
    private String ITM_CD;
    private String BE_AITM07;
    private String AF_AITM06;
    private String BE_AITM08;
    private String AF_AITM05;
    private String TR_GB;
    private String BE_AITM09;
    private String AF_AITM08;
    private String AF_AITM07;
    private String BE_AITM03;
    private String UPD_TM;
    private String BE_AITM04;
    private String AF_AITM09;
    private int SEQ;
    private String BE_AITM05;
    private String BE_AITM06;
    private String REG_TM;
} 
