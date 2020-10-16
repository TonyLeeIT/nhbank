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
@Table(name = "acomDmhAllochis")
@Data
public class ACOM_DMH_ALLOCHISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String damboNo;
    private String cixNo;
    private String sngNo;
    private BigDecimal seqNo;
    private BigDecimal hisNo;
    private String sts;
    private BigDecimal allocRatio;
    private BigDecimal allocAmt;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String opNo;
    private String mngNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
