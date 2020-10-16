package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COMH_TAGLINE")
@Data
public class ACOM_COMH_TAGLINEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String docId;
    private BigDecimal seqNo;
    private String lineType;
    private String tagNo;
    private BigDecimal subNo;
    private String lineData;
    private String tagGb;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
