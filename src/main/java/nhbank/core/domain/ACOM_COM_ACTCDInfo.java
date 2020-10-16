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
@Table(name = "acomComActcd")
@Data
public class ACOM_COM_ACTCDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String brNo;
    private String bsplGb;
    private String acCd;
    private String fbGb;
    private String bokCd;
    private String hnm;
    private String hsnm;
    private String enm;
    private String esnm;
    private String lnm;
    private String lsnm;
    private String oldCd1;
    private String oldCd2;
    private String oldCd3;
    private String bcd;
    private String trGb;
    private String sysGb;
    private String bokGb;
    private String fssCd;
    private String fssNm;
    private String cd1;
    private String cd2;
    private String cd3;
    private String cd4;
    private String cd5;
    private String acKd;
    private String bldrcrGb;
    private String mnblGb;
    private String ibfGb;
    private String refctlGb;
    private String susGb;
    private String contraGb;
    private String contraAc;
    private String accrAc;
    private String amrtAc;
    private BigDecimal acSort1;
    private BigDecimal acSort2;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
