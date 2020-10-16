package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_EPB_RPT")
@Data
public class ACOM_EPB_RPTInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String acrNo;
    private BigDecimal hisNo;
    private String mngBr;
    private String trCcy;
    private BigDecimal bgDrAmt;
    private BigDecimal bgCrAmt;
    private BigDecimal plDrAmt;
    private BigDecimal plCrAmt;
    private String busiCd;
    private String busiGrpCd;
    private String plCd;
    private String mngYr;
    private Date acrFmDt;
    private Date acrToDt;
    private BigDecimal acrAmt;
    private BigDecimal trBamt;
    private BigDecimal bizSeq;
    private BigDecimal bizSubSeq;
    private Date trDt;
    private String trGb;
    private String trCd;
    private String acrSts;
    private String dnGb;
    private String remark;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
