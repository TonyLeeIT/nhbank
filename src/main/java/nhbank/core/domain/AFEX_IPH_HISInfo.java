package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPH_HISInfo_ID.class)
@Table(name = "AFEX_IPH_HIS")
@Data
public class AFEX_IPH_HISInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "SEQ_NO")
    private BigDecimal seqNo;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "GWAM_CD")
    private String gwamCd;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "DOC_ID1")
    private String docId1;
    @Column(name = "DOC_ID2")
    private String docId2;
    @Column(name = "DOC_ID3")
    private String docId3;
    @Column(name = "DOC_ID4")
    private String docId4;
    @Column(name = "AMD_SEQ")
    private BigDecimal amdSeq;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "SD_HIS_NO")
    private BigDecimal sdHisNo;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "IB_TIME")
    private String ibTime;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "MNG_NO")
    private String mngNo;
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
