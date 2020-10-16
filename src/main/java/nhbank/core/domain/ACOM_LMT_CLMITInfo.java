package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_LMT_CLMIT")
@Data
public class ACOM_LMT_CLMITInfo implements Serializable {
    @Id
    @GeneratedValue
    private String laInspRcno;
    private BigDecimal chgSqno;
    private BigDecimal laInspRcSqno;
    private String laInspRcC;
    private String fxAcno;
    private BigDecimal repCusno;
    private BigDecimal cusno;
    private String brc;
    private String estCurc;
    private BigDecimal laPmiAm;
    private Date lmtDueDt;
    private BigDecimal laPrdMtcn;
    private String pnpLaMggKdc;
    private String bndPsvC;
    private String laItrDsc;
    private BigDecimal acusAplItr;
    private String wrsC;
    private String rgmnEno;
    private String ivtmnEno;
    private String scid;
    private BigDecimal trXcrt;
    private BigDecimal xcrtSc;
    private String dbtAcpC;
    private String bfLaInspRcno;
    private BigDecimal chbfCusno;
    private Date trDt;
    private BigDecimal fxTrSqno;
    private String rmkCntn;
    private String fxStsc;
    private Date lschgDtm;
    private String lsCmeno;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
