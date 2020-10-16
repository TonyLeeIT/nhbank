package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexRobAmd")
@Data
public class AFEX_ROB_AMDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int chgSeq;
    private String tblGb;
    private String sts;
    private String chgCd;
    private Date acIl;
    private Date gisIl;
    private Date lstIl;
    private Date lstIbIl;
    private String ibjiMd;
    private String infoName1;
    private String infoName2;
    private String infoName3;
    private String infoName4;
    private String infoName5;
    private String infoName6;
    private String applNm1;
    private String applNm2;
    private String applAddr1;
    private String applAddr2;
    private String applAddr3;
    private String rcvNm1;
    private String rcvNm2;
    private String rcvAddr1;
    private String rcvAddr2;
    private String rcvAddr3;
    private String rcvAcctNo;
    private String rcvBkAcno;
    private String rcvBknm1;
    private String rcvBknm2;
    private String rcvBkAddr1;
    private String rcvBkAddr2;
    private String rcvBkAddr3;
    private String mjGb;
    private String opNo;
    private String ownerNo;
    private String ydGuja;
    private int hisNo;
    private String operNo;
    private String mt199Name;
    private String mt192Name;
    private String baseSts;
    private String canGb;
    private String interBank1;
    private String interBank2;
    private String info72Name1;
    private String info72Name2;
    private String info72Name3;
    private String info72Name4;
    private String info72Name5;
    private String info72Name6;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
