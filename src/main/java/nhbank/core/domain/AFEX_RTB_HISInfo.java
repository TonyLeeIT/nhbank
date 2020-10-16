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
@Table(name = "afexRtbHis")
@Data
public class AFEX_RTB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private BigDecimal sdHisNo;
    private String buyCcy;
    private BigDecimal buyFamt;
    private String selCcy;
    private BigDecimal selFamt;
    private BigDecimal exHrt;
    private String trBr;
    private String trTime;
    private String userId;
    private Date lstIbIl;
    private String preSts;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
