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
    private int hisNo;
    private String mngBr;
    private String trCcy;
    private int bgDrAmt;
    private int bgCrAmt;
    private int plDrAmt;
    private int plCrAmt;
    private String busiCd;
    private String busiGrpCd;
    private String plCd;
    private String mngYr;
    private Date acrFmDt;
    private Date acrToDt;
    private int acrAmt;
    private int trBamt;
    private int bizSeq;
    private int bizSubSeq;
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
