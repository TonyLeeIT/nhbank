package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_EPB_ITM")
@Data
public class ACOM_EPB_ITMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String drGb;
    private String itmCd;
    private String beItm;
    private String afItm;
    private BigDecimal beItm1;
    private BigDecimal afItm1;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
