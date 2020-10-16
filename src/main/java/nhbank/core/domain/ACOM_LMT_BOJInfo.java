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
@Table(name = "acomLmtBoj")
@Data
public class ACOM_LMT_BOJInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private BigDecimal seq;
    private String sts;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private String trGwam;
    private String trGeor;
    private String ccy;
    private BigDecimal amt;
    private String ibjiGb;
    private String ccyGb;
    private String bojGb;
    private String ibTime;
    private String trBr;
    private String opNo;
    private String mngNo;
    private String ibjiMd;
    private String geojuGb;
    private String ydGuja;
    private String damboNo;
    private String cdSngNo;
    private BigDecimal cdSilSeq;
    private String relRefNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private BigDecimal applHrt;
    private String payCcy;
    private BigDecimal payAmt;
    private BigDecimal canHisNo;
    private BigDecimal relHisNo;
    private BigDecimal cptySeq;
    private String linkRefNo;
    private String remark;
} 
