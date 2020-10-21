package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ADST_DPB_INTMInfo_ID.class) 
@Table(name = "ADST_DPB_INTM") 
@Data 
public class ADST_DPB_INTMInfo implements Serializable { 
@Id 
@Column(name = "ACCT_NO") 
private String acctNo; 
@Id 
@Column(name = "IB_IL") 
private Date ibIl; 
@Id 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Id 
@Column(name = "INT_SEQ") 
private BigDecimal intSeq; 
@Column(name = "STS") 
private String sts; 
@Column(name = "TR_CD") 
private String trCd; 
@Column(name = "CUR_JAN") 
private BigDecimal curJan; 
@Column(name = "DS_AMT") 
private BigDecimal dsAmt; 
@Column(name = "DS_DAYS") 
private BigDecimal dsDays; 
@Column(name = "INT_RT") 
private BigDecimal intRt; 
@Column(name = "INT_AMT") 
private BigDecimal intAmt; 
@Column(name = "TAX_RT") 
private BigDecimal taxRt; 
@Column(name = "TAX_AMT") 
private BigDecimal taxAmt; 
@Column(name = "FROM_DT") 
private Date fromDt; 
@Column(name = "TO_DT") 
private Date toDt; 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "CAN_IL") 
private Date canIl; 
@Column(name = "CAN_OP_NO") 
private String canOpNo; 
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
