package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_LNB_HIS")
@Data
public class ADST_LNB_HISInfo implements Serializable {
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
    private String sndDocNo;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String userId;
    private String managerId;
    private String ibjiMd;
    private String ydGuja;
    private String cdSngNo;
    private int cdSilSeq;
    private String ftpSngNo;
    private int ftpSilSeq;
    private Date lstIbIl;
    private Date bfLrepayIl;
    private Date bfNrepayIl;
    private Date bfLisuIl;
    private Date bfLiibIl;
    private Date bfNisuIl;
    private Date bfNrollIl;
    private Date bfPycIl;
    private Date bfIycIl;
    private int bfRepaySeq;
    private int bfIntSeq;
    private int bfMsbSeq;
    private int bfLstRt;
    private int bfMisuAmt;
    private String shJagumGb;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
