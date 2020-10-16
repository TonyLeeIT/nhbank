package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_ATB_BASE")
@Data
public class ACOM_ATB_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String relApplyNo;
    private String sts;
    private String mgntBrNo;
    private String frAcctNo;
    private String toRefNo;
    private String trType;
    private String frCixNo;
    private String cixNo;
    private String ccy;
    private int limitAmt;
    private int trAmt;
    private String dueType;
    private int dueDay;
    private int dueTimes;
    private int totTimes;
    private int procTimes;
    private Date opnDt;
    private Date expDt;
    private String retryYn;
    private String purposeCd;
    private String rcvRmrk;
    private String rcvAddr;
    private int depTimes;
    private String type;
    private String channelType;
    private String payerInf;
    private String trsfTp;
    private String trsfDtRule;
    private String feeFreeYn;
    private String toBankCd;
    private String toCustNm;
    private int feeAmt;
    private String applRmrk;
    private String rmteAcctDpKindCd;
    private String rtgsTp;
    private String ourRef;
    private String multiKey;
    private Date lstIbDt;
    private String lstIbTime;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
