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
@Table(name = "adstDpbIntm")
@Data
public class ADST_DPB_INTMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date ibIl;
    private Date gisIl;
    private BigDecimal intSeq;
    private String sts;
    private String trCd;
    private BigDecimal curJan;
    private BigDecimal dsAmt;
    private BigDecimal dsDays;
    private BigDecimal intRt;
    private BigDecimal intAmt;
    private BigDecimal taxRt;
    private BigDecimal taxAmt;
    private Date fromDt;
    private Date toDt;
    private BigDecimal hisNo;
    private Date canIl;
    private String canOpNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
