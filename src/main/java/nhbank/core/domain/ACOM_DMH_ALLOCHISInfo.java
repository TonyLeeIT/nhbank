package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomDmhAllochis")
@Data
public class ACOM_DMH_ALLOCHISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String damboNo;
    private String cixNo;
    private String sngNo;
    private int seqNo;
    private int hisNo;
    private String sts;
    private int allocRatio;
    private int allocAmt;
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
