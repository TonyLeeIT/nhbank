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
@Table(name = "aactTrxPl")
@Data
public class AACT_TRX_PLInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal segSeq;
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
    private BigDecimal oDsAmt;
    private BigDecimal oIntRt;
    private Date oFromIl;
    private Date oToIl;
    private BigDecimal oIlsu;
    private BigDecimal oFeeFamt;
    private BigDecimal oFeeBamt;
    private BigDecimal oApplHrt;
    private BigDecimal oFtpRt;
    private String sDsCcy;
    private BigDecimal sDsAmt;
    private BigDecimal sIntRt;
    private Date sFromIl;
    private Date sToIl;
    private BigDecimal sIlsu;
    private BigDecimal sFeeFamt;
    private BigDecimal sFeeBamt;
    private BigDecimal sApplHrt;
    private BigDecimal sBasicHrt;
    private BigDecimal sBookHrt;
    private BigDecimal sDemiHrt;
    private BigDecimal sGosiHrt;
    private BigDecimal sFtpRt;
    private String pCcy;
    private BigDecimal pFamt;
    private BigDecimal pBamt;
    private BigDecimal pApplHrt;
    private BigDecimal pBasicHrt;
    private BigDecimal pBookHrt;
    private BigDecimal pDemiHrt;
    private BigDecimal pGosiHrt;
    private BigDecimal pFtpRt;
    private String ydRefno;
    private BigDecimal ydHisno;
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
