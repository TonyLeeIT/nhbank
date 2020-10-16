package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomComFphead")
@Data
public class ACOM_COM_FPHEADInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private String prtKind;
    private String upmuCd;
    private String trCd;
    private Date txDate;
    private String cixNo;
    private String titleTxt;
    private String headTxt;
    private String tellNo;
    private String tellNm;
    private String opNo;
    private String opNm;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
