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
@Table(name = "afexRchBase")
@Data
public class AFEX_RCH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cd;
    private String bkcd;
    private String ccy;
    private String attenNo;
    private String bknm;
    private String depoType;
    private Date depoIl;
    private String depo56a;
    private String depo57a;
    private String ctryCd;
    private String depoEtc1;
    private String depoEtc2;
    private String depoEtc3;
    private String reconYn;
    private Date makeIl;
    private Date chngIl;
    private String opNo;
    private String mngrNo;
    private String sts;
    private String afCd;
    private String mngBr;
    private String cbsCd;
    private String dbsCd;
    private String vostroYn;
    private BigDecimal mk950Seq;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
