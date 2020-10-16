package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomLmtBoj")
@Data
public class ACOM_LMT_BOJInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private int seq;
    private String sts;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private String trGwam;
    private String trGeor;
    private String ccy;
    private int amt;
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
    private int cdSilSeq;
    private String relRefNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private int applHrt;
    private String payCcy;
    private int payAmt;
    private int canHisNo;
    private int relHisNo;
    private int cptySeq;
    private String linkRefNo;
    private String remark;
} 
