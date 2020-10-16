package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPB_AMD")
@Data
public class AFEX_XPB_AMDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int seqNo;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIl;
    private Date lstIbIl;
    private Date canIl;
    private int hisNo;
    private String beTenorGb;
    private String beReneReqGb;
    private String beNegoGb;
    private String beHjIlCd;
    private Date beManGijIl;
    private int beHijaTerm;
    private int beUsanceTerm;
    private Date beYmanIl;
    private Date beMoJubIl;
    private Date beLstIsuIl;
    private String beWhanRcvGb;
    private int beWhanFrt;
    private int beIntAmt;
    private String afTenorGb;
    private String afReneReqGb;
    private String afNegoGb;
    private String afHjIlCd;
    private Date afManGijIl;
    private int afHijaTerm;
    private int afUsanceTerm;
    private Date afYmanIl;
    private Date afMoJubIl;
    private Date afLstIsuIl;
    private String afWhanRcvGb;
    private int afWhanFrt;
    private int afIntAmt;
    private String opNo;
    private String mngNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
