package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "adstDpbYede")
@Data
public class ADST_DPB_YEDEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private String modeGb;
    private Date gejungIl;
    private BigDecimal bsDptJan;
    private BigDecimal bsLonJan;
    private BigDecimal bsJan;
    private BigDecimal dptCIamt;
    private BigDecimal dptDIamt;
    private BigDecimal dptNIamt;
    private BigDecimal dptCJamt;
    private BigDecimal dptDJamt;
    private BigDecimal dptNJamt;
    private BigDecimal lonCIamt;
    private BigDecimal lonDIamt;
    private BigDecimal lonNIamt;
    private BigDecimal lonCJamt;
    private BigDecimal lonDJamt;
    private BigDecimal lonNJamt;
    private BigDecimal jbrCk1Amt;
    private BigDecimal jbrCk2Amt;
    private BigDecimal jbrCk4Amt;
    private BigDecimal tbrCk1Amt;
    private BigDecimal tbrCk2Amt;
    private BigDecimal tbrCk4Amt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
