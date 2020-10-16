package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexXpbLgm")
@Data
public class AFEX_XPB_LGMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private String sts;
    private String trBr;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String hajaCd;
    private String hajaMngInfo;
    private String mjGb;
    private String trTime;
    private int opNo;
    private String hajaSayu;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
