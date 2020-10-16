package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_FAB_HIS")
@Data
public class ACOM_FAB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private int sdHisNo;
    private String trCcy;
    private int trFamt;
    private int trBamt;
    private int salAmt;
    private int evenAmt;
    private int depriAmt;
    private int sellAmt;
    private int plAmt;
    private int afJan;
    private int afDepriJan;
    private int depriJan;
    private int thisDepriJan;
    private int lastDepriJan;
    private int capitalJan;
    private int dispJan;
    private Date depriIl;
    private Date bfrDepriIl;
    private String ilgeYn;
    private String remark;
    private String bgRefNo;
    private String trBr;
    private String sdBr;
    private String ibTime;
    private String opNo;
    private String mngNo;
    private String cdSngNo;
    private int cdSilSeq;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
