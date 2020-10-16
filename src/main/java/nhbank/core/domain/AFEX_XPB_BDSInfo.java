package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexXpbBds")
@Data
public class AFEX_XPB_BDSInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private int budoSeq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int amt;
    private int hdcAmt;
    private int bamt;
    private int bdcAmt;
    private int bdIja;
    private int hcHija;
    private String hJiGb;
    private int caSumAmt;
    private String sonikGb;
    private int sonikAmt;
    private String ncuCcy;
    private int ncuAmt;
    private int ncuHdcAmt;
    private int ncuCaSumAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
