package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_DMH_ALLOC")
@Data
public class ACOM_DMH_ALLOCInfo implements Serializable {
    @Id
    @GeneratedValue
    private String damboNo;
    private String cixNo;
    private String sngNo;
    private int seqNo;
    private String sts;
    private int allocRatio;
    private int allocAmt;
    private String mngBr;
    private int lstHisNo;
    private Date lstAcIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
