package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_YEDE")
@Data
public class ADST_DPB_YEDEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private String modeGb;
    private Date gejungIl;
    private int bsDptJan;
    private int bsLonJan;
    private int bsJan;
    private int dptCIamt;
    private int dptDIamt;
    private int dptNIamt;
    private int dptCJamt;
    private int dptDJamt;
    private int dptNJamt;
    private int lonCIamt;
    private int lonDIamt;
    private int lonNIamt;
    private int lonCJamt;
    private int lonDJamt;
    private int lonNJamt;
    private int jbrCk1Amt;
    private int jbrCk2Amt;
    private int jbrCk4Amt;
    private int tbrCk1Amt;
    private int tbrCk2Amt;
    private int tbrCk4Amt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
