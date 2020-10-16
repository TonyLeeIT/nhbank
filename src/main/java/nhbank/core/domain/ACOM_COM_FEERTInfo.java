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
@Table(name = "acomComFeert")
@Data
public class ACOM_COM_FEERTInfo implements Serializable {
    @Id
    @GeneratedValue
    private String lcd;
    private String mcd;
    private String scd;
    private String mngBr;
    private Date applyIl;
    private BigDecimal frt;
    private BigDecimal maxFee;
    private BigDecimal minFee;
    private BigDecimal etcFrt;
    private String cdNm;
    private Date makeIl;
    private String plCd;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
