package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomLmtSilhis")
@Data
public class ACOM_LMT_SILHISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private String actCd;
    private String silCcy;
    private int hisNo;
    private String sts;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private String refNo;
    private String silGb;
    private String upmuCd;
    private String georCd;
    private int silAmt;
    private String silPmgb;
    private int silJan;
    private int djgAmt;
    private String djgPmgb;
    private int djgJan;
    private int gurBamt;
    private String gurBpmgb;
    private int gurBjan;
    private int gurFamt;
    private String gurFpmgb;
    private int gurFjan;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String opNo;
    private String mngNo;
    private int trscSeqNo;
    private int trxFamt;
    private int trxBamt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
