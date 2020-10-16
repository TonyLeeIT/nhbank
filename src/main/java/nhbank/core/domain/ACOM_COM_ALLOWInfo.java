package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomComAllow")
@Data
public class ACOM_COM_ALLOWInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String trxRefNo;
    private String mngBr;
    private String cixNo;
    private String gwamCd;
    private String curc;
    private int assetAmt;
    private int exhgAmt;
    private int allowAmt;
    private int collectAmt;
    private String collectCd;
    private String sts;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
