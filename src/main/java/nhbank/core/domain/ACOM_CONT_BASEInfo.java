package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomContBase")
@Data
public class ACOM_CONT_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String cntyCd;
    private String rgnCd;
    private String sts;
    private String inactRsnCd;
    private int lstHisNo;
    private String trcllStCd;
    private String mgntBrNo;
    private String brfcCd;
    private String pfmcMgntBrNo;
    private String idNo;
    private String cixNo;
    private int deptSeqNo;
    private String subjCd;
    private String bnkDvCd;
    private String prdCd;
    private String limApvNo;
    private String curCd;
    private Date trscDt;
    private Date procBascDt;
    private Date ddacRnwDt;
    private Date lstTrscDt;
    private Date contEndDt;
    private String hsCd;
    private String entrMgntNo;
    private int cmltMlgeAmt;
    private String corpScalCd;
    private String thrCntyCd;
    private String oriplCntyCd;
    private String eimpDclNo;
    private String domsOtsdDvCd;
    private String longShtmDvCd;
    private String pfmcDvCd;
    private String astRelnCrpdYn;
    private String dbtAptcYn;
    private String sugtEmpRlcoCd;
    private String sugtEmpNo;
    private String tmanEmpNo;
    private String pbRmOffcrCd;
    private String mastauthDvCd;
    private String subRefNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
