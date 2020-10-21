package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ADST_DPB_DROKInfo_ID.class) 
@Table(name = "ADST_DPB_DROK") 
@Data 
public class ADST_DPB_DROKInfo implements Serializable { 
@Id 
@Column(name = "ACCT_NO") 
private String acctNo; 
@Id 
@Column(name = "IB_IL") 
private Date ibIl; 
@Id 
@Column(name = "DR_TRX_NO") 
private BigDecimal drTrxNo; 
@Column(name = "PROCESS_CD") 
private String processCd; 
@Column(name = "STS") 
private String sts; 
@Column(name = "MECH_GB") 
private String mechGb; 
@Column(name = "RELS_IL") 
private Date relsIl; 
@Column(name = "DR_OP_NO") 
private String drOpNo; 
@Column(name = "DR_MNG_NO") 
private String drMngNo; 
@Column(name = "RELS_OP_NO") 
private String relsOpNo; 
@Column(name = "RELS_MNG_NO") 
private String relsMngNo; 
@Column(name = "DR_BR") 
private String drBr; 
@Column(name = "RELS_BR") 
private String relsBr; 
@Column(name = "DR_TIME") 
private String drTime; 
@Column(name = "RELS_TIME") 
private String relsTime; 
@Column(name = "BASE_IL") 
private Date baseIl; 
@Column(name = "BF_NO") 
private BigDecimal bfNo; 
@Column(name = "AF_NO") 
private BigDecimal afNo; 
@Column(name = "BF_RT") 
private BigDecimal bfRt; 
@Column(name = "AF_RT") 
private BigDecimal afRt; 
@Column(name = "BF_DATE") 
private Date bfDate; 
@Column(name = "AF_DATE") 
private Date afDate; 
@Column(name = "BF_STRING") 
private String bfString; 
@Column(name = "AF_STRING") 
private String afString; 
@Column(name = "NUM1") 
private BigDecimal num1; 
@Column(name = "NUM2") 
private BigDecimal num2; 
@Column(name = "NUM3") 
private BigDecimal num3; 
@Column(name = "REMARK") 
private String remark; 
@Column(name = "DR_HIS_NO") 
private BigDecimal drHisNo; 
@Column(name = "RELS_HIS_NO") 
private BigDecimal relsHisNo; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "LST_TIME") 
private String lstTime; 
@Column(name = "SELF_MNG_IL") 
private Date selfMngIl; 
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
