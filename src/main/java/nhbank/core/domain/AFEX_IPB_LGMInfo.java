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
@Table(name = "afexIpbLgm")
@Data
public class AFEX_IPB_LGMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal seq;
    private BigDecimal sseq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private BigDecimal amt;
    private BigDecimal hisNo;
    private BigDecimal pSseq;
    private BigDecimal jan;
    private BigDecimal bojBjan2;
    private BigDecimal bojJan2;
    private String blGb;
    private BigDecimal bojJukYul;
    private Date ymanIl;
    private Date sYjIl;
    private BigDecimal sDsAmt;
    private String sJukGb;
    private Date blJubIl;
    private String trGb;
    private Date tcLisuIl;
    private String blNo;
    private BigDecimal bldSeq;
    private BigDecimal insHisNo;
    private Date blBalIl;
    private String lgHoiGb;
    private String csGb;
    private BigDecimal term;
    private String termGb;
    private BigDecimal jilgBamt;
    private BigDecimal jilgFamt;
    private Date lgcomFrIl;
    private Date lgcomToIl;
    private BigDecimal lgcomFrt;
    private BigDecimal lgcomDsAmt;
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
