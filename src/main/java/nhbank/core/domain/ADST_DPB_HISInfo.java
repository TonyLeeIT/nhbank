package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstDpbHis")
@Data
public class ADST_DPB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private int hisNo;
    private String sts;
    private String cixNo;
    private String trGb;
    private String trCd;
    private String processCd;
    private String mechGb;
    private int sdHisNo;
    private int trAmt;
    private Date ibIl;
    private String trBr;
    private String sdBr;
    private String mngBr;
    private String trTime;
    private Date gisIl;
    private Date canIl;
    private String opNo;
    private String mngNo;
    private int afJan;
    private Date acIl;
    private String chnlRefNo;
    private int chnlHisNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
