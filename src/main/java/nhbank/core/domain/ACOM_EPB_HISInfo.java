package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_EPB_HISInfo_ID.class) 
@Table(name = "ACOM_EPB_HIS") 
@Data 
public class ACOM_EPB_HISInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "TR_GB") 
private String trGb; 
@Column(name = "TR_CD") 
private String trCd; 
@Column(name = "DN_GB") 
private String dnGb; 
@Column(name = "IB_IL") 
private Date ibIl; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "CAN_IL") 
private Date canIl; 
@Column(name = "SD_HIS_NO") 
private BigDecimal sdHisNo; 
@Column(name = "TR_CCY") 
private String trCcy; 
@Column(name = "TR_FAMT") 
private BigDecimal trFamt; 
@Column(name = "TR_BAMT") 
private BigDecimal trBamt; 
@Column(name = "AF_JAN") 
private BigDecimal afJan; 
@Column(name = "TR_BR") 
private String trBr; 
@Column(name = "SD_BR") 
private String sdBr; 
@Column(name = "AUTO_YN") 
private String autoYn; 
@Column(name = "CPTY_NM") 
private String cptyNm; 
@Column(name = "REMARK") 
private String remark; 
@Column(name = "SD_BUSI_CD") 
private String sdBusiCd; 
@Column(name = "SD_REF_NO") 
private String sdRefNo; 
@Column(name = "SD_HIS") 
private BigDecimal sdHis; 
@Column(name = "IB_TIME") 
private String ibTime; 
@Column(name = "OP_NO") 
private String opNo; 
@Column(name = "MNG_NO") 
private String mngNo; 
@Column(name = "CD_SNG_NO") 
private String cdSngNo; 
@Column(name = "CD_SIL_SEQ") 
private BigDecimal cdSilSeq; 
@Column(name = "TR_TAX") 
private BigDecimal trTax; 
@Column(name = "ASSIGN_AMT") 
private BigDecimal assignAmt; 
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
@Column(name = "LINK_REF_NO") 
private String linkRefNo; 
@Column(name = "LINK_TYPE") 
private String linkType; 
@Column(name = "PAY_REF_NO") 
private String payRefNo; 
@Column(name = "TAX_CODE") 
private String taxCode; 
@Column(name = "TAX_RATE") 
private BigDecimal taxRate; 
} 
