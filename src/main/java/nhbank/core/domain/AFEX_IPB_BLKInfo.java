package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexIpbBlk")
@Data
public class AFEX_IPB_BLKInfo implements Serializable {
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
    private String jagmGb;
    private int jilcBamt;
    private int jilcFamt;
    private int jilgBamt;
    private int jilgFamt;
    private int sngSseq;
    private int djbSeq;
    private String setBkcd;
    private String junGb;
    private String fjnNo;
    private String setGb;
    private int gtAmt;
    private String amtGb;
    private String ncuCcy;
    private int ncuAmt;
    private int ncuJilcFamt;
    private int ncuJilgFamt;
    private int ncuGtAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
