package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afifFehHis")
@Data
public class AFIF_FEH_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private int sdHisNo;
    private String nearBuyCcy;
    private int nearBuyFamt;
    private int nearBuyBamt;
    private int nearBuyJan;
    private int nearBuyBjan;
    private String nearSellCcy;
    private int nearSellFamt;
    private int nearSellBamt;
    private int nearSellJan;
    private int nearSellBjan;
    private String nearSndDocNo;
    private String farBuyCcy;
    private int farBuyFamt;
    private int farBuyBamt;
    private int farBuyJan;
    private int farBuyBjan;
    private String farSellCcy;
    private int farSellFamt;
    private int farSellBamt;
    private int farSellJan;
    private int farSellBjan;
    private String farSndDocNo;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String userId;
    private String managerId;
    private String ibjiMd;
    private String cdSngNo;
    private int cdSilSeq;
    private String ftpSngNo;
    private int ftpSilSeq;
    private String junNo;
    private String yukNo;
    private Date lstIbIl;
    private String frontSndGb;
    private String preSts;
    private String beHdSngno;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
