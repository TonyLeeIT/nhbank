package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AACT_TRX_BASE")
@Data
public class AACT_TRX_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date trxIl;
    private String trxBr;
    private int trxSeq;
    private String refNo;
    private int hisNo;
    private String ibfGb;
    private String idNo;
    private String cixNo;
    private String buseoNo;
    private String upmuCd;
    private String georCd;
    private String dpydGb;
    private String sts;
    private int canHisno;
    private String actMach;
    private String actDtyp;
    private String actDseq;
    private String actTell;
    private String actSjum;
    private String actCjum;
    private String actMode;
    private int ccyCnt;
    private String actBsplGb;
    private String actCd;
    private String actCcy;
    private int actAmt;
    private int usdAmt;
    private int fdcAmt;
    private int fdcHdamt;
    private int applHrt;
    private int basicHrt;
    private int bookHrt;
    private int demiHrt;
    private int gosiHrt;
    private String ibjiMd;
    private int jakiAmt;
    private int etc1Amt;
    private int etc2Amt;
    private int etc3Amt;
    private Date acIl;
    private Date ibIl;
    private String ibTime;
    private Date gisIl;
    private Date canIl;
    private String ilgeGb;
    private String opNo;
    private String mgrNo;
    private String rmNo;
    private int bsCnt;
    private int plCnt;
    private String cdsngNo;
    private String vipGb;
    private String theirRefno;
    private String plAddYn;
    private int voucherNo;
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
