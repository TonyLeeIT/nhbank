package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPB_LGM")
@Data
public class AFEX_IPB_LGMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int seq;
    private int sseq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int amt;
    private int hisNo;
    private int pSseq;
    private int jan;
    private int bojBjan2;
    private int bojJan2;
    private String blGb;
    private int bojJukYul;
    private Date ymanIl;
    private Date sYjIl;
    private int sDsAmt;
    private String sJukGb;
    private Date blJubIl;
    private String trGb;
    private Date tcLisuIl;
    private String blNo;
    private int bldSeq;
    private int insHisNo;
    private Date blBalIl;
    private String lgHoiGb;
    private String csGb;
    private int term;
    private String termGb;
    private int jilgBamt;
    private int jilgFamt;
    private Date lgcomFrIl;
    private Date lgcomToIl;
    private int lgcomFrt;
    private int lgcomDsAmt;
    private String mfcsRtCd;
    private String bojfeeGb;
    private String bojJukGb;
    private String shipNm;
    private String shipCo;
    private String shipCoAddr1;
    private String shipCoAddr2;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
