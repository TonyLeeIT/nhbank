package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_ATB_APPLY")
@Data
public class ACOM_ATB_APPLYInfo implements Serializable {
    @Id
    @GeneratedValue
    private String applyNo;
    private Date trxDt;
    private String sts;
    private String cixNo;
    private String brNo;
    private String fileNm;
    private String fileUrl;
    private int totCnt;
    private int susCnt;
    private int failCnt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
