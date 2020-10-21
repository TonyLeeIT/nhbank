package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_CONT_BASEInfo_ID.class) 
@Table(name = "ACOM_CONT_BASE") 
@Data 
public class ACOM_CONT_BASEInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "CNTY_CD") 
private String cntyCd; 
@Id 
@Column(name = "RGN_CD") 
private String rgnCd; 
@Column(name = "STS") 
private String sts; 
@Column(name = "INACT_RSN_CD") 
private String inactRsnCd; 
@Column(name = "LST_HIS_NO") 
private BigDecimal lstHisNo; 
@Column(name = "TRCLL_ST_CD") 
private String trcllStCd; 
@Column(name = "MGNT_BR_NO") 
private String mgntBrNo; 
@Column(name = "BRFC_CD") 
private String brfcCd; 
@Column(name = "PFMC_MGNT_BR_NO") 
private String pfmcMgntBrNo; 
@Column(name = "ID_NO") 
private String idNo; 
@Column(name = "CIX_NO") 
private String cixNo; 
@Column(name = "DEPT_SEQ_NO") 
private BigDecimal deptSeqNo; 
@Column(name = "SUBJ_CD") 
private String subjCd; 
@Column(name = "BNK_DV_CD") 
private String bnkDvCd; 
@Column(name = "PRD_CD") 
private String prdCd; 
@Column(name = "LIM_APV_NO") 
private String limApvNo; 
@Column(name = "CUR_CD") 
private String curCd; 
@Column(name = "TRSC_DT") 
private Date trscDt; 
@Column(name = "PROC_BASC_DT") 
private Date procBascDt; 
@Column(name = "DDAC_RNW_DT") 
private Date ddacRnwDt; 
@Column(name = "LST_TRSC_DT") 
private Date lstTrscDt; 
@Column(name = "CONT_END_DT") 
private Date contEndDt; 
@Column(name = "HS_CD") 
private String hsCd; 
@Column(name = "ENTR_MGNT_NO") 
private String entrMgntNo; 
@Column(name = "CMLT_MLGE_AMT") 
private BigDecimal cmltMlgeAmt; 
@Column(name = "CORP_SCAL_CD") 
private String corpScalCd; 
@Column(name = "THR_CNTY_CD") 
private String thrCntyCd; 
@Column(name = "ORIPL_CNTY_CD") 
private String oriplCntyCd; 
@Column(name = "EIMP_DCL_NO") 
private String eimpDclNo; 
@Column(name = "DOMS_OTSD_DV_CD") 
private String domsOtsdDvCd; 
@Column(name = "LONG_SHTM_DV_CD") 
private String longShtmDvCd; 
@Column(name = "PFMC_DV_CD") 
private String pfmcDvCd; 
@Column(name = "AST_RELN_CRPD_YN") 
private String astRelnCrpdYn; 
@Column(name = "DBT_APTC_YN") 
private String dbtAptcYn; 
@Column(name = "SUGT_EMP_RLCO_CD") 
private String sugtEmpRlcoCd; 
@Column(name = "SUGT_EMP_NO") 
private String sugtEmpNo; 
@Column(name = "TMAN_EMP_NO") 
private String tmanEmpNo; 
@Column(name = "PB_RM_OFFCR_CD") 
private String pbRmOffcrCd; 
@Column(name = "MASTAUTH_DV_CD") 
private String mastauthDvCd; 
@Column(name = "SUB_REF_NO") 
private String subRefNo; 
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
