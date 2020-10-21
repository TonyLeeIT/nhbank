package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_COM_VOUCHERInfo_ID.class)
@Table(name = "ACOM_COM_VOUCHER")
@Data
public class ACOM_COM_VOUCHERInfo implements Serializable {
    @Id
    @Column(name = "AC_IL")
    private String acIl;
    @Id
    @Column(name = "AC_BR")
    private String acBr;
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "OTHER_REF_NO")
    private String otherRefNo;
    @Column(name = "UPMU_CD")
    private String upmuCd;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "TRX_NAME")
    private String trxName;
    @Column(name = "TRX_DT")
    private String trxDt;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "CIX_NAME")
    private String cixName;
    @Column(name = "TELL_NO")
    private String tellNo;
    @Column(name = "BENEF")
    private String benef;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "FREE_TEXT1")
    private String freeText1;
    @Column(name = "FREE_TEXT2")
    private String freeText2;
    @Column(name = "FREE_TEXT3")
    private String freeText3;
    @Column(name = "FREE_TEXT4")
    private String freeText4;
    @Column(name = "FREE_TEXT5")
    private String freeText5;
    @Column(name = "FREE_TEXT6")
    private String freeText6;
    @Column(name = "FREE_TEXT7")
    private String freeText7;
    @Column(name = "FREE_TEXT8")
    private String freeText8;
    @Column(name = "PRT_GB")
    private String prtGb;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "OP_NAME")
    private String opName;
    @Column(name = "VOUCHER_NO")
    private BigDecimal voucherNo;
    @Column(name = "PRT_SEQ")
    private BigDecimal prtSeq;
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
