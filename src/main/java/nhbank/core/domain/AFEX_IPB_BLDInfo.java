package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexIpbBld")
@Data
public class AFEX_IPB_BLDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int seq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int amt;
    private int hisNo;
    private String jubGb;
    private String chuGb;
    private int miJan;
    private int lgbBjan;
    private int lgbFjan;
    private String corGb;
    private String blGb;
    private String negoBknm;
    private String setBkcd;
    private String hajaGb;
    private String blNo;
    private Date negoIl;
    private Date blYjubIl;
    private int blkSseq;
    private String manGb;
    private Date tcLisuIl;
    private String cccIjaGb;
    private String budoGb;
    private String yukNo;
    private int depoSeq;
    private String insGamGb;
    private Date insIl;
    private int insAmt;
    private int insJan;
    private Date shipIl;
    private String theirRef;
    private String poGb;
    private String applIn;
    private String rcvIn;
    private String rcvAcctNo;
    private String transGb;
    private String ncuCcy;
    private int ncuAmt;
    private int ncuMiJan;
    private int ncuLgbFjan;
    private int ncuInsAmt;
    private int ncuInsJan;
    private int ijaAmt;
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
