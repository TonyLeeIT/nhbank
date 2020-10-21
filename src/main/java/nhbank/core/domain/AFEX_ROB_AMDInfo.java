package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_ROB_AMDInfo_ID.class) 
@Table(name = "AFEX_ROB_AMD") 
@Data 
public class AFEX_ROB_AMDInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "CHG_SEQ") 
private BigDecimal chgSeq; 
@Id 
@Column(name = "TBL_GB") 
private String tblGb; 
@Column(name = "STS") 
private String sts; 
@Column(name = "CHG_CD") 
private String chgCd; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "LST_IL") 
private Date lstIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "IBJI_MD") 
private String ibjiMd; 
@Column(name = "INFO_NAME1") 
private String infoName1; 
@Column(name = "INFO_NAME2") 
private String infoName2; 
@Column(name = "INFO_NAME3") 
private String infoName3; 
@Column(name = "INFO_NAME4") 
private String infoName4; 
@Column(name = "INFO_NAME5") 
private String infoName5; 
@Column(name = "INFO_NAME6") 
private String infoName6; 
@Column(name = "APPL_NM1") 
private String applNm1; 
@Column(name = "APPL_NM2") 
private String applNm2; 
@Column(name = "APPL_ADDR1") 
private String applAddr1; 
@Column(name = "APPL_ADDR2") 
private String applAddr2; 
@Column(name = "APPL_ADDR3") 
private String applAddr3; 
@Column(name = "RCV_NM1") 
private String rcvNm1; 
@Column(name = "RCV_NM2") 
private String rcvNm2; 
@Column(name = "RCV_ADDR1") 
private String rcvAddr1; 
@Column(name = "RCV_ADDR2") 
private String rcvAddr2; 
@Column(name = "RCV_ADDR3") 
private String rcvAddr3; 
@Column(name = "RCV_ACCT_NO") 
private String rcvAcctNo; 
@Column(name = "RCV_BK_ACNO") 
private String rcvBkAcno; 
@Column(name = "RCV_BKNM1") 
private String rcvBknm1; 
@Column(name = "RCV_BKNM2") 
private String rcvBknm2; 
@Column(name = "RCV_BK_ADDR1") 
private String rcvBkAddr1; 
@Column(name = "RCV_BK_ADDR2") 
private String rcvBkAddr2; 
@Column(name = "RCV_BK_ADDR3") 
private String rcvBkAddr3; 
@Column(name = "MJ_GB") 
private String mjGb; 
@Column(name = "OP_NO") 
private String opNo; 
@Column(name = "OWNER_NO") 
private String ownerNo; 
@Column(name = "YD_GUJA") 
private String ydGuja; 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "OPER_NO") 
private String operNo; 
@Column(name = "MT199_NAME") 
private String mt199Name; 
@Column(name = "MT192_NAME") 
private String mt192Name; 
@Column(name = "BASE_STS") 
private String baseSts; 
@Column(name = "CAN_GB") 
private String canGb; 
@Column(name = "INTER_BANK1") 
private String interBank1; 
@Column(name = "INTER_BANK2") 
private String interBank2; 
@Column(name = "INFO72_NAME1") 
private String info72Name1; 
@Column(name = "INFO72_NAME2") 
private String info72Name2; 
@Column(name = "INFO72_NAME3") 
private String info72Name3; 
@Column(name = "INFO72_NAME4") 
private String info72Name4; 
@Column(name = "INFO72_NAME5") 
private String info72Name5; 
@Column(name = "INFO72_NAME6") 
private String info72Name6; 
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
