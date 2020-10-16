package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexAdhHis")
@Data
public class AFEX_ADH_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String advNo;
    private int hisNo;
    private int baseSeq;
    private int amendSeq;
    private int ediSeq;
    private String sts;
    private String trGb;
    private String trCd;
    private String trBr;
    private String brNo;
    private int amdCnt;
    private String cixNo;
    private String buseoNo;
    private String ibgmMd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private String ediFnm;
    private Date ediIl;
    private String openCcy;
    private int openAmt;
    private int brCharge;
    private int chargeAmt;
    private String chargeGb;
    private String mngNo;
    private String opNo;
    private String ibTime;
    private String reIssue;
    private int ydSeq;
    private String ydGuja;
    private String sdRefNo;
    private int sdHisNo;
    private Date advMakeIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
