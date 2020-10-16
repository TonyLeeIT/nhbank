package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomCixLocal")
@Data
public class ACOM_CIX_LOCALInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cixNo;
    private String itemNm;
    private String itemCtt;
    private String regDvCd;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
