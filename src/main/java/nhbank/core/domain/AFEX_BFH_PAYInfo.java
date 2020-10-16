package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexBfhPay")
@Data
public class AFEX_BFH_PAYInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int payCnt;
    private Date makeIl;
    private String condSts;
    private int hisNo;
    private String payGb;
    private Date acIl;
    private Date gisIl;
    private Date lstIl;
    private Date lstIbIl;
    private String payDocid;
    private String msgType;
    private Date valueIl;
    private String sendRefNo;
    private String recvRefNo;
    private String setlDepo;
    private String setlBkcd;
    private String setlBknm;
    private String setlAddr1;
    private String setlAddr2;
    private String setlAddr3;
    private String jgBkcd;
    private String jgBknm;
    private String jgBkAddr1;
    private String jgBkAddr2;
    private String jgBkAddr3;
    private String jgBkAcct;
    private String beneBkcd;
    private String beneBknm;
    private String beneAddr1;
    private String beneAddr2;
    private String beneAddr3;
    private String beneAcct;
    private String tag72Info1;
    private String tag72Info2;
    private String tag72Info3;
    private String tag72Info4;
    private String tag72Info5;
    private String tag72Info6;
    private String tranCcy;
    private int tranAmt;
    private String feeCcy;
    private int feeAmt;
    private String feeGb;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String noddctYn;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private String remark6;
    private Date refundIl;
    private Date confirmIl;
    private String procType;
    private int refundAmt;
    private String vcbDownYn;
} 
