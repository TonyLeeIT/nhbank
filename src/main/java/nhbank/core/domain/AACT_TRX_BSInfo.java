package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "aactTrxBs")
@Data
public class AACT_TRX_BSInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private int segSeq;
    private String refNo2;
    private String orgGb;
    private String ilgeGb;
    private String ydGb;
    private String pstGb;
    private String ibfGb;
    private String posGb;
    private Date actIl;
    private String actBr;
    private String bsCcy;
    private String fbsCd;
    private String bbsCd;
    private String mbsBspl;
    private String mbsCd;
    private String ibjiCd;
    private String slipGb;
    private String jukiGb;
    private int famt;
    private int bamt;
    private int applHrt;
    private int basicHrt;
    private int bookHrt;
    private int demiHrt;
    private int gosiHrt;
    private int ftpRt;
    private String cdSngNo;
    private String ydDsfg;
    private String ydRefno;
    private int ydHisno;
    private String docId;
    private String remark;
    private String msgType;
    private String dpNo;
    private String depoCd;
    private Date valueIl;
    private String sngNo;
    private String abaNo;
    private String checkNo;
    private String theirRefno;
    private String ifrsDvCd;
    private String dtlsBalDvCd;
    private int balAmt;
    private String idNo;
    private String cixNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
