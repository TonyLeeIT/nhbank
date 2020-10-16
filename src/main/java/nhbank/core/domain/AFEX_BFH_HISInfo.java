package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_BFH_HIS")
@Data
public class AFEX_BFH_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date canIl;
    private int beforeAmt;
    private int afterAmt;
    private String opNo;
    private String cixNo;
    private int sdHisNo;
    private Date gisIl;
    private String mngBr;
    private String bfRecvRefNo;
    private int bfChAmt;
    private String bfRecvBkcd;
    private String bfRecvDepo;
    private String bfBaseSts;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
