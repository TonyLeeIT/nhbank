package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RTB_BASE")
@Data
public class AFEX_RTB_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String cixNo;
    private String cixNm;
    private String buyCcy;
    private int buyFamt;
    private String selCcy;
    private int selFamt;
    private int exHrt;
    private String rateAmtGb;
    private String frtGb;
    private int frtRt;
    private int frtAmt;
    private Date acIl;
    private Date lstIbIl;
    private String idNo;
    private String nationCd;
    private String remark;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String sayuCd;
} 
