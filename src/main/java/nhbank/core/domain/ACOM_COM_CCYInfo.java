package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COM_CCY")
@Data
public class ACOM_COM_CCYInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cd;
    private String bokCd;
    private String nm;
    private int unit;
    private int digit;
    private String ctryCd;
    private String gosiGb;
    private int seqNo;
    private int yearGb;
    private Date makeIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
