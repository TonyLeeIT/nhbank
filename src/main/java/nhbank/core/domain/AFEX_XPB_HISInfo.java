package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexXpbHis")
@Data
public class AFEX_XPB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private String cixNo;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private int sdHisNo;
    private String trCcy;
    private int trFamt;
    private int trBamt;
    private int afJan;
    private String feeMd;
    private String trBr;
    private String sdBr;
    private String ibTime;
    private String opNo;
    private String mngNo;
    private String ibjiMd;
    private int ydSeq;
    private String ydGuja;
    private String edircvDocNm;
    private Date edircvIl;
    private int edircvSeqNo;
    private String edisndDoc1Nm;
    private int edisnd1SeqNo;
    private String edisndDoc2Nm;
    private int edisnd2SeqNo;
    private String edisndDoc3Nm;
    private int edisnd3SeqNo;
    private String edisndDoc4Nm;
    private int edisnd4SeqNo;
    private String edisndDoc5Nm;
    private int edisnd5SeqNo;
    private int bokSeq;
    private String cdSngNo;
    private int cdSilSeq;
    private String ftpSngNo;
    private int ftpSilSeq;
    private String ijGb;
    private String jichGb;
    private String hijaGb;
    private String plCd;
    private String jichmGb;
    private String hcGb;
    private String bijaGb;
    private int beTerm;
    private int beHterm;
    private int crBamt;
    private Date beLisuIl;
    private int beHrt;
    private int beHRt;
    private Date beYmanIl;
    private Date beYdcIl;
    private Date beShIl;
    private Date beBudoIl;
    private int beFtpRt;
    private int beIkisHis;
    private int beIkisIj;
    private String beHdSngNo;
    private String bePbrmNo;
    private int gitaAmt;
    private int caSeq;
    private Date baeseoIl;
    private int actpayHisNo1;
    private int suspayHisNo1;
    private int suspayHisNo2;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
