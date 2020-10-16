package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPH_TRA")
@Data
public class AFEX_XPH_TRAInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String traGb;
    private int hisNo;
    private int seqNo;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private String ccy;
    private int amt;
    private String inOutGb;
    private String mtGubun;
    private String tlxNo;
    private String fileName;
    private String thruBank;
    private String ncuCcy;
    private int ncuAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
