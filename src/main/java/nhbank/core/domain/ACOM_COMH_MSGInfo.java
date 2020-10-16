package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COMH_MSG")
@Data
public class ACOM_COMH_MSGInfo implements Serializable {
    @Id
    @GeneratedValue
    private String docId;
    private Date makeIl;
    private String ioGb;
    private String upmuGb;
    private String netwGb;
    private int seqNo;
    private String msgGb;
    private String condSts;
    private String brNo;
    private String typeGb;
    private String msgType;
    private String coBkcd;
    private String coBknm1;
    private String coBknm2;
    private String coBknm3;
    private String coBknm4;
    private String ourRef;
    private String theirRef;
    private String msgCcy;
    private int msgAmt;
    private String opNo;
    private Date apIl;
    private String apTime;
    private String apMngNo;
    private Date inoutIl;
    private String inoutTime;
    private Date doneIl;
    private String doneTime;
    private String ansBack;
    private String trailGb;
    private String telexNo;
    private String tkeyYn;
    private String tkeyBkcd;
    private Date tkeyIl;
    private String tkeyPref;
    private String tkeyVar;
    private String tkeyVal;
    private String tkeyLine;
    private String tkeyCni1;
    private String tkeyCni2;
    private String errMsg;
    private String headPrint;
    private String branPrint;
    private String tlxMngNo;
    private String prioYn;
    private String dupYn;
    private String physDivi;
    private String beDoc;
    private String afDoc;
    private String userKey;
    private String tsKey;
    private String mirNo;
    private String morNo;
    private String prevTs;
    private Date prevIl;
    private String prevMir;
    private String prevMor;
    private String flag1;
    private String flag2;
    private String flag3;
    private String globId;
    private String msgFileNm;
    private Date lstIl;
    private String lstTime;
    private String lstTty;
    private String lstOpNo;
    private String relDoc;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
