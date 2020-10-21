package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_XPB_AMDInfo_ID.class) 
@Table(name = "AFEX_XPB_AMD") 
@Data 
public class AFEX_XPB_AMDInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "LST_IL") 
private Date lstIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "CAN_IL") 
private Date canIl; 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "BE_TENOR_GB") 
private String beTenorGb; 
@Column(name = "BE_RENE_REQ_GB") 
private String beReneReqGb; 
@Column(name = "BE_NEGO_GB") 
private String beNegoGb; 
@Column(name = "BE_HJ_IL_CD") 
private String beHjIlCd; 
@Column(name = "BE_MAN_GIJ_IL") 
private Date beManGijIl; 
@Column(name = "BE_HIJA_TERM") 
private BigDecimal beHijaTerm; 
@Column(name = "BE_USANCE_TERM") 
private BigDecimal beUsanceTerm; 
@Column(name = "BE_YMAN_IL") 
private Date beYmanIl; 
@Column(name = "BE_MO_JUB_IL") 
private Date beMoJubIl; 
@Column(name = "BE_LST_ISU_IL") 
private Date beLstIsuIl; 
@Column(name = "BE_WHAN_RCV_GB") 
private String beWhanRcvGb; 
@Column(name = "BE_WHAN_FRT") 
private BigDecimal beWhanFrt; 
@Column(name = "BE_INT_AMT") 
private BigDecimal beIntAmt; 
@Column(name = "AF_TENOR_GB") 
private String afTenorGb; 
@Column(name = "AF_RENE_REQ_GB") 
private String afReneReqGb; 
@Column(name = "AF_NEGO_GB") 
private String afNegoGb; 
@Column(name = "AF_HJ_IL_CD") 
private String afHjIlCd; 
@Column(name = "AF_MAN_GIJ_IL") 
private Date afManGijIl; 
@Column(name = "AF_HIJA_TERM") 
private BigDecimal afHijaTerm; 
@Column(name = "AF_USANCE_TERM") 
private BigDecimal afUsanceTerm; 
@Column(name = "AF_YMAN_IL") 
private Date afYmanIl; 
@Column(name = "AF_MO_JUB_IL") 
private Date afMoJubIl; 
@Column(name = "AF_LST_ISU_IL") 
private Date afLstIsuIl; 
@Column(name = "AF_WHAN_RCV_GB") 
private String afWhanRcvGb; 
@Column(name = "AF_WHAN_FRT") 
private BigDecimal afWhanFrt; 
@Column(name = "AF_INT_AMT") 
private BigDecimal afIntAmt; 
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
