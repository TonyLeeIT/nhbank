package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_COM_FPBODYInfo_ID.class)
@Table(name = "ACOM_COM_FPBODY")
@Data
public class ACOM_COM_FPBODYInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Id
    @Column(name = "PRT_KIND")
    private String prtKind;
    @Id
    @Column(name = "LINE_SEQ")
    private BigDecimal lineSeq;
    @Column(name = "LINE_TXT")
    private String lineTxt;
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
