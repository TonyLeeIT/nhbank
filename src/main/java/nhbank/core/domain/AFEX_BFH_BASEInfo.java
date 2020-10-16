package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_BFH_BASE")
@Data
public class AFEX_BFH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date recvIl;
    private int seqNo;
    private Date makeIl;
    private String refNo;
    private String condSts;
    private String recvGb;
    private String recvBr;
    private String cixNo;
    private Date acIl;
    private Date gisIl;
    private Date lstIl;
    private Date lstIbIl;
    private String bftGb;
    private String ignoreYn;
    private String recvDocid;
    private int payCnt;
    private String msgType;
    private Date valueIl;
    private String recvCcy;
    private int recvAmt;
    private String curCcy;
    private int curAmt;
    private String sendRefNo;
    private String recvRefNo;
    private String sendDepo;
    private String sendBkcd;
    private String sendBknm;
    private String sendAddr1;
    private String sendAddr2;
    private String sendAddr3;
    private String jgBkcd;
    private String jgBknm;
    private String jgBkAddr1;
    private String jgBkAddr2;
    private String jgBkAddr3;
    private String jgBkAcct;
    private String beneBkcd;
    private String beneBknm;
    private String beneAddr1;
    private String beneAddr2;
    private String beneAddr3;
    private String beneAcct;
    private String tag72Info1;
    private String tag72Info2;
    private String tag72Info3;
    private String tag72Info4;
    private String tag72Info5;
    private String tag72Info6;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String intBkcd;
    private String intBknm;
    private String intAddr1;
    private String intAddr2;
    private String intAddr3;
    private String noddctYn;
} 
