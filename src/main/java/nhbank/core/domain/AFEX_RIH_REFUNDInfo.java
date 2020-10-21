package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_RIH_REFUNDInfo_ID.class) 
@Table(name = "AFEX_RIH_REFUND") 
@Data 
public class AFEX_RIH_REFUNDInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "RT_CD") 
private String rtCd; 
@Column(name = "MONEY_CD") 
private String moneyCd; 
@Column(name = "RCV_GB") 
private String rcvGb; 
@Column(name = "RCV_BR") 
private String rcvBr; 
@Column(name = "CIX_NO") 
private String cixNo; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "FAMT") 
private BigDecimal famt; 
@Column(name = "ORG_FAMT") 
private BigDecimal orgFamt; 
@Column(name = "THEIR_REF_NO") 
private String theirRefNo; 
@Column(name = "CH_GB") 
private String chGb; 
@Column(name = "CH_AMT") 
private BigDecimal chAmt; 
@Column(name = "MJ_GB") 
private String mjGb; 
@Column(name = "FEE_CNT") 
private BigDecimal feeCnt; 
@Column(name = "FEE_MSG") 
private String feeMsg; 
@Column(name = "INMSG_GB") 
private String inmsgGb; 
@Column(name = "IN_MSG") 
private String inMsg; 
@Column(name = "CREDIT_CUR") 
private String creditCur; 
@Column(name = "CREDIT_AMT") 
private BigDecimal creditAmt; 
@Column(name = "CREDIT_IL") 
private Date creditIl; 
@Column(name = "APPL_NM") 
private String applNm; 
@Column(name = "APPL_ADDR1") 
private String applAddr1; 
@Column(name = "APPL_ADDR2") 
private String applAddr2; 
@Column(name = "APPL_ADDR3") 
private String applAddr3; 
@Column(name = "APLI_ACNO") 
private String apliAcno; 
@Column(name = "JG_DEPO_CD") 
private String jgDepoCd; 
@Column(name = "JG_DEPO_NM") 
private String jgDepoNm; 
@Column(name = "JG_BKCD") 
private String jgBkcd; 
@Column(name = "JG_BK_ABANO") 
private String jgBkAbano; 
@Column(name = "JG_BKNM") 
private String jgBknm; 
@Column(name = "JG_BK_ADDR1") 
private String jgBkAddr1; 
@Column(name = "JG_BK_ADDR2") 
private String jgBkAddr2; 
@Column(name = "JG_BK_ADDR3") 
private String jgBkAddr3; 
@Column(name = "RCV_NM") 
private String rcvNm; 
@Column(name = "RCV_ADDR1") 
private String rcvAddr1; 
@Column(name = "RCV_ADDR2") 
private String rcvAddr2; 
@Column(name = "RCV_ADDR3") 
private String rcvAddr3; 
@Column(name = "RCV_ACCT_NO") 
private String rcvAcctNo; 
@Column(name = "DEPO_CODE") 
private String depoCode; 
@Column(name = "DEPO_NAME1") 
private String depoName1; 
@Column(name = "SBANK_BKCD") 
private String sbankBkcd; 
@Column(name = "SBANK_BKNM") 
private String sbankBknm; 
@Column(name = "SBANK_ADDR1") 
private String sbankAddr1; 
@Column(name = "SBANK_ADDR2") 
private String sbankAddr2; 
@Column(name = "SBANK_ADDR3") 
private String sbankAddr3; 
@Column(name = "CBANK_BKCD") 
private String cbankBkcd; 
@Column(name = "CBANK_BKNM") 
private String cbankBknm; 
@Column(name = "CBANK_ADDR1") 
private String cbankAddr1; 
@Column(name = "CBANK_ADDR2") 
private String cbankAddr2; 
@Column(name = "CBANK_ADDR3") 
private String cbankAddr3; 
@Column(name = "VALUE_DATE") 
private Date valueDate; 
@Column(name = "FEE_CUR") 
private String feeCur; 
@Column(name = "FEE_AMT") 
private BigDecimal feeAmt; 
@Column(name = "INFO70_NAME1") 
private String info70Name1; 
@Column(name = "INFO70_NAME2") 
private String info70Name2; 
@Column(name = "INFO70_NAME3") 
private String info70Name3; 
@Column(name = "INFO70_NAME4") 
private String info70Name4; 
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
@Column(name = "INT_BKCD") 
private String intBkcd; 
@Column(name = "INT_BKNM") 
private String intBknm; 
@Column(name = "INT_BK_ADDR1") 
private String intBkAddr1; 
@Column(name = "INT_BK_ADDR2") 
private String intBkAddr2; 
@Column(name = "INT_BK_ADDR3") 
private String intBkAddr3; 
@Column(name = "INT_BK_ACCT") 
private String intBkAcct; 
@Column(name = "JG_BK_ACCT") 
private String jgBkAcct; 
@Column(name = "PROC_TYPE") 
private String procType; 
@Column(name = "IMAD") 
private String imad; 
@Column(name = "OMAD") 
private String omad; 
@Column(name = "REQUEST_IL") 
private Date requestIl; 
@Column(name = "REQUEST_HIS") 
private BigDecimal requestHis; 
@Column(name = "AMEND_IL") 
private Date amendIl; 
@Column(name = "AMEND_HIS") 
private BigDecimal amendHis; 
@Column(name = "OUTMSG_GB") 
private String outmsgGb; 
@Column(name = "REFUND_RECV_MTTYPE") 
private String refundRecvMttype; 
@Column(name = "REFUND_RECV_MSG") 
private String refundRecvMsg; 
@Column(name = "REFUND_RECV_IL") 
private Date refundRecvIl; 
@Column(name = "QUES_SEND_MTTYPE") 
private String quesSendMttype; 
@Column(name = "QUES_SEND_MSG") 
private String quesSendMsg; 
@Column(name = "QUES_SEND_IL") 
private Date quesSendIl; 
@Column(name = "CNFM_RECV_MTTYPE") 
private String cnfmRecvMttype; 
@Column(name = "CNFM_RECV_MSG") 
private String cnfmRecvMsg; 
@Column(name = "CNFM_RECV_IL") 
private Date cnfmRecvIl; 
@Column(name = "RFND_SEND_MTTYPE") 
private String rfndSendMttype; 
@Column(name = "RFND_SEND_MSG") 
private String rfndSendMsg; 
@Column(name = "RFND_SEND_IL") 
private Date rfndSendIl; 
@Column(name = "REFUND_AMT") 
private BigDecimal refundAmt; 
@Column(name = "AMD_AMT") 
private BigDecimal amdAmt; 
@Column(name = "AMD_COMM") 
private BigDecimal amdComm; 
@Column(name = "AMD_FEE") 
private BigDecimal amdFee; 
@Column(name = "REFUND_THEIR_REF") 
private String refundTheirRef; 
@Column(name = "REFUND_REMARK1") 
private String refundRemark1; 
@Column(name = "REFUND_REMARK2") 
private String refundRemark2; 
@Column(name = "REFUND_REMARK3") 
private String refundRemark3; 
@Column(name = "REFUND_REMARK4") 
private String refundRemark4; 
@Column(name = "REFUND_REMARK5") 
private String refundRemark5; 
@Column(name = "REFUND_REMARK6") 
private String refundRemark6; 
@Column(name = "REFUND_REMARK7") 
private String refundRemark7; 
@Column(name = "REFUND_REMARK8") 
private String refundRemark8; 
@Column(name = "MNG_BR") 
private String mngBr; 
@Column(name = "OPER_ID") 
private String operId; 
@Column(name = "MNGR_ID") 
private String mngrId; 
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
