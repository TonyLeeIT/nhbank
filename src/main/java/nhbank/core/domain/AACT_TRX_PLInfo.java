package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AACT_TRX_PL")
@Data
public class AACT_TRX_PLInfo implements Serializable {
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
    private String plCcy;
    private String plCd;
    private String ibjiCd;
    private String slipGb;
    private String jukiGb;
    private String upmuCd;
    private String georCd;
    private String feeCd;
    private String gamGb;
    private String oDsCcy;
    private int oDsAmt;
    private int oIntRt;
    private Date oFromIl;
    private Date oToIl;
    private int oIlsu;
    private int oFeeFamt;
    private int oFeeBamt;
    private int oApplHrt;
    private int oFtpRt;
    private String sDsCcy;
    private int sDsAmt;
    private int sIntRt;
    private Date sFromIl;
    private Date sToIl;
    private int sIlsu;
    private int sFeeFamt;
    private int sFeeBamt;
    private int sApplHrt;
    private int sBasicHrt;
    private int sBookHrt;
    private int sDemiHrt;
    private int sGosiHrt;
    private int sFtpRt;
    private String pCcy;
    private int pFamt;
    private int pBamt;
    private int pApplHrt;
    private int pBasicHrt;
    private int pBookHrt;
    private int pDemiHrt;
    private int pGosiHrt;
    private int pFtpRt;
    private String ydRefno;
    private int ydHisno;
    private String docId;
    private String remark;
    private String theirRefno;
    private String ifrsDvCd;
    private String idNo;
    private String cixNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
