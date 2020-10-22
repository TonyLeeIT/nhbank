package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_DPB_YEDEInfo_ID.class)
@Table(name = "ADST_DPB_YEDE")
@Data
public class ADST_DPB_YEDEInfo implements Serializable {
    @Id
    @Column(name = "ACCT_NO")
    private String acctNo;
    @Id
    @Column(name = "MODE_GB")
    private String modeGb;
    @Column(name = "GEJUNG_IL")
    private Date gejungIl;
    @Column(name = "BS_DPT_JAN")
    private BigDecimal bsDptJan;
    @Column(name = "BS_LON_JAN")
    private BigDecimal bsLonJan;
    @Column(name = "BS_JAN")
    private BigDecimal bsJan;
    @Column(name = "DPT_C_IAMT")
    private BigDecimal dptCIamt;
    @Column(name = "DPT_D_IAMT")
    private BigDecimal dptDIamt;
    @Column(name = "DPT_N_IAMT")
    private BigDecimal dptNIamt;
    @Column(name = "DPT_C_JAMT")
    private BigDecimal dptCJamt;
    @Column(name = "DPT_D_JAMT")
    private BigDecimal dptDJamt;
    @Column(name = "DPT_N_JAMT")
    private BigDecimal dptNJamt;
    @Column(name = "LON_C_IAMT")
    private BigDecimal lonCIamt;
    @Column(name = "LON_D_IAMT")
    private BigDecimal lonDIamt;
    @Column(name = "LON_N_IAMT")
    private BigDecimal lonNIamt;
    @Column(name = "LON_C_JAMT")
    private BigDecimal lonCJamt;
    @Column(name = "LON_D_JAMT")
    private BigDecimal lonDJamt;
    @Column(name = "LON_N_JAMT")
    private BigDecimal lonNJamt;
    @Column(name = "JBR_CK1_AMT")
    private BigDecimal jbrCk1Amt;
    @Column(name = "JBR_CK2_AMT")
    private BigDecimal jbrCk2Amt;
    @Column(name = "JBR_CK4_AMT")
    private BigDecimal jbrCk4Amt;
    @Column(name = "TBR_CK1_AMT")
    private BigDecimal tbrCk1Amt;
    @Column(name = "TBR_CK2_AMT")
    private BigDecimal tbrCk2Amt;
    @Column(name = "TBR_CK4_AMT")
    private BigDecimal tbrCk4Amt;
    @Column(name = "REG_EMP_NO")
    private String regEmpNo;
    @Column(name = "REG_DT")
    private Date regDt;
    @Column(name = "REG_TM")
    private String regTm;
    @Column(name = "UPD_EMP_NO")
    private String updEmpNo;
    @Column(name = "UPD_DT")
    private Date updDt;
    @Column(name = "UPD_TM")
    private String updTm;
} 
