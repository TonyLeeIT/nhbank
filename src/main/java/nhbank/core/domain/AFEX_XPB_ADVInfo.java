package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPB_ADV")
@Data
public class AFEX_XPB_ADVInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int amt;
    private String advGb;
    private String caGb;
    private String delayGb;
    private Date sdTrIl;
    private String jubGb;
    private int hdAmt;
    private String junNo1;
    private int overAmt;
    private String junNo2;
    private int lessCaAmt;
    private int lessCoAmt;
    private int lessGtAmt;
    private String yukNo;
    private String plJiGb;
    private String depoBkcd;
    private String buibGb;
    private int junAmt;
    private String ijGb;
    private Date manIl;
    private Date caManIl;
    private int misuAmt;
    private int misuBamt;
    private String sonikGb;
    private int sonikAmt;
    private Date beLcaIl;
    private String ncuCcy;
    private int ncuAmt;
    private int ncuHdAmt;
    private int ncuOverAmt;
    private int ncuLessCaAmt;
    private int ncuLessCoAmt;
    private int ncuLessGtAmt;
    private int ncuJunAmt;
    private int ncuMisuAmt;
    private String junNo3;
    private String payDoYn;
    private String trsfAbano;
    private String trsfAcct;
    private String trsfRefno;
    private String trsfBeneNm;
    private String trsfApplNm;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String mt103DocId;
    private String feeRcvBy;
} 
