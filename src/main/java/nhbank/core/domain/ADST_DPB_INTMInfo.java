package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstDpbIntm")
@Data
public class ADST_DPB_INTMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date ibIl;
    private Date gisIl;
    private int intSeq;
    private String sts;
    private String trCd;
    private int curJan;
    private int dsAmt;
    private int dsDays;
    private int intRt;
    private int intAmt;
    private int taxRt;
    private int taxAmt;
    private Date fromDt;
    private Date toDt;
    private int hisNo;
    private Date canIl;
    private String canOpNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
