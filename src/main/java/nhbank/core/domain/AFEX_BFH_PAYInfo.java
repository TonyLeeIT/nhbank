package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_BFH_PAYInfo_ID.class) 
@Table(name = "AFEX_BFH_PAY") 
@Data 
public class AFEX_BFH_PAYInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "PAY_CNT") 
private BigDecimal payCnt; 
@Column(name = "MAKE_IL") 
private Date makeIl; 
@Column(name = "COND_STS") 
private String condSts; 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "PAY_GB") 
private String payGb; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "LST_IL") 
private Date lstIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "PAY_DOCID") 
private String payDocid; 
@Column(name = "MSG_TYPE") 
private String msgType; 
@Column(name = "VALUE_IL") 
private Date valueIl; 
@Column(name = "SEND_REF_NO") 
private String sendRefNo; 
@Column(name = "RECV_REF_NO") 
private String recvRefNo; 
@Column(name = "SETL_DEPO") 
private String setlDepo; 
@Column(name = "SETL_BKCD") 
private String setlBkcd; 
@Column(name = "SETL_BKNM") 
private String setlBknm; 
@Column(name = "SETL_ADDR1") 
private String setlAddr1; 
@Column(name = "SETL_ADDR2") 
private String setlAddr2; 
@Column(name = "SETL_ADDR3") 
private String setlAddr3; 
@Column(name = "JG_BKCD") 
private String jgBkcd; 
@Column(name = "JG_BKNM") 
private String jgBknm; 
@Column(name = "JG_BK_ADDR1") 
private String jgBkAddr1; 
@Column(name = "JG_BK_ADDR2") 
private String jgBkAddr2; 
@Column(name = "JG_BK_ADDR3") 
private String jgBkAddr3; 
@Column(name = "JG_BK_ACCT") 
private String jgBkAcct; 
@Column(name = "BENE_BKCD") 
private String beneBkcd; 
@Column(name = "BENE_BKNM") 
private String beneBknm; 
@Column(name = "BENE_ADDR1") 
private String beneAddr1; 
@Column(name = "BENE_ADDR2") 
private String beneAddr2; 
@Column(name = "BENE_ADDR3") 
private String beneAddr3; 
@Column(name = "BENE_ACCT") 
private String beneAcct; 
@Column(name = "TAG72_INFO1") 
private String tag72Info1; 
@Column(name = "TAG72_INFO2") 
private String tag72Info2; 
@Column(name = "TAG72_INFO3") 
private String tag72Info3; 
@Column(name = "TAG72_INFO4") 
private String tag72Info4; 
@Column(name = "TAG72_INFO5") 
private String tag72Info5; 
@Column(name = "TAG72_INFO6") 
private String tag72Info6; 
@Column(name = "TRAN_CCY") 
private String tranCcy; 
@Column(name = "TRAN_AMT") 
private BigDecimal tranAmt; 
@Column(name = "FEE_CCY") 
private String feeCcy; 
@Column(name = "FEE_AMT") 
private BigDecimal feeAmt; 
@Column(name = "FEE_GB") 
private String feeGb; 
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
@Column(name = "NODDCT_YN") 
private String noddctYn; 
@Column(name = "REMARK1") 
private String remark1; 
@Column(name = "REMARK2") 
private String remark2; 
@Column(name = "REMARK3") 
private String remark3; 
@Column(name = "REMARK4") 
private String remark4; 
@Column(name = "REMARK5") 
private String remark5; 
@Column(name = "REMARK6") 
private String remark6; 
@Column(name = "REFUND_IL") 
private Date refundIl; 
@Column(name = "CONFIRM_IL") 
private Date confirmIl; 
@Column(name = "PROC_TYPE") 
private String procType; 
@Column(name = "REFUND_AMT") 
private BigDecimal refundAmt; 
@Column(name = "VCB_DOWN_YN") 
private String vcbDownYn; 
} 
