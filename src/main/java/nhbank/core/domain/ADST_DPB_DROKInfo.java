package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstDpbDrok")
@Data
public class ADST_DPB_DROKInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date ibIl;
    private int drTrxNo;
    private String processCd;
    private String sts;
    private String mechGb;
    private Date relsIl;
    private String drOpNo;
    private String drMngNo;
    private String relsOpNo;
    private String relsMngNo;
    private String drBr;
    private String relsBr;
    private String drTime;
    private String relsTime;
    private Date baseIl;
    private int bfNo;
    private int afNo;
    private int bfRt;
    private int afRt;
    private Date bfDate;
    private Date afDate;
    private String bfString;
    private String afString;
    private int num1;
    private int num2;
    private int num3;
    private String remark;
    private int drHisNo;
    private int relsHisNo;
    private Date lstIbIl;
    private String lstTime;
    private Date selfMngIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
