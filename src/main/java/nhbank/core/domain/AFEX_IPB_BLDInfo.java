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
@Table(name = "afexIpbBld")
@Data
public class AFEX_IPB_BLDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal seq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private BigDecimal amt;
    private BigDecimal hisNo;
    private String jubGb;
    private String chuGb;
    private BigDecimal miJan;
    private BigDecimal lgbBjan;
    private BigDecimal lgbFjan;
    private String corGb;
    private String blGb;
    private String negoBknm;
    private String setBkcd;
    private String hajaGb;
    private String blNo;
    private Date negoIl;
    private Date blYjubIl;
    private BigDecimal blkSseq;
    private String manGb;
    private Date tcLisuIl;
    private String cccIjaGb;
    private String budoGb;
    private String yukNo;
    private BigDecimal depoSeq;
    private String insGamGb;
    private Date insIl;
    private BigDecimal insAmt;
    private BigDecimal insJan;
    private Date shipIl;
    private String theirRef;
    private String poGb;
    private String applIn;
    private String rcvIn;
    private String rcvAcctNo;
    private String transGb;
    private String ncuCcy;
    private BigDecimal ncuAmt;
    private BigDecimal ncuMiJan;
    private BigDecimal ncuLgbFjan;
    private BigDecimal ncuInsAmt;
    private BigDecimal ncuInsJan;
    private BigDecimal ijaAmt;
    private String yjInsIl;
    private String yjManIl;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private String remark6;
    private String remark7;
    private String remark8;
    private String remark9;
    private String remark10;
    private String remark11;
    private String remark12;
    private String remark13;
    private String remark14;
    private String remark15;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
