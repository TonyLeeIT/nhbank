package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_COM_FEERTInfo_ID.class)
@Table(name = "ACOM_COM_FEERT")
@Data
public class ACOM_COM_FEERTInfo implements Serializable {
    @Id
    @Column(name = "LCD")
    private String lcd;
    @Id
    @Column(name = "MCD")
    private String mcd;
    @Id
    @Column(name = "SCD")
    private String scd;
    @Id
    @Column(name = "MNG_BR")
    private String mngBr;
    @Id
    @Column(name = "APPLY_IL")
    private Date applyIl;
    @Column(name = "FRT")
    private BigDecimal frt;
    @Column(name = "MAX_FEE")
    private BigDecimal maxFee;
    @Column(name = "MIN_FEE")
    private BigDecimal minFee;
    @Column(name = "ETC_FRT")
    private BigDecimal etcFrt;
    @Column(name = "CD_NM")
    private String cdNm;
    @Column(name = "MAKE_IL")
    private Date makeIl;
    @Column(name = "PL_CD")
    private String plCd;
    @Column(name = "REG_EMP_NO")
    private String regEmpNo;
    @Column(name = "REG_DT")
    private Date regDt;
    @Column(name = "REG_TM")
    private String regTm;
    @Column(name = "UPD_EMP_NO")
    private String updEmpNo;
    @Column(name = "UPD_DT")
    private Date updDt;
    @Column(name = "UPD_TM")
    private String updTm;
} 
