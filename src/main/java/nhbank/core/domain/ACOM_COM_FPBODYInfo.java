package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "acomComFpbody")
@Data
public class ACOM_COM_FPBODYInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private String prtKind;
    private BigDecimal lineSeq;
    private String lineTxt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
