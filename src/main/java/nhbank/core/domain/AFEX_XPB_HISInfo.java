package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "afexXpbHis")
@Data
public class AFEX_XPB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private String cixNo;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private BigDecimal sdHisNo;
    private String trCcy;
    private BigDecimal trFamt;
    private BigDecimal trBamt;
    private BigDecimal afJan;
    private String feeMd;
    private String trBr;
    private String sdBr;
    private String ibTime;
    private String opNo;
    private String mngNo;
    private String ibjiMd;
    private BigDecimal ydSeq;
    private String ydGuja;
    private String edircvDocNm;
    private Date edircvIl;
    private BigDecimal edircvSeqNo;
    private String edisndDoc1Nm;
    private BigDecimal edisnd1SeqNo;
    private String edisndDoc2Nm;
    private BigDecimal edisnd2SeqNo;
    private String edisndDoc3Nm;
    private BigDecimal edisnd3SeqNo;
    private String edisndDoc4Nm;
    private BigDecimal edisnd4SeqNo;
    private String edisndDoc5Nm;
    private BigDecimal edisnd5SeqNo;
    private BigDecimal bokSeq;
    private String cdSngNo;
    private BigDecimal cdSilSeq;
    private String ftpSngNo;
    private BigDecimal ftpSilSeq;
    private String ijGb;
    private String jichGb;
    private String hijaGb;
    private String plCd;
    private String jichmGb;
    private String hcGb;
    private String bijaGb;
    private BigDecimal beTerm;
    private BigDecimal beHterm;
    private BigDecimal crBamt;
    private Date beLisuIl;
    @Column(name = "BE_HRT")
    private BigDecimal beHrt;
    @Column(name = "BE_H_RT")
    private BigDecimal beHRt;
    private Date beYmanIl;
    private Date beYdcIl;
    private Date beShIl;
    private Date beBudoIl;
    private BigDecimal beFtpRt;
    private BigDecimal beIkisHis;
    private BigDecimal beIkisIj;
    private String beHdSngNo;
    private String bePbrmNo;
    private BigDecimal gitaAmt;
    private BigDecimal caSeq;
    private Date baeseoIl;
    private BigDecimal actpayHisNo1;
    private BigDecimal suspayHisNo1;
    private BigDecimal suspayHisNo2;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
