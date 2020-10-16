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
@Table(name = "aactTrxBase")
@Data
public class AACT_TRX_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date trxIl;
    private String trxBr;
    private BigDecimal trxSeq;
    private String refNo;
    private BigDecimal hisNo;
    private String ibfGb;
    private String idNo;
    private String cixNo;
    private String buseoNo;
    private String upmuCd;
    private String georCd;
    private String dpydGb;
    private String sts;
    private BigDecimal canHisno;
    private String actMach;
    private String actDtyp;
    private String actDseq;
    private String actTell;
    private String actSjum;
    private String actCjum;
    private String actMode;
    private BigDecimal ccyCnt;
    private String actBsplGb;
    private String actCd;
    private String actCcy;
    private BigDecimal actAmt;
    private BigDecimal usdAmt;
    private BigDecimal fdcAmt;
    private BigDecimal fdcHdamt;
    private BigDecimal applHrt;
    private BigDecimal basicHrt;
    private BigDecimal bookHrt;
    private BigDecimal demiHrt;
    private BigDecimal gosiHrt;
    private String ibjiMd;
    private BigDecimal jakiAmt;
    private BigDecimal etc1Amt;
    private BigDecimal etc2Amt;
    private BigDecimal etc3Amt;
    private Date acIl;
    private Date ibIl;
    private String ibTime;
    private Date gisIl;
    private Date canIl;
    private String ilgeGb;
    private String opNo;
    private String mgrNo;
    private String rmNo;
    private BigDecimal bsCnt;
    private BigDecimal plCnt;
    private String cdsngNo;
    private String vipGb;
    private String theirRefno;
    private String plAddYn;
    private BigDecimal voucherNo;
    private String posKind;
    private String globId;
    private String ifrsDvCd;
    private String actEvntCdCtt;
    private String actAplyDvCd;
    private String actOvrdAplyCd;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
