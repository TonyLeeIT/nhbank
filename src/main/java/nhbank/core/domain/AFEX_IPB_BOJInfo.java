package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPB_BOJ")
@Data
public class AFEX_IPB_BOJInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int seq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int amt;
    private int hisNo;
    private String ibjiGb;
    private String bojGb;
    private int beLgcomDsAmt;
    private int lgmSeq;
    private int lgmSseq;
    private int bldSeq;
    private String ncuCcy;
    private int ncuAmt;
    private int ncuBeLgcomDsAmt;
    private int chdAmt;
    private String junhwanGb;
    private int beJunhwanWamt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
