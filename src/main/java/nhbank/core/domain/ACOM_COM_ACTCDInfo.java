package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_COM_ACTCDInfo_ID.class) 
@Table(name = "ACOM_COM_ACTCD") 
@Data 
public class ACOM_COM_ACTCDInfo implements Serializable { 
@Id 
@Column(name = "BR_NO") 
private String brNo; 
@Id 
@Column(name = "BSPL_GB") 
private String bsplGb; 
@Id 
@Column(name = "AC_CD") 
private String acCd; 
@Column(name = "FB_GB") 
private String fbGb; 
@Column(name = "BOK_CD") 
private String bokCd; 
@Column(name = "HNM") 
private String hnm; 
@Column(name = "HSNM") 
private String hsnm; 
@Column(name = "ENM") 
private String enm; 
@Column(name = "ESNM") 
private String esnm; 
@Column(name = "LNM") 
private String lnm; 
@Column(name = "LSNM") 
private String lsnm; 
@Column(name = "OLD_CD1") 
private String oldCd1; 
@Column(name = "OLD_CD2") 
private String oldCd2; 
@Column(name = "OLD_CD3") 
private String oldCd3; 
@Column(name = "BCD") 
private String bcd; 
@Column(name = "TR_GB") 
private String trGb; 
@Column(name = "SYS_GB") 
private String sysGb; 
@Column(name = "BOK_GB") 
private String bokGb; 
@Column(name = "FSS_CD") 
private String fssCd; 
@Column(name = "FSS_NM") 
private String fssNm; 
@Column(name = "CD1") 
private String cd1; 
@Column(name = "CD2") 
private String cd2; 
@Column(name = "CD3") 
private String cd3; 
@Column(name = "CD4") 
private String cd4; 
@Column(name = "CD5") 
private String cd5; 
@Column(name = "AC_KD") 
private String acKd; 
@Column(name = "BLDRCR_GB") 
private String bldrcrGb; 
@Column(name = "MNBL_GB") 
private String mnblGb; 
@Column(name = "IBF_GB") 
private String ibfGb; 
@Column(name = "REFCTL_GB") 
private String refctlGb; 
@Column(name = "SUS_GB") 
private String susGb; 
@Column(name = "CONTRA_GB") 
private String contraGb; 
@Column(name = "CONTRA_AC") 
private String contraAc; 
@Column(name = "ACCR_AC") 
private String accrAc; 
@Column(name = "AMRT_AC") 
private String amrtAc; 
@Column(name = "AC_SORT1") 
private BigDecimal acSort1; 
@Column(name = "AC_SORT2") 
private BigDecimal acSort2; 
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
