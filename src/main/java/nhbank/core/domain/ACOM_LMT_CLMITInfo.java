package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomLmtClmit")
@Data
public class ACOM_LMT_CLMITInfo implements Serializable {
    @Id
    @GeneratedValue
    private String laInspRcno;
    private int chgSqno;
    private int laInspRcSqno;
    private String laInspRcC;
    private String fxAcno;
    private int repCusno;
    private int cusno;
    private String brc;
    private String estCurc;
    private int laPmiAm;
    private Date lmtDueDt;
    private int laPrdMtcn;
    private String pnpLaMggKdc;
    private String bndPsvC;
    private String laItrDsc;
    private int acusAplItr;
    private String wrsC;
    private String rgmnEno;
    private String ivtmnEno;
    private String scid;
    private int trXcrt;
    private int xcrtSc;
    private String dbtAcpC;
    private String bfLaInspRcno;
    private int chbfCusno;
    private Date trDt;
    private int fxTrSqno;
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
