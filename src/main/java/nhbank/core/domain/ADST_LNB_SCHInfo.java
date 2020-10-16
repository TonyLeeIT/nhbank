package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstLnbSch")
@Data
public class ADST_LNB_SCHInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String schGb;
    private int adjSeq;
    private int schSeq;
    private String sts;
    private String processGb;
    private Date makeIl;
    private Date planIl;
    private String ccy;
    private int planAmt;
    private Date fstPayIl;
    private int payAmt;
    private int usdCvtAmt;
    private int bbsCvtAmt;
    private int dsAmt;
    private int indexRt;
    private String spreadGb;
    private int spreadRt;
    private int totalRt;
    private Date fromIl;
    private Date toIl;
    private int dsTerm;
    private int misuIntAmt;
    private int jsAmt;
    private int jsRcvAmt;
    private int jsDsAmt;
    private Date jsFrIl;
    private Date jsToIl;
    private int jsDsTerm;
    private Date jsLisuIl;
    private int ptAmt;
    private int ptRcvAmt;
    private int ptDsAmt;
    private Date ptFrIl;
    private Date ptToIl;
    private int ptDsTerm;
    private Date ptLisuIl;
    private int ptRt;
    private int ycAmt;
    private int ycRcvAmt;
    private int ycDsAmt;
    private Date ycFrIl;
    private Date ycToIl;
    private int ycDsTerm;
    private Date ycLisuIl;
    private int ycRt;
    private int makeHisNo;
    private int lstSubNo;
    private Date lstAcIl;
    private Date lstIbIl;
    private String fixGb;
    private int fixAmt;
    private int pvRt;
    private int pvAmt;
    private int seqNo;
    private Date rateFixIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
