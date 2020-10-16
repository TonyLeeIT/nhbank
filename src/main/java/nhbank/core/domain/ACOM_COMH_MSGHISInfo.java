package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COMH_MSGHIS")
@Data
public class ACOM_COMH_MSGHISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String docId;
    private BigDecimal seqNo;
    private String condSts;
    private String stmRmk;
    private String stmTail;
    private Date makeIl;
    private String makeTime;
    private String makeTty;
    private String opNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
