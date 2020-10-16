package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_CERT")
@Data
public class ADST_DPB_CERTInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date ibIl;
    private int txTrxNo;
    private String sts;
    private String prtKind;
    private String drOpno;
    private String drTime;
    private String remark;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
