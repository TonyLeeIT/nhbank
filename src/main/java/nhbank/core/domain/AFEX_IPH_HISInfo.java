package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexIphHis")
@Data
public class AFEX_IPH_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int seqNo;
    private int hisNo;
    private String sts;
    private String trGb;
    private String gwamCd;
    private String trCd;
    private String docId1;
    private String docId2;
    private String docId3;
    private String docId4;
    private int amdSeq;
    private Date ibIl;
    private Date canIl;
    private int sdHisNo;
    private String trBr;
    private String ibTime;
    private String opNo;
    private String mngNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
