package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_DPB_HISInfo_ID.class)
@Table(name = "ADST_DPB_HIS")
@Data
public class ADST_DPB_HISInfo implements Serializable {
    @Id
    @Column(name = "ACCT_NO")
    private String acctNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "PROCESS_CD")
    private String processCd;
    @Column(name = "MECH_GB")
    private String mechGb;
    @Column(name = "SD_HIS_NO")
    private BigDecimal sdHisNo;
    @Column(name = "TR_AMT")
    private BigDecimal trAmt;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "SD_BR")
    private String sdBr;
    @Column(name = "MNG_BR")
    private String mngBr;
    @Column(name = "TR_TIME")
    private String trTime;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "MNG_NO")
    private String mngNo;
    @Column(name = "AF_JAN")
    private BigDecimal afJan;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "CHNL_REF_NO")
    private String chnlRefNo;
    @Column(name = "CHNL_HIS_NO")
    private BigDecimal chnlHisNo;
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
