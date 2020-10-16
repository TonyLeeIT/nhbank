package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexIpbAmd")
@Data
public class AFEX_IPB_AMDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int seq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int idAmt;
    private int hisNo;
    private String amdCd;
    private String beCcy;
    private String afCcy;
    private int beAmt;
    private int afAmt;
    private Date beExpIl;
    private Date afExpIl;
    private int bojJukYul;
    private int tcDsamt;
    private String reReGb;
    private String beMore;
    private String beLess;
    private String afMore;
    private String afLess;
    private Date beTcLisuIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
