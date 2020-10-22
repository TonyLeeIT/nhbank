package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_ATB_APPLYInfo_ID.class)
@Table(name = "ACOM_ATB_APPLY")
@Data
public class ACOM_ATB_APPLYInfo implements Serializable {
    @Id
    @Column(name = "APPLY_NO")
    private String applyNo;
    @Column(name = "TRX_DT")
    private Date trxDt;
    @Column(name = "STS")
    private String sts;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "BR_NO")
    private String brNo;
    @Column(name = "FILE_NM")
    private String fileNm;
    @Column(name = "FILE_URL")
    private String fileUrl;
    @Column(name = "TOT_CNT")
    private BigDecimal totCnt;
    @Column(name = "SUS_CNT")
    private BigDecimal susCnt;
    @Column(name = "FAIL_CNT")
    private BigDecimal failCnt;
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
