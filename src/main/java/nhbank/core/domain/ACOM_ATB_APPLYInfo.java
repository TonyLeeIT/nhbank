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
@Table(name = "acomAtbApply")
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
    private BigDecimal totCnt;
    private BigDecimal susCnt;
    private BigDecimal failCnt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
